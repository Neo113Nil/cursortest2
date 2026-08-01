package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m0 extends nd.i implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public i[] f10786d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f10787e;

    /* renamed from: i, reason: collision with root package name */
    public e0 f10788i;

    /* renamed from: r, reason: collision with root package name */
    public int f10789r;

    /* renamed from: s, reason: collision with root package name */
    public int f10790s;

    /* renamed from: t, reason: collision with root package name */
    public int f10791t;

    /* renamed from: u, reason: collision with root package name */
    public int f10792u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i[] f10793v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f10794w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e0 f10795x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i[] iVarArr, n0 n0Var, e0 e0Var, ld.a aVar) {
        super(2, aVar);
        this.f10793v = iVarArr;
        this.f10794w = n0Var;
        this.f10795x = e0Var;
    }

    @Override // nd.a
    public final ld.a create(Object obj, ld.a aVar) {
        return new m0(this.f10793v, this.f10794w, this.f10795x, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((b5.j) obj, (ld.a) obj2)).invokeSuspend(Unit.f5554a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (z4.n0.c(r7, r6, r11, r10) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:11:0x0073). Please report as a decompilation issue!!! */
    @Override // nd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        int i3;
        e0 e0Var;
        i[] iVarArr;
        int i10;
        n0 n0Var;
        md.a aVar = md.a.f6622d;
        int i11 = this.f10792u;
        if (i11 == 0) {
            cf.c.M(obj);
            i[] iVarArr2 = this.f10793v;
            length = iVarArr2.length;
            i3 = 0;
            n0 n0Var2 = this.f10794w;
            e0Var = this.f10795x;
            iVarArr = iVarArr2;
            i10 = 0;
            n0Var = n0Var2;
            if (i3 >= length) {
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            length = this.f10791t;
            i3 = this.f10790s;
            int i12 = this.f10789r;
            e0Var = this.f10788i;
            n0Var = this.f10787e;
            iVarArr = this.f10786d;
            cf.c.M(obj);
            i10 = i12;
            i3++;
            if (i3 >= length) {
                int i13 = i10 + 1;
                int ordinal = iVarArr[i3].ordinal();
                if (ordinal == 0) {
                    i10 = i13;
                    i3++;
                    if (i3 >= length) {
                        return Unit.f5554a;
                    }
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            a2.r.p();
                            return null;
                        }
                        this.f10786d = iVarArr;
                        this.f10787e = n0Var;
                        this.f10788i = e0Var;
                        this.f10789r = i13;
                        this.f10790s = i3;
                        this.f10791t = length;
                        this.f10792u = 2;
                        if (n0.d(n0Var, e0Var, i10, this) != aVar) {
                            i12 = i13;
                            i10 = i12;
                        }
                        return aVar;
                    }
                    this.f10786d = iVarArr;
                    this.f10787e = n0Var;
                    this.f10788i = e0Var;
                    this.f10789r = i13;
                    this.f10790s = i3;
                    this.f10791t = length;
                    this.f10792u = 1;
                    i3++;
                    if (i3 >= length) {
                    }
                }
            }
        }
    }
}
