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

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class k30 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, b9 b9Var, boolean z, boolean z2) {
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
            fu fuVar = na0.b;
            Typeface typeface2 = (Typeface) fuVar.f(na0.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (b9Var != null) {
                    new Handler(Looper.getMainLooper()).post(new w3(b9Var, typeface2, 3));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        dm O = kr.O(resources.getXml(i), resources);
                        if (O == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (b9Var != null) {
                                b9Var.c(-3);
                            }
                        } else {
                            typeface = na0.a(context, O, resources, i, charSequence2, typedValue.assetCookie, i2, b9Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface n = na0.a.n(context, resources, i, charSequence2);
                        if (n != null) {
                            fuVar.j(na0.b(resources, i, charSequence2, i4, i2), n);
                        }
                        if (b9Var != null) {
                            if (n != null) {
                                new Handler(Looper.getMainLooper()).post(new w3(b9Var, n, 3));
                            } else {
                                b9Var.c(-3);
                            }
                        }
                        typeface = n;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (b9Var != null) {
                        b9Var.c(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (b9Var != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (b9Var != null) {
            b9Var.c(-3);
        }
        if (typeface == null || b9Var != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
