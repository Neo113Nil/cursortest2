package com.ice.fishing.grenza;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ap;
import defpackage.bs0;
import defpackage.bu1;
import defpackage.c;
import defpackage.ck;
import defpackage.d40;
import defpackage.e;
import defpackage.e0;
import defpackage.e40;
import defpackage.f40;
import defpackage.g;
import defpackage.g40;
import defpackage.gd;
import defpackage.gp;
import defpackage.h40;
import defpackage.hn;
import defpackage.i2;
import defpackage.i40;
import defpackage.i6zQx8Kd7UPU;
import defpackage.in;
import defpackage.j40;
import defpackage.jg0;
import defpackage.k40;
import defpackage.ki0;
import defpackage.kj0;
import defpackage.kr2;
import defpackage.kx;
import defpackage.l40;
import defpackage.ls;
import defpackage.nv;
import defpackage.on;
import defpackage.or2;
import defpackage.ov2;
import defpackage.ox0;
import defpackage.rj0;
import defpackage.u9;
import defpackage.uj0;
import defpackage.vi0;
import defpackage.vz1;
import defpackage.wc2;
import defpackage.xi0;
import defpackage.z71;
import defpackage.zu;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class MainActivity extends hn implements jg0 {
    public volatile i6zQx8Kd7UPU jyegZNwi31qc;
    public final Object aF05bpZJlKEP = new Object();
    public boolean kpCQ9veP6n3I = false;

    public MainActivity() {
        uj0 uj0Var = new uj0(this);
        ls lsVar = this.OPXfSBeufaJ8;
        lsVar.getClass();
        hn hnVar = lsVar.lS5Rgt96tfkO;
        if (hnVar != null) {
            uj0Var.PxuCJdSBwIXG(hnVar);
        }
        lsVar.PxuCJdSBwIXG.add(uj0Var);
    }

    @Override // defpackage.jg0
    public final Object Y1f8riQaR6yg() {
        return dgRBjINgWbAK().Y1f8riQaR6yg();
    }

    public final i6zQx8Kd7UPU dgRBjINgWbAK() {
        if (this.jyegZNwi31qc == null) {
            synchronized (this.aF05bpZJlKEP) {
                try {
                    if (this.jyegZNwi31qc == null) {
                        this.jyegZNwi31qc = new i6zQx8Kd7UPU(this);
                    }
                } finally {
                }
            }
        }
        return this.jyegZNwi31qc;
    }

    @Override // defpackage.bj0
    public final kr2 e9gEMXR7LXtO() {
        kr2 kr2Var = (kr2) this.IAToe7bXGz4N.getValue();
        nv nvVar = (nv) ((kx) ov2.aF05bpZJlKEP(this, kx.class));
        ox0 PxuCJdSBwIXG = nvVar.PxuCJdSBwIXG();
        i2 i2Var = new i2(nvVar.PxuCJdSBwIXG, nvVar.lS5Rgt96tfkO);
        kr2Var.getClass();
        return new rj0(PxuCJdSBwIXG, kr2Var, i2Var);
    }

    @Override // defpackage.hn, defpackage.gn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x50lh2ztY7Y5(bundle);
        wc2.Companion.getClass();
        wc2 wc2Var = new wc2(0, 0, 1, new vz1(21));
        wc2 wc2Var2 = new wc2(e40.PxuCJdSBwIXG, e40.lS5Rgt96tfkO, 0, new vz1(22));
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        l40 l40Var = e40.TSizfFm2Yiuu;
        if (l40Var == null) {
            int i = Build.VERSION.SDK_INT;
            l40Var = i >= 35 ? new k40() : i >= 30 ? new j40() : i >= 29 ? new i40() : i >= 28 ? new h40() : i >= 26 ? new g40() : new f40();
            e40.TSizfFm2Yiuu = l40Var;
        }
        l40 l40Var2 = l40Var;
        gd gdVar = new gd(l40Var2, wc2Var, wc2Var2, this, decorView, 1);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i2 = 0;
        while (true) {
            if (i2 >= viewGroup.getChildCount()) {
                d40 d40Var = new d40(gdVar, viewGroup.getContext());
                d40Var.setTag(l40Var2);
                d40Var.setVisibility(8);
                d40Var.setWillNotDraw(true);
                viewGroup.addView(d40Var);
                break;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.getTag() instanceof l40) {
                break;
            } else {
                i2 = i3;
            }
        }
        gdVar.run();
        Window window = getWindow();
        window.getClass();
        l40Var2.PxuCJdSBwIXG(window);
        on onVar = bs0.a92UlCVFR9N8;
        ViewGroup.LayoutParams layoutParams = in.PxuCJdSBwIXG;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ap apVar = childAt2 instanceof ap ? (ap) childAt2 : null;
        if (apVar != null) {
            apVar.setParentCompositionContext(null);
            apVar.setContent(onVar);
            return;
        }
        ap apVar2 = new ap(this);
        apVar2.setParentCompositionContext(null);
        apVar2.setContent(onVar);
        View decorView2 = getWindow().getDecorView();
        if (vi0.S2OOm9zPNm0h(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (kj0.IAToe7bXGz4N(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (xi0.IAToe7bXGz4N(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(apVar2, in.PxuCJdSBwIXG);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        gp gpVar = dgRBjINgWbAK().x50lh2ztY7Y5;
        if (gpVar != null) {
            gpVar.lS5Rgt96tfkO = null;
        }
    }

    public final void x50lh2ztY7Y5(Bundle bundle) {
        super.onCreate(bundle);
        i6zQx8Kd7UPU dgRBjINgWbAK = dgRBjINgWbAK();
        g gVar = dgRBjINgWbAK.dgRBjINgWbAK;
        MainActivity mainActivity = gVar.rtx2ld2ELZv4;
        c cVar = new c(0, gVar.OPXfSBeufaJ8);
        or2 RAsUl2FVSrh6 = mainActivity.RAsUl2FVSrh6();
        zu EpkonXwzFgDB = ki0.EpkonXwzFgDB(mainActivity);
        EpkonXwzFgDB.getClass();
        e0 e0Var = new e0(RAsUl2FVSrh6, cVar, EpkonXwzFgDB);
        ck PxuCJdSBwIXG = bu1.PxuCJdSBwIXG(e.class);
        String lS5Rgt96tfkO = PxuCJdSBwIXG.lS5Rgt96tfkO();
        if (lS5Rgt96tfkO == null) {
            u9.XL4ISE6Oc65B("Local and anonymous classes can not be ViewModels");
            return;
        }
        gp gpVar = ((e) e0Var.wdg6QnbFHrFF(PxuCJdSBwIXG, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(lS5Rgt96tfkO))).TSizfFm2Yiuu;
        dgRBjINgWbAK.x50lh2ztY7Y5 = gpVar;
        if (((z71) gpVar.lS5Rgt96tfkO) == null) {
            zu a92UlCVFR9N8 = dgRBjINgWbAK.wdg6QnbFHrFF.a92UlCVFR9N8();
            if (gpVar.PxuCJdSBwIXG) {
                gpVar.lS5Rgt96tfkO = (z71) a92UlCVFR9N8;
            } else {
                u9.rtx2ld2ELZv4("setExtras should only be called for an Activity that extends ComponentActivity");
            }
        }
    }
}
