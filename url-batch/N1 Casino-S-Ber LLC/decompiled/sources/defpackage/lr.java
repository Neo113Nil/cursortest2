package defpackage;

import com.derinko.gbini.n1casino.MainActivity2;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class lr implements xl {
    public final /* synthetic */ int f;
    public final /* synthetic */ MainActivity2 g;

    public /* synthetic */ lr(MainActivity2 mainActivity2, int i) {
        this.f = i;
        this.g = mainActivity2;
    }

    @Override // defpackage.xl
    public final Object a(Object obj) {
        int i = this.f;
        MainActivity2 mainActivity2 = this.g;
        switch (i) {
            case 0:
                fv fvVar = (fv) obj;
                int i2 = MainActivity2.J;
                fvVar.getClass();
                mainActivity2.r(fvVar);
                return dh.m;
            case 1:
                fv fvVar2 = (fv) obj;
                int i3 = MainActivity2.J;
                fvVar2.getClass();
                mr mrVar = mainActivity2.G;
                if (mrVar == null) {
                    zo.O("repository");
                    throw null;
                }
                mrVar.g(fv.a(fvVar2, null, null, null, !fvVar2.e, 0L, 111));
                mainActivity2.q();
                return dh.m;
            case 2:
                fv fvVar3 = (fv) obj;
                int i4 = MainActivity2.J;
                fvVar3.getClass();
                mr mrVar2 = mainActivity2.G;
                if (mrVar2 == null) {
                    zo.O("repository");
                    throw null;
                }
                mrVar2.g(fvVar3);
                mainActivity2.q();
                return dh.m;
            default:
                String str = (String) obj;
                int i5 = MainActivity2.J;
                str.getClass();
                mr mrVar3 = mainActivity2.G;
                if (mrVar3 == null) {
                    zo.O("repository");
                    throw null;
                }
                mrVar3.d(str);
                mainActivity2.q();
                return dh.m;
        }
    }
}
