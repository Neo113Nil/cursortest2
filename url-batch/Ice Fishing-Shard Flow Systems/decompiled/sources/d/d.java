package d;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f4572e;

    public /* synthetic */ d(o oVar, int i2) {
        this.f4571d = i2;
        this.f4572e = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4571d) {
            case 0:
                o this$0 = this.f4572e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidateMenu();
                return;
            default:
                o this$02 = this.f4572e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e7) {
                    if (!Intrinsics.a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e7;
                    }
                    return;
                } catch (NullPointerException e8) {
                    if (!Intrinsics.a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
        }
    }
}
