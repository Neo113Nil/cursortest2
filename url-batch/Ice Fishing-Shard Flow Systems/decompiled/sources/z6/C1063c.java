package z6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1063c extends AbstractC1073m {

    /* renamed from: b, reason: collision with root package name */
    public final C1062b f8773b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1063c() {
        super(element);
        A6.p element = A6.p.f131a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        x6.f elementDesc = A6.p.f132b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f8773b = new C1062b(elementDesc);
    }

    @Override // w6.a
    public final x6.e c() {
        return this.f8773b;
    }

    @Override // z6.AbstractC1061a
    public final Object d() {
        return new ArrayList();
    }

    @Override // z6.AbstractC1061a
    public final int e(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // z6.AbstractC1061a
    public final Iterator f(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.iterator();
    }

    @Override // z6.AbstractC1061a
    public final int g(Object obj) {
        Collection collection = (Collection) obj;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    @Override // z6.AbstractC1061a
    public final Object j(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // z6.AbstractC1061a
    public final Object k(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // z6.AbstractC1073m
    public final void l(Object obj, int i2, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i2, obj2);
    }
}
