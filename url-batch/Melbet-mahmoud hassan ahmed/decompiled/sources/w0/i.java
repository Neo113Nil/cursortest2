package w0;

import android.net.Uri;
import c4.w0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements r {

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f22940n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: o, reason: collision with root package name */
    private static final a f22941o = new a(new a.InterfaceC0149a() { // from class: w0.h
        @Override // w0.i.a.InterfaceC0149a
        public final Constructor a() {
            Constructor f7;
            f7 = i.f();
            return f7;
        }
    });

    /* renamed from: p, reason: collision with root package name */
    private static final a f22942p = new a(new a.InterfaceC0149a() { // from class: w0.g
        @Override // w0.i.a.InterfaceC0149a
        public final Constructor a() {
            Constructor g7;
            g7 = i.g();
            return g7;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private boolean f22943b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f22944c;

    /* renamed from: d, reason: collision with root package name */
    private int f22945d;

    /* renamed from: e, reason: collision with root package name */
    private int f22946e;

    /* renamed from: f, reason: collision with root package name */
    private int f22947f;

    /* renamed from: g, reason: collision with root package name */
    private int f22948g;

    /* renamed from: h, reason: collision with root package name */
    private int f22949h;

    /* renamed from: i, reason: collision with root package name */
    private int f22950i;

    /* renamed from: j, reason: collision with root package name */
    private int f22951j;

    /* renamed from: l, reason: collision with root package name */
    private int f22953l;

    /* renamed from: k, reason: collision with root package name */
    private int f22952k = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f22954m = 112800;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0149a f22955a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f22956b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private Constructor<? extends l> f22957c;

        /* renamed from: w0.i$a$a, reason: collision with other inner class name */
        public interface InterfaceC0149a {
            Constructor<? extends l> a();
        }

        public a(InterfaceC0149a interfaceC0149a) {
            this.f22955a = interfaceC0149a;
        }

        private Constructor<? extends l> b() {
            synchronized (this.f22956b) {
                if (this.f22956b.get()) {
                    return this.f22957c;
                }
                try {
                    return this.f22955a.a();
                } catch (ClassNotFoundException unused) {
                    this.f22956b.set(true);
                    return this.f22957c;
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
        }

        public l a(Object... objArr) {
            Constructor<? extends l> b7 = b();
            if (b7 == null) {
                return null;
            }
            try {
                return b7.newInstance(objArr);
            } catch (Exception e7) {
                throw new IllegalStateException("Unexpected error creating extractor", e7);
            }
        }
    }

    private void e(int i7, List<l> list) {
        l bVar;
        switch (i7) {
            case 0:
                bVar = new g1.b();
                break;
            case 1:
                bVar = new g1.e();
                break;
            case 2:
                bVar = new g1.h((this.f22944c ? 2 : 0) | this.f22945d | (this.f22943b ? 1 : 0));
                break;
            case 3:
                bVar = new x0.b((this.f22944c ? 2 : 0) | this.f22946e | (this.f22943b ? 1 : 0));
                break;
            case 4:
                bVar = f22941o.a(Integer.valueOf(this.f22947f));
                if (bVar == null) {
                    bVar = new z0.d(this.f22947f);
                    break;
                }
                break;
            case 5:
                bVar = new a1.c();
                break;
            case 6:
                bVar = new c1.e(this.f22948g);
                break;
            case w0.f2149o /* 7 */:
                bVar = new d1.f((this.f22944c ? 2 : 0) | this.f22951j | (this.f22943b ? 1 : 0));
                break;
            case w0.f2150p /* 8 */:
                list.add(new e1.g(this.f22950i));
                bVar = new e1.k(this.f22949h);
                break;
            case 9:
                bVar = new f1.d();
                break;
            case 10:
                bVar = new g1.a0();
                break;
            case 11:
                bVar = new g1.h0(this.f22952k, this.f22953l, this.f22954m);
                break;
            case 12:
                bVar = new h1.b();
                break;
            case 13:
            default:
                return;
            case 14:
                bVar = new b1.a();
                break;
            case 15:
                bVar = f22942p.a(new Object[0]);
                if (bVar == null) {
                    return;
                }
                break;
            case 16:
                bVar = new y0.b();
                break;
        }
        list.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> f() {
        if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
            return Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(l.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends l> g() {
        return Class.forName("com.google.android.exoplayer2.decoder.midi.MidiExtractor").asSubclass(l.class).getConstructor(new Class[0]);
    }

    @Override // w0.r
    public synchronized l[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override // w0.r
    public synchronized l[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f22940n;
        arrayList = new ArrayList(iArr.length);
        int b7 = o2.k.b(map);
        if (b7 != -1) {
            e(b7, arrayList);
        }
        int c7 = o2.k.c(uri);
        if (c7 != -1 && c7 != b7) {
            e(c7, arrayList);
        }
        for (int i7 : iArr) {
            if (i7 != b7 && i7 != c7) {
                e(i7, arrayList);
            }
        }
        return (l[]) arrayList.toArray(new l[arrayList.size()]);
    }

    public synchronized i h(boolean z6) {
        this.f22943b = z6;
        return this;
    }
}
