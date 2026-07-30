package d5;

import T6.i;
import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import d4.d;
import java.util.List;

/* renamed from: d5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366b extends AbstractC0300f {

    /* renamed from: l, reason: collision with root package name */
    public static final C0365a f4662l;

    /* renamed from: i, reason: collision with root package name */
    public final List f4663i;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4662l = new C0365a(C0366b.class);
    }

    public C0366b(d dVar, i iVar) {
        super(f4662l, iVar);
        this.f4663i = V6.b.E("resource_logs", dVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0366b)) {
            return false;
        }
        C0366b c0366b = (C0366b) obj;
        return a().equals(c0366b.a()) && this.f4663i.equals(c0366b.f4663i);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f4663i.hashCode() + (a().hashCode() * 37);
        this.f4221e = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        List list = this.f4663i;
        if (!list.isEmpty()) {
            sb.append(", resource_logs=");
            sb.append(list);
        }
        StringBuilder replace = sb.replace(0, 2, "ExportLogsServiceRequest{");
        replace.append('}');
        return replace.toString();
    }
}
