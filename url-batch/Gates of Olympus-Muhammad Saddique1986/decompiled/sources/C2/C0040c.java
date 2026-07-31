package C2;

import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: C2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040c extends AbstractC0051n {

    /* renamed from: b, reason: collision with root package name */
    public final C0039b f737b;

    public C0040c() {
        super(D2.n.f896a);
        A2.h hVar = D2.n.f897b;
        f2.j.f(hVar, "elementDesc");
        this.f737b = new C0039b(hVar);
    }

    @Override // C2.AbstractC0038a
    public final Object a() {
        return new ArrayList();
    }

    @Override // C2.AbstractC0038a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        f2.j.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // C2.AbstractC0038a
    public final Object e(Object obj) {
        f2.j.f(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // C2.AbstractC0038a
    public final Object f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        f2.j.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // C2.AbstractC0051n
    public final void g(Object obj, int i3, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        f2.j.f(arrayList, "<this>");
        arrayList.add(i3, obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f737b;
    }
}
