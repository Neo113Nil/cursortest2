package B;

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

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f69a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f70b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f71c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, b bVar, boolean z2, boolean z3) {
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
            o.f fVar = C.h.f101b;
            Typeface typeface2 = (Typeface) fVar.a(C.h.b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new o(bVar, 0, typeface2));
                }
            } else if (!z3) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        f i4 = b.i(resources.getXml(i), resources);
                        if (i4 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = C.h.a(context, i4, resources, i, charSequence2, typedValue.assetCookie, i2, bVar, z2);
                        }
                    } else {
                        int i5 = typedValue.assetCookie;
                        typeface2 = C.h.f100a.x(context, resources, i, charSequence2, i2);
                        if (typeface2 != null) {
                            fVar.b(C.h.b(resources, i, charSequence2, i5, i2), typeface2);
                        }
                        if (bVar != null) {
                            if (typeface2 != null) {
                                new Handler(Looper.getMainLooper()).post(new o(bVar, 0, typeface2));
                            } else {
                                bVar.a(-3);
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e3) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
                    if (bVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
            typeface = typeface2;
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typeface == null || bVar != null || z3) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
