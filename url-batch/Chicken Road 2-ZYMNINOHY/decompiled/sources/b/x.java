package b;

import androidx.lifecycle.AbstractC0231j;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;

/* loaded from: classes.dex */
public final class x implements InterfaceC0234m, InterfaceC0242c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0231j f5250a;

    /* renamed from: b, reason: collision with root package name */
    public final q f5251b;

    /* renamed from: c, reason: collision with root package name */
    public y f5252c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0238A f5253d;

    public x(C0238A c0238a, AbstractC0231j abstractC0231j, q onBackPressedCallback) {
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        this.f5253d = c0238a;
        this.f5250a = abstractC0231j;
        this.f5251b = onBackPressedCallback;
        abstractC0231j.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        if (enumC0229h != EnumC0229h.ON_START) {
            if (enumC0229h != EnumC0229h.ON_STOP) {
                if (enumC0229h == EnumC0229h.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                y yVar = this.f5252c;
                if (yVar != null) {
                    yVar.cancel();
                    return;
                }
                return;
            }
        }
        C0238A c0238a = this.f5253d;
        c0238a.getClass();
        q onBackPressedCallback = this.f5251b;
        kotlin.jvm.internal.i.e(onBackPressedCallback, "onBackPressedCallback");
        c0238a.f5206b.addLast(onBackPressedCallback);
        y yVar2 = new y(c0238a, onBackPressedCallback);
        onBackPressedCallback.addCancellable(yVar2);
        c0238a.e();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new z(0, c0238a, C0238A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1));
        this.f5252c = yVar2;
    }

    @Override // b.InterfaceC0242c
    public final void cancel() {
        this.f5250a.b(this);
        this.f5251b.removeCancellable(this);
        y yVar = this.f5252c;
        if (yVar != null) {
            yVar.cancel();
        }
        this.f5252c = null;
    }
}
