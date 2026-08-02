package V;

import a.AbstractC0132a;

/* loaded from: classes.dex */
public final class k extends b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, String str, String str2) {
        super(2, str, str2);
        this.f1105e = i2;
    }

    @Override // V.c
    public final boolean b() {
        switch (this.f1105e) {
            case 0:
                if (!super.b() || !AbstractC0132a.x("MULTI_PROCESS")) {
                    return false;
                }
                int i2 = U.a.f1086a;
                if (l.f1109d.b()) {
                    return n.f1112a.getStatics().isMultiProcessEnabled();
                }
                throw l.a();
            default:
                if (AbstractC0132a.x("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
