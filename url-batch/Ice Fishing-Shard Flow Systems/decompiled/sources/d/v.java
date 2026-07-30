package d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f4604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f4606c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f4607d;

    public v(Function1 function1, Function1 function12, Function0 function0, Function0 function02) {
        this.f4604a = function1;
        this.f4605b = function12;
        this.f4606c = function0;
        this.f4607d = function02;
    }

    public final void onBackCancelled() {
        this.f4607d.invoke();
    }

    public final void onBackInvoked() {
        this.f4606c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f4605b.invoke(new C0351b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.f4604a.invoke(new C0351b(backEvent));
    }
}
