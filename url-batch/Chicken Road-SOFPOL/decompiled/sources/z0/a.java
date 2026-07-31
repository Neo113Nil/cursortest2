package z0;

import android.graphics.Rect;
import android.view.autofill.AutofillManager;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends q6.j implements p6.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f9100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9101f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, int i) {
        super(4);
        this.f9100e = bVar;
        this.f9101f = i;
    }

    @Override // p6.g
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        int intValue3 = ((Number) obj3).intValue();
        int intValue4 = ((Number) obj4).intValue();
        b bVar = this.f9100e;
        q3.k kVar = bVar.f9102a;
        ((AutofillManager) kVar.f6119e).notifyViewEntered(bVar.f9104c, this.f9101f, new Rect(intValue, intValue2, intValue3, intValue4));
        return c6.m.f1757a;
    }
}
