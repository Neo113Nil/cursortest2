package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ftp {
    public final int a;
    public int b;

    public ftp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftp)) {
            return false;
        }
        ftp ftpVar = (ftp) obj;
        return this.a == ftpVar.a && this.b == ftpVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "ActiveCallbacks(callbacksId=" + this.a + ", callbacksState=" + this.b + ")";
    }
}
