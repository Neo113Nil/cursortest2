package E1;

import android.content.Context;
import com.google.android.gms.internal.play_billing.AbstractC0352w;

/* renamed from: E1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0027c {

    /* renamed from: a, reason: collision with root package name */
    public volatile C0038n f578a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f579b;

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC0047x f580c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C f581d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f582e;

    public /* synthetic */ C0027c(Context context) {
        this.f579b = context;
    }

    public static C0027c b() {
        throw null;
    }

    public final C0029e a() {
        Context context = this.f579b;
        if (context == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        if (this.f580c == null) {
            if (this.f581d != null) {
                throw new IllegalArgumentException("Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing.");
            }
            if (this.f582e) {
                return c() ? new T(context, this) : new C0029e(context, this);
            }
            throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
        }
        if (this.f578a == null) {
            throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
        }
        this.f578a.getClass();
        if (this.f580c == null) {
            C0038n c0038n = this.f578a;
            return c() ? new T(c0038n, context, this) : new C0029e(c0038n, context, this);
        }
        if (this.f581d == null) {
            C0038n c0038n2 = this.f578a;
            InterfaceC0047x interfaceC0047x = this.f580c;
            return c() ? new T(c0038n2, context, interfaceC0047x, this) : new C0029e(c0038n2, context, interfaceC0047x, this);
        }
        C0038n c0038n3 = this.f578a;
        InterfaceC0047x interfaceC0047x2 = this.f580c;
        C c4 = this.f581d;
        return c() ? new T(c0038n3, context, interfaceC0047x2, c4, this) : new C0029e(c0038n3, context, interfaceC0047x2, c4, this);
    }

    public final boolean c() {
        try {
            Context context = this.f579b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e4) {
            AbstractC0352w.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e4);
            return false;
        }
    }
}
