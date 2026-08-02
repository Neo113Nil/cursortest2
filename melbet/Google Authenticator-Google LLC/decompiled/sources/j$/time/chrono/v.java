package j$.time.chrono;

import j$.time.Instant;
import j$.time.temporal.Temporal;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-2752cf38da47f0d75abdb97c37b25637dca0f8b8c0f6d2b14913d7d174dcc614 */
/* loaded from: classes3.dex */
public final class v extends a implements Serializable {
    public static final v c = new v();
    private static final long serialVersionUID = 459996390165777884L;

    private v() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.a
    public final b f(Temporal temporal) {
        return temporal instanceof x ? (x) temporal : new x(j$.time.j.v(temporal));
    }

    @Override // j$.time.chrono.a
    public final m g(int i) {
        return y.v(i);
    }

    @Override // j$.time.chrono.a
    public final String h() {
        return "japanese";
    }

    @Override // j$.time.chrono.a
    public final String j() {
        return "Japanese";
    }

    @Override // j$.time.chrono.a
    public final j$.time.temporal.q o(j$.time.temporal.a aVar) {
        switch (u.a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                j$.time.i.a("Unsupported field: ".concat(String.valueOf(aVar)));
                return null;
            case 5:
                y[] yVarArr = y.e;
                int i = yVarArr[yVarArr.length - 1].b.a;
                int i2 = 1000000000 - yVarArr[yVarArr.length - 1].b.a;
                int i3 = yVarArr[0].b.a;
                for (int i4 = 1; i4 < yVarArr.length; i4++) {
                    y yVar = yVarArr[i4];
                    i2 = Math.min(i2, (yVar.b.a - i3) + 1);
                    i3 = yVar.b.a;
                }
                return j$.time.temporal.q.g(i2, 999999999 - i);
            case 6:
                y yVar2 = y.d;
                long j = j$.time.temporal.a.DAY_OF_YEAR.b.c;
                for (y yVar3 : y.e) {
                    j = Math.min(j, ((yVar3.b.B() ? 366 : 365) - yVar3.b.y()) + 1);
                    if (yVar3.u() != null) {
                        j = Math.min(j, yVar3.u().b.y() - 1);
                    }
                }
                return j$.time.temporal.q.g(j, j$.time.temporal.a.DAY_OF_YEAR.b.d);
            case 7:
                return j$.time.temporal.q.f(x.d.a, 999999999L);
            case 8:
                long j2 = y.d.a;
                y[] yVarArr2 = y.e;
                return j$.time.temporal.q.f(j2, yVarArr2[yVarArr2.length - 1].a);
            default:
                return aVar.b;
        }
    }

    @Override // j$.time.chrono.a
    public final j u(Instant instant, j$.time.b0 b0Var) {
        return l.u(this, instant, b0Var);
    }

    public Object writeReplace() {
        return new e0((byte) 1, this);
    }
}
