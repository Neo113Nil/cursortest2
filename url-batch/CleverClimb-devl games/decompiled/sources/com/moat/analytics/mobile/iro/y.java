package com.moat.analytics.mobile.iro;

import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class y {

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private static int f1256 = 0;

    /* renamed from: ˏॱ, reason: contains not printable characters */
    private static int f1257 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Location f1258;

    /* renamed from: ʽ, reason: contains not printable characters */
    private JSONObject f1260;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Rect f1262;

    /* renamed from: ˏ, reason: contains not printable characters */
    private JSONObject f1264;

    /* renamed from: ॱ, reason: contains not printable characters */
    private Rect f1265;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private JSONObject f1266;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Map<String, Object> f1259 = new HashMap();

    /* renamed from: ˎ, reason: contains not printable characters */
    String f1263 = "{}";

    /* renamed from: ˊ, reason: contains not printable characters */
    private a f1261 = new a();

    static class a {

        /* renamed from: ˊ, reason: contains not printable characters */
        Rect f1267 = new Rect(0, 0, 0, 0);

        /* renamed from: ˋ, reason: contains not printable characters */
        double f1268 = 0.0d;

        /* renamed from: ˎ, reason: contains not printable characters */
        double f1269 = 0.0d;

        a() {
        }
    }

    static class b {

        /* renamed from: ˊ, reason: contains not printable characters */
        final View f1270;

        /* renamed from: ˋ, reason: contains not printable characters */
        final boolean f1271;

        /* renamed from: ॱ, reason: contains not printable characters */
        final int f1272;

        b(View view, int i, boolean z) {
            this.f1270 = view;
            this.f1272 = i;
            this.f1271 = z;
        }
    }

    y() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
    
        if (r4 == true) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x021c, code lost:
    
        if (r11 != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021e, code lost:
    
        r4 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0226, code lost:
    
        if (r4 == '[') goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0228, code lost:
    
        r4 = com.moat.analytics.mobile.iro.y.f1257 + 17;
        com.moat.analytics.mobile.iro.y.f1256 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0233, code lost:
    
        if (r15 <= 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0235, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0238, code lost:
    
        if (r4 == true) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023a, code lost:
    
        r4 = com.moat.analytics.mobile.iro.y.f1257 + 121;
        com.moat.analytics.mobile.iro.y.f1256 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0244, code lost:
    
        r4 = new android.graphics.Rect(0, 0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024e, code lost:
    
        if (r20.getGlobalVisibleRect(r4) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0250, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0253, code lost:
    
        if (r6 == true) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x025f, code lost:
    
        r6 = r4.width() * r4.height();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0261, code lost:
    
        if (r6 >= r15) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0263, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0266, code lost:
    
        if (r11 == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0269, code lost:
    
        r11 = com.moat.analytics.mobile.iro.y.f1257 + 39;
        com.moat.analytics.mobile.iro.y.f1256 = r11 % 128;
        r11 = r11 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0273, code lost:
    
        com.moat.analytics.mobile.iro.b.m1183("VisibilityInfo", null, "Ad is clipped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x027a, code lost:
    
        r11 = new java.util.HashSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0285, code lost:
    
        if ((r20.getRootView() instanceof android.view.ViewGroup) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0287, code lost:
    
        r13 = ')';
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x028e, code lost:
    
        if (r13 == ')') goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0291, code lost:
    
        r5 = com.moat.analytics.mobile.iro.y.f1256 + 49;
        com.moat.analytics.mobile.iro.y.f1257 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x029b, code lost:
    
        r12.f1267 = r4;
        r0 = m1340(r4, r20, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a1, code lost:
    
        if (r0 == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a3, code lost:
    
        r5 = 'Y';
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02aa, code lost:
    
        if (r5 == '\\') goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02ac, code lost:
    
        r12.f1269 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b0, code lost:
    
        if (r0 != false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b2, code lost:
    
        r0 = 21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b9, code lost:
    
        if (r0 == 21) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02bc, code lost:
    
        r0 = m1336(r4, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02c0, code lost:
    
        if (r0 <= 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c2, code lost:
    
        r4 = ']';
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02ca, code lost:
    
        if (r4 == ']') goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        r4 = com.moat.analytics.mobile.iro.y.f1256 + 87;
        com.moat.analytics.mobile.iro.y.f1257 = r4 % 128;
        r4 = r4 % 2;
        r4 = r0;
        r7 = r6;
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02e0, code lost:
    
        r12.f1269 = r4 / r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e2, code lost:
    
        r4 = r6 - r0;
        r6 = r15;
        java.lang.Double.isNaN(r4);
        java.lang.Double.isNaN(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02ec, code lost:
    
        r12.f1268 = r4 / r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02c7, code lost:
    
        r4 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02b5, code lost:
    
        r0 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02a6, code lost:
    
        r5 = '\\';
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x028a, code lost:
    
        r13 = 'T';
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0265, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0252, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0237, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0223, code lost:
    
        r4 = '[';
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0219, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0213, code lost:
    
        if ((r4 ? 'H' : 'Z') != 'Z') goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x03c8, code lost:
    
        if (r9.equals(r18.f1262) != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x03a4, code lost:
    
        if (r14.equals(r18.f1265) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x012d, code lost:
    
        if ((!r20.isShown() ? 'W' : '4') != '4') goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00dd, code lost:
    
        if ((r20.isAttachedToWindow() ? '!' : '2') != '!') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
    
        if ((r20.getWindowToken() != null ? 'B' : '&') != '&') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0207, code lost:
    
        if ((!r4) != true) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0215, code lost:
    
        if (r13 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0217, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:240:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03c2 A[Catch: Exception -> 0x04f5, TryCatch #0 {Exception -> 0x04f5, blocks: (B:7:0x0022, B:14:0x003a, B:22:0x0054, B:28:0x007c, B:29:0x0099, B:37:0x00b1, B:54:0x0112, B:65:0x014d, B:70:0x0182, B:75:0x0195, B:80:0x01a8, B:84:0x01c8, B:85:0x01d2, B:110:0x0244, B:115:0x0257, B:121:0x0273, B:122:0x027a, B:128:0x029b, B:133:0x02ac, B:139:0x02bc, B:145:0x02e0, B:147:0x02ec, B:164:0x02ee, B:169:0x0355, B:170:0x036b, B:178:0x0395, B:181:0x03b8, B:186:0x03ca, B:187:0x03dc, B:193:0x03f2, B:196:0x040e, B:201:0x042d, B:207:0x0443, B:213:0x04eb, B:235:0x04e8, B:236:0x04e3, B:238:0x0496, B:243:0x03fb, B:250:0x040b, B:252:0x03c2, B:255:0x039e, B:258:0x03a6, B:265:0x0310, B:270:0x0333, B:275:0x0348, B:281:0x0320, B:291:0x01cd, B:299:0x0149, B:302:0x0120, B:311:0x00e8, B:327:0x00d0, B:336:0x0068, B:345:0x008d), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x01cd A[Catch: Exception -> 0x04f5, TryCatch #0 {Exception -> 0x04f5, blocks: (B:7:0x0022, B:14:0x003a, B:22:0x0054, B:28:0x007c, B:29:0x0099, B:37:0x00b1, B:54:0x0112, B:65:0x014d, B:70:0x0182, B:75:0x0195, B:80:0x01a8, B:84:0x01c8, B:85:0x01d2, B:110:0x0244, B:115:0x0257, B:121:0x0273, B:122:0x027a, B:128:0x029b, B:133:0x02ac, B:139:0x02bc, B:145:0x02e0, B:147:0x02ec, B:164:0x02ee, B:169:0x0355, B:170:0x036b, B:178:0x0395, B:181:0x03b8, B:186:0x03ca, B:187:0x03dc, B:193:0x03f2, B:196:0x040e, B:201:0x042d, B:207:0x0443, B:213:0x04eb, B:235:0x04e8, B:236:0x04e3, B:238:0x0496, B:243:0x03fb, B:250:0x040b, B:252:0x03c2, B:255:0x039e, B:258:0x03a6, B:265:0x0310, B:270:0x0333, B:275:0x0348, B:281:0x0320, B:291:0x01cd, B:299:0x0149, B:302:0x0120, B:311:0x00e8, B:327:0x00d0, B:336:0x0068, B:345:0x008d), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0149 A[Catch: Exception -> 0x04f5, TRY_ENTER, TryCatch #0 {Exception -> 0x04f5, blocks: (B:7:0x0022, B:14:0x003a, B:22:0x0054, B:28:0x007c, B:29:0x0099, B:37:0x00b1, B:54:0x0112, B:65:0x014d, B:70:0x0182, B:75:0x0195, B:80:0x01a8, B:84:0x01c8, B:85:0x01d2, B:110:0x0244, B:115:0x0257, B:121:0x0273, B:122:0x027a, B:128:0x029b, B:133:0x02ac, B:139:0x02bc, B:145:0x02e0, B:147:0x02ec, B:164:0x02ee, B:169:0x0355, B:170:0x036b, B:178:0x0395, B:181:0x03b8, B:186:0x03ca, B:187:0x03dc, B:193:0x03f2, B:196:0x040e, B:201:0x042d, B:207:0x0443, B:213:0x04eb, B:235:0x04e8, B:236:0x04e3, B:238:0x0496, B:243:0x03fb, B:250:0x040b, B:252:0x03c2, B:255:0x039e, B:258:0x03a6, B:265:0x0310, B:270:0x0333, B:275:0x0348, B:281:0x0320, B:291:0x01cd, B:299:0x0149, B:302:0x0120, B:311:0x00e8, B:327:0x00d0, B:336:0x0068, B:345:0x008d), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00e8 A[Catch: Exception -> 0x04f5, TRY_LEAVE, TryCatch #0 {Exception -> 0x04f5, blocks: (B:7:0x0022, B:14:0x003a, B:22:0x0054, B:28:0x007c, B:29:0x0099, B:37:0x00b1, B:54:0x0112, B:65:0x014d, B:70:0x0182, B:75:0x0195, B:80:0x01a8, B:84:0x01c8, B:85:0x01d2, B:110:0x0244, B:115:0x0257, B:121:0x0273, B:122:0x027a, B:128:0x029b, B:133:0x02ac, B:139:0x02bc, B:145:0x02e0, B:147:0x02ec, B:164:0x02ee, B:169:0x0355, B:170:0x036b, B:178:0x0395, B:181:0x03b8, B:186:0x03ca, B:187:0x03dc, B:193:0x03f2, B:196:0x040e, B:201:0x042d, B:207:0x0443, B:213:0x04eb, B:235:0x04e8, B:236:0x04e3, B:238:0x0496, B:243:0x03fb, B:250:0x040b, B:252:0x03c2, B:255:0x039e, B:258:0x03a6, B:265:0x0310, B:270:0x0333, B:275:0x0348, B:281:0x0320, B:291:0x01cd, B:299:0x0149, B:302:0x0120, B:311:0x00e8, B:327:0x00d0, B:336:0x0068, B:345:0x008d), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c8 A[Catch: Exception -> 0x04f5, TryCatch #0 {Exception -> 0x04f5, blocks: (B:7:0x0022, B:14:0x003a, B:22:0x0054, B:28:0x007c, B:29:0x0099, B:37:0x00b1, B:54:0x0112, B:65:0x014d, B:70:0x0182, B:75:0x0195, B:80:0x01a8, B:84:0x01c8, B:85:0x01d2, B:110:0x0244, B:115:0x0257, B:121:0x0273, B:122:0x027a, B:128:0x029b, B:133:0x02ac, B:139:0x02bc, B:145:0x02e0, B:147:0x02ec, B:164:0x02ee, B:169:0x0355, B:170:0x036b, B:178:0x0395, B:181:0x03b8, B:186:0x03ca, B:187:0x03dc, B:193:0x03f2, B:196:0x040e, B:201:0x042d, B:207:0x0443, B:213:0x04eb, B:235:0x04e8, B:236:0x04e3, B:238:0x0496, B:243:0x03fb, B:250:0x040b, B:252:0x03c2, B:255:0x039e, B:258:0x03a6, B:265:0x0310, B:270:0x0333, B:275:0x0348, B:281:0x0320, B:291:0x01cd, B:299:0x0149, B:302:0x0120, B:311:0x00e8, B:327:0x00d0, B:336:0x0068, B:345:0x008d), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f1  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m1343(String str, View view) {
        DisplayMetrics displayMetrics;
        boolean z;
        boolean z2;
        boolean z3;
        float m1335;
        int i;
        char c2;
        boolean z4;
        Location m1284;
        HashMap hashMap;
        JSONObject jSONObject;
        char c3;
        char c4;
        Activity activity;
        HashMap hashMap2 = new HashMap();
        String str2 = "{}";
        if ((view != null ? 'N' : (char) 0) != 'N') {
            return;
        }
        int i2 = f1257 + 31;
        f1256 = i2 % 128;
        int i3 = i2 % 2;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (!(Build.VERSION.SDK_INT < 17)) {
            int i4 = f1256 + 93;
            f1257 = i4 % 128;
            int i5 = i4 % 2;
            if (!(com.moat.analytics.mobile.iro.a.f1067 == null)) {
                int i6 = f1257 + 85;
                f1256 = i6 % 128;
                if (!(i6 % 2 != 0)) {
                    activity = com.moat.analytics.mobile.iro.a.f1067.get();
                    if ((activity != null ? '`' : ';') != ';') {
                        displayMetrics = new DisplayMetrics();
                        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                    }
                } else {
                    activity = com.moat.analytics.mobile.iro.a.f1067.get();
                    if ((activity != null ? 'V' : '[') != 'V') {
                    }
                    displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    if ((view != null ? '\f' : '+') == '\f') {
                    }
                    z = false;
                } else {
                    if ((view != null ? (char) 25 : (char) 26) != 26) {
                    }
                    z = false;
                }
                if (view == null) {
                    if (view.hasWindowFocus()) {
                        z2 = true;
                        if (!(view == null)) {
                            int i7 = f1256 + 69;
                            f1257 = i7 % 128;
                            if ((i7 % 2 == 0 ? 'B' : '.') != 'B') {
                                z3 = (!view.isShown() ? 'E' : 'Y') == 'E';
                            }
                            if ((view != null ? '0' : '%') == '%') {
                                int i8 = f1257 + 67;
                                f1256 = i8 % 128;
                                int i9 = i8 % 2;
                                m1335 = 0.0f;
                            } else {
                                m1335 = m1335(view);
                            }
                            hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                            hashMap2.put("dv", Double.valueOf(p.m1301()));
                            hashMap2.put("adKey", str);
                            if (!z) {
                                i = 0;
                            } else {
                                int i10 = f1256 + 77;
                                f1257 = i10 % 128;
                                int i11 = i10 % 2;
                                i = 1;
                            }
                            hashMap2.put("isAttached", Integer.valueOf(i));
                            hashMap2.put("inFocus", Integer.valueOf(!z2 ? 0 : 1));
                            hashMap2.put("isHidden", Integer.valueOf(!z3 ? 0 : 1));
                            hashMap2.put("opacity", Float.valueOf(m1335));
                            Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                            Rect m1341 = view != null ? m1341(view) : new Rect(0, 0, 0, 0);
                            a aVar = new a();
                            int width = m1341.width() * m1341.height();
                            if ((view == null ? '\"' : '7') != '7') {
                                int i12 = f1256 + 45;
                                f1257 = i12 % 128;
                                if (i12 % 2 == 0) {
                                }
                                e = e;
                                o.m1290(e);
                                this.f1263 = str2;
                                return;
                            }
                            if (this.f1264 != null) {
                                int i13 = f1256 + 99;
                                f1257 = i13 % 128;
                                c2 = 'B';
                                if ((i13 % 2 == 0 ? 'B' : (char) 16) != 'B') {
                                    if (aVar.f1268 == this.f1261.f1268) {
                                        if ((!aVar.f1267.equals(this.f1261.f1267) ? (char) 24 : '*') != '*' && aVar.f1269 == this.f1261.f1269) {
                                            z4 = false;
                                            hashMap2.put("coveredPercent", Double.valueOf(aVar.f1269));
                                            if (this.f1260 == null) {
                                                int i14 = f1256 + 9;
                                                f1257 = i14 % 128;
                                                if (i14 % 2 == 0) {
                                                    c4 = 7;
                                                    c3 = 'Y';
                                                } else {
                                                    c3 = 'Y';
                                                    c4 = 'Y';
                                                }
                                                if (c4 != c3) {
                                                    if (!rect.equals(this.f1265)) {
                                                    }
                                                    if (!(this.f1266 == null)) {
                                                    }
                                                    this.f1262 = m1341;
                                                    this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                                                    z4 = true;
                                                    if (!(this.f1259 == null)) {
                                                        int i15 = f1257 + 99;
                                                        f1256 = i15 % 128;
                                                        if (i15 % 2 != 0) {
                                                            if (!hashMap2.equals(this.f1259)) {
                                                            }
                                                            m1284 = k.m1275().m1284();
                                                            if (!k.m1276(m1284, this.f1258)) {
                                                                int i16 = f1257 + 103;
                                                                f1256 = i16 % 128;
                                                                int i17 = i16 % 2;
                                                                this.f1258 = m1284;
                                                                z4 = true;
                                                            }
                                                            if (!z4) {
                                                                return;
                                                            }
                                                            int i18 = f1256 + 57;
                                                            f1257 = i18 % 128;
                                                            int i19 = i18 % 2;
                                                            JSONObject jSONObject2 = new JSONObject(this.f1259);
                                                            jSONObject2.accumulate("screen", this.f1260);
                                                            jSONObject2.accumulate(Promotion.ACTION_VIEW, this.f1266);
                                                            jSONObject2.accumulate(TJAdUnitConstants.String.VISIBLE, this.f1264);
                                                            jSONObject2.accumulate("maybe", this.f1264);
                                                            jSONObject2.accumulate("visiblePercent", Double.valueOf(this.f1261.f1268));
                                                            if (m1284 != null) {
                                                                if (m1284 != null) {
                                                                    c2 = 'X';
                                                                }
                                                                if (c2 != 'X') {
                                                                    int i20 = f1257 + 95;
                                                                    f1256 = i20 % 128;
                                                                    int i21 = i20 % 2;
                                                                    hashMap = null;
                                                                } else {
                                                                    hashMap = new HashMap();
                                                                    hashMap.put("latitude", Double.toString(m1284.getLatitude()));
                                                                    hashMap.put("longitude", Double.toString(m1284.getLongitude()));
                                                                    hashMap.put(TapjoyConstants.TJC_TIMESTAMP, Long.toString(m1284.getTime()));
                                                                    hashMap.put("horizontalAccuracy", Float.toString(m1284.getAccuracy()));
                                                                }
                                                                if (!(hashMap != null)) {
                                                                    int i22 = f1256 + 1;
                                                                    f1257 = i22 % 128;
                                                                    int i23 = i22 % 2;
                                                                    jSONObject = null;
                                                                } else {
                                                                    jSONObject = new JSONObject(hashMap);
                                                                }
                                                                jSONObject2.accumulate(GooglePlayServicesInterstitial.LOCATION_KEY, jSONObject);
                                                            }
                                                            String jSONObject3 = jSONObject2.toString();
                                                            try {
                                                                this.f1263 = jSONObject3;
                                                                return;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                str2 = jSONObject3;
                                                            }
                                                        } else {
                                                            if (!(!hashMap2.equals(this.f1259))) {
                                                                m1284 = k.m1275().m1284();
                                                                if (!k.m1276(m1284, this.f1258)) {
                                                                }
                                                                if (!z4) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    this.f1259 = hashMap2;
                                                    z4 = true;
                                                    m1284 = k.m1275().m1284();
                                                    if (!k.m1276(m1284, this.f1258)) {
                                                    }
                                                    if (!z4) {
                                                    }
                                                }
                                            }
                                            this.f1265 = rect;
                                            this.f1260 = new JSONObject(m1342(m1337(rect, displayMetrics)));
                                            z4 = true;
                                            if (!(this.f1266 == null)) {
                                            }
                                            this.f1262 = m1341;
                                            this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                                            z4 = true;
                                            if (!(this.f1259 == null)) {
                                            }
                                            this.f1259 = hashMap2;
                                            z4 = true;
                                            m1284 = k.m1275().m1284();
                                            if (!k.m1276(m1284, this.f1258)) {
                                            }
                                            if (!z4) {
                                            }
                                        }
                                    }
                                } else {
                                    if ((aVar.f1268 == this.f1261.f1268 ? 'R' : (char) 3) != 'R') {
                                    }
                                    if ((!aVar.f1267.equals(this.f1261.f1267) ? (char) 24 : '*') != '*') {
                                        z4 = false;
                                        hashMap2.put("coveredPercent", Double.valueOf(aVar.f1269));
                                        if (this.f1260 == null) {
                                        }
                                        this.f1265 = rect;
                                        this.f1260 = new JSONObject(m1342(m1337(rect, displayMetrics)));
                                        z4 = true;
                                        if (!(this.f1266 == null)) {
                                        }
                                        this.f1262 = m1341;
                                        this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                                        z4 = true;
                                        if (!(this.f1259 == null)) {
                                        }
                                        this.f1259 = hashMap2;
                                        z4 = true;
                                        m1284 = k.m1275().m1284();
                                        if (!k.m1276(m1284, this.f1258)) {
                                        }
                                        if (!z4) {
                                        }
                                    }
                                }
                                e = e;
                                o.m1290(e);
                                this.f1263 = str2;
                                return;
                            }
                            c2 = 'B';
                            this.f1261 = aVar;
                            this.f1264 = new JSONObject(m1342(m1337(this.f1261.f1267, displayMetrics)));
                            z4 = true;
                            hashMap2.put("coveredPercent", Double.valueOf(aVar.f1269));
                            if (this.f1260 == null) {
                            }
                            this.f1265 = rect;
                            this.f1260 = new JSONObject(m1342(m1337(rect, displayMetrics)));
                            z4 = true;
                            if (!(this.f1266 == null)) {
                            }
                            this.f1262 = m1341;
                            this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                            z4 = true;
                            if (!(this.f1259 == null)) {
                            }
                            this.f1259 = hashMap2;
                            z4 = true;
                            m1284 = k.m1275().m1284();
                            if (!k.m1276(m1284, this.f1258)) {
                            }
                            if (!z4) {
                            }
                        }
                        if ((view != null ? '0' : '%') == '%') {
                        }
                        hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                        hashMap2.put("dv", Double.valueOf(p.m1301()));
                        hashMap2.put("adKey", str);
                        if (!z) {
                        }
                        hashMap2.put("isAttached", Integer.valueOf(i));
                        hashMap2.put("inFocus", Integer.valueOf(!z2 ? 0 : 1));
                        hashMap2.put("isHidden", Integer.valueOf(!z3 ? 0 : 1));
                        hashMap2.put("opacity", Float.valueOf(m1335));
                        Rect rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                        if (view != null) {
                        }
                        a aVar2 = new a();
                        int width2 = m1341.width() * m1341.height();
                        if ((view == null ? '\"' : '7') != '7') {
                        }
                        if (this.f1264 != null) {
                        }
                        this.f1261 = aVar2;
                        this.f1264 = new JSONObject(m1342(m1337(this.f1261.f1267, displayMetrics)));
                        z4 = true;
                        hashMap2.put("coveredPercent", Double.valueOf(aVar2.f1269));
                        if (this.f1260 == null) {
                        }
                        this.f1265 = rect2;
                        this.f1260 = new JSONObject(m1342(m1337(rect2, displayMetrics)));
                        z4 = true;
                        if (!(this.f1266 == null)) {
                        }
                        this.f1262 = m1341;
                        this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                        z4 = true;
                        if (!(this.f1259 == null)) {
                        }
                        this.f1259 = hashMap2;
                        z4 = true;
                        m1284 = k.m1275().m1284();
                        if (!k.m1276(m1284, this.f1258)) {
                        }
                        if (!z4) {
                        }
                    }
                }
                z2 = false;
                if (!(view == null)) {
                }
                if ((view != null ? '0' : '%') == '%') {
                }
                hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                hashMap2.put("dv", Double.valueOf(p.m1301()));
                hashMap2.put("adKey", str);
                if (!z) {
                }
                hashMap2.put("isAttached", Integer.valueOf(i));
                hashMap2.put("inFocus", Integer.valueOf(!z2 ? 0 : 1));
                hashMap2.put("isHidden", Integer.valueOf(!z3 ? 0 : 1));
                hashMap2.put("opacity", Float.valueOf(m1335));
                Rect rect22 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                if (view != null) {
                }
                a aVar22 = new a();
                int width22 = m1341.width() * m1341.height();
                if ((view == null ? '\"' : '7') != '7') {
                }
                if (this.f1264 != null) {
                }
                this.f1261 = aVar22;
                this.f1264 = new JSONObject(m1342(m1337(this.f1261.f1267, displayMetrics)));
                z4 = true;
                hashMap2.put("coveredPercent", Double.valueOf(aVar22.f1269));
                if (this.f1260 == null) {
                }
                this.f1265 = rect22;
                this.f1260 = new JSONObject(m1342(m1337(rect22, displayMetrics)));
                z4 = true;
                if (!(this.f1266 == null)) {
                }
                this.f1262 = m1341;
                this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
                z4 = true;
                if (!(this.f1259 == null)) {
                }
                this.f1259 = hashMap2;
                z4 = true;
                m1284 = k.m1275().m1284();
                if (!k.m1276(m1284, this.f1258)) {
                }
                if (!z4) {
                }
            }
        }
        displayMetrics = view.getContext().getResources().getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 19) {
        }
        if (view == null) {
        }
        z2 = false;
        if (!(view == null)) {
        }
        if ((view != null ? '0' : '%') == '%') {
        }
        hashMap2.put("dr", Float.valueOf(displayMetrics.density));
        hashMap2.put("dv", Double.valueOf(p.m1301()));
        hashMap2.put("adKey", str);
        if (!z) {
        }
        hashMap2.put("isAttached", Integer.valueOf(i));
        hashMap2.put("inFocus", Integer.valueOf(!z2 ? 0 : 1));
        hashMap2.put("isHidden", Integer.valueOf(!z3 ? 0 : 1));
        hashMap2.put("opacity", Float.valueOf(m1335));
        Rect rect222 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        if (view != null) {
        }
        a aVar222 = new a();
        int width222 = m1341.width() * m1341.height();
        if ((view == null ? '\"' : '7') != '7') {
        }
        if (this.f1264 != null) {
        }
        this.f1261 = aVar222;
        this.f1264 = new JSONObject(m1342(m1337(this.f1261.f1267, displayMetrics)));
        z4 = true;
        hashMap2.put("coveredPercent", Double.valueOf(aVar222.f1269));
        if (this.f1260 == null) {
        }
        this.f1265 = rect222;
        this.f1260 = new JSONObject(m1342(m1337(rect222, displayMetrics)));
        z4 = true;
        if (!(this.f1266 == null)) {
        }
        this.f1262 = m1341;
        this.f1266 = new JSONObject(m1342(m1337(m1341, displayMetrics)));
        z4 = true;
        if (!(this.f1259 == null)) {
        }
        this.f1259 = hashMap2;
        z4 = true;
        m1284 = k.m1275().m1284();
        if (!k.m1276(m1284, this.f1258)) {
        }
        if (!z4) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static float m1335(View view) {
        float alpha = view.getAlpha();
        while (true) {
            if ((view != null ? 'S' : 'c') != 'S') {
                break;
            }
            if ((view.getParent() != null ? '\r' : (char) 18) != 18) {
                if ((((double) alpha) != 0.0d ? 'D' : (char) 5) == 5) {
                    break;
                }
                int i = f1256 + 121;
                f1257 = i % 128;
                int i2 = i % 2;
                if ((view.getParent() instanceof View ? 'H' : (char) 1) != 'H') {
                    break;
                }
                int i3 = f1256 + 117;
                f1257 = i3 % 128;
                int i4 = i3 % 2;
                alpha *= ((View) view.getParent()).getAlpha();
                view = (View) view.getParent();
            } else {
                break;
            }
        }
        return alpha;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static Rect m1338(View view) {
        return (view != null ? '\n' : 'Z') != 'Z' ? m1341(view) : new Rect(0, 0, 0, 0);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static void m1339(ArrayDeque<b> arrayDeque, b bVar, boolean z) {
        if ((bVar.f1270 instanceof ViewGroup ? '?' : '/') != '/') {
            int i = f1257 + 107;
            f1256 = i % 128;
            int i2 = i % 2;
            if (!(!(bVar.f1270 instanceof ListView))) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) bVar.f1270;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                arrayDeque.add(new b(viewGroup.getChildAt(childCount), bVar.f1272 + 1, z));
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static int m1336(Rect rect, Set<Rect> set) {
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: com.moat.analytics.mobile.iro.y.2
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(Rect rect2, Rect rect3) {
                return Integer.valueOf(rect2.top).compareTo(Integer.valueOf(rect3.top));
            }
        });
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!(it.hasNext())) {
                break;
            }
            int i = f1256 + 101;
            f1257 = i % 128;
            int i2 = i % 2;
            Rect rect2 = (Rect) it.next();
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= arrayList2.size() - 1) {
                return i4;
            }
            int i5 = f1257 + 99;
            f1256 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i3 + 1;
            if ((!((Integer) arrayList2.get(i3)).equals(arrayList2.get(i7)) ? 'a' : '1') != '1') {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i3)).intValue(), rect.top, ((Integer) arrayList2.get(i7)).intValue(), rect.bottom);
                int i8 = rect.top;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if ((it2.hasNext() ? '^' : (char) 17) != 17) {
                        Rect rect4 = (Rect) it2.next();
                        if (Rect.intersects(rect4, rect3)) {
                            if ((rect4.bottom > i8 ? (char) 3 : '/') == 3) {
                                i4 += rect3.width() * (rect4.bottom - Math.max(i8, rect4.top));
                                i8 = rect4.bottom;
                            }
                            if (rect4.bottom != rect3.bottom) {
                            }
                        }
                    }
                }
            }
            i3 = i7;
        }
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static Map<String, String> m1342(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put("h", String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Rect m1337(Rect rect, DisplayMetrics displayMetrics) {
        float f = displayMetrics.density;
        if (!(f != 0.0f)) {
            return rect;
        }
        return new Rect(Math.round(rect.left / f), Math.round(rect.top / f), Math.round(rect.right / f), Math.round(rect.bottom / f));
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    private static Rect m1341(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0296, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 19) != true) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x01fc, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 21) != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x01af, code lost:
    
        if ((((double) r15.getAlpha()) > 0.0d ? '>' : 'D') != '>') goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00d0, code lost:
    
        if ((!r3.isEmpty()) != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f4 A[Catch: Exception -> 0x0366, TRY_LEAVE, TryCatch #0 {Exception -> 0x0366, blocks: (B:3:0x0005, B:4:0x000c, B:14:0x0035, B:28:0x00ba, B:33:0x00d2, B:34:0x00ec, B:45:0x0116, B:50:0x012f, B:55:0x0254, B:63:0x027f, B:71:0x0298, B:80:0x02ba, B:86:0x02cd, B:91:0x02e8, B:93:0x02f4, B:112:0x028d, B:120:0x013a, B:124:0x0147, B:125:0x0151, B:129:0x015a, B:130:0x0161, B:140:0x018c, B:159:0x01e7, B:165:0x01fe, B:169:0x01f5, B:175:0x020e, B:184:0x022b, B:190:0x023f, B:201:0x019d, B:216:0x0357, B:227:0x00c7, B:236:0x0041, B:247:0x006e, B:255:0x008f, B:257:0x0093, B:258:0x0097), top: B:2:0x0005 }] */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m1340(Rect rect, View view, Set<Rect> set) {
        ArrayList arrayList;
        boolean z;
        Rect m1341;
        char c2;
        char c3;
        char c4;
        char c5;
        try {
            arrayList = new ArrayList();
            View view2 = view;
            int i = 0;
            while (true) {
                if ((view2.getParent() == null ? ':' : (char) 30) == ':') {
                    int i2 = f1257 + 9;
                    f1256 = i2 % 128;
                    if (i2 % 2 == 0) {
                        if (!(view2 == view.getRootView())) {
                            break;
                        }
                    } else {
                        if (!(view2 == view.getRootView())) {
                            break;
                        }
                    }
                }
                i++;
                if ((i > 50 ? 'a' : ']') == ']') {
                    arrayList.add(0, view2);
                    if ((view2.getParent() instanceof View ? '\'' : '\r') == '\r') {
                        break;
                    }
                    int i3 = f1257 + 67;
                    f1256 = i3 % 128;
                    view2 = (View) (i3 % 2 == 0 ? view2.getParent() : view2.getParent());
                } else {
                    int i4 = f1257 + 115;
                    f1256 = i4 % 128;
                    if (i4 % 2 != 0) {
                    }
                    arrayList = null;
                }
            }
        } catch (Exception e) {
            o.m1290(e);
        }
        if ((arrayList != null ? '\t' : 'M') != 'M') {
            int i5 = f1256 + 81;
            f1257 = i5 % 128;
            if ((i5 % 2 == 0 ? '^' : '%') != '%') {
                if (arrayList.isEmpty()) {
                }
                View rootView = view.getRootView();
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.add(new b(rootView, 0, true));
                com.moat.analytics.mobile.iro.b.m1183("VisibilityInfo", view, "starting covering rect search");
                int i6 = 0;
                boolean z2 = false;
                while (true) {
                    if ((!arrayDeque.isEmpty() ? '(' : '5') == '5') {
                        break;
                    }
                    int i7 = f1257 + 25;
                    f1256 = i7 % 128;
                    int i8 = i7 % 2;
                    if ((i6 < 250 ? (char) 22 : '2') != 22) {
                        break;
                    }
                    i6++;
                    b bVar = (b) arrayDeque.pollLast();
                    if ((bVar.f1270.equals(view) ? '@' : 'A') != '@') {
                        if (!(!bVar.f1271)) {
                            View view3 = arrayList.size() > bVar.f1272 ? (View) arrayList.get(bVar.f1272) : null;
                            if (!(bVar.f1270 != view3)) {
                                m1339((ArrayDeque<b>) arrayDeque, bVar, true);
                            } else {
                                View view4 = bVar.f1270;
                                if ((view4.isShown() ? (char) 16 : '/') == 16) {
                                    int i9 = f1257 + 121;
                                    f1256 = i9 % 128;
                                    if ((i9 % 2 != 0 ? (char) 18 : '\"') != '\"') {
                                        if (((double) view4.getAlpha()) <= 0.0d) {
                                        }
                                        z = true;
                                    }
                                    if ((!z ? 'T' : '$') == 'T') {
                                        int i10 = f1257 + 43;
                                        f1256 = i10 % 128;
                                        int i11 = i10 % 2;
                                        if ((z2 ? 'R' : (char) 23) != 23) {
                                            int i12 = f1257 + 9;
                                            f1256 = i12 % 128;
                                            if (i12 % 2 == 0) {
                                                if ((Build.VERSION.SDK_INT >= 21 ? 'I' : (char) 29) != 29) {
                                                    if (bVar.f1270.getElevation() < view3.getElevation()) {
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!(Build.VERSION.SDK_INT < 21)) {
                                                int i13 = f1256 + 13;
                                                f1257 = i13 % 128;
                                                if ((i13 % 2 == 0 ? (char) 26 : '\\') != '\\') {
                                                    if (bVar.f1270.getElevation() > view3.getElevation()) {
                                                    }
                                                } else {
                                                    if (bVar.f1270.getElevation() <= view3.getElevation()) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                z = false;
                                if ((!z ? 'T' : '$') == 'T') {
                                }
                            }
                        }
                        m1339((ArrayDeque<b>) arrayDeque, bVar, false);
                        if (ViewGroup.class.equals(bVar.f1270.getClass().getSuperclass())) {
                            int i14 = f1256 + 17;
                            f1257 = i14 % 128;
                            if (i14 % 2 == 0) {
                                if ((Build.VERSION.SDK_INT >= 19 ? '*' : 'I') != 'I') {
                                    if (bVar.f1270.getBackground() != null) {
                                        int i15 = f1257 + 71;
                                        f1256 = i15 % 128;
                                        if ((i15 % 2 != 0 ? (char) 11 : '%') != 11) {
                                            if (!(bVar.f1270.getBackground().getAlpha() != 0)) {
                                            }
                                        } else {
                                            if (bVar.f1270.getBackground().getAlpha() != 0) {
                                                c5 = '%';
                                                c4 = '%';
                                            } else {
                                                c4 = 'Y';
                                                c5 = '%';
                                            }
                                            if (c4 != c5) {
                                            }
                                            m1341 = m1341(bVar.f1270);
                                            if (m1341.setIntersect(rect, m1341)) {
                                                com.moat.analytics.mobile.iro.b.m1183("VisibilityInfo", bVar.f1270, "Covered by " + bVar.f1270.getClass().getSimpleName() + "-" + m1341.toString());
                                                set.add(m1341);
                                                if (m1341.contains(rect)) {
                                                    c3 = '(';
                                                    c2 = '(';
                                                } else {
                                                    c2 = 'D';
                                                    c3 = '(';
                                                }
                                                if (c2 == c3) {
                                                    int i16 = f1257 + 85;
                                                    f1256 = i16 % 128;
                                                    if ((i16 % 2 != 0 ? '$' : 'E') != 'E') {
                                                    }
                                                    return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m1341 = m1341(bVar.f1270);
                        if (m1341.setIntersect(rect, m1341)) {
                        }
                    } else {
                        int i17 = f1257 + 73;
                        f1256 = i17 % 128;
                        int i18 = i17 % 2;
                        com.moat.analytics.mobile.iro.b.m1183("VisibilityInfo", rect, "found target");
                        z2 = true;
                    }
                }
                return false;
            }
            o.m1290(e);
            return false;
        }
        return false;
    }
}
