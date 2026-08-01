package K;

import com.luckyarcade.spinthrow.GameConfig;

/* renamed from: K.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0011g implements K0.E, j0.l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f441f;

    public /* synthetic */ C0011g(int i) {
        this.f441f = i;
    }

    @Override // j0.l
    public void a(j0.k kVar, j0.m mVar) {
        switch (this.f441f) {
            case GameConfig.COMBO_EVERY /* 3 */:
                kVar.f(mVar);
                break;
            case 4:
                kVar.d(mVar);
                break;
            case 5:
                kVar.a(mVar);
                break;
            case 6:
                kVar.b();
                break;
            default:
                kVar.e();
                break;
        }
    }
}
