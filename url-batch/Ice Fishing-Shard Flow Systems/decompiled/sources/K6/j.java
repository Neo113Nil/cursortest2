package K6;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1534e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1535i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EnumC0131b f1536l;

    public /* synthetic */ j(r rVar, int i2, EnumC0131b enumC0131b, int i5) {
        this.f1533d = i5;
        this.f1534e = rVar;
        this.f1535i = i2;
        this.f1536l = enumC0131b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1533d) {
            case 0:
                r rVar = this.f1534e;
                int i2 = this.f1535i;
                EnumC0131b statusCode = this.f1536l;
                try {
                    Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                    rVar.f1559E.t(i2, statusCode);
                } catch (IOException e7) {
                    EnumC0131b enumC0131b = EnumC0131b.f1492l;
                    rVar.a(enumC0131b, enumC0131b, e7);
                }
                return Unit.f6114a;
            default:
                r rVar2 = this.f1534e;
                int i5 = this.f1535i;
                EnumC0131b errorCode = this.f1536l;
                rVar2.f1572s.getClass();
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                synchronized (rVar2) {
                    rVar2.f1561G.remove(Integer.valueOf(i5));
                }
                return Unit.f6114a;
        }
    }
}
