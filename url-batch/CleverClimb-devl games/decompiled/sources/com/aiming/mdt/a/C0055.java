package com.aiming.mdt.a;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.aiming.mdt.a.C0177;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʻʼʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0055 implements ValueCallback<String> {

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static int f112 = 1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int[] f113 = {2106930014, -1186934687, 286698124, 403878209, -1385105795, -793122366, 1475417403, 45020502, 1660245596, 1230373293, -1231257367, -1641016437, 174129899, -929235665, 2093345683, 1560314137, 726197425, 1536139489};

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static int f114;

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ C0075 f115;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ String f116;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private /* synthetic */ C0177.AbstractC0178 f117;

    /* renamed from: ʽ, reason: contains not printable characters */
    private /* synthetic */ int f118;

    C0055(C0075 c0075, String str, int i, C0177.AbstractC0178 abstractC0178) {
        this.f115 = c0075;
        this.f116 = str;
        this.f118 = i;
        this.f117 = abstractC0178;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m175(int[] iArr, int i) {
        int i2 = f112 + 87;
        f114 = i2 % 128;
        int i3 = i2 % 2;
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = (int[]) f113.clone();
        int i4 = f112 + 83;
        f114 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (true) {
            if (i6 >= iArr.length) {
                break;
            }
            cArr[0] = (char) (iArr[i6] >> 16);
            cArr[1] = (char) iArr[i6];
            int i7 = i6 + 1;
            cArr[2] = (char) (iArr[i7] >> 16);
            cArr[3] = (char) iArr[i7];
            C0192.m723(cArr, iArr2, false);
            int i8 = i6 << 1;
            cArr2[i8] = cArr[0];
            cArr2[i8 + 1] = cArr[1];
            cArr2[i8 + 2] = cArr[2];
            cArr2[i8 + 3] = cArr[3];
            i6 += 2;
        }
        String str = new String(cArr2, 0, i);
        int i9 = f112 + 113;
        f114 = i9 % 128;
        if (i9 % 2 == 0) {
            return str;
        }
        Object obj = null;
        super.hashCode();
        return str;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        int i = f112 + 13;
        f114 = i % 128;
        int i2 = i % 2;
        String str2 = str;
        try {
            if ((TextUtils.isEmpty(str2)) || m175(new int[]{754854856, 1713243518}, 4).intern().equals(str2)) {
                this.f117.mo591("");
                return;
            }
            String optString = new JSONObject(str2).optJSONObject(m175(new int[]{-564159778, -1458888780, -1360285540, -1661875495}, 5).intern()).optString(m175(new int[]{1150880601, -73335917, 488400942, -1333957789, 1944942182, -751674596}, 10).intern());
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            HashMap m227 = C0075.m227();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f116);
            sb.append(this.f118);
            m227.put(sb.toString(), optString);
            HashMap m2272 = C0075.m227();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f116);
            sb2.append(this.f118);
            String str3 = (String) m2272.get(sb2.toString());
            C0031.m40(str3, Integer.toString(3), this.f116, this.f118);
            this.f117.mo591(str3);
            int i3 = f114 + 39;
            f112 = i3 % 128;
            if (!(i3 % 2 != 0)) {
            }
        } catch (Throwable unused) {
            m175(new int[]{1819825614, -1196181127, -272224123, -1201641100, 1472246330, 597245810, 1123583162, 1663043332, 1196270465, -642807907, 502071099, 1155011629, 1319379177, -115844196, -148626340, -1001945753, 443723612, 852480616, -1284123807, -174840466, 643674188, 1930763607, -239769752, 38439147}, 46).intern();
            C0044.m104();
            this.f117.mo591("");
        }
    }
}
