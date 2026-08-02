package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ebr {
    public final boolean a;

    public ebr(boolean z) {
        this.a = z;
    }

    public static ebq a() {
        ebq ebqVar = new ebq();
        ebqVar.a = true;
        ebqVar.b = (byte) 3;
        return ebqVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ebr) && this.a == ((ebr) obj).a;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "Configuration{showSwitchProfileAction=" + this.a + ", disableDecorationFeatures=false}";
    }

    public ebr() {
        throw null;
    }
}
