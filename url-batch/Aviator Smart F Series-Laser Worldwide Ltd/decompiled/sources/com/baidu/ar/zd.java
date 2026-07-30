package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Surface;
import com.baidu.ar.arplay.core.engine.ARPEngine;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.message.ARPMessageType;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.arplay.util.c;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.mapapi.SDKInitializer;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class zd {

    /* renamed from: f, reason: collision with root package name */
    public static zd f3837f = null;

    /* renamed from: g, reason: collision with root package name */
    public static final String f3838g = "zd";

    /* renamed from: c, reason: collision with root package name */
    public Timer f3841c;

    /* renamed from: d, reason: collision with root package name */
    public TimerTask f3842d;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<String, m> f3839a = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    public com.baidu.ar.arplay.util.a f3843e = new c();

    /* renamed from: b, reason: collision with root package name */
    public Map<String, Integer> f3840b = new Hashtable();

    public class a implements l {
        public a(zd zdVar, HashMap hashMap) {
        }
    }

    public class b implements l {
        public b(zd zdVar, HashMap hashMap) {
        }
    }

    public class c implements com.baidu.ar.arplay.util.a {
        public c() {
        }

        @Override // com.baidu.ar.arplay.util.a
        public void a() {
            zd.this.a((l) null, true);
        }

        @Override // com.baidu.ar.arplay.util.a
        public void a(c.a aVar) {
            zd.this.b((l) null, true);
        }
    }

    public class d implements MediaPlayer.OnErrorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f3845a;

        public d(zd zdVar, m mVar) {
            this.f3845a = mVar;
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i8, int i9) {
            m mVar = this.f3845a;
            y8 y8Var = mVar.f3859e;
            y8Var.f3759e = "ERROR";
            y8Var.f3760f = i8;
            zd.c(mVar);
            return true;
        }
    }

    public class e implements MediaPlayer.OnPreparedListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f3846a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f3847b;

        public e(m mVar, long j8) {
            this.f3846a = mVar;
            this.f3847b = j8;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            String str = zd.f3838g;
            LogUtil.b(str, "mMediaPlayer onPrepared");
            m mVar = this.f3846a;
            y8 y8Var = mVar.f3859e;
            y8Var.f3759e = "STATUS";
            y8Var.f3761g = "prepared";
            zd.c(mVar);
            if (ARPEngine.getInstance().isEngineCanAccess() && !ARPEngine.getInstance().isPaused()) {
                zd.this.e();
                try {
                    if (this.f3846a.f3855a.getDuration() >= 0) {
                        long duration = this.f3846a.f3855a.getDuration();
                        long j8 = this.f3847b;
                        if (duration > j8 && j8 >= 0) {
                            this.f3846a.f3855a.seekTo((int) j8);
                        }
                        this.f3846a.f3855a.seekTo(0);
                    }
                    LogUtil.b(str, "mMediaPlayer start");
                    this.f3846a.f3855a.start();
                    this.f3846a.f3859e.f3761g = "playing";
                } catch (Exception e8) {
                    e8.fillInStackTrace();
                }
            }
        }
    }

    public class f implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f3849a;

        public f(zd zdVar, m mVar) {
            this.f3849a = mVar;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
            m mVar = this.f3849a;
            y8 y8Var = mVar.f3859e;
            y8Var.f3759e = "INFO";
            y8Var.f3763i = i8;
            zd.c(mVar);
        }
    }

    public class g implements MediaPlayer.OnInfoListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f3850a;

        public g(zd zdVar, m mVar) {
            this.f3850a = mVar;
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
            String str;
            m mVar = this.f3850a;
            y8 y8Var = mVar.f3859e;
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
            zd.c(mVar);
            return false;
        }
    }

    public class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            m mVar;
            y8 y8Var;
            if (zd.this.f3839a != null) {
                for (Map.Entry entry : zd.this.f3839a.entrySet()) {
                    if (entry != null && (mVar = (m) entry.getValue()) != null && (y8Var = mVar.f3859e) != null && y8Var.f3761g == "playing") {
                        zd.c((m) entry.getValue());
                    }
                }
            }
        }
    }

    public class i implements l {
        public i(zd zdVar, HashMap hashMap) {
        }
    }

    public class j implements MediaPlayer.OnCompletionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xd f3852a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HashMap f3853b;

        public j(xd xdVar, HashMap hashMap) {
            this.f3852a = xdVar;
            this.f3853b = hashMap;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            xd xdVar;
            zd zdVar;
            int a8;
            if (zd.this.f3840b == null || (xdVar = this.f3852a) == null) {
                return;
            }
            m b8 = zd.this.b(xdVar.b());
            if (b8 != null) {
                y8 y8Var = b8.f3859e;
                y8Var.f3759e = "STATUS";
                y8Var.f3761g = "finished";
                zd.c(b8);
                if (this.f3852a.g()) {
                    zd.this.a(this.f3852a, this.f3853b);
                    return;
                }
            }
            if (zd.this.f3840b.size() <= 0 || (a8 = (zdVar = zd.this).a(zdVar.f3840b, this.f3852a.b())) <= 1) {
                zd.this.a(1030, this.f3853b);
                return;
            }
            int i8 = a8 - 1;
            zd.this.f3840b.put(this.f3852a.b(), Integer.valueOf(i8));
            this.f3852a.a(i8);
            zd.this.a(this.f3852a, this.f3853b);
        }
    }

    public class k implements l {
        public k(zd zdVar, HashMap hashMap) {
        }
    }

    public interface l {
    }

    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public MediaPlayer f3855a;

        /* renamed from: b, reason: collision with root package name */
        public SurfaceTexture f3856b;

        /* renamed from: c, reason: collision with root package name */
        public int f3857c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3858d = false;

        /* renamed from: e, reason: collision with root package name */
        public y8 f3859e = new y8();
    }

    public zd() {
        com.baidu.ar.arplay.util.b.a(this.f3843e);
    }

    public int a(Map<String, Integer> map, String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public m b(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public int c(String str) {
        m b8 = b(str);
        if (b8 != null) {
            return b8.f3857c;
        }
        return 0;
    }

    public SurfaceTexture d(String str) {
        m mVar;
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap == null || (mVar = concurrentHashMap.get(str)) == null) {
            return null;
        }
        return mVar.f3856b;
    }

    public final synchronized void e() {
        if (this.f3841c == null) {
            this.f3841c = new Timer();
            h hVar = new h();
            this.f3842d = hVar;
            this.f3841c.scheduleAtFixedRate(hVar, 0L, 200L);
        }
    }

    public final MediaPlayer a(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap == null || concurrentHashMap.get(str) == null) {
            return null;
        }
        return this.f3839a.get(str).f3855a;
    }

    public void d() {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, m> entry : concurrentHashMap.entrySet()) {
                if (entry != null) {
                    b((l) null, entry.getKey());
                    entry.getValue().f3856b = null;
                    entry.getValue().f3859e.f3759e = "STATUS";
                    entry.getValue().f3859e.f3761g = "unstarted";
                    entry.getValue().f3858d = false;
                    c(entry.getValue());
                    MediaPlayer mediaPlayer = entry.getValue().f3855a;
                    if (mediaPlayer != null) {
                        try {
                            LogUtil.b(f3838g, "releaseMediaPlayer");
                            mediaPlayer.release();
                        } catch (Exception unused) {
                            System.out.println("player release Exception");
                        }
                    }
                }
            }
            this.f3839a.clear();
        }
    }

    public final void e(String str) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap == null || concurrentHashMap.get(str) == null) {
            return;
        }
        this.f3839a.remove(str);
    }

    public static synchronized zd a() {
        zd zdVar;
        synchronized (zd.class) {
            try {
                if (f3837f == null) {
                    f3837f = new zd();
                }
                zdVar = f3837f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zdVar;
    }

    public static void c() {
        f3837f = null;
    }

    public synchronized void b() {
        try {
            Timer timer = this.f3841c;
            if (timer != null) {
                timer.cancel();
                this.f3841c.purge();
                this.f3841c = null;
                TimerTask timerTask = this.f3842d;
                if (timerTask != null) {
                    timerTask.cancel();
                    this.f3842d = null;
                }
            }
            com.baidu.ar.arplay.util.b.b(this.f3843e);
            d();
            c();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d(xd xdVar, HashMap<String, Object> hashMap) {
        a(1028, hashMap);
        b(new b(this, hashMap), xdVar.b());
    }

    public void a(int i8, HashMap<String, Object> hashMap) {
        ARPMessage.getInstance().sendMessage(i8, hashMap);
    }

    public void b(xd xdVar, HashMap<String, Object> hashMap) {
        a(1024, hashMap);
        a(new k(this, hashMap), xdVar.b(), false);
    }

    public void c(xd xdVar, HashMap<String, Object> hashMap) {
        a(1026, hashMap);
        LogUtil.b(f3838g, "mMediaPlayer resumeVideo");
        a(new a(this, hashMap), xdVar.b());
    }

    public static void c(m mVar) {
        if (mVar == null) {
            return;
        }
        b(mVar);
        a(mVar.f3859e);
        y8 y8Var = mVar.f3859e;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", Integer.valueOf(ARPMessageType.MSG_TYPE_VIDEO));
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

    public void a(xd xdVar, HashMap<String, Object> hashMap) {
        if (xdVar.c() > 1) {
            this.f3840b.put(xdVar.b(), Integer.valueOf(xdVar.c()));
        }
        a(1022, hashMap);
        a(new i(this, hashMap), xdVar.b(), xdVar.f(), new j(xdVar, hashMap), xdVar.e(), xdVar.c(), xdVar.d(), xdVar.a());
    }

    public void b(l lVar, String str) {
        m b8 = b(str);
        if (b8 != null) {
            y8 y8Var = b8.f3859e;
            y8Var.f3759e = "STATUS";
            y8Var.f3761g = "unstarted";
            c(b8);
        }
        MediaPlayer a8 = a(str);
        if (a8 != null) {
            LogUtil.b(f3838g, "mMediaPlayer stopPlay");
            x0.a(a8);
            e(str);
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
        ARPMessage.getInstance().sendMessage(ARPMessageType.MSG_TYPE_VIDEO_PLAY_INFO_UPDATE, hashMap);
    }

    public void b(l lVar, boolean z7) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap != null) {
            for (Map.Entry<String, m> entry : concurrentHashMap.entrySet()) {
                if (!z7 || (entry != null && entry.getValue() != null && entry.getValue().f3858d)) {
                    a(lVar, entry.getKey());
                }
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x003b -> B:21:0x003e). Please report as a decompilation issue!!! */
    public static void b(m mVar) {
        MediaPlayer mediaPlayer;
        if (mVar == null || (mediaPlayer = mVar.f3855a) == null) {
            return;
        }
        y8 y8Var = mVar.f3859e;
        String str = y8Var.f3761g;
        if (str == "playing" || str == "paused") {
            try {
                int duration = mediaPlayer.getDuration();
                y8Var.f3757c = duration;
                if (duration <= 0) {
                    y8Var.f3764j = 0.0f;
                } else {
                    y8Var.f3764j = (mVar.f3855a.getCurrentPosition() * 1.0f) / y8Var.f3757c;
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

    public void a(l lVar, String str) {
        if (ARPEngine.getInstance().isPaused()) {
            return;
        }
        MediaPlayer a8 = a(str);
        m b8 = b(str);
        if (b8 == null) {
            return;
        }
        String str2 = b8.f3859e.f3761g;
        if ((str2 == "paused" || str2 == "prepared") && a8 != null) {
            LogUtil.b(f3838g, "mMediaPlayer start");
            e();
            a8.start();
            y8 y8Var = b8.f3859e;
            y8Var.f3759e = "STATUS";
            y8Var.f3761g = "playing";
            c(b8);
        }
    }

    public final void a(l lVar, String str, String str2, int i8, MediaPlayer.OnCompletionListener onCompletionListener, boolean z7, String str3, long j8) {
        try {
            if (this.f3839a.containsKey(str)) {
                m mVar = this.f3839a.get(str);
                if (mVar == null) {
                    return;
                }
                MediaPlayer mediaPlayer = mVar.f3855a;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                    mVar.f3855a.setDataSource(str2);
                    mVar.f3855a.setLooping(z7);
                    mVar.f3855a.setOnCompletionListener(onCompletionListener);
                    mVar.f3855a.prepareAsync();
                }
            } else {
                m mVar2 = new m();
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mVar2.f3855a = mediaPlayer2;
                mediaPlayer2.setDataSource(str2);
                mVar2.f3857c = i8;
                mVar2.f3856b = new SurfaceTexture(i8);
                mVar2.f3859e.f3755a = Long.valueOf(str).longValue();
                mVar2.f3859e.f3756b = str3;
                mVar2.f3855a.setSurface(new Surface(mVar2.f3856b));
                mVar2.f3855a.setOnCompletionListener(onCompletionListener);
                mVar2.f3855a.setOnErrorListener(new d(this, mVar2));
                mVar2.f3855a.setLooping(z7);
                mVar2.f3855a.prepareAsync();
                LogUtil.b(f3838g, "wrapper.mMediaPlayer.prepareAsync()");
                mVar2.f3855a.setOnPreparedListener(new e(mVar2, j8));
                mVar2.f3855a.setOnBufferingUpdateListener(new f(this, mVar2));
                mVar2.f3855a.setOnInfoListener(new g(this, mVar2));
                ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
                if (concurrentHashMap != null && str != null) {
                    concurrentHashMap.put(str, mVar2);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(l lVar, String str, String str2, MediaPlayer.OnCompletionListener onCompletionListener, int i8, int i9, String str3, long j8) {
        a(lVar, str, str2, i8, onCompletionListener, false, str3, j8);
    }

    public void a(l lVar, String str, boolean z7) {
        MediaPlayer a8 = a(str);
        if (a8 != null) {
            try {
                if (a8.isPlaying()) {
                    m b8 = b(str);
                    if (b8 != null) {
                        y8 y8Var = b8.f3859e;
                        y8Var.f3759e = "STATUS";
                        y8Var.f3761g = "paused";
                        b8.f3858d = z7;
                        c(b8);
                    }
                    LogUtil.b(f3838g, "mMediaPlayer pause");
                    a8.pause();
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public void a(l lVar, boolean z7) {
        ConcurrentHashMap<String, m> concurrentHashMap = this.f3839a;
        if (concurrentHashMap != null) {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                a(lVar, it.next().getKey(), z7);
            }
        }
    }

    public void a(String str, int i8) {
        m mVar = this.f3839a.get(str);
        if (mVar != null) {
            mVar.f3856b = new SurfaceTexture(i8);
            try {
                mVar.f3855a.setSurface(new Surface(mVar.f3856b));
            } catch (Exception unused) {
                Log.i("VideoPlayerManager", "MediaPlayer setSurface failed.");
            }
            mVar.f3857c = i8;
        }
    }
}
