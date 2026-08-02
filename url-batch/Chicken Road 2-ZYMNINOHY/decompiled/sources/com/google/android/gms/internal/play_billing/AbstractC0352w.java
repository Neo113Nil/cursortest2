package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;
import E1.C0036l;
import E1.C0037m;
import E1.C0049z;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import i2.AbstractC0457a;
import java.util.ArrayList;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0352w {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6025a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static void b(Bundle bundle, String str, String str2, long j4) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j4);
    }

    public static Bundle c(int i4, C0037m c0037m) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", c0037m.f633a);
        bundle.putString("DEBUG_MESSAGE", c0037m.f635c);
        bundle.putInt("LOG_REASON", AbstractC0005f.c(i4));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, E2.b bVar, long j4) {
        Bundle bundle = new Bundle();
        b(bundle, str, str2, j4);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        r rVar = AbstractC0346t.f6014b;
        Object[] objArr = {"subs", "inapp"};
        AbstractC0457a.F(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(AbstractC0346t.i(2, objArr)));
        Object[] objArr2 = {"inapp"};
        AbstractC0457a.F(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(AbstractC0346t.i(1, objArr2)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        if (bVar.f675a) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            C0049z c0049z = (C0049z) arrayList.get(i4);
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z4 |= !TextUtils.isEmpty(null);
            if (c0049z.f673b.equals("first_party")) {
                throw new NullPointerException("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
            }
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z4) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static C0037m e(Intent intent, String str) {
        if (intent != null) {
            C0036l a3 = C0037m.a();
            a3.f630a = a(intent.getExtras(), str);
            a3.f632c = f(intent.getExtras(), str);
            return a3.a();
        }
        h("BillingHelper", "Got null intent!");
        C0036l a4 = C0037m.a();
        a4.f630a = 6;
        a4.f632c = "An internal error occurred.";
        return a4.a();
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i4 = 40000;
            while (!str2.isEmpty() && i4 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i4));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i4 -= min;
            }
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str == null || str2 == null) {
            g("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e4) {
            h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e4.toString()));
            return null;
        }
    }
}
