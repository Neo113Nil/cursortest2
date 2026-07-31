package S;

import g2.C0411g;

/* loaded from: classes.dex */
public final class m extends R1.h implements Y1.e {

    /* renamed from: e, reason: collision with root package name */
    public int[] f3218e;

    /* renamed from: f, reason: collision with root package name */
    public int f3219f;

    /* renamed from: g, reason: collision with root package name */
    public int f3220g;

    /* renamed from: h, reason: collision with root package name */
    public int f3221h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3222i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f3223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, P1.d dVar) {
        super(2, dVar);
        this.f3223j = nVar;
    }

    @Override // R1.a
    public final P1.d create(Object obj, P1.d dVar) {
        m mVar = new m(this.f3223j, dVar);
        mVar.f3222i = obj;
        return mVar;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        return ((m) create((C0411g) obj, (P1.d) obj2)).invokeSuspend(L1.z.f2729a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00cd -> B:7:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // R1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0411g c0411g;
        int[] iArr;
        int length;
        int i3;
        Q1.a aVar;
        C0411g c0411g2;
        int i4;
        C0411g c0411g3;
        int i5;
        int i6 = 64;
        Q1.a aVar2 = Q1.a.f3113d;
        int i7 = this.f3221h;
        n nVar = this.f3223j;
        if (i7 == 0) {
            I2.l.Q(obj);
            c0411g = (C0411g) this.f3222i;
            iArr = nVar.f3228g;
            if (iArr != null) {
                length = iArr.length;
                i3 = 0;
            }
            if (nVar.f3226e != 0) {
                aVar = aVar2;
                if (nVar.f3225d != 0) {
                }
                return L1.z.f2729a;
            }
            c0411g2 = c0411g;
            i4 = 0;
            aVar = aVar2;
            if (i4 >= i6) {
            }
        } else if (i7 == 1) {
            length = this.f3220g;
            int i8 = this.f3219f;
            iArr = this.f3218e;
            c0411g = (C0411g) this.f3222i;
            I2.l.Q(obj);
            i3 = i8 + 1;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.f3219f;
                c0411g3 = (C0411g) this.f3222i;
                I2.l.Q(obj);
                aVar = aVar2;
                i5 = i9 + 1;
                if (i5 < i6) {
                    if ((nVar.f3225d & (1 << i5)) != 0) {
                        Integer num = new Integer(i6 + i5 + nVar.f3227f);
                        this.f3222i = c0411g3;
                        this.f3218e = null;
                        this.f3219f = i5;
                        this.f3221h = 3;
                        c0411g3.b(num, this);
                        Q1.a aVar3 = Q1.a.f3113d;
                        return aVar;
                    }
                    i9 = i5;
                    i5 = i9 + 1;
                    if (i5 < i6) {
                    }
                }
                return L1.z.f2729a;
            }
            i4 = this.f3219f;
            c0411g2 = (C0411g) this.f3222i;
            I2.l.Q(obj);
            aVar = aVar2;
            i4++;
            aVar2 = aVar;
            i6 = 64;
            aVar = aVar2;
            if (i4 >= i6) {
                c0411g = c0411g2;
                if (nVar.f3225d != 0) {
                    c0411g3 = c0411g;
                    i6 = 64;
                    i5 = 0;
                    if (i5 < i6) {
                    }
                }
                return L1.z.f2729a;
            }
            if ((nVar.f3226e & (1 << i4)) != 0) {
                Integer num2 = new Integer(nVar.f3227f + i4);
                this.f3222i = c0411g2;
                this.f3218e = null;
                this.f3219f = i4;
                this.f3221h = 2;
                c0411g2.b(num2, this);
                Q1.a aVar4 = Q1.a.f3113d;
                return aVar;
            }
            i4++;
            aVar2 = aVar;
            i6 = 64;
            aVar = aVar2;
            if (i4 >= i6) {
            }
        }
        if (i3 < length) {
            Integer num3 = new Integer(iArr[i3]);
            this.f3222i = c0411g;
            this.f3218e = iArr;
            this.f3219f = i3;
            this.f3220g = length;
            this.f3221h = 1;
            c0411g.b(num3, this);
            return aVar2;
        }
        if (nVar.f3226e != 0) {
        }
    }
}
