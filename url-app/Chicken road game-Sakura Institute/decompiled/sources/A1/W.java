package A1;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class W extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(int i2, List list) {
        super(1);
        this.f549d = i2;
        this.f550e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f549d) {
            case 0:
                this.f550e.get(((Number) obj).intValue());
                break;
            case 1:
                this.f550e.get(((Number) obj).intValue());
                break;
            case 2:
                this.f550e.get(((Number) obj).intValue());
                break;
            case 3:
                this.f550e.get(((Number) obj).intValue());
                break;
            case 4:
                this.f550e.get(((Number) obj).intValue());
                break;
            default:
                this.f550e.get(((Number) obj).intValue());
                break;
        }
        return null;
    }
}
