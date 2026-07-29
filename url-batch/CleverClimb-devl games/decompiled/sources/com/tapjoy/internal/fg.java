package com.tapjoy.internal;

import com.tapjoy.internal.ei;
import java.util.List;

/* loaded from: classes2.dex */
public final class fg extends ei {

    /* renamed from: c, reason: collision with root package name */
    public static final ek f8085c = new b();

    /* renamed from: d, reason: collision with root package name */
    public final List f8086d;

    public fg(List list) {
        this(list, iv.f8418b);
    }

    public fg(List list, iv ivVar) {
        super(f8085c, ivVar);
        this.f8086d = ep.a("pushes", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fg)) {
            return false;
        }
        fg fgVar = (fg) obj;
        return a().equals(fgVar.a()) && this.f8086d.equals(fgVar.f8086d);
    }

    public final int hashCode() {
        int i = this.f7997b;
        if (i != 0) {
            return i;
        }
        int hashCode = (a().hashCode() * 37) + this.f8086d.hashCode();
        this.f7997b = hashCode;
        return hashCode;
    }

    @Override // com.tapjoy.internal.ei
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f8086d.isEmpty()) {
            sb.append(", pushes=");
            sb.append(this.f8086d);
        }
        StringBuilder replace = sb.replace(0, 2, "PushList{");
        replace.append('}');
        return replace.toString();
    }

    public static final class a extends ei.a {

        /* renamed from: c, reason: collision with root package name */
        public List f8087c = ep.a();

        public final fg b() {
            return new fg(this.f8087c, super.a());
        }
    }

    static final class b extends ek {
        @Override // com.tapjoy.internal.ek
        public final /* synthetic */ int a(Object obj) {
            fg fgVar = (fg) obj;
            return ff.f8081c.a().a(1, fgVar.f8086d) + fgVar.a().c();
        }

        @Override // com.tapjoy.internal.ek
        public final /* bridge */ /* synthetic */ void a(em emVar, Object obj) {
            fg fgVar = (fg) obj;
            ff.f8081c.a().a(emVar, 1, fgVar.f8086d);
            emVar.a(fgVar.a());
        }

        b() {
            super(eh.LENGTH_DELIMITED, fg.class);
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
                    aVar.f8087c.add(ff.f8081c.a(elVar));
                } else {
                    eh c2 = elVar.c();
                    aVar.a(b2, c2, c2.a().a(elVar));
                }
            }
        }
    }
}
