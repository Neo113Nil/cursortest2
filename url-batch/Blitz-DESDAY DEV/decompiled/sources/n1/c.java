package n1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements m1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3299b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3300c;
    public final g1.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        g1.d.e(charSequence, "input");
        this.f3298a = charSequence;
        this.f3299b = i;
        this.f3300c = i2;
        this.d = mVar;
    }

    @Override // m1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
