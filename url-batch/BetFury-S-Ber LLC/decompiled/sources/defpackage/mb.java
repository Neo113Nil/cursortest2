package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class mb {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public mb(w9 w9Var) {
        this.a = 1;
        w9Var.getClass();
        this.c = w9Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        mb mbVar = (mb) this.c;
        if (mbVar != null) {
            mbVar.a(i - 64);
        }
    }

    public int b(int i) {
        mb mbVar = (mb) this.c;
        if (mbVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + mbVar.b(i - 64);
    }

    public void c() {
        if (((mb) this.c) == null) {
            this.c = new mb();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((mb) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((mb) this.c).e(i - 64, z);
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
        if (z2 || ((mb) this.c) != null) {
            c();
            ((mb) this.c).e(0, z2);
        }
    }

    public bt f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String y = ((w9) this.c).y(this.b);
            this.b -= y.length();
            if (y.length() == 0) {
                return new bt((String[]) arrayList.toArray(new String[0]));
            }
            int w = mf0.w(y, ':', 1, 4);
            if (w != -1) {
                String substring = y.substring(0, w);
                String substring2 = y.substring(w + 1);
                arrayList.add(substring);
                arrayList.add(mf0.E(substring2).toString());
            } else if (y.charAt(0) == ':') {
                String substring3 = y.substring(1);
                arrayList.add("");
                arrayList.add(mf0.E(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(mf0.E(y).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((mb) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        mb mbVar = (mb) this.c;
        if (mbVar != null) {
            if (mbVar.d(0)) {
                i(63);
            }
            ((mb) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        mb mbVar = (mb) this.c;
        if (mbVar != null) {
            mbVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((mb) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((mb) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((mb) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public mb() {
        this.a = 0;
        this.b = 0L;
    }
}
