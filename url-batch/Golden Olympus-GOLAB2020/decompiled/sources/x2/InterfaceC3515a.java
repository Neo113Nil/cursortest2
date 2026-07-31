package x2;

/* renamed from: x2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3515a {

    /* renamed from: x2.a$a, reason: collision with other inner class name */
    public static final class C0286a {
        public static /* synthetic */ boolean a(InterfaceC3515a interfaceC3515a, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            return interfaceC3515a.a(obj);
        }

        public static /* synthetic */ void b(InterfaceC3515a interfaceC3515a, Object obj, int i4, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i4 & 1) != 0) {
                obj = null;
            }
            interfaceC3515a.c(obj);
        }
    }

    boolean a(Object obj);

    Object b(Object obj, kotlin.coroutines.d dVar);

    void c(Object obj);
}
