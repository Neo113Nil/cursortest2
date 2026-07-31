package z0;

import android.view.ViewStructure;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends q6.j implements p6.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewStructure f9117e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ViewStructure viewStructure) {
        super(4);
        this.f9117e = viewStructure;
    }

    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue() - intValue2;
        this.f9117e.setDimens(intValue, intValue2, 0, 0, intValue3 - intValue, intValue4);
        return c6.m.f1757a;
    }
}
