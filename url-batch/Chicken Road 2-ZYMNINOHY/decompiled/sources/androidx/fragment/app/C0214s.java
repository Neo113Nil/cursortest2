package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214s extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f4959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0215t f4960b;

    public C0214s(DialogInterfaceOnCancelListenerC0215t dialogInterfaceOnCancelListenerC0215t, N n) {
        this.f4960b = dialogInterfaceOnCancelListenerC0215t;
        this.f4959a = n;
    }

    @Override // androidx.fragment.app.N
    public final View b(int i4) {
        N n = this.f4959a;
        if (n.c()) {
            return n.b(i4);
        }
        Dialog dialog = this.f4960b.f4975j;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // androidx.fragment.app.N
    public final boolean c() {
        return this.f4959a.c() || this.f4960b.n;
    }
}
