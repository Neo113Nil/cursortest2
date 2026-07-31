package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Pair;
import com.yandex.mobile.ads.impl.C2265u4;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import com.yandex.mobile.ads.impl.rv0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.x42;

/* loaded from: classes3.dex */
public abstract class x42 implements InterfaceC2259tl {

    /* renamed from: b, reason: collision with root package name */
    public static final x42 f34401b = new a();

    final class a extends x42 {
        a() {
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int b() {
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a(Object obj) {
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final d a(int i4, d dVar, long j4) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final b a(int i4, b bVar, boolean z4) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final Object a(int i4) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static final class b implements InterfaceC2259tl {

        /* renamed from: i, reason: collision with root package name */
        public static final InterfaceC2259tl.a<b> f34402i = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Fl
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                x42.b a4;
                a4 = x42.b.a(bundle);
                return a4;
            }
        };

        /* renamed from: b, reason: collision with root package name */
        public Object f34403b;

        /* renamed from: c, reason: collision with root package name */
        public Object f34404c;

        /* renamed from: d, reason: collision with root package name */
        public int f34405d;

        /* renamed from: e, reason: collision with root package name */
        public long f34406e;

        /* renamed from: f, reason: collision with root package name */
        public long f34407f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f34408g;

        /* renamed from: h, reason: collision with root package name */
        private C2265u4 f34409h = C2265u4.f32818h;

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Bundle bundle) {
            int i4 = bundle.getInt(Integer.toString(0, 36), 0);
            long j4 = bundle.getLong(Integer.toString(1, 36), -9223372036854775807L);
            long j5 = bundle.getLong(Integer.toString(2, 36), 0L);
            boolean z4 = bundle.getBoolean(Integer.toString(3, 36));
            Bundle bundle2 = bundle.getBundle(Integer.toString(4, 36));
            C2265u4 fromBundle = bundle2 != null ? C2265u4.f32820j.fromBundle(bundle2) : C2265u4.f32818h;
            b bVar = new b();
            bVar.a(null, null, i4, j4, j5, fromBundle, z4);
            return bVar;
        }

        public final int d(int i4) {
            return this.f34409h.a(i4).a(-1);
        }

        public final boolean e(int i4) {
            boolean z4;
            C2265u4.a a4 = this.f34409h.a(i4);
            if (a4.f32829c != -1) {
                z4 = false;
                for (int i5 = 0; i5 < a4.f32829c; i5++) {
                    int i6 = a4.f32831e[i5];
                    if (i6 != 0 && i6 != 1) {
                    }
                }
                return !z4;
            }
            z4 = true;
            return !z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class.equals(obj.getClass())) {
                b bVar = (b) obj;
                if (u82.a(this.f34403b, bVar.f34403b) && u82.a(this.f34404c, bVar.f34404c) && this.f34405d == bVar.f34405d && this.f34406e == bVar.f34406e && this.f34407f == bVar.f34407f && this.f34408g == bVar.f34408g && u82.a(this.f34409h, bVar.f34409h)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean f(int i4) {
            return this.f34409h.a(i4).f32834h;
        }

        public final int hashCode() {
            Object obj = this.f34403b;
            int hashCode = ((obj == null ? 0 : obj.hashCode()) + 217) * 31;
            Object obj2 = this.f34404c;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f34405d) * 31;
            long j4 = this.f34406e;
            int i4 = (hashCode2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f34407f;
            return this.f34409h.hashCode() + ((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + (this.f34408g ? 1 : 0)) * 31);
        }

        public final int b(long j4) {
            int i4;
            C2265u4 c2265u4 = this.f34409h;
            long j5 = this.f34406e;
            int i5 = c2265u4.f32822c - 1;
            while (i5 >= 0 && j4 != Long.MIN_VALUE) {
                long j6 = c2265u4.a(i5).f32828b;
                if (j6 != Long.MIN_VALUE) {
                    if (j4 >= j6) {
                        break;
                    }
                    i5--;
                } else {
                    if (j5 != -9223372036854775807L && j4 >= j5) {
                        break;
                    }
                    i5--;
                }
            }
            if (i5 >= 0) {
                C2265u4.a a4 = c2265u4.a(i5);
                if (a4.f32829c != -1) {
                    while (i4 < a4.f32829c) {
                        int i6 = a4.f32831e[i4];
                        i4 = (i6 == 0 || i6 == 1) ? 0 : i4 + 1;
                    }
                }
                return i5;
            }
            return -1;
        }

        public final long c(int i4) {
            return this.f34409h.a(i4).f32833g;
        }

        public final int c(int i4, int i5) {
            return this.f34409h.a(i4).a(i5);
        }

        public final int d() {
            return this.f34409h.f32825f;
        }

        public final long c() {
            return this.f34407f;
        }

        public final long b(int i4) {
            return this.f34409h.a(i4).f32828b;
        }

        public final long b() {
            return this.f34409h.f32823d;
        }

        public final int b(int i4, int i5) {
            C2265u4.a a4 = this.f34409h.a(i4);
            if (a4.f32829c != -1) {
                return a4.f32831e[i5];
            }
            return 0;
        }

        public final int a(int i4) {
            return this.f34409h.a(i4).f32829c;
        }

        public final long a(int i4, int i5) {
            C2265u4.a a4 = this.f34409h.a(i4);
            if (a4.f32829c != -1) {
                return a4.f32832f[i5];
            }
            return -9223372036854775807L;
        }

        public final int a() {
            return this.f34409h.f32822c;
        }

        public final int a(long j4) {
            C2265u4 c2265u4 = this.f34409h;
            long j5 = this.f34406e;
            c2265u4.getClass();
            if (j4 != Long.MIN_VALUE && (j5 == -9223372036854775807L || j4 < j5)) {
                int i4 = c2265u4.f32825f;
                while (i4 < c2265u4.f32822c) {
                    if (c2265u4.a(i4).f32828b == Long.MIN_VALUE || c2265u4.a(i4).f32828b > j4) {
                        C2265u4.a a4 = c2265u4.a(i4);
                        if (a4.f32829c == -1 || a4.a(-1) < a4.f32829c) {
                            break;
                        }
                    }
                    i4++;
                }
                if (i4 < c2265u4.f32822c) {
                    return i4;
                }
            }
            return -1;
        }

        public final b a(Object obj, Object obj2, int i4, long j4, long j5, C2265u4 c2265u4, boolean z4) {
            this.f34403b = obj;
            this.f34404c = obj2;
            this.f34405d = i4;
            this.f34406e = j4;
            this.f34407f = j5;
            this.f34409h = c2265u4;
            this.f34408g = z4;
            return this;
        }
    }

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.El
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                x42 a4;
                a4 = x42.a(bundle);
                return a4;
            }
        };
    }

    protected x42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x42 a(Bundle bundle) {
        sj0 a4 = a(d.f34417v, C2236sl.a(bundle, Integer.toString(0, 36)));
        sj0 a5 = a(b.f34402i, C2236sl.a(bundle, Integer.toString(1, 36)));
        int[] intArray = bundle.getIntArray(Integer.toString(2, 36));
        if (intArray == null) {
            int size = a4.size();
            int[] iArr = new int[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = i4;
            }
            intArray = iArr;
        }
        return new c(a4, a5, intArray);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i4, b bVar, boolean z4);

    public abstract d a(int i4, d dVar, long j4);

    public abstract Object a(int i4);

    public abstract int b();

    public final boolean c() {
        return b() == 0;
    }

    public final boolean equals(Object obj) {
        int b4;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        x42 x42Var = (x42) obj;
        if (x42Var.b() != b() || x42Var.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i4 = 0; i4 < b(); i4++) {
            if (!a(i4, dVar, 0L).equals(x42Var.a(i4, dVar2, 0L))) {
                return false;
            }
        }
        for (int i5 = 0; i5 < a(); i5++) {
            if (!a(i5, bVar, true).equals(x42Var.a(i5, bVar2, true))) {
                return false;
            }
        }
        int a4 = a(true);
        if (a4 != x42Var.a(true) || (b4 = b(true)) != x42Var.b(true)) {
            return false;
        }
        while (a4 != b4) {
            int a5 = a(a4, 0, true);
            if (a5 != x42Var.a(a4, 0, true)) {
                return false;
            }
            a4 = a5;
        }
        return true;
    }

    public final int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b4 = b() + 217;
        for (int i4 = 0; i4 < b(); i4++) {
            b4 = (b4 * 31) + a(i4, dVar, 0L).hashCode();
        }
        int a4 = a() + (b4 * 31);
        for (int i5 = 0; i5 < a(); i5++) {
            a4 = (a4 * 31) + a(i5, bVar, true).hashCode();
        }
        int a5 = a(true);
        while (a5 != -1) {
            a4 = (a4 * 31) + a5;
            a5 = a(a5, 0, true);
        }
        return a4;
    }

    public static final class c extends x42 {

        /* renamed from: c, reason: collision with root package name */
        private final sj0<d> f34410c;

        /* renamed from: d, reason: collision with root package name */
        private final sj0<b> f34411d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f34412e;

        /* renamed from: f, reason: collision with root package name */
        private final int[] f34413f;

        public c(sj0<d> sj0Var, sj0<b> sj0Var2, int[] iArr) {
            C2253tf.a(sj0Var.size() == iArr.length);
            this.f34410c = sj0Var;
            this.f34411d = sj0Var2;
            this.f34412e = iArr;
            this.f34413f = new int[iArr.length];
            for (int i4 = 0; i4 < iArr.length; i4++) {
                this.f34413f[iArr[i4]] = i4;
            }
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a(boolean z4) {
            if (c()) {
                return -1;
            }
            if (z4) {
                return this.f34412e[0];
            }
            return 0;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int b(boolean z4) {
            if (c()) {
                return -1;
            }
            return z4 ? this.f34412e[this.f34410c.size() - 1] : this.f34410c.size() - 1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a(int i4, int i5, boolean z4) {
            if (i5 == 1) {
                return i4;
            }
            if (i4 != b(z4)) {
                return z4 ? this.f34412e[this.f34413f[i4] + 1] : i4 + 1;
            }
            if (i5 == 2) {
                return a(z4);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final b a(int i4, b bVar, boolean z4) {
            b bVar2 = this.f34411d.get(i4);
            bVar.a(bVar2.f34403b, bVar2.f34404c, bVar2.f34405d, bVar2.f34406e, bVar2.f34407f, bVar2.f34409h, bVar2.f34408g);
            return bVar;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int b(int i4, int i5, boolean z4) {
            if (i5 == 1) {
                return i4;
            }
            if (i4 != a(z4)) {
                return z4 ? this.f34412e[this.f34413f[i4] - 1] : i4 - 1;
            }
            if (i5 == 2) {
                return b(z4);
            }
            return -1;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a() {
            return this.f34411d.size();
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final d a(int i4, d dVar, long j4) {
            d dVar2 = this.f34410c.get(i4);
            dVar.a(dVar2.f34418b, dVar2.f34420d, dVar2.f34421e, dVar2.f34422f, dVar2.f34423g, dVar2.f34424h, dVar2.f34425i, dVar2.f34426j, dVar2.f34428l, dVar2.f34430n, dVar2.f34431o, dVar2.f34432p, dVar2.f34433q, dVar2.f34434r);
            dVar.f34429m = dVar2.f34429m;
            return dVar;
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int b() {
            return this.f34410c.size();
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final int a(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.yandex.mobile.ads.impl.x42
        public final Object a(int i4) {
            throw new UnsupportedOperationException();
        }
    }

    public int b(boolean z4) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == a(z4)) {
                return -1;
            }
            return i4 - 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == a(z4) ? b(z4) : i4 - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends InterfaceC2259tl> sj0<T> a(InterfaceC2259tl.a<T> aVar, IBinder iBinder) {
        int readInt;
        if (iBinder == null) {
            return sj0.h();
        }
        sj0.a aVar2 = new sj0.a();
        int i4 = BinderC2213rl.f31268a;
        int i5 = sj0.f31764d;
        sj0.a aVar3 = new sj0.a();
        int i6 = 1;
        int i7 = 0;
        while (i6 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i7);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        readInt = obtain2.readInt();
                        if (readInt == 1) {
                            Bundle readBundle = obtain2.readBundle();
                            readBundle.getClass();
                            aVar3.b(readBundle);
                            i7++;
                        }
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    i6 = readInt;
                } catch (RemoteException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }
        sj0 a4 = aVar3.a();
        for (int i8 = 0; i8 < a4.size(); i8++) {
            aVar2.b(aVar.fromBundle((Bundle) a4.get(i8)));
        }
        return aVar2.a();
    }

    public static final class d implements InterfaceC2259tl {

        /* renamed from: s, reason: collision with root package name */
        public static final Object f34414s = new Object();

        /* renamed from: t, reason: collision with root package name */
        private static final Object f34415t = new Object();

        /* renamed from: u, reason: collision with root package name */
        private static final rv0 f34416u = new rv0.a().b("com.monetization.ads.exoplayer2.Timeline").a(Uri.EMPTY).a();

        /* renamed from: v, reason: collision with root package name */
        public static final InterfaceC2259tl.a<d> f34417v = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Gl
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                x42.d a4;
                a4 = x42.d.a(bundle);
                return a4;
            }
        };

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public Object f34419c;

        /* renamed from: e, reason: collision with root package name */
        public Object f34421e;

        /* renamed from: f, reason: collision with root package name */
        public long f34422f;

        /* renamed from: g, reason: collision with root package name */
        public long f34423g;

        /* renamed from: h, reason: collision with root package name */
        public long f34424h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f34425i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f34426j;

        /* renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f34427k;

        /* renamed from: l, reason: collision with root package name */
        public rv0.e f34428l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f34429m;

        /* renamed from: n, reason: collision with root package name */
        public long f34430n;

        /* renamed from: o, reason: collision with root package name */
        public long f34431o;

        /* renamed from: p, reason: collision with root package name */
        public int f34432p;

        /* renamed from: q, reason: collision with root package name */
        public int f34433q;

        /* renamed from: r, reason: collision with root package name */
        public long f34434r;

        /* renamed from: b, reason: collision with root package name */
        public Object f34418b = f34414s;

        /* renamed from: d, reason: collision with root package name */
        public rv0 f34420d = f34416u;

        /* JADX INFO: Access modifiers changed from: private */
        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
            rv0 fromBundle = bundle2 != null ? rv0.f31377h.fromBundle(bundle2) : null;
            long j4 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
            long j5 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
            long j6 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
            boolean z4 = bundle.getBoolean(Integer.toString(5, 36), false);
            boolean z5 = bundle.getBoolean(Integer.toString(6, 36), false);
            Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
            rv0.e fromBundle2 = bundle3 != null ? rv0.e.f31416h.fromBundle(bundle3) : null;
            boolean z6 = bundle.getBoolean(Integer.toString(8, 36), false);
            long j7 = bundle.getLong(Integer.toString(9, 36), 0L);
            long j8 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
            int i4 = bundle.getInt(Integer.toString(11, 36), 0);
            int i5 = bundle.getInt(Integer.toString(12, 36), 0);
            long j9 = bundle.getLong(Integer.toString(13, 36), 0L);
            d dVar = new d();
            dVar.a(f34415t, fromBundle, null, j4, j5, j6, z4, z5, fromBundle2, j7, j8, i4, i5, j9);
            dVar.f34429m = z6;
            return dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class.equals(obj.getClass())) {
                d dVar = (d) obj;
                if (u82.a(this.f34418b, dVar.f34418b) && u82.a(this.f34420d, dVar.f34420d) && u82.a(this.f34421e, dVar.f34421e) && u82.a(this.f34428l, dVar.f34428l) && this.f34422f == dVar.f34422f && this.f34423g == dVar.f34423g && this.f34424h == dVar.f34424h && this.f34425i == dVar.f34425i && this.f34426j == dVar.f34426j && this.f34429m == dVar.f34429m && this.f34430n == dVar.f34430n && this.f34431o == dVar.f34431o && this.f34432p == dVar.f34432p && this.f34433q == dVar.f34433q && this.f34434r == dVar.f34434r) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f34420d.hashCode() + ((this.f34418b.hashCode() + 217) * 31)) * 31;
            Object obj = this.f34421e;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            rv0.e eVar = this.f34428l;
            int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
            long j4 = this.f34422f;
            int i4 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f34423g;
            int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.f34424h;
            int i6 = (((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f34425i ? 1 : 0)) * 31) + (this.f34426j ? 1 : 0)) * 31) + (this.f34429m ? 1 : 0)) * 31;
            long j7 = this.f34430n;
            int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
            long j8 = this.f34431o;
            int i8 = (((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f34432p) * 31) + this.f34433q) * 31;
            long j9 = this.f34434r;
            return i8 + ((int) (j9 ^ (j9 >>> 32)));
        }

        public final boolean a() {
            boolean z4 = this.f34427k;
            rv0.e eVar = this.f34428l;
            if (z4 == (eVar != null)) {
                return eVar != null;
            }
            throw new IllegalStateException();
        }

        public final d a(Object obj, rv0 rv0Var, Object obj2, long j4, long j5, long j6, boolean z4, boolean z5, rv0.e eVar, long j7, long j8, int i4, int i5, long j9) {
            rv0.g gVar;
            this.f34418b = obj;
            this.f34420d = rv0Var != null ? rv0Var : f34416u;
            this.f34419c = (rv0Var == null || (gVar = rv0Var.f31379c) == null) ? null : gVar.f31433g;
            this.f34421e = obj2;
            this.f34422f = j4;
            this.f34423g = j5;
            this.f34424h = j6;
            this.f34425i = z4;
            this.f34426j = z5;
            this.f34427k = eVar != null;
            this.f34428l = eVar;
            this.f34430n = j7;
            this.f34431o = j8;
            this.f34432p = i4;
            this.f34433q = i5;
            this.f34434r = j9;
            this.f34429m = false;
            return this;
        }
    }

    public int a(boolean z4) {
        return c() ? -1 : 0;
    }

    public final int a(int i4, b bVar, d dVar, int i5, boolean z4) {
        int i6 = a(i4, bVar, false).f34405d;
        if (a(i6, dVar, 0L).f34433q != i4) {
            return i4 + 1;
        }
        int a4 = a(i6, i5, z4);
        if (a4 == -1) {
            return -1;
        }
        return a(a4, dVar, 0L).f34432p;
    }

    public int a(int i4, int i5, boolean z4) {
        if (i5 == 0) {
            if (i4 == b(z4)) {
                return -1;
            }
            return i4 + 1;
        }
        if (i5 == 1) {
            return i4;
        }
        if (i5 == 2) {
            return i4 == b(z4) ? a(z4) : i4 + 1;
        }
        throw new IllegalStateException();
    }

    public final b a(int i4, b bVar) {
        return a(i4, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i4, long j4) {
        Pair<Object, Long> a4 = a(dVar, bVar, i4, j4, 0L);
        a4.getClass();
        return a4;
    }

    public final Pair<Object, Long> a(d dVar, b bVar, int i4, long j4, long j5) {
        C2253tf.a(i4, b());
        a(i4, dVar, j5);
        if (j4 == -9223372036854775807L) {
            j4 = dVar.f34430n;
            if (j4 == -9223372036854775807L) {
                return null;
            }
        }
        int i5 = dVar.f34432p;
        a(i5, bVar, false);
        while (i5 < dVar.f34433q && bVar.f34407f != j4) {
            int i6 = i5 + 1;
            if (a(i6, bVar, false).f34407f > j4) {
                break;
            }
            i5 = i6;
        }
        a(i5, bVar, true);
        long j6 = j4 - bVar.f34407f;
        long j7 = bVar.f34406e;
        if (j7 != -9223372036854775807L) {
            j6 = Math.min(j6, j7 - 1);
        }
        long max = Math.max(0L, j6);
        Object obj = bVar.f34404c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }
}
