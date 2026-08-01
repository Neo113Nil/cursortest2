package androidx.activity;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f88f;
    public final /* synthetic */ f.i g;

    public /* synthetic */ d(f.i iVar, int i4) {
        this.f88f = i4;
        this.g = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f88f) {
            case 0:
                this.g.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e4) {
                    if (!u2.c.a(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e4;
                    }
                    return;
                } catch (NullPointerException e5) {
                    if (!u2.c.a(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e5;
                    }
                    return;
                }
        }
    }
}
