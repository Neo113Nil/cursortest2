package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class yf0 extends eg0 {

    /* renamed from: u, reason: collision with root package name */
    static final Set<String> f14648u = v3.e.d("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: c, reason: collision with root package name */
    private String f14649c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14650d;

    /* renamed from: e, reason: collision with root package name */
    private int f14651e;

    /* renamed from: f, reason: collision with root package name */
    private int f14652f;

    /* renamed from: g, reason: collision with root package name */
    private int f14653g;

    /* renamed from: h, reason: collision with root package name */
    private int f14654h;

    /* renamed from: i, reason: collision with root package name */
    private int f14655i;

    /* renamed from: j, reason: collision with root package name */
    private int f14656j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f14657k;

    /* renamed from: l, reason: collision with root package name */
    private final eu0 f14658l;

    /* renamed from: m, reason: collision with root package name */
    private final Activity f14659m;

    /* renamed from: n, reason: collision with root package name */
    private vv0 f14660n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f14661o;

    /* renamed from: p, reason: collision with root package name */
    private LinearLayout f14662p;

    /* renamed from: q, reason: collision with root package name */
    private final fg0 f14663q;

    /* renamed from: r, reason: collision with root package name */
    private PopupWindow f14664r;

    /* renamed from: s, reason: collision with root package name */
    private RelativeLayout f14665s;

    /* renamed from: t, reason: collision with root package name */
    private ViewGroup f14666t;

    public yf0(eu0 eu0Var, fg0 fg0Var) {
        super(eu0Var, "resize");
        this.f14649c = "top-right";
        this.f14650d = true;
        this.f14651e = 0;
        this.f14652f = 0;
        this.f14653g = -1;
        this.f14654h = 0;
        this.f14655i = 0;
        this.f14656j = -1;
        this.f14657k = new Object();
        this.f14658l = eu0Var;
        this.f14659m = eu0Var.j();
        this.f14663q = fg0Var;
    }

    public final void h(boolean z6) {
        synchronized (this.f14657k) {
            PopupWindow popupWindow = this.f14664r;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.f14665s.removeView((View) this.f14658l);
                ViewGroup viewGroup = this.f14666t;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f14661o);
                    this.f14666t.addView((View) this.f14658l);
                    this.f14658l.h0(this.f14660n);
                }
                if (z6) {
                    g("default");
                    fg0 fg0Var = this.f14663q;
                    if (fg0Var != null) {
                        fg0Var.a();
                    }
                }
                this.f14664r = null;
                this.f14665s = null;
                this.f14666t = null;
                this.f14662p = null;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0251 A[Catch: all -> 0x0471, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:24:0x004a, B:25:0x005b, B:27:0x0069, B:28:0x007a, B:30:0x0088, B:31:0x0099, B:33:0x00a7, B:34:0x00b8, B:36:0x00c6, B:37:0x00d4, B:39:0x00e2, B:40:0x00e4, B:42:0x00e8, B:44:0x00ec, B:46:0x00f4, B:49:0x00fc, B:53:0x0122, B:60:0x024b, B:63:0x0251, B:64:0x0256, B:66:0x0258, B:68:0x0278, B:70:0x027c, B:72:0x0289, B:73:0x02c5, B:88:0x037e, B:89:0x0381, B:90:0x03a2, B:92:0x03ba, B:93:0x03db, B:95:0x03e3, B:96:0x03ea, B:97:0x0411, B:101:0x0414, B:103:0x0424, B:104:0x042e, B:106:0x043e, B:107:0x0453, B:109:0x0429, B:110:0x0385, B:111:0x0389, B:112:0x038d, B:113:0x0390, B:114:0x0394, B:115:0x039a, B:116:0x039e, B:133:0x02c2, B:134:0x0455, B:135:0x045a, B:137:0x0132, B:139:0x0136, B:150:0x0189, B:151:0x01d9, B:152:0x01e4, B:154:0x01e7, B:156:0x01ea, B:158:0x01ee, B:161:0x01f4, B:162:0x0194, B:163:0x01aa, B:164:0x01b5, B:165:0x019f, B:166:0x01ad, B:167:0x01ba, B:168:0x01ce, B:169:0x01dc, B:186:0x0205, B:189:0x022f, B:192:0x023f, B:193:0x0235, B:195:0x023d, B:196:0x0227, B:198:0x022d, B:201:0x045c, B:202:0x0461, B:204:0x0463, B:205:0x0468, B:207:0x046a, B:208:0x046f), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0258 A[Catch: all -> 0x0471, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:24:0x004a, B:25:0x005b, B:27:0x0069, B:28:0x007a, B:30:0x0088, B:31:0x0099, B:33:0x00a7, B:34:0x00b8, B:36:0x00c6, B:37:0x00d4, B:39:0x00e2, B:40:0x00e4, B:42:0x00e8, B:44:0x00ec, B:46:0x00f4, B:49:0x00fc, B:53:0x0122, B:60:0x024b, B:63:0x0251, B:64:0x0256, B:66:0x0258, B:68:0x0278, B:70:0x027c, B:72:0x0289, B:73:0x02c5, B:88:0x037e, B:89:0x0381, B:90:0x03a2, B:92:0x03ba, B:93:0x03db, B:95:0x03e3, B:96:0x03ea, B:97:0x0411, B:101:0x0414, B:103:0x0424, B:104:0x042e, B:106:0x043e, B:107:0x0453, B:109:0x0429, B:110:0x0385, B:111:0x0389, B:112:0x038d, B:113:0x0390, B:114:0x0394, B:115:0x039a, B:116:0x039e, B:133:0x02c2, B:134:0x0455, B:135:0x045a, B:137:0x0132, B:139:0x0136, B:150:0x0189, B:151:0x01d9, B:152:0x01e4, B:154:0x01e7, B:156:0x01ea, B:158:0x01ee, B:161:0x01f4, B:162:0x0194, B:163:0x01aa, B:164:0x01b5, B:165:0x019f, B:166:0x01ad, B:167:0x01ba, B:168:0x01ce, B:169:0x01dc, B:186:0x0205, B:189:0x022f, B:192:0x023f, B:193:0x0235, B:195:0x023d, B:196:0x0227, B:198:0x022d, B:201:0x045c, B:202:0x0461, B:204:0x0463, B:205:0x0468, B:207:0x046a, B:208:0x046f), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e3 A[Catch: all -> 0x0471, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:24:0x004a, B:25:0x005b, B:27:0x0069, B:28:0x007a, B:30:0x0088, B:31:0x0099, B:33:0x00a7, B:34:0x00b8, B:36:0x00c6, B:37:0x00d4, B:39:0x00e2, B:40:0x00e4, B:42:0x00e8, B:44:0x00ec, B:46:0x00f4, B:49:0x00fc, B:53:0x0122, B:60:0x024b, B:63:0x0251, B:64:0x0256, B:66:0x0258, B:68:0x0278, B:70:0x027c, B:72:0x0289, B:73:0x02c5, B:88:0x037e, B:89:0x0381, B:90:0x03a2, B:92:0x03ba, B:93:0x03db, B:95:0x03e3, B:96:0x03ea, B:97:0x0411, B:101:0x0414, B:103:0x0424, B:104:0x042e, B:106:0x043e, B:107:0x0453, B:109:0x0429, B:110:0x0385, B:111:0x0389, B:112:0x038d, B:113:0x0390, B:114:0x0394, B:115:0x039a, B:116:0x039e, B:133:0x02c2, B:134:0x0455, B:135:0x045a, B:137:0x0132, B:139:0x0136, B:150:0x0189, B:151:0x01d9, B:152:0x01e4, B:154:0x01e7, B:156:0x01ea, B:158:0x01ee, B:161:0x01f4, B:162:0x0194, B:163:0x01aa, B:164:0x01b5, B:165:0x019f, B:166:0x01ad, B:167:0x01ba, B:168:0x01ce, B:169:0x01dc, B:186:0x0205, B:189:0x022f, B:192:0x023f, B:193:0x0235, B:195:0x023d, B:196:0x0227, B:198:0x022d, B:201:0x045c, B:202:0x0461, B:204:0x0463, B:205:0x0468, B:207:0x046a, B:208:0x046f), top: B:3:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Map<String, String> map) {
        String str;
        int[] iArr;
        char c7;
        fg0 fg0Var;
        char c8;
        int i7;
        int i8;
        int i9;
        int i10;
        synchronized (this.f14657k) {
            if (this.f14659m == null) {
                c("Not an activity context. Cannot resize.");
                return;
            }
            if (this.f14658l.w() == null) {
                c("Webview is not yet available, size is not set.");
                return;
            }
            if (this.f14658l.w().i()) {
                c("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.f14658l.N0()) {
                c("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                y2.t.q();
                this.f14656j = a3.g2.r(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                y2.t.q();
                this.f14653g = a3.g2.r(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                y2.t.q();
                this.f14654h = a3.g2.r(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                y2.t.q();
                this.f14655i = a3.g2.r(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.f14650d = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str2 = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str2)) {
                this.f14649c = str2;
            }
            if (this.f14656j < 0 || this.f14653g < 0) {
                c("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.f14659m.getWindow();
            if (window != null && window.getDecorView() != null) {
                y2.t.q();
                int[] z6 = a3.g2.z(this.f14659m);
                y2.t.q();
                int[] w6 = a3.g2.w(this.f14659m);
                int i11 = z6[0];
                int i12 = z6[1];
                int i13 = this.f14656j;
                if (i13 >= 50 && i13 <= i11) {
                    int i14 = this.f14653g;
                    if (i14 >= 50 && i14 <= i12) {
                        if (i14 == i12 && i13 == i11) {
                            str = "Cannot resize to a full-screen ad.";
                            io0.g(str);
                            iArr = null;
                            if (iArr != null) {
                            }
                        } else {
                            if (this.f14650d) {
                                String str3 = this.f14649c;
                                switch (str3.hashCode()) {
                                    case -1364013995:
                                        if (str3.equals("center")) {
                                            c8 = 2;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    case -1012429441:
                                        if (str3.equals("top-left")) {
                                            c8 = 0;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    case -655373719:
                                        if (str3.equals("bottom-left")) {
                                            c8 = 3;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    case 1163912186:
                                        if (str3.equals("bottom-right")) {
                                            c8 = 5;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    case 1288627767:
                                        if (str3.equals("bottom-center")) {
                                            c8 = 4;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    case 1755462605:
                                        if (str3.equals("top-center")) {
                                            c8 = 1;
                                            break;
                                        }
                                        c8 = 65535;
                                        break;
                                    default:
                                        c8 = 65535;
                                        break;
                                }
                                if (c8 == 0) {
                                    i7 = this.f14651e + this.f14654h;
                                    i8 = this.f14652f;
                                } else if (c8 != 1) {
                                    if (c8 != 2) {
                                        if (c8 == 3) {
                                            i7 = this.f14651e + this.f14654h;
                                            i10 = this.f14652f;
                                        } else if (c8 == 4) {
                                            i7 = ((this.f14651e + this.f14654h) + (i13 >> 1)) - 25;
                                            i10 = this.f14652f;
                                        } else if (c8 != 5) {
                                            i7 = ((this.f14651e + this.f14654h) + i13) - 50;
                                            i8 = this.f14652f;
                                        } else {
                                            i7 = ((this.f14651e + this.f14654h) + i13) - 50;
                                            i10 = this.f14652f;
                                        }
                                        i9 = ((i10 + this.f14655i) + i14) - 50;
                                    } else {
                                        i7 = ((this.f14651e + this.f14654h) + (i13 >> 1)) - 25;
                                        i9 = ((this.f14652f + this.f14655i) + (i14 >> 1)) - 25;
                                    }
                                    if (i7 >= 0 && i7 + 50 <= i11 && i9 >= w6[0] && i9 + 50 <= w6[1]) {
                                        iArr = new int[]{this.f14651e + this.f14654h, this.f14652f + this.f14655i};
                                    }
                                    iArr = null;
                                } else {
                                    i7 = ((this.f14651e + this.f14654h) + (i13 >> 1)) - 25;
                                    i8 = this.f14652f;
                                }
                                i9 = i8 + this.f14655i;
                                if (i7 >= 0) {
                                    iArr = new int[]{this.f14651e + this.f14654h, this.f14652f + this.f14655i};
                                }
                                iArr = null;
                            } else {
                                y2.t.q();
                                int[] z7 = a3.g2.z(this.f14659m);
                                y2.t.q();
                                int[] w7 = a3.g2.w(this.f14659m);
                                int i15 = z7[0];
                                int i16 = this.f14651e + this.f14654h;
                                int i17 = this.f14652f + this.f14655i;
                                if (i16 < 0) {
                                    i16 = 0;
                                } else {
                                    int i18 = this.f14656j;
                                    if (i16 + i18 > i15) {
                                        i16 = i15 - i18;
                                    }
                                }
                                int i19 = w7[0];
                                if (i17 < i19) {
                                    i17 = i19;
                                } else {
                                    int i20 = this.f14653g;
                                    int i21 = i17 + i20;
                                    int i22 = w7[1];
                                    if (i21 > i22) {
                                        i17 = i22 - i20;
                                    }
                                }
                                iArr = new int[]{i16, i17};
                            }
                            if (iArr != null) {
                                c("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            qw.b();
                            int s7 = bo0.s(this.f14659m, this.f14656j);
                            qw.b();
                            int s8 = bo0.s(this.f14659m, this.f14653g);
                            ViewParent parent = ((View) this.f14658l).getParent();
                            if (parent == null || !(parent instanceof ViewGroup)) {
                                c("Webview is detached, probably in the middle of a resize or expand.");
                                return;
                            }
                            ViewGroup viewGroup = (ViewGroup) parent;
                            viewGroup.removeView((View) this.f14658l);
                            PopupWindow popupWindow = this.f14664r;
                            if (popupWindow == null) {
                                this.f14666t = viewGroup;
                                y2.t.q();
                                Object obj = this.f14658l;
                                ((View) obj).setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                                ((View) obj).setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(this.f14659m);
                                this.f14661o = imageView;
                                imageView.setImageBitmap(createBitmap);
                                this.f14660n = this.f14658l.w();
                                this.f14666t.addView(this.f14661o);
                            } else {
                                popupWindow.dismiss();
                            }
                            RelativeLayout relativeLayout = new RelativeLayout(this.f14659m);
                            this.f14665s = relativeLayout;
                            relativeLayout.setBackgroundColor(0);
                            this.f14665s.setLayoutParams(new ViewGroup.LayoutParams(s7, s8));
                            y2.t.q();
                            PopupWindow popupWindow2 = new PopupWindow((View) this.f14665s, s7, s8, false);
                            this.f14664r = popupWindow2;
                            popupWindow2.setOutsideTouchable(false);
                            this.f14664r.setTouchable(true);
                            this.f14664r.setClippingEnabled(!this.f14650d);
                            this.f14665s.addView((View) this.f14658l, -1, -1);
                            this.f14662p = new LinearLayout(this.f14659m);
                            qw.b();
                            int s9 = bo0.s(this.f14659m, 50);
                            qw.b();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(s9, bo0.s(this.f14659m, 50));
                            String str4 = this.f14649c;
                            switch (str4.hashCode()) {
                                case -1364013995:
                                    if (str4.equals("center")) {
                                        c7 = 2;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                case -1012429441:
                                    if (str4.equals("top-left")) {
                                        c7 = 0;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                case -655373719:
                                    if (str4.equals("bottom-left")) {
                                        c7 = 3;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                case 1163912186:
                                    if (str4.equals("bottom-right")) {
                                        c7 = 5;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                case 1288627767:
                                    if (str4.equals("bottom-center")) {
                                        c7 = 4;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                case 1755462605:
                                    if (str4.equals("top-center")) {
                                        c7 = 1;
                                        break;
                                    }
                                    c7 = 65535;
                                    break;
                                default:
                                    c7 = 65535;
                                    break;
                            }
                            try {
                                if (c7 != 0) {
                                    int i23 = 14;
                                    if (c7 == 1) {
                                        layoutParams.addRule(10);
                                    } else {
                                        if (c7 == 2) {
                                            layoutParams.addRule(13);
                                            this.f14662p.setOnClickListener(new xf0(this));
                                            this.f14662p.setContentDescription("Close button");
                                            this.f14665s.addView(this.f14662p, layoutParams);
                                            PopupWindow popupWindow3 = this.f14664r;
                                            View decorView = window.getDecorView();
                                            qw.b();
                                            int s10 = bo0.s(this.f14659m, iArr[0]);
                                            qw.b();
                                            popupWindow3.showAtLocation(decorView, 0, s10, bo0.s(this.f14659m, iArr[1]));
                                            int i24 = iArr[0];
                                            int i25 = iArr[1];
                                            fg0Var = this.f14663q;
                                            if (fg0Var != null) {
                                                fg0Var.b(i24, i25, this.f14656j, this.f14653g);
                                            }
                                            this.f14658l.h0(vv0.b(s7, s8));
                                            int i26 = iArr[0];
                                            int i27 = iArr[1];
                                            y2.t.q();
                                            f(i26, i27 - a3.g2.w(this.f14659m)[0], this.f14656j, this.f14653g);
                                            g("resized");
                                            return;
                                        }
                                        if (c7 == 3) {
                                            layoutParams.addRule(12);
                                        } else if (c7 != 4) {
                                            i23 = 11;
                                            if (c7 != 5) {
                                                layoutParams.addRule(10);
                                            } else {
                                                layoutParams.addRule(12);
                                            }
                                        } else {
                                            layoutParams.addRule(12);
                                        }
                                    }
                                    layoutParams.addRule(i23);
                                    this.f14662p.setOnClickListener(new xf0(this));
                                    this.f14662p.setContentDescription("Close button");
                                    this.f14665s.addView(this.f14662p, layoutParams);
                                    PopupWindow popupWindow32 = this.f14664r;
                                    View decorView2 = window.getDecorView();
                                    qw.b();
                                    int s102 = bo0.s(this.f14659m, iArr[0]);
                                    qw.b();
                                    popupWindow32.showAtLocation(decorView2, 0, s102, bo0.s(this.f14659m, iArr[1]));
                                    int i242 = iArr[0];
                                    int i252 = iArr[1];
                                    fg0Var = this.f14663q;
                                    if (fg0Var != null) {
                                    }
                                    this.f14658l.h0(vv0.b(s7, s8));
                                    int i262 = iArr[0];
                                    int i272 = iArr[1];
                                    y2.t.q();
                                    f(i262, i272 - a3.g2.w(this.f14659m)[0], this.f14656j, this.f14653g);
                                    g("resized");
                                    return;
                                }
                                layoutParams.addRule(10);
                                PopupWindow popupWindow322 = this.f14664r;
                                View decorView22 = window.getDecorView();
                                qw.b();
                                int s1022 = bo0.s(this.f14659m, iArr[0]);
                                qw.b();
                                popupWindow322.showAtLocation(decorView22, 0, s1022, bo0.s(this.f14659m, iArr[1]));
                                int i2422 = iArr[0];
                                int i2522 = iArr[1];
                                fg0Var = this.f14663q;
                                if (fg0Var != null) {
                                }
                                this.f14658l.h0(vv0.b(s7, s8));
                                int i2622 = iArr[0];
                                int i2722 = iArr[1];
                                y2.t.q();
                                f(i2622, i2722 - a3.g2.w(this.f14659m)[0], this.f14656j, this.f14653g);
                                g("resized");
                                return;
                            } catch (RuntimeException e7) {
                                String valueOf = String.valueOf(e7.getMessage());
                                c(valueOf.length() != 0 ? "Cannot show popup window: ".concat(valueOf) : new String("Cannot show popup window: "));
                                this.f14665s.removeView((View) this.f14658l);
                                ViewGroup viewGroup2 = this.f14666t;
                                if (viewGroup2 != null) {
                                    viewGroup2.removeView(this.f14661o);
                                    this.f14666t.addView((View) this.f14658l);
                                    this.f14658l.h0(this.f14660n);
                                }
                                return;
                            }
                            layoutParams.addRule(9);
                            this.f14662p.setOnClickListener(new xf0(this));
                            this.f14662p.setContentDescription("Close button");
                            this.f14665s.addView(this.f14662p, layoutParams);
                        }
                    }
                    str = "Height is too small or too large.";
                    io0.g(str);
                    iArr = null;
                    if (iArr != null) {
                    }
                }
                str = "Width is too small or too large.";
                io0.g(str);
                iArr = null;
                if (iArr != null) {
                }
            }
            c("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void j(int i7, int i8, boolean z6) {
        synchronized (this.f14657k) {
            this.f14651e = i7;
            this.f14652f = i8;
        }
    }

    public final void k(int i7, int i8) {
        this.f14651e = i7;
        this.f14652f = i8;
    }

    public final boolean l() {
        boolean z6;
        synchronized (this.f14657k) {
            z6 = this.f14664r != null;
        }
        return z6;
    }
}
