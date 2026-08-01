package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class is implements OnBackAnimationCallback {
    public final /* synthetic */ gs a;
    public final /* synthetic */ js b;

    public is(js jsVar, gs gsVar) {
        this.b = jsVar;
        this.a = gsVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.cancelBackProgress();
        }
    }

    public final void onBackInvoked() {
        this.a.handleBackInvoked();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.updateBackProgress(new r7(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.startBackProgress(new r7(backEvent));
        }
    }
}
