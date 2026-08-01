package A1;

import U0.B;
import p0.k;
import p0.l;
import p0.m;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements B, l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10f;

    public /* synthetic */ a(int i) {
        this.f10f = i;
    }

    @Override // p0.l
    public void a(k kVar, m mVar) {
        switch (this.f10f) {
            case 4:
                kVar.d(mVar);
                break;
            case 5:
                kVar.c(mVar);
                break;
            case 6:
                kVar.f(mVar);
                break;
            case 7:
                kVar.a();
                break;
            default:
                kVar.e();
                break;
        }
    }
}
