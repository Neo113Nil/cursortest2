package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dxj extends dza {
    private final dzd a;
    private final eak b;
    private final eap c;
    private final ldt d;

    public dxj(dzd dzdVar, ldt ldtVar, eak eakVar, eap eapVar) {
        this.a = dzdVar;
        this.d = ldtVar;
        this.b = eakVar;
        this.c = eapVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        dxk dxkVar = (dxk) obj;
        jgg jggVar = (jgg) obj2;
        dxkVar.getClass();
        jggVar.getClass();
        jgh jghVar = new jgh(jggVar);
        this.d.p(dxkVar.a, 90144, jghVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    @Override // defpackage.dza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int id;
        jhy jhyVar;
        dxk dxkVar = (dxk) obj;
        jgg jggVar = (jgg) obj2;
        dxkVar.getClass();
        jggVar.getClass();
        TextView textView = dxkVar.v;
        textView.setText(jggVar.c);
        TextView textView2 = dxkVar.w;
        String str = jggVar.d;
        textView2.setText(str);
        jht jhtVar = jggVar.e;
        if (jhtVar != null) {
            dxkVar.y.setVisibility(0);
            eap eapVar = this.c;
            Object bB = dxkVar.x.bB();
            bB.getClass();
            eapVar.c(bB, jhtVar.a);
        } else {
            dxkVar.y.setVisibility(8);
        }
        tn tnVar = new tn();
        ConstraintLayout constraintLayout = dxkVar.t;
        tnVar.c(constraintLayout);
        int i = jhtVar != null ? jhtVar.b : 0;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 1) {
                id = textView.getId();
            } else if (i2 == 3) {
                id = constraintLayout.getId();
            }
            FrameLayout frameLayout = dxkVar.y;
            tnVar.e(frameLayout.getId(), 3, id, 3);
            tnVar.e(frameLayout.getId(), 4, id, 4);
            tnVar.b(constraintLayout);
            textView2.setVisibility(str == null ? 0 : 8);
            this.a.c(dxkVar.u, new dzc(jggVar.a, jggVar.b, jggVar.g));
            jhyVar = jggVar.f;
            if (jhyVar != null) {
                dxkVar.z.setVisibility(8);
                return;
            }
            dxkVar.z.setVisibility(0);
            eak eakVar = this.b;
            Object bB2 = dxkVar.A.bB();
            bB2.getClass();
            eakVar.c(bB2, jhyVar);
            return;
        }
        id = str != null ? textView2.getId() : textView.getId();
        FrameLayout frameLayout2 = dxkVar.y;
        tnVar.e(frameLayout2.getId(), 3, id, 3);
        tnVar.e(frameLayout2.getId(), 4, id, 4);
        tnVar.b(constraintLayout);
        textView2.setVisibility(str == null ? 0 : 8);
        this.a.c(dxkVar.u, new dzc(jggVar.a, jggVar.b, jggVar.g));
        jhyVar = jggVar.f;
        if (jhyVar != null) {
        }
    }
}
