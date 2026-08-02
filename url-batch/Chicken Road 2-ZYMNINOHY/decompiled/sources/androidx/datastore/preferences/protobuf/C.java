package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class C {
    public static InterfaceC0190x a(long j4, Object obj) {
        InterfaceC0190x interfaceC0190x = (InterfaceC0190x) j0.f4660c.h(j4, obj);
        if (((AbstractC0169b) interfaceC0190x).f4617a) {
            return interfaceC0190x;
        }
        U u4 = (U) interfaceC0190x;
        int i4 = u4.f4596c;
        U d4 = u4.d(i4 == 0 ? 10 : i4 * 2);
        j0.o(j4, obj, d4);
        return d4;
    }
}
