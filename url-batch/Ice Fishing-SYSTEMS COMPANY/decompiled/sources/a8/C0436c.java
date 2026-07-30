package a8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: a8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0436c extends AbstractC0446m {

    /* renamed from: b, reason: collision with root package name */
    public final C0435b f4466b;

    public C0436c() {
        super(b8.p.f5617a);
        Y7.f elementDesc = b8.p.f5618b;
        kotlin.jvm.internal.h.e(elementDesc, "elementDesc");
        this.f4466b = new C0435b(elementDesc);
    }

    @Override // X7.a
    public final Y7.e c() {
        return this.f4466b;
    }

    @Override // a8.AbstractC0434a
    public final Object d() {
        return new ArrayList();
    }

    @Override // a8.AbstractC0434a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // a8.AbstractC0434a
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.h.e(collection, "<this>");
        return collection.iterator();
    }

    @Override // a8.AbstractC0434a
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        kotlin.jvm.internal.h.e(collection, "<this>");
        return collection.size();
    }

    @Override // a8.AbstractC0434a
    public final Object j(Object obj) {
        kotlin.jvm.internal.h.e(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // a8.AbstractC0434a
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        return arrayList;
    }

    @Override // a8.AbstractC0446m
    public final void l(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        arrayList.add(i, obj2);
    }
}
