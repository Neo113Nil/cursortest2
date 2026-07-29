package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class ff extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8081c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Long f8082d = 0L;
    public static final Long e = 0L;
    public final String f;
    public final Long g;
    public final Long h;

    public ff(String str, Long l) {
        this(str, l, null, iv.f8418b);
    }

    public ff(String str, Long l, Long l2, iv ivVar) {
        super(f8081c, ivVar);
        this.f = str;
        this.g = l;
        this.h = l2;
    }

    public final a b() {
        a aVar = new a();
        aVar.f8083c = this.f;
        aVar.f8084d = this.g;
        aVar.e = this.h;
        aVar.a(a());
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ff)) {
            return false;
        }
        ff ffVar = (ff) obj;
        return a().equals(ffVar.a()) && this.f.equals(ffVar.f) && this.g.equals(ffVar.g) && ep.a(this.h, ffVar.h);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((a().hashCode() * 37) + this.f.hashCode()) * 37) + this.g.hashCode()) * 37) + (this.h != null ? this.h.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", id=");
        sb.append(this.f);
        sb.append(", received=");
        sb.append(this.g);
        if (this.h != null) {
            sb.append(", clicked=");
            sb.append(this.h);
        }
        StringBuilder replace = sb.replace(0, 2, "Push{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8083c;

        /* renamed from: d, reason: collision with root package name */
        public Long f8084d;
        public Long e;

        public final ff b() {
            if (this.f8083c == null || this.f8084d == null) {
                throw ep.a(this.f8083c, "id", this.f8084d, "received");
            }
            return new ff(this.f8083c, this.f8084d, this.e, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            ff ffVar = (ff) obj;
            return ek.p.a(1, ffVar.f) + ek.i.a(2, ffVar.g) + (ffVar.h != null ? ek.i.a(3, ffVar.h) : 0) + ffVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            ff ffVar = (ff) obj;
            ek.p.a(emVar, 1, ffVar.f);
            ek.i.a(emVar, 2, ffVar.g);
            if (ffVar.h != null) {
                ek.i.a(emVar, 3, ffVar.h);
            }
            emVar.a(ffVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, ff.class);
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            a aVar = new a();
            long a2 = elVar.a();
            while (true) {
                int b2 = elVar.b();
                if (b2 == -1) {
                    elVar.a(a2);
                    return aVar.b();
                }
                switch (b2) {
                    case 1:
                        aVar.f8083c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8084d = (Long) ek.i.a(elVar);
                        break;
                    case 3:
                        aVar.e = (Long) ek.i.a(elVar);
                        break;
                    default:
                        eh c2 = elVar.c();
                        aVar.a(b2, c2, c2.a().a(elVar));
                        break;
                }
            }
        }
    }
}
