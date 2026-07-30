package d;

import android.window.OnBackInvokedCallback;
import h4.AbstractActivityC0488c;
import i.LayoutInflaterFactory2C0500B;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4602b;

    public /* synthetic */ t(int i2, Object obj) {
        this.f4601a = i2;
        this.f4602b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4601a) {
            case 0:
                Function0 onBackInvoked = (Function0) this.f4602b;
                Intrinsics.checkNotNullParameter(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
            case 1:
                ((AbstractActivityC0488c) this.f4602b).onBackPressed();
                break;
            case 2:
                ((LayoutInflaterFactory2C0500B) this.f4602b).E();
                break;
            default:
                ((Runnable) this.f4602b).run();
                break;
        }
    }
}
