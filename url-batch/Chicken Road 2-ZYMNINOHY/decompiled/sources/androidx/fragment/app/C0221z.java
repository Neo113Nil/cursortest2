package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;

/* renamed from: androidx.fragment.app.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221z implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f4999a;

    public C0221z(F f4) {
        this.f4999a = f4;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        View view;
        if (enumC0229h != EnumC0229h.ON_STOP || (view = this.f4999a.mView) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}
