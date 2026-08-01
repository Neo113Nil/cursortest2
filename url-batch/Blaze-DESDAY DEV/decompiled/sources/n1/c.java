package n1;

import f1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements m1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3253c;
    public final g1.e d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i, int i2, p pVar) {
        g1.d.e(charSequence, "input");
        this.f3251a = charSequence;
        this.f3252b = i;
        this.f3253c = i2;
        this.d = (g1.e) pVar;
    }

    @Override // m1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
