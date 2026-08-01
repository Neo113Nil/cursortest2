package r1;

import j1.p;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f3841a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3842b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3843c;
    public final k1.f d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i, int i2, p pVar) {
        k1.e.e(charSequence, "input");
        this.f3841a = charSequence;
        this.f3842b = i;
        this.f3843c = i2;
        this.d = (k1.f) pVar;
    }

    @Override // q1.d
    public final Iterator iterator() {
        return new b(this);
    }
}
