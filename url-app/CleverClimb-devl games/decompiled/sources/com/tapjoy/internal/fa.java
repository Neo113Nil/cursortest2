package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class fa extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8061c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Long f8062d = 0L;
    public final String e;
    public final Long f;

    public fa(String str, Long l) {
        this(str, l, iv.f8418b);
    }

    public fa(String str, Long l, iv ivVar) {
        super(f8061c, ivVar);
        this.e = str;
        this.f = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return a().equals(faVar.a()) && this.e.equals(faVar.e) && this.f.equals(faVar.f);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((a().hashCode() * 37) + this.e.hashCode()) * 37) + this.f.hashCode();
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", name=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.f);
        StringBuilder replace = sb.replace(0, 2, "EventValue{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8063c;

        /* renamed from: d, reason: collision with root package name */
        public Long f8064d;

        public final fa b() {
            if (this.f8063c == null || this.f8064d == null) {
                throw ep.a(this.f8063c, "name", this.f8064d, "value");
            }
            return new fa(this.f8063c, this.f8064d, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fa faVar = (fa) obj;
            return ek.p.a(1, faVar.e) + ek.i.a(2, faVar.f) + faVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fa faVar = (fa) obj;
            ek.p.a(emVar, 1, faVar.e);
            ek.i.a(emVar, 2, faVar.f);
            emVar.a(faVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fa.class);
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
                        aVar.f8063c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8064d = (Long) ek.i.a(elVar);
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
