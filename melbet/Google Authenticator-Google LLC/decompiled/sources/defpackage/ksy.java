package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ksy {
    public ksy() {
    }

    public static boolean a(Object obj, int i) {
        if (obj instanceof kof) {
            if ((obj instanceof ksn ? ((ksn) obj).i() : obj instanceof kri ? 0 : obj instanceof krt ? 1 : obj instanceof krx ? 2 : obj instanceof kry ? 3 : obj instanceof krz ? 4 : obj instanceof ksa ? 5 : obj instanceof ksb ? 6 : obj instanceof ksc ? 7 : obj instanceof ksd ? 8 : obj instanceof kse ? 9 : obj instanceof krj ? 10 : obj instanceof krk ? 11 : obj instanceof krl ? 12 : obj instanceof krm ? 13 : obj instanceof krn ? 14 : obj instanceof kro ? 15 : obj instanceof krp ? 16 : obj instanceof krq ? 17 : obj instanceof krr ? 18 : obj instanceof krs ? 19 : obj instanceof kru ? 20 : obj instanceof krv ? 21 : obj instanceof krw ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void b(Object obj, int i) {
        if (obj == null || a(obj, i)) {
            return;
        }
        String Y = a.Y(i, "kotlin.jvm.functions.Function");
        ClassCastException classCastException = new ClassCastException(obj.getClass().getName() + " cannot be cast to " + Y);
        ksp.d(classCastException, ksy.class.getName());
        throw classCastException;
    }

    public static Object c(Optional optional, Object obj) {
        return optional.isPresent() ? optional.get() : obj;
    }

    public static long d(long j, kug kugVar, kug kugVar2) {
        kugVar.getClass();
        kugVar2.getClass();
        return kugVar2.h.convert(j, kugVar.h);
    }

    public ksy(byte[] bArr) {
    }
}
