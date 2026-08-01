package r0;

import android.os.CountDownTimer;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.InterfaceC0298q;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328i extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ GameSessionEntity f3454f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0328i(X0.d dVar, GameActivity gameActivity, GameSessionEntity gameSessionEntity) {
        super(dVar);
        this.f3453e = gameActivity;
        this.f3454f = gameSessionEntity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0328i(dVar, this.f3453e, this.f3454f);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0328i c0328i = (C0328i) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        c0328i.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        GameActivity gameActivity = this.f3453e;
        GameSessionEntity gameSessionEntity = this.f3454f;
        gameActivity.f1711A = gameSessionEntity;
        if (gameSessionEntity.getCurrentQuestionIndex() >= 10) {
            gameActivity.u(gameSessionEntity.getLives() > 0);
        } else {
            GameActivity.t(gameActivity);
            CountDownTimer countDownTimer = gameActivity.f1712B;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            gameActivity.f1712B = new CountDownTimerC0330k(gameActivity).start();
        }
        return U0.i.f864a;
    }
}
