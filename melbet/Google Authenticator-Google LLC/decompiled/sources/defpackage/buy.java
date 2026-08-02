package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class buy {
    public final int a;
    public final int b;
    public final int c;
    public final gxq d;

    public buy(int i, int i2, int i3, gxq gxqVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = gxqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof buy) {
            buy buyVar = (buy) obj;
            if (this.a == buyVar.a && this.b == buyVar.b && this.c == buyVar.c && this.d.equals(buyVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        gxq gxqVar = this.d;
        return ((this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ gxqVar.hashCode();
    }

    public final String toString() {
        return "FabItem{text=" + this.a + ", drawableIcon=" + this.b + ", fabTag=" + this.c + ", event=" + this.d.toString() + "}";
    }

    public buy() {
        throw null;
    }
}
