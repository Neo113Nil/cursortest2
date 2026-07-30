package v1;

import a0.m;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f1.h0;
import f1.i0;
import f1.k0;
import g0.l;
import g0.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r6.k;
import y1.s;
import z0.l0;
import z0.q;
import z0.r0;
import z0.u;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class g {
    public static final long a(float f9, float f10) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
        int i7 = y0.a.f9773b;
        return floatToRawIntBits;
    }

    public static void b(int i7) {
        if (2 > i7 || i7 >= 37) {
            StringBuilder n8 = m.n(i7, "radix ", " was not in valid range ");
            n8.append(new w6.d(2, 36, 1));
            throw new IllegalArgumentException(n8.toString());
        }
    }

    public static double c(double d8, double d9, double d10) {
        if (d9 <= d10) {
            return d8 < d9 ? d9 : d8 > d10 ? d10 : d8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d10 + " is less than minimum " + d9 + '.');
    }

    public static float d(float f9, float f10, float f11) {
        if (f10 <= f11) {
            return f9 < f10 ? f10 : f9 > f11 ? f11 : f9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int e(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    public static long f(long j8, long j9, long j10) {
        if (j9 <= j10) {
            return j8 < j9 ? j9 : j8 > j10 ? j10 : j8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static Comparable g(Float f9, w6.a aVar) {
        float f10 = aVar.f9520b;
        float f11 = aVar.f9519a;
        if (f11 <= f10) {
            return (!w6.a.a(f9, Float.valueOf(f11)) || w6.a.a(Float.valueOf(f11), f9)) ? (!w6.a.a(Float.valueOf(f10), f9) || w6.a.a(f9, Float.valueOf(f10))) ? f9 : Float.valueOf(f10) : Float.valueOf(f11);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static final boolean h(char c4, char c6, boolean z8) {
        if (c4 == c6) {
            return true;
        }
        if (!z8) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c6);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final x3.f i(View view) {
        k.f(view, "<this>");
        return (x3.f) y6.h.n(y6.h.p(y6.h.o(view, x3.g.f9681h), x3.g.f9682i));
    }

    public static c3.h j(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new c3.h(d.a(view));
        }
        return null;
    }

    public static final Object k(y1.i iVar, s sVar) {
        Object obj = iVar.f9832f.get(sVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static boolean l(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final e1.b m(int i7, p pVar) {
        TypedValue typedValue;
        int i8;
        long j8;
        int i9;
        int i10;
        int eventType;
        int i11;
        int i12;
        TypedArray obtainStyledAttributes;
        int i13;
        int i14;
        TypedArray obtainStyledAttributes2;
        int i15;
        int i16;
        ColorStateList colorStateList;
        Context context = (Context) pVar.k(AndroidCompositionLocals_androidKt.f739b);
        pVar.k(AndroidCompositionLocals_androidKt.f738a);
        Resources resources = context.getResources();
        w1.d dVar = (w1.d) pVar.k(AndroidCompositionLocals_androidKt.f741d);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f9494a.f(i7);
            i8 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i7, typedValue, true);
                i.p pVar2 = dVar.f9494a;
                int d8 = pVar2.d(i7);
                Object[] objArr = pVar2.f4772c;
                Object obj = objArr[d8];
                pVar2.f4771b[d8] = i7;
                objArr[d8] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !z6.h.A(charSequence, ".xml")) {
            pVar.Q(-802884675);
            boolean f9 = pVar.f(context.getTheme()) | pVar.f(charSequence) | pVar.d(i7);
            Object G = pVar.G();
            if (f9 || G == l.f3784a) {
                try {
                    Drawable drawable = resources.getDrawable(i7, null);
                    k.d(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    G = new z0.h(((BitmapDrawable) drawable).getBitmap());
                    pVar.a0(G);
                } catch (Exception e9) {
                    throw new b4.c("Error attempting to load resource: " + ((Object) charSequence), e9);
                }
            }
            e1.a aVar = new e1.a((z0.h) G);
            pVar.p(false);
            return aVar;
        }
        pVar.Q(-803040357);
        Resources.Theme theme = context.getTheme();
        int i17 = typedValue.changingConfigurations;
        w1.c cVar = (w1.c) pVar.k(AndroidCompositionLocals_androidKt.f740c);
        w1.b bVar = new w1.b(theme, i7);
        WeakReference weakReference = (WeakReference) cVar.f9493a.get(bVar);
        w1.a aVar2 = weakReference != null ? (w1.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i7);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!k.a(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            g1.a aVar3 = new g1.a(xml);
            int[] iArr = g1.b.f3992a;
            TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            aVar3.c(obtainAttributes.getChangingConfigurations());
            boolean z8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? obtainAttributes.getBoolean(5, false) : false;
            aVar3.c(obtainAttributes.getChangingConfigurations());
            float b9 = aVar3.b(obtainAttributes, "viewportWidth", 7, 0.0f);
            float b10 = aVar3.b(obtainAttributes, "viewportHeight", 8, 0.0f);
            if (b9 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b10 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, 0.0f);
            aVar3.c(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, 0.0f);
            aVar3.c(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j8 = u.f10057g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue3);
                        int i18 = typedValue3.type;
                        if (i18 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i18 < 28 || i18 > 31) {
                            Resources resources2 = obtainAttributes.getResources();
                            int resourceId = obtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = u2.c.f8974a;
                            try {
                                colorStateList = u2.c.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e10) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        aVar3.c(obtainAttributes.getChangingConfigurations());
                        j8 = colorStateList == null ? l0.c(colorStateList.getDefaultColor()) : u.f10057g;
                    }
                    colorStateList = null;
                    aVar3.c(obtainAttributes.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j8 = u.f10057g;
            }
            long j9 = j8;
            int i19 = obtainAttributes.getInt(6, -1);
            aVar3.c(obtainAttributes.getChangingConfigurations());
            if (i19 != -1) {
                if (i19 == 3) {
                    i9 = 3;
                } else if (i19 != 5) {
                    if (i19 != 9) {
                        switch (i19) {
                            case 14:
                                i9 = 13;
                                break;
                            case q.c.f7263g /* 15 */:
                                i9 = 14;
                                break;
                            case 16:
                                i9 = 12;
                                break;
                        }
                    } else {
                        i9 = 9;
                    }
                }
                float f10 = dimension / resources.getDisplayMetrics().density;
                float f11 = dimension2 / resources.getDisplayMetrics().density;
                obtainAttributes.recycle();
                f1.e eVar = new f1.e(null, f10, f11, b9, b10, j9, i9, z8, 1);
                i10 = 0;
                for (int i20 = 3; xml.getEventType() != i8 && (xml.getDepth() >= i8 || xml.getEventType() != i20); i20 = 3) {
                    List list = e6.u.f2826f;
                    XmlPullParser xmlPullParser = aVar3.f3989a;
                    int i21 = i8;
                    b6.c cVar2 = aVar3.f3991c;
                    eventType = xmlPullParser.getEventType();
                    XmlResourceParser xmlResourceParser = xml;
                    if (eventType == 2) {
                        if (eventType == i20 && "group".equals(xmlPullParser.getName())) {
                            int i22 = i10 + 1;
                            for (int i23 = 0; i23 < i22; i23++) {
                                ArrayList arrayList = eVar.f3124i;
                                if (eVar.f3126k) {
                                    a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    throw null;
                                }
                                f1.d dVar2 = (f1.d) arrayList.remove(arrayList.size() - 1);
                                ((f1.d) arrayList.get(arrayList.size() - 1)).f3114j.add(new h0(dVar2.f3105a, dVar2.f3106b, dVar2.f3107c, dVar2.f3108d, dVar2.f3109e, dVar2.f3110f, dVar2.f3111g, dVar2.f3112h, dVar2.f3113i, dVar2.f3114j));
                            }
                            i13 = i21;
                            i10 = 0;
                            xmlResourceParser.next();
                            i8 = i13;
                            xml = xmlResourceParser;
                        }
                        i11 = i10;
                        i13 = i21;
                    } else {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode != -1649314686) {
                                i11 = i10;
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        int[] iArr2 = g1.b.f3993b;
                                        TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float b11 = aVar3.b(obtainAttributes2, "rotation", 5, 0.0f);
                                        float f12 = obtainAttributes2.getFloat(i21, 0.0f);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float f13 = obtainAttributes2.getFloat(2, 0.0f);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float b12 = aVar3.b(obtainAttributes2, "scaleX", 3, 1.0f);
                                        float b13 = aVar3.b(obtainAttributes2, "scaleY", 4, 1.0f);
                                        float b14 = aVar3.b(obtainAttributes2, "translateX", 6, 0.0f);
                                        float b15 = aVar3.b(obtainAttributes2, "translateY", 7, 0.0f);
                                        String string = obtainAttributes2.getString(0);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        String str = string == null ? "" : string;
                                        obtainAttributes2.recycle();
                                        int i24 = i0.f3188a;
                                        if (eVar.f3126k) {
                                            a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        eVar.f3124i.add(new f1.d(str, b11, f12, f13, b12, b13, b14, b15, list, 512));
                                        i10 = i11;
                                    }
                                    i13 = i21;
                                } else if (name.equals("path")) {
                                    int[] iArr3 = g1.b.f3994c;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i14 = 0;
                                    } else {
                                        i14 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        throw new IllegalArgumentException("No path data available");
                                    }
                                    String string2 = obtainStyledAttributes2.getString(i14);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string2 == null ? "" : string2;
                                    String string3 = obtainStyledAttributes2.getString(2);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (string3 == null) {
                                        int i25 = i0.f3188a;
                                    } else {
                                        list = b6.c.u(cVar2, string3);
                                    }
                                    List list2 = list;
                                    l.i a3 = aVar3.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b16 = aVar3.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i26 = !u2.b.a(aVar3.f3989a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i26 != 0) {
                                        if (i26 != 1) {
                                            i15 = 2;
                                            if (i26 == 2) {
                                                i16 = 2;
                                            }
                                        } else {
                                            i15 = 2;
                                            i16 = 1;
                                        }
                                        int i27 = u2.b.a(aVar3.f3989a, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                        aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                        int i28 = i27 == 0 ? i27 != 1 ? i15 : 1 : 0;
                                        float b17 = aVar3.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                        l.i a9 = aVar3.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b18 = aVar3.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b19 = aVar3.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b20 = aVar3.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b21 = aVar3.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b22 = aVar3.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        int i29 = u2.b.a(aVar3.f3989a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                        aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        Shader shader = (Shader) a3.f5526c;
                                        int i30 = a3.f5525b;
                                        z0.p qVar = (shader == null && i30 == 0) ? null : shader == null ? new q(shader) : new r0(l0.c(i30));
                                        Shader shader2 = (Shader) a9.f5526c;
                                        int i31 = a9.f5525b;
                                        z0.p qVar2 = (shader2 == null && i31 == 0) ? null : shader2 != null ? new q(shader2) : new r0(l0.c(i31));
                                        int i32 = i29 != 0 ? 0 : 1;
                                        if (!eVar.f3126k) {
                                            a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            throw null;
                                        }
                                        ((f1.d) eVar.f3124i.get(r0.size() - 1)).f3114j.add(new f1.l0(str2, list2, i32, qVar, b16, qVar2, b18, b19, i16, i28, b17, b22, b20, b21));
                                        i10 = i11;
                                    } else {
                                        i15 = 2;
                                    }
                                    i16 = 0;
                                    if (u2.b.a(aVar3.f3989a, "strokeLineJoin")) {
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i27 == 0) {
                                    }
                                    float b172 = aVar3.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                    l.i a92 = aVar3.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b182 = aVar3.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b192 = aVar3.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b202 = aVar3.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b212 = aVar3.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b222 = aVar3.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (u2.b.a(aVar3.f3989a, "fillType")) {
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    Shader shader3 = (Shader) a3.f5526c;
                                    int i302 = a3.f5525b;
                                    if (shader3 == null) {
                                        Shader shader22 = (Shader) a92.f5526c;
                                        int i312 = a92.f5525b;
                                        if (shader22 == null) {
                                            if (i29 != 0) {
                                            }
                                            if (!eVar.f3126k) {
                                            }
                                        }
                                        if (i29 != 0) {
                                        }
                                        if (!eVar.f3126k) {
                                        }
                                    }
                                    Shader shader222 = (Shader) a92.f5526c;
                                    int i3122 = a92.f5525b;
                                    if (shader222 == null) {
                                    }
                                    if (i29 != 0) {
                                    }
                                    if (!eVar.f3126k) {
                                    }
                                } else {
                                    i13 = 1;
                                }
                                i13 = 1;
                                xmlResourceParser.next();
                                i8 = i13;
                                xml = xmlResourceParser;
                            } else {
                                i11 = i10;
                                if (name.equals("clip-path")) {
                                    int[] iArr4 = g1.b.f3995d;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                    }
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string4 = obtainStyledAttributes.getString(i12);
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str3 = string4 == null ? "" : string4;
                                    i13 = 1;
                                    String string5 = obtainStyledAttributes.getString(1);
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    if (string5 == null) {
                                        int i33 = i0.f3188a;
                                    } else {
                                        list = b6.c.u(cVar2, string5);
                                    }
                                    List list3 = list;
                                    obtainStyledAttributes.recycle();
                                    if (eVar.f3126k) {
                                        a.a.M("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        throw null;
                                    }
                                    eVar.f3124i.add(new f1.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list3, 512));
                                    i10 = i11 + 1;
                                    xmlResourceParser.next();
                                    i8 = i13;
                                    xml = xmlResourceParser;
                                } else {
                                    i13 = 1;
                                    i10 = i11;
                                    xmlResourceParser.next();
                                    i8 = i13;
                                    xml = xmlResourceParser;
                                }
                            }
                        }
                        i11 = i10;
                        i13 = i21;
                    }
                    i10 = i11;
                    xmlResourceParser.next();
                    i8 = i13;
                    xml = xmlResourceParser;
                }
                aVar2 = new w1.a(eVar.b(), i17);
                cVar.f9493a.put(bVar, new WeakReference(aVar2));
            }
            i9 = 5;
            float f102 = dimension / resources.getDisplayMetrics().density;
            float f112 = dimension2 / resources.getDisplayMetrics().density;
            obtainAttributes.recycle();
            f1.e eVar2 = new f1.e(null, f102, f112, b9, b10, j9, i9, z8, 1);
            i10 = 0;
            while (xml.getEventType() != i8) {
                List list4 = e6.u.f2826f;
                XmlPullParser xmlPullParser2 = aVar3.f3989a;
                int i212 = i8;
                b6.c cVar22 = aVar3.f3991c;
                eventType = xmlPullParser2.getEventType();
                XmlResourceParser xmlResourceParser2 = xml;
                if (eventType == 2) {
                }
                i10 = i11;
                xmlResourceParser2.next();
                i8 = i13;
                xml = xmlResourceParser2;
            }
            aVar2 = new w1.a(eVar2.b(), i17);
            cVar.f9493a.put(bVar, new WeakReference(aVar2));
        }
        k0 c4 = f1.b.c(aVar2.f9489a, pVar);
        pVar.p(false);
        return c4;
    }

    public static w6.b n(w6.d dVar, int i7) {
        k.f(dVar, "<this>");
        boolean z8 = i7 > 0;
        Integer valueOf = Integer.valueOf(i7);
        if (!z8) {
            throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
        }
        int i8 = dVar.f9521f;
        int i9 = dVar.f9522g;
        if (dVar.f9523h <= 0) {
            i7 = -i7;
        }
        return new w6.b(i8, i9, i7);
    }

    public static w6.d o(int i7, int i8) {
        if (i8 > Integer.MIN_VALUE) {
            return new w6.d(i7, i8 - 1, 1);
        }
        w6.d dVar = w6.d.f9528i;
        return w6.d.f9528i;
    }
}
