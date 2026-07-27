package i3;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0682c extends AbstractC0693n {

    /* renamed from: b, reason: collision with root package name */
    public final C0681b f7059b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0682c() {
        super(element);
        j3.o element = j3.o.f7215a;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(element, "element");
        g3.f elementDesc = j3.o.f7216b;
        Intrinsics.checkNotNullParameter(elementDesc, "elementDesc");
        this.f7059b = new C0681b(elementDesc);
    }

    @Override // i3.AbstractC0680a
    public final Object a() {
        return new ArrayList();
    }

    @Override // i3.AbstractC0680a
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // i3.AbstractC0680a
    public final Object e(Object obj) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        return new ArrayList((Collection) null);
    }

    @Override // i3.AbstractC0680a
    public final Object f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }

    @Override // i3.AbstractC0693n
    public final void g(Object obj, int i2, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i2, obj2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f7059b;
    }
}
