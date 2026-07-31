package w2;

import java.util.ArrayList;
import java.util.Collection;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024c extends AbstractC1035n {

    /* renamed from: b, reason: collision with root package name */
    public final C1023b f8650b;

    public C1024c() {
        super(x2.n.f8756a);
        u2.f fVar = x2.n.f8757b;
        Z1.i.f(fVar, "elementDesc");
        this.f8650b = new C1023b(fVar);
    }

    @Override // w2.AbstractC1022a
    public final Object a() {
        return new ArrayList();
    }

    @Override // w2.AbstractC1022a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Z1.i.f(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // w2.AbstractC1022a
    public final Object e(Object obj) {
        Z1.i.f(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // w2.AbstractC1022a
    public final Object f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Z1.i.f(arrayList, "<this>");
        return arrayList;
    }

    @Override // w2.AbstractC1035n
    public final void g(Object obj, int i3, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Z1.i.f(arrayList, "<this>");
        arrayList.add(i3, obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f8650b;
    }
}
