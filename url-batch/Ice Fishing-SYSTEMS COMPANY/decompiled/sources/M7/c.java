package M7;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c implements L7.h {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1923a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1924b;

    /* renamed from: c, reason: collision with root package name */
    public final E7.p f1925c;

    public c(CharSequence input, int i, E7.p pVar) {
        kotlin.jvm.internal.h.e(input, "input");
        this.f1923a = input;
        this.f1924b = i;
        this.f1925c = pVar;
    }

    @Override // L7.h
    public final Iterator iterator() {
        return new b(this);
    }
}
