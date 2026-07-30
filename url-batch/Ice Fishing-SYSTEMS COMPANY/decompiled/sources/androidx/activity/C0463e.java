package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0506n;
import androidx.lifecycle.InterfaceC0511t;
import androidx.lifecycle.InterfaceC0513v;
import x0.C5202c;

/* renamed from: androidx.activity.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0463e implements InterfaceC0511t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4558n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f4559u;

    public /* synthetic */ C0463e(int i, Object obj) {
        this.f4558n = i;
        this.f4559u = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0511t
    public final void a(InterfaceC0513v interfaceC0513v, EnumC0506n enumC0506n) {
        Window window;
        View peekDecorView;
        switch (this.f4558n) {
            case 0:
                if (enumC0506n == EnumC0506n.ON_STOP && (window = ((p) this.f4559u).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                p.b((p) this.f4559u, interfaceC0513v, enumC0506n);
                break;
            default:
                C5202c this$0 = (C5202c) this.f4559u;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                if (enumC0506n != EnumC0506n.ON_START) {
                    if (enumC0506n == EnumC0506n.ON_STOP) {
                        this$0.f41771f = false;
                        break;
                    }
                } else {
                    this$0.f41771f = true;
                    break;
                }
                break;
        }
    }
}
