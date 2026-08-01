package g1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements f1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2448c;
    public final Z0.e d;

    public c(CharSequence charSequence, int i, int i2, m mVar) {
        Z0.d.e(charSequence, "input");
        this.f2446a = charSequence;
        this.f2447b = i;
        this.f2448c = i2;
        this.d = mVar;
    }

    @Override // f1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
