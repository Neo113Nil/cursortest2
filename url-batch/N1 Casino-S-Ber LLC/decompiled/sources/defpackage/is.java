package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class is implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public is(k60 k60Var) {
        this.f = 2;
        this.h = k60Var;
        Context context = k60Var.a.getContext();
        CharSequence charSequence = k60Var.h;
        a1 a1Var = new a1();
        a1Var.e = 4096;
        a1Var.g = 4096;
        a1Var.l = null;
        a1Var.m = null;
        a1Var.n = false;
        a1Var.o = false;
        a1Var.p = 16;
        a1Var.i = context;
        a1Var.a = charSequence;
        this.g = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                os osVar = (os) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) osVar.f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int H = N0 == null ? -1 : xy.H(N0);
                e eVar = (e) obj;
                eVar.i = 2;
                osVar.K(eVar.g(H + 1));
                break;
            case 1:
                os osVar2 = (os) obj2;
                int L0 = ((LinearLayoutManager) osVar2.f0.getLayoutManager()).L0();
                e eVar2 = (e) obj;
                eVar2.i = 1;
                osVar2.K(eVar2.g(L0 - 1));
                break;
            default:
                k60 k60Var = (k60) obj2;
                Window.Callback callback = k60Var.k;
                if (callback != null && k60Var.l) {
                    callback.onMenuItemSelected(0, (a1) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ is(os osVar, e eVar, int i) {
        this.f = i;
        this.h = osVar;
        this.g = eVar;
    }
}
