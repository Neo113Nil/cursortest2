package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.a7;
import com.applovin.impl.d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class y6 extends n3 {
    private com.applovin.impl.sdk.k a;
    private s2 b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();

    class a extends s2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        protected int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.s2
        protected List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? y6.this.c() : y6.this.a();
        }

        @Override // com.applovin.impl.s2
        protected int d(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.s2
        protected r2 e(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? new v4("IAB TCF Parameters") : new v4("CMP CONFIGURATION");
        }
    }

    class b implements s2.a {
        final /* synthetic */ z6 a;
        final /* synthetic */ com.applovin.impl.sdk.k b;

        class a implements d.b {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.y6$b$b, reason: collision with other inner class name */
        class C0089b implements d.b {
            C0089b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(y6.this.e, y6.this.f, y6.this.c, y6.this.d, y6.this.g, b.this.b);
            }
        }

        b(z6 z6Var, com.applovin.impl.sdk.k kVar) {
            this.a = z6Var;
            this.b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            String a2;
            String c;
            if (j2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (j2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    com.applovin.impl.d.a(y6.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0089b());
                    return;
                } else {
                    n7.a(r2Var.c(), r2Var.b(), y6.this);
                    return;
                }
            }
            if (j2Var.a() == d.TC_STRING.ordinal()) {
                a2 = z4.x.a();
                c = this.a.j();
            } else {
                a2 = z4.y.a();
                c = this.a.c();
            }
            com.applovin.impl.d.a(y6.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(a2, c));
        }
    }

    private enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    private enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
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
        z6 r0 = kVar.r0();
        a(list);
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(r0, kVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.b;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    private void a(List list) {
        boolean b2 = this.a.r0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a7 a7Var = (a7) it.next();
            if (a7Var.f() == a7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(a7Var.a())) {
                    a(a7Var, this.c);
                } else {
                    a(a7Var, this.e);
                }
            } else if (a7Var.f() != a7.a.ATP_NETWORK) {
                this.g.add(a7Var);
            } else if (!b2) {
                this.g.add(a7Var);
            } else if (Boolean.TRUE.equals(a7Var.a())) {
                a(a7Var, this.d);
            } else {
                a(a7Var, this.f);
            }
        }
    }

    private r2 b() {
        r2.b a2;
        String a3 = z4.u.a();
        Integer e2 = this.a.r0().e();
        if (StringUtils.isValidString(this.a.r0().d())) {
            a2 = r2.a(r2.c.RIGHT_DETAIL);
        } else {
            r2.b b2 = r2.a(r2.c.DETAIL).b("Unknown CMP SDK ID");
            a2 = b2.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a3 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(m0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a2.d(a3);
        a2.c(e2 != null ? e2.toString() : "No value set");
        a2.c(e2 != null ? -16777216 : -65536);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g = this.a.r0().g();
        String j = this.a.r0().j();
        String c2 = this.a.r0().c();
        arrayList.add(a(z4.w.a(), g));
        arrayList.add(a(z4.x.a(), j, !c7.b(j)));
        arrayList.add(a(z4.y.a(), c2, false));
        return arrayList;
    }

    private void a(a7 a7Var, List list) {
        if (a7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (a7Var.d().equals(((a7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(a7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.e.size() + this.f.size();
        arrayList.add(b());
        arrayList.add(a(z4.v.a(), this.a.r0().f()));
        arrayList.add(r2.a(r2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        r2.b d2 = r2.a(r2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(d2.c(str).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private r2 a(String str, Integer num) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private r2 a(String str, String str2, boolean z) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        r2.b d2 = r2.a(r2.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        r2.b a2 = d2.c(str2).c(z ? -65536 : -16777216).a(isValidString);
        if (isValidString) {
            a2.a(this);
        }
        return a2.a();
    }
}
