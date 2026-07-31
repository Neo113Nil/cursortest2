package S;

import e2.InterfaceC0426e;
import m2.C0657g;

/* loaded from: classes.dex */
public final class m extends X1.h implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public int[] f4226f;

    /* renamed from: g, reason: collision with root package name */
    public int f4227g;

    /* renamed from: h, reason: collision with root package name */
    public int f4228h;

    /* renamed from: i, reason: collision with root package name */
    public int f4229i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4230j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f4231k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, V1.d dVar) {
        super(2, dVar);
        this.f4231k = nVar;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        return ((m) o((V1.d) obj2, (C0657g) obj)).q(R1.y.f4171a);
    }

    @Override // X1.a
    public final V1.d o(V1.d dVar, Object obj) {
        m mVar = new m(this.f4231k, dVar);
        mVar.f4230j = obj;
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c8 -> B:7:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // X1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        C0657g c0657g;
        int[] iArr;
        int length;
        int i3;
        C0657g c0657g2;
        int i4;
        C0657g c0657g3;
        int i5;
        W1.a aVar = W1.a.f4608d;
        int i6 = this.f4229i;
        n nVar = this.f4231k;
        if (i6 == 0) {
            R1.a.e(obj);
            c0657g = (C0657g) this.f4230j;
            iArr = nVar.f4236g;
            if (iArr != null) {
                length = iArr.length;
                i3 = 0;
            }
            if (nVar.f4234e != 0) {
                c0657g2 = c0657g;
                i4 = 0;
                if (i4 >= 64) {
                }
            }
            if (nVar.f4233d != 0) {
            }
            return R1.y.f4171a;
        }
        if (i6 == 1) {
            length = this.f4228h;
            int i7 = this.f4227g;
            iArr = this.f4226f;
            c0657g = (C0657g) this.f4230j;
            R1.a.e(obj);
            i3 = i7 + 1;
        } else {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = this.f4227g;
                c0657g3 = (C0657g) this.f4230j;
                R1.a.e(obj);
                i5 = i8;
                i5++;
                if (i5 < 64) {
                    if ((nVar.f4233d & (1 << i5)) != 0) {
                        Integer num = new Integer(i5 + 64 + nVar.f4235f);
                        this.f4230j = c0657g3;
                        this.f4226f = null;
                        this.f4227g = i5;
                        this.f4229i = 3;
                        c0657g3.b(num, this);
                        return aVar;
                    }
                    i5++;
                    if (i5 < 64) {
                    }
                }
                return R1.y.f4171a;
            }
            i4 = this.f4227g;
            c0657g2 = (C0657g) this.f4230j;
            R1.a.e(obj);
            char c2 = 2;
            i4++;
            if (i4 >= 64) {
                c0657g = c0657g2;
                if (nVar.f4233d != 0) {
                    c0657g3 = c0657g;
                    i5 = 0;
                    if (i5 < 64) {
                    }
                }
                return R1.y.f4171a;
            }
            if ((nVar.f4234e & (1 << i4)) != 0) {
                Integer num2 = new Integer(nVar.f4235f + i4);
                this.f4230j = c0657g2;
                this.f4226f = null;
                this.f4227g = i4;
                this.f4229i = 2;
                c0657g2.b(num2, this);
                return aVar;
            }
            c2 = 2;
            i4++;
            if (i4 >= 64) {
            }
        }
        if (i3 < length) {
            Integer num3 = new Integer(iArr[i3]);
            this.f4230j = c0657g;
            this.f4226f = iArr;
            this.f4227g = i3;
            this.f4228h = length;
            this.f4229i = 1;
            c0657g.b(num3, this);
            return aVar;
        }
        if (nVar.f4234e != 0) {
        }
        if (nVar.f4233d != 0) {
        }
        return R1.y.f4171a;
    }
}
