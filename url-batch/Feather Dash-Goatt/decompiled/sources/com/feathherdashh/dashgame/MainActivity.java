package com.feathherdashh.dashgame;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.appsflyer.AppsFlyerLib;
import defpackage.av0;
import defpackage.dg1;
import defpackage.gb0;
import defpackage.h41;
import defpackage.hk;
import defpackage.jl;
import defpackage.t80;
import defpackage.t90;
import defpackage.tu;
import defpackage.uu;
import defpackage.wj;
import defpackage.xj;
import defpackage.y90;
import defpackage.zk;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class MainActivity extends wj {
    public static final /* synthetic */ int x = 0;
    public final av0 w = gb0.F(null);

    @Override // defpackage.wj, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.w.setValue(getIntent());
        int i = tu.a;
        h41 h41Var = h41.i;
        dg1 dg1Var = new dg1(0, 0, h41Var);
        dg1 dg1Var2 = new dg1(tu.a, tu.b, h41Var);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) h41Var.invoke(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) h41Var.invoke(resources2)).booleanValue();
        uu uuVar = new uu();
        Window window = getWindow();
        window.getClass();
        uuVar.a(dg1Var, dg1Var2, window, decorView, booleanValue, booleanValue2);
        hk hkVar = new hk(-538107750, true, new jl(3, this));
        ViewGroup.LayoutParams layoutParams = xj.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        zk zkVar = childAt instanceof zk ? (zk) childAt : null;
        if (zkVar != null) {
            zkVar.setParentCompositionContext(null);
            zkVar.setContent(hkVar);
            return;
        }
        zk zkVar2 = new zk(this);
        zkVar2.setParentCompositionContext(null);
        zkVar2.setContent(hkVar);
        View decorView2 = getWindow().getDecorView();
        if (t80.s(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (y90.r(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (t90.p(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(zkVar2, xj.a);
    }

    @Override // defpackage.wj, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        this.w.setValue(intent);
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (StringsKt.n("Y3QpwEjUs62TcwetHHmRJf")) {
            return;
        }
        AppsFlyerLib.getInstance().performOnDeepLinking(getIntent(), this);
    }
}
