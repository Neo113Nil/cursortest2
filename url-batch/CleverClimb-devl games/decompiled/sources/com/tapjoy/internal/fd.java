package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class fd extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8073c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final String f8074d;
    public final String e;
    public final String f;

    public fd(String str, String str2, String str3) {
        this(str, str2, str3, iv.f8418b);
    }

    public fd(String str, String str2, String str3, iv ivVar) {
        super(f8073c, ivVar);
        this.f8074d = str;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return a().equals(fdVar.a()) && ep.a(this.f8074d, fdVar.f8074d) && ep.a(this.e, fdVar.e) && ep.a(this.f, fdVar.f);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((a().hashCode() * 37) + (this.f8074d != null ? this.f8074d.hashCode() : 0)) * 37) + (this.e != null ? this.e.hashCode() : 0)) * 37) + (this.f != null ? this.f.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f8074d != null) {
            sb.append(", fq7Change=");
            sb.append(this.f8074d);
        }
        if (this.e != null) {
            sb.append(", fq30Change=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", pushId=");
            sb.append(this.f);
        }
        StringBuilder replace = sb.replace(0, 2, "Meta{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8075c;

        /* renamed from: d, reason: collision with root package name */
        public String f8076d;
        public String e;

        public final fd b() {
            return new fd(this.f8075c, this.f8076d, this.e, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fd fdVar = (fd) obj;
            return (fdVar.f8074d != null ? ek.p.a(1, fdVar.f8074d) : 0) + (fdVar.e != null ? ek.p.a(2, fdVar.e) : 0) + (fdVar.f != null ? ek.p.a(3, fdVar.f) : 0) + fdVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fd fdVar = (fd) obj;
            if (fdVar.f8074d != null) {
                ek.p.a(emVar, 1, fdVar.f8074d);
            }
            if (fdVar.e != null) {
                ek.p.a(emVar, 2, fdVar.e);
            }
            if (fdVar.f != null) {
                ek.p.a(emVar, 3, fdVar.f);
            }
            emVar.a(fdVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fd.class);
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
                        aVar.f8075c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8076d = (String) ek.p.a(elVar);
                        break;
                    case 3:
                        aVar.e = (String) ek.p.a(elVar);
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
