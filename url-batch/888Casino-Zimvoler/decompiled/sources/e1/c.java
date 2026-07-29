package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1918c;
    public final X0.f d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        X0.e.e(charSequence, "input");
        this.f1916a = charSequence;
        this.f1917b = i;
        this.f1918c = i2;
        this.d = mVar;
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
