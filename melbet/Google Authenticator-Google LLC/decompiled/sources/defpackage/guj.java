package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class guj {
    public final int[] a;
    public final guh b;
    public guh c;
    public int d;
    public int e;
    public int f;

    public guj(int[] iArr) {
        this.a = iArr;
        guh guhVar = new guh(-1, -1);
        this.b = guhVar;
        this.c = guhVar;
    }

    private final void d(guh guhVar, StringBuilder sb) {
        for (guh guhVar2 : guhVar.d.values()) {
            sb.append("  ");
            sb.append(guhVar);
            sb.append(" -> ");
            sb.append(guhVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, guhVar2.a, Math.min(iArr.length, guhVar2.b + 1))));
            sb.append("\"]\n");
            d(guhVar2, sb);
        }
    }

    final void a() {
        guh guhVar = this.c.c;
        if (guhVar != null) {
            this.c = guhVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        guh guhVar = (guh) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (guhVar.b - guhVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = guhVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                guhVar = (guh) guhVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int min = Math.min(length, i2);
            if (min - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
