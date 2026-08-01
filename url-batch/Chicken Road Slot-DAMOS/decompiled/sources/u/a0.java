package u;

import kotlin.jvm.functions.Function1;
import v.u0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a0 extends wd.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h0 f9476e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f9477i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(h0 h0Var, i0 i0Var, int i3) {
        super(1);
        this.f9475d = i3;
        this.f9476e = h0Var;
        this.f9477i = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        if (r3.f9477i.f9520a.f9533a != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r3.f9476e.f9517a.f9533a != null) goto L35;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.f9475d) {
            case 0:
                u0 u0Var = (u0) obj;
                w wVar = w.f9555d;
                w wVar2 = w.f9556e;
                if (u0Var.b(wVar, wVar2)) {
                    j0 j0Var = this.f9476e.f9517a.f9533a;
                    return j0Var != null ? j0Var.f9522a : d0.f9499b;
                }
                if (!u0Var.b(wVar2, w.f9557i)) {
                    return d0.f9499b;
                }
                j0 j0Var2 = this.f9477i.f9520a.f9533a;
                return j0Var2 != null ? j0Var2.f9522a : d0.f9499b;
            case 1:
                int ordinal = ((w) obj).ordinal();
                float f3 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            a2.r.p();
                            return null;
                        }
                        break;
                    }
                    f3 = 1.0f;
                }
                return Float.valueOf(f3);
            case 2:
                u0 u0Var2 = (u0) obj;
                w wVar3 = w.f9555d;
                w wVar4 = w.f9556e;
                if (u0Var2.b(wVar3, wVar4)) {
                    return d0.f9499b;
                }
                if (!u0Var2.b(wVar4, w.f9557i)) {
                    return d0.f9499b;
                }
                m0 m0Var = this.f9477i.f9520a;
                return d0.f9499b;
            default:
                int ordinal2 = ((w) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        a2.r.p();
                        return null;
                    }
                    m0 m0Var2 = this.f9477i.f9520a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
