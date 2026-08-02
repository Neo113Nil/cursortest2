package E;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0229h;
import androidx.lifecycle.InterfaceC0234m;
import androidx.lifecycle.InterfaceC0235n;
import b.AbstractActivityC0253n;
import b.C0238A;
import b.C0246g;

/* renamed from: E.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0009j implements InterfaceC0234m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f425c;

    public /* synthetic */ C0009j(Object obj, int i4, Object obj2) {
        this.f423a = i4;
        this.f424b = obj;
        this.f425c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0234m
    public final void a(InterfaceC0235n interfaceC0235n, EnumC0229h enumC0229h) {
        switch (this.f423a) {
            case 0:
                C0011l c0011l = (C0011l) this.f424b;
                InterfaceC0013n interfaceC0013n = (InterfaceC0013n) this.f425c;
                if (enumC0229h != EnumC0229h.ON_DESTROY) {
                    c0011l.getClass();
                    break;
                } else {
                    c0011l.a(interfaceC0013n);
                    break;
                }
            default:
                C0238A dispatcher = (C0238A) this.f424b;
                AbstractActivityC0253n abstractActivityC0253n = (AbstractActivityC0253n) this.f425c;
                kotlin.jvm.internal.i.e(dispatcher, "$dispatcher");
                if (enumC0229h == EnumC0229h.ON_CREATE) {
                    OnBackInvokedDispatcher invoker = C0246g.f5222a.a(abstractActivityC0253n);
                    kotlin.jvm.internal.i.e(invoker, "invoker");
                    dispatcher.f5209e = invoker;
                    dispatcher.d(dispatcher.f5211g);
                    break;
                }
                break;
        }
    }
}
