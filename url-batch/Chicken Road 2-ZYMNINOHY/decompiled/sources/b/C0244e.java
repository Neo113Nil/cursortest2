package b;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;
import m1.C1307e;

/* renamed from: b.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0244e implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5219a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5220b;

    public /* synthetic */ C0244e(int i4, Object obj) {
        this.f5219a = i4;
        this.f5220b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        Window window;
        View peekDecorView;
        switch (this.f5219a) {
            case 0:
                AbstractActivityC0253n abstractActivityC0253n = (AbstractActivityC0253n) this.f5220b;
                if (enumC0229h == EnumC0229h.ON_STOP && (window = abstractActivityC0253n.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0253n.b((AbstractActivityC0253n) this.f5220b, interfaceC0235n, enumC0229h);
                break;
            default:
                C1307e this$0 = (C1307e) this.f5220b;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                if (enumC0229h != EnumC0229h.ON_START) {
                    if (enumC0229h == EnumC0229h.ON_STOP) {
                        this$0.f14493f = false;
                        break;
                    }
                } else {
                    this$0.f14493f = true;
                    break;
                }
                break;
        }
    }
}
