package androidx.compose.ui.input.pointer;

import q1.s;
import q6.i;
import s6.a;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f554a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f555b;

    /* renamed from: c, reason: collision with root package name */
    public final PointerInputEventHandler f556c;

    public SuspendPointerInputElement(Object obj, a aVar, PointerInputEventHandler pointerInputEventHandler, int i) {
        aVar = (i & 2) != 0 ? null : aVar;
        this.f554a = obj;
        this.f555b = aVar;
        this.f556c = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return this.f554a.equals(suspendPointerInputElement.f554a) && i.a(this.f555b, suspendPointerInputElement.f555b) && this.f556c == suspendPointerInputElement.f556c;
    }

    @Override // w1.x0
    public final l f() {
        return new s(this.f554a, this.f555b, this.f556c);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        s sVar = (s) lVar;
        Object obj = sVar.f6028r;
        Object obj2 = this.f554a;
        boolean z3 = !i.a(obj, obj2);
        sVar.f6028r = obj2;
        Object obj3 = sVar.f6029s;
        Object obj4 = this.f555b;
        if (!i.a(obj3, obj4)) {
            z3 = true;
        }
        sVar.f6029s = obj4;
        Class<?> cls = sVar.f6030t.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f556c;
        if (cls == pointerInputEventHandler.getClass() ? z3 : true) {
            sVar.s0();
        }
        sVar.f6030t = pointerInputEventHandler;
    }

    public final int hashCode() {
        int hashCode = this.f554a.hashCode() * 31;
        Object obj = this.f555b;
        return this.f556c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 961);
    }
}
