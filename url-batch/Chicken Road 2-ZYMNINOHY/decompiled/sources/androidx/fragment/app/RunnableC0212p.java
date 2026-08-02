package androidx.fragment.app;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0212p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4949a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4950b;

    public /* synthetic */ RunnableC0212p(int i4, Object obj) {
        this.f4949a = i4;
        this.f4950b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4949a) {
            case 0:
                DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t = (DialogInterfaceOnCancelListenerC0215t) this.f4950b;
                dialogInterfaceOnCancelListenerC0215t.f4967b.onDismiss(dialogInterfaceOnCancelListenerC0215t.f4975j);
                break;
            case 1:
                C0211o c0211o = (C0211o) this.f4950b;
                if (!c0211o.f4936b.isEmpty()) {
                    c0211o.e();
                    break;
                }
                break;
            default:
                ((f0) this.f4950b).z(true);
                break;
        }
    }
}
