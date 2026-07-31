package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class w6 extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;

    class a extends s2 {
        final /* synthetic */ ArrayList e;
        final /* synthetic */ ArrayList f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.e = arrayList;
            this.f = arrayList2;
            this.g = z;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e : this.f;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i) {
            return i == b.TC_NETWORKS.ordinal() ? this.e.size() : this.f.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return new v4("TCF VENDORS (TC STRING)");
            }
            return new v4(this.g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.n3
    protected com.applovin.impl.sdk.k getSdk() {
        return this.a;
    }

    public void initialize(List<a7> list, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = p0.b().a(this);
        boolean b2 = kVar.r0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        for (a7 a7Var : list) {
            Boolean a3 = a7Var.a();
            if (a3 != null) {
                if (a7Var.f() == a7.a.TCF_VENDOR) {
                    arrayList.add(a(a7Var.b(), String.valueOf(a3)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK) {
                    arrayList2.add(a(a7Var.b(), String.valueOf(a3)));
                }
            } else if (b2 && a7Var.f() == a7.a.ATP_NETWORK) {
                arrayList2.add(a(a7Var.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}
