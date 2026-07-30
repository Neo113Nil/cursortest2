package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.cardview.widget.CardView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.google.firebase.encoders.json.BuildConfig;
import com.majelw.libystne.R;
import defpackage.aa2;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class o70 {
    public static Method g;
    public static boolean h;
    public static final xn a = new xn(-1.0f);
    public static final xn b = new xn(1.0f);
    public static final my c = new my(573387554, new ww(4), false);
    public static final da0 d = new da0(1.0f, 1.0f);
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static final va i = new va(1008);

    public static final float A(ca0 ca0Var, boolean z, long j) {
        float c2 = au1.c(ap.i(ql2.d(j), ql2.b(j))) / 2.0f;
        return z ? ca0Var.D(10.0f) + c2 : c2;
    }

    public static final boolean B(AssertionError assertionError) {
        Logger logger = gu1.a;
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? up2.q(message, "getsockname failed") : false) {
                return true;
            }
        }
        return false;
    }

    public static final boolean C(int i2) {
        int type = Character.getType(i2);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean D(int i2) {
        return Character.isWhitespace(i2) || i2 == 160;
    }

    public static final boolean E(int i2) {
        int type;
        return (!D(i2) || (type = Character.getType(i2)) == 14 || type == 13 || i2 == 10) ? false : true;
    }

    public static final i0 F(Object[] objArr) {
        objArr.getClass();
        return new i0(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0289  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final xy1 G(int i2, a00 a00Var) {
        TypedValue typedValue;
        int i3;
        long j;
        int i4;
        int eventType;
        z01 z01Var;
        XmlResourceParser xmlResourceParser;
        int i5;
        TypedArray obtainStyledAttributes;
        int i6;
        int i7;
        TypedArray obtainStyledAttributes2;
        int i8;
        int i9;
        Shader shader;
        cq nn2Var;
        ColorStateList colorStateList;
        Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
        Resources resources = (Resources) a00Var.j(AndroidCompositionLocals_androidKt.c);
        n92 n92Var = (n92) a00Var.j(AndroidCompositionLocals_androidKt.e);
        synchronized (n92Var) {
            typedValue = (TypedValue) n92Var.a.b(i2);
            i3 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i2, typedValue, true);
                zm1 zm1Var = n92Var.a;
                int d2 = zm1Var.d(i2);
                Object[] objArr = zm1Var.c;
                Object obj = objArr[d2];
                zm1Var.b[d2] = i2;
                objArr[d2] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !up2.r(charSequence, ".xml")) {
            a00Var.X(-1771631096);
            boolean f2 = a00Var.f(context.getTheme()) | a00Var.f(charSequence) | a00Var.d(i2);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                try {
                    Drawable drawable = resources.getDrawable(i2, null);
                    drawable.getClass();
                    M = new y9(((BitmapDrawable) drawable).getBitmap());
                    a00Var.i0(M);
                } catch (Exception e2) {
                    throw new hx("Error attempting to load resource: " + ((Object) charSequence), e2);
                }
            }
            ko koVar = new ko((y9) M, (r5.a.getHeight() & 4294967295L) | (r5.a.getWidth() << 32));
            a00Var.q(false);
            return koVar;
        }
        a00Var.X(-1771786530);
        Resources.Theme theme = context.getTheme();
        int i10 = typedValue.changingConfigurations;
        a11 a11Var = (a11) a00Var.j(AndroidCompositionLocals_androidKt.d);
        z01 z01Var2 = new z01(theme, i2);
        WeakReference weakReference = (WeakReference) a11Var.a.get(z01Var2);
        y01 y01Var = weakReference != null ? (y01) weakReference.get() : null;
        if (y01Var == null) {
            XmlResourceParser xml = resources.getXml(i2);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.b(xml.getName(), "vector")) {
                lh.e("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            bc bcVar = new bc(xml);
            int[] iArr = z71.m;
            TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            bcVar.c(obtainAttributes.getChangingConfigurations());
            boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null ? obtainAttributes.getBoolean(5, false) : false;
            bcVar.c(obtainAttributes.getChangingConfigurations());
            float b2 = bcVar.b(obtainAttributes, "viewportWidth", 7, 0.0f);
            float b3 = bcVar.b(obtainAttributes, "viewportHeight", 8, 0.0f);
            if (b2 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b3 <= 0.0f) {
                throw new XmlPullParserException(obtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = obtainAttributes.getDimension(3, 0.0f);
            bcVar.c(obtainAttributes.getChangingConfigurations());
            float dimension2 = obtainAttributes.getDimension(2, 0.0f);
            bcVar.c(obtainAttributes.getChangingConfigurations());
            if (obtainAttributes.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                obtainAttributes.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j = aw.g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        obtainAttributes.getValue(1, typedValue3);
                        int i11 = typedValue3.type;
                        if (i11 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i11 < 28 || i11 > 31) {
                            Resources resources2 = obtainAttributes.getResources();
                            int resourceId = obtainAttributes.getResourceId(1, 0);
                            ThreadLocal threadLocal = lw.a;
                            try {
                                colorStateList = lw.a(resources2, resources2.getXml(resourceId), theme);
                            } catch (Exception e3) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        bcVar.c(obtainAttributes.getChangingConfigurations());
                        j = colorStateList == null ? ap.c(colorStateList.getDefaultColor()) : aw.g;
                    }
                    colorStateList = null;
                    bcVar.c(obtainAttributes.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j = aw.g;
            }
            long j2 = j;
            int i12 = obtainAttributes.getInt(6, -1);
            bcVar.c(obtainAttributes.getChangingConfigurations());
            if (i12 != -1) {
                if (i12 == 3) {
                    i4 = 3;
                } else if (i12 != 5) {
                    if (i12 != 9) {
                        switch (i12) {
                            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                                i4 = 13;
                                break;
                            case 15:
                                i4 = 14;
                                break;
                            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                                i4 = 12;
                                break;
                        }
                    } else {
                        i4 = 9;
                    }
                }
                float f3 = dimension / resources.getDisplayMetrics().density;
                float f4 = dimension2 / resources.getDisplayMetrics().density;
                obtainAttributes.recycle();
                w01 w01Var = new w01(null, f3, f4, b2, b3, j2, i4, z, 1);
                int i13 = 0;
                for (int i14 = 3; xml.getEventType() != i3 && (xml.getDepth() >= i3 || xml.getEventType() != i14); i14 = 3) {
                    XmlPullParser xmlPullParser = bcVar.a;
                    int i15 = i3;
                    r4 r4Var = bcVar.c;
                    eventType = xmlPullParser.getEventType();
                    int i16 = i10;
                    if (eventType != 2) {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode != -1649314686) {
                                xmlResourceParser = xml;
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        int[] iArr2 = z71.n;
                                        TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                        bcVar.c(obtainAttributes2.getChangingConfigurations());
                                        float b4 = bcVar.b(obtainAttributes2, "rotation", 5, 0.0f);
                                        float f5 = obtainAttributes2.getFloat(i15, 0.0f);
                                        bcVar.c(obtainAttributes2.getChangingConfigurations());
                                        float f6 = obtainAttributes2.getFloat(2, 0.0f);
                                        bcVar.c(obtainAttributes2.getChangingConfigurations());
                                        float b5 = bcVar.b(obtainAttributes2, "scaleX", 3, 1.0f);
                                        float b6 = bcVar.b(obtainAttributes2, "scaleY", 4, 1.0f);
                                        float b7 = bcVar.b(obtainAttributes2, "translateX", 6, 0.0f);
                                        float b8 = bcVar.b(obtainAttributes2, "translateY", 7, 0.0f);
                                        String string = obtainAttributes2.getString(0);
                                        bcVar.c(obtainAttributes2.getChangingConfigurations());
                                        String str = string == null ? BuildConfig.FLAVOR : string;
                                        obtainAttributes2.recycle();
                                        ah0 ah0Var = y33.a;
                                        if (w01Var.k) {
                                            h21.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        w01Var.i.add(new v01(str, b4, f5, f6, b5, b6, b7, b8, ah0Var, 512));
                                    } else {
                                        z01Var = z01Var2;
                                        i6 = i15;
                                        xmlResourceParser.next();
                                        i3 = i6;
                                        z01Var2 = z01Var;
                                        i10 = i16;
                                        xml = xmlResourceParser;
                                    }
                                } else if (name.equals("path")) {
                                    int[] iArr3 = z71.o;
                                    if (theme == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i7 = 0;
                                    } else {
                                        i7 = 0;
                                        obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        lh.e("No path data available");
                                        return null;
                                    }
                                    String string2 = obtainStyledAttributes2.getString(i7);
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string2 == null ? BuildConfig.FLAVOR : string2;
                                    String string3 = obtainStyledAttributes2.getString(2);
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    List a2 = string3 == null ? y33.a : r4.a(r4Var, string3);
                                    r5 a3 = bcVar.a(obtainStyledAttributes2, theme, "fillColor", 1);
                                    float b9 = bcVar.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i17 = !ph2.h(bcVar.a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i17 != 0) {
                                        if (i17 != 1) {
                                            i8 = 2;
                                            if (i17 == 2) {
                                                i9 = 2;
                                            }
                                        } else {
                                            i8 = 2;
                                            i9 = 1;
                                        }
                                        int i18 = ph2.h(bcVar.a, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                        bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                        int i19 = i18 == 0 ? i18 != 1 ? i8 : 1 : 0;
                                        float b10 = bcVar.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                        r5 a4 = bcVar.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                        float b11 = bcVar.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b12 = bcVar.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b13 = bcVar.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b14 = bcVar.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b15 = bcVar.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        int i20 = ph2.h(bcVar.a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                        bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        shader = (Shader) a3.b;
                                        int i21 = a3.a;
                                        if (shader == null && i21 == 0) {
                                            z01Var = z01Var2;
                                            nn2Var = null;
                                        } else if (shader == null) {
                                            nn2Var = new dq(shader);
                                            z01Var = z01Var2;
                                        } else {
                                            z01Var = z01Var2;
                                            nn2Var = new nn2(ap.c(i21));
                                        }
                                        Shader shader2 = (Shader) a4.b;
                                        int i22 = a4.a;
                                        cq dqVar = (shader2 == null && i22 == 0) ? null : shader2 != null ? new dq(shader2) : new nn2(ap.c(i22));
                                        int i23 = i20 != 0 ? 0 : 1;
                                        if (w01Var.k) {
                                            h21.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        ((v01) w01Var.i.get(r0.size() - 1)).j.add(new b43(str2, a2, i23, nn2Var, b9, dqVar, b11, b12, i9, i19, b10, b15, b13, b14));
                                        i6 = 1;
                                        xmlResourceParser.next();
                                        i3 = i6;
                                        z01Var2 = z01Var;
                                        i10 = i16;
                                        xml = xmlResourceParser;
                                    } else {
                                        i8 = 2;
                                    }
                                    i9 = 0;
                                    if (ph2.h(bcVar.a, "strokeLineJoin")) {
                                    }
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i18 == 0) {
                                    }
                                    float b102 = bcVar.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 1.0f);
                                    r5 a42 = bcVar.a(obtainStyledAttributes2, theme, "strokeColor", 3);
                                    float b112 = bcVar.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b122 = bcVar.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b132 = bcVar.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b142 = bcVar.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b152 = bcVar.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (ph2.h(bcVar.a, "fillType")) {
                                    }
                                    bcVar.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    shader = (Shader) a3.b;
                                    int i212 = a3.a;
                                    if (shader == null) {
                                        z01Var = z01Var2;
                                        nn2Var = null;
                                        Shader shader22 = (Shader) a42.b;
                                        int i222 = a42.a;
                                        if (shader22 == null) {
                                            if (i20 != 0) {
                                            }
                                            if (w01Var.k) {
                                            }
                                            ((v01) w01Var.i.get(r0.size() - 1)).j.add(new b43(str2, a2, i23, nn2Var, b9, dqVar, b112, b122, i9, i19, b102, b152, b132, b142));
                                            i6 = 1;
                                            xmlResourceParser.next();
                                            i3 = i6;
                                            z01Var2 = z01Var;
                                            i10 = i16;
                                            xml = xmlResourceParser;
                                        }
                                        if (i20 != 0) {
                                        }
                                        if (w01Var.k) {
                                        }
                                        ((v01) w01Var.i.get(r0.size() - 1)).j.add(new b43(str2, a2, i23, nn2Var, b9, dqVar, b112, b122, i9, i19, b102, b152, b132, b142));
                                        i6 = 1;
                                        xmlResourceParser.next();
                                        i3 = i6;
                                        z01Var2 = z01Var;
                                        i10 = i16;
                                        xml = xmlResourceParser;
                                    }
                                    if (shader == null) {
                                    }
                                    Shader shader222 = (Shader) a42.b;
                                    int i2222 = a42.a;
                                    if (shader222 == null) {
                                    }
                                    if (i20 != 0) {
                                    }
                                    if (w01Var.k) {
                                    }
                                    ((v01) w01Var.i.get(r0.size() - 1)).j.add(new b43(str2, a2, i23, nn2Var, b9, dqVar, b112, b122, i9, i19, b102, b152, b132, b142));
                                    i6 = 1;
                                    xmlResourceParser.next();
                                    i3 = i6;
                                    z01Var2 = z01Var;
                                    i10 = i16;
                                    xml = xmlResourceParser;
                                }
                                z01Var = z01Var2;
                                i6 = 1;
                                xmlResourceParser.next();
                                i3 = i6;
                                z01Var2 = z01Var;
                                i10 = i16;
                                xml = xmlResourceParser;
                            } else {
                                z01Var = z01Var2;
                                xmlResourceParser = xml;
                                if (name.equals("clip-path")) {
                                    int[] iArr4 = z71.p;
                                    if (theme == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                        obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                    }
                                    bcVar.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string4 = obtainStyledAttributes.getString(i5);
                                    bcVar.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str3 = string4 == null ? BuildConfig.FLAVOR : string4;
                                    i6 = 1;
                                    String string5 = obtainStyledAttributes.getString(1);
                                    bcVar.c(obtainStyledAttributes.getChangingConfigurations());
                                    List a5 = string5 == null ? y33.a : r4.a(r4Var, string5);
                                    obtainStyledAttributes.recycle();
                                    if (w01Var.k) {
                                        h21.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    w01Var.i.add(new v01(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, a5, 512));
                                    i13++;
                                } else {
                                    i6 = 1;
                                }
                                xmlResourceParser.next();
                                i3 = i6;
                                z01Var2 = z01Var;
                                i10 = i16;
                                xml = xmlResourceParser;
                            }
                        }
                    } else if (eventType == i14 && "group".equals(xmlPullParser.getName())) {
                        int i24 = i13 + 1;
                        for (int i25 = 0; i25 < i24; i25++) {
                            ArrayList arrayList = w01Var.i;
                            if (w01Var.k) {
                                h21.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            v01 v01Var = (v01) arrayList.remove(arrayList.size() - 1);
                            ((v01) arrayList.get(arrayList.size() - 1)).j.add(new x33(v01Var.a, v01Var.b, v01Var.c, v01Var.d, v01Var.e, v01Var.f, v01Var.g, v01Var.h, v01Var.i, v01Var.j));
                        }
                        z01Var = z01Var2;
                        xmlResourceParser = xml;
                        i6 = i15;
                        i13 = 0;
                        xmlResourceParser.next();
                        i3 = i6;
                        z01Var2 = z01Var;
                        i10 = i16;
                        xml = xmlResourceParser;
                    }
                    z01Var = z01Var2;
                    xmlResourceParser = xml;
                    i6 = i15;
                    xmlResourceParser.next();
                    i3 = i6;
                    z01Var2 = z01Var;
                    i10 = i16;
                    xml = xmlResourceParser;
                }
                z01 z01Var3 = z01Var2;
                y01Var = new y01(w01Var.b(), i10 | bcVar.b);
                a11Var.a.put(z01Var3, new WeakReference(y01Var));
            }
            i4 = 5;
            float f32 = dimension / resources.getDisplayMetrics().density;
            float f42 = dimension2 / resources.getDisplayMetrics().density;
            obtainAttributes.recycle();
            w01 w01Var2 = new w01(null, f32, f42, b2, b3, j2, i4, z, 1);
            int i132 = 0;
            while (xml.getEventType() != i3) {
                XmlPullParser xmlPullParser2 = bcVar.a;
                int i152 = i3;
                r4 r4Var2 = bcVar.c;
                eventType = xmlPullParser2.getEventType();
                int i162 = i10;
                if (eventType != 2) {
                }
                z01Var = z01Var2;
                xmlResourceParser = xml;
                i6 = i152;
                xmlResourceParser.next();
                i3 = i6;
                z01Var2 = z01Var;
                i10 = i162;
                xml = xmlResourceParser;
            }
            z01 z01Var32 = z01Var2;
            y01Var = new y01(w01Var2.b(), i10 | bcVar.b);
            a11Var.a.put(z01Var32, new WeakReference(y01Var));
        }
        a43 k = hl2.k(y01Var.a, a00Var);
        a00Var.q(false);
        return k;
    }

    public static ll1 H(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i2 = duplicate.getShort() & 65535;
        if (i2 > 100) {
            dm0.j("Cannot read metadata.");
            return null;
        }
        duplicate.position(duplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j = -1;
                break;
            }
            int i4 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j2; i5++) {
                int i6 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    duplicate.position((int) (j3 + j));
                    ll1 ll1Var = new ll1();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    ll1Var.p = duplicate;
                    ll1Var.m = position;
                    int i7 = position - duplicate.getInt(position);
                    ll1Var.n = i7;
                    ll1Var.o = ((ByteBuffer) ll1Var.p).getShort(i7);
                    return ll1Var;
                }
            }
        }
        dm0.j("Cannot read metadata.");
        return null;
    }

    public static void I(t21 t21Var, float f2) {
        float f3;
        float f4;
        vb2 vb2Var = (vb2) t21Var.n;
        CardView cardView = (CardView) t21Var.o;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != vb2Var.e || vb2Var.f != useCompatPadding || vb2Var.g != preventCornerOverlap) {
            vb2Var.e = f2;
            vb2Var.f = useCompatPadding;
            vb2Var.g = preventCornerOverlap;
            vb2Var.b(null);
            vb2Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            t21Var.I(0, 0, 0, 0);
            return;
        }
        vb2 vb2Var2 = (vb2) t21Var.n;
        float f5 = vb2Var2.e;
        float f6 = vb2Var2.a;
        if (cardView.getPreventCornerOverlap()) {
            f3 = (float) (((1.0d - wb2.a) * f6) + f5);
        } else {
            int i2 = wb2.b;
            f3 = f5;
        }
        int ceil = (int) Math.ceil(f3);
        if (cardView.getPreventCornerOverlap()) {
            f4 = (float) (((1.0d - wb2.a) * f6) + (f5 * 1.5f));
        } else {
            f4 = f5 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f4);
        t21Var.I(ceil, ceil2, ceil, ceil2);
    }

    public static final qj J(InputStream inputStream) {
        Logger logger = gu1.a;
        inputStream.getClass();
        return new qj(inputStream, new rx2());
    }

    public static final int K(ym1 ym1Var) {
        int c2;
        int i2 = ym1Var.b;
        int c3 = ym1Var.c(0);
        while (ym1Var.b != 0 && ym1Var.c(0) == c3) {
            ym1Var.f(0, ym1Var.d());
            ym1Var.e(ym1Var.b - 1);
            int i3 = ym1Var.b;
            int i4 = i3 >>> 1;
            int i5 = 0;
            while (i5 < i4) {
                int c4 = ym1Var.c(i5);
                int i6 = (i5 + 1) * 2;
                int i7 = i6 - 1;
                int c5 = ym1Var.c(i7);
                if (i6 >= i3 || (c2 = ym1Var.c(i6)) <= c5) {
                    if (c5 > c4) {
                        ym1Var.f(i5, c5);
                        ym1Var.f(i7, c4);
                        i5 = i7;
                    }
                } else if (c2 > c4) {
                    ym1Var.f(i5, c2);
                    ym1Var.f(i6, c4);
                    i5 = i6;
                }
            }
        }
        return c3;
    }

    public static final long L(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static final String M(o30 o30Var) {
        Object ba2Var;
        if (o30Var instanceof pb0) {
            return ((pb0) o30Var).toString();
        }
        try {
            aa2.a aVar = aa2.m;
            ba2Var = o30Var + '@' + x(o30Var);
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        if (aa2.a(ba2Var) != null) {
            ba2Var = o30Var.getClass().getName() + '@' + x(o30Var);
        }
        return (String) ba2Var;
    }

    public static final String N(int i2) {
        if (i2 == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        char[] cArr = ap.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        h0.m.getClass();
        if (i3 < 0) {
            a.c(in1.l(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i3 <= 8) {
            return new String(cArr2, i3, 8 - i3);
        }
        lh.e(in1.l(i3, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    public static String O(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static String P(long j) {
        return v(j, 12884901888L) ? "Rgb" : v(j, 12884901889L) ? "Xyz" : v(j, 12884901890L) ? "Lab" : v(j, 17179869187L) ? "Cmyk" : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public static final void a(my myVar, a00 a00Var, int i2) {
        a00Var.Z(-1717094506);
        int i3 = 0;
        if (a00Var.P(i2 & 1, (i2 & 3) != 2)) {
            vl1 h2 = a.h(l41.q(1.0f, cw.t, androidx.compose.foundation.a.b(yk3.u(b.c(sl1.a, 1.0f), zb2.a(16.0f)), cw.s, ap.e), zb2.a(16.0f)), 14.0f);
            qw a2 = ow.a(new yh(8.0f, true, sc.o), qb2.A, a00Var, 6);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a2, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar.invoke(a00Var, 6);
            a00Var.q(true);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new d51(myVar, i2, i3);
        }
    }

    public static m92 b(int i2, jq0 jq0Var) {
        return new m92(i2, jq0Var, new iq0(new hq0[0]));
    }

    public static y9 c(int i2, int i3, int i4) {
        Bitmap createBitmap;
        pa2 pa2Var = kw.e;
        Bitmap.Config H = k31.H(i4);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = k31.g(i2, i3, i4, pa2Var);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i2, i3, H);
            createBitmap.setHasAlpha(true);
        }
        return new y9(createBitmap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0187, code lost:
    
        if (r2.equals("palladium") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0190, code lost:
    
        if (r2.equals("white_gold") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01ab, code lost:
    
        r3 = "gold";
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0197, code lost:
    
        if (r2.equals("gold") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01a0, code lost:
    
        if (r2.equals("silver") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01a9, code lost:
    
        if (r2.equals("rose_gold") != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017e, code lost:
    
        if (r2.equals("platinum") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0236, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.b(r52.M(), java.lang.Integer.valueOf(r4)) == false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(long j, final Function0 function0, Function1 function1, Function1 function12, vl1 vl1Var, a00 a00Var, final int i2) {
        Function1 function13;
        Function1 function14;
        long j2;
        final vl1 vl1Var2;
        a00 a00Var2;
        String str;
        ik ikVar;
        ik ikVar2;
        boolean z;
        a00 a00Var3;
        int i3;
        final a61 a61Var;
        sc scVar;
        boolean z2;
        ?? r12;
        boolean z3;
        nh nhVar;
        a00 a00Var4;
        Object obj;
        Object obj2;
        su suVar = ap.e;
        sc scVar2 = sc.o;
        function0.getClass();
        function1.getClass();
        function12.getClass();
        a00Var.Z(-1070575136);
        int i4 = 4;
        int i5 = i2 | (a00Var.e(j) ? 4 : 2) | (a00Var.h(function0) ? 32 : 16) | (a00Var.h(function1) ? 256 : 128) | (a00Var.h(function12) ? 2048 : 1024) | 24576;
        if (a00Var.P(i5 & 1, (i5 & 9363) != 9362)) {
            final Context context = (Context) a00Var.j(AndroidCompositionLocals_androidKt.b);
            Object M = a00Var.M();
            nj njVar = sz.a;
            Object obj3 = M;
            if (M == njVar) {
                ij1 i6 = ij1.d.i(context);
                a00Var.i0(i6);
                obj3 = i6;
            }
            ij1 ij1Var = (ij1) obj3;
            Object M2 = a00Var.M();
            Object obj4 = M2;
            if (M2 == njVar) {
                a50 x = l41.x(h.m, a00Var);
                a00Var.i0(x);
                obj4 = x;
            }
            a50 a50Var = (a50) obj4;
            final nh nhVar2 = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            zn1 a2 = ij2.a(bd3.p(ij1Var.c.a, new String[]{"jewelry_item"}, new u51(j, i4)), null, null, a00Var, 48, 2);
            qn0 p = bd3.p(ij1Var.c.a, new String[]{"item_stone"}, new u51(j, 1));
            ah0 ah0Var = ah0.m;
            zn1 a3 = ij2.a(p, ah0Var, null, a00Var, 48, 2);
            zn1 a4 = ij2.a(ij1Var.c(null), ah0Var, null, a00Var, 48, 2);
            a61 a61Var2 = (a61) a2.getValue();
            sl1 sl1Var = sl1.a;
            if (a61Var2 == null) {
                a00Var.X(923923109);
                fp.a(androidx.compose.foundation.a.b(b.b(sl1Var, 1.0f), cw.r, suVar), a00Var, 0);
                a00Var.q(false);
                n72 s = a00Var.s();
                if (s != null) {
                    s.d = new c51(j, function0, function1, function12, i2);
                    return;
                }
                return;
            }
            String str2 = a61Var2.k;
            a00Var.X(1969466373);
            a00Var.q(false);
            List list = (List) a4.getValue();
            final ArrayList arrayList = new ArrayList();
            for (Object obj5 : list) {
                if (((List) a3.getValue()).contains(((ik) obj5).a)) {
                    arrayList.add(obj5);
                }
            }
            String str3 = a61Var2.d;
            switch (str3.hashCode()) {
                case -2041761456:
                    break;
                case -902311155:
                    str = "silver";
                    break;
                case 3178592:
                    break;
                case 258186934:
                    break;
                case 1228204333:
                    str = "palladium";
                    break;
                case 1874772524:
                    str = "platinum";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                Iterator it = ((List) a4.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (Intrinsics.b(((ik) obj2).a, str)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                ikVar = (ik) obj2;
            } else {
                ikVar = null;
            }
            vl1 T = s03.T(androidx.compose.foundation.a.b(b.b(sl1Var, 1.0f), cw.r, suVar), s03.G(a00Var));
            wh whVar = s93.c;
            yn ynVar = qb2.A;
            qw a5 = ow.a(whVar, ynVar, a00Var, 0);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, T);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar3 = oz.f;
            uj2.e(a00Var, a5, scVar3);
            sc scVar4 = oz.e;
            uj2.e(a00Var, l, scVar4);
            sc scVar5 = oz.g;
            if (a00Var.S) {
                ikVar2 = ikVar;
            } else {
                ikVar2 = ikVar;
            }
            q40.r(D, a00Var, D, scVar5);
            sc scVar6 = oz.d;
            uj2.e(a00Var, E, scVar6);
            vl1 h2 = a.h(b.c(sl1Var, 1.0f), 4.0f);
            fc2 a6 = ec2.a(s93.a, qb2.z, a00Var, 48);
            int D2 = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E2 = bd3.E(a00Var, h2);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, a6, scVar3);
            uj2.e(a00Var, l2, scVar4);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var, D2, scVar5);
            }
            uj2.e(a00Var, E2, scVar6);
            ap.h(function0, null, false, null, l41.b, a00Var, 196608 | ((i5 >> 3) & 14));
            fp.a(new LayoutWeightElement(1.0f, true), a00Var, 0);
            int i7 = i5 & 14;
            boolean h3 = a00Var.h(a50Var) | a00Var.h(ij1Var) | (i7 == 4) | a00Var.f(a61Var2);
            Object M3 = a00Var.M();
            if (h3 || M3 == njVar) {
                z = 4;
                a00Var3 = a00Var;
                i3 = i7;
                d5 d5Var = new d5(a50Var, ij1Var, j, a61Var2, 1);
                a61Var = a61Var2;
                a00Var3.i0(d5Var);
                M3 = d5Var;
            } else {
                i3 = i7;
                z = 4;
                a61Var = a61Var2;
                a00Var3 = a00Var;
            }
            final int i8 = 0;
            final a61 a61Var3 = a61Var;
            a00 a00Var5 = a00Var3;
            ap.h((Function0) M3, null, false, null, yj1.H(-842558066, new Function2() { // from class: e51
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    int i9 = i8;
                    a61 a61Var4 = a61Var;
                    switch (i9) {
                        case 0:
                            boolean z4 = a61Var4.l;
                            a00 a00Var6 = (a00) obj6;
                            int intValue = ((Integer) obj7).intValue();
                            if (a00Var6.P(intValue & 1, (intValue & 3) != 2)) {
                                k01.a(z4 ? yj1.x() : z71.w(), uj2.f(R.string.action_favourite, a00Var6), null, z4 ? ap.d(4294924938L) : cw.u, a00Var6, 0, 4);
                            } else {
                                a00Var6.S();
                            }
                            break;
                        default:
                            a00 a00Var7 = (a00) obj6;
                            int intValue2 = ((Integer) obj7).intValue();
                            if (a00Var7.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str4 = a61Var4.j;
                                str4.getClass();
                                yv2.b(str4, null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var7.j(n13.a)).k, a00Var7, 384, 0, 65530);
                            } else {
                                a00Var7.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, a00Var3), a00Var5, 196608);
            boolean h4 = a00Var5.h(context) | a00Var5.f(a61Var3) | a00Var5.h(arrayList) | a00Var5.d(nhVar2.ordinal());
            Object M4 = a00Var5.M();
            if (h4 || M4 == njVar) {
                M4 = new Function0() { // from class: f51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str4;
                        StringBuilder sb = new StringBuilder();
                        a61 a61Var4 = a61Var3;
                        sb.append(a61Var4.b);
                        sb.append('\n');
                        String str5 = a61Var4.c;
                        String str6 = a61Var4.d;
                        String str7 = a61Var4.e;
                        sb.append(str5 + " · " + str6 + (str7 != null ? " ".concat(str7) : BuildConfig.FLAVOR));
                        sb.append('\n');
                        Double d2 = a61Var4.f;
                        if (d2 != null) {
                            double doubleValue = d2.doubleValue();
                            Double valueOf = Double.valueOf(doubleValue);
                            DecimalFormat decimalFormat = c61.a;
                            if (Intrinsics.a(valueOf)) {
                                str4 = "—";
                            } else {
                                str4 = c61.a.format(doubleValue) + " g";
                            }
                            sb.append("Weight: ".concat(str4));
                            sb.append('\n');
                        }
                        Double d3 = a61Var4.i;
                        if (d3 != null) {
                            sb.append("Value: ".concat(c61.a(Double.valueOf(d3.doubleValue()))));
                            sb.append('\n');
                        }
                        ArrayList arrayList2 = arrayList;
                        if (!arrayList2.isEmpty()) {
                            sb.append("Stones: ".concat(zv.A(arrayList2, ", ", null, null, new a0(5, nhVar2), 30)));
                            sb.append('\n');
                        }
                        String sb2 = sb.toString();
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/plain");
                        intent.putExtra("android.intent.extra.TEXT", sb2);
                        context.startActivity(Intent.createChooser(intent, null));
                        return Unit.a;
                    }
                };
                a00Var5.i0(M4);
            }
            ap.h((Function0) M4, null, false, null, l41.c, a00Var5, 196608);
            a00Var5.q(true);
            vl1 d2 = a.d(b.c(a.j(sl1Var, 16.0f, 0.0f, 2), 1.0f));
            ao aoVar = qb2.t;
            oj1 e2 = fp.e(aoVar, false);
            int D3 = iv1.D(a00Var5);
            v02 l3 = a00Var5.l();
            vl1 E3 = bd3.E(a00Var5, d2);
            a00Var5.b0();
            if (a00Var5.S) {
                a00Var5.k(o00Var);
            } else {
                a00Var5.l0();
            }
            uj2.e(a00Var5, e2, scVar3);
            uj2.e(a00Var5, l3, scVar4);
            if (a00Var5.S || !Intrinsics.b(a00Var5.M(), Integer.valueOf(D3))) {
                scVar = scVar5;
                q40.r(D3, a00Var5, D3, scVar);
            } else {
                scVar = scVar5;
            }
            uj2.e(a00Var5, E3, scVar6);
            int i9 = i3;
            ArrayList arrayList2 = arrayList;
            l41.g(G(R.drawable.frame_gold, a00Var5), b.b(sl1Var, 1.0f), null, p20.e, 0.0f, a00Var5, 25008, 104);
            vl1 a7 = androidx.compose.foundation.a.a(yk3.u(b.b(sl1Var, 0.54f), zb2.a(6.0f)), new xd1(qv.g(new aw(cw.c), new aw(cw.n)), 0L, 9187343241974906880L));
            oj1 e3 = fp.e(aoVar, false);
            int D4 = iv1.D(a00Var5);
            v02 l4 = a00Var5.l();
            vl1 E4 = bd3.E(a00Var5, a7);
            a00Var5.b0();
            if (a00Var5.S) {
                a00Var5.k(o00Var);
            } else {
                a00Var5.l0();
            }
            uj2.e(a00Var5, e3, scVar3);
            uj2.e(a00Var5, l4, scVar4);
            if (a00Var5.S || !Intrinsics.b(a00Var5.M(), Integer.valueOf(D4))) {
                q40.r(D4, a00Var5, D4, scVar);
            }
            uj2.e(a00Var5, E4, scVar6);
            if (str2 != null) {
                a00Var5.X(-1025613549);
                mh2.a(str2, yk3.u(b.b(sl1Var, 1.0f), zb2.a(6.0f)), a00Var5);
                z2 = false;
            } else {
                z2 = false;
                a00Var5.X(-1031457824);
            }
            a00Var5.q(z2);
            a00Var5.q(true);
            a00Var5.q(true);
            vl1 h5 = a.h(sl1Var, 16.0f);
            qw a8 = ow.a(new yh(14.0f, true, scVar2), ynVar, a00Var5, 6);
            int D5 = iv1.D(a00Var5);
            v02 l5 = a00Var5.l();
            vl1 E5 = bd3.E(a00Var5, h5);
            a00Var5.b0();
            if (a00Var5.S) {
                a00Var5.k(o00Var);
            } else {
                a00Var5.l0();
            }
            uj2.e(a00Var5, a8, scVar3);
            uj2.e(a00Var5, l5, scVar4);
            if (a00Var5.S || !Intrinsics.b(a00Var5.M(), Integer.valueOf(D5))) {
                q40.r(D5, a00Var5, D5, scVar);
            }
            uj2.e(a00Var5, E5, scVar6);
            String str4 = a61Var3.b;
            if (up2.y(str4)) {
                str4 = "—";
            }
            ik ikVar3 = ikVar2;
            yv2.b(str4, null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var5.j(n13.a)).c, a00Var, 384, 0, 65530);
            a00 a00Var6 = a00Var;
            a(yj1.H(1537651241, new ss(4, a61Var3, context), a00Var6), a00Var6, 6);
            String str5 = a61Var3.j;
            if (str5 == null || up2.y(str5)) {
                r12 = 1;
                z3 = false;
                a00Var6.X(238280278);
            } else {
                a00Var6.X(245427421);
                r12 = 1;
                final boolean z4 = true ? 1 : 0;
                a(yj1.H(1413677764, new Function2() { // from class: e51
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        int i92 = z4;
                        a61 a61Var4 = a61Var3;
                        switch (i92) {
                            case 0:
                                boolean z42 = a61Var4.l;
                                a00 a00Var62 = (a00) obj6;
                                int intValue = ((Integer) obj7).intValue();
                                if (a00Var62.P(intValue & 1, (intValue & 3) != 2)) {
                                    k01.a(z42 ? yj1.x() : z71.w(), uj2.f(R.string.action_favourite, a00Var62), null, z42 ? ap.d(4294924938L) : cw.u, a00Var62, 0, 4);
                                } else {
                                    a00Var62.S();
                                }
                                break;
                            default:
                                a00 a00Var7 = (a00) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if (a00Var7.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    String str42 = a61Var4.j;
                                    str42.getClass();
                                    yv2.b(str42, null, cw.u, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var7.j(n13.a)).k, a00Var7, 384, 0, 65530);
                                } else {
                                    a00Var7.S();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, a00Var6), a00Var6, 6);
                z3 = false;
            }
            a00Var6.q(z3);
            if (arrayList2.isEmpty()) {
                function14 = function12;
                nhVar = nhVar2;
                a00Var6.X(238280278);
                a00Var4 = a00Var6;
            } else {
                a00Var6.X(245643243);
                l(uj2.f(R.string.item_stones, a00Var6), a00Var6, z3 ? 1 : 0);
                yh yhVar = new yh(8.0f, r12, scVar2);
                yh yhVar2 = new yh(8.0f, r12, scVar2);
                function14 = function12;
                nhVar = nhVar2;
                my H = yj1.H(616012547, new b5(arrayList2, function14, nhVar, r12), a00Var6);
                arrayList2 = arrayList2;
                xn0.a(null, yhVar, yhVar2, 0, 0, null, H, a00Var, 1573296);
                a00Var4 = a00Var;
            }
            a00Var4.q(z3);
            le1 b2 = pv.b();
            if (ikVar3 != null) {
                String str6 = ikVar3.q;
                String str7 = ikVar3.p;
                if (!up2.y(s03.F(str7, str6, nhVar))) {
                    b2.add(ikVar3.c(nhVar) + ": " + s03.F(str7, str6, nhVar));
                }
                Unit unit = Unit.a;
            }
            int size = arrayList2.size();
            int i10 = z3 ? 1 : 0;
            while (i10 < size) {
                ArrayList arrayList3 = arrayList2;
                Object obj6 = arrayList3.get(i10);
                i10++;
                ik ikVar4 = (ik) obj6;
                String str8 = ikVar4.p;
                String str9 = ikVar4.q;
                if (!up2.y(s03.F(str8, str9, nhVar))) {
                    b2.add(ikVar4.c(nhVar) + ": " + s03.F(ikVar4.p, str9, nhVar));
                }
                arrayList2 = arrayList3;
            }
            le1 a9 = pv.a(b2);
            if (a9.isEmpty()) {
                a00Var4.X(238280278);
            } else {
                a00Var4.X(246786523);
                l(uj2.f(R.string.item_care, a00Var4), a00Var4, z3 ? 1 : 0);
                a(yj1.H(-395686340, new pu0(r12, a9), a00Var4), a00Var4, 6);
            }
            a00Var4.q(z3);
            String f2 = uj2.f(R.string.btn_edit, a00Var4);
            boolean z5 = (i5 & 896) == 256 ? r12 : z3 ? 1 : 0;
            if (i9 == 4) {
                z3 = r12;
            }
            boolean z6 = z5 | z3;
            Object M5 = a00Var4.M();
            if (z6 != 0 || M5 == njVar) {
                j2 = j;
                function13 = function1;
                rb rbVar = new rb(r12, j2, function13);
                a00Var4.i0(rbVar);
                obj = rbVar;
            } else {
                j2 = j;
                function13 = function1;
                obj = M5;
            }
            yi1.a(f2, (Function0) obj, b.c(sl1Var, 1.0f), null, false, a00Var4, 384, 24);
            a00Var4.q(r12);
            a00Var4.q(r12);
            vl1Var2 = sl1Var;
            a00Var2 = a00Var4;
        } else {
            function13 = function1;
            function14 = function12;
            a00 a00Var7 = a00Var;
            j2 = j;
            a00Var7.S();
            vl1Var2 = vl1Var;
            a00Var2 = a00Var7;
        }
        n72 s2 = a00Var2.s();
        if (s2 != null) {
            final long j3 = j2;
            final Function1 function15 = function13;
            final Function1 function16 = function14;
            s2.d = new Function2(j3, function0, function15, function16, vl1Var2, i2) { // from class: g51
                public final /* synthetic */ long m;
                public final /* synthetic */ Function0 n;
                public final /* synthetic */ Function1 o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ vl1 q;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int R = s03.R(1);
                    o70.d(this.m, this.n, this.o, this.p, this.q, (a00) obj7, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(lw0 lw0Var, vl1 vl1Var, va1 va1Var, zx1 zx1Var, zh zhVar, xh xhVar, om0 om0Var, boolean z, Function1 function1, a00 a00Var, int i2) {
        int i3;
        om0 om0Var2;
        boolean z2;
        va1 va1Var2;
        zx1 zx1Var2;
        xh xhVar2;
        boolean z3;
        om0 om0Var3;
        a00Var.Z(1485410512);
        int i4 = i2 | (a00Var.f(lw0Var) ? 4 : 2) | 104882304 | (a00Var.h(function1) ? 536870912 : 268435456);
        if ((306783379 & i4) == 306783378 && a00Var.B()) {
            a00Var.S();
            va1Var2 = va1Var;
            om0Var3 = om0Var;
            z3 = z;
        } else {
            a00Var.U();
            int i5 = i2 & 1;
            int i6 = 3;
            Object obj = sz.a;
            if (i5 == 0 || a00Var.z()) {
                na1 na1Var = xa1.a;
                Object[] objArr = new Object[0];
                tt1 tt1Var = va1.t;
                boolean d2 = a00Var.d(0) | a00Var.d(0);
                Object M = a00Var.M();
                if (d2 || M == obj) {
                    M = new m13(r13, i6);
                    a00Var.i0(M);
                }
                va1 va1Var3 = (va1) ll3.Q(objArr, tt1Var, (Function0) M, a00Var, 0, 4);
                q70 a2 = co2.a(a00Var);
                boolean f2 = a00Var.f(a2);
                Object M2 = a00Var.M();
                if (f2 || M2 == obj) {
                    M2 = new b80(a2);
                    a00Var.i0(M2);
                }
                i3 = i4 & (-29361025);
                om0Var2 = (b80) M2;
                z2 = true;
                va1Var2 = va1Var3;
            } else {
                a00Var.S();
                i3 = i4 & (-29361025);
                va1Var2 = va1Var;
                om0Var2 = om0Var;
                z2 = z;
            }
            a00Var.r();
            int i7 = (i3 & 14) | 432;
            r13 = ((((i7 & 14) ^ 6) > 4 && a00Var.f(lw0Var)) || (i7 & 6) == 4) ? 1 : 0;
            Object M3 = a00Var.M();
            if (r13 != 0 || M3 == obj) {
                zx1Var2 = zx1Var;
                xhVar2 = xhVar;
                M3 = new nw0(new m8(zx1Var2, lw0Var, xhVar2, i6));
                a00Var.i0(M3);
            } else {
                zx1Var2 = zx1Var;
                xhVar2 = xhVar;
            }
            l41.j(vl1Var, va1Var2, (nw0) M3, zx1Var2, om0Var2, z2, zhVar, xhVar2, function1, a00Var, 918776838, (i3 >> 27) & 14);
            z3 = z2;
            om0Var3 = om0Var2;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new aa1(lw0Var, vl1Var, va1Var2, zx1Var, zhVar, xhVar, om0Var3, z3, function1, i2);
        }
    }

    public static final void f(Boolean bool, Object obj, id1 id1Var, Function1 function1, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(696924721);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(bool) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= a00Var.h(function1) ? 2048 : 1024;
        }
        if (a00Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            a00Var.U();
            if ((i2 & 1) == 0 || a00Var.z()) {
                id1Var = (id1) a00Var.j(mf1.a);
            } else {
                a00Var.S();
            }
            int i4 = i3 & (-897);
            a00Var.r();
            boolean f2 = a00Var.f(bool) | a00Var.f(obj) | a00Var.f(id1Var);
            Object M = a00Var.M();
            if (f2 || M == sz.a) {
                M = new ld1(id1Var.getLifecycle());
                a00Var.i0(M);
            }
            g(id1Var, (ld1) M, function1, a00Var, (i4 >> 3) & 896);
        } else {
            a00Var.S();
        }
        id1 id1Var2 = id1Var;
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new wi(bool, obj, id1Var2, function1, i2, 2);
        }
    }

    public static final void g(id1 id1Var, ld1 ld1Var, Function1 function1, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(228371534);
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(id1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(ld1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= a00Var.h(function1) ? 256 : 128;
        }
        int i4 = 1;
        if (a00Var.P(i3 & 1, (i3 & 147) != 146)) {
            boolean h2 = a00Var.h(ld1Var) | ((i3 & 896) == 256) | a00Var.h(id1Var);
            Object M = a00Var.M();
            if (h2 || M == sz.a) {
                M = new t4(id1Var, ld1Var, function1, i4);
                a00Var.i0(M);
            }
            l41.e(id1Var, ld1Var, (Function1) M, a00Var);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new us(id1Var, ld1Var, function1, i2, 3);
        }
    }

    public static final void h(up1 up1Var, vl1 vl1Var, f6 f6Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, a00 a00Var, int i2) {
        f6 f6Var2;
        int i3;
        Function1 function16;
        Function1 function17;
        Function1 function18;
        char c2;
        Function1 function19;
        f6 f6Var3;
        a00Var.Z(1840250294);
        int i4 = i2 | (a00Var.h(up1Var) ? 4 : 2) | (a00Var.f(vl1Var) ? 256 : 128) | 844852224;
        char c3 = a00Var.h(function15) ? (char) 4 : (char) 2;
        if ((306783379 & i4) == 306783378 && (c3 & 3) == 2 && a00Var.B()) {
            a00Var.S();
            f6Var3 = f6Var;
            function16 = function1;
            function19 = function12;
            function17 = function13;
            function18 = function14;
        } else {
            a00Var.U();
            if ((i2 & 1) == 0 || a00Var.z()) {
                f6Var2 = qb2.p;
                i3 = i4 & (-264241153);
                function16 = bl0.N;
                function17 = function16;
                function18 = bl0.O;
                c2 = c3;
                function19 = function18;
            } else {
                a00Var.S();
                i3 = i4 & (-264241153);
                f6Var2 = f6Var;
                function16 = function1;
                function17 = function13;
                function18 = function14;
                c2 = c3;
                function19 = function12;
            }
            a00Var.r();
            boolean z = (c2 & 14) == 4;
            Object M = a00Var.M();
            if (z || M == sz.a) {
                sp1 sp1Var = new sp1(up1Var.v);
                function15.invoke(sp1Var);
                M = sp1Var.c();
                a00Var.i0(M);
            }
            f6Var3 = f6Var2;
            i(up1Var, (rp1) M, vl1Var, f6Var3, function16, function19, function17, function18, a00Var, (i3 & 8078) | 100884480);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new vp1(up1Var, vl1Var, f6Var3, function16, function19, function17, function18, function15, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x033b  */
    /* JADX WARN: Type inference failed for: r15v2, types: [a00] */
    /* JADX WARN: Type inference failed for: r23v2, types: [o30] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, up1] */
    /* JADX WARN: Type inference failed for: r5v14, types: [fz2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(up1 up1Var, rp1 rp1Var, vl1 vl1Var, f6 f6Var, Function1 function1, Function1 function12, Function1 function13, Function1 function14, a00 a00Var, int i2) {
        int i3;
        id1 id1Var;
        dr1 dr1Var;
        ab0 ab0Var;
        Object obj;
        ez ezVar;
        zn1 zn1Var;
        dr1 dr1Var2;
        Function1 function15;
        kd2 kd2Var;
        Function1 function16;
        dr1 dr1Var3;
        so2 so2Var;
        int i4;
        fz2 fz2Var;
        cp1 cp1Var;
        ab0 ab0Var2;
        ab0 ab0Var3;
        Object xp1Var;
        ez ezVar2;
        kd2 kd2Var2;
        Map map;
        so2 so2Var2;
        zn1 zn1Var2;
        ?? r7;
        Intent intent;
        int[] intArray;
        Bundle bundle;
        bi biVar;
        mp1 f2;
        ArrayList arrayList;
        int length;
        int i5;
        String str;
        op1 e2;
        rp1 rp1Var2;
        Bundle bundle2;
        op1 e3;
        rp1 rp1Var3;
        ArrayList<String> stringArrayList;
        a00 a00Var2;
        a00Var.Z(-1964664536);
        int i6 = (i2 & 6) == 0 ? (a00Var.h(up1Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i6 |= a00Var.h(rp1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i6 |= a00Var.f(vl1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= a00Var.f(f6Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= a00Var.h(function1) ? 16384 : Utility.DEFAULT_STREAM_BUFFER_SIZE;
        }
        if ((196608 & i2) == 0) {
            i6 |= a00Var.h(function12) ? 131072 : NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REQUEST;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= a00Var.h(function13) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= a00Var.h(function14) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= a00Var.h(null) ? 67108864 : 33554432;
        }
        int i7 = i6;
        if ((38347923 & i7) == 38347922 && a00Var.B()) {
            a00Var.S();
            a00Var2 = a00Var;
        } else {
            a00Var.U();
            if ((i2 & 1) != 0 && !a00Var.z()) {
                a00Var.S();
            }
            a00Var.r();
            id1 id1Var2 = (id1) a00Var.j(mf1.a);
            u53 a2 = qf1.a(a00Var);
            if (a2 == null) {
                lh.g("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
                return;
            }
            t53 viewModelStore = a2.getViewModelStore();
            up1Var.getClass();
            bi biVar2 = up1Var.g;
            dr1 dr1Var4 = up1Var.v;
            viewModelStore.getClass();
            if (!Intrinsics.b(up1Var.p, yk3.E(viewModelStore))) {
                if (!biVar2.isEmpty()) {
                    lh.g("ViewModelStore should be set before setGraph call");
                    return;
                }
                up1Var.p = yk3.E(viewModelStore);
            }
            rp1Var.getClass();
            LinkedHashMap linkedHashMap = up1Var.w;
            yn2 yn2Var = rp1Var.v;
            if (!biVar2.isEmpty() && up1Var.g() == zc1.m) {
                lh.g("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
                return;
            }
            boolean z = false;
            if (Intrinsics.b(up1Var.c, rp1Var)) {
                i3 = i7;
                id1Var = id1Var2;
                int f3 = yn2Var.f();
                for (int i8 = 0; i8 < f3; i8++) {
                    op1 op1Var = (op1) yn2Var.g(i8);
                    rp1 rp1Var4 = up1Var.c;
                    rp1Var4.getClass();
                    int d2 = rp1Var4.v.d(i8);
                    rp1 rp1Var5 = up1Var.c;
                    rp1Var5.getClass();
                    yn2 yn2Var2 = rp1Var5.v;
                    if (yn2Var2.m) {
                        ll3.g(yn2Var2);
                    }
                    int o = yk3.o(yn2Var2.p, d2, yn2Var2.n);
                    if (o >= 0) {
                        Object[] objArr = yn2Var2.o;
                        Object obj2 = objArr[o];
                        objArr[o] = op1Var;
                    }
                }
                Iterator it = biVar2.iterator();
                while (it.hasNext()) {
                    cp1 cp1Var2 = (cp1) it.next();
                    int i9 = op1.u;
                    op1 op1Var2 = cp1Var2.n;
                    op1Var2.getClass();
                    List e4 = dj2.e(aj2.c(op1Var2, bl0.K));
                    e4.getClass();
                    ni1 ni1Var = new ni1(e4);
                    op1 op1Var3 = up1Var.c;
                    op1Var3.getClass();
                    Iterator it2 = ni1Var.iterator();
                    while (true) {
                        ListIterator listIterator = (ListIterator) ((ka2) it2).n;
                        if (listIterator.hasPrevious()) {
                            op1 op1Var4 = (op1) listIterator.previous();
                            if ((!Intrinsics.b(op1Var4, up1Var.c) || !op1Var3.equals(rp1Var)) && (op1Var3 instanceof rp1)) {
                                rp1 rp1Var6 = (rp1) op1Var3;
                                op1Var3 = rp1Var6.e(op1Var4.r, rp1Var6, false);
                                op1Var3.getClass();
                            }
                        }
                    }
                    cp1Var2.n = op1Var3;
                }
            } else {
                rp1 rp1Var7 = up1Var.c;
                if (rp1Var7 != null) {
                    ArrayList arrayList2 = new ArrayList(up1Var.m.keySet());
                    int size = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList2.get(i10);
                        int i11 = i10 + 1;
                        Integer num = (Integer) obj3;
                        num.getClass();
                        int intValue = num.intValue();
                        Iterator it3 = linkedHashMap.values().iterator();
                        while (it3.hasNext()) {
                            ((fp1) it3.next()).d = true;
                        }
                        Unit unit = Unit.a;
                        boolean q = up1Var.q(intValue, null, new dq1(z, true, -1, z, z, -1, -1));
                        for (Iterator it4 = linkedHashMap.values().iterator(); it4.hasNext(); it4 = it4) {
                            ((fp1) it4.next()).d = false;
                        }
                        if (q) {
                            up1Var.m(intValue, true, false);
                        }
                        i10 = i11;
                        z = false;
                    }
                    up1Var.m(rp1Var7.r, true, false);
                }
                up1Var.c = rp1Var;
                Activity activity = up1Var.b;
                Context context = up1Var.a;
                Bundle bundle3 = up1Var.d;
                if (bundle3 != null && (stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
                    int size2 = stringArrayList.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        String str2 = stringArrayList.get(i12);
                        i12++;
                        String str3 = str2;
                        str3.getClass();
                        dr1Var4.b(str3);
                        bundle3.getBundle(str3);
                    }
                }
                Parcelable[] parcelableArr = up1Var.e;
                if (parcelableArr != null) {
                    int length2 = parcelableArr.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        Parcelable parcelable = parcelableArr[i13];
                        parcelable.getClass();
                        dp1 dp1Var = (dp1) parcelable;
                        Parcelable[] parcelableArr2 = parcelableArr;
                        int i14 = dp1Var.n;
                        int i15 = length2;
                        op1 c2 = up1Var.c(i14);
                        if (c2 == null) {
                            int i16 = op1.u;
                            String E = ll3.E(context, i14);
                            StringBuilder sb = new StringBuilder("Restoring the Navigation back stack failed: destination ");
                            sb.append(E);
                            sb.append(" cannot be found from the current destination ");
                            cp1 cp1Var3 = (cp1) biVar2.f();
                            sb.append(cp1Var3 != null ? cp1Var3.n : null);
                            throw new IllegalStateException(sb.toString());
                        }
                        cp1 a3 = dp1Var.a(context, c2, up1Var.g(), up1Var.p);
                        cr1 b2 = dr1Var4.b(c2.m);
                        Object obj4 = linkedHashMap.get(b2);
                        if (obj4 == null) {
                            obj4 = new fp1(up1Var, b2);
                            linkedHashMap.put(b2, obj4);
                        }
                        biVar2.addLast(a3);
                        ((fp1) obj4).a(a3);
                        rp1 rp1Var8 = a3.n.n;
                        if (rp1Var8 != null) {
                            up1Var.i(a3, up1Var.e(rp1Var8.r));
                        }
                        i13++;
                        parcelableArr = parcelableArr2;
                        length2 = i15;
                    }
                    up1Var.t();
                    up1Var.e = null;
                }
                Collection values = mi1.i(dr1Var4.a).values();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : values) {
                    if (!((cr1) obj5).b) {
                        arrayList3.add(obj5);
                    }
                }
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj6 = arrayList3.get(i17);
                    i17++;
                    cr1 cr1Var = (cr1) obj6;
                    Object obj7 = linkedHashMap.get(cr1Var);
                    if (obj7 == null) {
                        obj7 = new fp1(up1Var, cr1Var);
                        linkedHashMap.put(cr1Var, obj7);
                    }
                    cr1Var.getClass();
                    cr1Var.a = (fp1) obj7;
                    cr1Var.b = true;
                }
                if (up1Var.c == null || !biVar2.isEmpty()) {
                    i3 = i7;
                    id1Var = id1Var2;
                    up1Var.b();
                } else {
                    if (up1Var.f || activity == null || (intent = activity.getIntent()) == null) {
                        i3 = i7;
                        id1Var = id1Var2;
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            try {
                                intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                            } catch (Exception e5) {
                                Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e5);
                            }
                            ArrayList parcelableArrayList = extras == null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
                            Bundle bundle4 = new Bundle();
                            ArrayList arrayList4 = parcelableArrayList;
                            bundle = extras == null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
                            if (bundle != null) {
                                bundle4.putAll(bundle);
                            }
                            if (intArray != null || intArray.length == 0) {
                                rp1 h2 = up1Var.h(biVar2);
                                biVar = biVar2;
                                f2 = h2.f(new mh(intent), true, h2);
                                if (f2 != null) {
                                    op1 op1Var5 = f2.m;
                                    bi biVar3 = new bi();
                                    op1 op1Var6 = op1Var5;
                                    i3 = i7;
                                    while (true) {
                                        rp1 rp1Var9 = op1Var6.n;
                                        id1Var = id1Var2;
                                        if (rp1Var9 == null || rp1Var9.w != op1Var6.r) {
                                            biVar3.addFirst(op1Var6);
                                        }
                                        if (!Intrinsics.b(rp1Var9, null) && rp1Var9 != null) {
                                            op1Var6 = rp1Var9;
                                            id1Var2 = id1Var;
                                        }
                                    }
                                    List M = zv.M(biVar3);
                                    ArrayList arrayList5 = new ArrayList(rv.l(M, 10));
                                    Iterator it5 = M.iterator();
                                    while (it5.hasNext()) {
                                        arrayList5.add(Integer.valueOf(((op1) it5.next()).r));
                                    }
                                    intArray = zv.L(arrayList5);
                                    Bundle a4 = op1Var5.a(f2.n);
                                    if (a4 != null) {
                                        bundle4.putAll(a4);
                                    }
                                    arrayList = null;
                                    if (intArray != null && intArray.length != 0) {
                                        rp1 rp1Var10 = up1Var.c;
                                        length = intArray.length;
                                        i5 = 0;
                                        while (true) {
                                            if (i5 < length) {
                                                str = null;
                                                break;
                                            }
                                            int i18 = intArray[i5];
                                            if (i5 == 0) {
                                                rp1 rp1Var11 = up1Var.c;
                                                rp1Var11.getClass();
                                                e3 = rp1Var11.r == i18 ? up1Var.c : null;
                                            } else {
                                                rp1Var10.getClass();
                                                e3 = rp1Var10.e(i18, rp1Var10, false);
                                            }
                                            if (e3 == null) {
                                                int i19 = op1.u;
                                                str = ll3.E(context, i18);
                                                break;
                                            }
                                            if (i5 != intArray.length - 1 && (e3 instanceof rp1)) {
                                                while (true) {
                                                    rp1Var3 = (rp1) e3;
                                                    rp1Var3.getClass();
                                                    if (!(rp1Var3.e(rp1Var3.w, rp1Var3, false) instanceof rp1)) {
                                                        break;
                                                    } else {
                                                        e3 = rp1Var3.e(rp1Var3.w, rp1Var3, false);
                                                    }
                                                }
                                                rp1Var10 = rp1Var3;
                                            }
                                            i5++;
                                        }
                                        if (str == null) {
                                            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent);
                                        } else {
                                            bundle4.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                                            int length3 = intArray.length;
                                            Bundle[] bundleArr = new Bundle[length3];
                                            for (int i20 = 0; i20 < length3; i20++) {
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putAll(bundle4);
                                                if (arrayList != null && (bundle2 = (Bundle) arrayList.get(i20)) != null) {
                                                    bundle5.putAll(bundle2);
                                                }
                                                bundleArr[i20] = bundle5;
                                            }
                                            int flags = intent.getFlags();
                                            int i21 = 268435456 & flags;
                                            if (i21 != 0 && (flags & 32768) == 0) {
                                                intent.addFlags(32768);
                                                qt2 qt2Var = new qt2(context);
                                                ComponentName component = intent.getComponent();
                                                if (component == null) {
                                                    component = intent.resolveActivity(qt2Var.n.getPackageManager());
                                                }
                                                if (component != null) {
                                                    qt2Var.a(component);
                                                }
                                                qt2Var.m.add(intent);
                                                qt2Var.b();
                                                activity.finish();
                                                activity.overridePendingTransition(0, 0);
                                            } else if (i21 != 0) {
                                                if (!biVar.isEmpty()) {
                                                    rp1 rp1Var12 = up1Var.c;
                                                    rp1Var12.getClass();
                                                    up1Var.m(rp1Var12.r, true, false);
                                                }
                                                int i22 = 0;
                                                while (i22 < intArray.length) {
                                                    int i23 = intArray[i22];
                                                    int i24 = i22 + 1;
                                                    Bundle bundle6 = bundleArr[i22];
                                                    op1 c3 = up1Var.c(i23);
                                                    if (c3 == null) {
                                                        int i25 = op1.u;
                                                        String E2 = ll3.E(context, i23);
                                                        StringBuilder sb2 = new StringBuilder("Deep Linking failed: destination ");
                                                        sb2.append(E2);
                                                        sb2.append(" cannot be found from the current destination ");
                                                        cp1 cp1Var4 = (cp1) biVar.f();
                                                        sb2.append(cp1Var4 != null ? cp1Var4.n : null);
                                                        throw new IllegalStateException(sb2.toString());
                                                    }
                                                    up1Var.j(c3, bundle6, l41.R(new p8(23, c3, up1Var)));
                                                    i22 = i24;
                                                }
                                                up1Var.f = true;
                                            } else {
                                                rp1 rp1Var13 = up1Var.c;
                                                int length4 = intArray.length;
                                                for (int i26 = 0; i26 < length4; i26++) {
                                                    int i27 = intArray[i26];
                                                    Bundle bundle7 = bundleArr[i26];
                                                    if (i26 == 0) {
                                                        e2 = up1Var.c;
                                                    } else {
                                                        rp1Var13.getClass();
                                                        e2 = rp1Var13.e(i27, rp1Var13, false);
                                                    }
                                                    if (e2 == null) {
                                                        int i28 = op1.u;
                                                        throw new IllegalStateException("Deep Linking failed: destination " + ll3.E(context, i27) + " cannot be found in graph " + rp1Var13);
                                                    }
                                                    if (i26 == intArray.length - 1) {
                                                        rp1 rp1Var14 = up1Var.c;
                                                        rp1Var14.getClass();
                                                        up1Var.j(e2, bundle7, new dq1(false, false, rp1Var14.r, true, false, 0, 0));
                                                    } else if (e2 instanceof rp1) {
                                                        while (true) {
                                                            rp1Var2 = (rp1) e2;
                                                            rp1Var2.getClass();
                                                            if (!(rp1Var2.e(rp1Var2.w, rp1Var2, false) instanceof rp1)) {
                                                                break;
                                                            } else {
                                                                e2 = rp1Var2.e(rp1Var2.w, rp1Var2, false);
                                                            }
                                                        }
                                                        rp1Var13 = rp1Var2;
                                                    }
                                                }
                                                up1Var.f = true;
                                            }
                                        }
                                    }
                                }
                            } else {
                                biVar = biVar2;
                            }
                            i3 = i7;
                            id1Var = id1Var2;
                            arrayList = arrayList4;
                            if (intArray != null) {
                                rp1 rp1Var102 = up1Var.c;
                                length = intArray.length;
                                i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                    }
                                    i5++;
                                }
                                if (str == null) {
                                }
                            }
                        }
                        intArray = null;
                        if (extras == null) {
                        }
                        Bundle bundle42 = new Bundle();
                        ArrayList arrayList42 = parcelableArrayList;
                        if (extras == null) {
                        }
                        if (bundle != null) {
                        }
                        if (intArray != null) {
                        }
                        rp1 h22 = up1Var.h(biVar2);
                        biVar = biVar2;
                        f2 = h22.f(new mh(intent), true, h22);
                        if (f2 != null) {
                        }
                        i3 = i7;
                        id1Var = id1Var2;
                        arrayList = arrayList42;
                        if (intArray != null) {
                        }
                    }
                    rp1 rp1Var15 = up1Var.c;
                    rp1Var15.getClass();
                    up1Var.j(rp1Var15, null, null);
                }
            }
            cr1 b3 = dr1Var4.b("composable");
            ez ezVar3 = b3 instanceof ez ? (ez) b3 : null;
            if (ezVar3 == null) {
                n72 s = a00Var.s();
                if (s != null) {
                    s.d = new zp1(up1Var, rp1Var, vl1Var, f6Var, function1, function12, function13, function14, i2, 1);
                    return;
                }
                return;
            }
            ?? r15 = a00Var;
            zn1 b4 = ij2.b(ezVar3.b().e, r15);
            Object M2 = r15.M();
            Object obj8 = sz.a;
            if (M2 == obj8) {
                M2 = new hz1(0.0f);
                r15.i0(M2);
            }
            hz1 hz1Var = (hz1) M2;
            Object M3 = r15.M();
            if (M3 == obj8) {
                M3 = ij2.j(Boolean.FALSE);
                r15.i0(M3);
            }
            zn1 zn1Var3 = (zn1) M3;
            boolean z2 = ((List) b4.getValue()).size() > 1;
            boolean f4 = r15.f(b4) | r15.f(ezVar3);
            Object M4 = r15.M();
            if (f4 || M4 == obj8) {
                M4 = new da(ezVar3, hz1Var, b4, zn1Var3, null, 4);
                r15.i0(M4);
            }
            ap.j(z2, (Function2) M4, r15, 0);
            id1 id1Var3 = id1Var;
            boolean h3 = r15.h(up1Var) | r15.h(id1Var3);
            Object M5 = r15.M();
            if (h3 || M5 == obj8) {
                M5 = new p8(24, up1Var, id1Var3);
                r15.i0(M5);
            }
            l41.f(id1Var3, (Function1) M5, r15);
            kd2 S = ll3.S(r15);
            zn1 b5 = ij2.b(up1Var.j, r15);
            Object M6 = r15.M();
            if (M6 == obj8) {
                M6 = ij2.f(new bq1(b5, 0));
                r15.i0(M6);
            }
            so2 so2Var3 = (so2) M6;
            cp1 cp1Var5 = (cp1) zv.C((List) so2Var3.getValue());
            Object M7 = r15.M();
            if (M7 == obj8) {
                M7 = new LinkedHashMap();
                r15.i0(M7);
            }
            Map map2 = (Map) M7;
            r15.X(653353748);
            if (cp1Var5 != null) {
                boolean f5 = r15.f(ezVar3) | ((((i3 & 3670016) ^ 1572864) > 1048576 && r15.f(function13)) || (i3 & 1572864) == 1048576) | ((i3 & 57344) == 16384);
                Object M8 = r15.M();
                if (f5 || M8 == obj8) {
                    obj = obj8;
                    ezVar = ezVar3;
                    zn1Var = zn1Var3;
                    dr1Var2 = dr1Var4;
                    aq1 aq1Var = new aq1(ezVar, function13, function1, zn1Var, 0);
                    r15.i0(aq1Var);
                    M8 = aq1Var;
                } else {
                    obj = obj8;
                    ezVar = ezVar3;
                    zn1Var = zn1Var3;
                    dr1Var2 = dr1Var4;
                }
                Function1 function17 = (Function1) M8;
                boolean f6 = r15.f(ezVar) | ((((i3 & 29360128) ^ 12582912) > 8388608 && r15.f(function14)) || (i3 & 12582912) == 8388608) | ((i3 & 458752) == 131072);
                Object M9 = r15.M();
                if (f6 || M9 == obj) {
                    function15 = function17;
                    aq1 aq1Var2 = new aq1(ezVar, function14, function12, zn1Var, 1);
                    r15.i0(aq1Var2);
                    M9 = aq1Var2;
                } else {
                    function15 = function17;
                }
                Function1 function18 = (Function1) M9;
                boolean z3 = (i3 & 234881024) == 67108864;
                Object M10 = r15.M();
                if (z3 || M10 == obj) {
                    M10 = new cv2(1, 29);
                    r15.i0(M10);
                }
                Function1 function19 = (Function1) M10;
                Boolean bool = Boolean.TRUE;
                boolean f7 = r15.f(ezVar);
                zn1 zn1Var4 = zn1Var;
                Object M11 = r15.M();
                if (f7 || M11 == obj) {
                    M11 = new p8(25, so2Var3, ezVar);
                    r15.i0(M11);
                }
                l41.f(bool, (Function1) M11, r15);
                Object M12 = r15.M();
                if (M12 == obj) {
                    M12 = new tg2(cp1Var5);
                    r15.i0(M12);
                }
                tg2 tg2Var = (tg2) M12;
                y91 y91Var = jz2.a;
                boolean f8 = r15.f(tg2Var);
                Object M13 = r15.M();
                if (f8 || M13 == obj) {
                    kd2Var = S;
                    M13 = new fz2(tg2Var, null, "entry");
                    r15.i0(M13);
                } else {
                    kd2Var = S;
                }
                ?? r5 = (fz2) M13;
                if (tg2Var != null) {
                    r15.X(1030413636);
                    Object value = tg2Var.o.getValue();
                    Object value2 = tg2Var.n.getValue();
                    boolean f9 = r15.f(tg2Var);
                    dr1Var3 = dr1Var2;
                    Object M14 = r15.M();
                    if (f9 || M14 == obj) {
                        so2Var = so2Var3;
                        function16 = function19;
                        M14 = new ed(22, null, tg2Var);
                        r15.i0(M14);
                    } else {
                        function16 = function19;
                        so2Var = so2Var3;
                    }
                    l41.i(value, value2, (Function2) M14, r15);
                    i4 = 0;
                    r15.q(false);
                } else {
                    function16 = function19;
                    dr1Var3 = dr1Var2;
                    so2Var = so2Var3;
                    i4 = 0;
                    r15.X(1030875195);
                    r5.a(tg2Var.n.getValue(), r15, 0);
                    r15.q(false);
                }
                boolean f10 = r15.f(r5);
                Object M15 = r15.M();
                if (f10 || M15 == obj) {
                    M15 = new iz2(r5, i4);
                    r15.i0(M15);
                }
                l41.f(r5, (Function1) M15, r15);
                if (j(zn1Var4)) {
                    r15.X(-1218592968);
                    Float valueOf = Float.valueOf(hz1Var.h());
                    boolean f11 = r15.f(b4) | r15.h(tg2Var);
                    Object M16 = r15.M();
                    if (f11 || M16 == obj) {
                        r7 = null;
                        M16 = new ed(tg2Var, b4, hz1Var, (o30) null);
                        r15.i0(M16);
                    } else {
                        r7 = null;
                    }
                    l41.h(r15, valueOf, (Function2) M16);
                    r15.q(false);
                    fz2Var = r5;
                    ab0Var3 = r7;
                } else {
                    r15.X(-1218337931);
                    boolean h4 = r15.h(tg2Var) | r15.h(cp1Var5) | r15.f(r5);
                    Object M17 = r15.M();
                    if (h4 || M17 == obj) {
                        fz2Var = r5;
                        ?? r23 = 0;
                        M17 = new j5(tg2Var, cp1Var5, fz2Var, (o30) r23, 8);
                        cp1Var = cp1Var5;
                        r15.i0(M17);
                        ab0Var2 = r23;
                    } else {
                        fz2Var = r5;
                        ab0Var2 = null;
                        cp1Var = cp1Var5;
                    }
                    l41.h(r15, cp1Var, (Function2) M17);
                    r15.q(false);
                    ab0Var3 = ab0Var2;
                }
                Function1 function110 = function16;
                boolean h5 = r15.h(map2) | r15.f(ezVar) | r15.f(function15) | r15.f(function18) | r15.f(function110);
                Object M18 = r15.M();
                if (h5 || M18 == obj) {
                    ezVar2 = ezVar;
                    kd2Var2 = kd2Var;
                    so2 so2Var4 = so2Var;
                    xp1Var = new xp1(map2, ezVar2, function15, function18, function110, so2Var4, zn1Var4);
                    map = map2;
                    so2Var2 = so2Var4;
                    zn1Var2 = zn1Var4;
                    r15.i0(xp1Var);
                } else {
                    ezVar2 = ezVar;
                    xp1Var = M18;
                    map = map2;
                    kd2Var2 = kd2Var;
                    so2Var2 = so2Var;
                    zn1Var2 = zn1Var4;
                }
                dr1Var = dr1Var3;
                fz2 fz2Var2 = fz2Var;
                s93.b(fz2Var2, vl1Var, (Function1) xp1Var, f6Var, bl0.M, yj1.H(820763100, new yp1(kd2Var2, zn1Var2, so2Var2), r15), r15, ((i3 >> 3) & 112) | 221184 | (i3 & 7168));
                Object j = fz2Var2.a.j();
                Object value3 = fz2Var2.d.getValue();
                boolean f12 = r15.f(fz2Var2) | r15.f(ezVar2) | r15.h(map);
                Object M19 = r15.M();
                if (f12 || M19 == obj) {
                    o40 o40Var = new o40(fz2Var2, map, so2Var2, ezVar2, null);
                    r15.i0(o40Var);
                    M19 = o40Var;
                }
                l41.i(j, value3, (Function2) M19, r15);
                ab0Var = ab0Var3;
            } else {
                dr1Var = dr1Var4;
                ab0Var = null;
            }
            r15.q(false);
            cr1 b6 = dr1Var.b("dialog");
            ab0 ab0Var4 = b6 instanceof ab0 ? (ab0) b6 : ab0Var;
            if (ab0Var4 == null) {
                n72 s2 = r15.s();
                if (s2 != null) {
                    s2.d = new zp1(up1Var, rp1Var, vl1Var, f6Var, function1, function12, function13, function14, i2, 2);
                    return;
                }
                return;
            }
            yk3.e(ab0Var4, r15, 0);
            a00Var2 = r15;
        }
        n72 s3 = a00Var2.s();
        if (s3 != null) {
            s3.d = new zp1(up1Var, rp1Var, vl1Var, f6Var, function1, function12, function13, function14, i2, 0);
        }
    }

    public static final boolean j(zn1 zn1Var) {
        return ((Boolean) zn1Var.getValue()).booleanValue();
    }

    public static final void k(String str, String str2, a00 a00Var, int i2) {
        String str3;
        int i3;
        a00 a00Var2 = a00Var;
        a00Var2.Z(1839250474);
        int i4 = i2 | (a00Var2.f(str) ? 4 : 2) | (a00Var2.f(str2) ? 32 : 16);
        if (a00Var2.P(i4 & 1, (i4 & 19) != 18)) {
            vl1 c2 = b.c(sl1.a, 1.0f);
            fc2 a2 = ec2.a(new yh(8.0f, true, sc.o), qb2.y, a00Var2, 6);
            int D = iv1.D(a00Var2);
            v02 l = a00Var2.l();
            vl1 E = bd3.E(a00Var2, c2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var2.b0();
            if (a00Var2.S) {
                a00Var2.k(o00Var);
            } else {
                a00Var2.l0();
            }
            uj2.e(a00Var2, a2, oz.f);
            uj2.e(a00Var2, l, oz.e);
            sc scVar = oz.g;
            if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var2, D, scVar);
            }
            uj2.e(a00Var2, E, oz.d);
            long j = cw.v;
            vl1 k = b.k(120.0f);
            bp2 bp2Var = n13.a;
            yv2.b(str, k, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var2.j(bp2Var)).k, a00Var, (i4 & 14) | 432, 0, 65528);
            str3 = str2;
            yv2.b(str3, null, cw.u, 0L, jq0.r, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(bp2Var)).k, a00Var, ((i4 >> 3) & 14) | 196992, 0, 65498);
            a00Var2 = a00Var;
            i3 = 1;
            a00Var2.q(true);
        } else {
            str3 = str2;
            i3 = 1;
            a00Var2.S();
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new ku0(str, i2, i3, str3);
        }
    }

    public static final void l(String str, a00 a00Var, int i2) {
        a00Var.Z(573866655);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2);
        if (a00Var.P(i3 & 1, (i3 & 3) != 2)) {
            yv2.b(str, null, cw.u, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).g, a00Var, (i3 & 14) | 196992, 0, 65498);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x4(str, i2, 4);
        }
    }

    public static final boolean m(uc0 uc0Var, long j) {
        if (!uc0Var.m.z) {
            return false;
        }
        n21 n21Var = s03.J(uc0Var).P.c;
        if (!n21Var.a0.z) {
            return false;
        }
        long T = n21Var.T(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (T >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (T & 4294967295L));
        long j2 = uc0Var.C;
        float f2 = ((int) (j2 >> 32)) + intBitsToFloat;
        float f3 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f2) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f3;
    }

    public static final long n(sc1 sc1Var, w72 w72Var, w72 w72Var2, int i2) {
        long z = z(sc1Var, w72Var, i2);
        if (jw2.b(z)) {
            return jw2.b;
        }
        long z2 = z(sc1Var, w72Var2, i2);
        if (jw2.b(z2)) {
            return jw2.b;
        }
        int i3 = (int) (z >> 32);
        int i4 = (int) (z2 & 4294967295L);
        return th2.a(Math.min(i3, i3), Math.max(i4, i4));
    }

    public static final boolean o(bw2 bw2Var, int i2) {
        int e2 = bw2Var.e(i2);
        return i2 == bw2Var.h(e2) || i2 == bw2Var.d(e2, false) ? bw2Var.i(i2) != bw2Var.a(i2) : bw2Var.a(i2) != bw2Var.a(i2 - 1);
    }

    public static final void p(ym1 ym1Var, int i2) {
        if (ym1Var.b == 0 || !(ym1Var.c(0) == i2 || ym1Var.c(ym1Var.b - 1) == i2)) {
            int i3 = ym1Var.b;
            ym1Var.a(i2);
            while (i3 > 0) {
                int i4 = ((i3 + 1) >>> 1) - 1;
                int c2 = ym1Var.c(i4);
                if (i2 <= c2) {
                    break;
                }
                ym1Var.f(i3, c2);
                i3 = i4;
            }
            ym1Var.f(i3, i2);
        }
    }

    public static final boolean q(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final void r(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static int s(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new gt1(context).a.areNotificationsEnabled() ? 0 : -1;
        }
        ch2.l("permission must be non-null");
        return 0;
    }

    public static final boolean t(w72 w72Var, float f2, float f3) {
        float f4 = w72Var.a;
        if (f2 > w72Var.c || f4 > f2) {
            return false;
        }
        return f3 <= w72Var.d && w72Var.b <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] u(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static final boolean v(long j, long j2) {
        return j == j2;
    }

    public static final int w(int i2, jq0 jq0Var) {
        boolean z = jq0Var.compareTo(jq0.p) >= 0;
        boolean z2 = i2 == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final String x(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final int y(sm1 sm1Var, long j, g53 g53Var) {
        float f2 = g53Var != null ? g53Var.f() : 0.0f;
        int c2 = sm1Var.c(au1.e(j));
        if (au1.e(j) < sm1Var.d(c2) - f2 || au1.e(j) > sm1Var.b(c2) + f2 || au1.d(j) < (-f2) || au1.d(j) > sm1Var.d + f2) {
            return -1;
        }
        return c2;
    }

    public static final long z(sc1 sc1Var, w72 w72Var, int i2) {
        cw2 d2 = sc1Var.d();
        sm1 sm1Var = d2 != null ? d2.a.b : null;
        t81 c2 = sc1Var.c();
        return (sm1Var == null || c2 == null) ? jw2.b : sm1Var.f(w72Var.g(c2.v(0L)), i2, by1.E);
    }
}
