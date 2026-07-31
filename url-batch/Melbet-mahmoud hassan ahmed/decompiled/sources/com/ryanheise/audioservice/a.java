package com.ryanheise.audioservice;

import a5.a;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.d;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.a;
import e5.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m5.j;
import m5.k;
import m5.n;

/* loaded from: classes.dex */
public class a implements e5.a, f5.a {

    /* renamed from: l, reason: collision with root package name */
    private static String f15384l = "audio_service_engine";

    /* renamed from: n, reason: collision with root package name */
    private static d f15386n;

    /* renamed from: o, reason: collision with root package name */
    private static c f15387o;

    /* renamed from: q, reason: collision with root package name */
    private static k.d f15389q;

    /* renamed from: r, reason: collision with root package name */
    private static boolean f15390r;

    /* renamed from: s, reason: collision with root package name */
    private static MediaBrowserCompat f15391s;

    /* renamed from: t, reason: collision with root package name */
    private static MediaControllerCompat f15392t;

    /* renamed from: f, reason: collision with root package name */
    private Context f15394f;

    /* renamed from: g, reason: collision with root package name */
    private a.b f15395g;

    /* renamed from: h, reason: collision with root package name */
    private f5.c f15396h;

    /* renamed from: i, reason: collision with root package name */
    private n f15397i;

    /* renamed from: j, reason: collision with root package name */
    private d f15398j;

    /* renamed from: k, reason: collision with root package name */
    private final MediaBrowserCompat.c f15399k = new b();

    /* renamed from: m, reason: collision with root package name */
    private static final Set<d> f15385m = new HashSet();

    /* renamed from: p, reason: collision with root package name */
    private static final long f15388p = System.currentTimeMillis() - SystemClock.elapsedRealtime();

    /* renamed from: u, reason: collision with root package name */
    private static final MediaControllerCompat.a f15393u = new C0047a();

    /* renamed from: com.ryanheise.audioservice.a$a, reason: collision with other inner class name */
    class C0047a extends MediaControllerCompat.a {
        C0047a() {
        }
    }

    class b extends MediaBrowserCompat.c {
        b() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void a() {
            try {
                MediaControllerCompat unused = a.f15392t = new MediaControllerCompat(a.this.f15394f, a.f15391s.c());
                Activity activity = a.f15386n != null ? a.f15386n.f15413g : null;
                if (activity != null) {
                    MediaControllerCompat.f(activity, a.f15392t);
                }
                a.f15392t.d(a.f15393u);
                if (a.f15389q != null) {
                    a.f15389q.a(a.L(new Object[0]));
                    k.d unused2 = a.f15389q = null;
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                throw new RuntimeException(e7);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void b() {
            if (a.f15389q != null) {
                a.f15389q.b("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.", null, null);
            } else {
                a.this.f15398j.f(true);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c
        public void c() {
            System.out.println("### UNHANDLED: onConnectionSuspended");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c implements k.c, AudioService.e {

        /* renamed from: f, reason: collision with root package name */
        public m5.c f15401f;

        /* renamed from: g, reason: collision with root package name */
        public k f15402g;

        /* renamed from: h, reason: collision with root package name */
        private AudioTrack f15403h;

        /* renamed from: i, reason: collision with root package name */
        private final Handler f15404i = new Handler(Looper.getMainLooper());

        /* renamed from: j, reason: collision with root package name */
        private List<e> f15405j = new LinkedList();

        /* renamed from: com.ryanheise.audioservice.a$c$a, reason: collision with other inner class name */
        class C0048a implements k.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.m f15406a;

            C0048a(d.m mVar) {
                this.f15406a = mVar;
            }

            @Override // m5.k.d
            public void a(Object obj) {
                List list = (List) ((Map) obj).get("children");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.S((Map) it.next()));
                }
                this.f15406a.g(arrayList);
            }

            @Override // m5.k.d
            public void b(String str, String str2, Object obj) {
                this.f15406a.f(new Bundle());
            }

            @Override // m5.k.d
            public void c() {
                this.f15406a.f(new Bundle());
            }
        }

        class b implements k.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.m f15408a;

            b(d.m mVar) {
                this.f15408a = mVar;
            }

            @Override // m5.k.d
            public void a(Object obj) {
                Map map = (Map) ((Map) obj).get("mediaItem");
                if (map == null) {
                    this.f15408a.g(null);
                } else {
                    this.f15408a.g(a.S(map));
                }
            }

            @Override // m5.k.d
            public void b(String str, String str2, Object obj) {
                this.f15408a.f(new Bundle());
            }

            @Override // m5.k.d
            public void c() {
                this.f15408a.f(new Bundle());
            }
        }

        /* renamed from: com.ryanheise.audioservice.a$c$c, reason: collision with other inner class name */
        class C0049c implements k.d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d.m f15410a;

            C0049c(d.m mVar) {
                this.f15410a = mVar;
            }

            @Override // m5.k.d
            public void a(Object obj) {
                List list = (List) ((Map) obj).get("mediaItems");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a.S((Map) it.next()));
                }
                this.f15410a.g(arrayList);
            }

            @Override // m5.k.d
            public void b(String str, String str2, Object obj) {
                this.f15410a.f(new Bundle());
            }

            @Override // m5.k.d
            public void c() {
                this.f15410a.f(new Bundle());
            }
        }

        public c(m5.c cVar) {
            this.f15401f = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f15402g = kVar;
            kVar.e(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void P() {
            AudioTrack audioTrack = this.f15403h;
            if (audioTrack != null) {
                audioTrack.release();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void U(k.d dVar, Exception exc) {
            dVar.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void V(Map map, final k.d dVar) {
            try {
                AudioService.G.V(a.E((Map) map.get("mediaItem")));
                this.f15404i.post(new Runnable() { // from class: com.ryanheise.audioservice.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d.this.a(null);
                    }
                });
            } catch (Exception e7) {
                this.f15404i.post(new Runnable() { // from class: com.ryanheise.audioservice.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.U(k.d.this, e7);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void X(k.d dVar, Exception exc) {
            dVar.b("UNEXPECTED_ERROR", "Unexpected error", Log.getStackTraceString(exc));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void Y(Map map, final k.d dVar) {
            try {
                AudioService.G.X(a.Q((List) map.get("queue")));
                this.f15404i.post(new Runnable() { // from class: com.ryanheise.audioservice.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.d.this.a(null);
                    }
                });
            } catch (Exception e7) {
                this.f15404i.post(new Runnable() { // from class: com.ryanheise.audioservice.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.c.X(k.d.this, e7);
                    }
                });
            }
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void A(String str, Bundle bundle) {
            Q("customAction", a.L("name", str, "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void B(String str, Bundle bundle) {
            Q("prepareFromSearch", a.L("query", str, "extras", a.C(bundle)));
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // m5.k.c
        public void C(j jVar, final k.d dVar) {
            ExecutorService newSingleThreadExecutor;
            Runnable runnable;
            int[] iArr;
            final Map map = (Map) jVar.f19248b;
            String str = jVar.f19247a;
            str.hashCode();
            int i7 = 1;
            char c7 = 65535;
            switch (str.hashCode()) {
                case -615448875:
                    if (str.equals("setMediaItem")) {
                        c7 = 0;
                        break;
                    }
                    break;
                case -3300612:
                    if (str.equals("androidForceEnableMediaButtons")) {
                        c7 = 1;
                        break;
                    }
                    break;
                case 534585782:
                    if (str.equals("setAndroidPlaybackInfo")) {
                        c7 = 2;
                        break;
                    }
                    break;
                case 699379795:
                    if (str.equals("stopService")) {
                        c7 = 3;
                        break;
                    }
                    break;
                case 1402657231:
                    if (str.equals("setQueue")) {
                        c7 = 4;
                        break;
                    }
                    break;
                case 1404470607:
                    if (str.equals("setState")) {
                        c7 = 5;
                        break;
                    }
                    break;
                case 1742026028:
                    if (str.equals("notifyChildrenChanged")) {
                        c7 = 6;
                        break;
                    }
                    break;
            }
            Object obj = null;
            switch (c7) {
                case 0:
                    newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    runnable = new Runnable() { // from class: com.ryanheise.audioservice.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.c.this.V(map, dVar);
                        }
                    };
                    newSingleThreadExecutor.execute(runnable);
                    break;
                case 1:
                    if (this.f15403h == null) {
                        AudioTrack audioTrack = new AudioTrack(3, 44100, 2, 3, 2048, 0);
                        this.f15403h = audioTrack;
                        audioTrack.write(new byte[2048], 0, 2048);
                    }
                    this.f15403h.reloadStaticData();
                    this.f15403h.play();
                    obj = null;
                    dVar.a(obj);
                    break;
                case 2:
                    Map map2 = (Map) map.get("playbackInfo");
                    AudioService.G.W(((Integer) map2.get("playbackType")).intValue(), (Integer) map2.get("volumeControlType"), (Integer) map2.get("maxVolume"), (Integer) map2.get("volume"));
                    break;
                case 3:
                    AudioService audioService = AudioService.G;
                    if (audioService != null) {
                        audioService.Z();
                    }
                    obj = null;
                    dVar.a(obj);
                    break;
                case 4:
                    newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                    runnable = new Runnable() { // from class: com.ryanheise.audioservice.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            a.c.this.Y(map, dVar);
                        }
                    };
                    newSingleThreadExecutor.execute(runnable);
                    break;
                case 5:
                    Map map3 = (Map) map.get("state");
                    s4.a aVar = s4.a.values()[((Integer) map3.get("processingState")).intValue()];
                    boolean booleanValue = ((Boolean) map3.get("playing")).booleanValue();
                    List<Map> list = (List) map3.get("controls");
                    List list2 = (List) map3.get("androidCompactActionIndices");
                    List list3 = (List) map3.get("systemActions");
                    long longValue = a.J(map3.get("updatePosition")).longValue();
                    long longValue2 = a.J(map3.get("bufferedPosition")).longValue();
                    float doubleValue = (float) ((Double) map3.get("speed")).doubleValue();
                    long currentTimeMillis = map3.get("updateTime") == null ? System.currentTimeMillis() : a.J(map3.get("updateTime")).longValue();
                    Integer num = (Integer) map3.get("errorCode");
                    String str2 = (String) map3.get("errorMessage");
                    int intValue = ((Integer) map3.get("repeatMode")).intValue();
                    int intValue2 = ((Integer) map3.get("shuffleMode")).intValue();
                    Long J = a.J(map3.get("queueIndex"));
                    boolean booleanValue2 = ((Boolean) map3.get("captioningEnabled")).booleanValue();
                    long j7 = currentTimeMillis - a.f15388p;
                    ArrayList arrayList = new ArrayList();
                    long j8 = 0;
                    for (Map map4 : list) {
                        String str3 = (String) map4.get("androidIcon");
                        String str4 = (String) map4.get("label");
                        long intValue3 = i7 << ((Integer) map4.get("action")).intValue();
                        j8 |= intValue3;
                        arrayList.add(new s4.f(str3, str4, intValue3));
                        i7 = 1;
                    }
                    while (list3.iterator().hasNext()) {
                        j8 |= 1 << ((Integer) r1.next()).intValue();
                    }
                    if (list2 != null) {
                        int min = Math.min(3, list2.size());
                        iArr = new int[min];
                        for (int i8 = 0; i8 < min; i8++) {
                            iArr[i8] = ((Integer) list2.get(i8)).intValue();
                        }
                    } else {
                        iArr = null;
                    }
                    AudioService.G.Y(arrayList, j8, iArr, aVar, booleanValue, longValue, longValue2, doubleValue, j7, num, str2, intValue, intValue2, booleanValue2, J);
                    obj = null;
                    dVar.a(obj);
                    break;
                case 6:
                    AudioService.G.d((String) map.get("parentMediaId"), a.M((Map) map.get("options")));
                    dVar.a(obj);
                    break;
            }
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void D(long j7) {
            Q("skipToQueueItem", a.L("index", Long.valueOf(j7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void E(int i7) {
            Q("androidAdjustRemoteVolume", a.L("direction", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void F(Uri uri, Bundle bundle) {
            Q("playFromUri", a.L("uri", uri.toString(), "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void G(RatingCompat ratingCompat, Bundle bundle) {
            Q("setRating", a.L("rating", a.P(ratingCompat), "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void H() {
            Q("onNotificationDeleted", a.L(new Object[0]));
        }

        public void Q(String str, Object obj) {
            R(str, obj, null);
        }

        public void R(String str, Object obj, k.d dVar) {
            if (a.f15390r) {
                this.f15402g.d(str, obj, dVar);
            } else {
                this.f15405j.add(new e(str, obj, dVar));
            }
        }

        public void S() {
            for (e eVar : this.f15405j) {
                this.f15402g.d(eVar.f15418a, eVar.f15419b, eVar.f15420c);
            }
            this.f15405j.clear();
        }

        public void Z(m5.c cVar) {
            this.f15402g.e(null);
            this.f15401f = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.handler.methods");
            this.f15402g = kVar;
            kVar.e(this);
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void a(int i7) {
            Q("setRepeatMode", a.L("repeatMode", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void b(int i7) {
            Q("setShuffleMode", a.L("shuffleMode", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void c() {
            Q("play", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void d(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
            if (a.f15387o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("query", str);
                hashMap.put("extras", a.C(bundle));
                a.f15387o.R("search", hashMap, new C0049c(mVar));
            }
            mVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void e(boolean z6) {
            Q("setCaptioningEnabled", a.L("enabled", Boolean.valueOf(z6)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void f() {
            Q("stop", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void g(String str, Bundle bundle) {
            Q("prepareFromMediaId", a.L("mediaId", str, "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void h(String str, d.m<MediaBrowserCompat.MediaItem> mVar) {
            if (a.f15387o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("mediaId", str);
                a.f15387o.R("getMediaItem", hashMap, new b(mVar));
            }
            mVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void i() {
            Q("skipToPrevious", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void j(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
            if (a.f15387o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("parentMediaId", str);
                hashMap.put("options", a.C(bundle));
                a.f15387o.R("getChildren", hashMap, new C0048a(mVar));
            }
            mVar.a();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void k() {
            Q("skipToNext", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void l(MediaMetadataCompat mediaMetadataCompat) {
            Q("removeQueueItem", a.L("mediaItem", a.N(mediaMetadataCompat)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void m(float f7) {
            Q("setSpeed", a.L("speed", Float.valueOf(f7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void n(s4.e eVar) {
            Q("click", a.L("button", Integer.valueOf(eVar.ordinal())));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void o() {
            Q("prepare", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void onDestroy() {
            a.G();
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void onPause() {
            Q("pause", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void p(Uri uri, Bundle bundle) {
            Q("prepareFromUri", a.L("uri", uri.toString(), "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void q() {
            Q("rewind", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void r(RatingCompat ratingCompat) {
            Q("setRating", a.L("rating", a.P(ratingCompat), "extras", null));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void s(String str, Bundle bundle) {
            Q("playFromSearch", a.L("query", str, "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void t(MediaMetadataCompat mediaMetadataCompat, int i7) {
            Q("insertQueueItem", a.L("mediaItem", a.N(mediaMetadataCompat), "index", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void u(int i7) {
            Q("androidSetRemoteVolume", a.L("volumeIndex", Integer.valueOf(i7)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void v() {
            Q("onTaskRemoved", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void w(String str, Bundle bundle) {
            Q("playFromMediaId", a.L("mediaId", str, "extras", a.C(bundle)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void x() {
            Q("fastForward", a.L(new Object[0]));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void y(long j7) {
            Q("seek", a.L("position", Long.valueOf(j7 * 1000)));
        }

        @Override // com.ryanheise.audioservice.AudioService.e
        public void z(MediaMetadataCompat mediaMetadataCompat) {
            Q("addQueueItem", a.L("mediaItem", a.N(mediaMetadataCompat)));
        }
    }

    private static class d implements k.c {

        /* renamed from: f, reason: collision with root package name */
        private Context f15412f;

        /* renamed from: g, reason: collision with root package name */
        private Activity f15413g;

        /* renamed from: h, reason: collision with root package name */
        public final m5.c f15414h;

        /* renamed from: i, reason: collision with root package name */
        private final k f15415i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f15416j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f15417k;

        public d(m5.c cVar) {
            this.f15414h = cVar;
            k kVar = new k(cVar, "com.ryanheise.audio_service.client.methods");
            this.f15415i = kVar;
            kVar.e(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Activity activity) {
            this.f15413g = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Context context) {
            this.f15412f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0027 A[Catch: Exception -> 0x016c, TryCatch #0 {Exception -> 0x016c, blocks: (B:3:0x0006, B:5:0x000a, B:13:0x0027, B:15:0x002b, B:18:0x00a2, B:20:0x00d0, B:21:0x00dc, B:23:0x00e4, B:24:0x00ee, B:26:0x00ff, B:27:0x0109, B:29:0x0110, B:30:0x0113, B:32:0x011c, B:33:0x0148, B:35:0x014e, B:37:0x0158, B:39:0x012e, B:41:0x0138, B:42:0x0141, B:44:0x0096, B:45:0x015c, B:46:0x0163, B:47:0x0018, B:50:0x0164, B:51:0x016b), top: B:2:0x0006 }] */
        @Override // m5.k.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void C(j jVar, k.d dVar) {
            char c7;
            try {
                if (this.f15416j) {
                    throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
                }
                String str = jVar.f19247a;
                if (str.hashCode() == -804429082 && str.equals("configure")) {
                    c7 = 0;
                    if (c7 == 0) {
                        return;
                    }
                    if (this.f15417k) {
                        throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                    }
                    boolean unused = a.f15390r = true;
                    Map map = (Map) ((Map) jVar.f19248b).get("config");
                    s4.c cVar = new s4.c(this.f15412f.getApplicationContext());
                    cVar.f21628i = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                    cVar.f21629j = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                    cVar.f21621b = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                    cVar.f21622c = (String) map.get("androidNotificationChannelId");
                    cVar.f21623d = (String) map.get("androidNotificationChannelName");
                    cVar.f21624e = (String) map.get("androidNotificationChannelDescription");
                    cVar.f21625f = map.get("notificationColor") == null ? -1 : a.I(map.get("notificationColor")).intValue();
                    cVar.f21626g = (String) map.get("androidNotificationIcon");
                    cVar.f21627h = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                    cVar.f21630k = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                    cVar.f21631l = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                    cVar.f21632m = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                    cVar.c((Map) map.get("androidBrowsableRootExtras"));
                    Activity activity = this.f15413g;
                    if (activity != null) {
                        cVar.f21633n = activity.getClass().getName();
                    }
                    cVar.b();
                    AudioService audioService = AudioService.G;
                    if (audioService != null) {
                        audioService.A(cVar);
                    }
                    d unused2 = a.f15386n = this;
                    if (a.f15387o == null) {
                        c unused3 = a.f15387o = new c(this.f15414h);
                        AudioService.O(a.f15387o);
                    } else {
                        if (a.f15387o.f15401f != this.f15414h) {
                            a.f15387o.Z(this.f15414h);
                        }
                        a.f15387o.S();
                    }
                    if (a.f15392t != null) {
                        dVar.a(a.L(new Object[0]));
                        return;
                    } else {
                        k.d unused4 = a.f15389q = dVar;
                        return;
                    }
                }
                c7 = 65535;
                if (c7 == 0) {
                }
            } catch (Exception e7) {
                e7.printStackTrace();
                dVar.b(e7.getMessage(), null, null);
            }
        }

        public void f(boolean z6) {
            this.f15417k = z6;
        }

        public void g(boolean z6) {
            this.f15416j = z6;
        }

        protected boolean h() {
            return (this.f15413g.getIntent().getFlags() & 1048576) == 1048576;
        }
    }

    static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f15418a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f15419b;

        /* renamed from: c, reason: collision with root package name */
        public final k.d f15420c;

        public e(String str, Object obj, k.d dVar) {
            this.f15418a = str;
            this.f15419b = obj;
            this.f15420c = dVar;
        }
    }

    private static MediaDescriptionCompat B(MediaDescriptionCompat mediaDescriptionCompat, Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = new Bundle();
        if (mediaDescriptionCompat.g() != null) {
            bundle.putAll(mediaDescriptionCompat.g());
        }
        bundle.putAll(M(map));
        return new MediaDescriptionCompat.d().i(mediaDescriptionCompat.n()).h(mediaDescriptionCompat.m()).b(mediaDescriptionCompat.c()).d(mediaDescriptionCompat.h()).e(mediaDescriptionCompat.i()).f(mediaDescriptionCompat.k()).g(mediaDescriptionCompat.l()).c(bundle).a();
    }

    static Map<String, Object> C(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            Serializable serializable = bundle.getSerializable(str);
            if (serializable != null) {
                hashMap.put(str, serializable);
            }
        }
        return hashMap;
    }

    private void D() {
        if (f15391s == null) {
            MediaBrowserCompat mediaBrowserCompat = new MediaBrowserCompat(this.f15394f, new ComponentName(this.f15394f, (Class<?>) AudioService.class), this.f15399k, null);
            f15391s = mediaBrowserCompat;
            mediaBrowserCompat.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadataCompat E(Map<?, ?> map) {
        return AudioService.G.D((String) map.get("id"), (String) map.get("title"), (String) map.get("album"), (String) map.get("artist"), (String) map.get("genre"), J(map.get("duration")), (String) map.get("artUri"), (Boolean) map.get("playable"), (String) map.get("displayTitle"), (String) map.get("displaySubtitle"), (String) map.get("displayDescription"), R((Map) map.get("rating")), (Map) map.get("extras"));
    }

    private void F() {
        d dVar = f15386n;
        Activity activity = dVar != null ? dVar.f15413g : null;
        if (activity != null) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        MediaControllerCompat mediaControllerCompat = f15392t;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.g(f15393u);
            f15392t = null;
        }
        MediaBrowserCompat mediaBrowserCompat = f15391s;
        if (mediaBrowserCompat != null) {
            mediaBrowserCompat.b();
            f15391s = null;
        }
    }

    public static synchronized void G() {
        synchronized (a.class) {
            Iterator<d> it = f15385m.iterator();
            while (it.hasNext()) {
                if (it.next().f15413g != null) {
                    return;
                }
            }
            io.flutter.embedding.engine.a a7 = io.flutter.embedding.engine.b.b().a(f15384l);
            if (a7 != null) {
                a7.f();
                io.flutter.embedding.engine.b.b().d(f15384l);
            }
        }
    }

    public static synchronized io.flutter.embedding.engine.a H(Context context) {
        io.flutter.embedding.engine.a a7;
        io.flutter.embedding.android.d dVar;
        Uri data;
        synchronized (a.class) {
            a7 = io.flutter.embedding.engine.b.b().a(f15384l);
            if (a7 == null) {
                a7 = new io.flutter.embedding.engine.a(context.getApplicationContext());
                String str = null;
                if ((context instanceof io.flutter.embedding.android.d) && (str = (dVar = (io.flutter.embedding.android.d) context).g()) == null && dVar.v() && (data = dVar.getIntent().getData()) != null) {
                    str = data.getPath();
                    if (data.getQuery() != null && !data.getQuery().isEmpty()) {
                        str = str + "?" + data.getQuery();
                    }
                }
                if (str == null) {
                    str = "/";
                }
                a7.m().c(str);
                a7.i().j(a.b.a());
                io.flutter.embedding.engine.b.b().c(f15384l, a7);
            }
        }
        return a7;
    }

    public static Integer I(Object obj) {
        return (obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue());
    }

    public static Long J(Object obj) {
        return (obj == null || (obj instanceof Long)) ? (Long) obj : Long.valueOf(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean K(Intent intent) {
        this.f15398j.f15413g.setIntent(intent);
        U();
        return true;
    }

    static Map<String, Object> L(Object... objArr) {
        HashMap hashMap = new HashMap();
        for (int i7 = 0; i7 < objArr.length; i7 += 2) {
            hashMap.put((String) objArr[i7], objArr[i7 + 1]);
        }
        return hashMap;
    }

    static Bundle M(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator<?> it = map.keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<?, ?> N(MediaMetadataCompat mediaMetadataCompat) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaDescriptionCompat i7 = mediaMetadataCompat.i();
        HashMap hashMap = new HashMap();
        hashMap.put("id", i7.k());
        hashMap.put("title", O(mediaMetadataCompat, "android.media.metadata.TITLE"));
        hashMap.put("album", O(mediaMetadataCompat, "android.media.metadata.ALBUM"));
        if (i7.i() != null) {
            hashMap.put("artUri", i7.i().toString());
        }
        hashMap.put("artist", O(mediaMetadataCompat, "android.media.metadata.ARTIST"));
        hashMap.put("genre", O(mediaMetadataCompat, "android.media.metadata.GENRE"));
        if (mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            hashMap.put("duration", Long.valueOf(mediaMetadataCompat.j("android.media.metadata.DURATION")));
        }
        hashMap.put("playable", Boolean.valueOf(mediaMetadataCompat.j("playable_long") != 0));
        hashMap.put("displayTitle", O(mediaMetadataCompat, "android.media.metadata.DISPLAY_TITLE"));
        hashMap.put("displaySubtitle", O(mediaMetadataCompat, "android.media.metadata.DISPLAY_SUBTITLE"));
        hashMap.put("displayDescription", O(mediaMetadataCompat, "android.media.metadata.DISPLAY_DESCRIPTION"));
        if (mediaMetadataCompat.a("android.media.metadata.RATING")) {
            hashMap.put("rating", P(mediaMetadataCompat.l("android.media.metadata.RATING")));
        }
        Map<String, Object> C = C(mediaMetadataCompat.h());
        if (C.size() > 0) {
            hashMap.put("extras", C);
        }
        return hashMap;
    }

    private static String O(MediaMetadataCompat mediaMetadataCompat, String str) {
        CharSequence n7 = mediaMetadataCompat.n(str);
        if (n7 != null) {
            return n7.toString();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static HashMap<String, Object> P(RatingCompat ratingCompat) {
        boolean j7;
        Object valueOf;
        float i7;
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("type", Integer.valueOf(ratingCompat.h()));
        if (ratingCompat.k()) {
            switch (ratingCompat.h()) {
                case 1:
                    j7 = ratingCompat.j();
                    valueOf = Boolean.valueOf(j7);
                    hashMap.put("value", valueOf);
                    break;
                case 2:
                    j7 = ratingCompat.l();
                    valueOf = Boolean.valueOf(j7);
                    hashMap.put("value", valueOf);
                    break;
                case 3:
                case 4:
                case 5:
                    i7 = ratingCompat.i();
                    valueOf = Float.valueOf(i7);
                    hashMap.put("value", valueOf);
                    break;
                case 6:
                    i7 = ratingCompat.c();
                    valueOf = Float.valueOf(i7);
                    hashMap.put("value", valueOf);
                    break;
            }
        }
        hashMap.put("value", null);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MediaSessionCompat.QueueItem> Q(List<Map<?, ?>> list) {
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        for (Map<?, ?> map : list) {
            arrayList.add(new MediaSessionCompat.QueueItem(B(E(map).i(), (Map) map.get("extras")), i7));
            i7++;
        }
        return arrayList;
    }

    private static RatingCompat R(Map<?, ?> map) {
        if (map == null) {
            return null;
        }
        Integer num = (Integer) map.get("type");
        Object obj = map.get("value");
        if (obj == null) {
            return RatingCompat.q(num.intValue());
        }
        switch (num.intValue()) {
            case 1:
                return RatingCompat.m(((Boolean) obj).booleanValue());
            case 2:
                return RatingCompat.p(((Boolean) obj).booleanValue());
            case 3:
            case 4:
            case 5:
                return RatingCompat.o(num.intValue(), ((Integer) obj).intValue());
            case 6:
                return RatingCompat.n(((Double) obj).floatValue());
            default:
                return RatingCompat.q(num.intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaBrowserCompat.MediaItem S(Map<?, ?> map) {
        return new MediaBrowserCompat.MediaItem(B(E(map).i(), (Map) map.get("extras")), ((Boolean) map.get("playable")).booleanValue() ? 2 : 1);
    }

    private void T() {
        f5.c cVar = this.f15396h;
        n nVar = new n() { // from class: s4.d
            @Override // m5.n
            public final boolean c(Intent intent) {
                boolean K;
                K = com.ryanheise.audioservice.a.this.K(intent);
                return K;
            }
        };
        this.f15397i = nVar;
        cVar.f(nVar);
    }

    private void U() {
        Activity activity = this.f15398j.f15413g;
        if (activity.getIntent().getAction() != null) {
            f15387o.Q("onNotificationClicked", L("clicked", Boolean.valueOf(activity.getIntent().getAction().equals("com.ryanheise.audioservice.NOTIFICATION_CLICK"))));
        }
    }

    @Override // f5.a
    public void a(f5.c cVar) {
        this.f15396h = cVar;
        this.f15398j.d(cVar.d());
        this.f15398j.e(cVar.d());
        T();
    }

    @Override // f5.a
    public void b(f5.c cVar) {
        this.f15396h = cVar;
        this.f15398j.d(cVar.d());
        this.f15398j.e(cVar.d());
        this.f15398j.g(this.f15395g.b() != H(cVar.d()).i());
        f15386n = this.f15398j;
        T();
        if (f15392t != null) {
            MediaControllerCompat.f(f15386n.f15413g, f15392t);
        }
        if (f15391s == null) {
            D();
        }
        Activity activity = f15386n.f15413g;
        if (this.f15398j.h()) {
            activity.setIntent(new Intent("android.intent.action.MAIN"));
        }
        U();
    }

    @Override // f5.a
    public void c() {
        this.f15396h.e(this.f15397i);
        this.f15396h = null;
        this.f15397i = null;
        this.f15398j.d(null);
        this.f15398j.e(this.f15395g.a());
        if (f15385m.size() == 1) {
            F();
        }
        if (this.f15398j == f15386n) {
            f15386n = null;
        }
    }

    @Override // f5.a
    public void e() {
        this.f15396h.e(this.f15397i);
        this.f15396h = null;
        this.f15398j.d(null);
        this.f15398j.e(this.f15395g.a());
    }

    @Override // e5.a
    public void f(a.b bVar) {
        this.f15395g = bVar;
        d dVar = new d(bVar.b());
        this.f15398j = dVar;
        dVar.e(this.f15395g.a());
        f15385m.add(this.f15398j);
        if (this.f15394f == null) {
            this.f15394f = this.f15395g.a();
        }
        if (f15387o == null) {
            c cVar = new c(this.f15395g.b());
            f15387o = cVar;
            AudioService.O(cVar);
        }
        if (f15391s == null) {
            D();
        }
    }

    @Override // e5.a
    public void i(a.b bVar) {
        Set<d> set = f15385m;
        if (set.size() == 1) {
            F();
        }
        set.remove(this.f15398j);
        this.f15398j.e(null);
        this.f15398j = null;
        this.f15394f = null;
        c cVar = f15387o;
        if (cVar != null && cVar.f15401f == this.f15395g.b()) {
            System.out.println("### destroying audio handler interface");
            f15387o.P();
            f15387o = null;
        }
        this.f15395g = null;
    }
}
