package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vl {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long e(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, boolean z, vk vkVar) {
        int i2 = Integer.MAX_VALUE;
        Object obj = null;
        for (Object obj2 : objArr) {
            int abs = Math.abs(vkVar.a(obj2) - i);
            int i3 = abs + abs + (vkVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i3) {
                obj = obj2;
                i2 = i3;
            }
        }
        return obj;
    }

    public Typeface a(Context context, wh[] whVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (whVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream((Uri) f(whVarArr, i).f);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface m = m(context, inputStream);
            a.r(inputStream);
            return m;
        } catch (IOException unused2) {
            a.r(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            a.r(inputStream2);
            throw th;
        }
    }

    public Typeface b(Context context, brn brnVar, Resources resources, int i) {
        wh whVar = (wh) h((Object[]) brnVar.a, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new vj(0));
        if (whVar == null) {
            return null;
        }
        Typeface a = vd.a(context, resources, whVar.e, (String) whVar.f, 0, i);
        long e = e(a);
        if (e != 0) {
            this.a.put(Long.valueOf(e), brnVar);
        }
        return a;
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File l = pj.l(context);
        Typeface typeface = null;
        if (l == null) {
            return null;
        }
        try {
            if (pj.n(l, resources, i)) {
                typeface = Typeface.createFromFile(l.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            l.delete();
            throw th;
        }
        l.delete();
        return typeface;
    }

    protected wh f(wh[] whVarArr, int i) {
        return (wh) h(whVarArr, 1 != (i & 1) ? 400 : 700, (i & 2) != 0, new vj(1));
    }

    public Typeface g(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface m(Context context, InputStream inputStream) {
        File l = pj.l(context);
        Typeface typeface = null;
        if (l == null) {
            return null;
        }
        try {
            if (pj.m(l, inputStream)) {
                typeface = Typeface.createFromFile(l.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            l.delete();
            throw th;
        }
        l.delete();
        return typeface;
    }
}
