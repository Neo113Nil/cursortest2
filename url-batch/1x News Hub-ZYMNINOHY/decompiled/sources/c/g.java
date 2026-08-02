package c;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0165g;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements androidx.lifecycle.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f2567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2568b;

    public /* synthetic */ g(t tVar, m mVar) {
        this.f2567a = tVar;
        this.f2568b = mVar;
    }

    @Override // androidx.lifecycle.l
    public final void a(androidx.lifecycle.m mVar, EnumC0165g enumC0165g) {
        t tVar = this.f2567a;
        m this$0 = this.f2568b;
        kotlin.jvm.internal.j.e(this$0, "this$0");
        if (enumC0165g == EnumC0165g.ON_CREATE) {
            OnBackInvokedDispatcher invoker = h.f2569a.a(this$0);
            kotlin.jvm.internal.j.e(invoker, "invoker");
            tVar.f2615e = invoker;
            OnBackInvokedDispatcher onBackInvokedDispatcher = tVar.f2615e;
            OnBackInvokedCallback onBackInvokedCallback = tVar.f2614d;
            if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
                return;
            }
            q qVar = q.f2605a;
            if (tVar.f) {
                qVar.c(onBackInvokedDispatcher, onBackInvokedCallback);
                tVar.f = false;
            }
        }
    }
}
