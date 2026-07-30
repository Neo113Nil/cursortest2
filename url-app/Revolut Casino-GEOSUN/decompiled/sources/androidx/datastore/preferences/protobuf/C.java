package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class C {
    public static void a(long j2, Object obj) {
        AbstractC0072b abstractC0072b = (AbstractC0072b) ((InterfaceC0093x) j0.f1461b.h(j2, obj));
        if (abstractC0072b.f1421e) {
            abstractC0072b.f1421e = false;
        }
    }

    public static InterfaceC0093x b(long j2, Object obj) {
        InterfaceC0093x interfaceC0093x = (InterfaceC0093x) j0.f1461b.h(j2, obj);
        if (((AbstractC0072b) interfaceC0093x).f1421e) {
            return interfaceC0093x;
        }
        U u2 = (U) interfaceC0093x;
        int i2 = u2.f1400g;
        U c2 = u2.c(i2 == 0 ? 10 : i2 * 2);
        j0.o(obj, j2, c2);
        return c2;
    }
}
