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

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class t92 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c9 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, sg sgVar, boolean z) {
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
            yg1 yg1Var = w03.b;
            Typeface typeface2 = (Typeface) yg1Var.c(w03.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (sgVar != null) {
                    new Handler(Looper.getMainLooper()).post(new q1(19, sgVar, typeface2));
                }
                typeface = typeface2;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        yp0 S = l41.S(resources.getXml(i), resources);
                        if (S == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (sgVar != null) {
                                sgVar.a(-3);
                            }
                        } else {
                            typeface = w03.a(context, S, resources, i, charSequence2, typedValue.assetCookie, i2, sgVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface g = w03.a.g(context, resources, i, charSequence2, i2);
                        if (g != null) {
                            yg1Var.d(w03.b(resources, i, charSequence2, i4, i2), g);
                        }
                        if (sgVar != null) {
                            if (g != null) {
                                new Handler(Looper.getMainLooper()).post(new q1(19, sgVar, g));
                            } else {
                                sgVar.a(-3);
                            }
                        }
                        typeface = g;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (sgVar != null) {
                        sgVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (sgVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (sgVar != null) {
            sgVar.a(-3);
        }
        if (typeface == null || sgVar != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
