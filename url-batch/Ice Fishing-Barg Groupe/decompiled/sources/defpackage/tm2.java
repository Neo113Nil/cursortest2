package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class tm2 extends qm2 {
    public final Class OPXfSBeufaJ8;
    public final Method QrzZRwfaDlRX;
    public final Method cpQdD2nAriOS;
    public final Method dgRBjINgWbAK;
    public final Method r3s1LDPKFs1S;
    public final Constructor wdg6QnbFHrFF;
    public final Method x50lh2ztY7Y5;

    public tm2() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = VzNxmvWisHL1(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = rxipThha848g(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.OPXfSBeufaJ8 = cls;
        this.wdg6QnbFHrFF = constructor;
        this.dgRBjINgWbAK = method2;
        this.x50lh2ztY7Y5 = method3;
        this.cpQdD2nAriOS = method4;
        this.r3s1LDPKFs1S = method5;
        this.QrzZRwfaDlRX = method;
    }

    public static Method VzNxmvWisHL1(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean D0aTLcX6Uhyo(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.dgRBjINgWbAK.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean JTxCbbCwomzt(Object obj) {
        try {
            return ((Boolean) this.cpQdD2nAriOS.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface PsecLrZVVK61(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.OPXfSBeufaJ8, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.QrzZRwfaDlRX.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.qm2, defpackage.vi0
    public final Typeface dgRBjINgWbAK(Context context, jc0 jc0Var, Resources resources) {
        Object obj;
        Method method = this.dgRBjINgWbAK;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.dgRBjINgWbAK(context, jc0Var, resources);
        }
        try {
            obj = this.wdg6QnbFHrFF.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            kc0[] kc0VarArr = jc0Var.PxuCJdSBwIXG;
            int length = kc0VarArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    kc0 kc0Var = kc0VarArr[i];
                    String str = kc0Var.PxuCJdSBwIXG;
                    int i2 = kc0Var.e9gEMXR7LXtO;
                    int i3 = kc0Var.lS5Rgt96tfkO;
                    boolean z = kc0Var.TSizfFm2Yiuu;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(kc0Var.Y1f8riQaR6yg);
                    tm2 tm2Var = this;
                    Context context2 = context;
                    if (tm2Var.D0aTLcX6Uhyo(context2, obj, str, i2, i3, z ? 1 : 0, fromFontVariationSettings)) {
                        i++;
                        this = tm2Var;
                        context = context2;
                    } else {
                        try {
                            tm2Var.r3s1LDPKFs1S.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    tm2 tm2Var2 = this;
                    if (tm2Var2.JTxCbbCwomzt(obj)) {
                        return tm2Var2.PsecLrZVVK61(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.vi0
    public final Typeface r3s1LDPKFs1S(Context context, Resources resources, String str) {
        Object obj;
        Method method = this.dgRBjINgWbAK;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.r3s1LDPKFs1S(context, resources, str);
        }
        try {
            obj = this.wdg6QnbFHrFF.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!D0aTLcX6Uhyo(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.r3s1LDPKFs1S.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (JTxCbbCwomzt(obj)) {
                return PsecLrZVVK61(obj);
            }
        }
        return null;
    }

    public Method rxipThha848g(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.qm2, defpackage.vi0
    public final Typeface x50lh2ztY7Y5(Context context, zc0[] zc0VarArr) {
        Object obj;
        Typeface PsecLrZVVK61;
        boolean z;
        if (zc0VarArr.length >= 1) {
            Method method = this.dgRBjINgWbAK;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap hashMap = new HashMap();
                    for (zc0 zc0Var : zc0VarArr) {
                        if (zc0Var.a92UlCVFR9N8 == 0) {
                            Uri uri = zc0Var.PxuCJdSBwIXG;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, xi0.Pf0ThKz3j5YS(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.wdg6QnbFHrFF.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = zc0VarArr.length;
                        int i = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method2 = this.r3s1LDPKFs1S;
                            if (i < length) {
                                zc0 zc0Var2 = zc0VarArr[i];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(zc0Var2.PxuCJdSBwIXG);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.x50lh2ztY7Y5.invoke(obj, byteBuffer, Integer.valueOf(zc0Var2.lS5Rgt96tfkO), null, Integer.valueOf(zc0Var2.TSizfFm2Yiuu), Integer.valueOf(zc0Var2.Y1f8riQaR6yg ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method2.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i++;
                                z2 = z2;
                            } else if (!z2) {
                                method2.invoke(obj, null);
                            } else if (JTxCbbCwomzt(obj) && (PsecLrZVVK61 = PsecLrZVVK61(obj)) != null) {
                                return Typeface.create(PsecLrZVVK61, 0);
                            }
                        }
                    }
                } else {
                    zc0 RfyTYNmI9Srp = vi0.RfyTYNmI9Srp(zc0VarArr);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(RfyTYNmI9Srp.PxuCJdSBwIXG, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(RfyTYNmI9Srp.TSizfFm2Yiuu).setItalic(RfyTYNmI9Srp.Y1f8riQaR6yg).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }
}
