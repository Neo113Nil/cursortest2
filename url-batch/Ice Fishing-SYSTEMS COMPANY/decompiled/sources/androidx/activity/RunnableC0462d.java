package androidx.activity;

/* renamed from: androidx.activity.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0462d implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4556n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f4557u;

    public /* synthetic */ RunnableC0462d(p pVar, int i) {
        this.f4556n = i;
        this.f4557u = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4556n) {
            case 0:
                this.f4557u.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e6) {
                    if (!kotlin.jvm.internal.h.a(e6.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e6;
                    }
                    return;
                } catch (NullPointerException e9) {
                    if (!kotlin.jvm.internal.h.a(e9.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e9;
                    }
                    return;
                }
        }
    }
}
