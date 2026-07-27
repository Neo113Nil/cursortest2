package c3;

import D2.f;
import W2.AbstractC0275a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(Function2 function2, AbstractC0275a abstractC0275a, AbstractC0275a abstractC0275a2) {
        try {
            C2.a b4 = f.b(f.a(abstractC0275a, abstractC0275a2, function2));
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            b3.a.i(b4, Unit.f7487a);
        } catch (Throwable th) {
            AbstractC1341p.a aVar2 = AbstractC1341p.f11673d;
            abstractC0275a2.u(AbstractC1343r.a(th));
            throw th;
        }
    }
}
