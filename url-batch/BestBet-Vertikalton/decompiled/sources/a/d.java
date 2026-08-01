package a;

import g.AbstractActivityC0128i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0128i f1560b;

    public /* synthetic */ d(AbstractActivityC0128i abstractActivityC0128i, int i) {
        this.f1559a = i;
        this.f1560b = abstractActivityC0128i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1559a) {
            case 0:
                this.f1560b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!k1.e.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!k1.e.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
