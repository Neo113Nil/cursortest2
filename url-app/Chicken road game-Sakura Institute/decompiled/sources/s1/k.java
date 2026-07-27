package s1;

import androidx.lifecycle.EnumC0474n;
import androidx.lifecycle.InterfaceC0479t;
import androidx.lifecycle.InterfaceC0481v;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import v1.C1248e;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements InterfaceC0479t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f10526e;

    public /* synthetic */ k(int i2, Object obj) {
        this.f10525d = i2;
        this.f10526e = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0479t
    public final void b(InterfaceC0481v interfaceC0481v, EnumC0474n event) {
        switch (this.f10525d) {
            case 0:
                C1183B this$0 = (C1183B) this.f10526e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                this$0.f10453r = event.a();
                if (this$0.f10438c != null) {
                    Iterator<E> it = this$0.f10442g.iterator();
                    while (it.hasNext()) {
                        C1193i c1193i = (C1193i) it.next();
                        c1193i.getClass();
                        Intrinsics.checkNotNullParameter(event, "event");
                        c1193i.f10512j = event.a();
                        c1193i.i();
                    }
                    break;
                }
                break;
            default:
                C1248e this$02 = (C1248e) this.f10526e;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(interfaceC0481v, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0474n.ON_START) {
                    if (event == EnumC0474n.ON_STOP) {
                        this$02.f10984f = false;
                        break;
                    }
                } else {
                    this$02.f10984f = true;
                    break;
                }
                break;
        }
    }
}
