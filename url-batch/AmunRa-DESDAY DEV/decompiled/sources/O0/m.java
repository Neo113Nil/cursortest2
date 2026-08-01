package O0;

import android.os.CountDownTimer;
import com.visualfortune.eyerest.SessionActivity;

/* loaded from: classes.dex */
public final class m extends CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SessionActivity f634a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(SessionActivity sessionActivity, long j2) {
        super(j2, 1000L);
        this.f634a = sessionActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        SessionActivity sessionActivity = this.f634a;
        sessionActivity.f1942E = 0;
        i iVar = sessionActivity.f1939B;
        if (iVar == null) {
            Z0.d.h("config");
            throw null;
        }
        sessionActivity.F = iVar.d;
        sessionActivity.v();
        sessionActivity.t();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j2) {
        int i = (int) (j2 / 1000);
        SessionActivity sessionActivity = this.f634a;
        sessionActivity.f1942E = i;
        i iVar = sessionActivity.f1939B;
        if (iVar == null) {
            Z0.d.h("config");
            throw null;
        }
        sessionActivity.F = iVar.d - i;
        sessionActivity.v();
    }
}
