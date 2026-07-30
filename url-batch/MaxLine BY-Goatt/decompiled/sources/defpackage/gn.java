package defpackage;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.reflect.Array;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gn {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public gn(int i, int i2) {
        this.a = 0;
        this.e = new r5[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((r5[]) this.e)[i3] = new r5(((i2 + 4) * 17) + 1, 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public void A(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.A()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.A()));
        } while (ivVar.c() < c);
        C(c);
    }

    public void B(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Long.valueOf(ivVar.B()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Long.valueOf(ivVar.B()));
        } while (ivVar.c() < c);
        C(c);
    }

    public void C(int i) {
        if (((iv) this.e).c() != i) {
            throw u41.e();
        }
    }

    public void D(int i) {
        if ((this.b & 7) != i) {
            throw u41.b();
        }
    }

    public boolean E() {
        int i;
        iv ivVar = (iv) this.e;
        if (ivVar.d() || (i = this.b) == this.c) {
            return false;
        }
        return ivVar.C(i);
    }

    public void a(j10 j10Var) {
        Object[] objArr = (Object[]) this.e;
        int i = this.c;
        objArr[i] = j10Var;
        int i2 = this.d & (i + 1);
        this.c = i2;
        int i3 = this.b;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i5];
            ni.e(0, i3, length, objArr, objArr2);
            ni.e(i4, 0, this.b, (Object[]) this.e, objArr2);
            this.e = objArr2;
            this.b = 0;
            this.c = length;
            this.d = i5 - 1;
        }
    }

    public ah2 b(int i) {
        return new ah2(mh2.j((bw2) this.e, i), i, 1L);
    }

    public int c() {
        return this.d - this.c;
    }

    public r5 d() {
        return ((r5[]) this.e)[this.b];
    }

    public int e() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = ((iv) this.e).z();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int f(int i) {
        return ((rw1) this.e).u[this.c + i];
    }

    public Object g(int i) {
        return ((rw1) this.e).w[this.d + i];
    }

    public byte[][] h(int i, int i2) {
        int i3 = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.d * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = (byte[]) ((r5[]) this.e)[i4 / i2].b;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public void i(Object obj, se2 se2Var, wj0 wj0Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            se2Var.e(obj, this, wj0Var);
            if (this.b == this.c) {
            } else {
                throw new u41("Failed to parse the message.");
            }
        } finally {
            this.c = i;
        }
    }

    public void j(Object obj, se2 se2Var, wj0 wj0Var) {
        iv ivVar = (iv) this.e;
        int A = ivVar.A();
        if (ivVar.m >= 100) {
            throw new u41("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int j = ivVar.j(A);
        ivVar.m++;
        se2Var.e(obj, this, wj0Var);
        ivVar.b(0);
        ivVar.m--;
        ivVar.i(j);
    }

    public void k(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Boolean.valueOf(ivVar.k()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Boolean.valueOf(ivVar.k()));
        } while (ivVar.c() < c);
        C(c);
    }

    public er l() {
        D(2);
        return ((iv) this.e).l();
    }

    public void m(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        if ((this.b & 7) != 2) {
            throw u41.b();
        }
        do {
            ((r52) e41Var).add(l());
            if (ivVar.d()) {
                return;
            } else {
                z = ivVar.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void n(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((r52) e41Var).add(Double.valueOf(ivVar.m()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int A = ivVar.A();
        if ((A & 7) != 0) {
            throw new u41("Failed to parse the message.");
        }
        int c = ivVar.c() + A;
        do {
            ((r52) e41Var).add(Double.valueOf(ivVar.m()));
        } while (ivVar.c() < c);
    }

    public void o(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.n()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.n()));
        } while (ivVar.c() < c);
        C(c);
    }

    public Object p(y83 y83Var, Class cls, wj0 wj0Var) {
        iv ivVar = (iv) this.e;
        switch (y83Var.ordinal()) {
            case 0:
                D(1);
                return Double.valueOf(ivVar.m());
            case 1:
                D(5);
                return Float.valueOf(ivVar.q());
            case 2:
                D(0);
                return Long.valueOf(ivVar.s());
            case 3:
                D(0);
                return Long.valueOf(ivVar.B());
            case 4:
                D(0);
                return Integer.valueOf(ivVar.r());
            case 5:
                D(1);
                return Long.valueOf(ivVar.p());
            case 6:
                D(5);
                return Integer.valueOf(ivVar.o());
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                D(0);
                return Boolean.valueOf(ivVar.k());
            case 8:
                D(2);
                return ivVar.y();
            case 9:
            default:
                lh.e("unsupported field type.");
                return null;
            case 10:
                D(2);
                se2 a = q52.c.a(cls);
                vu0 h = a.h();
                j(h, a, wj0Var);
                a.c(h);
                return h;
            case 11:
                return l();
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                D(0);
                return Integer.valueOf(ivVar.A());
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                D(0);
                return Integer.valueOf(ivVar.n());
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                D(5);
                return Integer.valueOf(ivVar.t());
            case 15:
                D(1);
                return Long.valueOf(ivVar.u());
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                D(0);
                return Integer.valueOf(ivVar.v());
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                D(0);
                return Long.valueOf(ivVar.w());
        }
    }

    public void q(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = ivVar.A();
            if ((A & 3) != 0) {
                throw new u41("Failed to parse the message.");
            }
            int c = ivVar.c() + A;
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.o()));
            } while (ivVar.c() < c);
            return;
        }
        if (i != 5) {
            throw u41.b();
        }
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.o()));
            if (ivVar.d()) {
                return;
            } else {
                z = ivVar.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void r(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((r52) e41Var).add(Long.valueOf(ivVar.p()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int A = ivVar.A();
        if ((A & 7) != 0) {
            throw new u41("Failed to parse the message.");
        }
        int c = ivVar.c() + A;
        do {
            ((r52) e41Var).add(Long.valueOf(ivVar.p()));
        } while (ivVar.c() < c);
    }

    public void s(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = ivVar.A();
            if ((A & 3) != 0) {
                throw new u41("Failed to parse the message.");
            }
            int c = ivVar.c() + A;
            do {
                ((r52) e41Var).add(Float.valueOf(ivVar.q()));
            } while (ivVar.c() < c);
            return;
        }
        if (i != 5) {
            throw u41.b();
        }
        do {
            ((r52) e41Var).add(Float.valueOf(ivVar.q()));
            if (ivVar.d()) {
                return;
            } else {
                z = ivVar.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void t(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.r()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.r()));
        } while (ivVar.c() < c);
        C(c);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return BuildConfig.FLAVOR;
            case 4:
            default:
                return super.toString();
            case 5:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                bw2 bw2Var = (bw2) this.e;
                sb.append(mh2.j(bw2Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(mh2.j(bw2Var, i2));
                sb.append("), prevOffset=");
                return q40.o(sb, this.d, ')');
        }
    }

    public void u(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Long.valueOf(ivVar.s()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Long.valueOf(ivVar.s()));
        } while (ivVar.c() < c);
        C(c);
    }

    public void v(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int A = ivVar.A();
            if ((A & 3) != 0) {
                throw new u41("Failed to parse the message.");
            }
            int c = ivVar.c() + A;
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.t()));
            } while (ivVar.c() < c);
            return;
        }
        if (i != 5) {
            throw u41.b();
        }
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.t()));
            if (ivVar.d()) {
                return;
            } else {
                z = ivVar.z();
            }
        } while (z == this.b);
        this.d = z;
    }

    public void w(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                ((r52) e41Var).add(Long.valueOf(ivVar.u()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int A = ivVar.A();
        if ((A & 7) != 0) {
            throw new u41("Failed to parse the message.");
        }
        int c = ivVar.c() + A;
        do {
            ((r52) e41Var).add(Long.valueOf(ivVar.u()));
        } while (ivVar.c() < c);
    }

    public void x(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Integer.valueOf(ivVar.v()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Integer.valueOf(ivVar.v()));
        } while (ivVar.c() < c);
        C(c);
    }

    public void y(e41 e41Var) {
        int z;
        iv ivVar = (iv) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                ((r52) e41Var).add(Long.valueOf(ivVar.w()));
                if (ivVar.d()) {
                    return;
                } else {
                    z = ivVar.z();
                }
            } while (z == this.b);
            this.d = z;
            return;
        }
        if (i != 2) {
            throw u41.b();
        }
        int c = ivVar.c() + ivVar.A();
        do {
            ((r52) e41Var).add(Long.valueOf(ivVar.w()));
        } while (ivVar.c() < c);
        C(c);
    }

    public void z(e41 e41Var, boolean z) {
        String x;
        int z2;
        iv ivVar = (iv) this.e;
        if ((this.b & 7) != 2) {
            throw u41.b();
        }
        do {
            if (z) {
                D(2);
                x = ivVar.y();
            } else {
                D(2);
                x = ivVar.x();
            }
            ((r52) e41Var).add(x);
            if (ivVar.d()) {
                return;
            } else {
                z2 = ivVar.z();
            }
        } while (z2 == this.b);
        this.d = z2;
    }

    public /* synthetic */ gn(int i) {
        this.a = i;
    }

    public gn(iv ivVar) {
        this.a = 2;
        this.d = 0;
        Charset charset = f41.a;
        this.e = ivVar;
        ivVar.n = this;
    }

    public gn(rw1 rw1Var) {
        this.a = 4;
        this.e = rw1Var;
    }

    public gn(int i, int i2, int i3, bw2 bw2Var) {
        this.a = 5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bw2Var;
    }
}
