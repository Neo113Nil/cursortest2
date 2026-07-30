package K6;

import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1541d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f1542e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1543i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f1544l;

    public /* synthetic */ l(r rVar, int i2, List list) {
        this.f1542e = rVar;
        this.f1543i = i2;
        this.f1544l = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1541d) {
            case 0:
                r rVar = this.f1542e;
                int i2 = this.f1543i;
                List requestHeaders = this.f1544l;
                rVar.f1572s.getClass();
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                try {
                    rVar.f1559E.t(i2, EnumC0131b.f1496p);
                    synchronized (rVar) {
                        rVar.f1561G.remove(Integer.valueOf(i2));
                        Unit unit = Unit.f6114a;
                    }
                } catch (IOException unused) {
                }
                return Unit.f6114a;
            default:
                r rVar2 = this.f1542e;
                int i5 = this.f1543i;
                List responseHeaders = this.f1544l;
                rVar2.f1572s.getClass();
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                try {
                    rVar2.f1559E.t(i5, EnumC0131b.f1496p);
                    synchronized (rVar2) {
                        rVar2.f1561G.remove(Integer.valueOf(i5));
                        Unit unit2 = Unit.f6114a;
                    }
                } catch (IOException unused2) {
                }
                return Unit.f6114a;
        }
    }

    public /* synthetic */ l(r rVar, int i2, List list, boolean z7) {
        this.f1542e = rVar;
        this.f1543i = i2;
        this.f1544l = list;
    }
}
