package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.e;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class jv implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public jv(s90 s90Var) {
        this.f = 2;
        this.h = s90Var;
        Context context = s90Var.a.getContext();
        CharSequence charSequence = s90Var.h;
        b1 b1Var = new b1();
        b1Var.e = 4096;
        b1Var.g = 4096;
        b1Var.l = null;
        b1Var.m = null;
        b1Var.n = false;
        b1Var.o = false;
        b1Var.p = 16;
        b1Var.i = context;
        b1Var.a = charSequence;
        this.g = b1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                pv pvVar = (pv) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) pvVar.f0.getLayoutManager();
                View N0 = linearLayoutManager.N0(0, linearLayoutManager.v(), false);
                int H = N0 == null ? -1 : b20.H(N0);
                e eVar = (e) obj;
                eVar.i = 2;
                pvVar.K(eVar.e(H + 1));
                break;
            case 1:
                pv pvVar2 = (pv) obj2;
                int L0 = ((LinearLayoutManager) pvVar2.f0.getLayoutManager()).L0();
                e eVar2 = (e) obj;
                eVar2.i = 1;
                pvVar2.K(eVar2.e(L0 - 1));
                break;
            default:
                s90 s90Var = (s90) obj2;
                Window.Callback callback = s90Var.k;
                if (callback != null && s90Var.l) {
                    callback.onMenuItemSelected(0, (b1) obj);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jv(pv pvVar, e eVar, int i) {
        this.f = i;
        this.h = pvVar;
        this.g = eVar;
    }
}
