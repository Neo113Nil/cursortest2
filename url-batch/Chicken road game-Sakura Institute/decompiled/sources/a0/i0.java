package a0;

import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i0 extends r6.l implements q6.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f88g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m2 f89h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(m2 m2Var, int i7) {
        super(0);
        this.f88g = i7;
        this.f89h = m2Var;
    }

    @Override // q6.a
    public final Object a() {
        int i7 = this.f88g;
        m2 m2Var = this.f89h;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new y0.c(((y0.c) m2Var.getValue()).f9778a);
            case 1:
                l.n nVar = m0.f106a;
                return new y0.c(((y0.c) m2Var.getValue()).f9778a);
            case 2:
                return (Float) m2Var.getValue();
            case 3:
                return Boolean.valueOf(((Number) m2Var.getValue()).floatValue() > 0.0f);
            case 4:
                return Boolean.valueOf(((Number) m2Var.getValue()).floatValue() > 0.0f);
            default:
                List list = (List) m2Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (r6.k.a(((t3.h) obj).f8792g.f8857f, "composable")) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
        }
    }
}
