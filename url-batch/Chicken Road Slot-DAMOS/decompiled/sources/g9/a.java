package g9;

import a4.j;
import i9.d;
import kotlin.jvm.functions.Function2;
import n9.c;
import wd.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4320d;

    public /* synthetic */ a(int i3) {
        this.f4320d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4320d) {
            case 0:
                lf.a aVar = (lf.a) obj;
                aVar.getClass();
                ((gf.a) obj2).getClass();
                return new s9.a((k9.a) aVar.d(c0.a(k9.a.class), null));
            case 1:
                lf.a aVar2 = (lf.a) obj;
                aVar2.getClass();
                ((gf.a) obj2).getClass();
                return new c((k9.a) aVar2.d(c0.a(k9.a.class), null));
            case 2:
                lf.a aVar3 = (lf.a) obj;
                aVar3.getClass();
                ((gf.a) obj2).getClass();
                return new q9.a((d) aVar3.d(c0.a(d.class), null));
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                lf.a aVar4 = (lf.a) obj;
                aVar4.getClass();
                ((gf.a) obj2).getClass();
                return new t9.c((i9.c) aVar4.d(c0.a(i9.c.class), null), (d) aVar4.d(c0.a(d.class), null));
            default:
                lf.a aVar5 = (lf.a) obj;
                aVar5.getClass();
                ((gf.a) obj2).getClass();
                return new f9.a((i9.c) aVar5.d(c0.a(i9.c.class), null));
        }
    }
}
