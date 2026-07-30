package com.baidu.ar.digital;

import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.a1;
import com.baidu.ar.audio.AudioParams;
import com.baidu.ar.audio.EasyAudio;
import com.baidu.ar.audio.EasyAudioCallback;
import com.baidu.ar.c0;
import com.baidu.ar.cb;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.dumixhuman.dumix.DumixConstance;
import com.baidu.ar.gd;
import com.baidu.ar.h;
import com.baidu.ar.i7;
import com.baidu.ar.n4;
import com.baidu.ar.p5;
import com.baidu.ar.qc;
import com.baidu.ar.re;
import com.baidu.ar.wb;
import com.baidu.ar.xb;
import com.baidu.ar.yb;
import com.baidu.ar.ye;
import com.baidu.ar.z0;
import java.nio.ByteBuffer;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class DigitalAR extends c0 implements IDigital, cb.b {
    public static final String K = "DigitalAR";
    public boolean B;
    public cb C;
    public String E;
    public String F;
    public String G;

    /* renamed from: v, reason: collision with root package name */
    public IDigitalListener f2068v;

    /* renamed from: w, reason: collision with root package name */
    public EasyAudio f2069w;

    /* renamed from: x, reason: collision with root package name */
    public p5 f2070x;

    /* renamed from: y, reason: collision with root package name */
    public ye f2071y;

    /* renamed from: z, reason: collision with root package name */
    public ScheduledExecutorService f2072z;
    public Deque<n4> A = new LinkedList();
    public boolean D = true;
    public i7 H = new a();
    public EasyAudioCallback I = new b();
    public Runnable J = new c();

    public class a implements i7 {

        /* renamed from: com.baidu.ar.digital.DigitalAR$a$a, reason: collision with other inner class name */
        public class RunnableC0035a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ xb f2074a;

            public RunnableC0035a(xb xbVar) {
                this.f2074a = xbVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                DigitalAR.this.sendChatMessage(this.f2074a.a());
            }
        }

        public a() {
        }

        @Override // com.baidu.ar.i7
        public void a(int i8, String str) {
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SOCKET_ERROR, str);
            }
        }

        @Override // com.baidu.ar.i7
        public void a(wb wbVar) {
            if (wbVar == null) {
                if (DigitalAR.this.f2068v != null) {
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SOCKET_RESPONSE_FAIL, null);
                    return;
                }
                return;
            }
            n4 n4Var = (n4) DigitalAR.this.A.peekLast();
            if (n4Var == null) {
                n4Var = new n4();
                n4Var.a(wbVar.b());
                DigitalAR.this.A.add(n4Var);
            } else {
                n4Var.a(wbVar.b());
            }
            DigitalAR.this.f2070x.a(n4Var.a());
            DigitalAR.this.f2070x.a();
        }

        @Override // com.baidu.ar.i7
        public void a(xb xbVar) {
            if (xbVar == null) {
                if (DigitalAR.this.f2068v != null) {
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SOCKET_RESPONSE_FAIL, null);
                    return;
                }
                return;
            }
            String b8 = xbVar.b();
            b8.hashCode();
            if (!b8.equals(DumixConstance.SUBTITLE_TYPE_QUERY)) {
                if (b8.equals(DumixConstance.SUBTITLE_TYPE_REPLY) && DigitalAR.this.f2068v != null) {
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SUBTITLE_TYPE_REPLY, xbVar.a());
                    return;
                }
                return;
            }
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SUBTITLE_TYPE_QUERY, xbVar.a());
                if (xbVar.c()) {
                    DigitalAR.this.stopRecord();
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.RECORD_STOP, xbVar.a());
                    gd.a(new RunnableC0035a(xbVar), 50L);
                }
            }
        }

        @Override // com.baidu.ar.i7
        public void a(yb ybVar) {
            if (ybVar == null) {
                if (DigitalAR.this.f2068v != null) {
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SOCKET_RESPONSE_FAIL, null);
                }
            } else {
                if (ybVar.a() == null || ybVar.a().a() == null || ybVar.a().a().a() == null) {
                    return;
                }
                yb.a a8 = ybVar.a().a().a();
                if (a8.a() != null) {
                    byte[] a9 = qc.a(a8.a());
                    byte[] d8 = a1.d(a9);
                    DigitalAR.this.a(ybVar, a9, d8);
                    DigitalAR.this.A.add(new n4(d8, a8.b(), ybVar.d()));
                }
            }
        }

        @Override // com.baidu.ar.i7
        public void a(String str) {
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(DigitalState.SOCKET_SEND_MESSAGE, str);
            }
        }

        @Override // com.baidu.ar.i7
        public void a(boolean z7) {
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(z7 ? DigitalState.SOCKET_OPEN : DigitalState.SOCKET_CLOSE, null);
            }
        }
    }

    public class b implements EasyAudioCallback {
        public b() {
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8) {
            if (DigitalAR.this.f2071y == null || byteBuffer == null) {
                return;
            }
            DigitalAR.this.f2071y.a(byteBuffer.array());
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioStart(boolean z7, AudioParams audioParams) {
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(z7 ? DigitalState.RECORD_START : DigitalState.RECORD_ERROR, null);
            }
        }

        @Override // com.baidu.ar.audio.EasyAudioCallback
        public void onAudioStop(boolean z7) {
            if (DigitalAR.this.f2068v != null) {
                DigitalAR.this.f2068v.onDigitalCallback(DigitalState.RECORD_STOP, null);
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n4 n4Var;
            if (DigitalAR.this.B || DigitalAR.this.f2070x == null || (n4Var = (n4) DigitalAR.this.A.poll()) == null) {
                return;
            }
            if (n4Var.a() != null) {
                DigitalAR.this.playAudio(n4Var.a());
            }
            if (n4Var.b() != null) {
                DigitalAR.this.setBlendShape(n4Var.b());
            }
            if (!TextUtils.isEmpty(n4Var.c())) {
                DigitalAR.this.f2068v.onDigitalCallback(DigitalState.WIDGET_DATA, n4Var.c());
            }
            if (n4Var.d()) {
                DigitalAR.this.A.clear();
                if (DigitalAR.this.f2072z != null) {
                    DigitalAR.this.f2072z.shutdown();
                }
                if (DigitalAR.this.f2068v != null) {
                    DigitalAR.this.f2068v.onDigitalCallback(DigitalState.AUDIO_PLAYER_FINISH, null);
                }
                DigitalAR.this.f();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    @Override // com.baidu.ar.digital.IDigital
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initDigital(HashMap<String, Object> hashMap) {
        boolean z7;
        if (hashMap != null) {
            try {
            } catch (Exception e8) {
                Log.e(K, "setup params mSocketEnable :  " + e8.toString());
            }
            if (hashMap.get("socket_enable") != null && Float.parseFloat(hashMap.get("socket_enable").toString()) <= 0.0f) {
                z7 = false;
                this.D = z7;
                this.E = hashMap.get("socket_url") != null ? "wss://dusee.baidu.com/digitalhuman-ws" : (String) hashMap.get("socket_url");
                this.F = hashMap.get(HttpConstants.HTTP_APP_ID) != null ? "i-kgqiz7g0gv22a" : (String) hashMap.get(HttpConstants.HTTP_APP_ID);
                this.G = hashMap.get("app_key") != null ? "2p78v82ihj8cg04edt17" : (String) hashMap.get("app_key");
            }
            z7 = true;
            this.D = z7;
            this.E = hashMap.get("socket_url") != null ? "wss://dusee.baidu.com/digitalhuman-ws" : (String) hashMap.get("socket_url");
            this.F = hashMap.get(HttpConstants.HTTP_APP_ID) != null ? "i-kgqiz7g0gv22a" : (String) hashMap.get(HttpConstants.HTTP_APP_ID);
            this.G = hashMap.get("app_key") != null ? "2p78v82ihj8cg04edt17" : (String) hashMap.get("app_key");
        }
        if (d() != null) {
            d().setRenderBlendInput(false);
        }
        if (this.f2070x == null) {
            this.f2070x = new z0();
        }
        if (this.f2071y == null && this.D) {
            ye yeVar = new ye(this.H);
            this.f2071y = yeVar;
            yeVar.a(this.E, this.F, this.G);
        }
        if (this.f2069w == null) {
            this.f2069w = EasyAudio.getInstance();
        }
        if (this.C == null) {
            cb b8 = cb.b();
            this.C = b8;
            b8.a(this);
        }
        this.C.e();
    }

    @Override // com.baidu.ar.c0
    public void onCaseCreate(String str) {
        super.onCaseCreate(str);
        h.d(K + " onCaseCreate casePath: " + str);
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void pause() {
        super.pause();
        h.d(K + "pause ");
        this.B = true;
        p5 p5Var = this.f2070x;
        if (p5Var != null) {
            p5Var.pause();
        }
        ye yeVar = this.f2071y;
        if (yeVar != null) {
            yeVar.a();
        }
        EasyAudio easyAudio = this.f2069w;
        if (easyAudio != null) {
            easyAudio.stopAudio(this.I);
        }
        cb cbVar = this.C;
        if (cbVar != null) {
            cbVar.c();
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void playAudio(byte[] bArr) {
        p5 p5Var = this.f2070x;
        if (p5Var != null) {
            if (!p5Var.b()) {
                this.f2070x.a();
            }
            this.f2070x.a(bArr);
        }
    }

    @Override // com.baidu.ar.c0
    public void release() {
        super.release();
        h.d(K + "release ");
        p5 p5Var = this.f2070x;
        if (p5Var != null) {
            p5Var.release();
            this.f2070x = null;
        }
        ye yeVar = this.f2071y;
        if (yeVar != null) {
            yeVar.b();
            this.f2071y = null;
        }
        EasyAudio easyAudio = this.f2069w;
        if (easyAudio != null) {
            easyAudio.release();
            this.f2069w = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f2072z;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
            this.f2072z = null;
        }
        cb cbVar = this.C;
        if (cbVar != null) {
            cbVar.d();
            this.C = null;
        }
    }

    @Override // com.baidu.ar.c0, com.baidu.ar.cloud.ICloudIR
    public void resume() {
        super.resume();
        h.d(K + "resume ");
        this.B = false;
        p5 p5Var = this.f2070x;
        if (p5Var != null) {
            p5Var.resume();
        }
        ye yeVar = this.f2071y;
        if (yeVar != null) {
            yeVar.c();
        }
        cb cbVar = this.C;
        if (cbVar != null) {
            cbVar.e();
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void sendChatMessage(String str) {
        ye yeVar = this.f2071y;
        if (yeVar != null) {
            yeVar.b(str, "TEXT_QUERY");
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void sendReadingMessage(String str) {
        ye yeVar = this.f2071y;
        if (yeVar != null) {
            yeVar.b(str, "TEXT_RENDER");
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setBlendShape(HashMap<String, Double> hashMap) {
        if (d() != null) {
            d().setBlendShape(hashMap);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setDigitalListener(IDigitalListener iDigitalListener) {
        this.f2068v = iDigitalListener;
    }

    @Override // com.baidu.ar.digital.IDigital
    public void setSkeletonData(HashMap<String, List<Double>> hashMap) {
        if (d() != null) {
            d().setSkeletonData(hashMap);
        }
    }

    @Override // com.baidu.ar.c0
    public void setup(HashMap<String, Object> hashMap) {
        h.d(K + "setup params:  " + hashMap);
        super.setup(hashMap);
        initDigital(hashMap);
    }

    @Override // com.baidu.ar.digital.IDigital
    public void startRecord() {
        EasyAudio easyAudio = this.f2069w;
        if (easyAudio != null) {
            easyAudio.startAudio(new AudioParams(), this.I);
        }
    }

    @Override // com.baidu.ar.digital.IDigital
    public void stop() {
        f();
    }

    @Override // com.baidu.ar.digital.IDigital
    public void stopRecord() {
        EasyAudio easyAudio = this.f2069w;
        if (easyAudio != null) {
            easyAudio.stopAudio(this.I);
        }
    }

    @Override // com.baidu.ar.cb.b
    public void updateRender() {
        if (d() != null) {
            d().render(-1L);
        }
    }

    public final void a(int i8) {
        ScheduledExecutorService scheduledExecutorService = this.f2072z;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f2072z = newSingleThreadScheduledExecutor;
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(this.J, 0L, i8, TimeUnit.MILLISECONDS);
    }

    public final void f() {
        p5 p5Var = this.f2070x;
        if (p5Var != null) {
            p5Var.stop();
            this.A.clear();
        }
    }

    public final void a(yb ybVar, byte[] bArr, byte[] bArr2) {
        if (ybVar.c()) {
            re c8 = a1.c(bArr);
            IDigitalListener iDigitalListener = this.f2068v;
            if (iDigitalListener != null) {
                iDigitalListener.onDigitalCallback(DigitalState.SOCKET_FIRST_AUDIO_FRAME, null);
            }
            if (c8 != null) {
                int a8 = c8.a(bArr2.length);
                this.f2070x.a();
                a(a8);
                if (this.f2068v != null) {
                    this.f2068v.onDigitalCallback(DigitalState.AUDIO_PLAYER_START, Integer.valueOf(ybVar.b() * a8));
                }
            }
        }
    }
}
