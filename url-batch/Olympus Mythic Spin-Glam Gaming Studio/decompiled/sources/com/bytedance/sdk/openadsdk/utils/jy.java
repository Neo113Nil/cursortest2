package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class jy {
    private static int btk = -1;
    private static int bvs = -1;
    private static int fb = -1;
    private static int fs = -1;
    private static int hhw = -1;
    private static float iv = -1.0f;
    private static final Object klz = new Object();
    private static boolean mw = true;
    private static WindowManager nps = null;
    private static Boolean rc = null;
    private static ViewConfiguration zg = null;
    private static float zmn = -1.0f;
    private static float zn = -1.0f;

    private static boolean zmn(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private static boolean zn() {
        return zmn < 0.0f || fs < 0 || zn < 0.0f || fb < 0 || btk < 0;
    }

    public static void zmn(Context context) {
        zmn(context, false);
    }

    public static void zmn(Context context, boolean z) {
        Context zmn2 = context == null ? com.bytedance.sdk.openadsdk.core.kgc.zmn() : context;
        if (zmn2 == null) {
            return;
        }
        nps = (WindowManager) zmn2.getSystemService("window");
        if (zn() || z) {
            DisplayMetrics displayMetrics = zmn2.getResources().getDisplayMetrics();
            zmn = displayMetrics.density;
            fs = displayMetrics.densityDpi;
            zn = displayMetrics.scaledDensity;
            fb = displayMetrics.widthPixels;
            btk = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i = fb;
            int i2 = btk;
            if (i > i2) {
                fb = i2;
                btk = i;
            }
        } else {
            int i3 = fb;
            int i4 = btk;
            if (i3 < i4) {
                fb = i4;
                btk = i3;
            }
        }
        hhw = configuration.smallestScreenWidthDp;
    }

    public static float zmn(Context context, float f) {
        zmn(context);
        return f * bvs(context);
    }

    public static int fs(Context context, float f) {
        if (f == 0.0f) {
            return 0;
        }
        return Float.valueOf(zmn(context, f, true)).intValue();
    }

    public static float zmn(Context context, float f, boolean z) {
        zmn(context);
        return (f * zg(context)) + (z ? 0.5f : 0.0f);
    }

    public static int zn(Context context, float f) {
        zmn(context, true);
        float zg2 = zg(context);
        if (zg2 <= 0.0f) {
            zg2 = 1.0f;
        }
        return (int) ((f / zg2) + 0.5f);
    }

    public static int[] fs(Context context) {
        if (context == null) {
            return null;
        }
        if (nps == null) {
            nps = (WindowManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = nps;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int zn(Context context) {
        zmn(context);
        return fb;
    }

    public static int fb(Context context) {
        zmn(context);
        return zn(context, fb);
    }

    public static int btk(Context context) {
        zmn(context);
        return btk;
    }

    public static int hhw(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
        if (context == null) {
            return hhw;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            hhw = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return hhw;
    }

    public static int nps(Context context) {
        zmn(context);
        return zn(context, btk);
    }

    public static float zg(Context context) {
        zmn(context, true);
        return zmn;
    }

    public static float bvs(Context context) {
        zmn(context);
        return zn;
    }

    public static int iv(Context context) {
        zmn(context);
        return fs;
    }

    @Nullable
    public static int[] zmn(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] fs(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    @Nullable
    public static int[] zn(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void zmn(View view, int i) {
        if (view == null || view.getVisibility() == i || !zmn(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean fb(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void zmn(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void zmn(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        zmn(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void zmn(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static Bitmap zmn(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    public static void btk(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.jy.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    jy.zmn(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static void hhw(View view) {
        if (view == null) {
            return;
        }
        zmn(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.jy.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static Pair<Integer, Integer> rc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.kgc.zmn();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int klz(Context context) {
        return ((Integer) rc(context).second).intValue();
    }

    public static int mw(Context context) {
        return ((Integer) rc(context).first).intValue();
    }

    public static float zmn() {
        float f = iv;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.kgc.zmn().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        iv = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void zmn(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e.getMessage());
        }
    }

    public static void fs(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static boolean zn(Activity activity) {
        if (rc == null) {
            synchronized (klz) {
                try {
                    if (rc == null) {
                        String zmn2 = com.bytedance.sdk.openadsdk.uqh.btk.zmn("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(zmn2) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(zmn2);
                                for (int i = 0; i < jSONArray.length(); i++) {
                                    if (str.equals(jSONArray.getString(i))) {
                                        rc = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e) {
                                com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e.getMessage());
                            }
                        }
                        rc = Boolean.valueOf(fb(activity) || zmn("ro.miui.notch", activity) == 1 || rt(activity) || kgc(activity) || cn(activity) || cyb(activity) || olo(activity));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return rc.booleanValue();
    }

    public static boolean fs() {
        return mw && Build.VERSION.SDK_INT >= 28;
    }

    public static boolean fb(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
                mw = false;
            } else {
                displayCutout = null;
            }
            return displayCutout != null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e.getMessage());
            return false;
        }
    }

    public static int zmn(String str, Activity activity) {
        if (!zak.hhw()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e.getMessage());
            return 0;
        } catch (IllegalAccessException e2) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e2.getMessage());
            return 0;
        } catch (IllegalArgumentException e3) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e3.getMessage());
            return 0;
        } catch (NoSuchMethodException e4) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e4.getMessage());
            return 0;
        } catch (InvocationTargetException e5) {
            com.bytedance.sdk.component.utils.iqz.zn("UIUtils", e5.getMessage());
            return 0;
        }
    }

    public static boolean rt(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", null).invoke(loadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean cn(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean cyb(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static boolean olo(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean kgc(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void zmn(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.iqz.zn("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void zmn(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.iqz.zn("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void zmn(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void zmn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar) {
        zmn(textView, cybVar, nqiVar, 14);
    }

    public static void zmn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, int i) {
        zmn(textView, cybVar, (nqiVar == null || nqiVar.pw() == null) ? -1.0d : nqiVar.pw().fb(), i);
    }

    public static void zmn(TextView textView, com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            cybVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            zmn(cybVar, d, i);
        }
    }

    public static void zmn(com.bytedance.sdk.openadsdk.core.widget.cyb cybVar, double d, int i) {
        if (d < 0.0d) {
            cybVar.setVisibility(8);
        } else {
            cybVar.setVisibility(0);
            cybVar.zmn(d, i);
        }
    }

    public static Bitmap zmn(com.bytedance.sdk.component.bvs.nps npsVar) {
        WebView webView = npsVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap fs2 = fs(npsVar);
        if (fs2 == null) {
            fs2 = zmn(webView);
        }
        webView.setLayerType(layerType, null);
        if (fs2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.fb.zmn(fs2, fs2.getWidth() / 6, fs2.getHeight() / 6);
    }

    public static void zmn(final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        nu.fs(new com.bytedance.sdk.component.zg.fs.zn("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.jy.3
            @Override // java.lang.Runnable
            public void run() {
                jy.zn(nqiVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zn(final com.bytedance.sdk.openadsdk.core.model.nqi nqiVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.fb.zn.zmn(System.currentTimeMillis(), nqiVar, str, str2, new com.bytedance.sdk.openadsdk.cyb.fs.zmn() { // from class: com.bytedance.sdk.openadsdk.utils.jy.4
                        @Override // com.bytedance.sdk.openadsdk.cyb.fs.zmn, com.bytedance.sdk.openadsdk.cyb.fs.fs
                        public JSONObject zn() {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int zmn2 = jy.zmn(bitmap);
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", zmn2 == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.am.fs(nqiVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.cn.zn.zmn.zmn().zmn(nqiVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zn("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static Bitmap fs(com.bytedance.sdk.component.bvs.nps npsVar) {
        if (npsVar == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(npsVar.getWidth(), npsVar.getHeight(), Bitmap.Config.RGB_565);
            npsVar.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int zmn(Bitmap bitmap) {
        try {
            ArrayList<Integer> fs2 = fs(bitmap);
            if (fs2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = fs2.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((i2 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static ArrayList<Integer> fs(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void fs(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.jy.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    public static void nps(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean zmn(float f, float f2, Context context) {
        if (f != -1.0f && f2 != -1.0f) {
            if (zg == null) {
                zg = ViewConfiguration.get(context);
            }
            if (bvs == -1) {
                bvs = zg.getScaledTouchSlop();
            }
            if (f - f2 > bvs) {
                return true;
            }
        }
        return false;
    }

    public static void zmn(boolean z) {
        rc = Boolean.valueOf(z);
    }
}
