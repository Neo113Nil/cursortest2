package a;

import g.AbstractActivityC0136i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0136i f1180b;

    public /* synthetic */ d(AbstractActivityC0136i abstractActivityC0136i, int i) {
        this.f1179a = i;
        this.f1180b = abstractActivityC0136i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1179a) {
            case 0:
                this.f1180b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!g1.f.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!g1.f.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
