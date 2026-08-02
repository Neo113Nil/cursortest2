package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kqv implements kqj {
    public static final kqv a = new kqv();

    @Override // defpackage.kqj
    public final kqn bU() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.kqj
    public final void ca(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
