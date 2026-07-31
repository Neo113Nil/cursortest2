package F5;

import java.util.Iterator;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class c implements E5.f {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f792a;

    /* renamed from: b, reason: collision with root package name */
    public final int f793b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0747p f794c;

    public c(CharSequence input, int i7, InterfaceC0747p interfaceC0747p) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f792a = input;
        this.f793b = i7;
        this.f794c = interfaceC0747p;
    }

    @Override // E5.f
    public final Iterator iterator() {
        return new b(this);
    }
}
