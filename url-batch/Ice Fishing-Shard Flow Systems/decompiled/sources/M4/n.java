package M4;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final n f1765d;

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f1766e;

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f1767i;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n[] f1768l;

    static {
        n nVar = new n("INSTANCE", 0);
        f1765d = nVar;
        f1768l = new n[]{nVar};
        f1766e = Logger.getLogger(n.class.getName());
        f1767i = new ThreadLocal();
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f1768l.clone();
    }

    @Override // M4.b
    public final f a(a aVar) {
        a current = current();
        if (aVar == current) {
            return l.f1759d;
        }
        f1767i.set(aVar);
        return new m(this, current, aVar);
    }

    @Override // M4.b
    public final a current() {
        return (a) f1767i.get();
    }
}
