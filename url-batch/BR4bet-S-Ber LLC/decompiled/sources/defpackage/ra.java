package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ra {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public ra(j9 j9Var) {
        this.a = 1;
        j9Var.getClass();
        this.c = j9Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        ra raVar = (ra) this.c;
        if (raVar != null) {
            raVar.a(i - 64);
        }
    }

    public int b(int i) {
        ra raVar = (ra) this.c;
        if (raVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + raVar.b(i - 64);
    }

    public void c() {
        if (((ra) this.c) == null) {
            this.c = new ra();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((ra) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((ra) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            i(i);
        } else {
            a(i);
        }
        if (z2 || ((ra) this.c) != null) {
            c();
            ((ra) this.c).e(0, z2);
        }
    }

    public kp f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String i = ((j9) this.c).i(this.b);
            this.b -= i.length();
            if (i.length() == 0) {
                return new kp((String[]) arrayList.toArray(new String[0]));
            }
            int Z = f70.Z(i, ':', 1, 4);
            if (Z != -1) {
                String substring = i.substring(0, Z);
                String substring2 = i.substring(Z + 1);
                arrayList.add(substring);
                arrayList.add(f70.g0(substring2).toString());
            } else if (i.charAt(0) == ':') {
                String substring3 = i.substring(1);
                arrayList.add("");
                arrayList.add(f70.g0(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(f70.g0(i).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((ra) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        ra raVar = (ra) this.c;
        if (raVar != null) {
            if (raVar.d(0)) {
                i(63);
            }
            ((ra) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        ra raVar = (ra) this.c;
        if (raVar != null) {
            raVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((ra) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((ra) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((ra) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public ra() {
        this.a = 0;
        this.b = 0L;
    }
}
