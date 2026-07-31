package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import kotlin.KotlinVersion;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w.AbstractC3480a;
import y.AbstractC3521a;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f11731a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return d(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedValue c() {
        ThreadLocal threadLocal = f11731a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        Resources resources2 = resources;
        int i4 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArr2 = new int[20];
        int i5 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i4 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray g4 = g(resources2, theme, attributeSet, w.d.f46545b);
                int resourceId = g4.getResourceId(w.d.f46546c, -1);
                if (resourceId == -1 || e(resources2, resourceId)) {
                    color = g4.getColor(w.d.f46546c, -65281);
                } else {
                    try {
                        color = a(resources2, resources2.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = g4.getColor(w.d.f46546c, -65281);
                    }
                }
                float f4 = 1.0f;
                if (g4.hasValue(w.d.f46547d)) {
                    f4 = g4.getFloat(w.d.f46547d, 1.0f);
                } else if (g4.hasValue(w.d.f46549f)) {
                    f4 = g4.getFloat(w.d.f46549f, 1.0f);
                }
                float f5 = (Build.VERSION.SDK_INT < 31 || !g4.hasValue(w.d.f46548e)) ? g4.getFloat(w.d.f46550g, -1.0f) : g4.getFloat(w.d.f46548e, -1.0f);
                g4.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i6 = 0;
                for (int i7 = 0; i7 < attributeCount; i7++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i7);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != AbstractC3480a.f46492a && attributeNameResource != AbstractC3480a.f46493b) {
                        int i8 = i6 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i7, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i6] = attributeNameResource;
                        i6 = i8;
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i6);
                iArr2 = e.a(iArr2, i5, f(color, f4, f5));
                iArr = (int[][]) e.b(iArr, i5, trimStateSet);
                i5++;
            }
            i4 = 1;
            resources2 = resources;
        }
        int[] iArr4 = new int[i5];
        int[][] iArr5 = new int[i5][];
        System.arraycopy(iArr2, 0, iArr4, 0, i5);
        System.arraycopy(iArr, 0, iArr5, 0, i5);
        return new ColorStateList(iArr5, iArr4);
    }

    private static boolean e(Resources resources, int i4) {
        TypedValue c4 = c();
        resources.getValue(i4, c4, true);
        int i5 = c4.type;
        return i5 >= 28 && i5 <= 31;
    }

    private static int f(int i4, float f4, float f5) {
        boolean z4 = f5 >= 0.0f && f5 <= 100.0f;
        if (f4 == 1.0f && !z4) {
            return i4;
        }
        int b4 = AbstractC3521a.b((int) ((Color.alpha(i4) * f4) + 0.5f), 0, KotlinVersion.MAX_COMPONENT_VALUE);
        if (z4) {
            a c4 = a.c(i4);
            i4 = a.m(c4.j(), c4.i(), f5);
        }
        return (i4 & 16777215) | (b4 << 24);
    }

    private static TypedArray g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
