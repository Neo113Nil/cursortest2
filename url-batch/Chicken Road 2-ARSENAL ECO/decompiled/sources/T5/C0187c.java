package T5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: T5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187c extends AbstractC0197m {

    /* renamed from: b, reason: collision with root package name */
    public final C0186b f2421b;

    public C0187c() {
        super(U5.o.f2662a);
        R5.f elementDesc = U5.o.f2663b;
        kotlin.jvm.internal.i.e(elementDesc, "elementDesc");
        this.f2421b = new C0186b(elementDesc);
    }

    @Override // Q5.a
    public final R5.e c() {
        return this.f2421b;
    }

    @Override // T5.AbstractC0185a
    public final Object d() {
        return new ArrayList();
    }

    @Override // T5.AbstractC0185a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // T5.AbstractC0185a
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.i.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // T5.AbstractC0185a
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.i.e(collection, "<this>");
        return collection.size();
    }

    @Override // T5.AbstractC0185a
    public final Object j(Object obj) {
        kotlin.jvm.internal.i.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // T5.AbstractC0185a
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // T5.AbstractC0197m
    public final void l(Object obj, int i7, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.i.e(arrayList, "<this>");
        arrayList.add(i7, obj2);
    }
}
