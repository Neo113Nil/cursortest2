package com.tapjoy.internal;

import com.tapjoy.internal.ei;

/* loaded from: classes2.dex */
public final class fc extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8069c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final fb f8070d;
    public final ev e;
    public final fi f;

    public fc(fb fbVar, ev evVar, fi fiVar) {
        this(fbVar, evVar, fiVar, iv.f8418b);
    }

    public fc(fb fbVar, ev evVar, fi fiVar, iv ivVar) {
        super(f8069c, ivVar);
        this.f8070d = fbVar;
        this.e = evVar;
        this.f = fiVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fc)) {
            return false;
        }
        fc fcVar = (fc) obj;
        return a().equals(fcVar.a()) && ep.a(this.f8070d, fcVar.f8070d) && ep.a(this.e, fcVar.e) && ep.a(this.f, fcVar.f);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((a().hashCode() * 37) + (this.f8070d != null ? this.f8070d.hashCode() : 0)) * 37) + (this.e != null ? this.e.hashCode() : 0)) * 37) + (this.f != null ? this.f.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f8070d != null) {
            sb.append(", info=");
            sb.append(this.f8070d);
        }
        if (this.e != null) {
            sb.append(", app=");
            sb.append(this.e);
        }
        if (this.f != null) {
            sb.append(", user=");
            sb.append(this.f);
        }
        StringBuilder replace = sb.replace(0, 2, "InfoSet{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public fb f8071c;

        /* renamed from: d, reason: collision with root package name */
        public ev f8072d;
        public fi e;

        public final fc b() {
            return new fc(this.f8071c, this.f8072d, this.e, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fc fcVar = (fc) obj;
            return (fcVar.f8070d != null ? fb.f8065c.a(1, fcVar.f8070d) : 0) + (fcVar.e != null ? ev.f8040c.a(2, fcVar.e) : 0) + (fcVar.f != null ? fi.f8091c.a(3, fcVar.f) : 0) + fcVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fc fcVar = (fc) obj;
            if (fcVar.f8070d != null) {
                fb.f8065c.a(emVar, 1, fcVar.f8070d);
            }
            if (fcVar.e != null) {
                ev.f8040c.a(emVar, 2, fcVar.e);
            }
            if (fcVar.f != null) {
                fi.f8091c.a(emVar, 3, fcVar.f);
            }
            emVar.a(fcVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fc.class);
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
                        aVar.f8071c = (fb) fb.f8065c.a(elVar);
                        break;
                    case 2:
                        aVar.f8072d = (ev) ev.f8040c.a(elVar);
                        break;
                    case 3:
                        aVar.e = (fi) fi.f8091c.a(elVar);
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
