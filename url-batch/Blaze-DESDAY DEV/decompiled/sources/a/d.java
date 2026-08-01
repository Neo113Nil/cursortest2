package a;

import g.AbstractActivityC0108i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0108i f1186b;

    public /* synthetic */ d(AbstractActivityC0108i abstractActivityC0108i, int i) {
        this.f1185a = i;
        this.f1186b = abstractActivityC0108i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1185a) {
            case 0:
                this.f1186b.invalidateOptionsMenu();
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
