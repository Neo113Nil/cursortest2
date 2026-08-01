package defpackage;

import android.content.Context;
import com.trembin.nirefon.betfury.data.Note;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class j2 implements tr {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(Object obj, Object obj2, Object obj3, int i) {
        this.f = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        int i = this.f;
        sk0 sk0Var = sk0.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                Note note = (Note) obj2;
                long longValue = ((Long) obj).longValue();
                if (((m2) obj4).r0 != null) {
                    context.getClass();
                    gk0.M(context, Note.copy$default(note, (int) longValue, null, null, null, false, null, 0L, 0L, 254, null));
                    break;
                }
                break;
            default:
                a90 a90Var = (a90) obj3;
                n10 n10Var = (n10) obj2;
                ty tyVar = (ty) ((h) obj4).h(obj);
                Object obj5 = a90Var.f;
                if (obj5 != tyVar) {
                    if (obj5 != null) {
                        m10 m10Var = (m10) n10Var.l.b((ty) obj5);
                        if (m10Var != null) {
                            m10Var.b();
                        }
                    }
                    a90Var.f = tyVar;
                    if (tyVar != null) {
                        n10Var.i(tyVar, new lz(new h(9, n10Var), 1));
                        break;
                    }
                }
                break;
        }
        return sk0Var;
    }
}
