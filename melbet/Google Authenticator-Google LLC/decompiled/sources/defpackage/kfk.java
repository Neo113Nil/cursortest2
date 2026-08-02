package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfk {
    public String a = "unknown-authority";
    public jwt b = jwt.a;
    public String c;
    public jyg d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof kfk)) {
            return false;
        }
        kfk kfkVar = (kfk) obj;
        return this.a.equals(kfkVar.a) && this.b.equals(kfkVar.b) && Objects.equals(this.c, kfkVar.c) && Objects.equals(this.d, kfkVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }
}
