package O0;

import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* renamed from: O0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0425z {
    public static String a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(r0.a(str, str2))) {
            return r0.a(str, str2);
        }
        j0.b("hmsSdk", "getAndroidId(): to getConfigByType()");
        return c(context, str, str2);
    }

    public static String b(Context context, String str, String str2) {
        if (str2.equals("oper")) {
            return d(context, str, str2);
        }
        if (str2.equals("maint")) {
            return d(context, str, str2);
        }
        if (str2.equals("diffprivacy")) {
            return d(context, str, str2);
        }
        if (str2.equals("preins")) {
            return d(context, str, str2);
        }
        j0.m("hmsSdk", "getChannel(): Invalid type: " + str2);
        return "";
    }

    private static String c(Context context, String str, String str2) {
        if (!r0.b(str, str2)) {
            return "";
        }
        if (TextUtils.isEmpty(Y.g())) {
            d0.e().d().e(S.d(context));
        }
        return Y.g();
    }

    private static String d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(AbstractC0403c.e(str, str2))) {
            return AbstractC0403c.e(str, str2);
        }
        C0420u d4 = d0.e().d();
        if (TextUtils.isEmpty(d4.p())) {
            String h4 = S.h(context);
            if (!AbstractC0415o.c(AppsFlyerProperties.CHANNEL, h4, UserVerificationMethods.USER_VERIFY_HANDPRINT)) {
                h4 = "";
            }
            d4.m(h4);
        }
        return d4.p();
    }
}
