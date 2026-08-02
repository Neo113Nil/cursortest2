package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fkg implements OnBackAnimationCallback {
    final /* synthetic */ fke a;
    final /* synthetic */ fkh b;

    public fkg(fkh fkhVar, fke fkeVar) {
        this.a = fkeVar;
        this.b = fkhVar;
    }

    public final void onBackCancelled() {
        if (this.b.d()) {
            this.a.M();
        }
    }

    public final void onBackInvoked() {
        this.a.O();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.V(new mx(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.d()) {
            this.a.T(new mx(backEvent));
        }
    }
}
