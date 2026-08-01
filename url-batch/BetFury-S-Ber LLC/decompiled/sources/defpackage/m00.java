package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class m00 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public m00(yi0 yi0Var) {
        this.f = 2;
        this.h = yi0Var;
        Context context = yi0Var.a.getContext();
        CharSequence charSequence = yi0Var.h;
        e1 e1Var = new e1();
        e1Var.e = 4096;
        e1Var.g = 4096;
        e1Var.l = null;
        e1Var.m = null;
        e1Var.n = false;
        e1Var.o = false;
        e1Var.p = 16;
        e1Var.i = context;
        e1Var.a = charSequence;
        this.g = e1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                s00 s00Var = (s00) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) s00Var.f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int H = N0 == null ? -1 : h80.H(N0);
                e eVar = (e) obj;
                eVar.i = 2;
                s00Var.K(eVar.e(H + 1));
                break;
            case 1:
                s00 s00Var2 = (s00) obj2;
                int L0 = ((LinearLayoutManager) s00Var2.f0.getLayoutManager()).L0();
                e eVar2 = (e) obj;
                eVar2.i = 1;
                s00Var2.K(eVar2.e(L0 - 1));
                break;
            default:
                yi0 yi0Var = (yi0) obj2;
                Window.Callback callback = yi0Var.k;
                if (callback != null && yi0Var.l) {
                    callback.onMenuItemSelected(0, (e1) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m00(s00 s00Var, e eVar, int i) {
        this.f = i;
        this.h = s00Var;
        this.g = eVar;
    }
}
