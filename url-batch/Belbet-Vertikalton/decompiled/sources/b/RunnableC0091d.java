package b;

import h.AbstractActivityC0132i;

/* renamed from: b.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0091d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0132i f2157b;

    public /* synthetic */ RunnableC0091d(AbstractActivityC0132i abstractActivityC0132i, int i) {
        this.f2156a = i;
        this.f2157b = abstractActivityC0132i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2156a) {
            case 0:
                this.f2157b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!j1.h.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!j1.h.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
        }
    }
}
