package D6;

import K6.EnumC0131b;
import c4.C0306l;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Function0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f547e;

    public /* synthetic */ o(int i2, Object obj) {
        this.f546d = i2;
        this.f547e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [R5.h, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f546d) {
            case 0:
                try {
                    return (List) ((Function0) this.f547e).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return kotlin.collections.A.f6115d;
                }
            case 1:
                return (List) this.f547e;
            case 2:
                List<Certificate> a7 = ((p) this.f547e).a();
                ArrayList arrayList = new ArrayList(kotlin.collections.s.g(a7, 10));
                for (Certificate certificate : a7) {
                    Intrinsics.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 3:
                K6.r rVar = (K6.r) this.f547e;
                rVar.getClass();
                try {
                    rVar.f1559E.s(2, 0, false);
                } catch (IOException e7) {
                    EnumC0131b enumC0131b = EnumC0131b.f1492l;
                    rVar.a(enumC0131b, enumC0131b, e7);
                }
                return Unit.f6114a;
            case 4:
                return new l2.c((T6.g) ((C0306l) this.f547e).f4250f.getValue());
            default:
                Object[] array = (Object[]) this.f547e;
                Intrinsics.checkNotNullParameter(array, "array");
                return new R5.u(array);
        }
    }
}
