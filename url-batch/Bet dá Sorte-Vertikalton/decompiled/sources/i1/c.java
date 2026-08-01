package i1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements h1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2508b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2509c;
    public final b1.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        b1.d.e(charSequence, "input");
        this.f2507a = charSequence;
        this.f2508b = i;
        this.f2509c = i2;
        this.d = mVar;
    }

    @Override // h1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
