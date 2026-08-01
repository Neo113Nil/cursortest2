package r0;

import android.os.CountDownTimer;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.db.GameSessionEntity;
import o1.InterfaceC0298q;

/* renamed from: r0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326g extends Z0.e implements f1.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3449e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0326g(GameActivity gameActivity, X0.d dVar) {
        super(dVar);
        this.f3449e = gameActivity;
    }

    @Override // Z0.e
    public final X0.d a(Object obj, X0.d dVar) {
        return new C0326g(this.f3449e, dVar);
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        C0326g c0326g = (C0326g) a((InterfaceC0298q) obj, (X0.d) obj2);
        U0.i iVar = U0.i.f864a;
        c0326g.i(iVar);
        return iVar;
    }

    @Override // Z0.e
    public final Object i(Object obj) {
        T.d.Q(obj);
        GameActivity gameActivity = this.f3449e;
        GameSessionEntity gameSessionEntity = gameActivity.f1711A;
        U0.i iVar = U0.i.f864a;
        if (gameSessionEntity == null) {
            gameActivity.finish();
            return iVar;
        }
        GameActivity.t(gameActivity);
        CountDownTimer countDownTimer = gameActivity.f1712B;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        gameActivity.f1712B = new CountDownTimerC0330k(gameActivity).start();
        return iVar;
    }
}
