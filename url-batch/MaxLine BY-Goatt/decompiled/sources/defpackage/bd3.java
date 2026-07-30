package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.Utility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.majelw.libystne.R;
import defpackage.aa2;
import j$.time.LocalDate;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class bd3 {
    public static ClassLoader a;
    public static Thread b;
    public static final nj c = new nj(2);
    public static final Object d = new Object();
    public static final u30 e = new u30(11);
    public static final StackTraceElement[] f = new StackTraceElement[0];
    public static final long[] g = new long[0];
    public static final String[] h = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", Constants.MessagePayloadKeys.MSGID_SERVER, "message_name", "message_time", "message_tracking_id", Constants.MessagePayloadKeys.MESSAGE_TYPE, "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", SDKAnalyticsEvents.PARAMETER_SESSION_ID};
    public static final String[] i = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", Constants.ScionAnalytics.PARAM_MESSAGE_DEVICE_TIME, "_nmid", Constants.ScionAnalytics.PARAM_MESSAGE_NAME, Constants.ScionAnalytics.PARAM_MESSAGE_TIME, "_nmtid", Constants.ScionAnalytics.PARAM_MESSAGE_TYPE, "_pv", "_po", Constants.ScionAnalytics.PARAM_TOPIC, "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] j = {FirebaseAnalytics.Param.ITEMS};
    public static final String[] k = {FirebaseAnalytics.Param.AFFILIATION, FirebaseAnalytics.Param.COUPON, FirebaseAnalytics.Param.CREATIVE_NAME, FirebaseAnalytics.Param.CREATIVE_SLOT, FirebaseAnalytics.Param.CURRENCY, "_ct", FirebaseAnalytics.Param.DISCOUNT, FirebaseAnalytics.Param.INDEX, FirebaseAnalytics.Param.ITEM_ID, FirebaseAnalytics.Param.ITEM_BRAND, FirebaseAnalytics.Param.ITEM_CATEGORY, FirebaseAnalytics.Param.ITEM_CATEGORY2, FirebaseAnalytics.Param.ITEM_CATEGORY3, FirebaseAnalytics.Param.ITEM_CATEGORY4, FirebaseAnalytics.Param.ITEM_CATEGORY5, FirebaseAnalytics.Param.ITEM_LIST_NAME, FirebaseAnalytics.Param.ITEM_LIST_ID, FirebaseAnalytics.Param.ITEM_NAME, FirebaseAnalytics.Param.ITEM_VARIANT, FirebaseAnalytics.Param.LOCATION_ID, FirebaseAnalytics.Param.PAYMENT_TYPE, FirebaseAnalytics.Param.PRICE, FirebaseAnalytics.Param.PROMOTION_ID, FirebaseAnalytics.Param.PROMOTION_NAME, FirebaseAnalytics.Param.QUANTITY, FirebaseAnalytics.Param.SHIPPING, FirebaseAnalytics.Param.SHIPPING_TIER, FirebaseAnalytics.Param.TAX, FirebaseAnalytics.Param.TRANSACTION_ID, "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static x01 l;
    public static x01 m;

    /* JADX WARN: Can't wrap try/catch for region: R(23:6|(2:8|(21:10|(19:44|(2:46|(1:48))(1:49)|13|14|15|16|(1:18)|19|(1:21)(1:40)|22|(1:39)(1:26)|27|(1:29)(1:38)|30|(1:32)|33|(1:35)|36|37)|12|13|14|15|16|(0)|19|(0)(0)|22|(1:24)|39|27|(0)(0)|30|(0)|33|(0)|36|37))|50|(0)|12|13|14|15|16|(0)|19|(0)(0)|22|(0)|39|27|(0)(0)|30|(0)|33|(0)|36|37) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        r8 = defpackage.aa2.m;
        r0 = new defpackage.ba2(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143 A[LOOP:1: B:34:0x0141->B:35:0x0143, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList A(Context context) {
        Double d2;
        Double d3;
        Object ba2Var;
        JSONArray optJSONArray;
        int length;
        int i2;
        context.getClass();
        InputStream open = context.getAssets().open("atlas_seed.json");
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, yt.b), Utility.DEFAULT_STREAM_BUFFER_SIZE);
        try {
            String r = yh2.r(bufferedReader);
            bufferedReader.close();
            JSONArray jSONArray = new JSONArray(r);
            int length2 = jSONArray.length();
            ArrayList arrayList = new ArrayList(length2);
            for (int i3 = 0; i3 < length2; i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                jSONObject.getClass();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("mohs");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(0);
                    Double valueOf = Double.valueOf(optDouble);
                    if (!Double.isNaN(optDouble)) {
                        d2 = valueOf;
                        if (optJSONArray2 != null) {
                            if (optJSONArray2.length() > 1) {
                                double optDouble2 = optJSONArray2.optDouble(1);
                                Double valueOf2 = Double.valueOf(optDouble2);
                                if (!Double.isNaN(optDouble2)) {
                                    d3 = valueOf2;
                                }
                            } else {
                                d3 = d2;
                            }
                            String string = jSONObject.getString("slug");
                            string.getClass();
                            aa2.a aVar = aa2.m;
                            String string2 = jSONObject.getString("kind");
                            string2.getClass();
                            ba2Var = jk.valueOf(string2);
                            Object obj = jk.m;
                            if (ba2Var instanceof ba2) {
                                ba2Var = obj;
                            }
                            jk jkVar = (jk) ba2Var;
                            String B = B(jSONObject, "name", "ru");
                            String B2 = B(jSONObject, "name", "en");
                            String optString = jSONObject.optString("formula");
                            String str = up2.y(optString) ? null : optString;
                            String B3 = B(jSONObject, "color", "ru");
                            String B4 = B(jSONObject, "color", "en");
                            String B5 = B(jSONObject, "lustre", "ru");
                            String B6 = B(jSONObject, "lustre", "en");
                            String B7 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "ru");
                            String B8 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "en");
                            String B9 = B(jSONObject, "symbolism", "ru");
                            String B10 = B(jSONObject, "symbolism", "en");
                            String B11 = B(jSONObject, "care", "ru");
                            String B12 = B(jSONObject, "care", "en");
                            List C = C(jSONObject, "ru");
                            List C2 = C(jSONObject, "en");
                            Integer valueOf3 = (jSONObject.has("birthMonth") || jSONObject.isNull("birthMonth")) ? null : Integer.valueOf(jSONObject.optInt("birthMonth"));
                            String optString2 = jSONObject.optString("zodiac");
                            String str2 = up2.y(optString2) ? null : optString2;
                            optJSONArray = jSONObject.optJSONArray("sources");
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                            }
                            length = optJSONArray.length();
                            ArrayList arrayList2 = new ArrayList(length);
                            for (i2 = 0; i2 < length; i2++) {
                                arrayList2.add(optJSONArray.getString(i2));
                            }
                            arrayList.add(new ik(string, jkVar, B, B2, str, B3, B4, d2, d3, B5, B6, B7, B8, B9, B10, B11, B12, C, C2, valueOf3, str2, arrayList2));
                        }
                        d3 = null;
                        String string3 = jSONObject.getString("slug");
                        string3.getClass();
                        aa2.a aVar2 = aa2.m;
                        String string22 = jSONObject.getString("kind");
                        string22.getClass();
                        ba2Var = jk.valueOf(string22);
                        Object obj2 = jk.m;
                        if (ba2Var instanceof ba2) {
                        }
                        jk jkVar2 = (jk) ba2Var;
                        String B13 = B(jSONObject, "name", "ru");
                        String B22 = B(jSONObject, "name", "en");
                        String optString3 = jSONObject.optString("formula");
                        if (up2.y(optString3)) {
                        }
                        String B32 = B(jSONObject, "color", "ru");
                        String B42 = B(jSONObject, "color", "en");
                        String B52 = B(jSONObject, "lustre", "ru");
                        String B62 = B(jSONObject, "lustre", "en");
                        String B72 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "ru");
                        String B82 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "en");
                        String B92 = B(jSONObject, "symbolism", "ru");
                        String B102 = B(jSONObject, "symbolism", "en");
                        String B112 = B(jSONObject, "care", "ru");
                        String B122 = B(jSONObject, "care", "en");
                        List C3 = C(jSONObject, "ru");
                        List C22 = C(jSONObject, "en");
                        if (jSONObject.has("birthMonth")) {
                        }
                        String optString22 = jSONObject.optString("zodiac");
                        if (up2.y(optString22)) {
                        }
                        optJSONArray = jSONObject.optJSONArray("sources");
                        if (optJSONArray == null) {
                        }
                        length = optJSONArray.length();
                        ArrayList arrayList22 = new ArrayList(length);
                        while (i2 < length) {
                        }
                        arrayList.add(new ik(string3, jkVar2, B13, B22, str, B32, B42, d2, d3, B52, B62, B72, B82, B92, B102, B112, B122, C3, C22, valueOf3, str2, arrayList22));
                    }
                }
                d2 = null;
                if (optJSONArray2 != null) {
                }
                d3 = null;
                String string32 = jSONObject.getString("slug");
                string32.getClass();
                aa2.a aVar22 = aa2.m;
                String string222 = jSONObject.getString("kind");
                string222.getClass();
                ba2Var = jk.valueOf(string222);
                Object obj22 = jk.m;
                if (ba2Var instanceof ba2) {
                }
                jk jkVar22 = (jk) ba2Var;
                String B132 = B(jSONObject, "name", "ru");
                String B222 = B(jSONObject, "name", "en");
                String optString32 = jSONObject.optString("formula");
                if (up2.y(optString32)) {
                }
                String B322 = B(jSONObject, "color", "ru");
                String B422 = B(jSONObject, "color", "en");
                String B522 = B(jSONObject, "lustre", "ru");
                String B622 = B(jSONObject, "lustre", "en");
                String B722 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "ru");
                String B822 = B(jSONObject, FirebaseAnalytics.Param.ORIGIN, "en");
                String B922 = B(jSONObject, "symbolism", "ru");
                String B1022 = B(jSONObject, "symbolism", "en");
                String B1122 = B(jSONObject, "care", "ru");
                String B1222 = B(jSONObject, "care", "en");
                List C32 = C(jSONObject, "ru");
                List C222 = C(jSONObject, "en");
                if (jSONObject.has("birthMonth")) {
                }
                String optString222 = jSONObject.optString("zodiac");
                if (up2.y(optString222)) {
                }
                optJSONArray = jSONObject.optJSONArray("sources");
                if (optJSONArray == null) {
                }
                length = optJSONArray.length();
                ArrayList arrayList222 = new ArrayList(length);
                while (i2 < length) {
                }
                arrayList.add(new ik(string32, jkVar22, B132, B222, str, B322, B422, d2, d3, B522, B622, B722, B822, B922, B1022, B1122, B1222, C32, C222, valueOf3, str2, arrayList222));
            }
            return arrayList;
        } finally {
        }
    }

    public static String B(JSONObject jSONObject, String str, String str2) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        String optString = optJSONObject != null ? optJSONObject.optString(str2) : null;
        return optString == null ? BuildConfig.FLAVOR : optString;
    }

    public static List C(JSONObject jSONObject, String str) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("facts");
        if (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray(str)) == null) {
            return ah0.m;
        }
        int length = optJSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(optJSONArray.getString(i2));
        }
        return arrayList;
    }

    public static final vl1 D(a00 a00Var, vl1 vl1Var) {
        if (vl1Var.b(o3.H)) {
            return vl1Var;
        }
        a00Var.Y(1219399079);
        vl1 vl1Var2 = (vl1) vl1Var.d(sl1.a, new c0(6, a00Var));
        a00Var.q(false);
        return vl1Var2;
    }

    public static final vl1 E(a00 a00Var, vl1 vl1Var) {
        a00Var.X(439770924);
        vl1 D = D(a00Var, vl1Var);
        a00Var.q(false);
        return D;
    }

    public static final ArrayList F(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            yo1 yo1Var = (yo1) entry.getValue();
            Boolean bool = yo1Var != null ? Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !yo1Var.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static eo2 G(int i2, Object obj) {
        float f2 = (i2 & 2) != 0 ? 1500.0f : 400.0f;
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return new eo2(1.0f, f2, obj);
    }

    public static final Rect H(u31 u31Var) {
        return new Rect(u31Var.a, u31Var.b, u31Var.c, u31Var.d);
    }

    public static final Rect I(w72 w72Var) {
        return new Rect((int) w72Var.a, (int) w72Var.b, (int) w72Var.c, (int) w72Var.d);
    }

    public static final RectF J(w72 w72Var) {
        return new RectF(w72Var.a, w72Var.b, w72Var.c, w72Var.d);
    }

    public static final w72 K(Rect rect) {
        return new w72(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final w72 L(RectF rectF) {
        return new w72(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final ExtractedText M(nv2 nv2Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = nv2Var.a.n;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = nv2Var.b;
        extractedText.selectionStart = jw2.e(j2);
        extractedText.selectionEnd = jw2.d(j2);
        extractedText.flags = !up2.p(nv2Var.a.n, '\n') ? 1 : 0;
        return extractedText;
    }

    public static String N(int i2) {
        return i2 == -1 ? "Unspecified" : i2 == 0 ? "None" : i2 == 1 ? "Characters" : i2 == 2 ? "Words" : i2 == 3 ? "Sentences" : "Invalid";
    }

    public static String O(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "CornerRadius.circular(" + tk3.i0(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + tk3.i0(Float.intBitsToFloat(i2)) + ", " + tk3.i0(Float.intBitsToFloat(i3)) + ')';
    }

    public static h03 P(int i2, int i3, bf0 bf0Var) {
        int i4 = (i3 & 2) != 0 ? 0 : 90;
        if ((i3 & 4) != 0) {
            bf0Var = cf0.a;
        }
        return new h03(i2, i4, bf0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r1 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader Q() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        oj ojVar;
        synchronized (bd3.class) {
            if (a == null) {
                Thread thread2 = b;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i2 = 0;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i3];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i2 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i2];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    if (thread == null) {
                                        try {
                                            ojVar = new oj(threadGroup, "GmsDynamite");
                                        } catch (SecurityException e3) {
                                            e2 = e3;
                                        }
                                        try {
                                            ojVar.setContextClassLoader(null);
                                            ojVar.start();
                                            thread = ojVar;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = ojVar;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e2.getMessage());
                                            thread2 = thread;
                                            b = thread2;
                                        }
                                    }
                                } catch (SecurityException e5) {
                                    e2 = e5;
                                    thread = null;
                                }
                            } finally {
                            }
                        }
                        thread2 = thread;
                    }
                    b = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = b.getContextClassLoader();
                    } catch (SecurityException e6) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e6.getMessage());
                    }
                }
                a = classLoader2;
            }
            classLoader = a;
        }
        return classLoader;
    }

    public static final void a(String str, a00 a00Var, int i2) {
        a00Var.Z(1660321829);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2);
        if (a00Var.P(i3 & 1, (i3 & 3) != 2)) {
            yv2.b(str, null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).k, a00Var, (i3 & 14) | 384, 0, 65530);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x4(str, i2, 3);
        }
    }

    public static final void b(String str, a00 a00Var, int i2) {
        a00 a00Var2 = a00Var;
        a00Var2.Z(166629307);
        int i3 = i2 | (a00Var2.f(str) ? 4 : 2);
        if (a00Var2.P(i3 & 1, (i3 & 3) != 2)) {
            vl1 i4 = a.i(l41.q(1.0f, cw.l, androidx.compose.foundation.a.b(yk3.u(sl1.a, zb2.a(999.0f)), cw.k, ap.e), zb2.a(999.0f)), 12.0f, 6.0f);
            oj1 e2 = fp.e(qb2.p, false);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = E(a00Var2, i4);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, e2, oz.f);
            uj2.e(a00Var2, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            yv2.b(str, null, cw.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).n, a00Var, (i3 & 14) | 384, 0, 65530);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new x4(str, i2, 2);
        }
    }

    public static da0 c() {
        return new da0(1.0f, 1.0f);
    }

    public static final void d(boolean z, Function0 function0, a00 a00Var, int i2) {
        a00Var.Z(-3996277);
        int i3 = (a00Var.g(z) ? 4 : 2) | i2 | (a00Var.h(function0) ? 32 : 16);
        int i4 = 0;
        if (a00Var.P(i3 & 1, (i3 & 19) != 18)) {
            vl1 e2 = androidx.compose.foundation.a.e(7, l41.q(1.0f, cw.l, androidx.compose.foundation.a.b(yk3.u(b.h(sl1.a, 48.0f), zb2.a(14.0f)), cw.k, ap.e), zb2.a(14.0f)), null, function0, false);
            oj1 e3 = fp.e(qb2.t, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = E(a00Var, e2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e3, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            k01.a(z ? yj1.x() : z71.w(), uj2.f(R.string.cd_favourite, a00Var), null, z ? ap.d(4294924938L) : cw.h, a00Var, 0, 4);
            a00Var.q(true);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new ju0(z, function0, i2, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0209, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r81.M(), java.lang.Integer.valueOf(r6)) == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v48, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, Function0 function0, Function1 function1, vl1 vl1Var, a00 a00Var, int i2) {
        vl1 vl1Var2;
        a00 a00Var2;
        n72 s;
        Function2 mu0Var;
        boolean z;
        o00 o00Var;
        sc scVar;
        boolean z2;
        boolean z3;
        sc scVar2;
        sc scVar3;
        ij1 ij1Var;
        sc scVar4;
        String str2;
        zn znVar;
        a50 a50Var;
        final ik ikVar;
        sc scVar5;
        float f2;
        LayoutWeightElement layoutWeightElement;
        a50 a50Var2;
        int i3;
        ij1 ij1Var2;
        boolean z4;
        final int i4;
        boolean z5;
        boolean z6;
        boolean z7;
        ?? r2;
        Object obj;
        sl1 sl1Var;
        boolean z8;
        a00 a00Var3;
        Object obj2;
        a00 a00Var4 = a00Var;
        wh whVar = s93.c;
        sc scVar6 = sc.o;
        function0.getClass();
        function1.getClass();
        a00Var4.Z(1545111979);
        int i5 = i2 | (a00Var4.f(str) ? 4 : 2) | (a00Var4.h(function0) ? 32 : 16) | (a00Var4.h(function1) ? 256 : 128) | 3072;
        int i6 = 1;
        if (a00Var4.P(i5 & 1, (i5 & 1171) != 1170)) {
            Context context = (Context) a00Var4.j(AndroidCompositionLocals_androidKt.b);
            ij1 i7 = ij1.d.i(context);
            hk hkVar = i7.b;
            Object M = a00Var4.M();
            nj njVar = sz.a;
            Object obj3 = M;
            if (M == njVar) {
                a50 x = l41.x(h.m, a00Var4);
                a00Var4.i0(x);
                obj3 = x;
            }
            a50 a50Var3 = (a50) obj3;
            final nh nhVar = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            hkVar.getClass();
            zn1 a2 = ij2.a(p(hkVar.a, new String[]{"atlas_entry"}, new dk(str, hkVar, i6)), null, null, a00Var4, 48, 2);
            hkVar.getClass();
            zn1 a3 = ij2.a(p(hkVar.a, new String[]{"atlas_progress"}, new ck(str, 0)), null, null, a00Var, 48, 2);
            zn1 a4 = ij2.a(i7.c(null), ah0.m, null, a00Var, 48, 2);
            ik ikVar2 = (ik) a2.getValue();
            sl1 sl1Var2 = sl1.a;
            if (ikVar2 == null) {
                a00Var.X(1267016290);
                fp.a(androidx.compose.foundation.a.b(b.b(sl1Var2, 1.0f), cw.a, ap.e), a00Var, 0);
                a00Var.q(false);
                s = a00Var.s();
                if (s != null) {
                    mu0Var = new pk(str, function0, function1, i2, 1);
                    s.d = mu0Var;
                }
                return;
            }
            a00Var.X(-1206054775);
            a00Var.q(false);
            List list = (List) a4.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : list) {
                ik ikVar3 = (ik) obj4;
                if (ikVar3.b == ikVar2.b && !Intrinsics.b(ikVar3.a, ikVar2.a)) {
                    arrayList.add(obj4);
                }
            }
            List<ik> J = zv.J(6, arrayList);
            kk kkVar = (kk) a3.getValue();
            boolean z9 = kkVar != null && kkVar.b;
            kk kkVar2 = (kk) a3.getValue();
            boolean z10 = kkVar2 != null && kkVar2.c;
            kk kkVar3 = (kk) a3.getValue();
            boolean z11 = kkVar3 != null && kkVar3.d;
            boolean z12 = z9;
            vl1 T = s03.T(androidx.compose.foundation.a.a(b.b(sl1Var2, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b)))), s03.G(a00Var));
            yn ynVar = qb2.A;
            qw a5 = ow.a(whVar, ynVar, a00Var, 0);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = E(a00Var, T);
            pz.b.getClass();
            o00 o00Var2 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var2);
            } else {
                a00Var.l0();
            }
            sc scVar7 = oz.f;
            uj2.e(a00Var, a5, scVar7);
            sc scVar8 = oz.e;
            uj2.e(a00Var, l2, scVar8);
            sc scVar9 = oz.g;
            if (a00Var.S) {
                z = z11;
            } else {
                z = z11;
            }
            q40.r(D, a00Var, D, scVar9);
            sc scVar10 = oz.d;
            uj2.e(a00Var, E, scVar10);
            zn znVar2 = qb2.z;
            vl1 h2 = a.h(sl1Var2, 4.0f);
            fc2 a6 = ec2.a(s93.a, znVar2, a00Var, 48);
            int D2 = iv1.D(a00Var);
            v02 l3 = a00Var.l();
            vl1 E2 = E(a00Var, h2);
            a00Var.b0();
            boolean z13 = z10;
            if (a00Var.S) {
                a00Var.k(o00Var2);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a6, scVar7);
            uj2.e(a00Var, l3, scVar8);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var, D2, scVar9);
            }
            uj2.e(a00Var, E2, scVar10);
            ap.h(function0, null, false, null, o70.c, a00Var, ((i5 >> 3) & 14) | 196608);
            a00Var.q(true);
            vl1 a7 = androidx.compose.foundation.a.a(yk3.u(b.d(b.c(a.j(sl1Var2, 16.0f, 0.0f, 2), 1.0f), 220.0f), zb2.a(24.0f)), new xd1(qv.g(new aw(cw.f), new aw(cw.g)), 0L, 9187343241974906880L));
            oj1 e2 = fp.e(qb2.t, false);
            int D3 = iv1.D(a00Var);
            v02 l4 = a00Var.l();
            vl1 E3 = E(a00Var, a7);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var2);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, scVar7);
            uj2.e(a00Var, l4, scVar8);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var, D3, scVar9);
            }
            uj2.e(a00Var, E3, scVar10);
            wj.a(ikVar2, null, 150.0f, a00Var, 384, 2);
            a00Var.q(true);
            vl1 h3 = a.h(sl1Var2, 16.0f);
            qw a8 = ow.a(new yh(14.0f, true, scVar6), ynVar, a00Var, 6);
            int D4 = iv1.D(a00Var);
            v02 l5 = a00Var.l();
            vl1 E4 = E(a00Var, h3);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var2);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a8, scVar7);
            uj2.e(a00Var, l5, scVar8);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D4))) {
                q40.r(D4, a00Var, D4, scVar9);
            }
            uj2.e(a00Var, E4, scVar10);
            String c2 = ikVar2.c(nhVar);
            bp2 bp2Var = n13.a;
            pw2 pw2Var = ((l13) a00Var.j(bp2Var)).c;
            long j2 = cw.h;
            boolean z14 = z;
            wh whVar2 = whVar;
            yv2.b(c2, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var, 384, 0, 65530);
            yh yhVar = new yh(8.0f, true, scVar6);
            zn znVar3 = qb2.y;
            fc2 a9 = ec2.a(yhVar, znVar3, a00Var, 6);
            int D5 = iv1.D(a00Var);
            v02 l6 = a00Var.l();
            vl1 E5 = E(a00Var, sl1Var2);
            a00Var.b0();
            if (a00Var.S) {
                o00Var = o00Var2;
                a00Var.k(o00Var);
            } else {
                o00Var = o00Var2;
                a00Var.l0();
            }
            uj2.e(a00Var, a9, scVar7);
            uj2.e(a00Var, l6, scVar8);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D5))) {
                scVar = scVar9;
                q40.r(D5, a00Var, D5, scVar);
            } else {
                scVar = scVar9;
            }
            uj2.e(a00Var, E5, scVar10);
            String str3 = ikVar2.e;
            if (str3 == null) {
                a00Var.X(-1220943242);
                z2 = false;
            } else {
                z2 = false;
                a00Var.X(-1220943241);
                b(str3, a00Var, 0);
                Unit unit = Unit.a;
            }
            a00Var.q(z2);
            Integer num = ikVar2.t;
            if (num == null) {
                a00Var.X(-1220890542);
                a00Var.q(z2);
            } else {
                a00Var.X(-1220890541);
                int intValue = num.intValue();
                String[] stringArray = context.getResources().getStringArray(R.array.months_ml);
                stringArray.getClass();
                if (1 > intValue || intValue >= 13) {
                    z3 = false;
                    a00Var.X(-766848026);
                } else {
                    a00Var.X(1222352634);
                    String str4 = stringArray[intValue - 1];
                    str4.getClass();
                    z3 = false;
                    b(uj2.g(R.string.birthstone_month, new Object[]{str4}, a00Var), a00Var, 0);
                }
                a00Var.q(z3);
                Unit unit2 = Unit.a;
                a00Var.q(z3);
            }
            a00Var.q(true);
            yh yhVar2 = new yh(10.0f, true, scVar6);
            vl1 c3 = b.c(sl1Var2, 1.0f);
            fc2 a10 = ec2.a(yhVar2, znVar3, a00Var, 6);
            int D6 = iv1.D(a00Var);
            v02 l7 = a00Var.l();
            vl1 E6 = E(a00Var, c3);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a10, scVar7);
            uj2.e(a00Var, l7, scVar8);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D6))) {
                q40.r(D6, a00Var, D6, scVar);
            }
            uj2.e(a00Var, E6, scVar10);
            String f3 = uj2.f(z12 ? R.string.action_studied : R.string.action_mark_studied, a00Var);
            long j3 = cw.w;
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            boolean h4 = a00Var.h(a50Var3) | a00Var.h(i7);
            int i8 = i5 & 14;
            boolean g2 = h4 | (i8 == 4) | a00Var.g(z12);
            Object M2 = a00Var.M();
            if (g2 || M2 == njVar) {
                scVar2 = scVar10;
                scVar3 = scVar;
                ij1Var = i7;
                scVar4 = scVar6;
                str2 = f3;
                znVar = znVar3;
                a50Var = a50Var3;
                ikVar = ikVar2;
                scVar5 = scVar8;
                f2 = 1.0f;
                nu0 nu0Var = new nu0(a50Var, ij1Var, str, z12, 0);
                a00Var.i0(nu0Var);
                M2 = nu0Var;
            } else {
                scVar5 = scVar8;
                scVar2 = scVar10;
                scVar3 = scVar;
                ij1Var = i7;
                scVar4 = scVar6;
                str2 = f3;
                znVar = znVar3;
                a50Var = a50Var3;
                ikVar = ikVar2;
                f2 = 1.0f;
            }
            a50 a50Var4 = a50Var;
            ij1 ij1Var3 = ij1Var;
            k(str2, z12, j3, layoutWeightElement2, (Function0) M2, a00Var, 384);
            String f4 = uj2.f(R.string.action_i_own, a00Var);
            long j4 = cw.q;
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f2, true);
            boolean h5 = a00Var.h(a50Var4) | a00Var.h(ij1Var3) | (i8 == 4) | a00Var.g(z14);
            Object M3 = a00Var.M();
            if (h5 || M3 == njVar) {
                layoutWeightElement = layoutWeightElement3;
                a50Var2 = a50Var4;
                i3 = 4;
                ij1Var2 = ij1Var3;
                nu0 nu0Var2 = new nu0(a50Var2, ij1Var2, str, z14, 1);
                a00Var.i0(nu0Var2);
                M3 = nu0Var2;
            } else {
                i3 = 4;
                ij1Var2 = ij1Var3;
                a50Var2 = a50Var4;
                layoutWeightElement = layoutWeightElement3;
            }
            a50 a50Var5 = a50Var2;
            LayoutWeightElement layoutWeightElement4 = layoutWeightElement;
            ij1 ij1Var4 = ij1Var2;
            k(f4, z14, j4, layoutWeightElement4, (Function0) M3, a00Var, 384);
            boolean h6 = a00Var.h(a50Var5) | a00Var.h(ij1Var4) | (i8 == i3) | a00Var.g(z13);
            Object M4 = a00Var.M();
            if (h6 || M4 == njVar) {
                nu0 nu0Var3 = new nu0(a50Var5, ij1Var4, str, z13, 2);
                a00Var.i0(nu0Var3);
                M4 = nu0Var3;
            }
            final int i9 = 0;
            d(z13, (Function0) M4, a00Var, 0);
            a00Var.q(true);
            i(uj2.f(R.string.detail_properties, a00Var), yj1.H(-344670416, new Function2() { // from class: ou0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    int i10 = i9;
                    nh nhVar2 = nhVar;
                    ik ikVar4 = ikVar;
                    a00 a00Var5 = (a00) obj5;
                    int intValue2 = ((Integer) obj6).intValue();
                    switch (i10) {
                        case 0:
                            if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                bd3.h(uj2.f(R.string.prop_color, a00Var5), s03.F(ikVar4.f, ikVar4.g, nhVar2), a00Var5, 0);
                                String b2 = ikVar4.b();
                                if (b2 == null) {
                                    a00Var5.X(1190549654);
                                } else {
                                    a00Var5.X(1190549655);
                                    bd3.h(uj2.f(R.string.prop_hardness, a00Var5), b2, a00Var5, 0);
                                }
                                a00Var5.q(false);
                                bd3.h(uj2.f(R.string.prop_lustre, a00Var5), s03.F(ikVar4.j, ikVar4.k, nhVar2), a00Var5, 0);
                                bd3.h(uj2.f(R.string.prop_origin, a00Var5), s03.F(ikVar4.l, ikVar4.m, nhVar2), a00Var5, 0);
                                String str5 = ikVar4.e;
                                if (str5 == null) {
                                    a00Var5.X(1190790679);
                                } else {
                                    a00Var5.X(1190790680);
                                    bd3.h(uj2.f(R.string.prop_formula, a00Var5), str5, a00Var5, 0);
                                }
                                a00Var5.q(false);
                            } else {
                                a00Var5.S();
                            }
                            break;
                        case 1:
                            if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                bd3.a(s03.F(ikVar4.n, ikVar4.o, nhVar2), a00Var5, 0);
                            } else {
                                a00Var5.S();
                            }
                            break;
                        default:
                            if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                bd3.a(s03.F(ikVar4.p, ikVar4.q, nhVar2), a00Var5, 0);
                            } else {
                                a00Var5.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, a00Var), a00Var, 48);
            if (up2.y(s03.F(ikVar.n, ikVar.o, nhVar))) {
                z4 = false;
                a00Var.X(809302347);
            } else {
                a00Var.X(815910493);
                final int i10 = 1;
                i(uj2.f(R.string.detail_symbolism, a00Var), yj1.H(-933403317, new Function2() { // from class: ou0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i102 = i10;
                        nh nhVar2 = nhVar;
                        ik ikVar4 = ikVar;
                        a00 a00Var5 = (a00) obj5;
                        int intValue2 = ((Integer) obj6).intValue();
                        switch (i102) {
                            case 0:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.h(uj2.f(R.string.prop_color, a00Var5), s03.F(ikVar4.f, ikVar4.g, nhVar2), a00Var5, 0);
                                    String b2 = ikVar4.b();
                                    if (b2 == null) {
                                        a00Var5.X(1190549654);
                                    } else {
                                        a00Var5.X(1190549655);
                                        bd3.h(uj2.f(R.string.prop_hardness, a00Var5), b2, a00Var5, 0);
                                    }
                                    a00Var5.q(false);
                                    bd3.h(uj2.f(R.string.prop_lustre, a00Var5), s03.F(ikVar4.j, ikVar4.k, nhVar2), a00Var5, 0);
                                    bd3.h(uj2.f(R.string.prop_origin, a00Var5), s03.F(ikVar4.l, ikVar4.m, nhVar2), a00Var5, 0);
                                    String str5 = ikVar4.e;
                                    if (str5 == null) {
                                        a00Var5.X(1190790679);
                                    } else {
                                        a00Var5.X(1190790680);
                                        bd3.h(uj2.f(R.string.prop_formula, a00Var5), str5, a00Var5, 0);
                                    }
                                    a00Var5.q(false);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                            case 1:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.a(s03.F(ikVar4.n, ikVar4.o, nhVar2), a00Var5, 0);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                            default:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.a(s03.F(ikVar4.p, ikVar4.q, nhVar2), a00Var5, 0);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, a00Var), a00Var, 48);
                z4 = false;
            }
            a00Var.q(z4);
            if (up2.y(s03.F(ikVar.p, ikVar.q, nhVar))) {
                i4 = 2;
                z5 = false;
                a00Var.X(809302347);
            } else {
                a00Var.X(816062951);
                i4 = 2;
                i(uj2.f(R.string.detail_care, a00Var), yj1.H(1435809154, new Function2() { // from class: ou0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        int i102 = i4;
                        nh nhVar2 = nhVar;
                        ik ikVar4 = ikVar;
                        a00 a00Var5 = (a00) obj5;
                        int intValue2 = ((Integer) obj6).intValue();
                        switch (i102) {
                            case 0:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.h(uj2.f(R.string.prop_color, a00Var5), s03.F(ikVar4.f, ikVar4.g, nhVar2), a00Var5, 0);
                                    String b2 = ikVar4.b();
                                    if (b2 == null) {
                                        a00Var5.X(1190549654);
                                    } else {
                                        a00Var5.X(1190549655);
                                        bd3.h(uj2.f(R.string.prop_hardness, a00Var5), b2, a00Var5, 0);
                                    }
                                    a00Var5.q(false);
                                    bd3.h(uj2.f(R.string.prop_lustre, a00Var5), s03.F(ikVar4.j, ikVar4.k, nhVar2), a00Var5, 0);
                                    bd3.h(uj2.f(R.string.prop_origin, a00Var5), s03.F(ikVar4.l, ikVar4.m, nhVar2), a00Var5, 0);
                                    String str5 = ikVar4.e;
                                    if (str5 == null) {
                                        a00Var5.X(1190790679);
                                    } else {
                                        a00Var5.X(1190790680);
                                        bd3.h(uj2.f(R.string.prop_formula, a00Var5), str5, a00Var5, 0);
                                    }
                                    a00Var5.q(false);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                            case 1:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.a(s03.F(ikVar4.n, ikVar4.o, nhVar2), a00Var5, 0);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                            default:
                                if (a00Var5.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    bd3.a(s03.F(ikVar4.p, ikVar4.q, nhVar2), a00Var5, 0);
                                } else {
                                    a00Var5.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, a00Var), a00Var, 48);
                z5 = false;
            }
            a00Var.q(z5);
            List list2 = nhVar == nh.m ? ikVar.r : ikVar.s;
            if (list2.isEmpty()) {
                z6 = false;
                a00Var.X(809302347);
            } else {
                a00Var.X(816241387);
                z6 = false;
                i(uj2.f(R.string.detail_facts, a00Var), yj1.H(-1386879549, new pu0(false ? 1 : 0, list2), a00Var), a00Var, 48);
            }
            a00Var.q(z6);
            if (ikVar.v.isEmpty()) {
                z7 = false;
                a00Var.X(809302347);
            } else {
                a00Var.X(816532911);
                i(uj2.f(R.string.detail_sources, a00Var), yj1.H(85399044, new ia(i4, ikVar), a00Var), a00Var, 48);
                z7 = false;
            }
            a00Var.q(z7);
            String f5 = uj2.f(R.string.detail_learn_more, a00Var);
            boolean h7 = a00Var.h(context) | a00Var.h(ikVar);
            Object M5 = a00Var.M();
            if (h7 || M5 == njVar) {
                r2 = 1;
                h00 h00Var = new h00(r2, context, ikVar);
                a00Var.i0(h00Var);
                obj = h00Var;
            } else {
                r2 = 1;
                obj = M5;
            }
            boolean z15 = r2;
            yi1.a(f5, (Function0) obj, b.c(sl1Var2, 1.0f), null, false, a00Var, 384, 24);
            a00 a00Var5 = a00Var;
            if (J.isEmpty()) {
                sl1Var = sl1Var2;
                z8 = z15;
                a00Var5.X(809302347);
                a00Var3 = a00Var5;
            } else {
                a00Var5.X(817532382);
                o00 o00Var3 = o00Var;
                nh nhVar2 = nhVar;
                int i11 = i5;
                nj njVar2 = njVar;
                yv2.b(uj2.f(R.string.detail_similar, a00Var5), null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var5.j(bp2Var)).g, a00Var, 384, 0, 65530);
                a00 a00Var6 = a00Var;
                sl1 sl1Var3 = sl1Var2;
                vl1 z16 = s03.z(b.c(sl1Var3, 1.0f), s03.G(a00Var6));
                ?? r8 = 1;
                fc2 a11 = ec2.a(new yh(12.0f, true, scVar4), znVar, a00Var6, 6);
                int D7 = iv1.D(a00Var6);
                v02 l8 = a00Var6.l();
                vl1 E7 = E(a00Var6, z16);
                a00Var6.b0();
                if (a00Var6.S) {
                    a00Var6.k(o00Var3);
                } else {
                    a00Var6.l0();
                }
                uj2.e(a00Var6, a11, scVar7);
                uj2.e(a00Var6, l8, scVar5);
                if (a00Var6.S || !Intrinsics.b(a00Var6.M(), Integer.valueOf(D7))) {
                    q40.r(D7, a00Var6, D7, scVar3);
                }
                uj2.e(a00Var6, E7, scVar2);
                a00Var6.X(-1171334374);
                a00 a00Var7 = a00Var6;
                for (ik ikVar4 : J) {
                    yn ynVar2 = qb2.B;
                    vl1 k2 = b.k(72.0f);
                    int i12 = i11;
                    int i13 = (a00Var7.h(ikVar4) ? 1 : 0) | ((i12 & 896) == 256 ? r8 : 0);
                    Object M6 = a00Var7.M();
                    nj njVar3 = njVar2;
                    if (i13 != 0 || M6 == njVar3) {
                        qs qsVar = new qs(function1, ikVar4, r8);
                        a00Var7.i0(qsVar);
                        obj2 = qsVar;
                    } else {
                        obj2 = M6;
                    }
                    vl1 e3 = androidx.compose.foundation.a.e(7, k2, null, (Function0) obj2, false);
                    wh whVar3 = whVar2;
                    qw a12 = ow.a(whVar3, ynVar2, a00Var7, 48);
                    int D8 = iv1.D(a00Var7);
                    v02 l9 = a00Var7.l();
                    vl1 E8 = E(a00Var7, e3);
                    pz.b.getClass();
                    o00 o00Var4 = oz.b;
                    a00Var7.b0();
                    if (a00Var7.S) {
                        a00Var7.k(o00Var4);
                    } else {
                        a00Var7.l0();
                    }
                    uj2.e(a00Var7, a12, oz.f);
                    uj2.e(a00Var7, l9, oz.e);
                    sc scVar11 = oz.g;
                    if (a00Var7.S || !Intrinsics.b(a00Var7.M(), Integer.valueOf(D8))) {
                        q40.r(D8, a00Var7, D8, scVar11);
                    }
                    uj2.e(a00Var7, E8, oz.d);
                    wj.a(ikVar4, null, 48.0f, a00Var7, 384, 2);
                    nh nhVar3 = nhVar2;
                    yv2.b(ikVar4.c(nhVar3), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((l13) a00Var7.j(n13.a)).o, a00Var, 384, 3072, 57338);
                    a00 a00Var8 = a00Var;
                    a00Var8.q(true);
                    r8 = 1;
                    whVar2 = whVar3;
                    nhVar2 = nhVar3;
                    i11 = i12;
                    sl1Var3 = sl1Var3;
                    njVar2 = njVar3;
                    a00Var7 = a00Var8;
                }
                sl1Var = sl1Var3;
                boolean z17 = r8;
                z7 = false;
                a00Var7.q(false);
                a00Var7.q(z17);
                z8 = z17;
                a00Var3 = a00Var7;
            }
            a00Var3.q(z7);
            a00Var3.q(z8);
            a00Var3.q(z8);
            vl1Var2 = sl1Var;
            a00Var2 = a00Var3;
        } else {
            a00Var4.S();
            vl1Var2 = vl1Var;
            a00Var2 = a00Var4;
        }
        s = a00Var2.s();
        if (s != null) {
            mu0Var = new mu0(str, function0, function1, vl1Var2, i2);
            s.d = mu0Var;
        }
    }

    public static final void f(Function0 function0, Function0 function02, final Function1 function1, final Function0 function03, final Function0 function04, vl1 vl1Var, a00 a00Var, final int i2) {
        Function0 function05;
        final vl1 vl1Var2;
        ik ikVar;
        long j2;
        sc scVar;
        sc scVar2;
        sc scVar3;
        sc scVar4;
        su suVar;
        long j3;
        bp2 bp2Var;
        sc scVar5;
        final Function0 function06 = function0;
        a00 a00Var2 = a00Var;
        int i3 = 0;
        function06.getClass();
        function02.getClass();
        function1.getClass();
        function03.getClass();
        function04.getClass();
        a00Var2.Z(1893947096);
        int i4 = i2 | (a00Var2.h(function06) ? 4 : 2) | (a00Var2.h(function02) ? 32 : 16) | (a00Var2.h(function1) ? 256 : 128) | (a00Var2.h(function03) ? 2048 : 1024) | (a00Var2.h(function04) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE) | 196608;
        if (a00Var2.P(i4 & 1, (74899 & i4) != 74898)) {
            Context context = (Context) a00Var2.j(AndroidCompositionLocals_androidKt.b);
            Object M = a00Var2.M();
            nj njVar = sz.a;
            if (M == njVar) {
                M = ij1.d.i(context);
                a00Var2.i0(M);
            }
            ij1 ij1Var = (ij1) M;
            nh nhVar = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            zn1 a2 = ij2.a(ij1Var.c(null), ah0.m, null, a00Var2, 48, 2);
            zn1 a3 = ij2.a(ij1Var.h(), 0, null, a00Var, 48, 2);
            zn1 a4 = ij2.a(new cj1(ij1Var.b.b(), i3), 0, null, a00Var, 48, 2);
            zn1 a5 = ij2.a(p(ij1Var.c.a, new String[]{"jewelry_item"}, new zd(19)), 0, null, a00Var, 48, 2);
            boolean f2 = a00Var.f((List) a2.getValue());
            Object M2 = a00Var.M();
            if (f2 || M2 == njVar) {
                if (((List) a2.getValue()).isEmpty()) {
                    ikVar = null;
                } else {
                    List list = (List) a2.getValue();
                    int epochDay = (int) (LocalDate.now().toEpochDay() % ((List) a2.getValue()).size());
                    if (epochDay < 0) {
                        epochDay = 0;
                    }
                    ikVar = (ik) list.get(epochDay);
                }
                a00Var.i0(ikVar);
                M2 = ikVar;
            }
            ik ikVar2 = (ik) M2;
            sl1 sl1Var = sl1.a;
            vl1 h2 = a.h(s03.T(androidx.compose.foundation.a.a(b.b(sl1Var, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b)))), s03.G(a00Var)), 16.0f);
            yh S = s93.S(14.0f);
            yn ynVar = qb2.A;
            qw a6 = ow.a(S, ynVar, a00Var, 6);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = E(a00Var, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar6 = oz.f;
            uj2.e(a00Var, a6, scVar6);
            sc scVar7 = oz.e;
            uj2.e(a00Var, l2, scVar7);
            sc scVar8 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar8);
            }
            sc scVar9 = oz.d;
            uj2.e(a00Var, E, scVar9);
            zn znVar = qb2.z;
            fc2 a7 = ec2.a(s93.S(12.0f), znVar, a00Var, 54);
            int D2 = iv1.D(a00Var);
            v02 l3 = a00Var.l();
            vl1 E2 = E(a00Var, sl1Var);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a7, scVar6);
            uj2.e(a00Var, l3, scVar7);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var, D2, scVar8);
            }
            uj2.e(a00Var, E2, scVar9);
            int i5 = i4;
            l41.g(o70.G(R.drawable.mascot_goose_happy, a00Var), b.h(sl1Var, 72.0f), null, null, 0.0f, a00Var, 432, 120);
            String f3 = uj2.f(R.string.home_greeting, a00Var);
            bp2 bp2Var2 = n13.a;
            pw2 pw2Var = ((l13) a00Var.j(bp2Var2)).c;
            long j4 = cw.h;
            yv2.b(f3, null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var, 384, 0, 65530);
            a00Var.q(true);
            vl1 u = yk3.u(b.c(sl1Var, 1.0f), zb2.a(16.0f));
            long j5 = cw.k;
            su suVar2 = ap.e;
            vl1 b2 = androidx.compose.foundation.a.b(u, j5, suVar2);
            long j6 = cw.l;
            vl1 h3 = a.h(androidx.compose.foundation.a.e(7, l41.q(1.0f, j6, b2, zb2.a(16.0f)), null, function03, false), 14.0f);
            fc2 a8 = ec2.a(s93.S(10.0f), znVar, a00Var, 54);
            int D3 = iv1.D(a00Var);
            v02 l4 = a00Var.l();
            vl1 E3 = E(a00Var, h3);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a8, scVar6);
            uj2.e(a00Var, l4, scVar7);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var, D3, scVar8);
            }
            uj2.e(a00Var, E3, scVar9);
            x01 z = z();
            long j7 = cw.i;
            zn znVar2 = znVar;
            k01.a(z, null, null, j7, a00Var, 3120, 4);
            yv2.b(uj2.f(R.string.search_hint, a00Var), null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 384, 0, 131066);
            a00 a00Var3 = a00Var;
            a00Var3.q(true);
            if (ikVar2 == null) {
                a00Var3.X(-870884242);
                a00Var3.q(false);
                j2 = j6;
                j3 = j5;
                suVar = suVar2;
                scVar5 = scVar8;
                bp2Var = bp2Var2;
                scVar = scVar6;
                scVar4 = scVar9;
                scVar2 = scVar7;
            } else {
                a00Var3.X(-870884241);
                vl1 q = l41.q(1.0f, j6, androidx.compose.foundation.a.b(yk3.u(b.c(sl1Var, 1.0f), zb2.a(20.0f)), j5, suVar2), zb2.a(20.0f));
                boolean h4 = ((i5 & 896) == 256) | a00Var3.h(ikVar2);
                Object M3 = a00Var3.M();
                if (h4 || M3 == njVar) {
                    M3 = new qs(function1, ikVar2, 2);
                    a00Var3.i0(M3);
                }
                vl1 h5 = a.h(androidx.compose.foundation.a.e(7, q, null, (Function0) M3, false), 16.0f);
                qw a9 = ow.a(s93.S(10.0f), ynVar, a00Var3, 6);
                int D4 = iv1.D(a00Var3);
                v02 l5 = a00Var3.l();
                vl1 E4 = E(a00Var3, h5);
                a00Var3.b0();
                j2 = j6;
                if (a00Var3.S) {
                    a00Var3.k(o00Var);
                } else {
                    a00Var3.l0();
                }
                scVar = scVar6;
                uj2.e(a00Var3, a9, scVar);
                scVar2 = scVar7;
                uj2.e(a00Var3, l5, scVar2);
                if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D4))) {
                    scVar3 = scVar8;
                    q40.r(D4, a00Var3, D4, scVar3);
                } else {
                    scVar3 = scVar8;
                }
                scVar4 = scVar9;
                uj2.e(a00Var3, E4, scVar4);
                String f4 = uj2.f(R.string.home_gem_of_day, a00Var3);
                long j8 = cw.w;
                jq0 jq0Var = jq0.t;
                i5 = i5;
                suVar = suVar2;
                j3 = j5;
                bp2Var = bp2Var2;
                scVar5 = scVar3;
                yv2.b(f4, null, j8, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var3.j(bp2Var2)).m, a00Var, 196992, 0, 65498);
                fc2 a10 = ec2.a(s93.S(14.0f), znVar2, a00Var, 54);
                int D5 = iv1.D(a00Var);
                v02 l6 = a00Var.l();
                vl1 E5 = E(a00Var, sl1Var);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(o00Var);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, a10, scVar);
                uj2.e(a00Var, l6, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D5))) {
                    q40.r(D5, a00Var, D5, scVar5);
                }
                uj2.e(a00Var, E5, scVar4);
                znVar2 = znVar2;
                wj.a(ikVar2, null, 84.0f, a00Var, 384, 2);
                qw a11 = ow.a(s93.c, ynVar, a00Var, 0);
                int D6 = iv1.D(a00Var);
                v02 l7 = a00Var.l();
                vl1 E6 = E(a00Var, sl1Var);
                a00Var.b0();
                if (a00Var.S) {
                    a00Var.k(o00Var);
                } else {
                    a00Var.l0();
                }
                uj2.e(a00Var, a11, scVar);
                uj2.e(a00Var, l7, scVar2);
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D6))) {
                    q40.r(D6, a00Var, D6, scVar5);
                }
                uj2.e(a00Var, E6, scVar4);
                yv2.b(ikVar2.c(nhVar), null, j4, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).f, a00Var, 196992, 0, 65498);
                a00Var3 = a00Var;
                String str = (String) zv.v(nhVar == nh.m ? ikVar2.r : ikVar2.s);
                if (str == null) {
                    a00Var3.X(1390272995);
                } else {
                    a00Var3.X(1390272996);
                    yv2.b(str, null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var3.j(bp2Var)).k, a00Var3, 384, 0, 65530);
                    a00Var3 = a00Var3;
                    Unit unit = Unit.a;
                }
                a00Var3.q(false);
                a00Var3.q(true);
                a00Var3.q(true);
                a00Var3.q(true);
                Unit unit2 = Unit.a;
                a00Var3.q(false);
            }
            yh S2 = s93.S(12.0f);
            zn znVar3 = qb2.y;
            fc2 a12 = ec2.a(S2, znVar3, a00Var3, 6);
            int D7 = iv1.D(a00Var3);
            v02 l8 = a00Var3.l();
            vl1 E7 = E(a00Var3, sl1Var);
            a00Var3.b0();
            if (a00Var3.S) {
                a00Var3.k(o00Var);
            } else {
                a00Var3.l0();
            }
            uj2.e(a00Var3, a12, scVar);
            uj2.e(a00Var3, l8, scVar2);
            if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D7))) {
                q40.r(D7, a00Var3, D7, scVar5);
            }
            uj2.e(a00Var3, E7, scVar4);
            a00 a00Var4 = a00Var3;
            g(String.valueOf(((Number) a5.getValue()).intValue()), uj2.f(R.string.home_metric_items, a00Var3), new LayoutWeightElement(1.0f, true), function04, a00Var4, (i5 >> 3) & 7168);
            sc scVar10 = scVar;
            sc scVar11 = scVar2;
            sc scVar12 = scVar5;
            bp2 bp2Var3 = bp2Var;
            long j9 = j2;
            long j10 = j3;
            sc scVar13 = scVar4;
            g(((Number) a3.getValue()).intValue() + " / " + ((Number) a4.getValue()).intValue(), uj2.f(R.string.home_metric_studied, a00Var4), new LayoutWeightElement(1.0f, true), function0, a00Var4, (i5 << 9) & 7168);
            function06 = function0;
            a00Var4.q(true);
            fc2 a13 = ec2.a(s93.S(12.0f), znVar3, a00Var4, 6);
            int D8 = iv1.D(a00Var4);
            v02 l9 = a00Var4.l();
            vl1 E8 = E(a00Var4, sl1Var);
            a00Var4.b0();
            if (a00Var4.S) {
                a00Var4.k(o00Var);
            } else {
                a00Var4.l0();
            }
            uj2.e(a00Var4, a13, scVar10);
            uj2.e(a00Var4, l9, scVar11);
            if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D8))) {
                q40.r(D8, a00Var4, D8, scVar12);
            }
            uj2.e(a00Var4, E8, scVar13);
            j(uj2.f(R.string.home_shortcut_atlas, a00Var4), new LayoutWeightElement(1.0f, true), function06, a00Var4, (i5 << 6) & 896);
            function05 = function02;
            j(uj2.f(R.string.home_shortcut_jewelry, a00Var4), new LayoutWeightElement(1.0f, true), function05, a00Var4, (i5 << 3) & 896);
            a00Var4.q(true);
            vl1 h6 = a.h(l41.q(1.0f, j9, androidx.compose.foundation.a.b(yk3.u(b.c(sl1Var, 1.0f), zb2.a(16.0f)), j10, suVar), zb2.a(16.0f)), 14.0f);
            fc2 a14 = ec2.a(s93.S(10.0f), znVar2, a00Var4, 54);
            int D9 = iv1.D(a00Var4);
            v02 l10 = a00Var4.l();
            vl1 E9 = E(a00Var4, h6);
            a00Var4.b0();
            if (a00Var4.S) {
                a00Var4.k(o00Var);
            } else {
                a00Var4.l0();
            }
            uj2.e(a00Var4, a14, scVar10);
            uj2.e(a00Var4, l10, scVar11);
            if (a00Var4.S || !Intrinsics.b(a00Var4.M(), Integer.valueOf(D9))) {
                q40.r(D9, a00Var4, D9, scVar12);
            }
            uj2.e(a00Var4, E9, scVar13);
            l41.g(o70.G(R.drawable.mascot_goose_tip, a00Var4), b.h(sl1Var, 44.0f), null, null, 0.0f, a00Var4, 432, 120);
            yv2.b(uj2.f(R.string.home_care_reminder, a00Var4), null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var4.j(bp2Var3)).k, a00Var4, 384, 0, 65530);
            a00Var2 = a00Var4;
            a00Var2.q(true);
            a00Var2.q(true);
            vl1Var2 = sl1Var;
        } else {
            function05 = function02;
            a00Var2.S();
            vl1Var2 = vl1Var;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            final Function0 function07 = function05;
            s.d = new Function2(function07, function1, function03, function04, vl1Var2, i2) { // from class: vx0
                public final /* synthetic */ Function0 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function0 p;
                public final /* synthetic */ Function0 q;
                public final /* synthetic */ vl1 r;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = s03.R(1);
                    bd3.f(Function0.this, this.n, this.o, this.p, this.q, this.r, (a00) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(String str, String str2, vl1 vl1Var, Function0 function0, a00 a00Var, int i2) {
        int i3;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-1269356148);
        if ((i2 & 6) == 0) {
            i3 = (a00Var2.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var2.f(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var2.f(vl1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= a00Var2.h(function0) ? 2048 : 1024;
        }
        if (a00Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            vl1 h2 = a.h(androidx.compose.foundation.a.e(7, l41.q(1.0f, cw.l, androidx.compose.foundation.a.b(yk3.u(vl1Var, zb2.a(16.0f)), cw.k, ap.e), zb2.a(16.0f)), null, function0, false), 16.0f);
            qw a2 = ow.a(new yh(4.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            bp2 bp2Var = n13.a;
            yv2.b(str, null, cw.h, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).e, a00Var2, (i3 & 14) | 196992, 0, 65498);
            yv2.b(str2, null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).n, a00Var2, ((i3 >> 3) & 14) | 384, 0, 65530);
            a00Var2 = a00Var2;
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new wi(str, str2, vl1Var, function0, i2);
        }
    }

    public static final void h(String str, String str2, a00 a00Var, int i2) {
        String str3;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-1697490359);
        int i3 = i2 | (a00Var2.f(str) ? 4 : 2) | (a00Var2.f(str2) ? 32 : 16);
        if (a00Var2.P(i3 & 1, (i3 & 19) != 18)) {
            vl1 c2 = b.c(sl1.a, 1.0f);
            fc2 a2 = ec2.a(new yh(8.0f, true, sc.o), qb2.y, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = E(a00Var2, c2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            long j2 = cw.i;
            vl1 k2 = b.k(120.0f);
            bp2 bp2Var = n13.a;
            yv2.b(str, k2, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).k, a00Var, (i3 & 14) | 432, 0, 65528);
            str3 = str2;
            yv2.b(str3, null, cw.h, 0L, jq0.r, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).k, a00Var, ((i3 >> 3) & 14) | 196992, 0, 65498);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            str3 = str2;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ku0(str, i2, 0, str3);
        }
    }

    public static final void i(String str, my myVar, a00 a00Var, int i2) {
        Function2 function2;
        a00 a00Var2 = a00Var;
        a00Var2.Z(-1166873315);
        int i3 = i2 | (a00Var2.f(str) ? 4 : 2);
        if (a00Var2.P(i3 & 1, (i3 & 19) != 18)) {
            vl1 h2 = a.h(l41.q(1.0f, cw.l, androidx.compose.foundation.a.b(yk3.u(b.c(sl1.a, 1.0f), zb2.a(16.0f)), cw.k, ap.e), zb2.a(16.0f)), 14.0f);
            qw a2 = ow.a(new yh(8.0f, true, sc.o), qb2.A, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = E(a00Var2, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            yv2.b(str, null, cw.w, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).h, a00Var, (i3 & 14) | 196992, 0, 65498);
            a00Var2 = a00Var;
            function2 = myVar;
            function2.invoke(a00Var2, 6);
            a00Var2.q(true);
        } else {
            function2 = myVar;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ss(i2, 3, str, function2);
        }
    }

    public static final void j(String str, vl1 vl1Var, Function0 function0, a00 a00Var, int i2) {
        String str2;
        int i3;
        a00 a00Var2;
        a00Var.Z(-504941255);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (a00Var.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.f(vl1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(function0) ? 256 : 128;
        }
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            vl1 h2 = a.h(b.d(androidx.compose.foundation.a.e(7, androidx.compose.foundation.a.a(yk3.u(vl1Var, zb2.a(16.0f)), nj.q(qv.g(new aw(cw.p), new aw(cw.q)))), null, function0, false), 64.0f), 16.0f);
            oj1 e2 = fp.e(qb2.s, false);
            int D = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E = E(a00Var, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e2, oz.f);
            uj2.e(a00Var, l2, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            yv2.b(str2, null, cw.h, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).h, a00Var, (i3 & 14) | 196992, 0, 65498);
            a00Var2 = a00Var;
            a00Var2.q(true);
        } else {
            a00Var2 = a00Var;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new us(str, vl1Var, function0, i2, 2);
        }
    }

    public static final void k(final String str, final boolean z, final long j2, final vl1 vl1Var, final Function0 function0, a00 a00Var, final int i2) {
        boolean z2;
        a00 a00Var2 = a00Var;
        a00Var2.Z(292219863);
        int i3 = i2 | (a00Var2.f(str) ? 4 : 2) | (a00Var2.g(z) ? 32 : 16) | (a00Var2.f(vl1Var) ? 2048 : 1024) | (a00Var2.h(function0) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE);
        if (a00Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            vl1 i4 = a.i(androidx.compose.foundation.a.e(7, l41.q(1.0f, z ? aw.f : cw.l, androidx.compose.foundation.a.b(yk3.u(vl1Var, zb2.a(14.0f)), z ? j2 : cw.k, ap.e), zb2.a(14.0f)), null, function0, false), 8.0f, 12.0f);
            oj1 e2 = fp.e(qb2.t, false);
            int D = iv1.D(a00Var2);
            v02 l2 = a00Var2.l();
            vl1 E = E(a00Var2, i4);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var2, e2, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var2, l2, scVar2);
            sc scVar3 = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var2, E, scVar4);
            fc2 a2 = ec2.a(new yh(6.0f, true, sc.o), qb2.z, a00Var2, 54);
            int D2 = iv1.D(a00Var2);
            v02 l3 = a00Var2.l();
            sl1 sl1Var = sl1.a;
            vl1 E2 = E(a00Var2, sl1Var);
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, scVar);
            uj2.e(a00Var2, l3, scVar2);
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var2, D2, scVar3);
            }
            uj2.e(a00Var2, E2, scVar4);
            if (z) {
                a00Var2.X(-358043817);
                z2 = false;
                k01.a(s(), null, b.h(sl1Var, 16.0f), cw.x, a00Var2, 3504, 0);
            } else {
                z2 = false;
                a00Var2.X(-368531179);
            }
            a00Var2.q(z2);
            yv2.b(str, null, z ? cw.x : cw.h, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(n13.a)).n, a00Var, (i3 & 14) | 196608, 0, 65498);
            a00Var2 = a00Var;
            a00Var2.q(true);
            a00Var2.q(true);
        } else {
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new Function2(str, z, j2, vl1Var, function0, i2) { // from class: lu0
                public final /* synthetic */ String m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ long o;
                public final /* synthetic */ vl1 p;
                public final /* synthetic */ Function0 q;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = s03.R(385);
                    bd3.k(this.m, this.n, this.o, this.p, this.q, (a00) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static void l(long j2, fq fqVar, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j3;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            lh.e("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((dr) arrayList4.get(i9)).c() < i8) {
                lh.e("Failed requirement.");
                return;
            }
        }
        dr drVar = (dr) arrayList.get(i3);
        dr drVar2 = (dr) arrayList4.get(i4 - 1);
        if (i8 == drVar.c()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            dr drVar3 = (dr) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            drVar = drVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (drVar.h(i8) == drVar2.h(i8)) {
            int min = Math.min(drVar.c(), drVar2.c());
            int i11 = 0;
            for (int i12 = i8; i12 < min && drVar.h(i12) == drVar2.h(i12); i12++) {
                i11++;
            }
            long j4 = (fqVar.n / 4) + j2 + 2 + i11 + 1;
            fqVar.O(-i11);
            fqVar.O(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                fqVar.O(drVar.h(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((dr) arrayList4.get(i5)).c()) {
                    fqVar.O(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    lh.g("Check failed.");
                    return;
                }
            }
            fq fqVar2 = new fq();
            fqVar.O(((int) ((fqVar2.n / 4) + j4)) * (-1));
            l(j4, fqVar2, i13, arrayList4, i5, i4, arrayList5);
            fqVar.J(fqVar2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((dr) arrayList4.get(i15 - 1)).h(i8) != ((dr) arrayList4.get(i15)).h(i8)) {
                i14++;
            }
        }
        long j5 = (fqVar.n / 4) + j2 + 2 + (i14 * 2);
        fqVar.O(i14);
        fqVar.O(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int h2 = ((dr) arrayList4.get(i16)).h(i8);
            if (i16 == i5 || h2 != ((dr) arrayList4.get(i16 - 1)).h(i8)) {
                fqVar.O(h2 & 255);
            }
        }
        fq fqVar3 = new fq();
        int i17 = i5;
        while (i17 < i4) {
            byte h3 = ((dr) arrayList4.get(i17)).h(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (h3 != ((dr) arrayList4.get(i19)).h(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((dr) arrayList4.get(i17)).c()) {
                fqVar.O(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
            } else {
                fqVar.O(((int) ((fqVar3.n / 4) + j5)) * (-1));
                arrayList3 = arrayList5;
                j3 = j5;
                i7 = i19;
                l(j3, fqVar3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j5 = j3;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        fqVar.J(fqVar3);
    }

    public static final int m(uc2 uc2Var, String str) {
        uc2Var.getClass();
        int columnCount = uc2Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(uc2Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = "`" + str + '`';
        int columnCount2 = uc2Var.getColumnCount();
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount2) {
                i3 = -1;
                break;
            }
            if (str2.equals(uc2Var.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = uc2Var.getColumnCount();
            String concat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i4 = 0; i4 < columnCount3; i4++) {
                String columnName = uc2Var.getColumnName(i4);
                if (columnName.length() >= str.length() + 2 && (tp2.h(columnName, concat, false) || (columnName.charAt(0) == '`' && tp2.h(columnName, str3, false)))) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public static final vl1 n(vl1 vl1Var, xt0 xt0Var) {
        return vl1Var.k(new rz(xt0Var));
    }

    public static void o(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[Utility.DEFAULT_STREAM_BUFFER_SIZE];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    public static final qn0 p(lb2 lb2Var, String[] strArr, Function1 function1) {
        Pair pair;
        lb2Var.getClass();
        z41 d2 = lb2Var.d();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        f03 f03Var = d2.b;
        f03Var.getClass();
        jj2 jj2Var = new jj2();
        int i2 = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = f03Var.c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                jj2Var.addAll(set);
            } else {
                jj2Var.add(str);
            }
        }
        String[] strArr3 = (String[]) qj2.a(jj2Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        while (true) {
            if (i2 >= length) {
                pair = new Pair(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i2];
            LinkedHashMap linkedHashMap2 = f03Var.f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                lh.e("There is no table with name ".concat(str2));
                pair = null;
                break;
            }
            iArr[i2] = num.intValue();
            i2++;
        }
        String[] strArr4 = (String[]) pair.m;
        int[] iArr2 = (int[]) pair.n;
        strArr4.getClass();
        iArr2.getClass();
        return new qn0(iv1.n(new x60(2, new j5(f03Var, iArr2, strArr4, (o30) null, 12)), -1), lb2Var, function1, 1);
    }

    public static final boolean q(long j2, long j3) {
        return j2 == j3;
    }

    public static final int r(int i2, mb1 mb1Var, Object obj) {
        int a2;
        return (obj == null || mb1Var.b() == 0 || (i2 < mb1Var.b() && obj.equals(mb1Var.d(i2))) || (a2 = mb1Var.a(obj)) == -1) ? i2 : a2;
    }

    public static final x01 s() {
        x01 x01Var = l;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        ah0 ah0Var = y33.a;
        nn2 nn2Var = new nn2(aw.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new xz1(9.0f, 16.17f));
        arrayList.add(new wz1(4.83f, 12.0f));
        arrayList.add(new e02(-1.42f, 1.41f));
        arrayList.add(new wz1(9.0f, 19.0f));
        arrayList.add(new wz1(21.0f, 7.0f));
        arrayList.add(new e02(-1.41f, -1.41f));
        arrayList.add(tz1.c);
        w01.a(w01Var, arrayList, nn2Var);
        x01 b2 = w01Var.b();
        l = b2;
        return b2;
    }

    public static final int t(uc2 uc2Var, String str) {
        uc2Var.getClass();
        int m2 = m(uc2Var, str);
        if (m2 >= 0) {
            return m2;
        }
        int columnCount = uc2Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(uc2Var.getColumnName(i2));
        }
        lh.f("Column '", str, "' does not exist. Available columns: [", zv.A(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static Set u() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static boolean v() {
        try {
            if (t7.S0 == null) {
                t7.S0 = Class.forName("android.os.SystemProperties");
            }
            if (t7.T0 == null) {
                Class cls = t7.S0;
                t7.T0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = t7.T0;
            Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.b(invoke instanceof Boolean ? (Boolean) invoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static String w(Class cls) {
        LinkedHashMap linkedHashMap = dr1.b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            br1 br1Var = (br1) cls.getAnnotation(br1.class);
            str = br1Var != null ? br1Var.value() : null;
            if (str == null || str.length() <= 0) {
                lh.c("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                return null;
            }
            linkedHashMap.put(cls, str);
        }
        str.getClass();
        return str;
    }

    public static final k32 x(View view) {
        k32 k32Var = (k32) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (k32Var != null) {
            return k32Var;
        }
        k32 k32Var2 = new k32();
        view.setTag(R.id.pooling_container_listener_holder_tag, k32Var2);
        return k32Var2;
    }

    public static final sg1 y(sg1 sg1Var) {
        i91 i91Var = sg1Var.A.A;
        while (true) {
            i91 u = i91Var.u();
            i91 i91Var2 = null;
            if ((u != null ? u.s : null) == null) {
                sg1 O0 = i91Var.P.d.O0();
                O0.getClass();
                return O0;
            }
            i91 u2 = i91Var.u();
            if (u2 != null) {
                i91Var2 = u2.s;
            }
            i91Var2.getClass();
            i91 u3 = i91Var.u();
            u3.getClass();
            i91Var = u3.s;
            i91Var.getClass();
        }
    }

    public static final x01 z() {
        x01 x01Var = m;
        if (x01Var != null) {
            return x01Var;
        }
        w01 w01Var = new w01("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        ah0 ah0Var = y33.a;
        nn2 nn2Var = new nn2(aw.b);
        lx0 lx0Var = new lx0(1);
        lx0Var.k(15.5f, 14.0f);
        lx0Var.h(-0.79f);
        lx0Var.j(-0.28f, -0.27f);
        lx0Var.e(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        lx0Var.e(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        lx0Var.l(3.0f, 5.91f, 3.0f, 9.5f);
        lx0Var.l(5.91f, 16.0f, 9.5f, 16.0f);
        lx0Var.f(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
        lx0Var.j(0.27f, 0.28f);
        lx0Var.p(0.79f);
        lx0Var.j(5.0f, 4.99f);
        lx0Var.i(20.49f, 19.0f);
        lx0Var.j(-4.99f, -5.0f);
        lx0Var.d();
        lx0Var.k(9.5f, 14.0f);
        lx0Var.e(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        lx0Var.l(7.01f, 5.0f, 9.5f, 5.0f);
        lx0Var.l(14.0f, 7.01f, 14.0f, 9.5f);
        lx0Var.l(11.99f, 14.0f, 9.5f, 14.0f);
        lx0Var.d();
        w01.a(w01Var, lx0Var.m, nn2Var);
        x01 b2 = w01Var.b();
        m = b2;
        return b2;
    }
}
