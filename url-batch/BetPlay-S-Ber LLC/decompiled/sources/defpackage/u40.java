package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.awerser.monnit.betplay.MainActivity2;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.ArrayList;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class u40 implements gm, t0, y9, dw {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ u40(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // defpackage.gm
    public Object a(Object obj) {
        int i = this.f;
        Object obj2 = this.g;
        switch (i) {
            case 1:
                return obj == ((k) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 4:
                MainActivity2 mainActivity2 = (MainActivity2) obj2;
                en enVar = (en) obj;
                int i2 = MainActivity2.J;
                enVar.getClass();
                ArrayList arrayList = mainActivity2.I;
                arrayList.add(enVar);
                in inVar = mainActivity2.H;
                if (inVar == null) {
                    op.T("adapter");
                    throw null;
                }
                inVar.a.c(arrayList.size() - 1);
                r1 r1Var = mainActivity2.F;
                if (r1Var == null) {
                    op.T("binding");
                    throw null;
                }
                RecyclerView recyclerView = r1Var.d;
                int size = arrayList.size() - 1;
                if (!recyclerView.B) {
                    nz nzVar = recyclerView.r;
                    if (nzVar == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    } else {
                        nzVar.y0(recyclerView, size);
                    }
                }
                j1 j1Var = mainActivity2.G;
                if (j1Var == null) {
                    op.T("repository");
                    throw null;
                }
                j1Var.y(arrayList);
                mainActivity2.r();
                return vg.m;
            default:
                obj.getClass();
                return ((d2) obj2).a();
        }
    }

    @Override // defpackage.y9
    public void b() {
        CheckableImageButton checkableImageButton = ((d40) this.g).i;
        j8.W(checkableImageButton, checkableImageButton.getContentDescription());
    }

    @Override // defpackage.dw
    public ac0 onApplyWindowInsets(View view, ac0 ac0Var) {
        h50 h50Var = (h50) this.g;
        ArrayList arrayList = h50Var.b;
        xb0 xb0Var = ac0Var.a;
        ip b = ip.b(xb0Var.h(519), xb0Var.h(64));
        ip b2 = ip.b(xb0Var.i(519), xb0Var.i(64));
        if (!b.equals(h50Var.c) || !b2.equals(h50Var.d)) {
            h50Var.c = b;
            h50Var.d = b2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                cy cyVar = (cy) arrayList.get(size);
                cyVar.c = b;
                cyVar.d = b2;
                cyVar.b();
            }
        }
        return ac0Var;
    }

    @Override // defpackage.t0
    public boolean perform(View view, l0 l0Var) {
        boolean lambda$onBottomSheetStateChanged$0;
        lambda$onBottomSheetStateChanged$0 = ((BottomSheetDragHandleView) this.g).lambda$onBottomSheetStateChanged$0(view, null);
        return lambda$onBottomSheetStateChanged$0;
    }
}
