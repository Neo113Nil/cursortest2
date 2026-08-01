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

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class v00 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, l70 l70Var, boolean z, boolean z2) {
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
            wr wrVar = n70.b;
            Typeface typeface2 = (Typeface) wrVar.f(n70.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (l70Var != null) {
                    new Handler(Looper.getMainLooper()).post(new c4(l70Var, typeface2, 3));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        uj G = l70.G(resources.getXml(i), resources);
                        if (G == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (l70Var != null) {
                                l70Var.b(-3);
                            }
                        } else {
                            typeface = n70.a(context, G, resources, i, charSequence2, typedValue.assetCookie, i2, l70Var, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface r = n70.a.r(context, resources, i, charSequence2);
                        if (r != null) {
                            wrVar.j(n70.b(resources, i, charSequence2, i4, i2), r);
                        }
                        if (l70Var != null) {
                            if (r != null) {
                                new Handler(Looper.getMainLooper()).post(new c4(l70Var, r, 3));
                            } else {
                                l70Var.b(-3);
                            }
                        }
                        typeface = r;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (l70Var != null) {
                        l70Var.b(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (l70Var != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (l70Var != null) {
            l70Var.b(-3);
        }
        if (typeface == null || l70Var != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
