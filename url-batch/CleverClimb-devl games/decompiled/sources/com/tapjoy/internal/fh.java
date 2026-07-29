package com.tapjoy.internal;

import com.tapjoy.internal.ei;
import java.util.List;

/* loaded from: classes2.dex */
public final class fh extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8088c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final List f8089d;

    public fh(List list) {
        this(list, iv.f8418b);
    }

    public fh(List list, iv ivVar) {
        super(f8088c, ivVar);
        this.f8089d = ep.a("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return a().equals(fhVar.a()) && this.f8089d.equals(fhVar.f8089d);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.f8089d.hashCode();
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f8089d.isEmpty()) {
            sb.append(", elements=");
            sb.append(this.f8089d);
        }
        StringBuilder replace = sb.replace(0, 2, "StringList{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public List f8090c = ep.a();

        public final fh b() {
            return new fh(this.f8090c, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fh fhVar = (fh) obj;
            return ek.p.a().a(1, fhVar.f8089d) + fhVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fh fhVar = (fh) obj;
            ek.p.a().a(emVar, 1, fhVar.f8089d);
            emVar.a(fhVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fh.class);
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
                if (b2 == 1) {
                    aVar.f8090c.add(ek.p.a(elVar));
                } else {
                    eh c2 = elVar.c();
                    aVar.a(b2, c2, c2.a().a(elVar));
                }
            }
        }
    }
}
