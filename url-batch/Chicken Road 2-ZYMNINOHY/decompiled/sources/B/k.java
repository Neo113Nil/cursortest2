package B;

import E1.N;
import T.C0096n;
import T.C0097o;
import W.AbstractC0110c;
import f1.A;
import f1.B;
import f1.C0414b;
import f1.C0417e;
import f1.C0418f;
import f1.F;
import f1.p;
import f1.r;
import f1.s;
import f1.t;
import f1.u;
import f1.v;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f176a;

    /* renamed from: b, reason: collision with root package name */
    public final List f177b;

    public k(int i4, List list) {
        this.f176a = i4;
        this.f177b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F a(int i4, N n) {
        String str = (String) n.f514d;
        if (i4 != 2) {
            if (i4 == 3 || i4 == 4) {
                return new v(new t(str, n.b(), "video/mp2t"));
            }
            if (i4 == 21) {
                return new v(new f1.g());
            }
            if (i4 == 27) {
                if (c(4)) {
                    return null;
                }
                return new v(new p(new B(0, b(n)), c(1), c(8)));
            }
            if (i4 == 36) {
                return new v(new r(new B(0, b(n))));
            }
            if (i4 == 45) {
                return new v(new u());
            }
            if (i4 == 89) {
                return new v(new f1.g((List) n.f512b));
            }
            if (i4 == 172) {
                return new v(new C0414b(n.b(), 1, str, "video/mp2t"));
            }
            if (i4 == 257) {
                return new A(new B1.j("application/vnd.dvb.ait", 18));
            }
            if (i4 != 138) {
                if (i4 == 139) {
                    return new v(new C0418f(str, n.b(), 5408));
                }
                switch (i4) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new v(new C0417e(n.b(), str, "video/mp2t", false));
                    case 16:
                        return new v(new f1.m(new B(1, b(n))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new v(new s(str, n.b()));
                    default:
                        switch (i4) {
                            case 128:
                                break;
                            case 129:
                                return new v(new C0414b(n.b(), 0, str, "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i4) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new A(new B1.j("application/x-scte35", 18));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new v(new C0418f(str, n.b(), 4096));
        }
        return new v(new f1.j(new B(1, b(n)), "video/mp2t"));
    }

    public List b(N n) {
        String str;
        int i4;
        List list;
        boolean c4 = c(32);
        List list2 = this.f177b;
        if (c4) {
            return list2;
        }
        W.u uVar = new W.u((byte[]) n.f513c);
        while (uVar.a() > 0) {
            int z = uVar.z();
            int z4 = uVar.f3352b + uVar.z();
            if (z == 134) {
                ArrayList arrayList = new ArrayList();
                int z5 = uVar.z() & 31;
                for (int i5 = 0; i5 < z5; i5++) {
                    String x4 = uVar.x(3, StandardCharsets.UTF_8);
                    int z6 = uVar.z();
                    boolean z7 = (z6 & 128) != 0;
                    if (z7) {
                        i4 = z6 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i4 = 1;
                    }
                    byte z8 = (byte) uVar.z();
                    uVar.N(1);
                    if (z7) {
                        boolean z9 = (z8 & 64) != 0;
                        byte[] bArr = AbstractC0110c.f3295a;
                        list = Collections.singletonList(z9 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C0096n c0096n = new C0096n();
                    c0096n.f2831m = T.F.n(str);
                    c0096n.f2822d = x4;
                    c0096n.f2815J = i4;
                    c0096n.f2832p = list;
                    arrayList.add(new C0097o(c0096n));
                }
                list2 = arrayList;
            }
            uVar.M(z4);
        }
        return list2;
    }

    public boolean c(int i4) {
        return (i4 & this.f176a) != 0;
    }

    public k() {
        this.f176a = 1;
        this.f177b = Collections.singletonList(null);
    }

    public k(ArrayList arrayList) {
        this.f176a = 0;
        this.f177b = arrayList;
    }
}
