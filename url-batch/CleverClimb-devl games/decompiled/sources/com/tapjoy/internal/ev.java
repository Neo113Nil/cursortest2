package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class ev extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8040c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Integer f8041d = 0;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final String i;

    public ev(String str, Integer num, String str2, String str3, String str4, iv ivVar) {
        super(f8040c, ivVar);
        this.e = str;
        this.f = num;
        this.g = str2;
        this.h = str3;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ev)) {
            return false;
        }
        ev evVar = (ev) obj;
        return a().equals(evVar.a()) && ep.a(this.e, evVar.e) && ep.a(this.f, evVar.f) && ep.a(this.g, evVar.g) && ep.a(this.h, evVar.h) && ep.a(this.i, evVar.i);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((a().hashCode() * 37) + (this.e != null ? this.e.hashCode() : 0)) * 37) + (this.f != null ? this.f.hashCode() : 0)) * 37) + (this.g != null ? this.g.hashCode() : 0)) * 37) + (this.h != null ? this.h.hashCode() : 0)) * 37) + (this.i != null ? this.i.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.e != null) {
            sb.append(", pkgVer=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", pkgRev=");
            sb.append(this.f);
        }
        if (this.g != null) {
            sb.append(", dataVer=");
            sb.append(this.g);
        }
        if (this.h != null) {
            sb.append(", installer=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", store=");
            sb.append(this.i);
        }
        StringBuilder replace = sb.replace(0, 2, "App{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public String f8042c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f8043d;
        public String e;
        public String f;
        public String g;

        public final ev b() {
            return new ev(this.f8042c, this.f8043d, this.e, this.f, this.g, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            ev evVar = (ev) obj;
            return (evVar.e != null ? ek.p.a(1, evVar.e) : 0) + (evVar.f != null ? ek.f8003d.a(2, evVar.f) : 0) + (evVar.g != null ? ek.p.a(3, evVar.g) : 0) + (evVar.h != null ? ek.p.a(4, evVar.h) : 0) + (evVar.i != null ? ek.p.a(5, evVar.i) : 0) + evVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            ev evVar = (ev) obj;
            if (evVar.e != null) {
                ek.p.a(emVar, 1, evVar.e);
            }
            if (evVar.f != null) {
                ek.f8003d.a(emVar, 2, evVar.f);
            }
            if (evVar.g != null) {
                ek.p.a(emVar, 3, evVar.g);
            }
            if (evVar.h != null) {
                ek.p.a(emVar, 4, evVar.h);
            }
            if (evVar.i != null) {
                ek.p.a(emVar, 5, evVar.i);
            }
            emVar.a(evVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, ev.class);
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
                        aVar.f8042c = (String) ek.p.a(elVar);
                        break;
                    case 2:
                        aVar.f8043d = (Integer) ek.f8003d.a(elVar);
                        break;
                    case 3:
                        aVar.e = (String) ek.p.a(elVar);
                        break;
                    case 4:
                        aVar.f = (String) ek.p.a(elVar);
                        break;
                    case 5:
                        aVar.g = (String) ek.p.a(elVar);
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
