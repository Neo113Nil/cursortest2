package n0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import f0.C0322a;

/* renamed from: n0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1137Q {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10042a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1156r f10043b;

    /* renamed from: c, reason: collision with root package name */
    public final B0.k f10044c;

    /* renamed from: d, reason: collision with root package name */
    public final C0322a f10045d;

    /* renamed from: e, reason: collision with root package name */
    public final C1136P f10046e = new C1136P(this, true);
    public final C1136P f = new C1136P(this, false);

    /* renamed from: g, reason: collision with root package name */
    public boolean f10047g;

    public C1137Q(Context context, InterfaceC1156r interfaceC1156r, B0.k kVar, C0322a c0322a) {
        this.f10042a = context;
        this.f10043b = interfaceC1156r;
        this.f10044c = kVar;
        this.f10045d = c0322a;
    }

    public final void a(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f10047g = z;
        this.f.a(this.f10042a, intentFilter2);
        if (!this.f10047g) {
            this.f10046e.a(this.f10042a, intentFilter);
            return;
        }
        C1136P c1136p = this.f10046e;
        Context context = this.f10042a;
        synchronized (c1136p) {
            try {
                if (c1136p.f10039a) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(c1136p, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != c1136p.f10040b ? 4 : 2);
                } else {
                    context.registerReceiver(c1136p, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                c1136p.f10039a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
