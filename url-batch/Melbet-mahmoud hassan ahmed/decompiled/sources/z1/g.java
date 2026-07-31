package z1;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m4.q;
import m4.r;
import m4.t;
import v0.m;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: d, reason: collision with root package name */
    public final int f23537d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23538e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f23539f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f23540g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23541h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f23542i;

    /* renamed from: j, reason: collision with root package name */
    public final int f23543j;

    /* renamed from: k, reason: collision with root package name */
    public final long f23544k;

    /* renamed from: l, reason: collision with root package name */
    public final int f23545l;

    /* renamed from: m, reason: collision with root package name */
    public final long f23546m;

    /* renamed from: n, reason: collision with root package name */
    public final long f23547n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f23548o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f23549p;

    /* renamed from: q, reason: collision with root package name */
    public final m f23550q;

    /* renamed from: r, reason: collision with root package name */
    public final List<d> f23551r;

    /* renamed from: s, reason: collision with root package name */
    public final List<b> f23552s;

    /* renamed from: t, reason: collision with root package name */
    public final Map<Uri, c> f23553t;

    /* renamed from: u, reason: collision with root package name */
    public final long f23554u;

    /* renamed from: v, reason: collision with root package name */
    public final f f23555v;

    public static final class b extends e {

        /* renamed from: q, reason: collision with root package name */
        public final boolean f23556q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f23557r;

        public b(String str, d dVar, long j7, int i7, long j8, m mVar, String str2, String str3, long j9, long j10, boolean z6, boolean z7, boolean z8) {
            super(str, dVar, j7, i7, j8, mVar, str2, str3, j9, j10, z6);
            this.f23556q = z7;
            this.f23557r = z8;
        }

        public b d(long j7, int i7) {
            return new b(this.f23563f, this.f23564g, this.f23565h, i7, j7, this.f23568k, this.f23569l, this.f23570m, this.f23571n, this.f23572o, this.f23573p, this.f23556q, this.f23557r);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f23558a;

        /* renamed from: b, reason: collision with root package name */
        public final long f23559b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23560c;

        public c(Uri uri, long j7, int i7) {
            this.f23558a = uri;
            this.f23559b = j7;
            this.f23560c = i7;
        }
    }

    public static final class d extends e {

        /* renamed from: q, reason: collision with root package name */
        public final String f23561q;

        /* renamed from: r, reason: collision with root package name */
        public final List<b> f23562r;

        public d(String str, long j7, long j8, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j7, j8, false, q.x());
        }

        public d(String str, d dVar, String str2, long j7, int i7, long j8, m mVar, String str3, String str4, long j9, long j10, boolean z6, List<b> list) {
            super(str, dVar, j7, i7, j8, mVar, str3, str4, j9, j10, z6);
            this.f23561q = str2;
            this.f23562r = q.t(list);
        }

        public d d(long j7, int i7) {
            ArrayList arrayList = new ArrayList();
            long j8 = j7;
            for (int i8 = 0; i8 < this.f23562r.size(); i8++) {
                b bVar = this.f23562r.get(i8);
                arrayList.add(bVar.d(j8, i7));
                j8 += bVar.f23565h;
            }
            return new d(this.f23563f, this.f23564g, this.f23561q, this.f23565h, i7, j7, this.f23568k, this.f23569l, this.f23570m, this.f23571n, this.f23572o, this.f23573p, arrayList);
        }
    }

    public static class e implements Comparable<Long> {

        /* renamed from: f, reason: collision with root package name */
        public final String f23563f;

        /* renamed from: g, reason: collision with root package name */
        public final d f23564g;

        /* renamed from: h, reason: collision with root package name */
        public final long f23565h;

        /* renamed from: i, reason: collision with root package name */
        public final int f23566i;

        /* renamed from: j, reason: collision with root package name */
        public final long f23567j;

        /* renamed from: k, reason: collision with root package name */
        public final m f23568k;

        /* renamed from: l, reason: collision with root package name */
        public final String f23569l;

        /* renamed from: m, reason: collision with root package name */
        public final String f23570m;

        /* renamed from: n, reason: collision with root package name */
        public final long f23571n;

        /* renamed from: o, reason: collision with root package name */
        public final long f23572o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f23573p;

        private e(String str, d dVar, long j7, int i7, long j8, m mVar, String str2, String str3, long j9, long j10, boolean z6) {
            this.f23563f = str;
            this.f23564g = dVar;
            this.f23565h = j7;
            this.f23566i = i7;
            this.f23567j = j8;
            this.f23568k = mVar;
            this.f23569l = str2;
            this.f23570m = str3;
            this.f23571n = j9;
            this.f23572o = j10;
            this.f23573p = z6;
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Long l7) {
            if (this.f23567j > l7.longValue()) {
                return 1;
            }
            return this.f23567j < l7.longValue() ? -1 : 0;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f23574a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f23575b;

        /* renamed from: c, reason: collision with root package name */
        public final long f23576c;

        /* renamed from: d, reason: collision with root package name */
        public final long f23577d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f23578e;

        public f(long j7, boolean z6, long j8, long j9, boolean z7) {
            this.f23574a = j7;
            this.f23575b = z6;
            this.f23576c = j8;
            this.f23577d = j9;
            this.f23578e = z7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(int i7, String str, List<String> list, long j7, boolean z6, long j8, boolean z7, int i8, long j9, int i9, long j10, long j11, boolean z8, boolean z9, boolean z10, m mVar, List<d> list2, List<b> list3, f fVar, Map<Uri, c> map) {
        super(str, list, z8);
        e eVar;
        this.f23537d = i7;
        this.f23541h = j8;
        this.f23540g = z6;
        this.f23542i = z7;
        this.f23543j = i8;
        this.f23544k = j9;
        this.f23545l = i9;
        this.f23546m = j10;
        this.f23547n = j11;
        this.f23548o = z9;
        this.f23549p = z10;
        this.f23550q = mVar;
        this.f23551r = q.t(list2);
        this.f23552s = q.t(list3);
        this.f23553t = r.c(map);
        if (!list3.isEmpty()) {
            eVar = (b) t.c(list3);
        } else {
            if (list2.isEmpty()) {
                this.f23554u = 0L;
                long j12 = -9223372036854775807L;
                if (j7 != -9223372036854775807L) {
                    long j13 = this.f23554u;
                    j12 = j7 >= 0 ? Math.min(j13, j7) : Math.max(0L, j13 + j7);
                }
                this.f23538e = j12;
                this.f23539f = j7 < 0;
                this.f23555v = fVar;
            }
            eVar = (d) t.c(list2);
        }
        this.f23554u = eVar.f23567j + eVar.f23565h;
        long j122 = -9223372036854775807L;
        if (j7 != -9223372036854775807L) {
        }
        this.f23538e = j122;
        this.f23539f = j7 < 0;
        this.f23555v = fVar;
    }

    @Override // s1.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g a(List<s1.c> list) {
        return this;
    }

    public g c(long j7, int i7) {
        return new g(this.f23537d, this.f23600a, this.f23601b, this.f23538e, this.f23540g, j7, true, i7, this.f23544k, this.f23545l, this.f23546m, this.f23547n, this.f23602c, this.f23548o, this.f23549p, this.f23550q, this.f23551r, this.f23552s, this.f23555v, this.f23553t);
    }

    public g d() {
        return this.f23548o ? this : new g(this.f23537d, this.f23600a, this.f23601b, this.f23538e, this.f23540g, this.f23541h, this.f23542i, this.f23543j, this.f23544k, this.f23545l, this.f23546m, this.f23547n, this.f23602c, true, this.f23549p, this.f23550q, this.f23551r, this.f23552s, this.f23555v, this.f23553t);
    }

    public long e() {
        return this.f23541h + this.f23554u;
    }

    public boolean f(g gVar) {
        if (gVar == null) {
            return true;
        }
        long j7 = this.f23544k;
        long j8 = gVar.f23544k;
        if (j7 > j8) {
            return true;
        }
        if (j7 < j8) {
            return false;
        }
        int size = this.f23551r.size() - gVar.f23551r.size();
        if (size != 0) {
            return size > 0;
        }
        int size2 = this.f23552s.size();
        int size3 = gVar.f23552s.size();
        if (size2 <= size3) {
            return size2 == size3 && this.f23548o && !gVar.f23548o;
        }
        return true;
    }
}
