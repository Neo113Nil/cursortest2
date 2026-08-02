package n0;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import i1.C0342b;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1141c {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0342b f10055a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10056b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC1156r f10057c;

    /* renamed from: d, reason: collision with root package name */
    public volatile B0.k f10058d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10059e;

    public /* synthetic */ C1141c(Context context) {
        this.f10056b = context;
    }

    public final C1143e a() {
        if (this.f10056b == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.f10057c == null) {
            if (this.f10058d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (!this.f10059e) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            Context context = this.f10056b;
            return b() ? new C1130J(context) : new C1143e(context);
        }
        if (this.f10055a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        this.f10055a.getClass();
        if (this.f10057c == null) {
            C0342b c0342b = this.f10055a;
            Context context2 = this.f10056b;
            return b() ? new C1130J(c0342b, context2) : new C1143e(c0342b, context2);
        }
        if (this.f10058d == null) {
            C0342b c0342b2 = this.f10055a;
            Context context3 = this.f10056b;
            InterfaceC1156r interfaceC1156r = this.f10057c;
            return b() ? new C1130J(c0342b2, context3, interfaceC1156r) : new C1143e(c0342b2, context3, interfaceC1156r);
        }
        C0342b c0342b3 = this.f10055a;
        Context context4 = this.f10056b;
        InterfaceC1156r interfaceC1156r2 = this.f10057c;
        B0.k kVar = this.f10058d;
        return b() ? new C1130J(c0342b3, context4, interfaceC1156r2, kVar) : new C1143e(c0342b3, context4, interfaceC1156r2, kVar);
    }

    public final boolean b() {
        Context context = this.f10056b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e3) {
            AbstractC0248o0.h("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e3);
            return false;
        }
    }
}
