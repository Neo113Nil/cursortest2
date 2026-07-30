package com.baidu.ar;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.message.ARPMessageType;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.SDKInitializer;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.io.IOException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: d, reason: collision with root package name */
    public static x0 f3655d;

    /* renamed from: e, reason: collision with root package name */
    public static ConcurrentHashMap<String, p> f3656e;

    /* renamed from: f, reason: collision with root package name */
    public static HandlerThread f3657f;

    /* renamed from: h, reason: collision with root package name */
    public static q f3659h;

    /* renamed from: i, reason: collision with root package name */
    public static Map<String, Integer> f3660i;

    /* renamed from: j, reason: collision with root package name */
    public static Timer f3661j;

    /* renamed from: k, reason: collision with root package name */
    public static TimerTask f3662k;

    /* renamed from: a, reason: collision with root package name */
    public Handler f3665a;

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Integer> f3666b;

    /* renamed from: c, reason: collision with root package name */
    public Handler.Callback f3667c = new h();

    /* renamed from: g, reason: collision with root package name */
    public static Handler f3658g = new Handler(Looper.getMainLooper());

    /* renamed from: l, reason: collision with root package name */
    public static final String f3663l = x0.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    public static Runnable f3664m = new g();

    public class a implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f3668a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f3669b;

        public a(r0 r0Var, HashMap hashMap) {
            this.f3668a = r0Var;
            this.f3669b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            int a8;
            String str = x0.f3663l;
            LogUtil.b(str, "openAudio mMediaPlayer onCompletion");
            if (x0.this.f3666b == null) {
                return;
            }
            p a9 = x0.this.a(this.f3668a.b());
            if (a9 == null || a9.f3694b.f3761g != "paused") {
                if (a9 != null) {
                    y8 y8Var = a9.f3694b;
                    y8Var.f3759e = "STATUS";
                    y8Var.f3761g = "finished";
                    x0.c(a9);
                    if (this.f3668a.f()) {
                        LogUtil.b(str, "openAudio mMediaPlayer onCompletion  isLoopForever open！");
                        x0.this.a(this.f3668a, this.f3669b);
                        return;
                    }
                }
                if (x0.this.f3666b.size() <= 0 || (a8 = x0.a((Map<String, Integer>) x0.this.f3666b, this.f3668a.b())) <= 1) {
                    x0.this.a(1009, this.f3669b);
                    mediaPlayer.release();
                    return;
                }
                LogUtil.b(str, "openAudio mMediaPlayer onCompletion  count open ！");
                x0.this.a(this.f3668a, this.f3669b);
                int i8 = a8 - 1;
                x0.this.f3666b.put(this.f3668a.b(), Integer.valueOf(i8));
                this.f3668a.a(i8);
            }
        }
    }

    public class b implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f3671a;

        public b(HashMap hashMap) {
            this.f3671a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f3671a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
        }
    }

    public class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f3673a;

        public c(HashMap hashMap) {
            this.f3673a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f3673a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
        }
    }

    public class d implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f3675a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f3676b;

        public d(r0 r0Var, HashMap hashMap) {
            this.f3675a = r0Var;
            this.f3676b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            int a8;
            if (x0.this.f3666b == null) {
                return;
            }
            p a9 = x0.this.a(this.f3675a.b());
            if (a9 != null) {
                y8 y8Var = a9.f3694b;
                y8Var.f3759e = "STATUS";
                y8Var.f3761g = "finished";
                x0.c(a9);
                if (this.f3675a.f()) {
                    x0.this.a(this.f3675a, this.f3676b);
                    return;
                }
            }
            if (x0.this.f3666b.size() <= 0 || (a8 = x0.a((Map<String, Integer>) x0.this.f3666b, this.f3675a.b())) <= 1) {
                x0.this.a(1009, this.f3676b);
                return;
            }
            x0.this.a(this.f3675a, this.f3676b);
            int i8 = a8 - 1;
            x0.this.f3666b.put(this.f3675a.b(), Integer.valueOf(i8));
            this.f3675a.a(i8);
        }
    }

    public class e implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f3678a;

        public e(HashMap hashMap) {
            this.f3678a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f3678a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
        }
    }

    public class f implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f3680a;

        public f(HashMap hashMap) {
            this.f3680a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f3680a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
        }
    }

    public class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (x0.f3657f != null) {
                x0.f3657f.quit();
                HandlerThread unused = x0.f3657f = null;
            }
        }
    }

    public class h implements Handler.Callback {
        public h() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
        
            return false;
         */
        @Override // android.os.Handler.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean handleMessage(Message message) {
            if (!ARPEngine.getInstance().isEngineCanAccess()) {
                return false;
            }
            switch (message.what) {
                case 3004:
                    x0.this.e(message);
                    break;
                case AuthApiStatusCodes.AUTH_URL_RESOLUTION /* 3005 */:
                    x0.this.f(message);
                    break;
                case AuthApiStatusCodes.AUTH_APP_CERT_ERROR /* 3006 */:
                    x0.this.a(message);
                    break;
                case 3007:
                    x0.this.d(message);
                    break;
                case 3008:
                    x0.this.b(message);
                    break;
                case 3009:
                    x0.this.c(message);
                    break;
            }
        }
    }

    public class i implements MediaPlayer.OnCompletionListener {
        public i(x0 x0Var) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            LogUtil.b(x0.f3663l, "initMediaPlayerInMsg onCompletion()");
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        }
    }

    public class j implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3683a;

        public class a implements q {
            public a() {
            }

            @Override // com.baidu.ar.x0.q
            public void a(Exception exc) {
                x0.this.a(1010, (HashMap<String, Object>) null);
            }

            @Override // com.baidu.ar.x0.q
            public void onResult(boolean z7) {
            }
        }

        public j(p pVar) {
            this.f3683a = pVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
            LogUtil.b(x0.f3663l, "onError: " + i8);
            p pVar = this.f3683a;
            y8 y8Var = pVar.f3694b;
            y8Var.f3759e = "ERROR";
            y8Var.f3760f = i8;
            x0.c(pVar);
            x0.this.c(new a(), this.f3683a.f3694b.f3758d);
            return false;
        }
    }

    public class k implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3686a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f3687b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f3688c;

        public k(p pVar, String str, long j8) {
            this.f3686a = pVar;
            this.f3687b = str;
            this.f3688c = j8;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            String str = x0.f3663l;
            LogUtil.b(str, "mMediaPlayer onPrepared");
            p pVar = this.f3686a;
            y8 y8Var = pVar.f3694b;
            y8Var.f3759e = "STATUS";
            y8Var.f3761g = "prepared";
            x0.c(pVar);
            if (ARPEngine.getInstance().isPaused() || x0.f3660i == null || x0.f3660i.get(this.f3687b) == null) {
                return;
            }
            if (((Integer) x0.f3660i.get(this.f3687b)).intValue() == 3004 || ((Integer) x0.f3660i.get(this.f3687b)).intValue() == 3007) {
                x0.i();
                try {
                    if (this.f3686a.f3693a.getDuration() >= 0) {
                        long duration = this.f3686a.f3693a.getDuration();
                        long j8 = this.f3688c;
                        if (duration > j8 && j8 >= 0) {
                            this.f3686a.f3693a.seekTo((int) j8);
                        }
                        this.f3686a.f3693a.seekTo(0);
                    }
                    LogUtil.b(str, "mMediaPlayer start");
                    this.f3686a.f3693a.start();
                    this.f3686a.f3694b.f3761g = "playing";
                } catch (Exception e8) {
                    x0.a(this.f3686a.f3693a);
                    e8.printStackTrace();
                }
            }
        }
    }

    public class l implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3689a;

        public l(p pVar) {
            this.f3689a = pVar;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
            p pVar = this.f3689a;
            y8 y8Var = pVar.f3694b;
            y8Var.f3759e = "INFO";
            y8Var.f3763i = i8;
            x0.c(pVar);
        }
    }

    public class m implements MediaPlayer.OnInfoListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f3690a;

        public m(p pVar) {
            this.f3690a = pVar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
            String str;
            p pVar = this.f3690a;
            y8 y8Var = pVar.f3694b;
            y8Var.f3759e = "INFO";
            if (i8 == 701) {
                str = "buffer_start";
            } else {
                if (i8 != 702) {
                    return false;
                }
                str = "buffer_end";
            }
            y8Var.f3762h = str;
            x0.c(pVar);
            return false;
        }
    }

    public class n extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            p pVar;
            y8 y8Var;
            if (x0.f3656e != null) {
                for (Map.Entry entry : x0.f3656e.entrySet()) {
                    if (entry != null && (pVar = (p) entry.getValue()) != null && (y8Var = pVar.f3694b) != null && y8Var.f3761g == "playing") {
                        x0.c((p) entry.getValue());
                    }
                }
            }
        }
    }

    public class o implements q {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f3691a;

        public o(HashMap hashMap) {
            this.f3691a = hashMap;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            x0.this.a(1010, this.f3691a);
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public MediaPlayer f3693a;

        /* renamed from: b, reason: collision with root package name */
        public y8 f3694b = new y8();
    }

    public interface q {
        void a(Exception exc);

        void onResult(boolean z7);
    }

    public class r implements q {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ boolean f3695a;

            public a(r rVar, boolean z7) {
                this.f3695a = z7;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.f3659h != null) {
                    x0.f3659h.onResult(this.f3695a);
                }
            }
        }

        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Exception f3696a;

            public b(r rVar, Exception exc) {
                this.f3696a = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.f3659h != null) {
                    x0.f3659h.a(this.f3696a);
                }
            }
        }

        public r(x0 x0Var, q qVar) {
            q unused = x0.f3659h = qVar;
        }

        @Override // com.baidu.ar.x0.q
        public void a(Exception exc) {
            if (x0.f3659h == null) {
                return;
            }
            x0.f3658g.post(new b(this, exc));
        }

        @Override // com.baidu.ar.x0.q
        public void onResult(boolean z7) {
            if (x0.f3659h == null) {
                return;
            }
            x0.f3658g.post(new a(this, z7));
        }
    }

    public x0() {
        synchronized (x0.class) {
            try {
                if (f3657f == null) {
                    HandlerThread handlerThread = new HandlerThread("MediaPlayerThread");
                    f3657f = handlerThread;
                    handlerThread.start();
                } else {
                    f3658g.removeCallbacks(f3664m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3665a = new Handler(f3657f.getLooper(), this.f3667c);
        this.f3666b = new Hashtable();
        f3660i = new Hashtable();
    }

    public static int a(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static synchronized x0 g() {
        x0 x0Var;
        synchronized (x0.class) {
            try {
                if (f3655d == null) {
                    f3655d = new x0();
                }
                x0Var = f3655d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x0Var;
    }

    public static synchronized void i() {
        synchronized (x0.class) {
            if (f3661j == null) {
                f3661j = new Timer();
                n nVar = new n();
                f3662k = nVar;
                f3661j.scheduleAtFixedRate(nVar, 0L, 200L);
            }
        }
    }

    public void h() {
        this.f3667c = null;
        Timer timer = f3661j;
        if (timer != null) {
            timer.cancel();
            f3661j.purge();
            f3661j = null;
            f3662k.cancel();
            f3662k = null;
        }
        Map<String, Integer> map = f3660i;
        if (map != null) {
            map.clear();
        }
        ConcurrentHashMap<String, p> concurrentHashMap = f3656e;
        if (concurrentHashMap != null) {
            try {
                for (p pVar : concurrentHashMap.values()) {
                    y8 y8Var = pVar.f3694b;
                    y8Var.f3759e = "STATUS";
                    y8Var.f3761g = "unstarted";
                    a(pVar.f3693a);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            ConcurrentHashMap<String, p> concurrentHashMap2 = f3656e;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
        }
        Map<String, Integer> map2 = this.f3666b;
        if (map2 != null) {
            map2.clear();
        }
    }

    public void b(Message message) {
        q qVar = (q) ((Object[]) message.obj)[0];
        ConcurrentHashMap<String, p> concurrentHashMap = f3656e;
        if (concurrentHashMap != null) {
            try {
                for (p pVar : concurrentHashMap.values()) {
                    if (pVar != null) {
                        pVar.f3693a.release();
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            f3656e.clear();
        }
        if (qVar != null) {
            qVar.onResult(true);
        }
    }

    public void c(Message message) {
        Object[] objArr = (Object[]) message.obj;
        if (objArr.length < 2) {
            return;
        }
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        f3660i.put(str, 3009);
        try {
            p a8 = a(str);
            if (a8 == null || a8.f3694b.f3761g == "unstarted") {
                return;
            }
            a8.f3693a.seekTo(0);
        } catch (Exception e8) {
            e8.printStackTrace();
            if (qVar != null) {
                qVar.a(e8);
            }
        }
    }

    public void d(Message message) {
        String str;
        long j8;
        if (ARPEngine.getInstance().isPaused()) {
            return;
        }
        Object[] objArr = (Object[]) message.obj;
        if (objArr.length < 5) {
            return;
        }
        q qVar = (q) objArr[0];
        String str2 = (String) objArr[1];
        String str3 = (String) objArr[2];
        MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) objArr[3];
        int intValue = ((Integer) objArr[4]).intValue();
        if (objArr.length > 6) {
            String str4 = (String) objArr[5];
            j8 = ((Long) objArr[6]).longValue();
            str = str4;
        } else {
            str = null;
            j8 = 0;
        }
        f3660i.put(str2, 3007);
        try {
            p a8 = a(str2);
            if (a8 != null && !a8.f3693a.isPlaying()) {
                y8 y8Var = a8.f3694b;
                if (y8Var.f3761g != "unstarted") {
                    y8Var.f3759e = "STATUS";
                    y8Var.f3761g = "playing";
                    c(a8);
                    LogUtil.b(f3663l, "MediaPlayer resume");
                    MediaPlayer mediaPlayer = a8.f3693a;
                    mediaPlayer.seekTo(mediaPlayer.getCurrentPosition());
                    a8.f3693a.start();
                }
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            a(qVar, str2, str3, onCompletionListener, intValue, str, j8);
        }
    }

    public void e(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) objArr[3];
        int intValue = ((Integer) objArr[4]).intValue();
        String str3 = (String) objArr[5];
        long longValue = ((Long) objArr[6]).longValue();
        f3660i.put(str, 3004);
        a(qVar, str, str2, null, onCompletionListener, null, intValue, str3, longValue);
    }

    public void f(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        f3660i.put(str, Integer.valueOf(AuthApiStatusCodes.AUTH_URL_RESOLUTION));
        p a8 = a(str);
        if (a8 != null) {
            try {
                y8 y8Var = a8.f3694b;
                y8Var.f3759e = "STATUS";
                y8Var.f3761g = "unstarted";
                c(a8);
                LogUtil.b(f3663l, "mMediaPlayer stopPlay");
                a(a8.f3693a);
                a8.f3693a = null;
                b(str);
            } catch (Exception e8) {
                e8.printStackTrace();
                if (qVar != null) {
                    qVar.a(e8);
                    return;
                }
                return;
            }
        }
        if (qVar != null) {
            qVar.onResult(true);
        }
    }

    public void b(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1004, hashMap);
        a(new b(hashMap), r0Var.b());
    }

    public void c(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1013, hashMap);
        b(new f(hashMap), r0Var.b());
    }

    public void d(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1006, hashMap);
        a(new c(hashMap), r0Var.b(), r0Var.e(), new d(r0Var, hashMap), r0Var.c());
    }

    public void e(r0 r0Var, HashMap<String, Object> hashMap) {
        a(1008, hashMap);
        c(new e(hashMap), r0Var.b());
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x003b -> B:21:0x003e). Please report as a decompilation issue!!! */
    public static void b(p pVar) {
        MediaPlayer mediaPlayer;
        if (pVar == null || (mediaPlayer = pVar.f3693a) == null) {
            return;
        }
        y8 y8Var = pVar.f3694b;
        String str = y8Var.f3761g;
        if (str == "playing" || str == "paused") {
            try {
                int duration = mediaPlayer.getDuration();
                y8Var.f3757c = duration;
                if (duration <= 0) {
                    y8Var.f3764j = 0.0f;
                } else {
                    y8Var.f3764j = (pVar.f3693a.getCurrentPosition() * 1.0f) / y8Var.f3757c;
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } else if (str == "finished") {
            y8Var.f3764j = 1.0f;
        }
        if (y8Var.f3764j > 1.0f) {
            y8Var.f3764j = 1.0f;
        }
        if (y8Var.f3764j < 0.0f) {
            y8Var.f3764j = 0.0f;
        }
    }

    public static void c(p pVar) {
        if (pVar == null) {
            return;
        }
        b(pVar);
        a(pVar.f3694b);
        y8 y8Var = pVar.f3694b;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", Integer.valueOf(ARPMessageType.MSG_TYPE_AUDIO));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("action_id", String.valueOf(y8Var.f3755a));
        hashMap2.put("platform", HttpConstants.OS_TYPE_VALUE);
        hashMap2.put("type", y8Var.f3759e);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, Integer.valueOf(y8Var.f3760f));
        hashMap3.put("buffer_status", y8Var.f3762h);
        hashMap3.put("buffer_progress", Integer.valueOf(y8Var.f3763i));
        hashMap3.put("play_status", y8Var.f3761g);
        hashMap3.put("play_progress", Integer.valueOf((int) (y8Var.f3764j * 100.0f)));
        hashMap2.put("data", hashMap3);
        hashMap.put("msg_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1902, hashMap);
    }

    public final p a(MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener) {
        LogUtil.b(f3663l, "initMediaPlayerInMsg start()");
        try {
            p pVar = new p();
            MediaPlayer mediaPlayer = new MediaPlayer();
            pVar.f3693a = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            if (onCompletionListener == null) {
                onCompletionListener = new i(this);
            }
            mediaPlayer.setOnCompletionListener(onCompletionListener);
            if (onErrorListener == null) {
                onErrorListener = new j(pVar);
            }
            mediaPlayer.setOnErrorListener(onErrorListener);
            return pVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static p a(p pVar, String str, String str2, AssetFileDescriptor assetFileDescriptor, MediaPlayer.OnCompletionListener onCompletionListener, int i8, String str3, long j8) {
        if ((TextUtils.isEmpty(str2) && assetFileDescriptor == null) || pVar == null) {
            return pVar;
        }
        pVar.f3694b.f3755a = a9.a((Object) str, 0L);
        y8 y8Var = pVar.f3694b;
        y8Var.f3758d = str;
        y8Var.f3756b = str3;
        MediaPlayer mediaPlayer = pVar.f3693a;
        if (onCompletionListener != null) {
            mediaPlayer.setOnCompletionListener(onCompletionListener);
        }
        try {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.seekTo(0);
                mediaPlayer.stop();
            }
            mediaPlayer.setAudioStreamType(3);
            mediaPlayer.reset();
            if (!TextUtils.isEmpty(str2)) {
                mediaPlayer.setDataSource(str2);
            } else if (assetFileDescriptor != null) {
                mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            }
            mediaPlayer.prepareAsync();
            mediaPlayer.setLooping(false);
            LogUtil.b(f3663l, "wrapper.mMediaPlayer.prepareAsync()");
            mediaPlayer.setOnPreparedListener(new k(pVar, str, j8));
            pVar.f3693a.setOnBufferingUpdateListener(new l(pVar));
            pVar.f3693a.setOnInfoListener(new m(pVar));
        } catch (IOException e8) {
            e = e8;
            e.printStackTrace();
            return pVar;
        } catch (IllegalArgumentException e9) {
            e = e9;
            e.printStackTrace();
            return pVar;
        } catch (IllegalStateException e10) {
            e = e10;
            e.printStackTrace();
            return pVar;
        } catch (SecurityException e11) {
            e = e11;
            e.printStackTrace();
            return pVar;
        }
        return pVar;
    }

    public void b(q qVar, String str) {
        Message obtainMessage = this.f3665a.obtainMessage(3009);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public void c(q qVar, String str) {
        Message obtainMessage = this.f3665a.obtainMessage(AuthApiStatusCodes.AUTH_URL_RESOLUTION);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public p a(String str) {
        if (f3656e == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return f3656e.get(str);
    }

    public void b(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i8, String str3, long j8) {
        Message obtainMessage = this.f3665a.obtainMessage(3004);
        obtainMessage.obj = new Object[]{new r(this, qVar), str, str2, onCompletionListener, Integer.valueOf(i8), str3, Long.valueOf(j8)};
        obtainMessage.sendToTarget();
    }

    public p a(String str, MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, p> concurrentHashMap = f3656e;
        if (concurrentHashMap != null && concurrentHashMap.containsKey(str)) {
            return f3656e.get(str);
        }
        p a8 = a(onCompletionListener, onErrorListener);
        if (a8 == null) {
            return null;
        }
        if (f3656e == null) {
            f3656e = new ConcurrentHashMap<>();
        }
        f3656e.put(str, a8);
        return a8;
    }

    public void b(String str) {
        if (f3656e == null || TextUtils.isEmpty(str) || !f3656e.containsKey(str)) {
            return;
        }
        f3656e.remove(str);
    }

    public void a(int i8, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i8, hashMap);
    }

    public static void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void a(Message message) {
        Object[] objArr = (Object[]) message.obj;
        q qVar = (q) objArr[0];
        String str = (String) objArr[1];
        f3660i.put(str, Integer.valueOf(AuthApiStatusCodes.AUTH_APP_CERT_ERROR));
        try {
            p a8 = a(str);
            MediaPlayer mediaPlayer = a8.f3693a;
            if (mediaPlayer != null && a8.f3694b.f3761g != "unstarted" && mediaPlayer.isPlaying()) {
                y8 y8Var = a8.f3694b;
                y8Var.f3759e = "STATUS";
                y8Var.f3761g = "paused";
                c(a8);
                LogUtil.b(f3663l, "mMediaPlayer pause");
                a8.f3693a.pause();
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            if (qVar != null) {
                qVar.a(e8);
            }
        }
    }

    public void a(r0 r0Var, HashMap<String, Object> hashMap) {
        if (r0Var.c() > 1) {
            this.f3666b.put(r0Var.b(), Integer.valueOf(r0Var.c()));
        }
        a(1002, hashMap);
        b(new o(hashMap), r0Var.b(), r0Var.e(), new a(r0Var, hashMap), r0Var.c(), r0Var.d(), r0Var.a());
    }

    public void a(q qVar, String str) {
        Message obtainMessage = this.f3665a.obtainMessage(AuthApiStatusCodes.AUTH_APP_CERT_ERROR);
        obtainMessage.obj = new Object[]{new r(this, qVar), str};
        obtainMessage.sendToTarget();
    }

    public final void a(q qVar, String str, String str2, AssetFileDescriptor assetFileDescriptor, MediaPlayer.OnCompletionListener onCompletionListener, MediaPlayer.OnErrorListener onErrorListener, int i8, String str3, long j8) {
        try {
            p a8 = a(str, onCompletionListener, onErrorListener);
            if (a8 != null) {
                a(a8, str, str2, assetFileDescriptor, onCompletionListener, i8, str3, j8);
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            p a9 = a(str);
            b(str);
            try {
                MediaPlayer mediaPlayer = a9.f3693a;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                try {
                    p a10 = g().a(str, onCompletionListener, onErrorListener);
                    if (a10 != null) {
                        a(a10, str, str2, assetFileDescriptor, onCompletionListener, i8, str3, j8);
                    }
                    if (qVar != null) {
                        qVar.onResult(true);
                    }
                } catch (Exception e9) {
                    e9.printStackTrace();
                    if (qVar != null) {
                        qVar.a(e9);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (qVar != null) {
                    qVar.a(e10);
                }
            }
        }
    }

    public void a(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i8) {
        Message obtainMessage = this.f3665a.obtainMessage(3007);
        obtainMessage.obj = new Object[]{new r(this, qVar), str, str2, onCompletionListener, Integer.valueOf(i8)};
        obtainMessage.sendToTarget();
    }

    public final void a(q qVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i8, String str3, long j8) {
        p a8 = a(str);
        b(str);
        if (a8 != null) {
            try {
                MediaPlayer mediaPlayer = a8.f3693a;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
                if (qVar != null) {
                    qVar.a(e8);
                    return;
                }
                return;
            }
        }
        try {
            p a9 = a(str, onCompletionListener, null);
            if (a9 != null) {
                a(a9, str, str2, null, onCompletionListener, i8, str3, j8);
            }
            if (qVar != null) {
                qVar.onResult(true);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
            if (qVar != null) {
                qVar.a(e9);
            }
        }
    }

    public static void a(y8 y8Var) {
        if (y8Var == null) {
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", String.valueOf(y8Var.f3755a));
        hashMap.put("target", y8Var.f3756b);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("play_status", y8Var.f3761g);
        hashMap2.put("buffer_status", y8Var.f3762h);
        hashMap2.put("duration", String.valueOf(y8Var.f3757c));
        hashMap2.put("buffer_progress", String.valueOf(y8Var.f3763i));
        hashMap2.put("play_progress", String.valueOf((int) (y8Var.f3764j * 100.0f)));
        hashMap.put("msg_data", hashMap2);
        ARPMessage.getInstance().sendMessage(1011, hashMap);
    }
}
