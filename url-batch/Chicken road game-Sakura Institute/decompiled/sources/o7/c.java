package o7;

import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final b f6862b;

    public c() {
        super(p7.m.f7230a);
        m7.f fVar = p7.m.f7231b;
        r6.k.f(fVar, "elementDesc");
        this.f6862b = new b(fVar);
    }

    @Override // o7.a
    public final Object a() {
        return new ArrayList();
    }

    @Override // o7.a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        r6.k.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // o7.a
    public final Object e(Object obj) {
        r6.k.f(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // o7.a
    public final Object f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        r6.k.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // o7.n
    public final void g(Object obj, int i7, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        r6.k.f(arrayList, "<this>");
        arrayList.add(i7, obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f6862b;
    }
}
