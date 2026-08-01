package k1;

import c1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements j1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2762a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2763b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2764c;
    public final d1.e d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i, int i2, p pVar) {
        d1.d.e(charSequence, "input");
        this.f2762a = charSequence;
        this.f2763b = i;
        this.f2764c = i2;
        this.d = (d1.e) pVar;
    }

    @Override // j1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
