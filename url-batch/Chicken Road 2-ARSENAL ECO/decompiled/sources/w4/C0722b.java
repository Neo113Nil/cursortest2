package w4;

import A3.c;
import java.util.List;
import n6.i;
import z3.d;
import z3.f;
import z3.m;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722b extends f {

    /* renamed from: i, reason: collision with root package name */
    public static final C0721a f6196i;

    /* renamed from: h, reason: collision with root package name */
    public final List f6197h;

    static {
        d dVar = d.f6297g;
        m mVar = m.f6336g;
        f6196i = new C0721a(C0722b.class);
    }

    public C0722b(A3.d dVar, i iVar) {
        super(f6196i, iVar);
        this.f6197h = c.R(dVar, "resource_logs");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0722b)) {
            return false;
        }
        C0722b c0722b = (C0722b) obj;
        return a().equals(c0722b.a()) && this.f6197h.equals(c0722b.f6197h);
    }

    public final int hashCode() {
        int i7 = this.f6306g;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = this.f6197h.hashCode() + (a().hashCode() * 37);
        this.f6306g = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f6197h;
        if (!list.isEmpty()) {
            sb.append(", resource_logs=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ExportLogsServiceRequest{");
        replace.append('}');
        return replace.toString();
    }
}
