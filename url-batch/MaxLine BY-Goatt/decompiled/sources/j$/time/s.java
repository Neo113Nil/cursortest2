package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class s implements j$.time.temporal.p, Serializable {
    public static final s d = new s(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.c(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public s(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static s a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? d : new s(i, i2, i3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new t((byte) 14, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.a == sVar.a && this.b == sVar.b && this.c == sVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        j$.time.chrono.m mVar2 = (j$.time.chrono.m) mVar.b(j$.time.temporal.r.b);
        if (mVar2 != null && !j$.time.chrono.t.c.equals(mVar2)) {
            throw new c("Chronology mismatch, expected: ISO, actual: " + mVar2.q());
        }
        int i = this.b;
        int i2 = this.a;
        if (i != 0) {
            long j = (i2 * 12) + i;
            if (j != 0) {
                mVar = mVar.l(j, j$.time.temporal.b.MONTHS);
            }
        } else if (i2 != 0) {
            mVar = mVar.l(i2, j$.time.temporal.b.YEARS);
        }
        int i3 = this.c;
        return i3 != 0 ? mVar.l(i3, j$.time.temporal.b.DAYS) : mVar;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
