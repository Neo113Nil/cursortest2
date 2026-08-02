package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eaz {
    public final int a;
    public final int b;
    public final int c;

    public eaz(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaz) {
            eaz eazVar = (eaz) obj;
            if (this.a == eazVar.a && this.b == eazVar.b && this.c == eazVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "CardVisualElementsInfo{cardCellId=" + this.a + ", cardMainActionId=" + this.b + ", cardSecondaryActionId=" + this.c + "}";
    }

    public eaz() {
        throw null;
    }
}
