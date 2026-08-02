package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class C {
    public static void a(long j2, Object obj) {
        AbstractC0139b abstractC0139b = (AbstractC0139b) ((InterfaceC0160x) j0.f1710c.h(j2, obj));
        if (abstractC0139b.f1669e) {
            abstractC0139b.f1669e = false;
        }
    }

    public static InterfaceC0160x b(long j2, Object obj) {
        InterfaceC0160x interfaceC0160x = (InterfaceC0160x) j0.f1710c.h(j2, obj);
        if (((AbstractC0139b) interfaceC0160x).f1669e) {
            return interfaceC0160x;
        }
        U u2 = (U) interfaceC0160x;
        int i2 = u2.f1648g;
        U c2 = u2.c(i2 == 0 ? 10 : i2 * 2);
        j0.o(obj, j2, c2);
        return c2;
    }
}
