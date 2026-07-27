package P;

import M2.p;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final e f3650e = new e(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final e f3651i = new e(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i4) {
        super(i2);
        this.f3652d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3652d) {
            case 0:
                return new i((Map) obj);
            default:
                return obj;
        }
    }
}
