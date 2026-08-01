package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.lang.reflect.Method;

/* compiled from: ResourceHelp.java */
/* loaded from: classes.dex */
public final class uc {
    private static String Jd = null;
    private static boolean NB = false;
    private static String icD = null;
    private static Context pvs = null;
    private static boolean sUS = false;
    private static Resources vG;

    public static void pvs(Context context) {
        pvs = context;
    }

    public static void pvs(String str) {
        Jd = str;
    }

    private static String Jd(Context context) {
        if (Jd == null) {
            Jd = context.getPackageName();
        }
        return Jd;
    }

    private static int pvs(Context context, String str, String str2) {
        int identifier = icD(context).getIdentifier(str, str2, Jd(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!NB) {
            vG(context);
            return icD(context).getIdentifier(str, str2, Jd(context));
        }
        return context.getResources().getIdentifier(str, str2, Jd(context));
    }

    public static String pvs(Context context, String str) {
        return icD(context).getString(icD(context, str));
    }

    public static int icD(Context context, String str) {
        return pvs(context, str, TypedValues.Custom.S_STRING);
    }

    public static Drawable vG(Context context, String str) {
        return icD(context).getDrawable(Jd(context, str));
    }

    public static int Jd(Context context, String str) {
        return pvs(context, str, "drawable");
    }

    public static int NB(Context context, String str) {
        return pvs(context, str, FacebookMediationAdapter.KEY_ID);
    }

    public static int sUS(Context context, String str) {
        return pvs(context, str, "style");
    }

    public static int yiw(Context context, String str) {
        return pvs(context, str, "dimen");
    }

    public static int so(Context context, String str) {
        return icD(context).getColor(Mxy(context, str));
    }

    public static int Mxy(Context context, String str) {
        return pvs(context, str, TypedValues.Custom.S_COLOR);
    }

    public static int Wyp(Context context, String str) {
        return pvs(context, str, "anim");
    }

    public static int qh(Context context, String str) {
        return pvs(context, str, TypedValues.Custom.S_INT);
    }

    public static int kj(Context context, String str) {
        return icD(context).getInteger(qh(context, str));
    }

    public static Resources icD(Context context) {
        Resources resources = vG;
        if (resources == null) {
            resources = null;
        }
        Context context2 = pvs;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void vG(Context context) {
        synchronized (uc.class) {
            try {
                if (TextUtils.isEmpty(icD)) {
                    return;
                }
                Resources resources = context.getResources();
                vG = new Resources(icD(resources.getAssets(), icD + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
                Jd = context.getPackageName();
                NB = true;
            } catch (Throwable th) {
                Log.e("ResourceHelp", "makePluginResources failed", th);
            }
        }
    }

    private static AssetManager icD(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            pvs(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            pvs(assetManager, str);
        }
        try {
            dX.pvs(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    public static boolean pvs(AssetManager assetManager, String str) {
        Method pvs2 = dX.pvs((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (pvs2 == null) {
            pvs2 = dX.pvs((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (pvs2 != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                }
                if (((Integer) pvs2.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                }
                i = i2;
            }
        }
        return false;
    }
}
