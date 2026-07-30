package com.baidu.ar.recorder;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.baidu.ar.ae;
import com.baidu.ar.d9;
import com.baidu.ar.h;
import com.baidu.ar.l6;
import com.baidu.ar.ma;
import com.baidu.ar.p3;
import com.baidu.ar.record.EncoderParams;
import com.baidu.ar.y0;
import com.baidu.ar.z8;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class MovieRecorder implements l6 {
    public static final int ERROR_CODE_ON_START = 4001;
    public static final int ERROR_CODE_ON_STOP = 4002;

    /* renamed from: s, reason: collision with root package name */
    public static final String f3093s = "MovieRecorder";

    /* renamed from: t, reason: collision with root package name */
    public static volatile int f3094t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static volatile boolean f3095u = false;

    /* renamed from: v, reason: collision with root package name */
    public static volatile MovieRecorder f3096v;

    /* renamed from: b, reason: collision with root package name */
    public Context f3098b;

    /* renamed from: d, reason: collision with root package name */
    public HandlerThread f3100d;

    /* renamed from: g, reason: collision with root package name */
    public EncoderParams f3103g;

    /* renamed from: h, reason: collision with root package name */
    public com.baidu.ar.record.MovieRecorderCallback f3104h;

    /* renamed from: i, reason: collision with root package name */
    public d f3105i;

    /* renamed from: j, reason: collision with root package name */
    public ma f3106j;

    /* renamed from: k, reason: collision with root package name */
    public z8 f3107k;

    /* renamed from: l, reason: collision with root package name */
    public d9 f3108l;

    /* renamed from: m, reason: collision with root package name */
    public y0 f3109m;

    /* renamed from: n, reason: collision with root package name */
    public p3 f3110n;

    /* renamed from: p, reason: collision with root package name */
    public ae f3112p;

    /* renamed from: q, reason: collision with root package name */
    public p3 f3113q;

    /* renamed from: a, reason: collision with root package name */
    public int f3097a = 0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3099c = false;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f3101e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3102f = false;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f3111o = false;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f3114r = false;

    public class a implements p3 {
        public a() {
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z7) {
            if (MovieRecorder.this.f3112p != null) {
                MovieRecorder.this.f3112p.f();
                MovieRecorder.this.f3112p = null;
            }
            MovieRecorder.this.f3113q = null;
            MovieRecorder.this.b(2, z7);
        }

        @Override // com.baidu.ar.p3
        public void b(boolean z7) {
        }

        @Override // com.baidu.ar.p3
        public void c(boolean z7) {
            MovieRecorder.this.f3114r = z7;
            MovieRecorder.this.a(2, z7);
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z7, Object obj) {
            if (z7) {
                if (MovieRecorder.this.f3105i != null) {
                    MovieRecorder.this.f3105i.sendMessage(MovieRecorder.this.f3105i.obtainMessage(7000, obj));
                }
                if (MovieRecorder.this.f3112p != null) {
                    MovieRecorder.this.f3112p.g();
                }
            }
        }
    }

    public class b implements p3 {
        public b() {
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z7) {
            MovieRecorder.this.f3109m.f();
            MovieRecorder.this.f3109m = null;
            MovieRecorder.this.f3110n = null;
            MovieRecorder.this.b(4, z7);
        }

        @Override // com.baidu.ar.p3
        public void b(boolean z7) {
            boolean unused = MovieRecorder.f3095u = z7;
        }

        @Override // com.baidu.ar.p3
        public void c(boolean z7) {
            MovieRecorder.this.f3111o = z7;
            MovieRecorder.this.a(4, z7);
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z7, Object obj) {
            if (z7) {
                MovieRecorder.this.f3109m.g();
            }
        }
    }

    public class c implements d9 {
        public c() {
        }

        @Override // com.baidu.ar.d9
        public void a(boolean z7) {
            MovieRecorder.this.a(1, z7);
        }

        @Override // com.baidu.ar.d9
        public void b(boolean z7) {
            MovieRecorder.this.f3107k.b();
            MovieRecorder.this.f3107k = null;
            MovieRecorder.this.f3108l = null;
            MovieRecorder.this.b(1, z7);
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 7000:
                    if (MovieRecorder.this.f3104h != null) {
                        MovieRecorder.this.f3104h.onRecorderInit((Surface) message.obj);
                        break;
                    }
                    break;
                case 7001:
                    if (MovieRecorder.this.f3104h != null) {
                        MovieRecorder.this.f3104h.onRecorderStart(((Boolean) message.obj).booleanValue());
                    }
                    MovieRecorder.this.f3101e = false;
                    break;
                case 7002:
                    if (MovieRecorder.this.f3104h != null) {
                        MovieRecorder.this.f3104h.onRecorderProcess(((Integer) message.obj).intValue());
                        break;
                    }
                    break;
                case 7003:
                    if (MovieRecorder.this.f3104h != null) {
                        MovieRecorder.this.f3104h.onRecorderComplete(((Boolean) message.obj).booleanValue(), MovieRecorder.this.f3103g != null ? MovieRecorder.this.f3103g.getOutputFile() : null);
                        break;
                    }
                    break;
                case 7004:
                    if (MovieRecorder.this.f3104h != null) {
                        MovieRecorder.this.f3104h.onRecorderError(((Integer) message.obj).intValue());
                        break;
                    }
                    break;
                case 7005:
                    MovieRecorder.this.l();
                    break;
                case 7006:
                    MovieRecorder.this.f3101e = false;
                    MovieRecorder.this.stopRecorder();
                    break;
            }
            super.handleMessage(message);
        }
    }

    public static MovieRecorder getInstance() {
        if (f3096v == null) {
            synchronized (MovieRecorder.class) {
                try {
                    if (f3096v == null) {
                        f3096v = new MovieRecorder();
                    }
                } finally {
                }
            }
        }
        return f3096v;
    }

    public static void h() {
        f3096v = null;
    }

    public final void i() {
        h.c(f3093s, "restartRecorder mRestartTried = " + this.f3102f);
        d dVar = this.f3105i;
        if (dVar != null) {
            this.f3102f = true;
            dVar.sendMessageDelayed(dVar.obtainMessage(7005), 500L);
        }
    }

    public final void j() {
        y0 y0Var = this.f3109m;
        if (y0Var != null) {
            y0Var.a(this.f3103g, this.f3107k, this.f3110n);
        }
    }

    public final void k() {
        d dVar = this.f3105i;
        if (dVar != null) {
            dVar.sendMessageDelayed(dVar.obtainMessage(7001, Boolean.FALSE), 500L);
        }
    }

    public final void l() {
        b();
        a();
        if (g()) {
            j();
            m();
        } else if (this.f3102f) {
            k();
        } else {
            i();
        }
    }

    public final void m() {
        this.f3112p.a(this.f3103g, this.f3107k, this.f3113q);
    }

    @Override // com.baidu.ar.l6
    public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i8, long j8) {
        y0 y0Var;
        if (this.f3111o && (y0Var = this.f3109m) != null && y0Var.e()) {
            this.f3109m.a(byteBuffer, i8, j8);
        }
    }

    public void onDestroy() {
        this.f3106j = null;
        this.f3098b = null;
        this.f3103g = null;
        this.f3104h = null;
        a(0);
        h();
        d dVar = this.f3105i;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
            this.f3105i = null;
        }
        HandlerThread handlerThread = this.f3100d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f3100d = null;
        }
    }

    @Override // com.baidu.ar.l6
    public void onVideoFrameAvailable(long j8) {
        ae aeVar = this.f3112p;
        if (aeVar != null && aeVar.e() && this.f3114r && f3095u) {
            this.f3112p.a(j8);
            a(j8 / 1000000);
        }
    }

    @Override // com.baidu.ar.l6
    public void startRecorder(Context context, EncoderParams encoderParams, com.baidu.ar.record.MovieRecorderCallback movieRecorderCallback) {
        h.c(f3093s, "startRecorder mStarting = " + this.f3101e);
        if (this.f3101e) {
            k();
            return;
        }
        this.f3101e = true;
        this.f3098b = context;
        this.f3103g = encoderParams;
        this.f3104h = movieRecorderCallback;
        l();
    }

    @Override // com.baidu.ar.l6
    public void stopRecorder() {
        d dVar;
        String str = f3093s;
        h.c(str, "stopRecorder mStarting = " + this.f3101e);
        if (this.f3101e) {
            if (!c() && (dVar = this.f3105i) != null) {
                dVar.sendMessage(dVar.obtainMessage(7004, 4002));
            }
            h.a(str, "stopRecorder() MovieRecorder is starting, we will try to stop 500ms later!!!");
            d dVar2 = this.f3105i;
            if (dVar2 != null) {
                dVar2.sendMessageDelayed(dVar2.obtainMessage(7006), 500L);
                return;
            }
            return;
        }
        this.f3111o = false;
        this.f3114r = false;
        y0 y0Var = this.f3109m;
        if (y0Var != null && y0Var.e()) {
            this.f3109m.h();
        }
        ae aeVar = this.f3112p;
        if (aeVar != null && aeVar.e()) {
            this.f3112p.h();
        }
        b(false);
    }

    public final void c(int i8, boolean z7) {
        if (z7) {
            f3094t = i8 ^ f3094t;
        }
        this.f3097a--;
    }

    public final void d(int i8, boolean z7) {
        if (z7) {
            f3094t = i8 | f3094t;
        }
        this.f3097a++;
    }

    public final boolean e() {
        EncoderParams encoderParams = this.f3103g;
        if (encoderParams == null) {
            return false;
        }
        if (encoderParams.isAudioIncluded()) {
            if (this.f3097a == 3) {
                return true;
            }
        } else if (this.f3097a == 2) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f3097a == 0;
    }

    public final boolean g() {
        boolean z7;
        y0 y0Var = this.f3109m;
        if (y0Var == null || !y0Var.e()) {
            z7 = true;
        } else {
            h.b(f3093s, "prepareMovieRecorder mAudioRecorder.isRunning !!!");
            this.f3109m.h();
            this.f3109m.f();
            z7 = false;
        }
        ae aeVar = this.f3112p;
        if (aeVar != null && aeVar.e()) {
            h.b(f3093s, "prepareMovieRecorder mVideoRecorder.isRunning !!!");
            this.f3112p.h();
            this.f3112p.f();
            z7 = false;
        }
        EncoderParams encoderParams = this.f3103g;
        if (encoderParams == null || this.f3107k.a(encoderParams.getOutputFile(), this.f3103g.getOutputFormat(), this.f3108l)) {
            return z7;
        }
        h.b(f3093s, "prepareMovieRecorder movieMuxerInit error!!!");
        return false;
    }

    public final void b() {
        this.f3107k = new z8();
        if (this.f3103g.isAudioIncluded()) {
            this.f3109m = new y0();
        } else {
            f3095u = true;
        }
        this.f3112p = new ae();
        this.f3097a = 0;
        if (!this.f3099c && this.f3100d == null) {
            HandlerThread handlerThread = new HandlerThread(f3093s);
            this.f3100d = handlerThread;
            handlerThread.start();
        }
        d dVar = this.f3105i;
        if (dVar == null) {
            this.f3105i = this.f3100d != null ? new d(this.f3100d.getLooper()) : new d(this.f3098b.getMainLooper());
        } else {
            dVar.removeCallbacksAndMessages(null);
        }
        this.f3106j = new ma(this.f3103g.getOutputTotalMs());
    }

    public final synchronized boolean c() {
        int i8;
        h.c(f3093s, "isMovieRecordStarted sMovieRecordState = " + f3094t);
        int i9 = f3094t;
        i8 = i9 ^ 3;
        EncoderParams encoderParams = this.f3103g;
        if (encoderParams != null) {
            if (encoderParams.isAudioIncluded()) {
                i8 = i9 ^ 7;
            }
        }
        return i8 == 0;
    }

    public final synchronized boolean d() {
        return f3094t == 0;
    }

    public final synchronized void b(int i8, boolean z7) {
        String str = f3093s;
        h.c(str, "checkMovieRecordStopState condition = " + i8 + " && state = " + z7);
        c(i8, z7);
        StringBuilder sb = new StringBuilder();
        sb.append("checkMovieRecordStopState sMovieRecordState = ");
        sb.append(f3094t);
        h.c(str, sb.toString());
        if (f() && this.f3105i != null) {
            boolean d8 = d();
            d dVar = this.f3105i;
            dVar.sendMessage(dVar.obtainMessage(7003, Boolean.valueOf(d8)));
        }
    }

    public static void b(boolean z7) {
        f3095u = z7;
    }

    public final void a() {
        this.f3113q = new a();
        this.f3110n = new b();
        this.f3108l = new c();
    }

    public static void a(int i8) {
        f3094t = i8;
    }

    public final synchronized void a(int i8, boolean z7) {
        String str = f3093s;
        h.c(str, "checkMovieRecordStartState condition = " + i8 + " && state = " + z7);
        d(i8, z7);
        StringBuilder sb = new StringBuilder();
        sb.append("checkMovieRecordStartState sMovieRecordState = ");
        sb.append(f3094t);
        h.c(str, sb.toString());
        if (e()) {
            boolean c8 = c();
            d dVar = this.f3105i;
            dVar.sendMessage(dVar.obtainMessage(7001, Boolean.valueOf(c8)));
        }
    }

    public final void a(long j8) {
        d dVar;
        if (!this.f3106j.a()) {
            this.f3106j.b(j8);
            return;
        }
        int a8 = this.f3106j.a(j8);
        if (a8 <= 0 || (dVar = this.f3105i) == null) {
            return;
        }
        dVar.sendMessage(dVar.obtainMessage(7002, Integer.valueOf(a8)));
    }
}
