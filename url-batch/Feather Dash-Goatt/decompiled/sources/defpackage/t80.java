package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class t80 {
    public static final rs A(jb0 jb0Var, boolean z, mb0 mb0Var) {
        if (jb0Var instanceof qb0) {
            return ((qb0) jb0Var).V(z, mb0Var);
        }
        return jb0Var.z(mb0Var.r(), z, new e(1, mb0Var, mb0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 1));
    }

    public static final boolean B(CoroutineContext coroutineContext) {
        jb0 jb0Var = (jb0) coroutineContext.d(j41.m);
        if (jb0Var != null) {
            return jb0Var.b();
        }
        return true;
    }

    public static final boolean C(float f, float f2, c6 c6Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        c6 a = e6.a();
        ev0[] ev0VarArr = ev0.d;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            e6.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a.b == null) {
            a.b = new RectF();
        }
        RectF rectF = a.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = a.a;
        RectF rectF2 = a.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        c6 a2 = e6.a();
        Path.Op op = Path.Op.INTERSECT;
        Path path2 = a2.a;
        if (!(c6Var instanceof c6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path3 = c6Var.a;
        if (!(a instanceof c6)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path2.op(path3, a.a, op);
        boolean isEmpty = a2.a.isEmpty();
        a2.c();
        a.c();
        return !isEmpty;
    }

    public static final boolean D(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) + ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) <= 1.0f;
    }

    public static final long E(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        xh1[] xh1VarArr = wh1.b;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0548 A[LOOP:2: B:60:0x0541->B:62:0x0548, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final mu0 F(int i, hl hlVar, int i2) {
        TypedValue typedValue;
        int i3;
        md mdVar;
        TypedArray typedArray;
        boolean z;
        long j;
        int i4;
        ArrayList arrayList;
        int eventType;
        XmlResourceParser xmlResourceParser;
        char c;
        int i5;
        TypedArray obtainStyledAttributes;
        int i6;
        TypedArray obtainStyledAttributes2;
        int i7;
        int i8;
        int i9;
        ColorStateList colorStateList;
        Context context = (Context) hlVar.j(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) hlVar.j(AndroidCompositionLocals_androidKt.c);
        d31 d31Var = (d31) hlVar.j(AndroidCompositionLocals_androidKt.e);
        synchronized (d31Var) {
            typedValue = (TypedValue) d31Var.a.b(i);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i, typedValue, true);
                en0 en0Var = d31Var.a;
                int d = en0Var.d(i);
                Object[] objArr = en0Var.c;
                Object obj = objArr[d];
                en0Var.b[d] = i;
                objArr[d] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.l(charSequence)) {
            hlVar.W(-1771643000);
            boolean f = hlVar.f(context.getTheme()) | hlVar.f(charSequence) | ((((i2 & 14) ^ 6) > 4 && hlVar.d(i)) || (i2 & 6) == 4);
            Object L = hlVar.L();
            if (f || L == bl.a) {
                try {
                    Drawable drawable = resources.getDrawable(i, null);
                    drawable.getClass();
                    L = new t5(((BitmapDrawable) drawable).getBitmap());
                    hlVar.h0(L);
                } catch (Exception e) {
                    throw new ij("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            }
            ld ldVar = new ld((t5) L);
            hlVar.p(false);
            return ldVar;
        }
        hlVar.W(-1771798434);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValue.changingConfigurations;
        h70 h70Var = (h70) hlVar.j(AndroidCompositionLocals_androidKt.d);
        g70 g70Var = new g70(theme, i);
        WeakReference weakReference = (WeakReference) h70Var.a.get(g70Var);
        f70 f70Var = weakReference != null ? (f70) weakReference.get() : null;
        if (f70Var == null) {
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.a(xml.getName(), "vector")) {
                dd0.e("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            t6 t6Var = new t6(xml);
            int[] iArr = mo.a;
            TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            t6Var.c(obtainAttributes.getChangingConfigurations());
            mdVar = null;
            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                typedArray = obtainAttributes;
                z = typedArray.getBoolean(5, false);
            } else {
                typedArray = obtainAttributes;
                z = false;
            }
            t6Var.c(typedArray.getChangingConfigurations());
            float b = t6Var.b(typedArray, "viewportWidth", 7, 0.0f);
            float b2 = t6Var.b(typedArray, "viewportHeight", 8, 0.0f);
            if (b <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b2 <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArray.getDimension(3, 0.0f);
            t6Var.c(typedArray.getChangingConfigurations());
            float dimension2 = typedArray.getDimension(2, 0.0f);
            t6Var.c(typedArray.getChangingConfigurations());
            if (typedArray.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j = hi.g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArray.getValue(1, typedValue3);
                        int i11 = typedValue3.type;
                        if (i11 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i11 < 28 || i11 > 31) {
                            Resources resources2 = typedArray.getResources();
                            int resourceId = typedArray.getResourceId(1, 0);
                            ThreadLocal threadLocal = ti.a;
                            try {
                                colorStateList = ti.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e2) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        t6Var.c(typedArray.getChangingConfigurations());
                        j = colorStateList == null ? la0.c(colorStateList.getDefaultColor()) : hi.g;
                    }
                    colorStateList = null;
                    t6Var.c(typedArray.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j = hi.g;
            }
            int i12 = typedArray.getInt(6, -1);
            t6Var.c(typedArray.getChangingConfigurations());
            if (i12 != -1) {
                if (i12 == 3) {
                    i4 = 3;
                } else if (i12 != 5) {
                    if (i12 != 9) {
                        switch (i12) {
                            case 14:
                                i4 = 13;
                                break;
                            case 15:
                                i4 = 14;
                                break;
                            case 16:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f2 = dimension / resources.getDisplayMetrics().density;
                float f3 = dimension2 / resources.getDisplayMetrics().density;
                typedArray.recycle();
                arrayList = new ArrayList();
                d70 d70Var = new d70(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
                arrayList.add(d70Var);
                int i13 = 0;
                for (int i14 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i14); i14 = 3) {
                    XmlPullParser xmlPullParser = t6Var.a;
                    int i15 = i3;
                    s2 s2Var = t6Var.c;
                    int i16 = i10;
                    eventType = xmlPullParser.getEventType();
                    int i17 = i4;
                    if (eventType == 2) {
                        if (eventType == i14 && "group".equals(xmlPullParser.getName())) {
                            int i18 = 0;
                            for (int i19 = i13 + 1; i18 < i19; i19 = i19) {
                                d70 d70Var2 = (d70) arrayList.remove(arrayList.size() - 1);
                                ((d70) arrayList.get(arrayList.size() - 1)).j.add(new lm1(d70Var2.a, d70Var2.b, d70Var2.c, d70Var2.d, d70Var2.e, d70Var2.f, d70Var2.g, d70Var2.h, d70Var2.i, d70Var2.j));
                                i18++;
                            }
                            xmlResourceParser = xml;
                            i13 = 0;
                        }
                        xmlResourceParser = xml;
                    } else {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode != -1649314686) {
                                xmlResourceParser = xml;
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        int[] iArr2 = mo.b;
                                        TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                        t6Var.c(obtainAttributes2.getChangingConfigurations());
                                        float b3 = t6Var.b(obtainAttributes2, "rotation", 5, 0.0f);
                                        float f4 = obtainAttributes2.getFloat(i15, 0.0f);
                                        t6Var.c(obtainAttributes2.getChangingConfigurations());
                                        float f5 = obtainAttributes2.getFloat(2, 0.0f);
                                        t6Var.c(obtainAttributes2.getChangingConfigurations());
                                        float b4 = t6Var.b(obtainAttributes2, "scaleX", 3, 1.0f);
                                        float b5 = t6Var.b(obtainAttributes2, "scaleY", 4, 1.0f);
                                        float b6 = t6Var.b(obtainAttributes2, "translateX", 6, 0.0f);
                                        float b7 = t6Var.b(obtainAttributes2, "translateY", 7, 0.0f);
                                        String string = obtainAttributes2.getString(0);
                                        t6Var.c(obtainAttributes2.getChangingConfigurations());
                                        String str = string == null ? "" : string;
                                        obtainAttributes2.recycle();
                                        arrayList.add(new d70(str, b3, f4, f5, b4, b5, b6, b7, mm1.a, 512));
                                    }
                                } else if (name.equals("path")) {
                                    int[] iArr3 = mo.c;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        dd0.e("No path data available");
                                        return null;
                                    }
                                    String string2 = obtainStyledAttributes2.getString(i6);
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string2 == null ? "" : string2;
                                    String string3 = obtainStyledAttributes2.getString(2);
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    List a = string3 == null ? mm1.a : s2.a(s2Var, string3);
                                    jj a2 = t6Var.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b8 = t6Var.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i20 = !y(t6Var.a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i20 != 0) {
                                        if (i20 == 1) {
                                            i7 = 1;
                                        } else if (i20 == 2) {
                                            i7 = 2;
                                        }
                                        i8 = y(t6Var.a, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                        t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                        if (i8 != 0) {
                                            if (i8 == 1) {
                                                i9 = 1;
                                            } else if (i8 == 2) {
                                                i9 = 2;
                                            }
                                            float b9 = t6Var.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            jj a3 = t6Var.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                            float b10 = t6Var.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float b11 = t6Var.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float b12 = t6Var.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float b13 = t6Var.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float b14 = t6Var.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            int i21 = !y(t6Var.a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                            t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                            obtainStyledAttributes2.recycle();
                                            Shader shader = (Shader) a2.e;
                                            int i22 = a2.d;
                                            op reVar = (shader == null && i22 == 0) ? null : shader != null ? new re(shader) : new ec1(la0.c(i22));
                                            Shader shader2 = (Shader) a3.e;
                                            int i23 = a3.d;
                                            ((d70) arrayList.get(arrayList.size() - 1)).j.add(new pm1(str2, a, i21 == 0 ? 0 : 1, reVar, b8, (shader2 == null && i23 == 0) ? null : shader2 == null ? new re(shader2) : new ec1(la0.c(i23)), b10, b11, i7, i9, b9, b14, b12, b13));
                                        }
                                        i9 = 0;
                                        float b92 = t6Var.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                        jj a32 = t6Var.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b102 = t6Var.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b112 = t6Var.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b122 = t6Var.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b132 = t6Var.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b142 = t6Var.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        if (!y(t6Var.a, "fillType")) {
                                        }
                                        t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        Shader shader3 = (Shader) a2.e;
                                        int i222 = a2.d;
                                        if (shader3 == null) {
                                            Shader shader22 = (Shader) a32.e;
                                            int i232 = a32.d;
                                            if (shader22 == null) {
                                                ((d70) arrayList.get(arrayList.size() - 1)).j.add(new pm1(str2, a, i21 == 0 ? 0 : 1, reVar, b8, (shader22 == null && i232 == 0) ? null : shader22 == null ? new re(shader22) : new ec1(la0.c(i232)), b102, b112, i7, i9, b92, b142, b122, b132));
                                            }
                                            ((d70) arrayList.get(arrayList.size() - 1)).j.add(new pm1(str2, a, i21 == 0 ? 0 : 1, reVar, b8, (shader22 == null && i232 == 0) ? null : shader22 == null ? new re(shader22) : new ec1(la0.c(i232)), b102, b112, i7, i9, b92, b142, b122, b132));
                                        }
                                        Shader shader222 = (Shader) a32.e;
                                        int i2322 = a32.d;
                                        ((d70) arrayList.get(arrayList.size() - 1)).j.add(new pm1(str2, a, i21 == 0 ? 0 : 1, reVar, b8, (shader222 == null && i2322 == 0) ? null : shader222 == null ? new re(shader222) : new ec1(la0.c(i2322)), b102, b112, i7, i9, b92, b142, b122, b132));
                                    }
                                    i7 = 0;
                                    if (y(t6Var.a, "strokeLineJoin")) {
                                    }
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i8 != 0) {
                                    }
                                    i9 = 0;
                                    float b922 = t6Var.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    jj a322 = t6Var.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b1022 = t6Var.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b1122 = t6Var.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b1222 = t6Var.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b1322 = t6Var.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b1422 = t6Var.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (!y(t6Var.a, "fillType")) {
                                    }
                                    t6Var.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    Shader shader32 = (Shader) a2.e;
                                    int i2222 = a2.d;
                                    if (shader32 == null) {
                                    }
                                    Shader shader2222 = (Shader) a322.e;
                                    int i23222 = a322.d;
                                    ((d70) arrayList.get(arrayList.size() - 1)).j.add(new pm1(str2, a, i21 == 0 ? 0 : 1, reVar, b8, (shader2222 == null && i23222 == 0) ? null : shader2222 == null ? new re(shader2222) : new ec1(la0.c(i23222)), b1022, b1122, i7, i9, b922, b1422, b1222, b1322));
                                }
                            } else {
                                xmlResourceParser = xml;
                                c = 65535;
                                if (name.equals("clip-path")) {
                                    int[] iArr4 = mo.d;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                    }
                                    t6Var.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string4 = obtainStyledAttributes.getString(i5);
                                    t6Var.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str3 = string4 == null ? "" : string4;
                                    String string5 = obtainStyledAttributes.getString(1);
                                    t6Var.c(obtainStyledAttributes.getChangingConfigurations());
                                    List a4 = string5 == null ? mm1.a : s2.a(s2Var, string5);
                                    obtainStyledAttributes.recycle();
                                    arrayList.add(new d70(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a4, 512));
                                    i13++;
                                }
                                xmlResourceParser.next();
                                i10 = i16;
                                i4 = i17;
                                xml = xmlResourceParser;
                                i3 = 1;
                            }
                        }
                        xmlResourceParser = xml;
                    }
                    c = 65535;
                    xmlResourceParser.next();
                    i10 = i16;
                    i4 = i17;
                    xml = xmlResourceParser;
                    i3 = 1;
                }
                int i24 = i4;
                int i25 = i10 | t6Var.b;
                while (arrayList.size() > 1) {
                    d70 d70Var3 = (d70) arrayList.remove(arrayList.size() - 1);
                    ((d70) arrayList.get(arrayList.size() - 1)).j.add(new lm1(d70Var3.a, d70Var3.b, d70Var3.c, d70Var3.d, d70Var3.e, d70Var3.f, d70Var3.g, d70Var3.h, d70Var3.i, d70Var3.j));
                }
                f70Var = new f70(new e70("", f2, f3, b, b2, new lm1(d70Var.a, d70Var.b, d70Var.c, d70Var.d, d70Var.e, d70Var.f, d70Var.g, d70Var.h, d70Var.i, d70Var.j), j, i24, z), i25);
                h70Var.a.put(g70Var, new WeakReference(f70Var));
            }
            i4 = 5;
            float f22 = dimension / resources.getDisplayMetrics().density;
            float f32 = dimension2 / resources.getDisplayMetrics().density;
            typedArray.recycle();
            arrayList = new ArrayList();
            d70 d70Var4 = new d70(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
            arrayList.add(d70Var4);
            int i132 = 0;
            while (xml.getEventType() != i3) {
                XmlPullParser xmlPullParser2 = t6Var.a;
                int i152 = i3;
                s2 s2Var2 = t6Var.c;
                int i162 = i10;
                eventType = xmlPullParser2.getEventType();
                int i172 = i4;
                if (eventType == 2) {
                }
                c = 65535;
                xmlResourceParser.next();
                i10 = i162;
                i4 = i172;
                xml = xmlResourceParser;
                i3 = 1;
            }
            int i242 = i4;
            int i252 = i10 | t6Var.b;
            while (arrayList.size() > 1) {
            }
            f70Var = new f70(new e70("", f22, f32, b, b2, new lm1(d70Var4.a, d70Var4.b, d70Var4.c, d70Var4.d, d70Var4.e, d70Var4.f, d70Var4.g, d70Var4.h, d70Var4.i, d70Var4.j), j, i242, z), i252);
            h70Var.a.put(g70Var, new WeakReference(f70Var));
        } else {
            mdVar = null;
        }
        e70 e70Var = f70Var.a;
        nr nrVar = (nr) hlVar.j(yl.h);
        boolean e3 = hlVar.e((Float.floatToRawIntBits(nrVar.k()) & 4294967295L) | (Float.floatToRawIntBits(e70Var.j) << 32));
        Object L2 = hlVar.L();
        if (e3 || L2 == bl.a) {
            q50 q50Var = new q50();
            y90.n(q50Var, e70Var.f);
            long floatToRawIntBits = (Float.floatToRawIntBits(nrVar.s(e70Var.b)) << 32) | (Float.floatToRawIntBits(nrVar.s(e70Var.c)) & 4294967295L);
            float f6 = e70Var.d;
            float f7 = e70Var.e;
            if (Float.isNaN(f6)) {
                f6 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            }
            if (Float.isNaN(f7)) {
                f7 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(f6) << 32) | (4294967295L & Float.floatToRawIntBits(f7));
            om1 om1Var = new om1(q50Var);
            String str4 = e70Var.a;
            long j2 = e70Var.g;
            md mdVar2 = j2 != 16 ? new md(e70Var.h, j2) : mdVar;
            boolean z2 = e70Var.i;
            om1Var.d.setValue(new va1(floatToRawIntBits));
            om1Var.e.setValue(Boolean.valueOf(z2));
            jm1 jm1Var = om1Var.f;
            jm1Var.g.setValue(mdVar2);
            jm1Var.i.setValue(new va1(floatToRawIntBits2));
            jm1Var.c = str4;
            hlVar.h0(om1Var);
            L2 = om1Var;
        }
        om1 om1Var2 = (om1) L2;
        hlVar.p(false);
        return om1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean G(o10 o10Var, z6 z6Var) {
        o10[] o10VarArr = new o10[16];
        if (!o10Var.d.r) {
            o80.b("visitChildren called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var = o10Var.d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var, zl0Var);
        } else {
            eo0Var.b(zl0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = eo0Var.g;
            if (i2 == 0) {
                break;
            }
            zl0 zl0Var3 = (zl0) eo0Var.k(i2 - 1);
            if ((zl0Var3.h & 1024) == 0) {
                op.l(eo0Var, zl0Var3);
            } else {
                while (true) {
                    if (zl0Var3 == null) {
                        break;
                    }
                    if ((zl0Var3.g & 1024) != 0) {
                        eo0 eo0Var2 = null;
                        while (zl0Var3 != null) {
                            if (zl0Var3 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var3;
                                int i3 = i + 1;
                                if (o10VarArr.length < i3) {
                                    int length = o10VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(o10VarArr, 0, r10, 0, length);
                                    o10VarArr = r10;
                                }
                                o10VarArr[i] = o10Var2;
                                i = i3;
                            } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                int i4 = 0;
                                for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                    if ((zl0Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            zl0Var3 = zl0Var4;
                                        } else {
                                            if (eo0Var2 == null) {
                                                eo0Var2 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var3 != null) {
                                                eo0Var2.b(zl0Var3);
                                                zl0Var3 = null;
                                            }
                                            eo0Var2.b(zl0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            zl0Var3 = op.o(eo0Var2);
                        }
                    } else {
                        zl0Var3 = zl0Var3.j;
                    }
                }
            }
        }
        Arrays.sort(o10VarArr, 0, i, r10.b);
        int i5 = i - 1;
        if (i5 < o10VarArr.length) {
            while (i5 >= 0) {
                o10 o10Var3 = o10VarArr[i5];
                if (uq1.L(o10Var3) && e(o10Var3, z6Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean H(o10 o10Var, z6 z6Var) {
        o10[] o10VarArr = new o10[16];
        if (!o10Var.d.r) {
            o80.b("visitChildren called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var = o10Var.d;
        zl0 zl0Var2 = zl0Var.j;
        if (zl0Var2 == null) {
            op.l(eo0Var, zl0Var);
        } else {
            eo0Var.b(zl0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = eo0Var.g;
            if (i2 == 0) {
                break;
            }
            zl0 zl0Var3 = (zl0) eo0Var.k(i2 - 1);
            if ((zl0Var3.h & 1024) == 0) {
                op.l(eo0Var, zl0Var3);
            } else {
                while (true) {
                    if (zl0Var3 == null) {
                        break;
                    }
                    if ((zl0Var3.g & 1024) != 0) {
                        eo0 eo0Var2 = null;
                        while (zl0Var3 != null) {
                            if (zl0Var3 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var3;
                                int i3 = i + 1;
                                if (o10VarArr.length < i3) {
                                    int length = o10VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(o10VarArr, 0, r10, 0, length);
                                    o10VarArr = r10;
                                }
                                o10VarArr[i] = o10Var2;
                                i = i3;
                            } else if ((zl0Var3.g & 1024) != 0 && (zl0Var3 instanceof zq)) {
                                int i4 = 0;
                                for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                    if ((zl0Var4.g & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            zl0Var3 = zl0Var4;
                                        } else {
                                            if (eo0Var2 == null) {
                                                eo0Var2 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var3 != null) {
                                                eo0Var2.b(zl0Var3);
                                                zl0Var3 = null;
                                            }
                                            eo0Var2.b(zl0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            zl0Var3 = op.o(eo0Var2);
                        }
                    } else {
                        zl0Var3 = zl0Var3.j;
                    }
                }
            }
        }
        Arrays.sort(o10VarArr, 0, i, r10.b);
        for (int i5 = 0; i5 < i; i5++) {
            o10 o10Var3 = o10VarArr[i5];
            if (uq1.L(o10Var3) && q(o10Var3, z6Var)) {
                return true;
            }
        }
        return false;
    }

    public static final Object I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean J(o10 o10Var, o10 o10Var2, int i, z6 z6Var) {
        zl0 zl0Var;
        jd0 I;
        l7 l7Var;
        if (o10Var.E0() != j10.e) {
            dd0.j("This function should only be used within a parent that has focus.");
            return false;
        }
        o10[] o10VarArr = new o10[16];
        if (!o10Var.d.r) {
            o80.b("visitChildren called on an unattached node");
        }
        eo0 eo0Var = new eo0(new zl0[16]);
        zl0 zl0Var2 = o10Var.d;
        zl0 zl0Var3 = zl0Var2.j;
        if (zl0Var3 == null) {
            op.l(eo0Var, zl0Var2);
        } else {
            eo0Var.b(zl0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = eo0Var.g;
            zl0Var = null;
            if (i3 == 0) {
                break;
            }
            zl0 zl0Var4 = (zl0) eo0Var.k(i3 - 1);
            if ((zl0Var4.h & 1024) == 0) {
                op.l(eo0Var, zl0Var4);
            } else {
                while (true) {
                    if (zl0Var4 == null) {
                        break;
                    }
                    if ((zl0Var4.g & 1024) != 0) {
                        eo0 eo0Var2 = null;
                        while (zl0Var4 != null) {
                            if (zl0Var4 instanceof o10) {
                                o10 o10Var3 = (o10) zl0Var4;
                                int i4 = i2 + 1;
                                if (o10VarArr.length < i4) {
                                    int length = o10VarArr.length;
                                    ?? r11 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(o10VarArr, 0, r11, 0, length);
                                    o10VarArr = r11;
                                }
                                o10VarArr[i2] = o10Var3;
                                i2 = i4;
                            } else if ((zl0Var4.g & 1024) != 0 && (zl0Var4 instanceof zq)) {
                                int i5 = 0;
                                for (zl0 zl0Var5 = ((zq) zl0Var4).t; zl0Var5 != null; zl0Var5 = zl0Var5.j) {
                                    if ((zl0Var5.g & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            zl0Var4 = zl0Var5;
                                        } else {
                                            if (eo0Var2 == null) {
                                                eo0Var2 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var4 != null) {
                                                eo0Var2.b(zl0Var4);
                                                zl0Var4 = null;
                                            }
                                            eo0Var2.b(zl0Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            zl0Var4 = op.o(eo0Var2);
                        }
                    } else {
                        zl0Var4 = zl0Var4.j;
                    }
                }
            }
        }
        Arrays.sort(o10VarArr, 0, i2, r10.b);
        if (i != 1) {
            if (i != 2) {
                dd0.j("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange g = b11.g(0, i2);
            int i6 = g.d;
            int i7 = g.e;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        o10 o10Var4 = o10VarArr[i7];
                        if (uq1.L(o10Var4) && e(o10Var4, z6Var)) {
                            break;
                        }
                    }
                    if (Intrinsics.a(o10VarArr[i7], o10Var2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!o10Var.d.r) {
                }
                zl0 zl0Var6 = o10Var.d.i;
                I = op.I(o10Var);
                loop5: while (true) {
                    if (I == null) {
                    }
                }
                if (zl0Var != null) {
                }
            }
            return false;
        }
        IntRange g2 = b11.g(0, i2);
        int i8 = g2.d;
        int i9 = g2.e;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    o10 o10Var5 = o10VarArr[i8];
                    if (uq1.L(o10Var5) && q(o10Var5, z6Var)) {
                        break;
                    }
                }
                if (Intrinsics.a(o10VarArr[i8], o10Var2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && o10Var.B0().a) {
            if (!o10Var.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var62 = o10Var.d.i;
            I = op.I(o10Var);
            loop5: while (true) {
                if (I == null) {
                    break;
                }
                if ((((zl0) I.J.g).h & 1024) != 0) {
                    while (zl0Var62 != null) {
                        if ((zl0Var62.g & 1024) != 0) {
                            zl0 zl0Var7 = zl0Var62;
                            eo0 eo0Var3 = null;
                            while (zl0Var7 != null) {
                                if (zl0Var7 instanceof o10) {
                                    zl0Var = zl0Var7;
                                    break loop5;
                                }
                                if ((zl0Var7.g & 1024) != 0 && (zl0Var7 instanceof zq)) {
                                    int i10 = 0;
                                    for (zl0 zl0Var8 = ((zq) zl0Var7).t; zl0Var8 != null; zl0Var8 = zl0Var8.j) {
                                        if ((zl0Var8.g & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                zl0Var7 = zl0Var8;
                                            } else {
                                                if (eo0Var3 == null) {
                                                    eo0Var3 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var7 != null) {
                                                    eo0Var3.b(zl0Var7);
                                                    zl0Var7 = null;
                                                }
                                                eo0Var3.b(zl0Var8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                zl0Var7 = op.o(eo0Var3);
                            }
                        }
                        zl0Var62 = zl0Var62.i;
                    }
                }
                I = I.s();
                zl0Var62 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
            if (zl0Var != null) {
                return ((Boolean) z6Var.invoke(o10Var)).booleanValue();
            }
        }
        return false;
    }

    public static final int K(dn0 dn0Var) {
        int c;
        int i = dn0Var.b;
        int c2 = dn0Var.c(0);
        while (dn0Var.b != 0 && dn0Var.c(0) == c2) {
            int i2 = dn0Var.b;
            if (i2 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            dn0Var.e(0, dn0Var.a[i2 - 1]);
            dn0Var.d(dn0Var.b - 1);
            int i3 = dn0Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int c3 = dn0Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int c4 = dn0Var.c(i7);
                if (i6 >= i3 || (c = dn0Var.c(i6)) <= c4) {
                    if (c4 > c3) {
                        dn0Var.e(i5, c4);
                        dn0Var.e(i7, c3);
                        i5 = i7;
                    }
                } else if (c > c3) {
                    dn0Var.e(i5, c);
                    dn0Var.e(i6, c3);
                    i5 = i6;
                }
            }
        }
        return c2;
    }

    public static final Rect L(x90 x90Var) {
        return new Rect(x90Var.a, x90Var.b, x90Var.c, x90Var.d);
    }

    public static final s11 M(Rect rect) {
        return new s11(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final String N(xc1 xc1Var) {
        JSONObject jSONObject = new JSONObject();
        wc1 wc1Var = xc1Var.a;
        for (Map.Entry entry : wc1Var.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(str, value);
        }
        for (Map.Entry entry2 : wc1Var.b.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (!jSONObject.has(str2)) {
                if (value2 == null) {
                    value2 = JSONObject.NULL;
                }
                jSONObject.put(str2, value2);
            }
        }
        jSONObject.put("af_id", xc1Var.b);
        jSONObject.put("bundle_id", xc1Var.c);
        jSONObject.put("os", "Android");
        jSONObject.put("store_id", xc1Var.d);
        jSONObject.put("locale", xc1Var.e);
        String str3 = xc1Var.f;
        if (str3 != null) {
            if (StringsKt.n(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                jSONObject.put("push_token", str3);
            }
        }
        String str4 = xc1Var.g;
        if (str4 != null) {
            String str5 = StringsKt.n(str4) ? null : str4;
            if (str5 != null) {
                jSONObject.put("firebase_project_id", str5);
            }
        }
        String jSONObject2 = jSONObject.toString();
        jSONObject2.getClass();
        return jSONObject2;
    }

    public static final void O() {
        throw new UnsupportedOperationException();
    }

    public static final void P(l81 l81Var, int i, a71 a71Var) {
        l81 l81Var2;
        eo0 eo0Var = new eo0(new l81[16]);
        List i2 = l81Var.i(false, false);
        while (true) {
            eo0Var.d(eo0Var.g, i2);
            while (true) {
                int i3 = eo0Var.g;
                if (i3 == 0) {
                    return;
                }
                l81Var2 = (l81) eo0Var.k(i3 - 1);
                boolean B = m90.B(l81Var2);
                h81 h81Var = l81Var2.d;
                vn0 vn0Var = h81Var.d;
                if (!B && !vn0Var.c(p81.i)) {
                    qp0 d = l81Var2.d();
                    if (d == null) {
                        throw qy0.g("Expected semantics node to have a coordinator.");
                    }
                    x90 C = y90.C(g(d, true));
                    if (C.a < C.c && C.b < C.d) {
                        Object g = h81Var.d.g(g81.e);
                        if (g == null) {
                            g = null;
                        }
                        Function2 function2 = (Function2) g;
                        Object g2 = vn0Var.g(p81.v);
                        z61 z61Var = (z61) (g2 != null ? g2 : null);
                        if (function2 != null && z61Var != null && ((Number) z61Var.b.invoke()).floatValue() > 0.0f) {
                            int i4 = 1 + i;
                            a71Var.invoke(new b71(l81Var2, i4, C, d));
                            P(l81Var2, i4, a71Var);
                        }
                    }
                }
            }
            i2 = l81Var2.i(false, false);
        }
    }

    public static Object Q(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.i()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static final float a(yw0 yw0Var, boolean z, o60[] o60VarArr, float f) {
        float f2 = Float.NaN;
        for (o60 o60Var : o60VarArr) {
            float b = yw0Var.b(o60Var);
            if (!Float.isNaN(f2)) {
                int i = z != (b > f2) ? i + 1 : 0;
            }
            f2 = b;
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final void b(dn0 dn0Var, int i) {
        if (dn0Var.b == 0 || !(dn0Var.c(0) == i || dn0Var.c(dn0Var.b - 1) == i)) {
            int i2 = dn0Var.b;
            dn0Var.a(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int c = dn0Var.c(i3);
                if (i <= c) {
                    break;
                }
                dn0Var.e(i2, c);
                i2 = i3;
            }
            dn0Var.e(i2, i);
        }
    }

    public static Object c(Task task) {
        y90.h("Must not be called on the main application thread");
        y90.g();
        y90.j(task, "Task must not be null");
        if (task.j()) {
            return Q(task);
        }
        mt1 mt1Var = new mt1();
        Executor executor = og1.b;
        task.e(executor, mt1Var);
        task.c(executor, mt1Var);
        task.a(executor, mt1Var);
        mt1Var.d.await();
        return Q(task);
    }

    public static Object d(Task task, long j) {
        y90.h("Must not be called on the main application thread");
        y90.g();
        y90.j(task, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        y90.j(timeUnit, "TimeUnit must not be null");
        if (task.j()) {
            return Q(task);
        }
        mt1 mt1Var = new mt1();
        Executor executor = og1.b;
        task.e(executor, mt1Var);
        task.c(executor, mt1Var);
        task.a(executor, mt1Var);
        if (mt1Var.d.await(j, timeUnit)) {
            return Q(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(o10 o10Var, z6 z6Var) {
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (H == null) {
                    dd0.j("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = H.E0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                l.a();
                                return false;
                            }
                            dd0.j("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (e(H, z6Var) || r(o10Var, H, 2, z6Var) || (H.B0().a && ((Boolean) z6Var.invoke(H)).booleanValue())) {
                        return true;
                    }
                }
                return r(o10Var, H, 2, z6Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    l.a();
                    return false;
                }
                if (!G(o10Var, z6Var)) {
                    if (!(o10Var.B0().a ? ((Boolean) z6Var.invoke(o10Var)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return G(o10Var, z6Var);
    }

    public static final s11 f(uc0 uc0Var) {
        uc0 l = uc0Var.l();
        return l != null ? l.J(uc0Var, true) : new s11(0.0f, 0.0f, (int) (uc0Var.K() >> 32), (int) (uc0Var.K() & 4294967295L));
    }

    public static final s11 g(uc0 uc0Var, boolean z) {
        uc0 n = n(uc0Var);
        float K = (int) (n.K() >> 32);
        float K2 = (int) (n.K() & 4294967295L);
        s11 J = n.J(uc0Var, z);
        float f = J.a;
        if (z) {
            if (f < 0.0f) {
                f = 0.0f;
            }
            if (f > K) {
                f = K;
            }
        }
        float f2 = J.b;
        if (z) {
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            if (f2 > K2) {
                f2 = K2;
            }
        }
        float f3 = J.c;
        if (z) {
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            if (f3 <= K) {
                K = f3;
            }
            f3 = K;
        }
        float f4 = J.d;
        if (z) {
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            if (f5 <= K2) {
                K2 = f5;
            }
            f4 = K2;
        }
        if (f == f3 || f2 == f4) {
            return s11.e;
        }
        long g = n.g((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long g2 = n.g((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long g3 = n.g((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long g4 = n.g((Float.floatToRawIntBits(f4) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (g2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (g4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (g3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (g & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (g2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (g4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (g3 & 4294967295L));
        return new s11(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final xc1 h(Context context, wc1 wc1Var, String str, String str2, String str3) {
        String str4;
        context.getClass();
        wc1Var.getClass();
        str.getClass();
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        if (locale == null || (str4 = locale.toLanguageTag()) == null) {
            str4 = "en";
        }
        String str5 = str4;
        String packageName = context.getPackageName();
        packageName.getClass();
        String packageName2 = context.getPackageName();
        packageName2.getClass();
        return new xc1(wc1Var, str, packageName, packageName2, str5, str2, str3);
    }

    public static zu1 i(Executor executor, Callable callable) {
        y90.j(executor, "Executor must not be null");
        zu1 zu1Var = new zu1();
        executor.execute(new lf(zu1Var, 16, callable));
        return zu1Var;
    }

    public static final void j(CoroutineContext coroutineContext, CancellationException cancellationException) {
        jb0 jb0Var = (jb0) coroutineContext.d(j41.m);
        if (jb0Var != null) {
            jb0Var.a(cancellationException);
        }
    }

    public static final void k(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(qy0.i(i, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final void l(CoroutineContext coroutineContext) {
        jb0 jb0Var = (jb0) coroutineContext.d(j41.m);
        if (jb0Var != null && !jb0Var.b()) {
            throw jb0Var.o();
        }
    }

    public static final int m(int i, mf0 mf0Var, Object obj) {
        int b;
        return (obj == null || mf0Var.c() == 0 || (i < mf0Var.c() && obj.equals(mf0Var.d(i))) || (b = mf0Var.d.b(obj)) == -1) ? i : b;
    }

    public static final uc0 n(uc0 uc0Var) {
        uc0 uc0Var2;
        uc0 l = uc0Var.l();
        while (true) {
            uc0 uc0Var3 = l;
            uc0Var2 = uc0Var;
            uc0Var = uc0Var3;
            if (uc0Var == null) {
                break;
            }
            l = uc0Var.l();
        }
        qp0 qp0Var = uc0Var2 instanceof qp0 ? (qp0) uc0Var2 : null;
        if (qp0Var == null) {
            return uc0Var2;
        }
        qp0 qp0Var2 = qp0Var.u;
        while (true) {
            qp0 qp0Var3 = qp0Var2;
            qp0 qp0Var4 = qp0Var;
            qp0Var = qp0Var3;
            if (qp0Var == null) {
                return qp0Var4;
            }
            qp0Var2 = qp0Var.u;
        }
    }

    public static zu1 o(Exception exc) {
        zu1 zu1Var = new zu1();
        zu1Var.l(exc);
        return zu1Var;
    }

    public static zu1 p(Object obj) {
        zu1 zu1Var = new zu1();
        zu1Var.m(obj);
        return zu1Var;
    }

    public static final boolean q(o10 o10Var, z6 z6Var) {
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (H != null) {
                    return q(H, z6Var) || r(o10Var, H, 1, z6Var);
                }
                dd0.j("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return o10Var.B0().a ? ((Boolean) z6Var.invoke(o10Var)).booleanValue() : H(o10Var, z6Var);
                }
                l.a();
                return false;
            }
        }
        return H(o10Var, z6Var);
    }

    public static final boolean r(o10 o10Var, o10 o10Var2, int i, z6 z6Var) {
        if (J(o10Var, o10Var2, i, z6Var)) {
            return true;
        }
        Boolean bool = (Boolean) mo.D(o10Var, i, new rr0(((e10) ((d4) op.J(o10Var)).getFocusOwner()).f(), o10Var, o10Var2, i, z6Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final vg0 s(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            vg0 vg0Var = tag instanceof vg0 ? (vg0) tag : null;
            if (vg0Var != null) {
                return vg0Var;
            }
            Object x = gb0.x(view);
            view = x instanceof View ? (View) x : null;
        }
        return null;
    }

    public static final jb0 t(CoroutineContext coroutineContext) {
        jb0 jb0Var = (jb0) coroutineContext.d(j41.m);
        if (jb0Var != null) {
            return jb0Var;
        }
        af.j(coroutineContext, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final ay0 u(View view) {
        ay0 ay0Var = (ay0) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (ay0Var != null) {
            return ay0Var;
        }
        ay0 ay0Var2 = new ay0();
        view.setTag(R.id.pooling_container_listener_holder_tag, ay0Var2);
        return ay0Var2;
    }

    public static final gj0 v(gj0 gj0Var) {
        jd0 jd0Var = gj0Var.s.s;
        while (true) {
            jd0 s = jd0Var.s();
            jd0 jd0Var2 = null;
            if ((s != null ? s.m : null) == null) {
                gj0 H0 = ((qp0) jd0Var.J.e).H0();
                H0.getClass();
                return H0;
            }
            jd0 s2 = jd0Var.s();
            if (s2 != null) {
                jd0Var2 = s2.m;
            }
            jd0Var2.getClass();
            jd0 s3 = jd0Var.s();
            s3.getClass();
            jd0Var = s3.m;
            jd0Var.getClass();
        }
    }

    public static final long w(double d) {
        return E((float) d, 4294967296L);
    }

    public static final long x(int i) {
        return E(i, 4294967296L);
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int z(int i, int i2) {
        return (i >> i2) & 31;
    }
}
