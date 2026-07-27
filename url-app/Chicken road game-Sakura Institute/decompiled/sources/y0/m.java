package y0;

import kotlin.jvm.functions.Function1;
import r0.E;

/* loaded from: classes.dex */
public final class m extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final m f11581e = new m(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final m f11582i = new m(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i2, int i4) {
        super(i2);
        this.f11583d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11583d) {
            case 0:
                i o4 = ((E) obj).o();
                boolean z4 = false;
                if (o4 != null && o4.f11577e) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            default:
                return Boolean.valueOf(((E) obj).B.f(8));
        }
    }
}
