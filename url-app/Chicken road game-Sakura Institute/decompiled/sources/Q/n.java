package Q;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class n extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int[] f3863i;

    /* renamed from: j, reason: collision with root package name */
    public int f3864j;

    /* renamed from: k, reason: collision with root package name */
    public int f3865k;

    /* renamed from: l, reason: collision with root package name */
    public int f3866l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f3867m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o f3868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, C2.a aVar) {
        super(2, aVar);
        this.f3868n = oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((n) j((C2.a) obj2, (T2.i) obj)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        n nVar = new n(this.f3868n, aVar);
        nVar.f3867m = obj;
        return nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00cd -> B:7:0x00ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        T2.i iVar;
        int[] iArr;
        int length;
        int i2;
        D2.a aVar;
        T2.i iVar2;
        int i4;
        T2.i iVar3;
        int i5;
        int i6 = 64;
        D2.a aVar2 = D2.a.f2163d;
        int i7 = this.f3866l;
        o oVar = this.f3868n;
        if (i7 == 0) {
            AbstractC1343r.b(obj);
            iVar = (T2.i) this.f3867m;
            iArr = oVar.f3873j;
            if (iArr != null) {
                length = iArr.length;
                i2 = 0;
            }
            if (oVar.f3871e != 0) {
                aVar = aVar2;
                if (oVar.f3870d != 0) {
                }
                return Unit.f7487a;
            }
            iVar2 = iVar;
            i4 = 0;
            aVar = aVar2;
            if (i4 >= i6) {
            }
        } else if (i7 == 1) {
            length = this.f3865k;
            int i8 = this.f3864j;
            iArr = this.f3863i;
            iVar = (T2.i) this.f3867m;
            AbstractC1343r.b(obj);
            i2 = i8 + 1;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i9 = this.f3864j;
                iVar3 = (T2.i) this.f3867m;
                AbstractC1343r.b(obj);
                aVar = aVar2;
                i5 = i9 + 1;
                if (i5 < i6) {
                    if ((oVar.f3870d & (1 << i5)) != 0) {
                        Integer num = new Integer(i6 + i5 + oVar.f3872i);
                        this.f3867m = iVar3;
                        this.f3863i = null;
                        this.f3864j = i5;
                        this.f3866l = 3;
                        iVar3.b(num, this);
                        D2.a aVar3 = D2.a.f2163d;
                        return aVar;
                    }
                    i9 = i5;
                    i5 = i9 + 1;
                    if (i5 < i6) {
                    }
                }
                return Unit.f7487a;
            }
            i4 = this.f3864j;
            iVar2 = (T2.i) this.f3867m;
            AbstractC1343r.b(obj);
            aVar = aVar2;
            i4++;
            aVar2 = aVar;
            i6 = 64;
            aVar = aVar2;
            if (i4 >= i6) {
                iVar = iVar2;
                if (oVar.f3870d != 0) {
                    iVar3 = iVar;
                    i6 = 64;
                    i5 = 0;
                    if (i5 < i6) {
                    }
                }
                return Unit.f7487a;
            }
            if ((oVar.f3871e & (1 << i4)) != 0) {
                Integer num2 = new Integer(oVar.f3872i + i4);
                this.f3867m = iVar2;
                this.f3863i = null;
                this.f3864j = i4;
                this.f3866l = 2;
                iVar2.b(num2, this);
                D2.a aVar4 = D2.a.f2163d;
                return aVar;
            }
            i4++;
            aVar2 = aVar;
            i6 = 64;
            aVar = aVar2;
            if (i4 >= i6) {
            }
        }
        if (i2 < length) {
            Integer num3 = new Integer(iArr[i2]);
            this.f3867m = iVar;
            this.f3863i = iArr;
            this.f3864j = i2;
            this.f3865k = length;
            this.f3866l = 1;
            iVar.b(num3, this);
            return aVar2;
        }
        if (oVar.f3871e != 0) {
        }
    }
}
