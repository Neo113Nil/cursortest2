package n0;

import U1.C0084e;
import U1.C0087h;
import a0.C0130a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.AbstractC0217e;
import com.google.android.gms.internal.play_billing.AbstractC0248o0;
import f0.C0322a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: n0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1121A extends X0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f9985c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final C0322a f9986d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9987e;
    public final Object f;

    public BinderC1121A(B0.g gVar, C0322a c0322a, int i3) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 2);
        this.f = gVar;
        this.f9986d = c0322a;
        this.f9987e = i3;
    }

    @Override // X0.a
    public final boolean e(int i3, Parcel parcel, Parcel parcel2) {
        switch (this.f9985c) {
            case 0:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) AbstractC0217e.a(parcel);
                AbstractC0217e.b(parcel);
                int i4 = this.f9987e;
                C0322a c0322a = this.f9986d;
                B0.g gVar = (B0.g) this.f;
                if (bundle == null) {
                    C1147i c1147i = AbstractC1135O.f10024i;
                    c0322a.w(AbstractC1133M.b(71, 15, c1147i), i4);
                    gVar.c(c1147i);
                    return true;
                }
                int a3 = AbstractC0248o0.a(bundle, "BillingClient");
                C1147i a4 = AbstractC1135O.a(a3, AbstractC0248o0.e(bundle, "BillingClient"));
                if (a3 != 0) {
                    AbstractC0248o0.g("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + a3);
                    c0322a.w(AbstractC1133M.b(23, 15, a4), i4);
                    gVar.c(a4);
                    return true;
                }
                try {
                    String optString = new JSONObject(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")).optString("externalTransactionToken");
                    gVar.getClass();
                    U1.n j3 = S0.a.j(a4);
                    C0087h c0087h = new C0087h();
                    c0087h.f1508a = j3;
                    if (optString == null) {
                        throw new IllegalStateException("Nonnull field \"externalTransactionToken\" is null.");
                    }
                    c0087h.f1509b = optString;
                    ((C0084e) gVar.f131b).a(c0087h);
                    return true;
                } catch (JSONException e3) {
                    AbstractC0248o0.h("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e3);
                    C1147i c1147i2 = AbstractC1135O.f10024i;
                    c0322a.w(AbstractC1133M.b(72, 15, c1147i2), i4);
                    gVar.c(c1147i2);
                    return true;
                }
            case 1:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) AbstractC0217e.a(parcel);
                AbstractC0217e.b(parcel);
                int i5 = this.f9987e;
                C0322a c0322a2 = this.f9986d;
                B0.g gVar2 = (B0.g) this.f;
                if (bundle2 == null) {
                    C1147i c1147i3 = AbstractC1135O.f10024i;
                    c0322a2.w(AbstractC1133M.b(63, 13, c1147i3), i5);
                    gVar2.d(c1147i3);
                } else {
                    int a5 = AbstractC0248o0.a(bundle2, "BillingClient");
                    String e4 = AbstractC0248o0.e(bundle2, "BillingClient");
                    C0130a a6 = C1147i.a();
                    a6.f1920b = a5;
                    a6.f1919a = e4;
                    if (a5 != 0) {
                        AbstractC0248o0.g("BillingClient", "getBillingConfig() failed. Response code: " + a5);
                        C1147i a7 = a6.a();
                        c0322a2.w(AbstractC1133M.b(23, 13, a7), i5);
                        gVar2.d(a7);
                    } else if (bundle2.containsKey("BILLING_CONFIG")) {
                        try {
                            String optString2 = new JSONObject(bundle2.getString("BILLING_CONFIG")).optString("countryCode");
                            C1147i a8 = a6.a();
                            gVar2.getClass();
                            U1.n j4 = S0.a.j(a8);
                            U1.k kVar = new U1.k();
                            kVar.f1514a = j4;
                            if (optString2 == null) {
                                throw new IllegalStateException("Nonnull field \"countryCode\" is null.");
                            }
                            kVar.f1515b = optString2;
                            ((C0084e) gVar2.f131b).a(kVar);
                        } catch (JSONException e5) {
                            AbstractC0248o0.h("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e5);
                            C1147i c1147i4 = AbstractC1135O.f10024i;
                            c0322a2.w(AbstractC1133M.b(65, 13, c1147i4), i5);
                            gVar2.d(c1147i4);
                        }
                    } else {
                        AbstractC0248o0.g("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                        a6.f1920b = 6;
                        C1147i a9 = a6.a();
                        c0322a2.w(AbstractC1133M.b(64, 13, a9), i5);
                        gVar2.d(a9);
                    }
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i3 != 1) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) AbstractC0217e.a(parcel);
                AbstractC0217e.b(parcel);
                B0.g gVar3 = (B0.g) this.f;
                int i6 = this.f9987e;
                C0322a c0322a3 = this.f9986d;
                if (bundle3 == null) {
                    C1147i c1147i5 = AbstractC1135O.f10024i;
                    c0322a3.w(AbstractC1133M.b(67, 14, c1147i5), i6);
                    gVar3.getClass();
                    ((C0084e) gVar3.f131b).a(S0.a.j(c1147i5));
                    return true;
                }
                int a10 = AbstractC0248o0.a(bundle3, "BillingClient");
                C1147i a11 = AbstractC1135O.a(a10, AbstractC0248o0.e(bundle3, "BillingClient"));
                if (a10 != 0) {
                    AbstractC0248o0.g("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + a10);
                    c0322a3.w(AbstractC1133M.b(23, 14, a11), i6);
                }
                gVar3.getClass();
                ((C0084e) gVar3.f131b).a(S0.a.j(a11));
                return true;
        }
    }

    public BinderC1121A(B0.g gVar, C0322a c0322a, int i3, byte b3) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 2);
        this.f = gVar;
        this.f9986d = c0322a;
        this.f9987e = i3;
    }

    public BinderC1121A(B0.g gVar, C0322a c0322a, int i3, char c3) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 2);
        this.f = gVar;
        this.f9986d = c0322a;
        this.f9987e = i3;
    }
}
