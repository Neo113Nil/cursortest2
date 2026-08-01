package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1915a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1916b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1917c;
    public final X0.f d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        X0.e.e(charSequence, "input");
        this.f1915a = charSequence;
        this.f1916b = i;
        this.f1917c = i2;
        this.d = mVar;
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
