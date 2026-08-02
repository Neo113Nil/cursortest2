package b;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0243d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0253n f5218b;

    public /* synthetic */ RunnableC0243d(AbstractActivityC0253n abstractActivityC0253n, int i4) {
        this.f5217a = i4;
        this.f5218b = abstractActivityC0253n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5217a) {
            case 0:
                AbstractActivityC0253n this$0 = this.f5218b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                this$0.invalidateMenu();
                return;
            default:
                AbstractActivityC0253n this$02 = this.f5218b;
                kotlin.jvm.internal.i.e(this$02, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!kotlin.jvm.internal.i.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!kotlin.jvm.internal.i.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
        }
    }
}
