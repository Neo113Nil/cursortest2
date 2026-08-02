package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqk {
    public final dqr a;
    public final String b;
    public final ecj c;
    public final int d;

    public dqk(dqr dqrVar, ecj ecjVar, String str, int i) {
        this.a = dqrVar;
        this.c = ecjVar;
        this.b = str;
        this.d = i;
    }

    public static dqk a(dqr dqrVar, String str) {
        return dja.m(dqrVar, str, null, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dqk) {
            dqk dqkVar = (dqk) obj;
            dqr dqrVar = this.a;
            if (dqrVar != null ? dqrVar.equals(dqkVar.a) : dqkVar.a == null) {
                ecj ecjVar = this.c;
                if (ecjVar != null ? ecjVar.equals(dqkVar.c) : dqkVar.c == null) {
                    String str = this.b;
                    if (str != null ? str.equals(dqkVar.b) : dqkVar.b == null) {
                        int i = this.d;
                        if (i != 0 ? i == dqkVar.d : dqkVar.d == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dqr dqrVar = this.a;
        int hashCode = dqrVar == null ? 0 : dqrVar.hashCode();
        ecj ecjVar = this.c;
        int hashCode2 = ecjVar == null ? 0 : ecjVar.hashCode();
        int i = hashCode ^ 1000003;
        String str = this.b;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i2 = this.d;
        return (hashCode3 ^ (i2 != 0 ? i2 : 0)) * 1000003;
    }

    public final String toString() {
        int i = this.d;
        return "RingContent{scalableRingDrawableProvider=" + String.valueOf(this.a) + ", ringDrawableProvider=" + String.valueOf(this.c) + ", contentDescription=" + this.b + ", discAnimationType=" + (i != 0 ? Integer.toString(i - 1) : "null") + ", subscriptionTier=null}";
    }

    public dqk() {
        throw null;
    }
}
