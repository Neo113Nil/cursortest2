package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bai implements Cloneable {
    public final a a = blq.a;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bai clone() {
        try {
            return (bai) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bai)) {
            return false;
        }
        a aVar = this.a;
        a aVar2 = ((bai) obj).a;
        char[] cArr = bmi.a;
        return iwo.b(aVar, aVar2);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
