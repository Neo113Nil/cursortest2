package H1;

import h1.C0438i;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f1898f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, List list) {
        super(1);
        this.f1897e = i3;
        this.f1898f = list;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f1897e) {
            case 0:
                this.f1898f.get(((Number) obj).intValue());
                break;
            case 1:
                this.f1898f.get(((Number) obj).intValue());
                break;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                this.f1898f.get(((Number) obj).intValue());
                break;
            default:
                this.f1898f.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
