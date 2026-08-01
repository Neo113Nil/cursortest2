package a;

import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1113b;

    public /* synthetic */ d(AbstractActivityC0128i abstractActivityC0128i, int i) {
        this.f1112a = i;
        this.f1113b = abstractActivityC0128i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1112a) {
            case 0:
                this.f1113b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!b1.d.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!b1.d.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
