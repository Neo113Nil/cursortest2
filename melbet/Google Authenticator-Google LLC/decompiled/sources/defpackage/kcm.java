package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcm implements klz {
    public final klz a;
    public boolean b = false;
    public int c = 0;
    private final Runnable d;

    public kcm(klz klzVar, Runnable runnable) {
        this.a = klzVar;
        this.d = runnable;
    }

    public final Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
