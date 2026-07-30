package e5;

import c4.AbstractC0300f;
import c4.EnumC0298d;
import c4.EnumC0307m;
import d4.C0364b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends AbstractC0300f {

    /* renamed from: o, reason: collision with root package name */
    public static final e f4722o;

    /* renamed from: i, reason: collision with root package name */
    public final String f4723i;

    /* renamed from: l, reason: collision with root package name */
    public final String f4724l;

    /* renamed from: m, reason: collision with root package name */
    public final List f4725m;

    /* renamed from: n, reason: collision with root package name */
    public final List f4726n;

    static {
        EnumC0298d enumC0298d = EnumC0298d.f4212e;
        EnumC0307m enumC0307m = EnumC0307m.f4251e;
        f4722o = new e(f.class);
    }

    public f(String str, String str2, d4.d dVar, d4.d dVar2, T6.i iVar) {
        super(f4722o, iVar);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.f4723i = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.f4724l = str2;
        this.f4725m = V6.b.E("id_keys", dVar);
        this.f4726n = V6.b.E("description_keys", dVar2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return a().equals(fVar.a()) && V6.b.z(this.f4723i, fVar.f4723i) && V6.b.z(this.f4724l, fVar.f4724l) && this.f4725m.equals(fVar.f4725m) && this.f4726n.equals(fVar.f4726n);
    }

    public final int hashCode() {
        int i2 = this.f4221e;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = a().hashCode() * 37;
        String str = this.f4723i;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.f4724l;
        int hashCode3 = this.f4726n.hashCode() + ((this.f4725m.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37)) * 37);
        this.f4221e = hashCode3;
        return hashCode3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f4723i;
        if (str != null) {
            sb.append(", schema_url=");
            sb.append(V6.b.M(str));
        }
        String str2 = this.f4724l;
        if (str2 != null) {
            sb.append(", type=");
            sb.append(V6.b.M(str2));
        }
        List values = this.f4725m;
        if (!values.isEmpty()) {
            sb.append(", id_keys=");
            Intrinsics.checkNotNullParameter(values, "values");
            sb.append(CollectionsKt.s(values, null, "[", "]", C0364b.f4651e, 25));
        }
        List values2 = this.f4726n;
        if (!values2.isEmpty()) {
            sb.append(", description_keys=");
            Intrinsics.checkNotNullParameter(values2, "values");
            sb.append(CollectionsKt.s(values2, null, "[", "]", C0364b.f4651e, 25));
        }
        StringBuilder replace = sb.replace(0, 2, "EntityRef{");
        replace.append('}');
        return replace.toString();
    }
}
