package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gys extends gyp {
    static final gyv a = new gys();

    private gys() {
        super("CharMatcher.none()");
    }

    @Override // defpackage.gyv
    public final boolean c(char c) {
        return false;
    }

    @Override // defpackage.gyv
    public final boolean f(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override // defpackage.gyv
    public final boolean g(CharSequence charSequence) {
        return true;
    }

    @Override // defpackage.gyv
    public final int h(CharSequence charSequence) {
        return -1;
    }

    @Override // defpackage.gyv
    public final int i(CharSequence charSequence, int i) {
        hoq.P(0, charSequence.length());
        return -1;
    }

    @Override // defpackage.gyv
    public final gyv e(gyv gyvVar) {
        return gyvVar;
    }
}
