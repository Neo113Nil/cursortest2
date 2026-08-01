package r0;

import android.os.CountDownTimer;
import com.clutchquizarena.app.GameActivity;
import com.clutchquizarena.app.R;
import t0.C0359a;

/* renamed from: r0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CountDownTimerC0330k extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GameActivity f3458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC0330k(GameActivity gameActivity) {
        super(20000L, 1000L);
        this.f3458a = gameActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        GameActivity gameActivity = this.f3458a;
        C0359a c0359a = gameActivity.f1716y;
        if (c0359a == null) {
            g1.f.g("binding");
            throw null;
        }
        c0359a.f3724j.setText(gameActivity.getString(R.string.timer_label, 0));
        gameActivity.v();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        int i = (int) (j2 / 1000);
        GameActivity gameActivity = this.f3458a;
        C0359a c0359a = gameActivity.f1716y;
        if (c0359a == null) {
            g1.f.g("binding");
            throw null;
        }
        c0359a.f3724j.setText(gameActivity.getString(R.string.timer_label, Integer.valueOf(i)));
    }
}
