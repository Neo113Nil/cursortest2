package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class l0 extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;

    class a extends s2 {
        final /* synthetic */ List e;
        final /* synthetic */ List f;
        final /* synthetic */ List g;
        final /* synthetic */ List h;
        final /* synthetic */ List i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.e = list;
            this.f = list2;
            this.g = list3;
            this.h = list4;
            this.i = list5;
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i) {
            List list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.e;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f;
            } else {
                z = false;
                list = i == c.LISTED_TC_NETWORKS.ordinal() ? this.g : i == c.LISTED_AC_NETWORKS.ordinal() ? this.h : this.i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(l0.this.a((a7) it.next(), z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        protected int d(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? this.e.size() : i == c.MISSING_AC_NETWORKS.ordinal() ? this.f.size() : i == c.LISTED_TC_NETWORKS.ordinal() ? this.g.size() : i == c.LISTED_AC_NETWORKS.ordinal() ? this.h.size() : this.i.size();
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i) {
            return i == c.MISSING_TC_NETWORKS.ordinal() ? new v4("MISSING TCF VENDORS (TC STRING)") : i == c.MISSING_AC_NETWORKS.ordinal() ? new v4("MISSING ATP NETWORKS (AC STRING)") : i == c.LISTED_TC_NETWORKS.ordinal() ? new v4("LISTED TCF VENDORS (TC STRING)") : i == c.LISTED_AC_NETWORKS.ordinal() ? new v4("LISTED ATP NETWORKS (AC STRING)") : new v4("NON-CONFIGURABLE NETWORKS");
        }
    }

    class b implements s2.a {
        b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            n7.a(r2Var.c(), r2Var.b(), l0.this);
        }
    }

    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
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

    public void initialize(List<a7> list, List<a7> list2, List<a7> list3, List<a7> list4, List<a7> list5, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new b());
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(a7 a7Var, boolean z) {
        r2.b a2 = r2.a();
        boolean b2 = this.a.r0().b();
        a7.a f = a7Var.f();
        a7.a aVar = a7.a.TCF_VENDOR;
        if (f == aVar || (a7Var.f() == a7.a.ATP_NETWORK && b2)) {
            String c2 = a7Var.c();
            String str = a7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            a2.d(c2).d(z ? -65536 : -16777216).b(c2).a(str + a7Var.d()).a(true);
        } else {
            a2.d(a7Var.b());
        }
        return a2.a();
    }
}
