package com.baidu.platform.comapi.h.t.p;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.baidu.mapapi.VersionInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9302a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f9303b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f9304c;

    /* renamed from: d, reason: collision with root package name */
    private static String f9305d;

    /* renamed from: e, reason: collision with root package name */
    private static String f9306e;

    /* renamed from: f, reason: collision with root package name */
    private static AssetManager f9307f;

    /* renamed from: g, reason: collision with root package name */
    private static Resources f9308g;

    /* renamed from: h, reason: collision with root package name */
    private static Resources f9309h;

    /* renamed from: i, reason: collision with root package name */
    private static Resources.Theme f9310i;

    /* renamed from: j, reason: collision with root package name */
    private static Resources.Theme f9311j;

    /* renamed from: k, reason: collision with root package name */
    private static Field f9312k;

    /* renamed from: l, reason: collision with root package name */
    private static Field f9313l;

    /* renamed from: m, reason: collision with root package name */
    private static Field f9314m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f9315n;

    /* renamed from: o, reason: collision with root package name */
    private static Context f9316o;

    /* renamed from: com.baidu.platform.comapi.h.t.p.a$a, reason: collision with other inner class name */
    static class C0112a implements FilenameFilter {
        C0112a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.f9302a);
            sb.append(".jar");
            return str.startsWith("BaiduBikeNavi_Resource_v") && !str.endsWith(sb.toString());
        }
    }

    static {
        String apiVersion = VersionInfo.getApiVersion();
        f9302a = apiVersion;
        String str = "BaiduBikeNavi_Resource_v" + apiVersion + ".jar";
        f9303b = str;
        f9304c = "BaiduBikeNavi_Resource_v" + apiVersion + ".png";
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/");
        f9305d = sb.toString();
        f9306e = f9305d + str;
        f9307f = null;
        f9308g = null;
        f9309h = null;
        f9310i = null;
        f9311j = null;
        f9312k = null;
        f9313l = null;
        f9314m = null;
        f9315n = false;
    }

    public static String b(Context context, int i8) {
        return f9315n ? e().getString(i8) : context == null ? "" : context.getResources().getString(i8);
    }

    public static boolean c(Context context) {
        if (context == null) {
            Log.d("context == null", "context == null");
            return false;
        }
        f9316o = context;
        if (!com.baidu.platform.comapi.b.a.a.f8739a) {
            return true;
        }
        try {
            boolean d8 = d(context);
            Log.d("tryret", "tryret" + d8);
            return d8;
        } catch (Exception unused) {
            Log.d("catch", "catch");
            return false;
        }
    }

    private static Field d() {
        try {
            Field declaredField = Class.forName("android.app.ContextImpl").getDeclaredField("mResources");
            f9314m = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable th) {
            com.baidu.platform.comapi.h.g.a.c("", th.toString());
        }
        return f9314m;
    }

    public static Resources e() {
        if (f9308g == null) {
            f9308g = f9316o.getResources();
        }
        return f9308g;
    }

    private static Resources.Theme f() {
        if (f9310i == null) {
            if (f9307f == null) {
                f9307f = b(f9306e);
            }
            f9310i = f9308g.newTheme();
            f9310i.applyStyle(a("com.android.internal.R.style.Theme"), true);
        }
        return f9310i;
    }

    public static void g() {
        f9316o = null;
    }

    public static Drawable a(Context context, int i8) {
        return f9315n ? e().getDrawable(i8) : context.getResources().getDrawable(i8);
    }

    private static void b() {
        File[] listFiles = new File(f9305d).listFiles(new C0112a());
        if (listFiles == null || listFiles.length <= 0) {
            return;
        }
        for (File file : listFiles) {
            file.delete();
        }
    }

    public static View a(Activity activity, int i8, ViewGroup viewGroup) {
        if (!f9315n) {
            return LayoutInflater.from(activity).inflate(e().getXml(i8), viewGroup);
        }
        XmlResourceParser xml = f9308g.getXml(i8);
        View view = null;
        try {
            boolean a8 = a(activity);
            view = LayoutInflater.from(activity).inflate(xml, viewGroup);
            if (a8) {
                b(activity);
            }
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                com.baidu.platform.comapi.h.g.a.a("ResUtils", "inflate", th);
            } finally {
                xml.close();
            }
        }
        return view;
    }

    public static boolean d(Context context) {
        if (!a(context)) {
            return false;
        }
        f9315n = true;
        AssetManager b8 = b(f9306e);
        f9307f = b8;
        f9308g = a(context, b8);
        return true;
    }

    public static Animation c(Context context, int i8) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = e().getAnimation(i8);
                return a(context, xmlResourceParser);
            } catch (IOException e8) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                notFoundException.initCause(e8);
                throw notFoundException;
            } catch (XmlPullParserException e9) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i8));
                notFoundException2.initCause(e9);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    private static void b(Context context) {
        f9305d = context.getFilesDir().getAbsolutePath();
        f9306e = f9305d + "/" + f9303b;
    }

    private static AssetManager b(String str) {
        AssetManager assetManager = null;
        try {
            Class<?> cls = Class.forName("android.content.res.AssetManager");
            AssetManager assetManager2 = (AssetManager) cls.getConstructor(null).newInstance(null);
            try {
                cls.getDeclaredMethod("addAssetPath", String.class).invoke(assetManager2, str);
                return assetManager2;
            } catch (Throwable th) {
                th = th;
                assetManager = assetManager2;
                com.baidu.platform.comapi.h.g.a.c("", th.toString());
                return assetManager;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean a(Context context) {
        b(context);
        try {
            InputStream open = context.getResources().getAssets().open(f9304c);
            File file = new File(f9306e);
            long length = file.length();
            int available = open.available();
            if (file.exists() && length == available) {
                open.close();
                return true;
            }
            b();
            FileOutputStream fileOutputStream = new FileOutputStream(new File(f9305d, f9303b));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    open.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(Activity activity) {
        if (f9309h == null) {
            return;
        }
        try {
            f9314m.set(activity.getBaseContext(), f9309h);
            f9312k.set(activity, f9311j);
        } finally {
            try {
            } finally {
            }
        }
    }

    private static Field c() {
        try {
            Field declaredField = Class.forName("android.view.ContextThemeWrapper").getDeclaredField("mTheme");
            f9312k = declaredField;
            declaredField.setAccessible(true);
        } catch (Throwable th) {
            com.baidu.platform.comapi.h.g.a.c("", th.toString());
        }
        return f9312k;
    }

    private static Resources a(Context context, AssetManager assetManager) {
        return new Resources(assetManager, context.getResources().getDisplayMetrics(), context.getResources().getConfiguration());
    }

    public static int a(String str) {
        try {
            String substring = str.substring(0, str.indexOf(".R.") + 2);
            int lastIndexOf = str.lastIndexOf(".");
            String substring2 = str.substring(lastIndexOf + 1, str.length());
            String substring3 = str.substring(0, lastIndexOf);
            return Class.forName(substring + "$" + substring3.substring(substring3.lastIndexOf(".") + 1, substring3.length())).getDeclaredField(substring2).getInt(null);
        } catch (Throwable th) {
            com.baidu.platform.comapi.h.g.a.c("", th.toString());
            return -1;
        }
    }

    public static boolean a(Activity activity) {
        if (f9309h != null) {
            return false;
        }
        try {
            if (f9312k == null) {
                f9312k = c();
            }
            if (f9314m == null) {
                f9314m = d();
            }
            if (f9310i == null) {
                f9310i = f();
            }
            Context baseContext = activity.getBaseContext();
            f9309h = (Resources) f9314m.get(baseContext);
            f9311j = (Resources.Theme) f9312k.get(activity);
            f9314m.set(baseContext, f9308g);
            f9312k.set(activity, f9310i);
            return true;
        } catch (Throwable th) {
            com.baidu.platform.comapi.h.g.a.c("", th.toString());
            return false;
        }
    }

    private static Animation a(Context context, XmlPullParser xmlPullParser) {
        return a(context, xmlPullParser, null, Xml.asAttributeSet(xmlPullParser));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0087, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Animation a(Context context, XmlPullParser xmlPullParser, AnimationSet animationSet, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        Animation animation = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("set")) {
                        AnimationSet animationSet2 = new AnimationSet(context, attributeSet);
                        a(context, xmlPullParser, animationSet2, attributeSet);
                        animation = animationSet2;
                    } else if (name.equals("alpha")) {
                        animation = new AlphaAnimation(context, attributeSet);
                    } else if (name.equals("scale")) {
                        animation = new ScaleAnimation(context, attributeSet);
                    } else if (name.equals("rotate")) {
                        animation = new RotateAnimation(context, attributeSet);
                    } else if (name.equals("translate")) {
                        animation = new TranslateAnimation(context, attributeSet);
                    } else {
                        throw new RuntimeException("Unknown animation name: " + xmlPullParser.getName());
                    }
                    if (animationSet != null) {
                        animationSet.addAnimation(animation);
                    }
                }
            }
        }
    }
}
