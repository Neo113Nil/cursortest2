package g3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import m.u;
import org.xmlpull.v1.XmlPullParserException;
import s.r;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4259a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f4260b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f4261c = new Object();

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00cc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface a(Context context, int i3, TypedValue typedValue, int i10, u uVar, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i3, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i3) + "\" (" + Integer.toHexString(i3) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i11 = typedValue.assetCookie;
            r rVar = h3.c.f4448b;
            Typeface typeface2 = (Typeface) rVar.c(h3.c.b(resources, i3, charSequence2, i11, i10));
            if (typeface2 != null) {
                if (uVar != null) {
                    new Handler(Looper.getMainLooper()).post(new a6.f(10, uVar, typeface2));
                }
                typeface = typeface2;
            } else {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        d d10 = b.d(resources.getXml(i3), resources);
                        if (d10 == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (uVar != null) {
                                uVar.a(-3);
                            }
                        } else {
                            typeface = h3.c.a(context, d10, resources, i3, charSequence2, typedValue.assetCookie, i10, uVar, z10);
                        }
                    } else {
                        int i12 = typedValue.assetCookie;
                        Typeface p4 = h3.c.f4447a.p(context, resources, i3, charSequence2, i10);
                        if (p4 != null) {
                            rVar.d(h3.c.b(resources, i3, charSequence2, i12, i10), p4);
                        }
                        if (uVar != null) {
                            if (p4 != null) {
                                new Handler(Looper.getMainLooper()).post(new a6.f(10, uVar, p4));
                            } else {
                                uVar.a(-3);
                            }
                        }
                        typeface = p4;
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                    if (uVar != null) {
                        uVar.a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e9) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e9);
                    if (uVar != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
        } else if (uVar != null) {
            uVar.a(-3);
        }
        if (typeface == null || uVar != null) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i3) + " could not be retrieved.");
    }
}
