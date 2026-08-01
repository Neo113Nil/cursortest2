package O0;

import android.os.CountDownTimer;
import com.neonpulse.gridlogic.GameplayActivity;
import com.neonpulse.gridlogic.R;

/* loaded from: classes.dex */
public final class c extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameplayActivity f672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(GameplayActivity gameplayActivity, long j2) {
        super(j2, 1000L);
        this.f672a = gameplayActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        GameplayActivity gameplayActivity = this.f672a;
        gameplayActivity.f1969D = 0;
        if (gameplayActivity.F) {
            return;
        }
        int i = gameplayActivity.f1967B - 1;
        gameplayActivity.f1967B = i;
        if (i <= 0) {
            gameplayActivity.u(false);
            return;
        }
        gameplayActivity.t().d.c();
        V0.d dVar = P0.a.f698a;
        gameplayActivity.f1969D = P0.a.b(gameplayActivity.f1966A).f851g;
        gameplayActivity.v();
        gameplayActivity.w();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        GameplayActivity gameplayActivity = this.f672a;
        gameplayActivity.f1969D = (int) (j2 / 1000);
        gameplayActivity.t().i.setText(gameplayActivity.getString(R.string.time_label, Integer.valueOf(gameplayActivity.f1969D)));
    }
}
