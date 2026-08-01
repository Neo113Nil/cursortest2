package e0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import g1.y1;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1339a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f1340b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1341c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i4, b bVar, boolean z4, boolean z5) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i5 = typedValue.assetCookie;
            y1 y1Var = f0.f.f1421b;
            Typeface typeface2 = (Typeface) y1Var.f(f0.f.b(resources, i, charSequence2, i5, i4));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a.b(bVar, typeface2, 2));
                }
                typeface = typeface2;
            } else if (!z5) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        e i6 = b.i(resources.getXml(i), resources);
                        if (i6 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = f0.f.a(context, i6, resources, i, charSequence2, typedValue.assetCookie, i4, bVar, z4);
                        }
                    } else {
                        int i7 = typedValue.assetCookie;
                        Typeface r4 = f0.f.f1420a.r(context, resources, i, charSequence2, i4);
                        if (r4 != null) {
                            y1Var.j(f0.f.b(resources, i, charSequence2, i7, i4), r4);
                        }
                        if (bVar != null) {
                            if (r4 != null) {
                                new Handler(Looper.getMainLooper()).post(new a.b(bVar, r4, 2));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = r4;
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
        if (typeface == null || bVar != null || z5) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
