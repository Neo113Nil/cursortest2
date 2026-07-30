package I;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0248n;
import androidx.lifecycle.InterfaceC0254u;
import androidx.lifecycle.InterfaceC0256w;
import d.C0349A;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: I.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0117m implements InterfaceC0254u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1220e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1221i;

    public /* synthetic */ C0117m(Object obj, int i2, Object obj2) {
        this.f1219d = i2;
        this.f1220e = obj;
        this.f1221i = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0254u
    public final void a(InterfaceC0256w interfaceC0256w, EnumC0248n event) {
        switch (this.f1219d) {
            case 0:
                C0119o c0119o = (C0119o) this.f1220e;
                InterfaceC0120p interfaceC0120p = (InterfaceC0120p) this.f1221i;
                if (event != EnumC0248n.ON_DESTROY) {
                    c0119o.getClass();
                    break;
                } else {
                    c0119o.b(interfaceC0120p);
                    break;
                }
            default:
                C0349A dispatcher = (C0349A) this.f1220e;
                d.o this$0 = (d.o) this.f1221i;
                Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0256w, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0248n.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = d.g.f4576a.a(this$0);
                    dispatcher.getClass();
                    Intrinsics.checkNotNullParameter(invoker, "invoker");
                    dispatcher.f4563e = invoker;
                    dispatcher.c(dispatcher.f4565g);
                    break;
                }
                break;
        }
    }
}
