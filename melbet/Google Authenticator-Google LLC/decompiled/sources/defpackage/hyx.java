package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hyx extends RuntimeException {
    public hyx(Throwable th) {
        super(th);
    }

    public static Object a(hyw hywVar) {
        try {
            return hywVar.a();
        } catch (Exception e) {
            throw new hyx(e);
        }
    }
}
