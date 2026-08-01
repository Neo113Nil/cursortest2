package a;

import g.AbstractActivityC0110i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0110i f1241b;

    public /* synthetic */ d(AbstractActivityC0110i abstractActivityC0110i, int i) {
        this.f1240a = i;
        this.f1241b = abstractActivityC0110i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1240a) {
            case 0:
                this.f1241b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!g1.d.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!g1.d.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
