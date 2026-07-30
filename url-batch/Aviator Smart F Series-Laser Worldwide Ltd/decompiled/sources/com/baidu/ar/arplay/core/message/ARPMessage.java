package com.baidu.ar.arplay.core.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public class ARPMessage {
    private static final int INVALID_MESSAGE_ID = -1;
    private static final int MSG_MESSAGE_FROM_ENGINE = 1;
    private static ARPMessage mARPMessage;
    private Handler mHandler;
    private boolean mIsInitNative = false;
    private List<ArCallback> mMsgHandlers;
    private HandlerThread mThread;

    public static class ArCallback {
        public MessageHandler mHandler;
        public int mMessageId;
        public int mMessageType;

        public ArCallback(int i8, int i9, MessageHandler messageHandler) {
            this.mMessageType = i8;
            this.mMessageId = i9;
            this.mHandler = messageHandler;
        }
    }

    public static class ArMessage {
        public HashMap<String, Object> mData;
        public int mMessageID;
        public int mMessageType;
        public int mResMessageID;

        public ArMessage(int i8, int i9, HashMap<String, Object> hashMap, int i10) {
            this.mMessageType = i8;
            this.mMessageID = i9;
            this.mData = hashMap;
            this.mResMessageID = i10;
        }
    }

    public interface MessageHandler {
        void handleMessage(int i8, int i9, HashMap<String, Object> hashMap);
    }

    public ARPMessage() {
        HandlerThread handlerThread = new HandlerThread("msg_callback_thread");
        this.mThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mThread.getLooper(), new Handler.Callback() { // from class: com.baidu.ar.arplay.core.message.ARPMessage.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                ARPMessage.this.processIncomingMessage((ArMessage) message.obj);
                return false;
            }
        });
        this.mMsgHandlers = new LinkedList();
    }

    public static ARPMessage getInstance() {
        ARPMessage aRPMessage;
        ARPMessage aRPMessage2 = mARPMessage;
        if (aRPMessage2 != null) {
            return aRPMessage2;
        }
        synchronized (ARPMessage.class) {
            try {
                if (mARPMessage == null) {
                    mARPMessage = new ARPMessage();
                }
                aRPMessage = mARPMessage;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aRPMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processIncomingMessage(ArMessage arMessage) {
        for (ArCallback arCallback : this.mMsgHandlers) {
            int i8 = arCallback.mMessageType;
            if (i8 == 0 || arMessage.mMessageType == i8) {
                int i9 = arCallback.mMessageId;
                if (-1 == i9 || arMessage.mResMessageID == i9) {
                    arCallback.mHandler.handleMessage(arMessage.mMessageType, arMessage.mMessageID, arMessage.mData);
                }
            }
        }
    }

    private void sendMessageImpl(int i8, boolean z7, HashMap<String, Object> hashMap, int i9) {
        if (ARPEngine.getInstance().isEngineCanAccess()) {
            sendMessageToEngine(i8, getMessageID(), z7, hashMap, i9);
        }
    }

    public native int getMessageID();

    public native void nativeFinalize();

    public native void nativeSetup(Object obj);

    public void receiveMsgFromEngine(int i8, int i9, HashMap<String, Object> hashMap, int i10) {
        Log.d("ARPMessage", "receiveMsgFromEngine :" + i8);
        this.mHandler.obtainMessage(1, new ArMessage(i8, i9, hashMap, i10)).sendToTarget();
    }

    public synchronized void registerMessageHandler(final int i8, final MessageHandler messageHandler) {
        this.mHandler.post(new Runnable() { // from class: com.baidu.ar.arplay.core.message.ARPMessage.2
            @Override // java.lang.Runnable
            public void run() {
                ARPMessage.this.mMsgHandlers.add(new ArCallback(i8, -1, messageHandler));
            }
        });
    }

    public void release() {
        this.mHandler.removeCallbacks(null);
        this.mHandler.post(new Runnable() { // from class: com.baidu.ar.arplay.core.message.ARPMessage.4
            @Override // java.lang.Runnable
            public void run() {
                if (ARPMessage.this.mMsgHandlers != null) {
                    ARPMessage.this.mMsgHandlers.clear();
                }
            }
        });
        nativeFinalize();
        this.mIsInitNative = false;
    }

    public synchronized void removeMessageHandeler(final MessageHandler messageHandler) {
        this.mHandler.post(new Runnable() { // from class: com.baidu.ar.arplay.core.message.ARPMessage.3
            @Override // java.lang.Runnable
            public void run() {
                if (ARPMessage.this.mMsgHandlers == null) {
                    return;
                }
                Iterator it = ARPMessage.this.mMsgHandlers.iterator();
                while (it.hasNext()) {
                    if (((ArCallback) it.next()).mHandler == messageHandler) {
                        it.remove();
                    }
                }
            }
        });
    }

    public void sendLuaScriptToEngine(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("script", str);
        sendMessage(2001, hashMap);
    }

    public void sendMessage(int i8, HashMap<String, Object> hashMap) {
        sendMessageImpl(i8, true, hashMap, -1);
    }

    public native void sendMessageToEngine(int i8, int i9, boolean z7, HashMap<String, Object> hashMap, int i10);

    public void sendResponseMessage(int i8, HashMap<String, Object> hashMap, int i9) {
        sendMessageImpl(i8, true, hashMap, i9);
    }

    public void setModelVirtualColor(int i8, boolean z7) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("model_color", Integer.valueOf(i8));
        if (!z7) {
            hashMap.put("model_type", 1);
        }
        sendMessage(2002, hashMap);
    }

    public void setUp() {
        if (this.mIsInitNative) {
            return;
        }
        nativeSetup(new WeakReference(this));
        this.mIsInitNative = true;
    }

    private static void receiveMsgFromEngine(Object obj, int i8, int i9, HashMap<String, Object> hashMap, int i10) {
        ARPMessage aRPMessage;
        if (obj == null || (aRPMessage = (ARPMessage) ((WeakReference) obj).get()) == null) {
            return;
        }
        aRPMessage.receiveMsgFromEngine(i8, i9, hashMap, i10);
    }

    public void sendMessage(int i8, boolean z7, HashMap<String, Object> hashMap) {
        sendMessageImpl(i8, z7, hashMap, -1);
    }
}
