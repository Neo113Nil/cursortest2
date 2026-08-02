package c;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0198c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2561a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2562b;

    public /* synthetic */ RunnableC0198c(m mVar, int i3) {
        this.f2561a = i3;
        this.f2562b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2561a) {
            case 0:
                m this$0 = this.f2562b;
                kotlin.jvm.internal.j.e(this$0, "this$0");
                this$0.invalidateOptionsMenu();
                return;
            default:
                m this$02 = this.f2562b;
                kotlin.jvm.internal.j.e(this$02, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!kotlin.jvm.internal.j.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                } catch (NullPointerException e4) {
                    if (!kotlin.jvm.internal.j.a(e4.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e4;
                    }
                    return;
                }
        }
    }
}
