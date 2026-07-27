package androidx.compose.foundation.text.handwriting;

import S.l;
import S.o;
import androidx.compose.foundation.layout.b;
import kotlin.jvm.functions.Function0;
import x.AbstractC1298d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final float f5125a = 40;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5126b = 10;

    public static final o a(Function0 function0, boolean z4) {
        l lVar = l.f3977a;
        return (z4 && AbstractC1298d.f11401a) ? b.i(new StylusHandwritingElementWithNegativePadding(function0), f5126b, f5125a) : lVar;
    }
}
