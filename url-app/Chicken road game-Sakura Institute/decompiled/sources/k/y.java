package k;

import com.android.installreferrer.api.InstallReferrerClient;
import l.l1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class y extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h0 f5289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0 f5290i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(h0 h0Var, i0 i0Var, int i7) {
        super(1);
        this.f5288g = i7;
        this.f5289h = h0Var;
        this.f5290i = i0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r3.f5290i.f5225a.f5257a != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        if (r3.f5289h.f5222a.f5257a != null) goto L37;
     */
    @Override // q6.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj) {
        switch (this.f5288g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                l1 l1Var = (l1) obj;
                w wVar = w.f5278f;
                w wVar2 = w.f5279g;
                if (l1Var.a(wVar, wVar2)) {
                    j0 j0Var = this.f5289h.f5222a.f5257a;
                    return j0Var != null ? j0Var.f5227a : b0.f5177b;
                }
                if (!l1Var.a(wVar2, w.f5280h)) {
                    return b0.f5177b;
                }
                j0 j0Var2 = this.f5290i.f5225a.f5257a;
                return j0Var2 != null ? j0Var2.f5227a : b0.f5177b;
            case 1:
                int ordinal = ((w) obj).ordinal();
                float f9 = 0.0f;
                if (ordinal == 0) {
                    break;
                } else {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new b4.c();
                        }
                        break;
                    }
                    f9 = 1.0f;
                }
                return Float.valueOf(f9);
            case 2:
                l1 l1Var2 = (l1) obj;
                w wVar3 = w.f5278f;
                w wVar4 = w.f5279g;
                if (l1Var2.a(wVar3, wVar4)) {
                    return b0.f5177b;
                }
                if (!l1Var2.a(wVar4, w.f5280h)) {
                    return b0.f5177b;
                }
                q0 q0Var = this.f5290i.f5225a;
                return b0.f5177b;
            default:
                int ordinal2 = ((w) obj).ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new b4.c();
                    }
                    q0 q0Var2 = this.f5290i.f5225a;
                }
                return Float.valueOf(1.0f);
        }
    }
}
