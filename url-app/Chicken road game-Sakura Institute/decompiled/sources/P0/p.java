package P0;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f3755b;

    public /* synthetic */ p(Function0 function0, int i2) {
        this.f3754a = i2;
        this.f3755b = function0;
    }

    public final void onBackInvoked() {
        switch (this.f3754a) {
            case 0:
                Function0 function0 = this.f3755b;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                Function0 onBackInvoked = this.f3755b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
        }
    }
}
