package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hns extends hmt {
    public static final hmt a = new hns();

    @Override // defpackage.hmt
    public final hkq a(Class cls, int i) {
        StackTraceElement a2 = hom.a(cls, i + 1);
        return a2 != null ? new hli(a2) : hkq.a;
    }

    @Override // defpackage.hmt
    public final String b(Class cls) {
        StackTraceElement a2 = hom.a(cls, 1);
        if (a2 != null) {
            return a2.getClassName();
        }
        throw new IllegalStateException("no caller found on the stack for: ".concat(String.valueOf(cls.getName())));
    }

    public final String toString() {
        return "Default stack-based caller finder";
    }
}
