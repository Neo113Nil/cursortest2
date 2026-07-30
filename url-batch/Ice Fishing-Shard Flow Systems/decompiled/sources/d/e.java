package d;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0254u;
import androidx.lifecycle.InterfaceC0256w;
import k0.C0593d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0254u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4574e;

    public /* synthetic */ e(int i2, Object obj) {
        this.f4573d = i2;
        this.f4574e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w interfaceC0256w, EnumC0248n event) {
        Window window;
        View peekDecorView;
        switch (this.f4573d) {
            case 0:
                o this$0 = (o) this.f4574e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0256w, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0248n.ON_STOP && (window = this$0.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                o.b((o) this.f4574e, interfaceC0256w, event);
                break;
            default:
                C0593d this$02 = (C0593d) this.f4574e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0256w, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0248n.ON_START) {
                    if (event == EnumC0248n.ON_STOP) {
                        this$02.f6027f = false;
                        break;
                    }
                } else {
                    this$02.f6027f = true;
                    break;
                }
                break;
        }
    }
}
