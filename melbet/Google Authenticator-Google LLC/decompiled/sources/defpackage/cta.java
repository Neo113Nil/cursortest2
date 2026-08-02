package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cta implements ctf {
    private final /* synthetic */ int a;

    public cta(int i) {
        this.a = i;
    }

    @Override // defpackage.ctf
    public final cte a(Context context, String str, ctd ctdVar) {
        int b;
        int i = -1;
        if (this.a != 0) {
            cte cteVar = new cte();
            int b2 = ctdVar.b(context, str, true);
            cteVar.b = b2;
            if (b2 != 0) {
                cteVar.c = 1;
                return cteVar;
            }
            int a = ctdVar.a(context, str);
            cteVar.a = a;
            if (a != 0) {
                cteVar.c = -1;
            }
            return cteVar;
        }
        cte cteVar2 = new cte();
        int a2 = ctdVar.a(context, str);
        cteVar2.a = a2;
        int i2 = 0;
        if (a2 != 0) {
            b = ctdVar.b(context, str, false);
            cteVar2.b = b;
        } else {
            b = ctdVar.b(context, str, true);
            cteVar2.b = b;
        }
        int i3 = cteVar2.a;
        if (i3 != 0) {
            i2 = i3;
        } else if (b == 0) {
            i = 0;
            cteVar2.c = i;
            return cteVar2;
        }
        if (i2 < b) {
            i = 1;
        }
        cteVar2.c = i;
        return cteVar2;
    }
}
