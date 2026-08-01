package V0;

import com.winfour.neondrop.ui.GameActivity;
import f1.InterfaceC0099a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0099a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f926a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GameActivity f927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U0.f f928c;

    public /* synthetic */ b(GameActivity gameActivity, U0.f fVar, int i) {
        this.f926a = i;
        this.f927b = gameActivity;
        this.f928c = fVar;
    }

    @Override // f1.InterfaceC0099a
    public final Object a() {
        GameActivity gameActivity = this.f927b;
        U0.f fVar = this.f928c;
        switch (this.f926a) {
            case 0:
                int i = GameActivity.f2101G;
                gameActivity.w(fVar);
                break;
            default:
                int i2 = GameActivity.f2101G;
                gameActivity.w(fVar);
                break;
        }
        return W0.e.f956c;
    }
}
