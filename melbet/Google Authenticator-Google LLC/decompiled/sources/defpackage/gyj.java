package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gyj extends gyp {
    public static final gyv a = new gyj();

    public gyj() {
        super("CharMatcher.ascii()");
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return c <= 127;
    }
}
