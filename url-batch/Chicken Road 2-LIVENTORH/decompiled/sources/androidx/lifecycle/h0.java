package androidx.lifecycle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class h0 implements e3.a, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0 f609f;

    public h0(p0 p0Var) {
        this.f609f = p0Var;
    }

    @Override // e3.a
    public final Object a() {
        ArrayList arrayList = new ArrayList();
        f3.e.f1554a.getClass();
        arrayList.add(new a1.d());
        a1.d[] dVarArr = (a1.d[]) arrayList.toArray(new a1.d[0]);
        a0.a aVar = new a0.a((a1.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        p0 p0Var = this.f609f;
        return (j0) new androidx.emoji2.text.t(p0Var.d(), aVar, p0Var instanceof h ? ((h) p0Var).a() : a1.a.f105b).j("androidx.lifecycle.internal.SavedStateHandlesVM", j0.class);
    }

    public final String toString() {
        f3.e.f1554a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        f3.d.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
