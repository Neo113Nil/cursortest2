package l1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements k1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3169c;
    public final e1.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        e1.d.e(charSequence, "input");
        this.f3167a = charSequence;
        this.f3168b = i;
        this.f3169c = i2;
        this.d = mVar;
    }

    @Override // k1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
