package r;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final m f9499e = new m(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final m f9500i = new m(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i4) {
        super(i2);
        this.f9501d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9501d) {
            case 0:
                return Unit.f7487a;
            default:
                List list = (List) obj;
                return new v(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        }
    }
}
