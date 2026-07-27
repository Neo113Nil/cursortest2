package j4;

import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1430a f10478a;

    public a(InterfaceC1430a interfaceC1430a) {
        this.f10478a = interfaceC1430a;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f10478a.invoke();
    }
}
