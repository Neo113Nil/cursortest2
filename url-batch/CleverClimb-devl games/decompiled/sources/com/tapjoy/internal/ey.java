package com.tapjoy.internal;

import com.tapjoy.internal.ei;
import com.tapjoy.internal.ek;

/* loaded from: classes2.dex */
public final class ey extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8051c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final ez f8052d = ez.APP;
    public final ez e;
    public final String f;
    public final String g;

    public ey(ez ezVar, String str, String str2, iv ivVar) {
        super(f8051c, ivVar);
        this.e = ezVar;
        this.f = str;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ey)) {
            return false;
        }
        ey eyVar = (ey) obj;
        return a().equals(eyVar.a()) && this.e.equals(eyVar.e) && this.f.equals(eyVar.f) && ep.a(this.g, eyVar.g);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((a().hashCode() * 37) + this.e.hashCode()) * 37) + this.f.hashCode()) * 37) + (this.g != null ? this.g.hashCode() : 0);
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", name=");
        sb.append(this.f);
        if (this.g != null) {
            sb.append(", category=");
            sb.append(this.g);
        }
        StringBuilder replace = sb.replace(0, 2, "EventGroup{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public ez f8053c;

        /* renamed from: d, reason: collision with root package name */
        public String f8054d;
        public String e;

        public final ey b() {
            if (this.f8053c == null || this.f8054d == null) {
                throw ep.a(this.f8053c, "type", this.f8054d, "name");
            }
            return new ey(this.f8053c, this.f8054d, this.e, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            ey eyVar = (ey) obj;
            return ez.ADAPTER.a(1, eyVar.e) + ek.p.a(2, eyVar.f) + (eyVar.g != null ? ek.p.a(3, eyVar.g) : 0) + eyVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ Object a(el elVar) {
            return b(elVar);
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            ey eyVar = (ey) obj;
            ez.ADAPTER.a(emVar, 1, eyVar.e);
            ek.p.a(emVar, 2, eyVar.f);
            if (eyVar.g != null) {
                ek.p.a(emVar, 3, eyVar.g);
            }
            emVar.a(eyVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, ey.class);
        }

        private static ey b(el elVar) {
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
                        try {
                            aVar.f8053c = (ez) ez.ADAPTER.a(elVar);
                            break;
                        } catch (ek.a e) {
                            aVar.a(b2, eh.VARINT, Long.valueOf(e.f8006a));
                            break;
                        }
                    case 2:
                        aVar.f8054d = (String) ek.p.a(elVar);
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
