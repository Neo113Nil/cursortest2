package com.ryanheise.audioservice;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import android.util.Size;
import android.view.KeyEvent;
import androidx.media.d;
import androidx.media.l;
import com.ryanheise.audioservice.AudioService;
import j.e;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AudioService extends androidx.media.d {
    static AudioService G;
    private static PendingIntent H;
    private static e I;
    private static List<MediaSessionCompat.QueueItem> J = new ArrayList();
    private static final Map<String, MediaMetadataCompat> K = new HashMap();
    private int B;
    private int C;
    private boolean D;
    private l F;

    /* renamed from: n, reason: collision with root package name */
    private io.flutter.embedding.engine.a f15367n;

    /* renamed from: o, reason: collision with root package name */
    private s4.c f15368o;

    /* renamed from: p, reason: collision with root package name */
    private PowerManager.WakeLock f15369p;

    /* renamed from: q, reason: collision with root package name */
    private MediaSessionCompat f15370q;

    /* renamed from: r, reason: collision with root package name */
    private d f15371r;

    /* renamed from: u, reason: collision with root package name */
    private int[] f15374u;

    /* renamed from: v, reason: collision with root package name */
    private MediaMetadataCompat f15375v;

    /* renamed from: w, reason: collision with root package name */
    private Bitmap f15376w;

    /* renamed from: x, reason: collision with root package name */
    private String f15377x;

    /* renamed from: y, reason: collision with root package name */
    private LruCache<String, Bitmap> f15378y;

    /* renamed from: s, reason: collision with root package name */
    private List<s4.f> f15372s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private List<e.a> f15373t = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    private boolean f15379z = false;
    private s4.a A = s4.a.idle;
    private final Handler E = new Handler(Looper.getMainLooper());

    class a extends LruCache<String, Bitmap> {
        a(int i7) {
            super(i7);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount() / 1024;
        }
    }

    class b extends l {
        b(int i7, int i8, int i9) {
            super(i7, i8, i9);
        }

        @Override // androidx.media.l
        public void e(int i7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.E(i7);
        }

        @Override // androidx.media.l
        public void f(int i7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.u(i7);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15382a;

        static {
            int[] iArr = new int[s4.a.values().length];
            f15382a = iArr;
            try {
                iArr[s4.a.idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15382a[s4.a.loading.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15382a[s4.a.buffering.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15382a[s4.a.ready.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15382a[s4.a.completed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15382a[s4.a.error.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public class d extends MediaSessionCompat.b {
        public d() {
        }

        private s4.e E(KeyEvent keyEvent) {
            int keyCode = keyEvent.getKeyCode();
            return (keyCode == 79 || keyCode == 85) ? s4.e.media : keyCode != 87 ? keyCode != 88 ? s4.e.media : s4.e.previous : s4.e.next;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void A() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.i();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void B(long j7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.D(j7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void C() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.f();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.z(AudioService.I(mediaDescriptionCompat.k()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.t(AudioService.I(mediaDescriptionCompat.k()), i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void e(String str, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.A(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void f() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.x();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public boolean g(Intent intent) {
            if (AudioService.I == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getExtras().getParcelable("android.intent.extra.KEY_EVENT");
            if (keyEvent.getAction() != 0) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79) {
                if (keyCode == 130) {
                    h();
                    return true;
                }
                if (keyCode != 126 && keyCode != 127) {
                    switch (keyCode) {
                        case 85:
                        case 87:
                        case 88:
                            break;
                        case 86:
                            C();
                            return true;
                        case 89:
                            r();
                            return true;
                        case 90:
                            f();
                            return true;
                        case 91:
                            i();
                            return true;
                        default:
                            return true;
                    }
                }
            }
            AudioService.I.n(E(keyEvent));
            return true;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void h() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.onPause();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void i() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.c();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void j(String str, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.w(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void k(String str, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.s(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void l(Uri uri, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.F(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void m() {
            if (AudioService.I == null) {
                return;
            }
            if (!AudioService.this.f15370q.e()) {
                AudioService.this.f15370q.g(true);
            }
            AudioService.I.o();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void n(String str, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            if (!AudioService.this.f15370q.e()) {
                AudioService.this.f15370q.g(true);
            }
            AudioService.I.g(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void o(String str, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            if (!AudioService.this.f15370q.e()) {
                AudioService.this.f15370q.g(true);
            }
            AudioService.I.B(str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void p(Uri uri, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            if (!AudioService.this.f15370q.e()) {
                AudioService.this.f15370q.g(true);
            }
            AudioService.I.p(uri, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.l(AudioService.I(mediaDescriptionCompat.k()));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void r() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.q();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void s(long j7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.y(j7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void t(boolean z6) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.e(z6);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void u(float f7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.m(f7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void v(RatingCompat ratingCompat) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.r(ratingCompat);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void w(RatingCompat ratingCompat, Bundle bundle) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.G(ratingCompat, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void x(int i7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.a(i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void y(int i7) {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.b(i7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public void z() {
            if (AudioService.I == null) {
                return;
            }
            AudioService.I.k();
        }
    }

    public interface e {
        void A(String str, Bundle bundle);

        void B(String str, Bundle bundle);

        void D(long j7);

        void E(int i7);

        void F(Uri uri, Bundle bundle);

        void G(RatingCompat ratingCompat, Bundle bundle);

        void H();

        void a(int i7);

        void b(int i7);

        void c();

        void d(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar);

        void e(boolean z6);

        void f();

        void g(String str, Bundle bundle);

        void h(String str, d.m<MediaBrowserCompat.MediaItem> mVar);

        void i();

        void j(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle);

        void k();

        void l(MediaMetadataCompat mediaMetadataCompat);

        void m(float f7);

        void n(s4.e eVar);

        void o();

        void onDestroy();

        void onPause();

        void p(Uri uri, Bundle bundle);

        void q();

        void r(RatingCompat ratingCompat);

        void s(String str, Bundle bundle);

        void t(MediaMetadataCompat mediaMetadataCompat, int i7);

        void u(int i7);

        void v();

        void w(String str, Bundle bundle);

        void x();

        void y(long j7);

        void z(MediaMetadataCompat mediaMetadataCompat);
    }

    private void C() {
        NotificationManager K2 = K();
        if (K2.getNotificationChannel(this.f15377x) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(this.f15377x, this.f15368o.f21623d, 2);
            notificationChannel.setShowBadge(this.f15368o.f21627h);
            String str = this.f15368o.f21624e;
            if (str != null) {
                notificationChannel.setDescription(str);
            }
            K2.createNotificationChannel(notificationChannel);
        }
    }

    private void E() {
        if (this.f15370q.e()) {
            this.f15370q.g(false);
        }
        K().cancel(1124);
    }

    private void F() {
        androidx.core.content.a.e(this, new Intent(this, (Class<?>) AudioService.class));
        if (!this.f15370q.e()) {
            this.f15370q.g(true);
        }
        v();
        this.f15370q.s(H);
        P();
    }

    private void G() {
        Q(false);
        U();
    }

    private void H() {
        if (this.f15368o.f21630k) {
            G();
        }
    }

    static MediaMetadataCompat I(String str) {
        return K.get(str);
    }

    private e.d J() {
        if (Build.VERSION.SDK_INT >= 26) {
            C();
        }
        e.d p7 = new e.d(this, this.f15377x).A(1).v(false).p(w());
        p7.w(M(this.f15368o.f21626g));
        return p7;
    }

    private NotificationManager K() {
        return (NotificationManager) getSystemService("notification");
    }

    public static void O(e eVar) {
        I = eVar;
    }

    private void P() {
        startForeground(1124, y());
        this.D = true;
    }

    private void Q(boolean z6) {
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(z6 ? 1 : 0);
        } else {
            stopForeground(z6);
        }
    }

    private MediaMetadataCompat S(MediaMetadataCompat mediaMetadataCompat) {
        return new MediaMetadataCompat.b(mediaMetadataCompat).b("android.media.metadata.ALBUM_ART", this.f15376w).b("android.media.metadata.DISPLAY_ICON", this.f15376w).a();
    }

    private void T() {
        if (this.f15370q == null) {
            return;
        }
        E();
        this.f15370q.f();
        this.f15370q = null;
    }

    private void U() {
        if (this.f15369p.isHeld()) {
            this.f15369p.release();
        }
    }

    public static int a0(long j7) {
        if (j7 == 4) {
            return 91;
        }
        if (j7 == 2) {
            return 130;
        }
        return PlaybackStateCompat.l(j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        if (this.D) {
            K().notify(1124, y());
        }
    }

    private void v() {
        if (this.f15369p.isHeld()) {
            return;
        }
        this.f15369p.acquire();
    }

    private Notification y() {
        int[] iArr = this.f15374u;
        if (iArr == null) {
            int min = Math.min(3, this.f15372s.size());
            int[] iArr2 = new int[min];
            for (int i7 = 0; i7 < min; i7++) {
                iArr2[i7] = i7;
            }
            iArr = iArr2;
        }
        e.d J2 = J();
        MediaMetadataCompat mediaMetadataCompat = this.f15375v;
        if (mediaMetadataCompat != null) {
            MediaDescriptionCompat i8 = mediaMetadataCompat.i();
            if (i8.n() != null) {
                J2.o(i8.n());
            }
            if (i8.m() != null) {
                J2.n(i8.m());
            }
            if (i8.c() != null) {
                J2.y(i8.c());
            }
            synchronized (this) {
                Bitmap bitmap = this.f15376w;
                if (bitmap != null) {
                    J2.r(bitmap);
                }
            }
        }
        if (this.f15368o.f21628i) {
            J2.m(this.f15370q.b().b());
        }
        int i9 = this.f15368o.f21625f;
        if (i9 != -1) {
            J2.l(i9);
        }
        Iterator<e.a> it = this.f15373t.iterator();
        while (it.hasNext()) {
            J2.b(it.next());
        }
        androidx.media.app.c t6 = new androidx.media.app.c().s(this.f15370q.c()).t(iArr);
        if (this.f15368o.f21629j) {
            t6.u(true);
            t6.r(x(1L));
            J2.t(true);
        }
        J2.x(t6);
        return J2.c();
    }

    private static int z(BitmapFactory.Options options, int i7, int i8) {
        int i9 = options.outHeight;
        int i10 = options.outWidth;
        int i11 = 1;
        if (i9 > i8 || i10 > i7) {
            int i12 = i9 / 2;
            int i13 = i10 / 2;
            while (i12 / i11 >= i8 && i13 / i11 >= i7) {
                i11 *= 2;
            }
        }
        return i11;
    }

    public void A(s4.c cVar) {
        this.f15368o = cVar;
        String str = cVar.f21622c;
        if (str == null) {
            str = getApplication().getPackageName() + ".channel";
        }
        this.f15377x = str;
        if (cVar.f21633n != null) {
            Context applicationContext = getApplicationContext();
            Intent intent = new Intent((String) null);
            intent.setComponent(new ComponentName(applicationContext, cVar.f21633n));
            intent.setAction("com.ryanheise.audioservice.NOTIFICATION_CLICK");
            H = PendingIntent.getActivity(applicationContext, 1000, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        } else {
            H = null;
        }
        if (cVar.f21621b) {
            return;
        }
        this.f15370q.l(null);
    }

    e.a B(String str, String str2, long j7) {
        return new e.a(M(str), str2, x(j7));
    }

    MediaMetadataCompat D(String str, String str2, String str3, String str4, String str5, Long l7, String str6, Boolean bool, String str7, String str8, String str9, RatingCompat ratingCompat, Map<?, ?> map) {
        long longValue;
        String str10;
        MediaMetadataCompat.b e7 = new MediaMetadataCompat.b().e("android.media.metadata.MEDIA_ID", str).e("android.media.metadata.TITLE", str2);
        if (str3 != null) {
            e7.e("android.media.metadata.ALBUM", str3);
        }
        if (str4 != null) {
            e7.e("android.media.metadata.ARTIST", str4);
        }
        if (str5 != null) {
            e7.e("android.media.metadata.GENRE", str5);
        }
        if (l7 != null) {
            e7.c("android.media.metadata.DURATION", l7.longValue());
        }
        if (str6 != null) {
            e7.e("android.media.metadata.DISPLAY_ICON_URI", str6);
        }
        if (bool != null) {
            e7.c("playable_long", bool.booleanValue() ? 1L : 0L);
        }
        if (str7 != null) {
            e7.e("android.media.metadata.DISPLAY_TITLE", str7);
        }
        if (str8 != null) {
            e7.e("android.media.metadata.DISPLAY_SUBTITLE", str8);
        }
        if (str9 != null) {
            e7.e("android.media.metadata.DISPLAY_DESCRIPTION", str9);
        }
        if (ratingCompat != null) {
            e7.d("android.media.metadata.RATING", ratingCompat);
        }
        if (map != null) {
            Iterator<?> it = map.keySet().iterator();
            while (it.hasNext()) {
                String str11 = (String) it.next();
                Object obj = map.get(str11);
                if (obj instanceof Long) {
                    longValue = ((Long) obj).longValue();
                } else if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        str10 = (String) obj;
                    } else if (obj instanceof Boolean) {
                        longValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    } else if (obj instanceof Double) {
                        str10 = obj.toString();
                    }
                    e7.e(str11, str10);
                }
                e7.c(str11, longValue);
            }
        }
        MediaMetadataCompat a7 = e7.a();
        K.put(str, a7);
        return a7;
    }

    public int L() {
        int i7 = c.f15382a[this.A.ordinal()];
        if (i7 == 2) {
            return 8;
        }
        if (i7 != 3) {
            return i7 != 4 ? i7 != 5 ? i7 != 6 ? 0 : 7 : this.f15379z ? 3 : 2 : this.f15379z ? 3 : 2;
        }
        return 6;
    }

    int M(String str) {
        String[] split = str.split("/");
        String str2 = split[0];
        return getResources().getIdentifier(split[1], str2, getApplicationContext().getPackageName());
    }

    public void N() {
        e eVar = I;
        if (eVar == null) {
            return;
        }
        eVar.H();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[Catch: Exception -> 0x00b9, TryCatch #1 {Exception -> 0x00b9, blocks: (B:7:0x000c, B:35:0x001f, B:37:0x0025, B:39:0x0038, B:40:0x003c, B:42:0x0042, B:43:0x0046, B:11:0x0052, B:13:0x005e, B:16:0x00b3, B:19:0x0069, B:21:0x006f, B:23:0x0079, B:24:0x0084, B:26:0x0095, B:28:0x009b, B:29:0x007d, B:31:0x00a6, B:32:0x00ab), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    Bitmap R(String str, String str2) {
        FileDescriptor fileDescriptor;
        Bitmap bitmap = this.f15378y.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Uri parse = Uri.parse(str);
            boolean equals = "content".equals(parse.getScheme());
            if (equals) {
                if (str2 != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            Size size = new Size(192, 192);
                            ContentResolver contentResolver = getContentResolver();
                            int i7 = this.f15368o.f21631l;
                            if (i7 == -1) {
                                i7 = size.getWidth();
                            }
                            int i8 = this.f15368o.f21632m;
                            if (i8 == -1) {
                                i8 = size.getHeight();
                            }
                            Bitmap loadThumbnail = contentResolver.loadThumbnail(parse, new Size(i7, i8), null);
                            if (loadThumbnail == null) {
                                return null;
                            }
                            bitmap = loadThumbnail;
                        }
                    } catch (FileNotFoundException | IOException unused) {
                    }
                }
                ParcelFileDescriptor openFileDescriptor = getContentResolver().openFileDescriptor(parse, "r");
                if (openFileDescriptor != null) {
                    fileDescriptor = openFileDescriptor.getFileDescriptor();
                    if (equals || fileDescriptor != null) {
                        if (this.f15368o.f21631l == -1) {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            if (fileDescriptor != null) {
                                BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                            } else {
                                BitmapFactory.decodeFile(parse.getPath(), options);
                            }
                            s4.c cVar = this.f15368o;
                            options.inSampleSize = z(options, cVar.f21631l, cVar.f21632m);
                            options.inJustDecodeBounds = false;
                            bitmap = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options) : BitmapFactory.decodeFile(parse.getPath(), options);
                        } else {
                            bitmap = fileDescriptor != null ? BitmapFactory.decodeFileDescriptor(fileDescriptor) : BitmapFactory.decodeFile(parse.getPath());
                        }
                    }
                    this.f15378y.put(str, bitmap);
                    return bitmap;
                }
                return null;
            }
            fileDescriptor = null;
            if (equals) {
            }
            if (this.f15368o.f21631l == -1) {
            }
            this.f15378y.put(str, bitmap);
            return bitmap;
        } catch (Exception e7) {
            e7.printStackTrace();
            return null;
        }
    }

    synchronized void V(MediaMetadataCompat mediaMetadataCompat) {
        String m7 = mediaMetadataCompat.m("artCacheFile");
        if (m7 != null) {
            this.f15376w = R(m7, null);
        } else {
            String m8 = mediaMetadataCompat.m("android.media.metadata.DISPLAY_ICON_URI");
            if (m8 == null || !m8.startsWith("content:")) {
                this.f15376w = null;
                this.f15375v = mediaMetadataCompat;
                this.f15370q.m(mediaMetadataCompat);
                this.E.removeCallbacksAndMessages(null);
                this.E.post(new Runnable() { // from class: s4.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AudioService.this.b0();
                    }
                });
            } else {
                this.f15376w = R(m8, mediaMetadataCompat.m("loadThumbnailUri"));
            }
        }
        mediaMetadataCompat = S(mediaMetadataCompat);
        this.f15375v = mediaMetadataCompat;
        this.f15370q.m(mediaMetadataCompat);
        this.E.removeCallbacksAndMessages(null);
        this.E.post(new Runnable() { // from class: s4.b
            @Override // java.lang.Runnable
            public final void run() {
                AudioService.this.b0();
            }
        });
    }

    public void W(int i7, Integer num, Integer num2, Integer num3) {
        if (i7 == 1) {
            this.f15370q.o(3);
            this.F = null;
        } else if (i7 == 2) {
            if (this.F != null && num.intValue() == this.F.c() && num2.intValue() == this.F.b()) {
                this.F.h(num3.intValue());
            } else {
                this.F = new b(num.intValue(), num2.intValue(), num3.intValue());
            }
            this.f15370q.p(this.F);
        }
    }

    synchronized void X(List<MediaSessionCompat.QueueItem> list) {
        J = list;
        this.f15370q.q(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void Y(List<s4.f> list, long j7, int[] iArr, s4.a aVar, boolean z6, long j8, long j9, float f7, long j10, Integer num, String str, int i7, int i8, boolean z7, Long l7) {
        int i9;
        s4.a aVar2;
        boolean z8 = list.equals(this.f15372s) ? !Arrays.equals(iArr, this.f15374u) : true;
        this.f15372s = list;
        this.f15373t.clear();
        for (s4.f fVar : list) {
            this.f15373t.add(B(fVar.f21640a, fVar.f21641b, fVar.f21642c));
        }
        this.f15374u = iArr;
        boolean z9 = this.f15379z;
        s4.a aVar3 = this.A;
        this.A = aVar;
        this.f15379z = z6;
        this.B = i7;
        this.C = i8;
        PlaybackStateCompat.d d7 = new PlaybackStateCompat.d().b(j7 | 3669711).g(L(), j8, f7, j10).d(j9);
        if (l7 != null) {
            d7.c(l7.longValue());
        }
        if (num == null || str == null) {
            if (str != null) {
                i9 = -987654;
            }
            if (this.f15375v != null) {
                Bundle bundle = new Bundle();
                bundle.putString("androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID", this.f15375v.i().k());
                d7.f(bundle);
            }
            this.f15370q.n(d7.a());
            this.f15370q.r(i7);
            this.f15370q.t(i8);
            this.f15370q.j(z7);
            if (z9 && z6) {
                F();
            } else if (z9 && !z6) {
                H();
            }
            aVar2 = s4.a.idle;
            if (aVar3 == aVar2 && aVar == aVar2) {
                Z();
                return;
            } else if (aVar == aVar2 && z8) {
                b0();
                return;
            }
        }
        i9 = num.intValue();
        d7.e(i9, str);
        if (this.f15375v != null) {
        }
        this.f15370q.n(d7.a());
        this.f15370q.r(i7);
        this.f15370q.t(i8);
        this.f15370q.j(z7);
        if (z9) {
        }
        if (z9) {
            H();
        }
        aVar2 = s4.a.idle;
        if (aVar3 == aVar2) {
        }
        if (aVar == aVar2) {
        }
    }

    public void Z() {
        E();
        stopSelf();
    }

    @Override // androidx.media.d
    public d.e f(String str, int i7, Bundle bundle) {
        Boolean valueOf = bundle == null ? null : Boolean.valueOf(bundle.getBoolean("android.service.media.extra.RECENT"));
        if (valueOf == null) {
            valueOf = Boolean.FALSE;
        }
        return new d.e(valueOf.booleanValue() ? "recent" : "root", this.f15368o.a());
    }

    @Override // androidx.media.d
    public void g(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        h(str, mVar, null);
    }

    @Override // androidx.media.d
    public void h(String str, d.m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        e eVar = I;
        if (eVar == null) {
            mVar.g(new ArrayList());
        } else {
            eVar.j(str, mVar, bundle);
        }
    }

    @Override // androidx.media.d
    public void i(String str, d.m<MediaBrowserCompat.MediaItem> mVar) {
        e eVar = I;
        if (eVar == null) {
            mVar.g(null);
        } else {
            eVar.h(str, mVar);
        }
    }

    @Override // androidx.media.d
    public void j(String str, Bundle bundle, d.m<List<MediaBrowserCompat.MediaItem>> mVar) {
        e eVar = I;
        if (eVar == null) {
            mVar.g(new ArrayList());
        } else {
            eVar.d(str, bundle, mVar);
        }
    }

    @Override // androidx.media.d, android.app.Service
    public void onCreate() {
        super.onCreate();
        G = this;
        this.B = 0;
        this.C = 0;
        this.D = false;
        this.f15379z = false;
        this.A = s4.a.idle;
        this.f15370q = new MediaSessionCompat(this, "media-session");
        A(new s4.c(getApplicationContext()));
        this.f15370q.k(4);
        this.f15370q.n(new PlaybackStateCompat.d().b(3669711L).a());
        MediaSessionCompat mediaSessionCompat = this.f15370q;
        d dVar = new d();
        this.f15371r = dVar;
        mediaSessionCompat.h(dVar);
        r(this.f15370q.c());
        this.f15370q.q(J);
        this.f15369p = ((PowerManager) getSystemService("power")).newWakeLock(1, AudioService.class.getName());
        this.f15378y = new a(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8);
        this.f15367n = com.ryanheise.audioservice.a.H(this);
        System.out.println("flutterEngine warmed up");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        e eVar = I;
        if (eVar != null) {
            eVar.onDestroy();
            I = null;
        }
        this.f15375v = null;
        this.f15376w = null;
        J.clear();
        K.clear();
        this.f15372s.clear();
        this.f15378y.evictAll();
        this.f15374u = null;
        T();
        Q(!this.f15368o.f21621b);
        U();
        G = null;
        this.D = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        s.a.c(this.f15370q, intent);
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        e eVar = I;
        if (eVar != null) {
            eVar.v();
        }
        super.onTaskRemoved(intent);
    }

    PendingIntent w() {
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE");
        return PendingIntent.getBroadcast(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0);
    }

    PendingIntent x(long j7) {
        int a02 = a0(j7);
        if (a02 == 0) {
            return null;
        }
        Intent intent = new Intent(this, (Class<?>) MediaButtonReceiver.class);
        intent.setAction("android.intent.action.MEDIA_BUTTON");
        intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, a02));
        return PendingIntent.getBroadcast(this, a02, intent, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0);
    }
}
