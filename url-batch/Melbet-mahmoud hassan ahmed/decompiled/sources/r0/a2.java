package r0;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m4.q;
import r0.a2;
import r0.i;

/* loaded from: classes.dex */
public final class a2 implements r0.i {

    /* renamed from: n, reason: collision with root package name */
    public static final a2 f20390n = new c().a();

    /* renamed from: o, reason: collision with root package name */
    public static final i.a<a2> f20391o = new i.a() { // from class: r0.z1
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            a2 c7;
            c7 = a2.c(bundle);
            return c7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final String f20392f;

    /* renamed from: g, reason: collision with root package name */
    public final h f20393g;

    /* renamed from: h, reason: collision with root package name */
    @Deprecated
    public final i f20394h;

    /* renamed from: i, reason: collision with root package name */
    public final g f20395i;

    /* renamed from: j, reason: collision with root package name */
    public final f2 f20396j;

    /* renamed from: k, reason: collision with root package name */
    public final d f20397k;

    /* renamed from: l, reason: collision with root package name */
    @Deprecated
    public final e f20398l;

    /* renamed from: m, reason: collision with root package name */
    public final j f20399m;

    public static final class b {
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f20400a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f20401b;

        /* renamed from: c, reason: collision with root package name */
        private String f20402c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f20403d;

        /* renamed from: e, reason: collision with root package name */
        private f.a f20404e;

        /* renamed from: f, reason: collision with root package name */
        private List<s1.c> f20405f;

        /* renamed from: g, reason: collision with root package name */
        private String f20406g;

        /* renamed from: h, reason: collision with root package name */
        private m4.q<l> f20407h;

        /* renamed from: i, reason: collision with root package name */
        private b f20408i;

        /* renamed from: j, reason: collision with root package name */
        private Object f20409j;

        /* renamed from: k, reason: collision with root package name */
        private f2 f20410k;

        /* renamed from: l, reason: collision with root package name */
        private g.a f20411l;

        /* renamed from: m, reason: collision with root package name */
        private j f20412m;

        public c() {
            this.f20403d = new d.a();
            this.f20404e = new f.a();
            this.f20405f = Collections.emptyList();
            this.f20407h = m4.q.x();
            this.f20411l = new g.a();
            this.f20412m = j.f20466i;
        }

        private c(a2 a2Var) {
            this();
            this.f20403d = a2Var.f20397k.b();
            this.f20400a = a2Var.f20392f;
            this.f20410k = a2Var.f20396j;
            this.f20411l = a2Var.f20395i.b();
            this.f20412m = a2Var.f20399m;
            h hVar = a2Var.f20393g;
            if (hVar != null) {
                this.f20406g = hVar.f20462f;
                this.f20402c = hVar.f20458b;
                this.f20401b = hVar.f20457a;
                this.f20405f = hVar.f20461e;
                this.f20407h = hVar.f20463g;
                this.f20409j = hVar.f20465i;
                f fVar = hVar.f20459c;
                this.f20404e = fVar != null ? fVar.b() : new f.a();
            }
        }

        public a2 a() {
            i iVar;
            o2.a.f(this.f20404e.f20438b == null || this.f20404e.f20437a != null);
            Uri uri = this.f20401b;
            if (uri != null) {
                iVar = new i(uri, this.f20402c, this.f20404e.f20437a != null ? this.f20404e.i() : null, this.f20408i, this.f20405f, this.f20406g, this.f20407h, this.f20409j);
            } else {
                iVar = null;
            }
            String str = this.f20400a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e g7 = this.f20403d.g();
            g f7 = this.f20411l.f();
            f2 f2Var = this.f20410k;
            if (f2Var == null) {
                f2Var = f2.L;
            }
            return new a2(str2, g7, iVar, f7, f2Var, this.f20412m);
        }

        public c b(String str) {
            this.f20406g = str;
            return this;
        }

        public c c(String str) {
            this.f20400a = (String) o2.a.e(str);
            return this;
        }

        public c d(String str) {
            this.f20402c = str;
            return this;
        }

        public c e(Object obj) {
            this.f20409j = obj;
            return this;
        }

        public c f(Uri uri) {
            this.f20401b = uri;
            return this;
        }
    }

    public static class d implements r0.i {

        /* renamed from: k, reason: collision with root package name */
        public static final d f20413k = new a().f();

        /* renamed from: l, reason: collision with root package name */
        public static final i.a<e> f20414l = new i.a() { // from class: r0.b2
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                a2.e d7;
                d7 = a2.d.d(bundle);
                return d7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final long f20415f;

        /* renamed from: g, reason: collision with root package name */
        public final long f20416g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20417h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f20418i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f20419j;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f20420a;

            /* renamed from: b, reason: collision with root package name */
            private long f20421b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f20422c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f20423d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f20424e;

            public a() {
                this.f20421b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f20420a = dVar.f20415f;
                this.f20421b = dVar.f20416g;
                this.f20422c = dVar.f20417h;
                this.f20423d = dVar.f20418i;
                this.f20424e = dVar.f20419j;
            }

            public d f() {
                return g();
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            public a h(long j7) {
                o2.a.a(j7 == Long.MIN_VALUE || j7 >= 0);
                this.f20421b = j7;
                return this;
            }

            public a i(boolean z6) {
                this.f20423d = z6;
                return this;
            }

            public a j(boolean z6) {
                this.f20422c = z6;
                return this;
            }

            public a k(long j7) {
                o2.a.a(j7 >= 0);
                this.f20420a = j7;
                return this;
            }

            public a l(boolean z6) {
                this.f20424e = z6;
                return this;
            }
        }

        private d(a aVar) {
            this.f20415f = aVar.f20420a;
            this.f20416g = aVar.f20421b;
            this.f20417h = aVar.f20422c;
            this.f20418i = aVar.f20423d;
            this.f20419j = aVar.f20424e;
        }

        private static String c(int i7) {
            return Integer.toString(i7, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e d(Bundle bundle) {
            return new a().k(bundle.getLong(c(0), 0L)).h(bundle.getLong(c(1), Long.MIN_VALUE)).j(bundle.getBoolean(c(2), false)).i(bundle.getBoolean(c(3), false)).l(bundle.getBoolean(c(4), false)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f20415f == dVar.f20415f && this.f20416g == dVar.f20416g && this.f20417h == dVar.f20417h && this.f20418i == dVar.f20418i && this.f20419j == dVar.f20419j;
        }

        public int hashCode() {
            long j7 = this.f20415f;
            int i7 = ((int) (j7 ^ (j7 >>> 32))) * 31;
            long j8 = this.f20416g;
            return ((((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f20417h ? 1 : 0)) * 31) + (this.f20418i ? 1 : 0)) * 31) + (this.f20419j ? 1 : 0);
        }
    }

    @Deprecated
    public static final class e extends d {

        /* renamed from: m, reason: collision with root package name */
        public static final e f20425m = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f20426a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f20427b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f20428c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final m4.r<String, String> f20429d;

        /* renamed from: e, reason: collision with root package name */
        public final m4.r<String, String> f20430e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f20431f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20432g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f20433h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final m4.q<Integer> f20434i;

        /* renamed from: j, reason: collision with root package name */
        public final m4.q<Integer> f20435j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f20436k;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f20437a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f20438b;

            /* renamed from: c, reason: collision with root package name */
            private m4.r<String, String> f20439c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f20440d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f20441e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f20442f;

            /* renamed from: g, reason: collision with root package name */
            private m4.q<Integer> f20443g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f20444h;

            @Deprecated
            private a() {
                this.f20439c = m4.r.j();
                this.f20443g = m4.q.x();
            }

            private a(f fVar) {
                this.f20437a = fVar.f20426a;
                this.f20438b = fVar.f20428c;
                this.f20439c = fVar.f20430e;
                this.f20440d = fVar.f20431f;
                this.f20441e = fVar.f20432g;
                this.f20442f = fVar.f20433h;
                this.f20443g = fVar.f20435j;
                this.f20444h = fVar.f20436k;
            }

            public f i() {
                return new f(this);
            }
        }

        private f(a aVar) {
            o2.a.f((aVar.f20442f && aVar.f20438b == null) ? false : true);
            UUID uuid = (UUID) o2.a.e(aVar.f20437a);
            this.f20426a = uuid;
            this.f20427b = uuid;
            this.f20428c = aVar.f20438b;
            this.f20429d = aVar.f20439c;
            this.f20430e = aVar.f20439c;
            this.f20431f = aVar.f20440d;
            this.f20433h = aVar.f20442f;
            this.f20432g = aVar.f20441e;
            this.f20434i = aVar.f20443g;
            this.f20435j = aVar.f20443g;
            this.f20436k = aVar.f20444h != null ? Arrays.copyOf(aVar.f20444h, aVar.f20444h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f20436k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f20426a.equals(fVar.f20426a) && o2.m0.c(this.f20428c, fVar.f20428c) && o2.m0.c(this.f20430e, fVar.f20430e) && this.f20431f == fVar.f20431f && this.f20433h == fVar.f20433h && this.f20432g == fVar.f20432g && this.f20435j.equals(fVar.f20435j) && Arrays.equals(this.f20436k, fVar.f20436k);
        }

        public int hashCode() {
            int hashCode = this.f20426a.hashCode() * 31;
            Uri uri = this.f20428c;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f20430e.hashCode()) * 31) + (this.f20431f ? 1 : 0)) * 31) + (this.f20433h ? 1 : 0)) * 31) + (this.f20432g ? 1 : 0)) * 31) + this.f20435j.hashCode()) * 31) + Arrays.hashCode(this.f20436k);
        }
    }

    public static final class g implements r0.i {

        /* renamed from: k, reason: collision with root package name */
        public static final g f20445k = new a().f();

        /* renamed from: l, reason: collision with root package name */
        public static final i.a<g> f20446l = new i.a() { // from class: r0.c2
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                a2.g d7;
                d7 = a2.g.d(bundle);
                return d7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final long f20447f;

        /* renamed from: g, reason: collision with root package name */
        public final long f20448g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20449h;

        /* renamed from: i, reason: collision with root package name */
        public final float f20450i;

        /* renamed from: j, reason: collision with root package name */
        public final float f20451j;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f20452a;

            /* renamed from: b, reason: collision with root package name */
            private long f20453b;

            /* renamed from: c, reason: collision with root package name */
            private long f20454c;

            /* renamed from: d, reason: collision with root package name */
            private float f20455d;

            /* renamed from: e, reason: collision with root package name */
            private float f20456e;

            public a() {
                this.f20452a = -9223372036854775807L;
                this.f20453b = -9223372036854775807L;
                this.f20454c = -9223372036854775807L;
                this.f20455d = -3.4028235E38f;
                this.f20456e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f20452a = gVar.f20447f;
                this.f20453b = gVar.f20448g;
                this.f20454c = gVar.f20449h;
                this.f20455d = gVar.f20450i;
                this.f20456e = gVar.f20451j;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j7) {
                this.f20454c = j7;
                return this;
            }

            public a h(float f7) {
                this.f20456e = f7;
                return this;
            }

            public a i(long j7) {
                this.f20453b = j7;
                return this;
            }

            public a j(float f7) {
                this.f20455d = f7;
                return this;
            }

            public a k(long j7) {
                this.f20452a = j7;
                return this;
            }
        }

        @Deprecated
        public g(long j7, long j8, long j9, float f7, float f8) {
            this.f20447f = j7;
            this.f20448g = j8;
            this.f20449h = j9;
            this.f20450i = f7;
            this.f20451j = f8;
        }

        private g(a aVar) {
            this(aVar.f20452a, aVar.f20453b, aVar.f20454c, aVar.f20455d, aVar.f20456e);
        }

        private static String c(int i7) {
            return Integer.toString(i7, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ g d(Bundle bundle) {
            return new g(bundle.getLong(c(0), -9223372036854775807L), bundle.getLong(c(1), -9223372036854775807L), bundle.getLong(c(2), -9223372036854775807L), bundle.getFloat(c(3), -3.4028235E38f), bundle.getFloat(c(4), -3.4028235E38f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f20447f == gVar.f20447f && this.f20448g == gVar.f20448g && this.f20449h == gVar.f20449h && this.f20450i == gVar.f20450i && this.f20451j == gVar.f20451j;
        }

        public int hashCode() {
            long j7 = this.f20447f;
            long j8 = this.f20448g;
            int i7 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j9 = this.f20449h;
            int i8 = (i7 + ((int) (j9 ^ (j9 >>> 32)))) * 31;
            float f7 = this.f20450i;
            int floatToIntBits = (i8 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f20451j;
            return floatToIntBits + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f20457a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20458b;

        /* renamed from: c, reason: collision with root package name */
        public final f f20459c;

        /* renamed from: d, reason: collision with root package name */
        public final b f20460d;

        /* renamed from: e, reason: collision with root package name */
        public final List<s1.c> f20461e;

        /* renamed from: f, reason: collision with root package name */
        public final String f20462f;

        /* renamed from: g, reason: collision with root package name */
        public final m4.q<l> f20463g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<k> f20464h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f20465i;

        private h(Uri uri, String str, f fVar, b bVar, List<s1.c> list, String str2, m4.q<l> qVar, Object obj) {
            this.f20457a = uri;
            this.f20458b = str;
            this.f20459c = fVar;
            this.f20461e = list;
            this.f20462f = str2;
            this.f20463g = qVar;
            q.a r7 = m4.q.r();
            for (int i7 = 0; i7 < qVar.size(); i7++) {
                r7.a(qVar.get(i7).a().i());
            }
            this.f20464h = r7.h();
            this.f20465i = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f20457a.equals(hVar.f20457a) && o2.m0.c(this.f20458b, hVar.f20458b) && o2.m0.c(this.f20459c, hVar.f20459c) && o2.m0.c(this.f20460d, hVar.f20460d) && this.f20461e.equals(hVar.f20461e) && o2.m0.c(this.f20462f, hVar.f20462f) && this.f20463g.equals(hVar.f20463g) && o2.m0.c(this.f20465i, hVar.f20465i);
        }

        public int hashCode() {
            int hashCode = this.f20457a.hashCode() * 31;
            String str = this.f20458b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f20459c;
            int hashCode3 = (((((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0) * 31) + this.f20461e.hashCode()) * 31;
            String str2 = this.f20462f;
            int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20463g.hashCode()) * 31;
            Object obj = this.f20465i;
            return hashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class i extends h {
        private i(Uri uri, String str, f fVar, b bVar, List<s1.c> list, String str2, m4.q<l> qVar, Object obj) {
            super(uri, str, fVar, bVar, list, str2, qVar, obj);
        }
    }

    public static final class j implements r0.i {

        /* renamed from: i, reason: collision with root package name */
        public static final j f20466i = new a().d();

        /* renamed from: j, reason: collision with root package name */
        public static final i.a<j> f20467j = new i.a() { // from class: r0.d2
            @Override // r0.i.a
            public final i a(Bundle bundle) {
                a2.j c7;
                c7 = a2.j.c(bundle);
                return c7;
            }
        };

        /* renamed from: f, reason: collision with root package name */
        public final Uri f20468f;

        /* renamed from: g, reason: collision with root package name */
        public final String f20469g;

        /* renamed from: h, reason: collision with root package name */
        public final Bundle f20470h;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f20471a;

            /* renamed from: b, reason: collision with root package name */
            private String f20472b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f20473c;

            public j d() {
                return new j(this);
            }

            public a e(Bundle bundle) {
                this.f20473c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f20471a = uri;
                return this;
            }

            public a g(String str) {
                this.f20472b = str;
                return this;
            }
        }

        private j(a aVar) {
            this.f20468f = aVar.f20471a;
            this.f20469g = aVar.f20472b;
            this.f20470h = aVar.f20473c;
        }

        private static String b(int i7) {
            return Integer.toString(i7, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ j c(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(b(0))).g(bundle.getString(b(1))).e(bundle.getBundle(b(2))).d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return o2.m0.c(this.f20468f, jVar.f20468f) && o2.m0.c(this.f20469g, jVar.f20469g);
        }

        public int hashCode() {
            Uri uri = this.f20468f;
            int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f20469g;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Deprecated
    public static final class k extends l {
        private k(l.a aVar) {
            super(aVar);
        }
    }

    public static class l {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f20474a;

        /* renamed from: b, reason: collision with root package name */
        public final String f20475b;

        /* renamed from: c, reason: collision with root package name */
        public final String f20476c;

        /* renamed from: d, reason: collision with root package name */
        public final int f20477d;

        /* renamed from: e, reason: collision with root package name */
        public final int f20478e;

        /* renamed from: f, reason: collision with root package name */
        public final String f20479f;

        /* renamed from: g, reason: collision with root package name */
        public final String f20480g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f20481a;

            /* renamed from: b, reason: collision with root package name */
            private String f20482b;

            /* renamed from: c, reason: collision with root package name */
            private String f20483c;

            /* renamed from: d, reason: collision with root package name */
            private int f20484d;

            /* renamed from: e, reason: collision with root package name */
            private int f20485e;

            /* renamed from: f, reason: collision with root package name */
            private String f20486f;

            /* renamed from: g, reason: collision with root package name */
            private String f20487g;

            private a(l lVar) {
                this.f20481a = lVar.f20474a;
                this.f20482b = lVar.f20475b;
                this.f20483c = lVar.f20476c;
                this.f20484d = lVar.f20477d;
                this.f20485e = lVar.f20478e;
                this.f20486f = lVar.f20479f;
                this.f20487g = lVar.f20480g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public k i() {
                return new k(this);
            }
        }

        private l(a aVar) {
            this.f20474a = aVar.f20481a;
            this.f20475b = aVar.f20482b;
            this.f20476c = aVar.f20483c;
            this.f20477d = aVar.f20484d;
            this.f20478e = aVar.f20485e;
            this.f20479f = aVar.f20486f;
            this.f20480g = aVar.f20487g;
        }

        public a a() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f20474a.equals(lVar.f20474a) && o2.m0.c(this.f20475b, lVar.f20475b) && o2.m0.c(this.f20476c, lVar.f20476c) && this.f20477d == lVar.f20477d && this.f20478e == lVar.f20478e && o2.m0.c(this.f20479f, lVar.f20479f) && o2.m0.c(this.f20480g, lVar.f20480g);
        }

        public int hashCode() {
            int hashCode = this.f20474a.hashCode() * 31;
            String str = this.f20475b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f20476c;
            int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f20477d) * 31) + this.f20478e) * 31;
            String str3 = this.f20479f;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f20480g;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    private a2(String str, e eVar, i iVar, g gVar, f2 f2Var, j jVar) {
        this.f20392f = str;
        this.f20393g = iVar;
        this.f20394h = iVar;
        this.f20395i = gVar;
        this.f20396j = f2Var;
        this.f20397k = eVar;
        this.f20398l = eVar;
        this.f20399m = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a2 c(Bundle bundle) {
        String str = (String) o2.a.e(bundle.getString(e(0), ""));
        Bundle bundle2 = bundle.getBundle(e(1));
        g a7 = bundle2 == null ? g.f20445k : g.f20446l.a(bundle2);
        Bundle bundle3 = bundle.getBundle(e(2));
        f2 a8 = bundle3 == null ? f2.L : f2.M.a(bundle3);
        Bundle bundle4 = bundle.getBundle(e(3));
        e a9 = bundle4 == null ? e.f20425m : d.f20414l.a(bundle4);
        Bundle bundle5 = bundle.getBundle(e(4));
        return new a2(str, a9, null, a7, a8, bundle5 == null ? j.f20466i : j.f20467j.a(bundle5));
    }

    public static a2 d(Uri uri) {
        return new c().f(uri).a();
    }

    private static String e(int i7) {
        return Integer.toString(i7, 36);
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return o2.m0.c(this.f20392f, a2Var.f20392f) && this.f20397k.equals(a2Var.f20397k) && o2.m0.c(this.f20393g, a2Var.f20393g) && o2.m0.c(this.f20395i, a2Var.f20395i) && o2.m0.c(this.f20396j, a2Var.f20396j) && o2.m0.c(this.f20399m, a2Var.f20399m);
    }

    public int hashCode() {
        int hashCode = this.f20392f.hashCode() * 31;
        h hVar = this.f20393g;
        return ((((((((hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f20395i.hashCode()) * 31) + this.f20397k.hashCode()) * 31) + this.f20396j.hashCode()) * 31) + this.f20399m.hashCode();
    }
}
