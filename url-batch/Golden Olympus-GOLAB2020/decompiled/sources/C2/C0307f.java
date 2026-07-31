package C2;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import y2.InterfaceC3527b;

/* renamed from: C2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0307f extends AbstractC0342x {

    /* renamed from: b, reason: collision with root package name */
    private final A2.f f280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0307f(InterfaceC3527b element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f280b = new C0305e(element.getDescriptor());
    }

    @Override // C2.AbstractC0340w, y2.InterfaceC3527b, y2.InterfaceC3535j, y2.InterfaceC3526a
    public A2.f getDescriptor() {
        return this.f280b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public ArrayList a() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public int b(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void c(ArrayList arrayList, int i4) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0340w
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(ArrayList arrayList, int i4, Object obj) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i4, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ArrayList k(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = list instanceof ArrayList ? (ArrayList) list : null;
        return arrayList == null ? new ArrayList(list) : arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // C2.AbstractC0297a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public List l(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
