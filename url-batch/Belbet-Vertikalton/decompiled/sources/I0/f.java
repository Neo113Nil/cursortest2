package I0;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import b.C0089b;

/* loaded from: classes.dex */
public final class f implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f589b;

    public f(g gVar, b bVar) {
        this.f589b = gVar;
        this.f588a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f589b.f587a != null) {
            this.f588a.d();
        }
    }

    public final void onBackInvoked() {
        this.f588a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f589b.f587a != null) {
            this.f588a.b(new C0089b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f589b.f587a != null) {
            this.f588a.c(new C0089b(backEvent));
        }
    }
}
