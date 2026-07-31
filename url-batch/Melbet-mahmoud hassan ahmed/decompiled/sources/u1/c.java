package u1;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import o2.m0;
import r0.i;
import u1.c;

/* loaded from: classes.dex */
public final class c implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final c f22442l = new c(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: m, reason: collision with root package name */
    private static final a f22443m = new a(0).j(0);

    /* renamed from: n, reason: collision with root package name */
    public static final i.a<c> f22444n = new i.a() { // from class: u1.a
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            c b7;
            b7 = c.b(bundle);
            return b7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final Object f22445f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22446g;

    /* renamed from: h, reason: collision with root package name */
    public final long f22447h;

    /* renamed from: i, reason: collision with root package name */
    public final long f22448i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22449j;

    /* renamed from: k, reason: collision with root package name */
    private final a[] f22450k;

    public static final class a implements i {

        /* renamed from: m, reason: collision with root package name */
        public static final i.a<a> f22451m = new i.a() { // from class: u1.b
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                c.a d7;
                d7 = c.a.d(bundle);
                return d7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final long f22452f;

        /* renamed from: g, reason: collision with root package name */
        public final int f22453g;

        /* renamed from: h, reason: collision with root package name */
        public final Uri[] f22454h;

        /* renamed from: i, reason: collision with root package name */
        public final int[] f22455i;

        /* renamed from: j, reason: collision with root package name */
        public final long[] f22456j;

        /* renamed from: k, reason: collision with root package name */
        public final long f22457k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f22458l;

        public a(long j7) {
            this(j7, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j7, int i7, int[] iArr, Uri[] uriArr, long[] jArr, long j8, boolean z6) {
            o2.a.a(iArr.length == uriArr.length);
            this.f22452f = j7;
            this.f22453g = i7;
            this.f22455i = iArr;
            this.f22454h = uriArr;
            this.f22456j = jArr;
            this.f22457k = j8;
            this.f22458l = z6;
        }

        private static long[] b(long[] jArr, int i7) {
            int length = jArr.length;
            int max = Math.max(i7, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        private static int[] c(int[] iArr, int i7) {
            int length = iArr.length;
            int max = Math.max(i7, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a d(Bundle bundle) {
            long j7 = bundle.getLong(h(0));
            int i7 = bundle.getInt(h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j8 = bundle.getLong(h(5));
            boolean z6 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j7, i7, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j8, z6);
        }

        private static String h(int i7) {
            return Integer.toString(i7, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f22452f == aVar.f22452f && this.f22453g == aVar.f22453g && Arrays.equals(this.f22454h, aVar.f22454h) && Arrays.equals(this.f22455i, aVar.f22455i) && Arrays.equals(this.f22456j, aVar.f22456j) && this.f22457k == aVar.f22457k && this.f22458l == aVar.f22458l;
        }

        public int f(int i7) {
            int i8 = i7 + 1;
            while (true) {
                int[] iArr = this.f22455i;
                if (i8 >= iArr.length || this.f22458l || iArr[i8] == 0 || iArr[i8] == 1) {
                    break;
                }
                i8++;
            }
            return i8;
        }

        public boolean g() {
            if (this.f22453g == -1) {
                return true;
            }
            for (int i7 = 0; i7 < this.f22453g; i7++) {
                int[] iArr = this.f22455i;
                if (iArr[i7] == 0 || iArr[i7] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i7 = this.f22453g * 31;
            long j7 = this.f22452f;
            int hashCode = (((((((i7 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + Arrays.hashCode(this.f22454h)) * 31) + Arrays.hashCode(this.f22455i)) * 31) + Arrays.hashCode(this.f22456j)) * 31;
            long j8 = this.f22457k;
            return ((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f22458l ? 1 : 0);
        }

        public boolean i() {
            return this.f22453g == -1 || e() < this.f22453g;
        }

        public a j(int i7) {
            int[] c7 = c(this.f22455i, i7);
            long[] b7 = b(this.f22456j, i7);
            return new a(this.f22452f, i7, c7, (Uri[]) Arrays.copyOf(this.f22454h, i7), b7, this.f22457k, this.f22458l);
        }
    }

    private c(Object obj, a[] aVarArr, long j7, long j8, int i7) {
        this.f22445f = obj;
        this.f22447h = j7;
        this.f22448i = j8;
        this.f22446g = aVarArr.length + i7;
        this.f22450k = aVarArr;
        this.f22449j = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i7 = 0; i7 < parcelableArrayList.size(); i7++) {
                aVarArr2[i7] = a.f22451m.a((Bundle) parcelableArrayList.get(i7));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    private boolean f(long j7, long j8, int i7) {
        if (j7 == Long.MIN_VALUE) {
            return false;
        }
        long j9 = c(i7).f22452f;
        return j9 == Long.MIN_VALUE ? j8 == -9223372036854775807L || j7 < j8 : j7 < j9;
    }

    private static String g(int i7) {
        return Integer.toString(i7, 36);
    }

    public a c(int i7) {
        int i8 = this.f22449j;
        return i7 < i8 ? f22443m : this.f22450k[i7 - i8];
    }

    public int d(long j7, long j8) {
        if (j7 == Long.MIN_VALUE) {
            return -1;
        }
        if (j8 != -9223372036854775807L && j7 >= j8) {
            return -1;
        }
        int i7 = this.f22449j;
        while (i7 < this.f22446g && ((c(i7).f22452f != Long.MIN_VALUE && c(i7).f22452f <= j7) || !c(i7).i())) {
            i7++;
        }
        if (i7 < this.f22446g) {
            return i7;
        }
        return -1;
    }

    public int e(long j7, long j8) {
        int i7 = this.f22446g - 1;
        while (i7 >= 0 && f(j7, j8, i7)) {
            i7--;
        }
        if (i7 < 0 || !c(i7).g()) {
            return -1;
        }
        return i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return m0.c(this.f22445f, cVar.f22445f) && this.f22446g == cVar.f22446g && this.f22447h == cVar.f22447h && this.f22448i == cVar.f22448i && this.f22449j == cVar.f22449j && Arrays.equals(this.f22450k, cVar.f22450k);
    }

    public int hashCode() {
        int i7 = this.f22446g * 31;
        Object obj = this.f22445f;
        return ((((((((i7 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f22447h)) * 31) + ((int) this.f22448i)) * 31) + this.f22449j) * 31) + Arrays.hashCode(this.f22450k);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f22445f);
        sb.append(", adResumePositionUs=");
        sb.append(this.f22447h);
        sb.append(", adGroups=[");
        for (int i7 = 0; i7 < this.f22450k.length; i7++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f22450k[i7].f22452f);
            sb.append(", ads=[");
            for (int i8 = 0; i8 < this.f22450k[i7].f22455i.length; i8++) {
                sb.append("ad(state=");
                int i9 = this.f22450k[i7].f22455i[i8];
                sb.append(i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f22450k[i7].f22456j[i8]);
                sb.append(')');
                if (i8 < this.f22450k[i7].f22455i.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i7 < this.f22450k.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }
}
