package a;

import androidx.fragment.app.AbstractActivityC0064v;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0064v f906b;

    public /* synthetic */ d(AbstractActivityC0064v abstractActivityC0064v, int i) {
        this.f905a = i;
        this.f906b = abstractActivityC0064v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f905a) {
            case 0:
                this.f906b.invalidateMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!X0.f.a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!X0.f.a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
