package o1;

import g1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements n1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3426c;
    public final h1.e d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i, int i2, p pVar) {
        h1.d.e(charSequence, "input");
        this.f3424a = charSequence;
        this.f3425b = i;
        this.f3426c = i2;
        this.d = (h1.e) pVar;
    }

    @Override // n1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
