package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UIUtils.java */
/* loaded from: classes2.dex */
public class Pj {
    private static int Jd = -1;
    private static final Object Mxy = new Object();
    private static int NB = -1;
    private static int icD = -1;
    private static float pvs = -1.0f;
    private static WindowManager sUS = null;
    private static Boolean so = null;
    private static float vG = -1.0f;
    private static float yiw = -1.0f;

    private static boolean pvs(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    private static boolean icD() {
        return pvs < 0.0f || icD < 0 || vG < 0.0f || Jd < 0 || NB < 0;
    }

    public static void pvs(Context context) {
        pvs(context, false);
    }

    public static void pvs(Context context, boolean z) {
        Context pvs2 = context == null ? com.bytedance.sdk.openadsdk.core.mnm.pvs() : context;
        if (pvs2 == null) {
            return;
        }
        sUS = (WindowManager) pvs2.getSystemService("window");
        if (icD() || z) {
            DisplayMetrics displayMetrics = pvs2.getResources().getDisplayMetrics();
            pvs = displayMetrics.density;
            icD = displayMetrics.densityDpi;
            vG = displayMetrics.scaledDensity;
            Jd = displayMetrics.widthPixels;
            NB = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i = Jd;
            int i2 = NB;
            if (i > i2) {
                Jd = i2;
                NB = i;
                return;
            }
            return;
        }
        int i3 = Jd;
        int i4 = NB;
        if (i3 < i4) {
            Jd = i4;
            NB = i3;
        }
    }

    public static int pvs(Context context, float f) {
        pvs(context);
        float sUS2 = sUS(context);
        if (sUS2 <= 0.0f) {
            sUS2 = 1.0f;
        }
        return (int) ((f / sUS2) + 0.5f);
    }

    public static int icD(Context context, float f) {
        return Float.valueOf(pvs(context, f, true)).intValue();
    }

    public static float pvs(Context context, float f, boolean z) {
        pvs(context);
        return (f * NB(context)) + (z ? 0.5f : 0.0f);
    }

    public static int vG(Context context, float f) {
        pvs(context, true);
        float NB2 = NB(context);
        if (NB2 <= 0.0f) {
            NB2 = 1.0f;
        }
        return (int) ((f / NB2) + 0.5f);
    }

    public static int[] icD(Context context) {
        if (context == null) {
            return null;
        }
        if (sUS == null) {
            sUS = (WindowManager) com.bytedance.sdk.openadsdk.core.mnm.pvs().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = sUS;
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

    public static int vG(Context context) {
        pvs(context);
        return Jd;
    }

    public static int Jd(Context context) {
        pvs(context);
        return NB;
    }

    public static float NB(Context context) {
        pvs(context, true);
        return pvs;
    }

    public static float sUS(Context context) {
        pvs(context);
        return vG;
    }

    public static int yiw(Context context) {
        pvs(context);
        return icD;
    }

    public static void pvs(View view, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i;
        rect.bottom += i2;
        rect.left -= i3;
        rect.right += i4;
        ((View) view.getParent()).setTouchDelegate(new com.bytedance.sdk.component.utils.yiw(rect, view));
    }

    public static int[] pvs(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] icD(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static int[] vG(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void pvs(View view, int i) {
        if (view == null || view.getVisibility() == i || !pvs(i)) {
            return;
        }
        view.setVisibility(i);
    }

    public static boolean Jd(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static void pvs(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    public static void icD(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        pvs(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    private static void pvs(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
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

    private static Bitmap pvs(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    public static void NB(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.Pj.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    Pj.pvs(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static void sUS(View view) {
        if (view == null) {
            return;
        }
        pvs(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.Pj.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static Pair<Integer, Integer> so(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.mnm.pvs();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int Mxy(Context context) {
        return ((Integer) so(context).second).intValue();
    }

    public static int Wyp(Context context) {
        return ((Integer) so(context).first).intValue();
    }

    public static float pvs() {
        float f = yiw;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.mnm.pvs().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        yiw = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void pvs(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e.getMessage());
        }
    }

    public static void icD(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static boolean vG(Activity activity) {
        if (so == null) {
            synchronized (Mxy) {
                if (so == null) {
                    boolean z = true;
                    if (!Jd(activity) && pvs("ro.miui.notch", activity) != 1 && !qh(activity) && !bNS(activity) && !kj(activity) && !Ju(activity) && !IP(activity)) {
                        z = false;
                    }
                    so = Boolean.valueOf(z);
                }
            }
        }
        return so.booleanValue();
    }

    public static boolean Jd(Activity activity) {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        try {
            WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
            return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e.getMessage());
            return false;
        }
    }

    public static int pvs(String str, Activity activity) {
        if (!ny.NB()) {
            return 0;
        }
        try {
            Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
            return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
        } catch (ClassNotFoundException e) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e.getMessage());
            return 0;
        } catch (IllegalAccessException e2) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e2.getMessage());
            return 0;
        } catch (IllegalArgumentException e3) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e3.getMessage());
            return 0;
        } catch (NoSuchMethodException e4) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e4.getMessage());
            return 0;
        } catch (InvocationTargetException e5) {
            com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", e5.getMessage());
            return 0;
        }
    }

    public static boolean qh(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean kj(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean Ju(Context context) {
        return Build.MODEL.equals("IN2010") || Build.MODEL.equals("IN2020") || Build.MODEL.equals("KB2000") || Build.MODEL.startsWith("ONEPLUS");
    }

    public static boolean IP(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", TypedValues.Custom.S_STRING, "android");
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

    public static boolean bNS(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void pvs(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.Ju.pvs("OnclickListener ", str + " is null , can not set OnClickListener !!!");
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    public static void pvs(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.Ju.pvs("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
        } else {
            view.setOnTouchListener(onTouchListener);
        }
    }

    public static void pvs(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    public static void pvs(TextView textView, TTRatingBar2 tTRatingBar2, com.bytedance.sdk.openadsdk.core.model.cR cRVar) {
        pvs(textView, tTRatingBar2, cRVar, 14);
    }

    public static void pvs(TextView textView, TTRatingBar2 tTRatingBar2, com.bytedance.sdk.openadsdk.core.model.cR cRVar, int i) {
        pvs(textView, tTRatingBar2, (cRVar == null || cRVar.Ca() == null) ? -1.0d : cRVar.Ca().Jd(), i);
    }

    public static void pvs(TextView textView, TTRatingBar2 tTRatingBar2, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
            }
            pvs(tTRatingBar2, d, i);
        }
    }

    public static void pvs(TTRatingBar2 tTRatingBar2, double d, int i) {
        if (d < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            tTRatingBar2.setVisibility(8);
        } else {
            tTRatingBar2.setVisibility(0);
            tTRatingBar2.pvs(d, i);
        }
    }

    public static void pvs(TextView textView, com.bytedance.sdk.openadsdk.core.model.cR cRVar, Context context, String str) {
        pvs(textView, cRVar.Ca() != null ? cRVar.Ca().NB() : -1, context, str);
    }

    public static void pvs(TextView textView, int i, Context context, String str) {
        textView.setText(String.format(com.bytedance.sdk.component.utils.uc.pvs(context, str), i > 10000 ? (i / 1000) + "k" : String.valueOf(i)));
        if (i == -1) {
            textView.setVisibility(8);
        }
    }

    public static Bitmap pvs(SSWebView sSWebView) {
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap icD2 = icD(sSWebView);
        if (icD2 == null) {
            icD2 = pvs(webView);
        }
        webView.setLayerType(layerType, null);
        if (icD2 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.Jd.pvs(icD2, icD2.getWidth() / 6, icD2.getHeight() / 6);
    }

    public static void pvs(final com.bytedance.sdk.openadsdk.core.model.cR cRVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        ae.icD(new com.bytedance.sdk.component.so.so("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.Pj.3
            @Override // java.lang.Runnable
            public void run() {
                Pj.vG(cRVar, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void vG(final com.bytedance.sdk.openadsdk.core.model.cR cRVar, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.icD.vG.pvs(System.currentTimeMillis(), cRVar, str, str2, new com.bytedance.sdk.openadsdk.Wyp.vG.pvs() { // from class: com.bytedance.sdk.openadsdk.utils.Pj.4
                        @Override // com.bytedance.sdk.openadsdk.Wyp.vG.pvs
                        public JSONObject pvs() {
                            try {
                                int pvs2 = Pj.pvs(bitmap);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(ImagesContract.URL, str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", pvs2 == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.rCZ.icD(cRVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.video.icD.pvs.pvs().pvs(cRVar) ? 1 : 0);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    private static Bitmap icD(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int pvs(Bitmap bitmap) {
        try {
            ArrayList<Integer> icD2 = icD(bitmap);
            if (icD2 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = icD2.iterator();
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

    private static ArrayList<Integer> icD(Bitmap bitmap) {
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

    public static void icD(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.Pj.5
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

    public static void yiw(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }
}
