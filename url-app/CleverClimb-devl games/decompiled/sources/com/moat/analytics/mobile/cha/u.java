package com.moat.analytics.mobile.cha;

import android.app.Activity;
import android.graphics.Rect;
import android.location.Location;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class u {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f1033 = 0;

    /* renamed from: ˋॱ, reason: contains not printable characters */
    private static int f1034 = 1;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Location f1035;

    /* renamed from: ʽ, reason: contains not printable characters */
    private JSONObject f1036;

    /* renamed from: ˊ, reason: contains not printable characters */
    private Rect f1037;

    /* renamed from: ˊॱ, reason: contains not printable characters */
    private JSONObject f1038;

    /* renamed from: ˋ, reason: contains not printable characters */
    private JSONObject f1039;

    /* renamed from: ˎ, reason: contains not printable characters */
    private Rect f1040;

    /* renamed from: ᐝ, reason: contains not printable characters */
    private Map<String, Object> f1043 = new HashMap();

    /* renamed from: ॱ, reason: contains not printable characters */
    String f1042 = "{}";

    /* renamed from: ˏ, reason: contains not printable characters */
    private c f1041 = new c();

    static class c {

        /* renamed from: ˋ, reason: contains not printable characters */
        Rect f1050 = new Rect(0, 0, 0, 0);

        /* renamed from: ˊ, reason: contains not printable characters */
        double f1049 = 0.0d;

        /* renamed from: ॱ, reason: contains not printable characters */
        double f1051 = 0.0d;

        c() {
        }
    }

    static class a {

        /* renamed from: ˎ, reason: contains not printable characters */
        final Rect f1044;

        /* renamed from: ˏ, reason: contains not printable characters */
        final View f1045;

        a(View view, a aVar) {
            this.f1045 = view;
            if (aVar == null) {
                this.f1044 = u.m1162(view);
                return;
            }
            int i = aVar.f1044.left;
            int i2 = aVar.f1044.top;
            int left = i + view.getLeft();
            int top = i2 + view.getTop();
            this.f1044 = new Rect(left, top, view.getWidth() + left, view.getHeight() + top);
        }
    }

    u() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:196:0x03ac, code lost:
    
        if (r10.equals(r18.f1040) == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0407, code lost:
    
        if ((r2.equals(r18.f1043)) != true) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0351, code lost:
    
        if ((r9.f1049 == r18.f1041.f1049 ? '&' : 'G') != 'G') goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x00d8, code lost:
    
        if ((r20.getWindowToken() != null ? 'Z' : 20) != 'Z') goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0073, code lost:
    
        if ((r6 != null ? '<' : '0') != '0') goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c5 A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02db A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cb A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x043b A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0219 A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014b A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163 A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0213 A[Catch: Exception -> 0x04db, TryCatch #0 {Exception -> 0x04db, blocks: (B:7:0x001e, B:14:0x0037, B:23:0x0054, B:28:0x0075, B:29:0x0092, B:42:0x00bf, B:56:0x0123, B:67:0x014b, B:76:0x0163, B:77:0x0169, B:83:0x01ab, B:89:0x01cb, B:94:0x01ef, B:99:0x0213, B:100:0x021d, B:127:0x028a, B:132:0x02b4, B:136:0x02c5, B:137:0x02cd, B:142:0x02db, B:146:0x02ea, B:152:0x030d, B:154:0x0319, B:156:0x031c, B:161:0x02a2, B:172:0x0320, B:179:0x0337, B:182:0x0353, B:186:0x0364, B:190:0x0387, B:195:0x03a6, B:197:0x03c0, B:201:0x03cb, B:203:0x03e5, B:209:0x03fa, B:214:0x040c, B:220:0x042f, B:227:0x043b, B:240:0x04c7, B:241:0x04ce, B:244:0x0482, B:246:0x04d1, B:260:0x0409, B:262:0x03d3, B:264:0x03ae, B:267:0x0342, B:272:0x0371, B:275:0x0219, B:297:0x0133, B:307:0x00cd, B:319:0x00ef, B:328:0x0064, B:335:0x0086), top: B:6:0x001e }] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.HashSet, java.util.Set<android.graphics.Rect>] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void m1164(String str, View view) {
        DisplayMetrics displayMetrics;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        boolean z4;
        Location m1105;
        char c2;
        char c3;
        HashMap hashMap;
        Rect rect;
        int width;
        char c4;
        char c5;
        Activity activity;
        HashMap hashMap2 = new HashMap();
        String str2 = "{}";
        if (!(view != null)) {
            return;
        }
        int i4 = f1033 + 5;
        f1034 = i4 % 128;
        int i5 = i4 % 2;
        try {
        } catch (Exception e) {
            e = e;
        }
        if (!(Build.VERSION.SDK_INT < 17)) {
            int i6 = f1034 + 113;
            f1033 = i6 % 128;
            int i7 = i6 % 2;
            if ((com.moat.analytics.mobile.cha.c.f868 != null ? '9' : (char) 25) != 25) {
                int i8 = f1033 + 57;
                f1034 = i8 % 128;
                if (i8 % 2 == 0) {
                    activity = com.moat.analytics.mobile.cha.c.f868.get();
                    if (!(activity != null)) {
                    }
                    displayMetrics = new DisplayMetrics();
                    activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                } else {
                    activity = com.moat.analytics.mobile.cha.c.f868.get();
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    int i9 = f1033 + 51;
                    f1034 = i9 % 128;
                    int i10 = i9 % 2;
                    if (view != null) {
                        if (view.isAttachedToWindow()) {
                            int i11 = f1034 + 69;
                            f1033 = i11 % 128;
                            int i12 = i11 % 2;
                        }
                    }
                } else {
                    if ((view != null ? '9' : '\t') == '9') {
                        int i13 = f1034 + 45;
                        f1033 = i13 % 128;
                        if ((i13 % 2 != 0 ? (char) 1 : 'A') != 1) {
                            z = (view.getWindowToken() != null ? '[' : 'E') != 'E';
                        }
                    }
                }
                if ((view == null ? '6' : '%') != '%') {
                    int i14 = f1034 + 101;
                    f1033 = i14 % 128;
                    if ((i14 % 2 != 0 ? '[' : (char) 31) != '[') {
                        z2 = (view.hasWindowFocus() ? (char) 14 : (char) 16) != 16;
                    } else {
                        if (!(view.hasWindowFocus())) {
                        }
                    }
                    if ((view != null ? 'R' : (char) 4) != 4) {
                        if ((!view.isShown() ? '@' : '%') == '%') {
                            z3 = false;
                            float m1154 = view != null ? m1154(view) : 0.0f;
                            hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                            hashMap2.put("dv", Double.valueOf(r.m1131()));
                            hashMap2.put("adKey", str);
                            if ((!z ? (char) 23 : (char) 30) == 23) {
                                i = 0;
                            } else {
                                int i15 = f1034 + 89;
                                f1033 = i15 % 128;
                                if (i15 % 2 != 0) {
                                }
                                i = 1;
                            }
                            hashMap2.put("isAttached", Integer.valueOf(i));
                            if ((!z2 ? 'U' : (char) 1) == 'U') {
                                i2 = 0;
                            } else {
                                int i16 = f1033 + 19;
                                f1034 = i16 % 128;
                                int i17 = i16 % 2;
                                i2 = 1;
                            }
                            hashMap2.put("inFocus", Integer.valueOf(i2));
                            if ((!z3 ? '0' : '*') == '0') {
                                i3 = 0;
                            } else {
                                int i18 = f1034 + 27;
                                f1033 = i18 % 128;
                                if (i18 % 2 != 0) {
                                }
                                i3 = 1;
                            }
                            hashMap2.put("isHidden", Integer.valueOf(i3));
                            hashMap2.put("opacity", Float.valueOf(m1154));
                            Rect rect2 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                            Rect rect3 = (view == null ? 'X' : '9') == 'X' ? new Rect(0, 0, 0, 0) : m1162(view);
                            c cVar = new c();
                            int width2 = rect3.width() * rect3.height();
                            if ((view == null ? (char) 5 : 'J') == 5) {
                                int i19 = f1034 + 21;
                                f1033 = i19 % 128;
                                int i20 = i19 % 2;
                                if ((z ? 'C' : 'V') != 'V') {
                                    if ((z2 ? '\n' : '(') != '(') {
                                        int i21 = f1033 + 87;
                                        f1034 = i21 % 128;
                                        int i22 = i21 % 2;
                                        if ((!z3 ? ')' : 'N') != 'N') {
                                            if ((width2 > 0 ? (char) 1 : '\r') == 1) {
                                                int i23 = f1034 + 101;
                                                f1033 = i23 % 128;
                                                if ((i23 % 2 != 0 ? '&' : '9') != '&') {
                                                    rect = new Rect(0, 0, 0, 0);
                                                    if (m1159(view, rect)) {
                                                        c5 = '\t';
                                                        c4 = '\t';
                                                    } else {
                                                        c4 = '1';
                                                        c5 = '\t';
                                                    }
                                                    if (c4 != c5) {
                                                    }
                                                    width = rect.width() * rect.height();
                                                    if (width >= width2) {
                                                        com.moat.analytics.mobile.cha.a.m995("VisibilityInfo", null, "Ad is clipped");
                                                    }
                                                    if (!(!(view.getRootView() instanceof ViewGroup))) {
                                                        cVar.f1050 = rect;
                                                        b m1158 = m1158(rect, view);
                                                        if (!(m1158.f1046)) {
                                                            int m1155 = m1155(rect, (Set<Rect>) m1158.f1047);
                                                            if ((m1155 > 0 ? 'Z' : (char) 4) != 4) {
                                                                int i24 = f1034 + 35;
                                                                f1033 = i24 % 128;
                                                                int i25 = i24 % 2;
                                                                double d2 = m1155;
                                                                double d3 = width;
                                                                Double.isNaN(d2);
                                                                Double.isNaN(d3);
                                                                cVar.f1051 = d2 / d3;
                                                            }
                                                            double d4 = width - m1155;
                                                            double d5 = width2;
                                                            Double.isNaN(d4);
                                                            Double.isNaN(d5);
                                                            cVar.f1049 = d4 / d5;
                                                        } else {
                                                            cVar.f1051 = 1.0d;
                                                        }
                                                    }
                                                } else {
                                                    rect = new Rect(0, 0, 0, 0);
                                                    if (!(m1159(view, rect))) {
                                                    }
                                                    width = rect.width() * rect.height();
                                                    if (width >= width2) {
                                                    }
                                                    if (!(!(view.getRootView() instanceof ViewGroup))) {
                                                    }
                                                }
                                                e = e;
                                                o.m1110(e);
                                                this.f1042 = str2;
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.f1039 == null) {
                                int i26 = f1034 + 39;
                                f1033 = i26 % 128;
                                if (i26 % 2 != 0) {
                                    if (cVar.f1049 == this.f1041.f1049) {
                                        z4 = ((cVar.f1050.equals(this.f1041.f1050)) && cVar.f1051 == this.f1041.f1051) ? false : true;
                                    }
                                }
                                hashMap2.put("coveredPercent", Double.valueOf(cVar.f1051));
                                if (this.f1038 != null) {
                                    int i27 = f1034 + 37;
                                    f1033 = i27 % 128;
                                    int i28 = i27 % 2;
                                }
                                this.f1040 = rect2;
                                this.f1038 = new JSONObject(m1161(m1156(rect2, displayMetrics)));
                                z4 = true;
                                if ((this.f1036 != null ? (char) 18 : 'G') != 'G' || !rect3.equals(this.f1037)) {
                                    this.f1037 = rect3;
                                    this.f1036 = new JSONObject(m1161(m1156(rect3, displayMetrics)));
                                    z4 = true;
                                }
                                boolean z5 = true;
                                if (!(this.f1043 == null)) {
                                    int i29 = f1033 + 113;
                                    f1034 = i29 % 128;
                                    int i30 = i29 % 2;
                                    z5 = true;
                                }
                                this.f1043 = hashMap2;
                                z4 = true;
                                m1105 = n.m1096().m1105();
                                if ((!n.m1095(m1105, this.f1035) ? (char) 21 : ']') != ']') {
                                    int i31 = f1034 + 81;
                                    f1033 = i31 % 128;
                                    int i32 = i31 % 2;
                                    this.f1035 = m1105;
                                    z4 = true;
                                }
                                if (!z4) {
                                    return;
                                }
                                JSONObject jSONObject = new JSONObject(this.f1043);
                                jSONObject.accumulate("screen", this.f1038);
                                jSONObject.accumulate(Promotion.ACTION_VIEW, this.f1036);
                                jSONObject.accumulate(TJAdUnitConstants.String.VISIBLE, this.f1039);
                                jSONObject.accumulate("maybe", this.f1039);
                                jSONObject.accumulate("visiblePercent", Double.valueOf(this.f1041.f1049));
                                if (m1105 != null) {
                                    c3 = '>';
                                    c2 = '<';
                                } else {
                                    c2 = '<';
                                    c3 = '<';
                                }
                                if (c3 != c2) {
                                    if (m1105 != null) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        hashMap = null;
                                    } else {
                                        HashMap hashMap3 = new HashMap();
                                        hashMap3.put("latitude", Double.toString(m1105.getLatitude()));
                                        hashMap3.put("longitude", Double.toString(m1105.getLongitude()));
                                        hashMap3.put(TapjoyConstants.TJC_TIMESTAMP, Long.toString(m1105.getTime()));
                                        hashMap3.put("horizontalAccuracy", Float.toString(m1105.getAccuracy()));
                                        hashMap = hashMap3;
                                    }
                                    jSONObject.accumulate(GooglePlayServicesInterstitial.LOCATION_KEY, (hashMap == null ? (char) 14 : 'U') != 14 ? new JSONObject(hashMap) : null);
                                }
                                String jSONObject2 = jSONObject.toString();
                                try {
                                    this.f1042 = jSONObject2;
                                    return;
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = jSONObject2;
                                }
                            }
                            this.f1041 = cVar;
                            this.f1039 = new JSONObject(m1161(m1156(this.f1041.f1050, displayMetrics)));
                            hashMap2.put("coveredPercent", Double.valueOf(cVar.f1051));
                            if (this.f1038 != null) {
                            }
                            this.f1040 = rect2;
                            this.f1038 = new JSONObject(m1161(m1156(rect2, displayMetrics)));
                            z4 = true;
                            if ((this.f1036 != null ? (char) 18 : 'G') != 'G') {
                            }
                            this.f1037 = rect3;
                            this.f1036 = new JSONObject(m1161(m1156(rect3, displayMetrics)));
                            z4 = true;
                            boolean z52 = true;
                            if (!(this.f1043 == null)) {
                            }
                            this.f1043 = hashMap2;
                            z4 = true;
                            m1105 = n.m1096().m1105();
                            if ((!n.m1095(m1105, this.f1035) ? (char) 21 : ']') != ']') {
                            }
                            if (!z4) {
                            }
                        }
                    }
                    z3 = true;
                    if (view != null) {
                    }
                    hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                    hashMap2.put("dv", Double.valueOf(r.m1131()));
                    hashMap2.put("adKey", str);
                    if ((!z ? (char) 23 : (char) 30) == 23) {
                    }
                    hashMap2.put("isAttached", Integer.valueOf(i));
                    if ((!z2 ? 'U' : (char) 1) == 'U') {
                    }
                    hashMap2.put("inFocus", Integer.valueOf(i2));
                    if ((!z3 ? '0' : '*') == '0') {
                    }
                    hashMap2.put("isHidden", Integer.valueOf(i3));
                    hashMap2.put("opacity", Float.valueOf(m1154));
                    Rect rect22 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                    if ((view == null ? 'X' : '9') == 'X') {
                    }
                    c cVar2 = new c();
                    int width22 = rect3.width() * rect3.height();
                    if ((view == null ? (char) 5 : 'J') == 5) {
                    }
                    if (this.f1039 == null) {
                    }
                    this.f1041 = cVar2;
                    this.f1039 = new JSONObject(m1161(m1156(this.f1041.f1050, displayMetrics)));
                    hashMap2.put("coveredPercent", Double.valueOf(cVar2.f1051));
                    if (this.f1038 != null) {
                    }
                    this.f1040 = rect22;
                    this.f1038 = new JSONObject(m1161(m1156(rect22, displayMetrics)));
                    z4 = true;
                    if ((this.f1036 != null ? (char) 18 : 'G') != 'G') {
                    }
                    this.f1037 = rect3;
                    this.f1036 = new JSONObject(m1161(m1156(rect3, displayMetrics)));
                    z4 = true;
                    boolean z522 = true;
                    if (!(this.f1043 == null)) {
                    }
                    this.f1043 = hashMap2;
                    z4 = true;
                    m1105 = n.m1096().m1105();
                    if ((!n.m1095(m1105, this.f1035) ? (char) 21 : ']') != ']') {
                    }
                    if (!z4) {
                    }
                }
                if ((view != null ? 'R' : (char) 4) != 4) {
                }
                z3 = true;
                if (view != null) {
                }
                hashMap2.put("dr", Float.valueOf(displayMetrics.density));
                hashMap2.put("dv", Double.valueOf(r.m1131()));
                hashMap2.put("adKey", str);
                if ((!z ? (char) 23 : (char) 30) == 23) {
                }
                hashMap2.put("isAttached", Integer.valueOf(i));
                if ((!z2 ? 'U' : (char) 1) == 'U') {
                }
                hashMap2.put("inFocus", Integer.valueOf(i2));
                if ((!z3 ? '0' : '*') == '0') {
                }
                hashMap2.put("isHidden", Integer.valueOf(i3));
                hashMap2.put("opacity", Float.valueOf(m1154));
                Rect rect222 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
                if ((view == null ? 'X' : '9') == 'X') {
                }
                c cVar22 = new c();
                int width222 = rect3.width() * rect3.height();
                if ((view == null ? (char) 5 : 'J') == 5) {
                }
                if (this.f1039 == null) {
                }
                this.f1041 = cVar22;
                this.f1039 = new JSONObject(m1161(m1156(this.f1041.f1050, displayMetrics)));
                hashMap2.put("coveredPercent", Double.valueOf(cVar22.f1051));
                if (this.f1038 != null) {
                }
                this.f1040 = rect222;
                this.f1038 = new JSONObject(m1161(m1156(rect222, displayMetrics)));
                z4 = true;
                if ((this.f1036 != null ? (char) 18 : 'G') != 'G') {
                }
                this.f1037 = rect3;
                this.f1036 = new JSONObject(m1161(m1156(rect3, displayMetrics)));
                z4 = true;
                boolean z5222 = true;
                if (!(this.f1043 == null)) {
                }
                this.f1043 = hashMap2;
                z4 = true;
                m1105 = n.m1096().m1105();
                if ((!n.m1095(m1105, this.f1035) ? (char) 21 : ']') != ']') {
                }
                if (!z4) {
                }
            }
        }
        displayMetrics = view.getContext().getResources().getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 19) {
        }
        if ((view == null ? '6' : '%') != '%') {
        }
        if ((view != null ? 'R' : (char) 4) != 4) {
        }
        z3 = true;
        if (view != null) {
        }
        hashMap2.put("dr", Float.valueOf(displayMetrics.density));
        hashMap2.put("dv", Double.valueOf(r.m1131()));
        hashMap2.put("adKey", str);
        if ((!z ? (char) 23 : (char) 30) == 23) {
        }
        hashMap2.put("isAttached", Integer.valueOf(i));
        if ((!z2 ? 'U' : (char) 1) == 'U') {
        }
        hashMap2.put("inFocus", Integer.valueOf(i2));
        if ((!z3 ? '0' : '*') == '0') {
        }
        hashMap2.put("isHidden", Integer.valueOf(i3));
        hashMap2.put("opacity", Float.valueOf(m1154));
        Rect rect2222 = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        if ((view == null ? 'X' : '9') == 'X') {
        }
        c cVar222 = new c();
        int width2222 = rect3.width() * rect3.height();
        if ((view == null ? (char) 5 : 'J') == 5) {
        }
        if (this.f1039 == null) {
        }
        this.f1041 = cVar222;
        this.f1039 = new JSONObject(m1161(m1156(this.f1041.f1050, displayMetrics)));
        hashMap2.put("coveredPercent", Double.valueOf(cVar222.f1051));
        if (this.f1038 != null) {
        }
        this.f1040 = rect2222;
        this.f1038 = new JSONObject(m1161(m1156(rect2222, displayMetrics)));
        z4 = true;
        if ((this.f1036 != null ? (char) 18 : 'G') != 'G') {
        }
        this.f1037 = rect3;
        this.f1036 = new JSONObject(m1161(m1156(rect3, displayMetrics)));
        z4 = true;
        boolean z52222 = true;
        if (!(this.f1043 == null)) {
        }
        this.f1043 = hashMap2;
        z4 = true;
        m1105 = n.m1096().m1105();
        if ((!n.m1095(m1105, this.f1035) ? (char) 21 : ']') != ']') {
        }
        if (!z4) {
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static float m1154(View view) {
        float alpha = view.getAlpha();
        while (true) {
            if ((view != null ? (char) 25 : 'E') == 25) {
                if (!(view.getParent() != null)) {
                    break;
                }
                if (!(((double) alpha) != 0.0d)) {
                    break;
                }
                if ((view.getParent() instanceof View ? (char) 27 : ']') != 27) {
                    break;
                }
                alpha *= ((View) view.getParent()).getAlpha();
                view = (View) view.getParent();
            } else {
                break;
            }
        }
        return alpha;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static Rect m1157(View view) {
        if ((view != null ? '+' : '>') != '+') {
            return new Rect(0, 0, 0, 0);
        }
        int i = f1034 + 39;
        f1033 = i % 128;
        return i % 2 == 0 ? m1162(view) : m1162(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x008e, code lost:
    
        if ((r9.getBackground() != null ? 'Y' : '0') != 'Y') goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00a6, code lost:
    
        if (r9.getBackground().getAlpha() != 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00a8, code lost:
    
        r3 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00af, code lost:
    
        if (r3 == 31) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00b1, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00ab, code lost:
    
        r3 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x009c, code lost:
    
        if ((r9.getBackground() != null ? '=' : 6) != 6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d3, code lost:
    
        if ((r3) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00df, code lost:
    
        if ((r3 ? 'S' : '9') != '9') goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116 A[EDGE_INSN: B:91:0x0116->B:20:0x0116 BREAK  A[LOOP:0: B:78:0x00ed->B:86:0x0113], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m1163(a aVar, Rect rect, b bVar) {
        boolean z;
        boolean z2;
        int childCount;
        int i;
        View view = aVar.f1045;
        if ((view.isShown() ? (char) 19 : 'J') != 'J') {
            if (!(((double) view.getAlpha()) <= 0.0d)) {
                int i2 = f1033 + 3;
                f1034 = i2 % 128;
                int i3 = i2 % 2;
                z = true;
                if (z) {
                    return;
                }
                if (!(aVar.f1045 instanceof ViewGroup)) {
                    z2 = true;
                } else {
                    int i4 = f1034 + 39;
                    f1033 = i4 % 128;
                    int i5 = i4 % 2;
                    boolean equals = ViewGroup.class.equals(aVar.f1045.getClass().getSuperclass());
                    View view2 = aVar.f1045;
                    if ((Build.VERSION.SDK_INT >= 19 ? (char) 4 : (char) 1) == 4) {
                        int i6 = f1034 + 113;
                        f1033 = i6 % 128;
                        if (!(i6 % 2 != 0)) {
                        }
                    }
                    boolean z3 = true;
                    if ((equals ? 'F' : '[') == 'F') {
                        int i7 = f1034 + 75;
                        f1033 = i7 % 128;
                        if (!(i7 % 2 == 0)) {
                        }
                        ViewGroup viewGroup = (ViewGroup) aVar.f1045;
                        childCount = viewGroup.getChildCount();
                        i = 0;
                        while (true) {
                            if ((i >= childCount ? 'Z' : 'c') != 'c') {
                                break;
                            }
                            int i8 = bVar.f1048 + 1;
                            bVar.f1048 = i8;
                            if (i8 > 500) {
                                return;
                            }
                            m1163(new a(viewGroup.getChildAt(i), aVar), rect, bVar);
                            if (bVar.f1046) {
                                return;
                            } else {
                                i++;
                            }
                        }
                    }
                    z2 = true;
                    ViewGroup viewGroup2 = (ViewGroup) aVar.f1045;
                    childCount = viewGroup2.getChildCount();
                    i = 0;
                    while (true) {
                        if ((i >= childCount ? 'Z' : 'c') != 'c') {
                        }
                        i++;
                    }
                }
                if ((z2 ? '4' : (char) 16) != '4') {
                    return;
                }
                Rect rect2 = aVar.f1044;
                if ((rect2.setIntersect(rect, rect2) ? 'Z' : '0') != '0') {
                    if (!(Build.VERSION.SDK_INT < 22)) {
                        Rect rect3 = new Rect(0, 0, 0, 0);
                        if (!m1159(aVar.f1045, rect3)) {
                            return;
                        }
                        Rect rect4 = aVar.f1044;
                        if (!rect4.setIntersect(rect3, rect4)) {
                            return;
                        } else {
                            rect2 = rect4;
                        }
                    }
                    if (t.m1144().f1009) {
                        com.moat.analytics.mobile.cha.a.m995("VisibilityInfo", aVar.f1045, String.format(Locale.ROOT, "Covered by %s-%s alpha=%f", aVar.f1045.getClass().getName(), rect2.toString(), Float.valueOf(aVar.f1045.getAlpha())));
                    }
                    bVar.f1047.add(rect2);
                    if ((rect2.contains(rect) ? '[' : (char) 25) != 25) {
                        int i9 = f1034 + 39;
                        f1033 = i9 % 128;
                        int i10 = i9 % 2;
                        bVar.f1046 = true;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
        }
    }

    static class b {

        /* renamed from: ˎ, reason: contains not printable characters */
        int f1048 = 0;

        /* renamed from: ˋ, reason: contains not printable characters */
        final Set<Rect> f1047 = new HashSet();

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean f1046 = false;

        b() {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ad, code lost:
    
        if ((r2.getZ() <= r4.getZ()) != false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0149, code lost:
    
        com.moat.analytics.mobile.cha.a.m994(r8, "VisibilityInfo", null, "Short-circuiting cover retrieval, reached max");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x010a, code lost:
    
        if ((r4.getParent() instanceof android.view.ViewGroup ? 18 : 'S') != 'S') goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d A[Catch: Exception -> 0x0203, TryCatch #0 {Exception -> 0x0203, blocks: (B:3:0x0005, B:4:0x000d, B:14:0x0037, B:20:0x0087, B:32:0x00a6, B:33:0x00b0, B:37:0x00bb, B:48:0x00e9, B:53:0x010c, B:62:0x0132, B:67:0x0152, B:71:0x015d, B:75:0x016a, B:85:0x018c, B:94:0x01da, B:107:0x019e, B:115:0x01b1, B:119:0x01bc, B:131:0x0149, B:135:0x013e, B:145:0x00fb, B:156:0x0043, B:176:0x0066, B:167:0x006e, B:171:0x0080), top: B:2:0x0005 }] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static b m1158(Rect rect, View view) {
        ArrayDeque arrayDeque;
        int i;
        View childAt;
        boolean z;
        b bVar = new b();
        try {
            arrayDeque = new ArrayDeque();
            View view2 = view;
            int i2 = 0;
            while (true) {
                i = 3;
                if ((view2.getParent() == null ? '_' : 'I') == '_') {
                    int i3 = f1034 + 81;
                    f1033 = i3 % 128;
                    if (i3 % 2 == 0) {
                        if (!(view2 == view.getRootView())) {
                            break;
                        }
                    } else {
                        if (!(view2 == view.getRootView())) {
                            break;
                        }
                    }
                }
                i2++;
                if ((i2 > 50 ? '5' : '\\') != '\\') {
                    int i4 = f1033 + 123;
                    f1034 = i4 % 128;
                    int i5 = i4 % 2;
                    com.moat.analytics.mobile.cha.a.m994(3, "VisibilityInfo", null, "Short-circuiting chain retrieval, reached max");
                    break;
                }
                arrayDeque.add(view2);
                if ((view2.getParent() instanceof View ? (char) 29 : '1') == '1') {
                    break;
                }
                view2 = (View) view2.getParent();
            }
        } catch (Exception e) {
            o.m1110(e);
        }
        if ((arrayDeque.isEmpty() ? 'I' : '@') == '@') {
            com.moat.analytics.mobile.cha.a.m995("VisibilityInfo", view, "starting covering rect search");
            a aVar = null;
            loop1: while (true) {
                if (arrayDeque.isEmpty()) {
                    break;
                }
                View view3 = (View) arrayDeque.pollLast();
                a aVar2 = new a(view3, aVar);
                if (!(view3.getParent() == null)) {
                    int i6 = f1033 + 19;
                    f1034 = i6 % 128;
                    if (!(i6 % 2 != 0)) {
                        if ((view3.getParent() instanceof ViewGroup ? 'Z' : 'G') != 'G') {
                            ViewGroup viewGroup = (ViewGroup) view3.getParent();
                            int childCount = viewGroup.getChildCount();
                            int i7 = 0;
                            boolean z2 = false;
                            while (true) {
                                if (!(i7 < childCount)) {
                                    break;
                                }
                                int i8 = f1033 + 25;
                                f1034 = i8 % 128;
                                if (!(i8 % 2 != 0)) {
                                    if (bVar.f1048 >= 500) {
                                        break loop1;
                                    }
                                    childAt = viewGroup.getChildAt(i7);
                                    if (childAt != view3) {
                                        bVar.f1048++;
                                        if ((z2 ? (char) 0 : '1') == 0) {
                                            if (!(Build.VERSION.SDK_INT < 21)) {
                                                z = ((childAt.getZ() > view3.getZ() ? 1 : (childAt.getZ() == view3.getZ() ? 0 : -1)) >= 0 ? '5' : '^') == '5';
                                            }
                                        } else {
                                            if ((Build.VERSION.SDK_INT >= 21 ? 'M' : (char) 19) != 19) {
                                                int i9 = f1033 + 115;
                                                f1034 = i9 % 128;
                                                if ((i9 % 2 == 0 ? '$' : 'H') != 'H') {
                                                    if (childAt.getZ() <= view3.getZ()) {
                                                    }
                                                }
                                            }
                                        }
                                        if ((z ? (char) 16 : (char) 18) != 18) {
                                            m1163(new a(childAt, aVar), rect, bVar);
                                            if (!(!bVar.f1046)) {
                                                return bVar;
                                            }
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                    i7++;
                                    i = 3;
                                } else {
                                    if (!(bVar.f1048 < 500)) {
                                        break loop1;
                                    }
                                    childAt = viewGroup.getChildAt(i7);
                                    if (childAt != view3) {
                                    }
                                    i7++;
                                    i = 3;
                                }
                                o.m1110(e);
                            }
                        }
                    }
                }
                aVar = aVar2;
                i = 3;
            }
        } else {
            int i10 = f1034 + 125;
            f1033 = i10 % 128;
            if (i10 % 2 == 0) {
            }
            return bVar;
        }
        return bVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static int m1155(Rect rect, Set<Rect> set) {
        Object next;
        if (set.isEmpty()) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(set);
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: com.moat.analytics.mobile.cha.u.1
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
            int i = f1033 + 59;
            f1034 = i % 128;
            if (!(i % 2 == 0)) {
                next = it.next();
            } else {
                next = it.next();
            }
            Rect rect2 = (Rect) next;
            arrayList2.add(Integer.valueOf(rect2.left));
            arrayList2.add(Integer.valueOf(rect2.right));
        }
        Collections.sort(arrayList2);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if ((i2 < arrayList2.size() - 1 ? '&' : 'U') == 'U') {
                return i3;
            }
            int i4 = i2 + 1;
            if (!(((Integer) arrayList2.get(i2)).equals(arrayList2.get(i4)))) {
                Rect rect3 = new Rect(((Integer) arrayList2.get(i2)).intValue(), rect.top, ((Integer) arrayList2.get(i4)).intValue(), rect.bottom);
                int i5 = rect.top;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if ((it2.hasNext() ? (char) 25 : '\t') != '\t') {
                        int i6 = f1034 + 23;
                        f1033 = i6 % 128;
                        int i7 = i6 % 2;
                        Rect rect4 = (Rect) it2.next();
                        if (Rect.intersects(rect4, rect3)) {
                            if ((rect4.bottom > i5 ? (char) 16 : 'A') == 16) {
                                i3 += rect3.width() * (rect4.bottom - Math.max(i5, rect4.top));
                                i5 = rect4.bottom;
                            }
                            if (rect4.bottom != rect3.bottom) {
                            }
                        }
                    }
                }
            }
            i2 = i4;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static Map<String, String> m1161(Rect rect) {
        HashMap hashMap = new HashMap();
        hashMap.put("x", String.valueOf(rect.left));
        hashMap.put("y", String.valueOf(rect.top));
        hashMap.put("w", String.valueOf(rect.right - rect.left));
        hashMap.put("h", String.valueOf(rect.bottom - rect.top));
        return hashMap;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static Rect m1156(Rect rect, DisplayMetrics displayMetrics) {
        float f = displayMetrics.density;
        if (!(f != 0.0f)) {
            return rect;
        }
        return new Rect(Math.round(rect.left / f), Math.round(rect.top / f), Math.round(rect.right / f), Math.round(rect.bottom / f));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean m1159(View view, Rect rect) {
        if ((view.getGlobalVisibleRect(rect) ? 'Z' : (char) 1) != 'Z') {
            return false;
        }
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationInWindow(iArr);
        int[] iArr2 = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr2);
        rect.offset(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static Rect m1162(View view) {
        int[] iArr = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
    }
}
