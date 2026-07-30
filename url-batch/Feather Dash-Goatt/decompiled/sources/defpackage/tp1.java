package defpackage;

import android.view.View;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tp1 implements sg0 {
    public final /* synthetic */ cn d;
    public final /* synthetic */ bw0 e;
    public final /* synthetic */ o11 g;
    public final /* synthetic */ z11 h;
    public final /* synthetic */ View i;

    public tp1(cn cnVar, bw0 bw0Var, o11 o11Var, z11 z11Var, View view) {
        this.d = cnVar;
        this.e = bw0Var;
        this.g = o11Var;
        this.h = z11Var;
        this.i = view;
    }

    @Override // defpackage.sg0
    public final void e(vg0 vg0Var, ng0 ng0Var) {
        boolean z;
        sf sfVar = null;
        switch (sp1.a[ng0Var.ordinal()]) {
            case 1:
                cn cnVar = this.d;
                vn vnVar = vn.d;
                uq1.N(cnVar, null, new po(this.h, this.g, vg0Var, this, this.i, null), 1);
                return;
            case 2:
                bw0 bw0Var = this.e;
                if (bw0Var != null) {
                    nz nzVar = bw0Var.e;
                    synchronized (nzVar.b) {
                        try {
                            synchronized (nzVar.b) {
                                z = nzVar.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) nzVar.c;
                                nzVar.c = (ArrayList) nzVar.d;
                                nzVar.d = arrayList;
                                nzVar.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    dn dnVar = (dn) arrayList.get(i);
                                    i31 i31Var = k31.d;
                                    dnVar.l(Unit.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                o11 o11Var = this.g;
                synchronized (o11Var.c) {
                    if (o11Var.t) {
                        o11Var.t = false;
                        sfVar = o11Var.y();
                    }
                }
                if (sfVar != null) {
                    i31 i31Var2 = k31.d;
                    ((tf) sfVar).l(Unit.a);
                    return;
                }
                return;
            case 3:
                o11 o11Var2 = this.g;
                synchronized (o11Var2.c) {
                    o11Var2.t = true;
                }
                return;
            case 4:
                this.g.x();
                return;
            case ry0.STRING_FIELD_NUMBER /* 5 */:
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                l.a();
                return;
        }
    }
}
