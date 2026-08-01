package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class f00 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, jw jwVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            ir irVar = g70.b;
            Typeface typeface2 = (Typeface) irVar.h(g70.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (jwVar != null) {
                    new Handler(Looper.getMainLooper()).post(new m3(jwVar, typeface2, 3));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        zj d0 = o8.d0(resources.getXml(i), resources);
                        if (d0 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (jwVar != null) {
                                jwVar.l(-3);
                            }
                        } else {
                            typeface = g70.a(context, d0, resources, i, charSequence2, typedValue.assetCookie, i2, jwVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface p = g70.a.p(context, resources, i, charSequence2);
                        if (p != null) {
                            irVar.o(g70.b(resources, i, charSequence2, i4, i2), p);
                        }
                        if (jwVar != null) {
                            if (p != null) {
                                new Handler(Looper.getMainLooper()).post(new m3(jwVar, p, 3));
                            } else {
                                jwVar.l(-3);
                            }
                        }
                        typeface = p;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (jwVar != null) {
                        jwVar.l(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (jwVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (jwVar != null) {
            jwVar.l(-3);
        }
        if (typeface == null || jwVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
