package a;

import g.AbstractActivityC0131i;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0131i f1074b;

    public /* synthetic */ d(AbstractActivityC0131i abstractActivityC0131i, int i) {
        this.f1073a = i;
        this.f1074b = abstractActivityC0131i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1073a) {
            case 0:
                this.f1074b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!Z0.d.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!Z0.d.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
