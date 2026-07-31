package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.explorestack.protobuf.openrtb.LossReason;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.87, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass87 extends AbstractC3422kH {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public XS A00;
    public final Uri A01;
    public final C2482Ng A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<C2475My> A052 = A05();
        ArrayList arrayList = new ArrayList();
        if (A052 != null) {
            Iterator<C2475My> it = A052.iterator();
            while (it.hasNext()) {
                Intent A00 = A00(it.next());
                if (A00 != null) {
                    arrayList.add(A00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, 16, 17, 85, 1, 26, 85, 26, 5, 16, 27, 85, 24, 20, 7, 30, 16, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, 13, 27, 6, 0, 13, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, 61, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, 13, 0, 74, 13, 10, 16, 1, 10, 16, 74, 5, 7, 16, 13, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 65, 77, 94, 71, 73, 88, 22, 3, 3, 72, 73, 88, 77, 69, 64, 95, 19, 69, 72, 17, 9, 95, 27, 4, 17, 26, 17, 16, 43, 16, 17, 17, 4, 24, 29, 26, 31, 125, 98, 119, 124, 119, 118, 77, 97, 102, 125, 96, 119, 77, 116, 115, 126, 126, 112, 115, 113, 121, 77, 103, 96, 126, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 100, 117, 102, 103, 125, 122, 115, 81, 86, 77, 80, 71, 125, 75, 70, 56, 63, 36, 57, 46, 20, 62, 57, 39, 81, 86, 77, 80, 71, 125, 87, 80, 78, 125, 85, 71, 64, 125, 68, 67, 78, 78, 64, 67, 65, 73, 59, 42, 35, 117, 23, 6, 15, 19, 17, 12, 14, 19, 23, 89};
    }

    static {
        A07();
        A06 = AnonymousClass87.class.getSimpleName();
    }

    public AnonymousClass87(C3218gi c3218gi, VA va, String str, Uri uri, Map<String, String> extraData, N0 n0, boolean z, C2482Ng c2482Ng) {
        super(c3218gi, va, str, n0, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c2482Ng;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Intent A00(C2475My c2475My) {
        if (TextUtils.isEmpty(c2475My.A05())) {
            return null;
        }
        String A03 = c2475My.A03();
        C3218gi c3218gi = ((AbstractC2470Mt) this).A01;
        String appLinkUri = c2475My.A05();
        if (!AbstractC2734Xi.A04(c3218gi, appLinkUri)) {
            C3218gi c3218gi2 = ((AbstractC2470Mt) this).A01;
            if (A05[6].charAt(8) != 'P') {
                throw new RuntimeException();
            }
            A05[5] = "ldjYBpnAKJ5YKanQesg35Gt0OkPWSzAG";
            if (!A09(c3218gi2, A03)) {
                return null;
            }
        }
        if (!TextUtils.isEmpty(A03)) {
            String appLinkUri2 = A04(POBCommonConstants.DEFAULT_MIN_BITRATE, 4, 102);
            if (!A03.startsWith(appLinkUri2)) {
                String appLinkUri3 = A04(254, 10, 74);
            }
            return new Intent(A04(62, 26, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE), XB.A00(A03));
        }
        PackageManager packageManager = ((AbstractC2470Mt) this).A01.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        String appLinkUri4 = c2475My.A04();
        if (TextUtils.isEmpty(appLinkUri4)) {
            boolean isEmpty = TextUtils.isEmpty(A03);
            String[] strArr = A05;
            String str = strArr[7];
            String appLinkUri5 = strArr[1];
            if (str.length() == appLinkUri5.length()) {
                throw new RuntimeException();
            }
            A05[2] = "P0UyeT8Oj9P4H3GWuZ6UwWdLOtPXQiGU";
            if (isEmpty) {
                String appLinkUri6 = c2475My.A05();
                return packageManager.getLaunchIntentForPackage(appLinkUri6);
            }
        }
        Intent A01 = A01(c2475My);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(A01, 65536);
        if (A01.getComponent() == null) {
            Iterator<ResolveInfo> it = queryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                String str2 = next.activityInfo.packageName;
                String A052 = c2475My.A05();
                if (A05[0].charAt(20) != '5') {
                    throw new RuntimeException();
                }
                A05[5] = "zQ3PtZjh8GquAUsdZUz15LBCi8uwCZq5";
                if (str2.equals(A052)) {
                    A01.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    break;
                }
            }
        }
        if (queryIntentActivities.isEmpty() || A01.getComponent() == null) {
            if (!A09(((AbstractC2470Mt) this).A01, A03)) {
                return null;
            }
            String appLinkUri7 = c2475My.A05();
            A01.setPackage(appLinkUri7);
        }
        return A01;
    }

    private Intent A01(C2475My c2475My) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(c2475My.A05()) && !TextUtils.isEmpty(c2475My.A04())) {
            intent.setComponent(new ComponentName(c2475My.A05(), c2475My.A04()));
        }
        if (!TextUtils.isEmpty(c2475My.A03())) {
            intent.setData(XB.A00(c2475My.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 9, 98));
        if (!TextUtils.isEmpty(queryParameter)) {
            return XB.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 8, 11);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(126, 22, 5);
        return XB.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC2467Mq A03() throws C2720Ws {
        X6 x6 = new X6();
        try {
            return X6.A06(x6, ((AbstractC2470Mt) this).A01, A02(), ((AbstractC2470Mt) this).A03, this.A03);
        } catch (C2720Ws unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(228, 22, 11));
            if (queryParameter != null && queryParameter.length() > 0) {
                X6.A0E(x6, ((AbstractC2470Mt) this).A01, XB.A00(queryParameter), ((AbstractC2470Mt) this).A03);
            }
            return EnumC2467Mq.A09;
        }
    }

    private List<C2475My> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray optJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C2475My A00 = C2475My.A00(optJSONArray.optJSONObject(i));
                    if (A00 != null) {
                        arrayList.add(A00);
                    }
                }
            }
        } catch (JSONException e) {
            InterfaceC2629Tc A08 = ((AbstractC2470Mt) this).A01.A08();
            int i2 = AbstractC2630Td.A24;
            C2631Te c2631Te = new C2631Te(e);
            String appsiteDataString3 = A04(204, 7, 61);
            A08.ABC(appsiteDataString3, i2, c2631Te);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            if (C2722Wu.A0D(((AbstractC2470Mt) this).A01, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A09(C3218gi c3218gi, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C2668Up.A29(c3218gi);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3422kH
    public final EnumC2467Mq A0H() {
        EnumC2467Mq enumC2467Mq = EnumC2467Mq.A09;
        if (((AbstractC3422kH) this).A03) {
            enumC2467Mq = A0M();
        } else {
            this.A03.put(A04(188, 16, 61), String.valueOf(true));
        }
        Map<String, String> map = this.A03;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        A0J(map, enumC2467Mq);
        C2482Ng.A06(this.A02, ((AbstractC2470Mt) this).A01);
        return enumC2467Mq;
    }

    public final EnumC2467Mq A0M() {
        EnumC2467Mq enumC2467Mq = EnumC2467Mq.A09;
        String A042 = A04(148, 15, 93);
        boolean A0K = A0K(this.A01);
        if (!A0K) {
            A0K = A08();
        }
        if (!A0K) {
            try {
                enumC2467Mq = A03();
                if (enumC2467Mq != EnumC2467Mq.A09) {
                    A042 = A04(188, 16, 61);
                } else {
                    A042 = A04(163, 25, 59);
                }
            } catch (Exception unused) {
                enumC2467Mq = EnumC2467Mq.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(A042, redirectionAction);
        return enumC2467Mq;
    }

    public final void A0N(XS xs) {
        this.A00 = xs;
    }
}
