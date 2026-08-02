package S0;

import y0.C;

/* loaded from: classes.dex */
public final class p implements C {

    /* renamed from: b, reason: collision with root package name */
    public static final p f2488b = new p(true);

    /* renamed from: c, reason: collision with root package name */
    public static final p f2489c = new p(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2490a;

    public p(boolean z) {
        this.f2490a = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IncorrectFragmentation{expected=");
        sb.append(!this.f2490a);
        sb.append("}");
        return sb.toString();
    }
}
