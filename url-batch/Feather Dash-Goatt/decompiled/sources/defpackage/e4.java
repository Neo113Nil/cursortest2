package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Trace;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.feathherdashh.dashgame.MainActivity;
import java.nio.MappedByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e4(p4 p4Var, Typeface typeface) {
        this.d = 7;
        this.e = typeface;
    }

    private final void a() {
        mc mcVar = (mc) this.e;
        synchronized (((ArrayDeque) mcVar.h)) {
            SharedPreferences.Editor edit = ((SharedPreferences) mcVar.d).edit();
            String str = (String) mcVar.e;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) mcVar.h).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) mcVar.g);
            }
            edit.putString(str, sb.toString()).commit();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x022c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x012e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0132, code lost:
    
        throw r0;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int[] iArr;
        int[] iArr2;
        int i = 7;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                k4 k4Var = (k4) this.e;
                Trace.beginSection("measureAndLayout");
                try {
                    k4Var.h.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        k4Var.g();
                        Trace.endSection();
                        k4Var.N = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 1:
                z4 z4Var = (z4) this.e;
                boolean i2 = z4Var.i();
                d4 d4Var = z4Var.d;
                if (i2) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        d4Var.t(true);
                        en0 en0Var = z4Var.p;
                        int[] iArr3 = en0Var.b;
                        long[] jArr = en0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i3 = 0;
                            while (true) {
                                long j = jArr[i3];
                                if ((((~j) << i) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                                    int i5 = 0;
                                    while (i5 < i4) {
                                        if ((255 & j) < 128) {
                                            int i6 = iArr3[(i3 << 3) + i5];
                                            if (!z4Var.h().a(i6)) {
                                                iArr2 = iArr3;
                                                z4Var.h.add(new om(i6, z4Var.o, pm.e, null));
                                                z4Var.l.s(Unit.a);
                                                j >>= 8;
                                                i5++;
                                                iArr3 = iArr2;
                                            }
                                        }
                                        iArr2 = iArr3;
                                        j >>= 8;
                                        i5++;
                                        iArr3 = iArr2;
                                    }
                                    iArr = iArr3;
                                    if (i4 == 8) {
                                    }
                                } else {
                                    iArr = iArr3;
                                }
                                if (i3 != length) {
                                    i3++;
                                    i = 7;
                                    iArr3 = iArr;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        z4Var.k(d4Var.getSemanticsOwner().a(), z4Var.q);
                        Trace.endSection();
                        z4Var.f(z4Var.h());
                        z4Var.n();
                        z4Var.r = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 2:
                ((MainActivity) this.e).invalidateOptionsMenu();
                return;
            case 3:
                vj vjVar = (vj) this.e;
                Runnable runnable = vjVar.e;
                if (runnable != null) {
                    runnable.run();
                    vjVar.e = null;
                    return;
                }
                return;
            case 4:
                g20 g20Var = (g20) this.e;
                synchronized (g20Var.h) {
                    try {
                        if (g20Var.l == null) {
                            return;
                        }
                        try {
                            z20 c = g20Var.c();
                            int i7 = c.e;
                            if (i7 == 2) {
                                synchronized (g20Var.h) {
                                }
                            }
                            if (i7 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                j41 j41Var = g20Var.g;
                                Context context = g20Var.d;
                                j41Var.getClass();
                                Typeface a = wj1.a(context, new z20[]{c});
                                MappedByteBuffer u = t90.u(g20Var.d, c.a);
                                if (u == null || a == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                o91 o91Var = new o91(a, xa0.t(u));
                                Trace.endSection();
                                synchronized (g20Var.h) {
                                    try {
                                        la0 la0Var = g20Var.l;
                                        if (la0Var != null) {
                                            la0Var.P(o91Var);
                                        }
                                    } finally {
                                    }
                                }
                                g20Var.a();
                                return;
                            } finally {
                            }
                        } catch (Throwable th) {
                            synchronized (g20Var.h) {
                                try {
                                    la0 la0Var2 = g20Var.l;
                                    if (la0Var2 != null) {
                                        la0Var2.O(th);
                                    }
                                    g20Var.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case ry0.STRING_FIELD_NUMBER /* 5 */:
                x80 x80Var = (x80) this.e;
                if (x80Var.hasFocus() && x80Var.isAttachedToWindow()) {
                    AccessibilityNodeProvider accessibilityNodeProvider = x80Var.getAccessibilityNodeProvider();
                    AccessibilityNodeInfo findFocus = accessibilityNodeProvider != null ? accessibilityNodeProvider.findFocus(1) : null;
                    if (findFocus == null || !findFocus.performAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN.getId())) {
                        x80Var.evaluateJavascript("\n    (function() {\n      var node = document.activeElement;\n      var depth = 0;\n      while (node && depth++ < 8) {\n        var nested = node.shadowRoot && node.shadowRoot.activeElement;\n        if (nested) {\n          node = nested;\n          continue;\n        }\n        if (node.tagName === 'IFRAME') {\n          try {\n            nested = node.contentDocument && node.contentDocument.activeElement;\n          } catch (ignored) {\n            nested = null;\n          }\n          if (nested) {\n            node = nested;\n            continue;\n          }\n        }\n        break;\n      }\n      if (node && node.scrollIntoView) {\n        node.scrollIntoView({block: 'center', inline: 'nearest', behavior: 'auto'});\n      }\n    })();\n", null);
                        return;
                    }
                    return;
                }
                return;
            case ry0.STRING_SET_FIELD_NUMBER /* 6 */:
                hz0 hz0Var = (hz0) this.e;
                xg0 xg0Var = hz0Var.j;
                if (hz0Var.e == 0) {
                    hz0Var.g = true;
                    xg0Var.d(ng0.ON_PAUSE);
                }
                if (hz0Var.d == 0 && hz0Var.g) {
                    xg0Var.d(ng0.ON_STOP);
                    hz0Var.h = true;
                    return;
                }
                return;
            case ry0.DOUBLE_FIELD_NUMBER /* 7 */:
                i31 i31Var = k31.d;
                throw null;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                a41.setRippleState$lambda$1((a41) this.e);
                return;
            case 9:
                a();
                return;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                ((lo1) this.e).invoke();
                return;
            case RequestError.STOP_TRACKING /* 11 */:
                eq1 eq1Var = (eq1) this.e;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + eq1Var.a.getAction() + " finishing.");
                eq1Var.b.c(null);
                return;
            default:
                o91 o91Var2 = (o91) this.e;
                ((b51) o91Var2.h).f(new m2(i, o91Var2));
                return;
        }
    }

    public /* synthetic */ e4(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
