package a;

import g.AbstractActivityC0106i;

/* renamed from: a.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0059d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1230a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0106i f1231b;

    public /* synthetic */ RunnableC0059d(AbstractActivityC0106i abstractActivityC0106i, int i) {
        this.f1230a = i;
        this.f1231b = abstractActivityC0106i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1230a) {
            case 0:
                this.f1231b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!h1.d.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!h1.d.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
