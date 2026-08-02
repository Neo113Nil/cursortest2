package defpackage;

import android.content.Context;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class dds implements cox {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ dds(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.cox
    public final void a(Object obj, Object obj2) {
        if (this.d == 0) {
            dbz dbzVar = new dbz((cme) this.b, 2);
            ((dej) obj).I((dbz) this.c, dbzVar, new ddu((ddw) this.a, (bst) obj2, dbzVar));
            return;
        }
        cwp cwpVar = (cwp) obj;
        cwr cwrVar = cww.k;
        cwl cwlVar = (cwl) cwpVar.v();
        cwv cwvVar = new cwv((bst) obj2);
        Context context = cwpVar.b;
        byte[] f = ((jja) this.b).f();
        cmn A = dih.A();
        Parcel a = cwlVar.a();
        bmt.d(a, cwvVar);
        a.writeString((String) this.a);
        a.writeByteArray(f);
        a.writeString((String) this.c);
        bmt.c(a, A);
        cwlVar.c(17, a);
    }
}
