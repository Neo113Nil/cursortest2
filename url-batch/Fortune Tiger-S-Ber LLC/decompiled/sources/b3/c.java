package b3;

import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class c implements a3.f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f972a;

    /* renamed from: b, reason: collision with root package name */
    public final u2.d f973b;

    public c(CharSequence charSequence, n nVar) {
        u2.c.e(charSequence, "input");
        this.f972a = charSequence;
        this.f973b = nVar;
    }

    @Override // a3.f
    public final Iterator iterator() {
        return new b(this);
    }
}
