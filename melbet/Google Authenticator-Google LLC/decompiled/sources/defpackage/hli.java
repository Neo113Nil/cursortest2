package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hli extends hkq {
    private final StackTraceElement b;

    public hli(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.hkq
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.hkq
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.hkq
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.hkq
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hli) && this.b.equals(((hli) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
