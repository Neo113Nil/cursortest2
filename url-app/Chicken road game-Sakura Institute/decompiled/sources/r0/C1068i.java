package r0;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068i extends M2.p implements Function0 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1068i f9803e = new C1068i(0, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1068i f9804i = new C1068i(0, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1068i f9805j = new C1068i(0, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1068i(int i2, int i4) {
        super(i2);
        this.f9806d = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f9806d) {
            case 0:
                return new E(2, 0, true);
            case 1:
                return new LinkedHashMap();
            default:
                return new E(3, 0, false);
        }
    }
}
