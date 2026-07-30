package b;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ListIterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends r6.l implements q6.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f1224h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(i0 i0Var, int i7) {
        super(1);
        this.f1223g = i7;
        this.f1224h = i0Var;
    }

    @Override // q6.c
    public final Object f(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.f1223g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b bVar = (b) obj;
                r6.k.f(bVar, "backEvent");
                i0 i0Var = this.f1224h;
                e6.j jVar = i0Var.f1162b;
                ListIterator listIterator = jVar.listIterator(jVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((y) obj2).f1220a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                y yVar = (y) obj2;
                if (i0Var.f1163c != null) {
                    i0Var.b();
                }
                i0Var.f1163c = yVar;
                if (yVar != null) {
                    yVar.d(bVar);
                }
                break;
            default:
                b bVar2 = (b) obj;
                r6.k.f(bVar2, "backEvent");
                i0 i0Var2 = this.f1224h;
                y yVar2 = i0Var2.f1163c;
                if (yVar2 == null) {
                    e6.j jVar2 = i0Var2.f1162b;
                    ListIterator listIterator2 = jVar2.listIterator(jVar2.a());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((y) obj3).f1220a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    yVar2 = (y) obj3;
                }
                if (yVar2 != null) {
                    yVar2.c(bVar2);
                }
                break;
        }
        return d6.z.f2639a;
    }
}
