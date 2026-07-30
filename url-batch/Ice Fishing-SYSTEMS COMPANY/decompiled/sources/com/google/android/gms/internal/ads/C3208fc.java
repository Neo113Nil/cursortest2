package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Collections;
import java.util.Map;
import p2.C4856a;
import q2.C4907p;

/* renamed from: com.google.android.gms.internal.ads.fc, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3208fc implements InterfaceC2990bc {

    /* renamed from: w, reason: collision with root package name */
    public static final Map f30730w;

    /* renamed from: n, reason: collision with root package name */
    public final C4856a f30731n;

    /* renamed from: u, reason: collision with root package name */
    public final C2839Wd f30732u;

    /* renamed from: v, reason: collision with root package name */
    public final Rx f30733v;

    static {
        String[] strArr = {com.onesignal.inAppMessages.internal.display.impl.m.EVENT_TYPE_RESIZE, "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        s.b bVar = new s.b(7);
        for (int i = 0; i < 7; i++) {
            bVar.put(strArr[i], numArr[i]);
        }
        f30730w = Collections.unmodifiableMap(bVar);
    }

    public C3208fc(C4856a c4856a, C2839Wd c2839Wd, Rx rx) {
        this.f30731n = c4856a;
        this.f30732u = c2839Wd;
        this.f30733v = rx;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:150:0x044d A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0454 A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03cb A[Catch: all -> 0x01ca, TryCatch #1 {all -> 0x01ca, blocks: (B:92:0x01bf, B:94:0x01c3, B:95:0x01c8, B:97:0x01cd, B:99:0x01d7, B:100:0x01dc, B:102:0x01de, B:104:0x01ea, B:105:0x01ef, B:107:0x01f1, B:109:0x01f9, B:110:0x01fe, B:112:0x0200, B:114:0x020e, B:115:0x0220, B:117:0x022e, B:118:0x0240, B:120:0x024e, B:121:0x0260, B:123:0x026e, B:124:0x0280, B:126:0x028e, B:127:0x029c, B:129:0x02aa, B:130:0x02ac, B:132:0x02b0, B:134:0x02b4, B:136:0x02ba, B:139:0x02c2, B:142:0x02f6, B:147:0x0304, B:150:0x044d, B:151:0x0452, B:153:0x0454, B:155:0x047a, B:157:0x0483, B:158:0x04b2, B:189:0x056a, B:190:0x059d, B:192:0x05b5, B:193:0x05dd, B:195:0x05e5, B:196:0x05f0, B:197:0x0615, B:201:0x0618, B:203:0x0643, B:204:0x0652, B:206:0x0571, B:207:0x0578, B:208:0x0581, B:209:0x0588, B:210:0x058e, B:211:0x0597, B:212:0x04af, B:213:0x0654, B:214:0x0659, B:216:0x0310, B:218:0x0314, B:233:0x036e, B:234:0x0378, B:236:0x03cb, B:238:0x03cf, B:240:0x03d3, B:244:0x03df, B:245:0x03ee, B:248:0x0424, B:251:0x0434, B:252:0x042a, B:254:0x0432, B:255:0x041b, B:257:0x0421, B:259:0x037c, B:260:0x0386, B:261:0x038d, B:262:0x0399, B:263:0x03a1, B:264:0x03b5, B:265:0x03c1, B:284:0x0439, B:286:0x0442, B:287:0x065b, B:288:0x0660, B:290:0x0662, B:291:0x0667), top: B:91:0x01bf, inners: #0 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2990bc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(Object obj, Map map) {
        int i;
        int[] iArr;
        int i4;
        char c4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        InterfaceC3858rh interfaceC3858rh = (InterfaceC3858rh) obj;
        int intValue = ((Integer) f30730w.get((String) map.get("a"))).intValue();
        char c9 = 1;
        if (intValue != 5) {
            if (intValue != 7) {
                C4856a c4856a = this.f30731n;
                if (!c4856a.a()) {
                    c4856a.b(null);
                    return;
                }
                if (intValue == 1) {
                    C2839Wd c2839Wd = this.f30732u;
                    synchronized (c2839Wd.f28404E) {
                        try {
                            Activity activity = c2839Wd.f28406G;
                            if (activity == null) {
                                c2839Wd.t("Not an activity context. Cannot resize.");
                                return;
                            }
                            C2486Bh c2486Bh = c2839Wd.f28405F;
                            if (c2486Bh.f24059n.e0() == null) {
                                c2839Wd.t("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (c2486Bh.f24059n.e0().b()) {
                                c2839Wd.t("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (c2486Bh.f24059n.G0()) {
                                c2839Wd.t("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                t2.G g9 = p2.j.f39798C.f39803c;
                                c2839Wd.f28403D = t2.G.n((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                t2.G g10 = p2.j.f39798C.f39803c;
                                c2839Wd.f28400A = t2.G.n((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                t2.G g11 = p2.j.f39798C.f39803c;
                                c2839Wd.f28401B = t2.G.n((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                t2.G g12 = p2.j.f39798C.f39803c;
                                c2839Wd.f28402C = t2.G.n((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                c2839Wd.f28414x = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str)) {
                                c2839Wd.f28413w = str;
                            }
                            if (c2839Wd.f28403D < 0 || c2839Wd.f28400A < 0) {
                                c2839Wd.t("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                t2.G g13 = p2.j.f39798C.f39803c;
                                int[] p6 = t2.G.p(activity);
                                C4907p c4907p = C4907p.f40108g;
                                int[] iArr2 = {c4907p.f40109a.h(activity, p6[0]), c4907p.f40109a.h(activity, p6[1])};
                                int[] q6 = t2.G.q(activity);
                                int i14 = iArr2[0];
                                int i15 = iArr2[1];
                                int i16 = c2839Wd.f28403D;
                                if (i16 < 50 || i16 > i14) {
                                    i = 50;
                                    int i17 = t2.C.f40822b;
                                    u2.i.f("Width is too small or too large.");
                                } else {
                                    int i18 = c2839Wd.f28400A;
                                    if (i18 < 50 || i18 > i15) {
                                        i = 50;
                                        int i19 = t2.C.f40822b;
                                        u2.i.f("Height is too small or too large.");
                                    } else {
                                        if (i18 != i15 || i16 != i14) {
                                            boolean z8 = c2839Wd.f28414x;
                                            if (z8) {
                                                i = 50;
                                                String str2 = c2839Wd.f28413w;
                                                switch (str2.hashCode()) {
                                                    case -1364013995:
                                                        if (str2.equals("center")) {
                                                            c4 = 2;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case -1012429441:
                                                        if (str2.equals("top-left")) {
                                                            c4 = 0;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case -655373719:
                                                        if (str2.equals("bottom-left")) {
                                                            c4 = 3;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case 1163912186:
                                                        if (str2.equals("bottom-right")) {
                                                            c4 = 5;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case 1288627767:
                                                        if (str2.equals("bottom-center")) {
                                                            c4 = 4;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    case 1755462605:
                                                        if (str2.equals("top-center")) {
                                                            c4 = 1;
                                                            break;
                                                        }
                                                        c4 = 65535;
                                                        break;
                                                    default:
                                                        c4 = 65535;
                                                        break;
                                                }
                                                if (c4 == 0) {
                                                    i9 = c2839Wd.f28401B + c2839Wd.f28415y;
                                                    i10 = c2839Wd.f28416z;
                                                } else if (c4 != 1) {
                                                    if (c4 != 2) {
                                                        if (c4 == 3) {
                                                            i9 = c2839Wd.f28401B + c2839Wd.f28415y;
                                                            i12 = c2839Wd.f28416z;
                                                        } else if (c4 == 4) {
                                                            i9 = ((c2839Wd.f28415y + c2839Wd.f28401B) + (i16 >> 1)) - 25;
                                                            i12 = c2839Wd.f28416z;
                                                        } else if (c4 != 5) {
                                                            i9 = ((c2839Wd.f28415y + c2839Wd.f28401B) + i16) - 50;
                                                            i10 = c2839Wd.f28416z;
                                                        } else {
                                                            i9 = ((c2839Wd.f28415y + c2839Wd.f28401B) + i16) - 50;
                                                            i12 = c2839Wd.f28416z;
                                                        }
                                                        i11 = ((i12 + c2839Wd.f28402C) + i18) - 50;
                                                    } else {
                                                        i9 = ((c2839Wd.f28415y + c2839Wd.f28401B) + (i16 >> 1)) - 25;
                                                        i11 = ((c2839Wd.f28416z + c2839Wd.f28402C) + (i18 >> 1)) - 25;
                                                    }
                                                    if (i9 >= 0) {
                                                        if (i9 + 50 <= i14) {
                                                            if (i11 >= q6[0]) {
                                                                if (i11 + 50 <= q6[1]) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    i9 = ((c2839Wd.f28415y + c2839Wd.f28401B) + (i16 >> 1)) - 25;
                                                    i10 = c2839Wd.f28416z;
                                                }
                                                i11 = i10 + c2839Wd.f28402C;
                                                if (i9 >= 0) {
                                                }
                                            } else {
                                                i = 50;
                                            }
                                            if (z8) {
                                                iArr = new int[]{c2839Wd.f28415y + c2839Wd.f28401B, c2839Wd.f28416z + c2839Wd.f28402C};
                                            } else {
                                                int[] p9 = t2.G.p(activity);
                                                int[] iArr3 = {c4907p.f40109a.h(activity, p9[0]), c4907p.f40109a.h(activity, p9[1])};
                                                int[] q9 = t2.G.q(activity);
                                                int i20 = iArr3[0];
                                                int i21 = c2839Wd.f28415y + c2839Wd.f28401B;
                                                int i22 = c2839Wd.f28416z + c2839Wd.f28402C;
                                                if (i21 < 0) {
                                                    i4 = 0;
                                                } else {
                                                    int i23 = c2839Wd.f28403D;
                                                    i4 = i21 + i23 > i20 ? i20 - i23 : i21;
                                                }
                                                int i24 = q9[0];
                                                if (i22 < i24) {
                                                    i22 = i24;
                                                } else {
                                                    int i25 = c2839Wd.f28400A;
                                                    int i26 = i22 + i25;
                                                    int i27 = q9[1];
                                                    if (i26 > i27) {
                                                        i22 = i27 - i25;
                                                    }
                                                }
                                                iArr = new int[]{i4, i22};
                                            }
                                            if (iArr != null) {
                                                c2839Wd.t("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            u2.d dVar = c4907p.f40109a;
                                            int q10 = u2.d.q(activity.getResources().getDisplayMetrics(), c2839Wd.f28403D);
                                            int q11 = u2.d.q(activity.getResources().getDisplayMetrics(), c2839Wd.f28400A);
                                            ViewParent parent = c2486Bh.getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                c2839Wd.t("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            ViewGroup viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView(c2486Bh);
                                            PopupWindow popupWindow = c2839Wd.f28410L;
                                            if (popupWindow == null) {
                                                c2839Wd.f28412N = viewGroup;
                                                c2486Bh.setDrawingCacheEnabled(true);
                                                Bitmap createBitmap = Bitmap.createBitmap(c2486Bh.getDrawingCache());
                                                c2486Bh.setDrawingCacheEnabled(false);
                                                ImageView imageView = new ImageView(activity);
                                                c2839Wd.f28408I = imageView;
                                                imageView.setImageBitmap(createBitmap);
                                                c2839Wd.f28407H = c2486Bh.f24059n.e0();
                                                c2839Wd.f28412N.addView(c2839Wd.f28408I);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout = new RelativeLayout(activity);
                                            c2839Wd.f28411M = relativeLayout;
                                            relativeLayout.setBackgroundColor(0);
                                            c2839Wd.f28411M.setLayoutParams(new ViewGroup.LayoutParams(q10, q11));
                                            PopupWindow popupWindow2 = new PopupWindow((View) c2839Wd.f28411M, q10, q11, false);
                                            c2839Wd.f28410L = popupWindow2;
                                            popupWindow2.setOutsideTouchable(false);
                                            c2839Wd.f28410L.setTouchable(true);
                                            c2839Wd.f28410L.setClippingEnabled(!c2839Wd.f28414x);
                                            char c10 = 65535;
                                            c2839Wd.f28411M.addView(c2486Bh, -1, -1);
                                            c2839Wd.J = new LinearLayout(activity);
                                            int i28 = i;
                                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u2.d.q(activity.getResources().getDisplayMetrics(), i28), u2.d.q(activity.getResources().getDisplayMetrics(), i28));
                                            String str3 = c2839Wd.f28413w;
                                            switch (str3.hashCode()) {
                                                case -1364013995:
                                                    if (str3.equals("center")) {
                                                        c10 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -1012429441:
                                                    if (str3.equals("top-left")) {
                                                        c10 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (str3.equals("bottom-left")) {
                                                        c10 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (str3.equals("bottom-right")) {
                                                        c10 = 5;
                                                        break;
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (str3.equals("bottom-center")) {
                                                        c10 = 4;
                                                        break;
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (str3.equals("top-center")) {
                                                        c10 = 1;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            if (c10 == 0) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(9);
                                            } else if (c10 == 1) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(14);
                                            } else if (c10 == 2) {
                                                layoutParams.addRule(13);
                                            } else if (c10 == 3) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(9);
                                            } else if (c10 == 4) {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(14);
                                            } else if (c10 != 5) {
                                                layoutParams.addRule(10);
                                                layoutParams.addRule(11);
                                            } else {
                                                layoutParams.addRule(12);
                                                layoutParams.addRule(11);
                                            }
                                            c2839Wd.J.setOnClickListener(new ViewOnClickListenerC2822Vd(c2839Wd));
                                            c2839Wd.J.setContentDescription("Close button");
                                            c2839Wd.f28411M.addView(c2839Wd.J, layoutParams);
                                            try {
                                                c2839Wd.f28410L.showAtLocation(window.getDecorView(), 0, u2.d.q(activity.getResources().getDisplayMetrics(), iArr[0]), u2.d.q(activity.getResources().getDisplayMetrics(), iArr[1]));
                                                int i29 = iArr[0];
                                                int i30 = iArr[1];
                                                Rx rx = c2839Wd.f28409K;
                                                if (rx != null) {
                                                    ((C2611In) rx.f27448u).f25594c.u1(C2943ak.f29297z);
                                                }
                                                c2839Wd.f28405F.J0(new W2.b(1, q10, q11));
                                                c2839Wd.u(iArr[0], iArr[1] - t2.G.q(c2839Wd.f28406G)[0], c2839Wd.f28403D, c2839Wd.f28400A);
                                                c2839Wd.v(com.anythink.core.express.b.a.i);
                                                return;
                                            } catch (RuntimeException e6) {
                                                String message = e6.getMessage();
                                                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 26);
                                                sb.append("Cannot show popup window: ");
                                                sb.append(message);
                                                c2839Wd.t(sb.toString());
                                                RelativeLayout relativeLayout2 = c2839Wd.f28411M;
                                                C2486Bh c2486Bh2 = c2839Wd.f28405F;
                                                relativeLayout2.removeView(c2486Bh2);
                                                ViewGroup viewGroup2 = c2839Wd.f28412N;
                                                if (viewGroup2 != null) {
                                                    viewGroup2.removeView(c2839Wd.f28408I);
                                                    c2839Wd.f28412N.addView(c2486Bh2);
                                                    c2486Bh2.J0(c2839Wd.f28407H);
                                                }
                                                return;
                                            }
                                        }
                                        int i31 = t2.C.f40822b;
                                        u2.i.f("Cannot resize to a full-screen ad.");
                                        i = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                            }
                            c2839Wd.t("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (intValue == 3) {
                    C2873Yd c2873Yd = new C2873Yd(interfaceC3858rh, map);
                    Activity activity2 = c2873Yd.f28839w;
                    if (activity2 == null) {
                        c2873Yd.t("Activity context is not available");
                        return;
                    }
                    p2.j jVar = p2.j.f39798C;
                    t2.G g14 = jVar.f39803c;
                    if (!((Boolean) K3.b.G(activity2, CallableC2988ba.f29503b)).booleanValue() || U2.c.a(activity2).f3280n.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        c2873Yd.t("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        c2873Yd.t("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        c2873Yd.t("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        c2873Yd.t("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources c11 = jVar.f39808h.c();
                    AlertDialog.Builder k6 = t2.G.k(activity2);
                    k6.setTitle(c11 != null ? c11.getString(C5284R.string.s1) : "Save image");
                    k6.setMessage(c11 != null ? c11.getString(C5284R.string.s2) : "Allow Ad to store image in Picture gallery?");
                    k6.setPositiveButton(c11 != null ? c11.getString(C5284R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2902Zp(c2873Yd, str4, lastPathSegment));
                    k6.setNegativeButton(c11 != null ? c11.getString(C5284R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2856Xd(i13, c2873Yd));
                    k6.create().show();
                    return;
                }
                if (intValue == 4) {
                    C2805Ud c2805Ud = new C2805Ud(interfaceC3858rh, map);
                    Activity activity3 = c2805Ud.f28049x;
                    if (activity3 == null) {
                        c2805Ud.t("Activity context is not available.");
                        return;
                    }
                    p2.j jVar2 = p2.j.f39798C;
                    t2.G g15 = jVar2.f39803c;
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    O2.w.i(type, "Intent can not be null");
                    if (activity3.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        c2805Ud.t("This feature is not available on the device.");
                        return;
                    }
                    AlertDialog.Builder k9 = t2.G.k(activity3);
                    Resources c12 = jVar2.f39808h.c();
                    k9.setTitle(c12 != null ? c12.getString(C5284R.string.s5) : "Create calendar event");
                    k9.setMessage(c12 != null ? c12.getString(C5284R.string.s6) : "Allow Ad to create a calendar event?");
                    k9.setPositiveButton(c12 != null ? c12.getString(C5284R.string.s3) : "Accept", new DialogInterfaceOnClickListenerC2788Td(c2805Ud, i13));
                    k9.setNegativeButton(c12 != null ? c12.getString(C5284R.string.s4) : "Decline", new DialogInterfaceOnClickListenerC2788Td(c2805Ud, c9 == true ? 1 : 0));
                    k9.create().show();
                    return;
                }
                if (intValue != 5) {
                    if (intValue == 6) {
                        this.f30732u.x(true);
                        return;
                    } else if (intValue != 7) {
                        int i32 = t2.C.f40822b;
                        u2.i.e("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((C2611In) this.f30733v.f27448u).f25603m.a();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean parseBoolean = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (interfaceC3858rh != null) {
            interfaceC3858rh.h0("portrait".equalsIgnoreCase(str5) ? 7 : "landscape".equalsIgnoreCase(str5) ? 6 : parseBoolean ? -1 : 14);
        } else {
            int i33 = t2.C.f40822b;
            u2.i.f("AdWebView is null");
        }
    }
}
