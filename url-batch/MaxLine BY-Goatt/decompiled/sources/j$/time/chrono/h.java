package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class h implements j$.time.temporal.p, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final m a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.time.b.c(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public h(m mVar, int i, int i2, int i3) {
        this.a = mVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.a.equals(hVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar.b(j$.time.temporal.r.b);
        if (mVar2 != null && !this.a.equals(mVar2)) {
            j$.time.h.f("Chronology mismatch, expected: ", this.a.q(), ", actual: ", mVar2.q());
            return null;
        }
        if (this.c == 0) {
            int i = this.b;
            if (i != 0) {
                mVar = mVar.l(i, j$.time.temporal.b.YEARS);
            }
        } else {
            j$.time.temporal.u z = this.a.z(j$.time.temporal.a.MONTH_OF_YEAR);
            long j = (z.a == z.b && z.c == z.d && z.d()) ? (z.d - z.a) + 1 : -1L;
            int i2 = this.b;
            if (j > 0) {
                mVar = mVar.l((i2 * j) + this.c, j$.time.temporal.b.MONTHS);
            } else {
                if (i2 != 0) {
                    mVar = mVar.l(i2, j$.time.temporal.b.YEARS);
                }
                mVar = mVar.l(this.c, j$.time.temporal.b.MONTHS);
            }
        }
        int i3 = this.d;
        return i3 != 0 ? mVar.l(i3, j$.time.temporal.b.DAYS) : mVar;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }
}
