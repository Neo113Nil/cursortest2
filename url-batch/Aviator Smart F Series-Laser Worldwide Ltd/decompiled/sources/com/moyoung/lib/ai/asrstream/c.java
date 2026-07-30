package com.moyoung.lib.ai.asrstream;

import android.util.Log;
import com.baidu.ar.statistic.StatisticConstants;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.moyoung.lib.ai.asrstream.b;
import com.moyoung.lib.ai.asrstream.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.java_websocket.enums.ReadyState;

/* loaded from: classes4.dex */
public class c {
    private static final String ASR_SERVER_URL = "wss://altair.moyoung.com:443/api/v1/asr";
    private static final String TAG = "ASRDelegate";
    private com.moyoung.lib.ai.asrstream.a callback;
    private Thread sendingThread;
    private String sessionId;
    private f webSocketClient;
    private boolean isConnected = false;
    private boolean isSending = false;
    private boolean isAudioSent = false;
    private boolean isTaskCompleted = false;
    private final Gson gson = new Gson();
    private final ConcurrentLinkedQueue<C0305c> taskQueue = new ConcurrentLinkedQueue<>();

    class a implements f.a {
        a() {
        }

        @Override // com.moyoung.lib.ai.asrstream.f.a
        public void onClosed(String str) {
            c.this.isConnected = false;
            c.this.isSending = false;
            c.this.isAudioSent = true;
            c.this.isTaskCompleted = true;
            Log.d(c.TAG, "WebSocket连接关闭: " + str);
            c.access$400(c.this);
            c.this.webSocketClient = null;
            if (c.this.taskQueue.isEmpty()) {
                return;
            }
            c.this.connectWebSocket();
        }

        @Override // com.moyoung.lib.ai.asrstream.f.a
        public void onConnected() {
            c.this.isConnected = true;
            c.this.processNextTask();
        }

        @Override // com.moyoung.lib.ai.asrstream.f.a
        public void onError(Exception exc) {
            c.this.isConnected = false;
            c.this.isSending = false;
            c.this.isAudioSent = true;
            c.this.isTaskCompleted = true;
            Log.e(c.TAG, "WebSocket错误", exc);
            c.this.closeConnection();
            if (c.this.taskQueue.isEmpty()) {
                return;
            }
            c.this.connectWebSocket();
        }

        @Override // com.moyoung.lib.ai.asrstream.f.a
        public void onMessage(String str) {
            try {
                Log.d(c.TAG, "收到ASR消息: " + str);
                d dVar = (d) c.this.gson.fromJson(str, d.class);
                if (dVar.getSessionId() != null) {
                    c.this.sessionId = dVar.getSessionId();
                }
                c.access$400(c.this);
            } catch (Exception e8) {
                Log.e(c.TAG, "解析ASR响应失败: " + str, e8);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ String val$filePath;

        b(String str) {
            this.val$filePath = str;
        }

        /* JADX WARN: Not initialized variable reg: 6, insn: 0x005e: MOVE (r4 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:95), block:B:64:0x005e */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            FileInputStream fileInputStream;
            Exception e8;
            IOException e9;
            FileInputStream fileInputStream2;
            File file;
            int read;
            FileInputStream fileInputStream3 = null;
            try {
                try {
                    file = new File(this.val$filePath);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream3 = fileInputStream2;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (IOException e10) {
                            Log.e(c.TAG, "关闭文件流失败", e10);
                        }
                    }
                    c.this.isSending = false;
                    throw th;
                }
            } catch (IOException e11) {
                fileInputStream = null;
                e9 = e11;
            } catch (Exception e12) {
                fileInputStream = null;
                e8 = e12;
            } catch (Throwable th2) {
                th = th2;
                if (fileInputStream3 != null) {
                }
                c.this.isSending = false;
                throw th;
            }
            if (!file.exists()) {
                throw new IOException("音频文件不存在: " + this.val$filePath);
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (c.this.isSending && c.this.isConnected && c.this.webSocketClient != null && c.this.webSocketClient.getReadyState() == ReadyState.OPEN && (read = fileInputStream.read(bArr)) != -1) {
                    c.this.webSocketClient.send(ByteBuffer.wrap(bArr, 0, read));
                    try {
                        Thread.sleep(20L);
                    } catch (InterruptedException unused) {
                    }
                }
                c.this.sendEndSignal();
                c.this.isAudioSent = true;
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused2) {
                }
                c.this.isTaskCompleted = true;
                c.this.closeConnection();
                try {
                    fileInputStream.close();
                } catch (IOException e13) {
                    e = e13;
                    Log.e(c.TAG, "关闭文件流失败", e);
                    c.this.isSending = false;
                }
            } catch (IOException e14) {
                e9 = e14;
                Log.e(c.TAG, "读取音频文件失败: " + this.val$filePath, e9);
                c.access$400(c.this);
                c.this.isAudioSent = true;
                c.this.isTaskCompleted = true;
                c.this.closeConnection();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e15) {
                        e = e15;
                        Log.e(c.TAG, "关闭文件流失败", e);
                        c.this.isSending = false;
                    }
                }
                c.this.isSending = false;
            } catch (Exception e16) {
                e8 = e16;
                Log.e(c.TAG, "发送音频数据时发生错误", e8);
                c.access$400(c.this);
                c.this.isAudioSent = true;
                c.this.isTaskCompleted = true;
                c.this.closeConnection();
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e17) {
                        e = e17;
                        Log.e(c.TAG, "关闭文件流失败", e);
                        c.this.isSending = false;
                    }
                }
                c.this.isSending = false;
            }
            c.this.isSending = false;
        }
    }

    /* renamed from: com.moyoung.lib.ai.asrstream.c$c, reason: collision with other inner class name */
    private static class C0305c {
        com.moyoung.lib.ai.asrstream.a callback;
        String filePath;

        C0305c(String str, com.moyoung.lib.ai.asrstream.a aVar) {
            this.filePath = str;
        }
    }

    static /* synthetic */ com.moyoung.lib.ai.asrstream.a access$400(c cVar) {
        cVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeConnection() {
        if (this.webSocketClient != null) {
            try {
                sendEndSignal();
                this.webSocketClient.closeConnection();
            } catch (Exception e8) {
                Log.e(TAG, "关闭WebSocket时出错", e8);
            }
            this.webSocketClient = null;
        }
        this.isConnected = false;
        this.isAudioSent = false;
        this.isTaskCompleted = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectWebSocket() {
        try {
            f fVar = new f(new URI(ASR_SERVER_URL), new a());
            this.webSocketClient = fVar;
            fVar.connect();
        } catch (URISyntaxException e8) {
            Log.e(TAG, "URI格式错误", e8);
            this.taskQueue.poll();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNextTask() {
        C0305c peek;
        f fVar;
        if (this.isSending || this.taskQueue.isEmpty() || (peek = this.taskQueue.peek()) == null) {
            return;
        }
        if (this.isConnected && (fVar = this.webSocketClient) != null && fVar.getReadyState() == ReadyState.OPEN) {
            this.taskQueue.poll();
            sendInitializationMessage();
            sendAudioFileInternal(peek.filePath);
        } else {
            f fVar2 = this.webSocketClient;
            if (fVar2 == null || fVar2.getReadyState() == ReadyState.NOT_YET_CONNECTED) {
                connectWebSocket();
            }
        }
    }

    private void sendAudioFileInternal(String str) {
        f fVar;
        if (this.isSending) {
            Log.w(TAG, "已经在发送音频数据");
            return;
        }
        if (!this.isConnected || (fVar = this.webSocketClient) == null || fVar.getReadyState() != ReadyState.OPEN) {
            Log.e(TAG, "WebSocket未连接，无法发送音频数据");
            return;
        }
        this.isSending = true;
        this.isAudioSent = false;
        this.isTaskCompleted = false;
        Thread thread = new Thread(new b(str));
        this.sendingThread = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEndSignal() {
        f fVar = this.webSocketClient;
        if (fVar != null && this.isConnected && fVar.getReadyState() == ReadyState.OPEN) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("is_speaking", Boolean.FALSE);
            String str = this.sessionId;
            if (str != null) {
                jsonObject.addProperty(StatisticConstants.VPS_SESSION_ID, str);
            }
            Log.d(TAG, "发送结束信号");
            this.webSocketClient.send(jsonObject.toString());
        }
    }

    private void sendInitializationMessage() {
        com.moyoung.lib.ai.asrstream.b build = new b.a().setMode("2pass").setChunkSize(new int[]{5, 10, 5}).setChunkInterval(10).setWavName("test.pcm").setSpeaking(true).setHotwords("").setItn(true).setAudioFs(16000).setClientInfo("MO YOUNG Android Client v1.0.0").setLanguage("zh-CN").build();
        f fVar = this.webSocketClient;
        if (fVar != null && this.isConnected && fVar.getReadyState() == ReadyState.OPEN) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("mode", build.getMode());
            JsonArray jsonArray = new JsonArray();
            for (int i8 : build.getChunkSize()) {
                jsonArray.add(Integer.valueOf(i8));
            }
            jsonObject.add("chunk_size", jsonArray);
            jsonObject.addProperty("chunk_interval", Integer.valueOf(build.getChunkInterval()));
            jsonObject.addProperty("wav_name", build.getWavName());
            jsonObject.addProperty("is_speaking", Boolean.valueOf(build.isSpeaking()));
            jsonObject.addProperty("hotwords", build.getHotwords());
            jsonObject.addProperty("itn", Boolean.valueOf(build.isItn()));
            jsonObject.addProperty("audio_fs", Integer.valueOf(build.getAudioFs()));
            jsonObject.addProperty("client_info", build.getClientInfo());
            jsonObject.addProperty("language", build.getLanguage());
            Log.d(TAG, "发送初始化消息: " + jsonObject.toString());
            this.webSocketClient.send(jsonObject.toString());
        }
    }

    public boolean isConnected() {
        f fVar;
        return this.isConnected && (fVar = this.webSocketClient) != null && fVar.getReadyState() == ReadyState.OPEN;
    }

    public boolean isSending() {
        return this.isSending;
    }

    public void speechToText(String str, com.moyoung.lib.ai.asrstream.a aVar) {
        this.taskQueue.offer(new C0305c(str, aVar));
        f fVar = this.webSocketClient;
        if (fVar == null || fVar.getReadyState() == ReadyState.NOT_YET_CONNECTED) {
            connectWebSocket();
        } else {
            if (this.webSocketClient.getReadyState() != ReadyState.OPEN || this.isSending) {
                return;
            }
            processNextTask();
        }
    }

    public void stopASR() {
        this.isSending = false;
        this.isAudioSent = true;
        this.isTaskCompleted = true;
        Thread thread = this.sendingThread;
        if (thread != null) {
            thread.interrupt();
            try {
                this.sendingThread.join(1000L);
            } catch (InterruptedException e8) {
                Log.e(TAG, "等待发送线程结束时被中断", e8);
            }
            this.sendingThread = null;
        }
        this.taskQueue.clear();
        closeConnection();
    }
}
