package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0492g implements InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f5538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f5539e;

    public /* synthetic */ C0492g(D d4, o oVar) {
        this.f5538d = d4;
        this.f5539e = oVar;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
        D dispatcher = this.f5538d;
        Intrinsics.checkNotNullParameter(dispatcher, "$dispatcher");
        o this$0 = this.f5539e;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0474n.ON_CREATE) {
            OnBackInvokedDispatcher invoker = h.f5540a.a(this$0);
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            dispatcher.f5518e = invoker;
            dispatcher.d(dispatcher.f5520g);
        }
    }
}
