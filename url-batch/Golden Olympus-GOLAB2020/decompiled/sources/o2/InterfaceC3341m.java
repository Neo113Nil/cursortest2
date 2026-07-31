package o2;

import kotlin.jvm.functions.Function1;

/* renamed from: o2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3341m extends K0 {

    /* renamed from: o2.m$a */
    public static final class a implements InterfaceC3341m {

        /* renamed from: b, reason: collision with root package name */
        private final Function1 f42087b;

        public a(Function1 function1) {
            this.f42087b = function1;
        }

        @Override // o2.InterfaceC3341m
        public void a(Throwable th) {
            this.f42087b.invoke(th);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + N.a(this.f42087b) + '@' + N.b(this) + ']';
        }
    }

    void a(Throwable th);
}
