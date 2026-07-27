package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f5594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f5595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f5596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f5597d;

    public z(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f5594a = function1;
        this.f5595b = function12;
        this.f5596c = function0;
        this.f5597d = function02;
    }

    public final void onBackCancelled() {
        this.f5597d.invoke();
    }

    public final void onBackInvoked() {
        this.f5596c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f5595b.invoke(new C0487b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f5594a.invoke(new C0487b(backEvent));
    }
}
