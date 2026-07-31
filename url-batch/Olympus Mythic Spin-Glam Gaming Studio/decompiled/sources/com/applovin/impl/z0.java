package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v0;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public class z0 {
    private final com.applovin.impl.sdk.k a;
    private final int b;
    private List d;
    private String e;
    private v0 f;
    private u0.c g;
    private v0 h;
    private Dialog i;
    private long j;
    private long k;
    private long l;
    private final t0 c = new t0();
    private u0.b m = new u0.b();
    private final com.applovin.impl.b n = new a();

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.h == null) {
                return;
            }
            if (z0.this.i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.i))) {
                    z0.this.i.dismiss();
                }
                z0.this.i = null;
            }
            v0 v0Var = z0.this.h;
            z0.this.h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f, v0Var, activity);
        }
    }

    class b implements DialogInterface.OnClickListener {
        final /* synthetic */ boolean a;
        final /* synthetic */ x0 b;
        final /* synthetic */ v0 c;
        final /* synthetic */ Activity d;

        b(boolean z, x0 x0Var, v0 v0Var, Activity activity) {
            this.a = z;
            this.b = x0Var;
            this.c = v0Var;
            this.d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            z0.this.h = null;
            z0.this.i = null;
            HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.a), hashMap);
            z0.this.a.v0().d(d2.p, hashMap);
            v0 a = z0.this.a(this.b.a());
            if (a == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.c, a, this.d);
            if (a.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {
        final /* synthetic */ Uri a;
        final /* synthetic */ Activity b;

        c(Uri uri, Activity activity) {
            this.a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.a, this.b, z0.this.a);
        }
    }

    class d extends ClickableSpan {
        final /* synthetic */ Uri a;
        final /* synthetic */ Activity b;

        d(Uri uri, Activity activity) {
            this.a = uri;
            this.b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.a, this.b, z0.this.a);
        }
    }

    class e implements CmpServiceImpl.e {
        final /* synthetic */ long a;
        final /* synthetic */ v0 b;
        final /* synthetic */ Activity c;

        e(long j, v0 v0Var, Activity activity) {
            this.a = j;
            this.b = v0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.a);
            z0.this.a(this.b, this.c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {
        final /* synthetic */ long a;
        final /* synthetic */ v0 b;
        final /* synthetic */ Activity c;

        f(long j, v0 v0Var, Activity activity) {
            this.a = j;
            this.b = v0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.a);
            z0.this.a(this.b, this.c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class g implements CmpServiceImpl.f {
        final /* synthetic */ long a;
        final /* synthetic */ v0 b;
        final /* synthetic */ Activity c;

        g(long j, v0 v0Var, Activity activity) {
            this.a = j;
            this.b = v0Var;
            this.c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.a));
            if (appLovinCmpError != null) {
                z0.this.m.a(appLovinCmpError);
                hashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.a.v0().d(d2.u, hashMap);
            } else {
                z0.this.m.c();
                z0.this.a.v0().d(d2.v, hashMap);
            }
            z0.this.b(this.b, this.c);
        }
    }

    class h implements Runnable {
        final /* synthetic */ v0 a;

        h(v0 v0Var) {
            this.a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f, this.a, z0.this.a.u0());
        }
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = ((Integer) kVar.a(x4.a7)).intValue();
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.z0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                z0.this.a(v0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.j));
        CollectionUtils.putStringIfValid("details", this.c.toString(), hashMap);
        this.a.v0().d(d2.w, hashMap);
        this.d = null;
        this.f = null;
        this.j = 0L;
        this.k = 0L;
        this.l = 0L;
        this.c.a();
        this.a.e().b(this.n);
        u0.c cVar = this.g;
        if (cVar != null) {
            cVar.a(this.m);
            this.g = null;
        }
        this.m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i, Activity activity, u0.c cVar) {
        if (this.d != null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.d);
            }
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.d);
            }
            cVar.a(new u0.b(new s0(s0.d, "Consent flow is already in progress.")));
            return;
        }
        List a2 = a1.a(this.a);
        this.d = a2;
        this.e = String.valueOf(a2);
        this.g = cVar;
        v0 a3 = a(i);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.d + "\nInitial state: " + a3);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.n);
        this.a.v0().a(d2.n);
        this.j = SystemClock.elapsedRealtime();
        a((v0) null, a3, activity);
    }

    public boolean a() {
        return this.d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z;
        SpannableString spannableString;
        boolean z2;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long elapsedRealtime = this.f != null ? SystemClock.elapsedRealtime() - this.k : 0L;
        this.k = SystemClock.elapsedRealtime();
        this.c.a(v0Var, elapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri h2 = this.a.x().h();
            final boolean z3 = h2 != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z3, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String h3 = w0Var.h();
            if (StringUtils.isValidString(h3)) {
                spannableString = new SpannableString(h3);
                String a2 = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String a3 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(h3, Arrays.asList(a2, a3))) {
                    if (z3) {
                        z2 = true;
                        StringUtils.addLinks(spannableString, Pattern.compile(a2), new c(h2, activity), true);
                    } else {
                        z2 = true;
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(a3), new d(this.a.x().f(), activity), z2);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog create = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.z0$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    z0.this.a(create, activity, z3, dialogInterface);
                }
            });
            this.i = create;
            create.show();
            this.m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.a.x().k() && this.a.x().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.a.v0().a(d2.q);
                    this.a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                    return;
                }
            }
            a(v0Var, activity, Boolean.FALSE);
            return;
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String g2 = y0Var.g();
            Map<String, ?> f2 = y0Var.f();
            if (f2 == null) {
                f2 = new HashMap<>(1);
            }
            f2.put("flow_type", "unified");
            this.a.F().trackEvent(g2, f2);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.a.x().m()) {
                this.a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.a.v0().a(d2.q);
                this.a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.a.x().m()) {
                this.a.F().trackEvent("cf_start");
            }
            this.a.v0().a(d2.t);
            this.a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a a4 = v0Var.a();
            if (a4 == v0.a.IS_AL_GDPR) {
                boolean k = this.a.x().k();
                this.c.a(v0Var, k, elapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(k));
                return;
            } else if (a4 == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z = !this.a.z0() || ((Boolean) this.a.a(z4.t, Boolean.FALSE)).booleanValue();
                this.c.a(v0Var, z, elapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z));
                return;
            } else {
                if (a4 != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + a4);
                    return;
                }
                z = this.a.x().h() != null;
                this.c.a(v0Var, z, elapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z));
                return;
            }
        }
        if (v0Var.d() == v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.l = SystemClock.elapsedRealtime();
        this.a.v0().d(d2.o, CollectionUtils.hashMap("details", String.valueOf(z)));
    }

    private void a(v0 v0Var) {
        this.c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.e + "\nLast successful state: " + this.f));
        this.c.b(str);
        u0.b bVar = this.m;
        if (bVar != null) {
            bVar.a(new s0(s0.e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i) {
        List<v0> list = this.d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j));
        if (appLovinCmpError == null) {
            this.a.v0().d(d2.r, hashMap);
        } else {
            hashMap.putAll(a(appLovinCmpError));
            this.a.v0().d(d2.s, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> hashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), hashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), hashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), hashMap);
        return hashMap;
    }
}
