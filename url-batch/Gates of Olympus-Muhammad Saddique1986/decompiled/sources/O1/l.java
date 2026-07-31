package O1;

import e2.InterfaceC0424c;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f3808f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i3, List list) {
        super(1);
        this.f3807e = i3;
        this.f3808f = list;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f3807e) {
            case 0:
                this.f3808f.get(((Number) obj).intValue());
                break;
            case 1:
                this.f3808f.get(((Number) obj).intValue());
                break;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f3808f.get(((Number) obj).intValue());
                break;
            default:
                this.f3808f.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
