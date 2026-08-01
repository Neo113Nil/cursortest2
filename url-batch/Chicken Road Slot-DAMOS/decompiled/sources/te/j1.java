package te;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j1 extends q {

    /* renamed from: b, reason: collision with root package name */
    public final ce.b f9393b;

    /* renamed from: c, reason: collision with root package name */
    public final b f9394c;

    public j1(ce.b bVar, pe.a aVar) {
        super(aVar);
        this.f9393b = bVar;
        re.e d10 = aVar.d();
        d10.getClass();
        this.f9394c = new b(d10, 0);
    }

    @Override // pe.a
    public final re.e d() {
        return this.f9394c;
    }

    @Override // te.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // te.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // te.a
    public final Iterator g(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new hd.u(objArr);
    }

    @Override // te.a
    public final int h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // te.a
    public final Object k(Object obj) {
        throw null;
    }

    @Override // te.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Object newInstance = Array.newInstance((Class<?>) a.a.D(this.f9393b), arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // te.q
    public final void m(int i3, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i3, obj2);
    }
}
