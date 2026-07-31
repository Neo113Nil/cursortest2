package androidx.compose.foundation.text.handwriting;

import U.n;
import U.q;
import androidx.compose.foundation.layout.b;
import e2.InterfaceC0422a;
import y.AbstractC1230d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4859a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4860b = 10;

    public static final q a(InterfaceC0422a interfaceC0422a, boolean z3) {
        n nVar = n.f4488a;
        return (z3 && AbstractC1230d.f10377a) ? b.g(new StylusHandwritingElementWithNegativePadding(interfaceC0422a), f4860b, f4859a) : nVar;
    }
}
