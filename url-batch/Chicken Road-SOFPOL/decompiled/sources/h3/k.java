package h3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import o.s;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f3150a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f3151b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3152c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ce A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i, TypedValue typedValue, int i8, b bVar, boolean z3, boolean z7) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i9 = typedValue.assetCookie;
            s sVar = i3.g.f3429b;
            Typeface typeface2 = (Typeface) sVar.c(i3.g.b(resources, i, charSequence2, i9, i8));
            if (typeface2 != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a1.e(2, bVar, typeface2));
                }
                typeface = typeface2;
            } else if (!z7) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d f6 = b.f(resources.getXml(i), resources);
                        if (f6 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (bVar != null) {
                                bVar.a(-3);
                            }
                        } else {
                            typeface = i3.g.a(context, f6, resources, i, charSequence2, typedValue.assetCookie, i8, bVar, z3);
                        }
                    } else {
                        int i10 = typedValue.assetCookie;
                        Typeface w7 = i3.g.f3428a.w(context, resources, i, charSequence2, i8);
                        if (w7 != null) {
                            sVar.f(i3.g.b(resources, i, charSequence2, i10, i8), w7);
                        }
                        if (bVar != null) {
                            if (w7 != null) {
                                new Handler(Looper.getMainLooper()).post(new a1.e(2, bVar, w7));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typeface = w7;
                    }
                } catch (IOException e8) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e8);
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e9) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e9);
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
        if (typeface == null || bVar != null || z7) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
