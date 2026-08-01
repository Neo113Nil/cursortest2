package af;

import a1.f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wd.h;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final hf.a f368a;

    /* renamed from: b, reason: collision with root package name */
    public final h f369b;

    /* renamed from: c, reason: collision with root package name */
    public final Function2 f370c;

    /* renamed from: d, reason: collision with root package name */
    public final b f371d;

    /* renamed from: e, reason: collision with root package name */
    public List f372e;

    public a(hf.a aVar, h hVar, Function2 function2, b bVar, j0 j0Var) {
        aVar.getClass();
        j0Var.getClass();
        this.f368a = aVar;
        this.f369b = hVar;
        this.f370c = function2;
        this.f371d = bVar;
        this.f372e = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        a aVar = (a) obj;
        return this.f369b.equals(aVar.f369b) && Intrinsics.a(this.f368a, aVar.f368a);
    }

    public final int hashCode() {
        return this.f368a.hashCode() + (this.f369b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(this.f371d);
        sb2.append(": '");
        sb2.append(mf.a.a(this.f369b));
        sb2.append('\'');
        hf.b bVar = jf.b.f5254e;
        hf.a aVar = this.f368a;
        if (!Intrinsics.a(aVar, bVar)) {
            sb2.append(",scope:");
            sb2.append(aVar);
        }
        if (!this.f372e.isEmpty()) {
            sb2.append(",binds:");
            CollectionsKt.A(this.f372e, sb2, ",", new f(2), 60);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
