package r2;

import a2.AbstractC1241b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: r2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract /* synthetic */ class AbstractC3399i {

    /* renamed from: r2.i$a */
    public static final class a implements InterfaceC3396f {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f43554b;

        public a(Object obj) {
            this.f43554b = obj;
        }

        @Override // r2.InterfaceC3396f
        public Object a(InterfaceC3397g interfaceC3397g, kotlin.coroutines.d dVar) {
            Object emit = interfaceC3397g.emit(this.f43554b, dVar);
            return emit == AbstractC1241b.f() ? emit : Unit.f41027a;
        }
    }

    public static final InterfaceC3396f a(Function2 function2) {
        return new C3392b(function2, null, 0, null, 14, null);
    }

    public static final InterfaceC3396f b(Function2 function2) {
        return new w(function2);
    }

    public static final InterfaceC3396f c(Object obj) {
        return new a(obj);
    }
}
