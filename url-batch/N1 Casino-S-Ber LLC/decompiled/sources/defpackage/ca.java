package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ca {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public ca(w8 w8Var) {
        this.a = 1;
        w8Var.getClass();
        this.c = w8Var;
        this.b = 262144L;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        ca caVar = (ca) this.c;
        if (caVar != null) {
            caVar.a(i - 64);
        }
    }

    public int b(int i) {
        ca caVar = (ca) this.c;
        if (caVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + caVar.b(i - 64);
    }

    public void c() {
        if (((ca) this.c) == null) {
            this.c = new ca();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((ca) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((ca) this.c).e(i - 64, z);
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
        if (z2 || ((ca) this.c) != null) {
            c();
            ((ca) this.c).e(0, z2);
        }
    }

    public ym f() {
        ArrayList arrayList = new ArrayList(20);
        while (true) {
            String f = ((w8) this.c).f(this.b);
            this.b -= f.length();
            if (f.length() == 0) {
                return new ym((String[]) arrayList.toArray(new String[0]));
            }
            int r0 = c40.r0(f, ':', 1, 4);
            if (r0 != -1) {
                String substring = f.substring(0, r0);
                String substring2 = f.substring(r0 + 1);
                arrayList.add(substring);
                arrayList.add(c40.y0(substring2).toString());
            } else if (f.charAt(0) == ':') {
                String substring3 = f.substring(1);
                arrayList.add("");
                arrayList.add(c40.y0(substring3).toString());
            } else {
                arrayList.add("");
                arrayList.add(c40.y0(f).toString());
            }
        }
    }

    public boolean g(int i) {
        if (i >= 64) {
            c();
            return ((ca) this.c).g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        ca caVar = (ca) this.c;
        if (caVar != null) {
            if (caVar.d(0)) {
                i(63);
            }
            ((ca) this.c).g(0);
        }
        return z;
    }

    public void h() {
        this.b = 0L;
        ca caVar = (ca) this.c;
        if (caVar != null) {
            caVar.h();
        }
    }

    public void i(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((ca) this.c).i(i - 64);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((ca) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((ca) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public ca() {
        this.a = 0;
        this.b = 0L;
    }
}
