package E1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.play_billing.AbstractBinderC0310e;
import com.google.android.gms.internal.play_billing.AbstractC0313f;
import com.google.android.gms.internal.play_billing.AbstractC0352w;
import com.google.android.gms.internal.play_billing.l1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class L extends AbstractBinderC0310e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f505b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final V f506c;

    /* renamed from: d, reason: collision with root package name */
    public final int f507d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f508e;

    public L(io.flutter.plugins.inapppurchase.f fVar, l2.e eVar, int i4) {
        super("com.android.vending.billing.IInAppBillingCreateAlternativeBillingOnlyTokenCallback", 0);
        this.f508e = fVar;
        this.f506c = eVar;
        this.f507d = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractBinderC0310e
    public final boolean e(int i4, Parcel parcel, Parcel parcel2) {
        switch (this.f505b) {
            case 0:
                if (i4 == 1) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) AbstractC0313f.a(parcel);
                    AbstractC0313f.b(parcel);
                    io.flutter.plugins.inapppurchase.f fVar = (io.flutter.plugins.inapppurchase.f) this.f508e;
                    int i5 = this.f507d;
                    l1 l1Var = l1.BROADCAST_ACTION_UNSPECIFIED;
                    V v = this.f506c;
                    if (bundle == null) {
                        C0037m c0037m = W.f540h;
                        ((l2.e) v).w(U.b(71, 15, c0037m, null, l1Var), i5);
                        fVar.d(c0037m, null);
                        break;
                    } else {
                        int a3 = AbstractC0352w.a(bundle, "BillingClient");
                        C0037m a4 = W.a(a3, AbstractC0352w.f(bundle, "BillingClient"));
                        if (a3 != 0) {
                            AbstractC0352w.h("BillingClient", "createAlternativeBillingOnlyReportingDetailsAsync() failed. Response code: " + a3);
                            ((l2.e) v).w(U.b(23, 15, a4, null, l1Var), i5);
                            fVar.d(a4, null);
                            break;
                        } else {
                            try {
                                fVar.d(a4, new C0026b(bundle.getString("CREATE_ALTERNATIVE_BILLING_ONLY_REPORTING_DETAILS")));
                                break;
                            } catch (JSONException e4) {
                                AbstractC0352w.i("BillingClient", "Error when parsing invalid alternative billing only reporting details. \n Exception: ", e4);
                                C0037m c0037m2 = W.f540h;
                                ((l2.e) v).w(U.b(72, 15, c0037m2, null, l1Var), i5);
                                fVar.d(c0037m2, null);
                                return true;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (i4 == 1) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) AbstractC0313f.a(parcel);
                    AbstractC0313f.b(parcel);
                    io.flutter.plugins.inapppurchase.f fVar2 = (io.flutter.plugins.inapppurchase.f) this.f508e;
                    int i6 = this.f507d;
                    l1 l1Var2 = l1.BROADCAST_ACTION_UNSPECIFIED;
                    V v4 = this.f506c;
                    if (bundle2 == null) {
                        C0037m c0037m3 = W.f540h;
                        ((l2.e) v4).w(U.b(63, 13, c0037m3, null, l1Var2), i6);
                        fVar2.e(c0037m3, null);
                    } else {
                        int a5 = AbstractC0352w.a(bundle2, "BillingClient");
                        String f4 = AbstractC0352w.f(bundle2, "BillingClient");
                        C0036l a6 = C0037m.a();
                        a6.f630a = a5;
                        a6.f632c = f4;
                        if (a5 != 0) {
                            AbstractC0352w.h("BillingClient", "getBillingConfig() failed. Response code: " + a5);
                            C0037m a7 = a6.a();
                            ((l2.e) v4).w(U.b(23, 13, a7, null, l1Var2), i6);
                            fVar2.e(a7, null);
                        } else if (bundle2.containsKey("BILLING_CONFIG")) {
                            try {
                                fVar2.e(a6.a(), new C0031g(bundle2.getString("BILLING_CONFIG")));
                            } catch (JSONException e5) {
                                AbstractC0352w.i("BillingClient", "Got a JSON exception trying to decode BillingConfig. \n Exception: ", e5);
                                C0037m c0037m4 = W.f540h;
                                ((l2.e) v4).w(U.b(65, 13, c0037m4, null, l1Var2), i6);
                                fVar2.e(c0037m4, null);
                            }
                        } else {
                            AbstractC0352w.h("BillingClient", "getBillingConfig() returned a bundle with neither an error nor a billing config response");
                            a6.f630a = 6;
                            C0037m a8 = a6.a();
                            ((l2.e) v4).w(U.b(64, 13, a8, null, l1Var2), i6);
                            fVar2.e(a8, null);
                        }
                    }
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i4 == 1) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle bundle3 = (Bundle) AbstractC0313f.a(parcel);
                    AbstractC0313f.b(parcel);
                    io.flutter.plugins.inapppurchase.f fVar3 = (io.flutter.plugins.inapppurchase.f) this.f508e;
                    int i7 = this.f507d;
                    l1 l1Var3 = l1.BROADCAST_ACTION_UNSPECIFIED;
                    V v5 = this.f506c;
                    if (bundle3 != null) {
                        int a9 = AbstractC0352w.a(bundle3, "BillingClient");
                        C0037m a10 = W.a(a9, AbstractC0352w.f(bundle3, "BillingClient"));
                        if (a9 != 0) {
                            AbstractC0352w.h("BillingClient", "isAlternativeBillingOnlyAvailableAsync() failed. Response code: " + a9);
                            ((l2.e) v5).w(U.b(23, 14, a10, null, l1Var3), i7);
                        }
                        fVar3.b(a10);
                        break;
                    } else {
                        C0037m c0037m5 = W.f540h;
                        ((l2.e) v5).w(U.b(67, 14, c0037m5, null, l1Var3), i7);
                        fVar3.b(c0037m5);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public L(io.flutter.plugins.inapppurchase.f fVar, l2.e eVar, int i4, byte b4) {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback", 0);
        this.f508e = fVar;
        this.f506c = eVar;
        this.f507d = i4;
    }

    public L(io.flutter.plugins.inapppurchase.f fVar, l2.e eVar, int i4, char c4) {
        super("com.android.vending.billing.IInAppBillingIsAlternativeBillingOnlyAvailableCallback", 0);
        this.f508e = fVar;
        this.f506c = eVar;
        this.f507d = i4;
    }
}
