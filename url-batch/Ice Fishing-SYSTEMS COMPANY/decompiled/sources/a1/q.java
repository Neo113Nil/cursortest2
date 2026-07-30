package a1;

import f1.AbstractC4490a;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements InterfaceC0417a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4339b;

    public /* synthetic */ q(int i, Object obj) {
        this.f4338a = i;
        this.f4339b = obj;
    }

    @Override // a1.InterfaceC0417a
    public final void a() {
        switch (this.f4338a) {
            case 0:
                ((r) this.f4339b).f4349k = true;
                break;
            case 1:
                ((r) this.f4339b).f4349k = true;
                break;
            case 2:
                ((r) this.f4339b).f4349k = true;
                break;
            default:
                AbstractC4490a abstractC4490a = (AbstractC4490a) this.f4339b;
                boolean z8 = abstractC4490a.f37571r.l() == 1.0f;
                if (z8 != abstractC4490a.f37577x) {
                    abstractC4490a.f37577x = z8;
                    abstractC4490a.f37568o.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
