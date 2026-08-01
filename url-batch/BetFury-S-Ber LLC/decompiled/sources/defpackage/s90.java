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

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class s90 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i2, bi biVar, boolean z, boolean z2) {
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
            fz fzVar = ik0.b;
            Typeface typeface2 = (Typeface) fzVar.f(ik0.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (biVar != null) {
                    new Handler(Looper.getMainLooper()).post(new e4(biVar, typeface2, 3));
                }
                typeface = typeface2;
            } else if (!z2) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        jp A = gk0.A(resources.getXml(i), resources);
                        if (A == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (biVar != null) {
                                biVar.k(-3);
                            }
                        } else {
                            typeface = ik0.a(context, A, resources, i, charSequence2, typedValue.assetCookie, i2, biVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface h = ik0.a.h(context, resources, i, charSequence2);
                        if (h != null) {
                            fzVar.j(ik0.b(resources, i, charSequence2, i4, i2), h);
                        }
                        if (biVar != null) {
                            if (h != null) {
                                new Handler(Looper.getMainLooper()).post(new e4(biVar, h, 3));
                            } else {
                                biVar.k(-3);
                            }
                        }
                        typeface = h;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    if (biVar != null) {
                        biVar.k(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    if (biVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (biVar != null) {
            biVar.k(-3);
        }
        if (typeface == null || biVar != null || z2) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
