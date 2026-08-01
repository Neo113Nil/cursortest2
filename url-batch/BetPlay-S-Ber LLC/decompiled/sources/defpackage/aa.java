package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class aa {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public aa(r8 r8Var) {
        this.a = 1;
        r8Var.getClass();
        this.c = r8Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            aaVar.a(i - 64);
        }
    }

    public int b(int i) {
        aa aaVar = (aa) this.c;
        if (aaVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + aaVar.b(i - 64);
    }

    public void c() {
        if (((aa) this.c) == null) {
            this.c = new aa();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((aa) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((aa) this.c).e(i - 64, z);
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
        if (z2 || ((aa) this.c) != null) {
            c();
            ((aa) this.c).e(0, z2);
        }
    }

    public nn f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String f = ((r8) this.c).f(this.b);
            this.b -= f.length();
            if (f.length() == 0) {
                return new nn((String[]) arrayList.toArray(new String[0]));
            }
            int j0 = l40.j0(f, ':', 1, 4);
            if (j0 != -1) {
                String substring = f.substring(0, j0);
                String substring2 = f.substring(j0 + 1);
                arrayList.add(substring);
                arrayList.add(l40.q0(substring2).toString());
            } else if (f.charAt(0) == ':') {
                String substring3 = f.substring(1);
                arrayList.add("");
                arrayList.add(l40.q0(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(l40.q0(f).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((aa) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            if (aaVar.d(0)) {
                i(63);
            }
            ((aa) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        aa aaVar = (aa) this.c;
        if (aaVar != null) {
            aaVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((aa) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((aa) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((aa) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public aa() {
        this.a = 0;
        this.b = 0L;
    }
}
