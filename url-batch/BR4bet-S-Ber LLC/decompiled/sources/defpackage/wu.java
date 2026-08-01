package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wu implements OnBackAnimationCallback {
    public final /* synthetic */ uu a;
    public final /* synthetic */ xu b;

    public wu(xu xuVar, uu uuVar) {
        this.b = xuVar;
        this.a = uuVar;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new n7(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new n7(backEvent));
        }
    }
}
