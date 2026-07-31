package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.b8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.h7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import com.ironsource.pj;
import com.ironsource.zb;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17627a = "BANNER";

    /* renamed from: b, reason: collision with root package name */
    public static final String f17628b = "LARGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f17629c = "RECTANGLE";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17630d = "LEADERBOARD";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17631e = "SMART";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17632f = "CUSTOM";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17633g = "MEDIUM_RECTANGLE";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17634h = "bannerAdSize";

    /* renamed from: i, reason: collision with root package name */
    public static final int f17635i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f17636j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17637k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17638l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17639m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17640n = 5;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17641o = 6;

    /* renamed from: p, reason: collision with root package name */
    public static final int f17642p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static final String f17643q = "Adaptive=true";

    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    interface b {
        void a();

        void a(String str);
    }

    public static int a(int i4) {
        int i5 = -1;
        for (AbstractAdapter abstractAdapter : c.b().a().values()) {
            try {
                int adaptiveHeight = abstractAdapter.getAdaptiveHeight(i4);
                if (adaptiveHeight > i5) {
                    i5 = adaptiveHeight;
                }
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog.INTERNAL.error("exception while calling getAdaptiveHeight for adapter - " + abstractAdapter.getProviderName());
            }
        }
        a(i4, i5);
        IronLog.API.verbose("maximal height - " + i5 + " for width - " + i4);
        return i5;
    }

    static boolean c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    static long a(long j4, long j5) {
        return j5 - (new Date().getTime() - j4);
    }

    public static int b(int i4) {
        if (p.m().O()) {
            return a(i4);
        }
        IronLog.API.error("The mediation must be successfully initiated before calling this API");
        return -1;
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f17630d, 728, 90);
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f17631e, 728, 90);
        }
        return a(f17631e, 320, 50);
    }

    public static ISBannerSize a(String str, int i4, int i5) {
        return new ISBannerSize(str, i4, i5);
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize b4 = b();
        b4.setContainerParams(size.containerParams);
        b4.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(b4);
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.containerParams.getWidth() + "x" + iSBannerSize.containerParams.getHeight() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    private static void a(int i4, int i5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i5 == -1) {
                jSONObject.put("errorCode", 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i4 + ",h:" + i5);
            }
            pj.i().a(new zb(IronSourceConstants.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.a();
        }
    }

    private static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, Context context, ISBannerSize iSBannerSize) {
        int dpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int dpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPixels, dpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(dpToPixels, dpToPixels2);
        }
        layoutParams2.height = dpToPixels2;
        layoutParams2.width = dpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        a(ironSourceBannerLayout, view, layoutParams, (b8) null);
    }

    public static void a(final IronSourceBannerLayout ironSourceBannerLayout, final View view, final FrameLayout.LayoutParams layoutParams, final b8 b8Var) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = ironSourceBannerLayout.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.A
            @Override // java.lang.Runnable
            public final void run() {
                l.a(IronSourceBannerLayout.this, view, size, applicationContext, layoutParams, b8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(IronSourceBannerLayout ironSourceBannerLayout, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, b8 b8Var) {
        try {
            ironSourceBannerLayout.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
            if (b8Var != null) {
                b8Var.a();
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e4));
        }
    }

    static void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, b bVar) {
        String str;
        if (c(ironSourceBannerLayout)) {
            str = null;
        } else {
            str = String.format("can't load banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed");
        }
        if (h7Var == null || TextUtils.isEmpty(h7Var.getPlacementName())) {
            str = String.format("can't load banner - %s", h7Var == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    static void a(IronSourceBannerLayout ironSourceBannerLayout, b bVar) {
        if (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) {
            bVar.a(String.format("can't destroy banner - %s", ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed"));
        } else {
            bVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:4:0x0004, B:5:0x0011, B:16:0x0062, B:17:0x00a6, B:19:0x00ac, B:21:0x00b6, B:22:0x00d2, B:27:0x008b, B:28:0x00a3, B:29:0x0090, B:30:0x0095, B:31:0x009a, B:32:0x009f, B:33:0x0015, B:36:0x001f, B:39:0x0029, B:42:0x0033, B:45:0x003d, B:48:0x0047), top: B:3:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        char c4;
        int i4;
        if (iSBannerSize == null) {
            return;
        }
        try {
            String description = iSBannerSize.getDescription();
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(f17629c)) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 72205083:
                    if (description.equals(f17628b)) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 79011241:
                    if (description.equals(f17631e)) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 446888797:
                    if (description.equals(f17630d)) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1951953708:
                    if (description.equals(f17627a)) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1999208305:
                    if (description.equals(f17632f)) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            if (c4 == 0) {
                i4 = 1;
            } else if (c4 == 1) {
                i4 = 2;
            } else if (c4 == 2) {
                i4 = 3;
            } else if (c4 == 3) {
                i4 = 4;
            } else {
                if (c4 != 4) {
                    if (c4 == 5) {
                        map.put(f17634h, 6);
                        map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                    }
                    if (iSBannerSize.isAdaptive()) {
                        return;
                    }
                    String a4 = a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        a4 = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, a4);
                    return;
                }
                i4 = 5;
            }
            map.put(f17634h, i4);
            if (iSBannerSize.isAdaptive()) {
            }
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(Log.getStackTraceString(e4));
        }
    }

    public static boolean a(ISContainerParams iSContainerParams, int i4, int i5) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        }
        if (iSContainerParams.getWidth() >= i4 && iSContainerParams.getHeight() >= i5) {
            return true;
        }
        IronLog.API.warning("Container size too small: Banner may not display correctly.");
        return true;
    }
}
