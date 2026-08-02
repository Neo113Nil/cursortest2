package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0216u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4981b;

    public /* synthetic */ RunnableC0216u(int i4, Object obj) {
        this.f4980a = i4;
        this.f4981b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4980a) {
            case 0:
                F f4 = (F) this.f4981b;
                x0 x0Var = f4.mViewLifecycleOwner;
                x0Var.f4995e.b(f4.mSavedViewRegistryState);
                f4.mSavedViewRegistryState = null;
                break;
            default:
                p0.a(4, (ArrayList) this.f4981b);
                break;
        }
    }
}
