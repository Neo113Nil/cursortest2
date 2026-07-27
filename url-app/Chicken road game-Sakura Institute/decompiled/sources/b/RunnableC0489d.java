package b;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0489d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5534e;

    public /* synthetic */ RunnableC0489d(o oVar, int i2) {
        this.f5533d = i2;
        this.f5534e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5533d) {
            case 0:
                o this$0 = this.f5534e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidateOptionsMenu();
                return;
            default:
                o this$02 = this.f5534e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!Intrinsics.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!Intrinsics.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
        }
    }
}
