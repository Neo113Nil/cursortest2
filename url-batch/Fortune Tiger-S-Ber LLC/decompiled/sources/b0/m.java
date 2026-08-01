package b0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import b1.k1;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f716a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f717b = new WeakHashMap(0);
    public static final Object c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i4, TypedValue typedValue, int i5, b bVar, boolean z3, boolean z4) {
        Resources resources = context.getResources();
        resources.getValue(i4, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i4) + "\" (" + Integer.toHexString(i4) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i6 = typedValue.assetCookie;
            k1 k1Var = c0.f.f985b;
            Typeface typeface2 = (Typeface) k1Var.f(c0.f.b(resources, i4, charSequence2, i6, i5));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new androidx.activity.n(bVar, typeface2, 1));
                }
                typeface = typeface2;
            } else if (!z4) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        e i7 = b.i(resources.getXml(i4), resources);
                        if (i7 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = c0.f.a(context, i7, resources, i4, charSequence2, typedValue.assetCookie, i5, bVar, z3);
                        }
                    } else {
                        int i8 = typedValue.assetCookie;
                        Typeface t3 = c0.f.f984a.t(context, resources, i4, charSequence2, i5);
                        if (t3 != null) {
                            k1Var.j(c0.f.b(resources, i4, charSequence2, i8, i5), t3);
                        }
                        if (bVar != null) {
                            if (t3 != null) {
                                new Handler(Looper.getMainLooper()).post(new androidx.activity.n(bVar, t3, 1));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = t3;
                    }
                } catch (IOException e4) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e4);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e5) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e5);
                    if (bVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typeface == null || bVar != null || z4) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i4) + " could not be retrieved.");
    }
}
