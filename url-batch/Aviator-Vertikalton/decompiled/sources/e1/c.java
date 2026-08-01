package e1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2382c;

    /* renamed from: d, reason: collision with root package name */
    public final X0.g f2383d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        X0.f.e(charSequence, "input");
        this.f2380a = charSequence;
        this.f2381b = i;
        this.f2382c = i2;
        this.f2383d = mVar;
    }

    @Override // d1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
