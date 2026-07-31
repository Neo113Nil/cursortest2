package V5;

import T5.X;
import T5.a0;
import T5.d0;
import T5.g0;
import a.AbstractC0219a;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f2766a = AbstractC0219a.B(a0.f2418b, d0.f2426b, X.f2413b, g0.f2436b);

    public static final boolean a(R5.e eVar) {
        kotlin.jvm.internal.i.e(eVar, "<this>");
        return eVar.isInline() && f2766a.contains(eVar);
    }
}
