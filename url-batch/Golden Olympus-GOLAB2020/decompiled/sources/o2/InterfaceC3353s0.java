package o2;

import kotlin.jvm.functions.Function1;

/* renamed from: o2.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3353s0 {

    /* renamed from: o2.s0$a */
    public static final class a implements InterfaceC3353s0 {

        /* renamed from: b, reason: collision with root package name */
        private final Function1 f42100b;

        public a(Function1 function1) {
            this.f42100b = function1;
        }

        @Override // o2.InterfaceC3353s0
        public void a(Throwable th) {
            this.f42100b.invoke(th);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + N.a(this.f42100b) + '@' + N.b(this) + ']';
        }
    }

    void a(Throwable th);
}
