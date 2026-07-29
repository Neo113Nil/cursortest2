package com.tapjoy.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.tapjoy.TJContentActivity;
import com.tapjoy.TapjoyErrorMessage;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.ad;
import com.tapjoy.internal.ir;

/* loaded from: classes2.dex */
public class hf extends hh {
    private static final String h = "hf";
    private static hf i;

    /* renamed from: a, reason: collision with root package name */
    final String f8264a;

    /* renamed from: b, reason: collision with root package name */
    final hv f8265b;
    private final ha j;
    private c k;
    private boolean l;
    private long m;
    private Context n;
    private boolean o = false;

    static /* synthetic */ hf d() {
        i = null;
        return null;
    }

    public static void a() {
        hf hfVar = i;
        if (hfVar != null) {
            hfVar.e();
        }
    }

    public hf(ha haVar, String str, hv hvVar, Context context) {
        this.j = haVar;
        this.f8264a = str;
        this.f8265b = hvVar;
        this.n = context;
    }

    @Override // com.tapjoy.internal.hh
    public final void b() {
        hv hvVar = this.f8265b;
        if (hvVar.f8330a != null) {
            hvVar.f8330a.b();
        }
        if (hvVar.f8331b != null) {
            hvVar.f8331b.b();
        }
        hvVar.f8332c.b();
        if (hvVar.e != null) {
            hvVar.e.b();
        }
        if (hvVar.f != null) {
            hvVar.f.b();
        }
        if (hvVar.m == null || hvVar.m.f8335a == null) {
            return;
        }
        hvVar.m.f8335a.b();
    }

    @Override // com.tapjoy.internal.hh
    public final boolean c() {
        hv hvVar = this.f8265b;
        if (hvVar.f8332c == null || hvVar.f8332c.f8342b == null) {
            return false;
        }
        if (hvVar.m != null && hvVar.m.f8335a != null && hvVar.m.f8335a.f8342b == null) {
            return false;
        }
        if (hvVar.f8331b == null || hvVar.f == null || hvVar.f8331b.f8342b == null || hvVar.f.f8342b == null) {
            return (hvVar.f8330a == null || hvVar.e == null || hvVar.f8330a.f8342b == null || hvVar.e.f8342b == null) ? false : true;
        }
        return true;
    }

    @Override // com.tapjoy.internal.hh
    public final void a(final hb hbVar, final fx fxVar) {
        Activity a2 = a.a(this.n);
        if (a2 != null && !a2.isFinishing()) {
            try {
                a(a2, hbVar, fxVar);
                new Object[1][0] = this.f8264a;
                return;
            } catch (WindowManager.BadTokenException unused) {
            }
        }
        Activity a3 = gs.a();
        try {
            TJContentActivity.start(ha.a().e, new TJContentActivity.AbstractContentProducer() { // from class: com.tapjoy.internal.hf.1
                @Override // com.tapjoy.TJContentActivity.ContentProducer
                public final void show(Activity activity) {
                    try {
                        hf.this.a(activity, hbVar, fxVar);
                    } catch (WindowManager.BadTokenException unused2) {
                        gx.b("Failed to show the content for \"{}\" caused by invalid activity", hf.this.f8264a);
                        hbVar.a(hf.this.f8264a, hf.this.f, null);
                    }
                }

                @Override // com.tapjoy.TJContentActivity.AbstractContentProducer, com.tapjoy.TJContentActivity.ContentProducer
                public final void dismiss(Activity activity) {
                    hf.this.e();
                }
            }, (a3 == null || (a3.getWindow().getAttributes().flags & 1024) == 0) ? false : true);
            new Object[1][0] = this.f8264a;
        } catch (ActivityNotFoundException unused2) {
            if (a3 != null && !a3.isFinishing()) {
                try {
                    a(a3, hbVar, fxVar);
                    new Object[1][0] = this.f8264a;
                    return;
                } catch (WindowManager.BadTokenException unused3) {
                    gx.b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f8264a);
                    hbVar.a(this.f8264a, this.f, null);
                }
            }
            gx.b("Failed to show the content for \"{}\" caused by no registration of TJContentActivity", this.f8264a);
            hbVar.a(this.f8264a, this.f, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(final Activity activity, final hb hbVar, fx fxVar) {
        boolean z;
        if (this.l) {
            TapjoyLog.e(h, new TapjoyErrorMessage(TapjoyErrorMessage.ErrorType.INTEGRATION_ERROR, "Content is already displayed"));
            return;
        }
        this.l = true;
        i = this;
        this.g = fxVar.f8134a;
        this.k = new c(activity);
        this.k.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tapjoy.internal.hf.2
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                hbVar.d(hf.this.f8264a);
            }
        });
        this.k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tapjoy.internal.hf.3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String obj;
                String str;
                hf.d();
                hh.a(activity, hf.this.f8265b.g);
                hf.this.j.a(hf.this.f8265b.k, SystemClock.elapsedRealtime() - hf.this.m);
                if (!hf.this.f8278d) {
                    hbVar.a(hf.this.f8264a, hf.this.f, hf.this.f8265b.h);
                }
                if (hf.this.o && hf.this.f8265b.k != null && hf.this.f8265b.k.containsKey("action_id") && (obj = hf.this.f8265b.k.get("action_id").toString()) != null && obj.length() > 0) {
                    ha haVar = hf.this.j;
                    if (haVar.f8235b != null) {
                        hj hjVar = haVar.f8235b;
                        String a2 = hj.a();
                        String a3 = hjVar.f8284b.a();
                        String a4 = hjVar.f8283a.a();
                        if (a4 == null || !a2.equals(a4)) {
                            hjVar.f8283a.a(a2);
                            str = "";
                        } else {
                            str = a3;
                        }
                        if (!(str.length() == 0)) {
                            if (str.contains(obj)) {
                                obj = str;
                            } else {
                                obj = str.concat("," + obj);
                            }
                        }
                        hjVar.f8284b.a(obj);
                    }
                }
                if (activity instanceof TJContentActivity) {
                    activity.finish();
                }
            }
        });
        this.k.setCanceledOnTouchOutside(false);
        iq iqVar = new iq(activity, this.f8265b, new ir(activity, this.f8265b, new ir.a() { // from class: com.tapjoy.internal.hf.4
            @Override // com.tapjoy.internal.ir.a
            public final void a() {
                hf.this.k.cancel();
            }

            @Override // com.tapjoy.internal.ir.a
            public final void a(ht htVar) {
                fv fvVar;
                if ((hf.this.g instanceof fv) && (fvVar = (fv) hf.this.g) != null && fvVar.f8132c != null) {
                    fvVar.f8132c.a();
                }
                hf.this.j.a(hf.this.f8265b.k, htVar.f8317b);
                hh.a(activity, htVar.f8319d);
                if (!jr.c(htVar.e)) {
                    hf.this.e.a(activity, htVar.e, jr.b(htVar.f));
                    hf.this.f8278d = true;
                }
                hbVar.a(hf.this.f8264a, htVar.g);
                if (htVar.f8318c) {
                    hf.this.k.dismiss();
                }
            }

            @Override // com.tapjoy.internal.ir.a
            public final void b() {
                hf.this.o = !hf.this.o;
            }
        }));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.addView(iqVar, new FrameLayout.LayoutParams(-2, -2, 17));
        this.k.setContentView(frameLayout);
        if (Boolean.FALSE.booleanValue()) {
            Window window = this.k.getWindow();
            if (Build.VERSION.SDK_INT == 16 && "4.1.2".equals(Build.VERSION.RELEASE)) {
                if (Boolean.FALSE.equals(a(window.getContext()))) {
                    z = false;
                    if (z) {
                        int i2 = ad.a.f7806b;
                        ae aeVar = new ae();
                        switch (ad.AnonymousClass1.f7804a[i2 - 1]) {
                            case 1:
                                ag agVar = new ag();
                                agVar.f7814a = false;
                                agVar.f7815b = 60.0f;
                                aeVar.a(agVar.a()).a(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f)).a(new ah().a(1.0f).b(0.3f).a());
                                break;
                            case 2:
                                ag agVar2 = new ag();
                                agVar2.f7814a = false;
                                agVar2.f7815b = -60.0f;
                                aeVar.a(agVar2.a()).a(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f)).a(new ah().a(-0.4f).b(0.3f).a());
                                break;
                            case 3:
                                ag agVar3 = new ag();
                                agVar3.f7814a = true;
                                agVar3.f7815b = -60.0f;
                                aeVar.a(agVar3.a()).a(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f)).a(new ah().a(0.3f).b(1.0f).a());
                                break;
                            case 4:
                                ag agVar4 = new ag();
                                agVar4.f7814a = true;
                                agVar4.f7815b = 60.0f;
                                aeVar.a(agVar4.a()).a(new ScaleAnimation(0.4f, 1.0f, 0.4f, 1.0f)).a(new ah().a(0.3f).b(-0.4f).a());
                                break;
                        }
                        iqVar.startAnimation(aeVar.b().a());
                    }
                } else {
                    window.setFlags(16777216, 16777216);
                }
            }
            z = true;
            if (z) {
            }
        }
        try {
            this.k.show();
            this.k.getWindow().setLayout(-1, -1);
            if ((activity.getWindow().getAttributes().flags & 1024) != 0) {
                this.k.getWindow().setFlags(1024, 1024);
            }
            this.m = SystemClock.elapsedRealtime();
            this.j.a(this.f8265b.k);
            fxVar.a();
            fr frVar = this.g;
            if (frVar != null) {
                frVar.b();
            }
            hbVar.c(this.f8264a);
        } catch (WindowManager.BadTokenException e) {
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.k != null) {
            this.k.dismiss();
        }
    }

    private static Boolean a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get("tapjoy:hardwareAccelerated");
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
