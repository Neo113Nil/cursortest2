package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ws implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public ws(q60 q60Var) {
        this.f = 2;
        this.h = q60Var;
        Context context = q60Var.a.getContext();
        CharSequence charSequence = q60Var.h;
        c1 c1Var = new c1();
        c1Var.e = 4096;
        c1Var.g = 4096;
        c1Var.l = null;
        c1Var.m = null;
        c1Var.n = false;
        c1Var.o = false;
        c1Var.p = 16;
        c1Var.i = context;
        c1Var.a = charSequence;
        this.g = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ct ctVar = (ct) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ctVar.m.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, false, linearLayoutManager.v());
                int H = N0 == null ? -1 : nz.H(N0);
                e eVar = (e) obj;
                eVar.i = 2;
                ctVar.h(eVar.e(H + 1));
                break;
            case 1:
                ct ctVar2 = (ct) obj2;
                int L0 = ((LinearLayoutManager) ctVar2.m.getLayoutManager()).L0();
                e eVar2 = (e) obj;
                eVar2.i = 1;
                ctVar2.h(eVar2.e(L0 - 1));
                break;
            default:
                q60 q60Var = (q60) obj2;
                Window.Callback callback = q60Var.k;
                if (callback != null && q60Var.l) {
                    callback.onMenuItemSelected(0, (c1) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ws(ct ctVar, e eVar, int i) {
        this.f = i;
        this.h = ctVar;
        this.g = eVar;
    }
}
