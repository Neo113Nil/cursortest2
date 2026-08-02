package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxc {
    public static final boolean a = jav.m("kotlinx.coroutines.fast.path.cancellation", false);
    public static final ldb b = new ldb("COMPLETING_ALREADY");
    public static final ldb c = new ldb("COMPLETING_WAITING_CHILDREN");
    public static final ldb d = new ldb("COMPLETING_RETRY");
    public static final ldb e = new ldb("TOO_LATE_TO_CANCEL");
    public static final ldb f = new ldb("SEALED");
    public static final kwe g = new kwe(false);
    public static final kwe h = new kwe(true);

    public static final Object a(Object obj) {
        return obj instanceof kwq ? new kwr((kwq) obj) : obj;
    }

    public static final Object b(Object obj) {
        kwq kwqVar;
        kwr kwrVar = obj instanceof kwr ? (kwr) obj : null;
        return (kwrVar == null || (kwqVar = kwrVar.a) == null) ? obj : kwqVar;
    }
}
