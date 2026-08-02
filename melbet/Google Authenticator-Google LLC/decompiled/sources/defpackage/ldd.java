package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldd {
    public static final ldb a = new ldb("NO_THREAD_ELEMENTS");
    private static final krx b = new gjo(10);
    private static final krx c = new gjo(11);
    private static final krx d = new gjo(12);

    public static final Object a(kqn kqnVar) {
        Object fold = kqnVar.fold(0, b);
        fold.getClass();
        return fold;
    }

    public static final Object b(kqn kqnVar, Object obj) {
        if (obj == null) {
            obj = a(kqnVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? kqnVar.fold(new ldi(kqnVar, ((Number) obj).intValue()), d) : ((kxu) obj).a(kqnVar);
    }

    public static final void c(kqn kqnVar, Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof ldi)) {
            Object fold = kqnVar.fold(null, c);
            fold.getClass();
            ((kxu) fold).b(kqnVar, obj);
            return;
        }
        ldi ldiVar = (ldi) obj;
        kxu[] kxuVarArr = ldiVar.c;
        int length = kxuVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            kxu kxuVar = kxuVarArr[length];
            kxuVar.getClass();
            kxuVar.b(kqnVar, ldiVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
