package k7;

import a1.s;
import a2.a0;
import a2.r;
import a2.v0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l0;
import b3.n;
import c2.b1;
import c2.z1;
import com.appsflyer.R;
import com.google.android.gms.internal.measurement.bf;
import com.google.android.gms.internal.measurement.d0;
import com.onesignal.core.activities.PermissionsActivity;
import d.e0;
import d2.d1;
import i1.k;
import i1.o;
import i1.q;
import i1.t;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.h0;
import k1.m;
import k1.p;
import k1.v;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m.d2;
import m.f2;
import n0.i0;
import n0.s1;
import n0.z0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q1.f0;
import q1.g0;
import s.w;
import s7.c0;
import te.a1;
import x2.l;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: d, reason: collision with root package name */
    public static ClassLoader f5497d;

    /* renamed from: e, reason: collision with root package name */
    public static Thread f5498e;

    public static final long A(long j, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j : p.b(j, p.d(j) * f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x05e5, code lost:
    
        if (r5 == n0.k.f6729a) goto L248;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0471 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p1.b B(int i3, i0 i0Var, int i10) {
        TypedValue typedValue;
        int i11;
        Object obj;
        TypedArray typedArray;
        boolean z10;
        long j;
        int i12;
        int i13;
        int eventType;
        int i14;
        char c10;
        int i15;
        TypedArray obtainStyledAttributes;
        int i16;
        TypedArray obtainStyledAttributes2;
        int i17;
        int i18;
        int i19;
        ColorStateList colorStateList;
        Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f465b);
        Resources resources = (Resources) i0Var.j(AndroidCompositionLocals_androidKt.f466c);
        h2.d dVar = (h2.d) i0Var.j(AndroidCompositionLocals_androidKt.f468e);
        synchronized (dVar) {
            typedValue = (TypedValue) dVar.f4440a.b(i3);
            i11 = 1;
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i3, typedValue, true);
                w wVar = dVar.f4440a;
                int d10 = wVar.d(i3);
                Object[] objArr = wVar.f8338c;
                Object obj2 = objArr[d10];
                wVar.f8337b[d10] = i3;
                objArr[d10] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.o(charSequence)) {
            i0Var.W(-1771643000);
            Object theme = context.getTheme();
            boolean f3 = i0Var.f(charSequence);
            if ((((i10 & 14) ^ 6) <= 4 || !i0Var.d(i3)) && (i10 & 6) != 4) {
                i11 = 0;
            }
            int i20 = (i0Var.f(theme) ? 1 : 0) | (f3 ? 1 : 0) | i11;
            Object L = i0Var.L();
            if (i20 == 0) {
                obj = L;
            }
            try {
                Drawable drawable = resources.getDrawable(i3, null);
                drawable.getClass();
                Object eVar = new k1.e(((BitmapDrawable) drawable).getBitmap());
                i0Var.g0(eVar);
                obj = eVar;
                p1.a aVar = new p1.a((k1.e) obj);
                i0Var.p(false);
                return aVar;
            } catch (Exception e2) {
                throw new d0("Error attempting to load resource: " + ((Object) charSequence), e2, 2);
            }
        }
        i0Var.W(-1771798434);
        Resources.Theme theme2 = context.getTheme();
        int i21 = typedValue.changingConfigurations;
        h2.c cVar = (h2.c) i0Var.j(AndroidCompositionLocals_androidKt.f467d);
        h2.b bVar = new h2.b(theme2, i3);
        WeakReference weakReference = (WeakReference) cVar.f4439a.get(bVar);
        h2.a aVar2 = weakReference != null ? (h2.a) weakReference.get() : null;
        if (aVar2 == null) {
            XmlResourceParser xml = resources.getXml(i3);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.a(xml.getName(), "vector")) {
                a1.e("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                return null;
            }
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            r1.a aVar3 = new r1.a(xml);
            int[] iArr = r1.b.f8140a;
            TypedArray obtainAttributes = theme2 == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme2.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
            aVar3.c(obtainAttributes.getChangingConfigurations());
            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                typedArray = obtainAttributes;
                z10 = typedArray.getBoolean(5, false);
            } else {
                typedArray = obtainAttributes;
                z10 = false;
            }
            aVar3.c(typedArray.getChangingConfigurations());
            float b10 = aVar3.b(typedArray, "viewportWidth", 7, 0.0f);
            float b11 = aVar3.b(typedArray, "viewportHeight", 8, 0.0f);
            if (b10 <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
            }
            if (b11 <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
            }
            float dimension = typedArray.getDimension(3, 0.0f);
            aVar3.c(typedArray.getChangingConfigurations());
            float dimension2 = typedArray.getDimension(2, 0.0f);
            aVar3.c(typedArray.getChangingConfigurations());
            if (typedArray.hasValue(1)) {
                TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(1, typedValue2);
                if (typedValue2.type == 2) {
                    j = p.g;
                } else {
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                        TypedValue typedValue3 = new TypedValue();
                        typedArray.getValue(1, typedValue3);
                        int i22 = typedValue3.type;
                        if (i22 == 2) {
                            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                        }
                        if (i22 < 28 || i22 > 31) {
                            Resources resources2 = typedArray.getResources();
                            int resourceId = typedArray.getResourceId(1, 0);
                            ThreadLocal threadLocal = g3.c.f4240a;
                            try {
                                colorStateList = g3.c.a(resources2, resources2.getXml(resourceId), theme2);
                            } catch (Exception e9) {
                                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                            }
                        } else {
                            colorStateList = ColorStateList.valueOf(typedValue3.data);
                        }
                        aVar3.c(typedArray.getChangingConfigurations());
                        j = colorStateList == null ? v.b(colorStateList.getDefaultColor()) : p.g;
                    }
                    colorStateList = null;
                    aVar3.c(typedArray.getChangingConfigurations());
                    if (colorStateList == null) {
                    }
                }
            } else {
                j = p.g;
            }
            int i23 = typedArray.getInt(6, -1);
            aVar3.c(typedArray.getChangingConfigurations());
            if (i23 != -1) {
                if (i23 == 3) {
                    i12 = 3;
                } else if (i23 != 5) {
                    if (i23 != 9) {
                        switch (i23) {
                            case 14:
                                i12 = 13;
                                break;
                            case 15:
                                i12 = 14;
                                break;
                            case 16:
                                i12 = 12;
                                break;
                        }
                    } else {
                        i12 = 9;
                    }
                }
                float f10 = dimension / resources.getDisplayMetrics().density;
                float f11 = dimension2 / resources.getDisplayMetrics().density;
                typedArray.recycle();
                q1.e eVar2 = new q1.e(f10, f11, b10, b11, j, i12, z10, 1);
                i13 = 0;
                for (int i24 = 3; xml.getEventType() != i11 && (xml.getDepth() >= i11 || xml.getEventType() != i24); i24 = 3) {
                    XmlPullParser xmlPullParser = aVar3.f8137a;
                    l.d dVar2 = aVar3.f8139c;
                    int i25 = i11;
                    eventType = xmlPullParser.getEventType();
                    int i26 = i21;
                    if (eventType == 2) {
                        if (eventType == i24 && "group".equals(xmlPullParser.getName())) {
                            int i27 = i13 + 1;
                            for (int i28 = 0; i28 < i27; i28++) {
                                ArrayList arrayList = eVar2.f7834i;
                                if (eVar2.f7835k) {
                                    z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                q1.d dVar3 = (q1.d) arrayList.remove(arrayList.size() - 1);
                                ((q1.d) arrayList.get(arrayList.size() - 1)).j.add(new f0(dVar3.f7817a, dVar3.f7818b, dVar3.f7819c, dVar3.f7820d, dVar3.f7821e, dVar3.f7822f, dVar3.g, dVar3.f7823h, dVar3.f7824i, dVar3.j));
                            }
                            i11 = i25;
                            i13 = 0;
                            c10 = 65535;
                            xml.next();
                            i21 = i26;
                        }
                        i14 = i13;
                        i11 = i25;
                    } else {
                        String name = xmlPullParser.getName();
                        if (name != null) {
                            int hashCode = name.hashCode();
                            if (hashCode != -1649314686) {
                                i14 = i13;
                                if (hashCode != 3433509) {
                                    if (hashCode == 98629247 && name.equals("group")) {
                                        int[] iArr2 = r1.b.f8141b;
                                        TypedArray obtainAttributes2 = theme2 == null ? resources.obtainAttributes(asAttributeSet, iArr2) : theme2.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float b12 = aVar3.b(obtainAttributes2, "rotation", 5, 0.0f);
                                        float f12 = obtainAttributes2.getFloat(i25, 0.0f);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float f13 = obtainAttributes2.getFloat(2, 0.0f);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        float b13 = aVar3.b(obtainAttributes2, "scaleX", 3, 1.0f);
                                        float b14 = aVar3.b(obtainAttributes2, "scaleY", 4, 1.0f);
                                        float b15 = aVar3.b(obtainAttributes2, "translateX", 6, 0.0f);
                                        float b16 = aVar3.b(obtainAttributes2, "translateY", 7, 0.0f);
                                        String string = obtainAttributes2.getString(0);
                                        aVar3.c(obtainAttributes2.getChangingConfigurations());
                                        String str = string == null ? "" : string;
                                        obtainAttributes2.recycle();
                                        j0 j0Var = g0.f7869a;
                                        if (eVar2.f7835k) {
                                            z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                        }
                                        eVar2.f7834i.add(new q1.d(str, b12, f12, f13, b13, b14, b15, b16, j0Var, 512));
                                        i13 = i14;
                                        i11 = 1;
                                        c10 = 65535;
                                    }
                                    i11 = i25;
                                } else if (name.equals("path")) {
                                    int[] iArr3 = r1.b.f8142c;
                                    if (theme2 == null) {
                                        obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr3);
                                        i16 = 0;
                                    } else {
                                        i16 = 0;
                                        obtainStyledAttributes2 = theme2.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                        a1.e("No path data available");
                                        return null;
                                    }
                                    String string2 = obtainStyledAttributes2.getString(i16);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    String str2 = string2 == null ? "" : string2;
                                    String string3 = obtainStyledAttributes2.getString(2);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    List w6 = string3 == null ? g0.f7869a : l.d.w(string3, dVar2);
                                    bf a9 = aVar3.a(obtainStyledAttributes2, theme2, "fillColor", 1);
                                    float b17 = aVar3.b(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                    int i29 = !g3.b.a(aVar3.f8137a, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i29 != 0) {
                                        if (i29 == 1) {
                                            i17 = 1;
                                        } else if (i29 == 2) {
                                            i17 = 2;
                                        }
                                        if (g3.b.a(aVar3.f8137a, "strokeLineJoin")) {
                                            i18 = -1;
                                            c10 = 65535;
                                        } else {
                                            c10 = 65535;
                                            i18 = obtainStyledAttributes2.getInt(9, -1);
                                        }
                                        aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                        if (i18 != 0) {
                                            if (i18 == 1) {
                                                i19 = 1;
                                            } else if (i18 == 2) {
                                                i19 = 2;
                                            }
                                            float b18 = aVar3.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            bf a10 = aVar3.a(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                            float b19 = aVar3.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float b20 = aVar3.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float b21 = aVar3.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float b22 = aVar3.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float b23 = aVar3.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            int i30 = !g3.b.a(aVar3.f8137a, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                            aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                            obtainStyledAttributes2.recycle();
                                            Shader shader = (Shader) a9.f2175e;
                                            int i31 = a9.f2174d;
                                            v mVar = (shader == null && i31 == 0) ? null : shader != null ? new m(shader) : new h0(v.b(i31));
                                            Shader shader2 = (Shader) a10.f2175e;
                                            int i32 = a10.f2174d;
                                            v mVar2 = (shader2 == null && i32 == 0) ? null : shader2 == null ? new m(shader2) : new h0(v.b(i32));
                                            int i33 = i30 == 0 ? 0 : 1;
                                            if (eVar2.f7835k) {
                                                z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            ((q1.d) eVar2.f7834i.get(r0.size() - 1)).j.add(new q1.j0(str2, w6, i33, mVar, b17, mVar2, b19, b20, i17, i19, b18, b23, b21, b22));
                                            i13 = i14;
                                            i11 = 1;
                                        }
                                        i19 = 0;
                                        float b182 = aVar3.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                        bf a102 = aVar3.a(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                        float b192 = aVar3.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                        float b202 = aVar3.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                        float b212 = aVar3.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                        float b222 = aVar3.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                        float b232 = aVar3.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                        if (!g3.b.a(aVar3.f8137a, "fillType")) {
                                        }
                                        aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                        obtainStyledAttributes2.recycle();
                                        Shader shader3 = (Shader) a9.f2175e;
                                        int i312 = a9.f2174d;
                                        if (shader3 == null) {
                                            Shader shader22 = (Shader) a102.f2175e;
                                            int i322 = a102.f2174d;
                                            if (shader22 == null) {
                                                if (i30 == 0) {
                                                }
                                                if (eVar2.f7835k) {
                                                }
                                                ((q1.d) eVar2.f7834i.get(r0.size() - 1)).j.add(new q1.j0(str2, w6, i33, mVar, b17, mVar2, b192, b202, i17, i19, b182, b232, b212, b222));
                                                i13 = i14;
                                                i11 = 1;
                                            }
                                            if (i30 == 0) {
                                            }
                                            if (eVar2.f7835k) {
                                            }
                                            ((q1.d) eVar2.f7834i.get(r0.size() - 1)).j.add(new q1.j0(str2, w6, i33, mVar, b17, mVar2, b192, b202, i17, i19, b182, b232, b212, b222));
                                            i13 = i14;
                                            i11 = 1;
                                        }
                                        Shader shader222 = (Shader) a102.f2175e;
                                        int i3222 = a102.f2174d;
                                        if (shader222 == null) {
                                        }
                                        if (i30 == 0) {
                                        }
                                        if (eVar2.f7835k) {
                                        }
                                        ((q1.d) eVar2.f7834i.get(r0.size() - 1)).j.add(new q1.j0(str2, w6, i33, mVar, b17, mVar2, b192, b202, i17, i19, b182, b232, b212, b222));
                                        i13 = i14;
                                        i11 = 1;
                                    }
                                    i17 = 0;
                                    if (g3.b.a(aVar3.f8137a, "strokeLineJoin")) {
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    if (i18 != 0) {
                                    }
                                    i19 = 0;
                                    float b1822 = aVar3.b(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                    bf a1022 = aVar3.a(obtainStyledAttributes2, theme2, "strokeColor", 3);
                                    float b1922 = aVar3.b(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                    float b2022 = aVar3.b(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                    float b2122 = aVar3.b(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                    float b2222 = aVar3.b(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                    float b2322 = aVar3.b(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                    if (!g3.b.a(aVar3.f8137a, "fillType")) {
                                    }
                                    aVar3.c(obtainStyledAttributes2.getChangingConfigurations());
                                    obtainStyledAttributes2.recycle();
                                    Shader shader32 = (Shader) a9.f2175e;
                                    int i3122 = a9.f2174d;
                                    if (shader32 == null) {
                                    }
                                    Shader shader2222 = (Shader) a1022.f2175e;
                                    int i32222 = a1022.f2174d;
                                    if (shader2222 == null) {
                                    }
                                    if (i30 == 0) {
                                    }
                                    if (eVar2.f7835k) {
                                    }
                                    ((q1.d) eVar2.f7834i.get(r0.size() - 1)).j.add(new q1.j0(str2, w6, i33, mVar, b17, mVar2, b1922, b2022, i17, i19, b1822, b2322, b2122, b2222));
                                    i13 = i14;
                                    i11 = 1;
                                } else {
                                    i11 = 1;
                                }
                            } else {
                                i14 = i13;
                                c10 = 65535;
                                if (name.equals("clip-path")) {
                                    int[] iArr4 = r1.b.f8143d;
                                    if (theme2 == null) {
                                        obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr4);
                                        i15 = 0;
                                    } else {
                                        i15 = 0;
                                        obtainStyledAttributes = theme2.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                    }
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    String string4 = obtainStyledAttributes.getString(i15);
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    String str3 = string4 == null ? "" : string4;
                                    i11 = 1;
                                    String string5 = obtainStyledAttributes.getString(1);
                                    aVar3.c(obtainStyledAttributes.getChangingConfigurations());
                                    List w10 = string5 == null ? g0.f7869a : l.d.w(string5, dVar2);
                                    obtainStyledAttributes.recycle();
                                    if (eVar2.f7835k) {
                                        z1.a.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                    }
                                    eVar2.f7834i.add(new q1.d(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, w10, 512));
                                    i13 = i14 + 1;
                                } else {
                                    i11 = 1;
                                    i13 = i14;
                                }
                            }
                            xml.next();
                            i21 = i26;
                        }
                        i14 = i13;
                        i11 = i25;
                    }
                    c10 = 65535;
                    i13 = i14;
                    xml.next();
                    i21 = i26;
                }
                aVar2 = new h2.a(eVar2.a(), i21 | aVar3.f8138b);
                cVar.f4439a.put(bVar, new WeakReference(aVar2));
            }
            i12 = 5;
            float f102 = dimension / resources.getDisplayMetrics().density;
            float f112 = dimension2 / resources.getDisplayMetrics().density;
            typedArray.recycle();
            q1.e eVar22 = new q1.e(f102, f112, b10, b11, j, i12, z10, 1);
            i13 = 0;
            while (xml.getEventType() != i11) {
                XmlPullParser xmlPullParser2 = aVar3.f8137a;
                l.d dVar22 = aVar3.f8139c;
                int i252 = i11;
                eventType = xmlPullParser2.getEventType();
                int i262 = i21;
                if (eventType == 2) {
                }
                c10 = 65535;
                i13 = i14;
                xml.next();
                i21 = i262;
            }
            aVar2 = new h2.a(eVar22.a(), i21 | aVar3.f8138b);
            cVar.f4439a.put(bVar, new WeakReference(aVar2));
        }
        q1.i0 d11 = q1.b.d(aVar2.f4435a, i0Var);
        i0Var.p(false);
        return d11;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.jvm.functions.Function1, wd.p] */
    public static final i1.b C(t tVar, int i3) {
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = z4.w.r(tVar);
                if (r9 == null) {
                    a1.e("ActiveParent with no focused child");
                    return null;
                }
                i1.b C = C(r9, i3);
                i1.b bVar = i1.b.f4585d;
                i1.b bVar2 = C != bVar ? C : null;
                if (bVar2 != null) {
                    return bVar2;
                }
                if (tVar.E) {
                    return bVar;
                }
                tVar.E = true;
                try {
                    o K = tVar.K();
                    i1.a aVar = new i1.a(i3);
                    k kVar = (k) c2.k.v(tVar).getFocusOwner();
                    t f3 = kVar.f();
                    K.f4620k.invoke(aVar);
                    t f10 = kVar.f();
                    if (!aVar.f4584b) {
                        return (f3 == f10 || f10 == null) ? bVar : q.f4624d == q.f4623c ? i1.b.f4586e : i1.b.f4587i;
                    }
                    q qVar = q.f4622b;
                    return i1.b.f4586e;
                } finally {
                    tVar.E = false;
                }
            }
            if (ordinal == 2) {
                return i1.b.f4586e;
            }
            if (ordinal != 3) {
                r.p();
                return null;
            }
        }
        return i1.b.f4585d;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, wd.p] */
    public static final i1.b D(t tVar, int i3) {
        if (!tVar.F) {
            tVar.F = true;
            try {
                o K = tVar.K();
                i1.a aVar = new i1.a(i3);
                k kVar = (k) c2.k.v(tVar).getFocusOwner();
                t f3 = kVar.f();
                K.j.invoke(aVar);
                t f10 = kVar.f();
                if (aVar.f4584b) {
                    q qVar = q.f4622b;
                    return i1.b.f4586e;
                }
                if (f3 != f10 && f10 != null) {
                    return q.f4624d == q.f4623c ? i1.b.f4586e : i1.b.f4587i;
                }
            } finally {
                tVar.F = false;
            }
        }
        return i1.b.f4585d;
    }

    public static final i1.b E(t tVar, int i3) {
        d1.k kVar;
        b1 b1Var;
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = z4.w.r(tVar);
                if (r9 != null) {
                    return C(r9, i3);
                }
                a1.e("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    r.p();
                    return null;
                }
                if (!tVar.f3305d.B) {
                    z1.a.b("visitAncestors called on an unattached node");
                }
                d1.k kVar2 = tVar.f3305d.f3309s;
                c2.g0 u2 = c2.k.u(tVar);
                loop0: while (true) {
                    if (u2 == null) {
                        kVar = null;
                        break;
                    }
                    if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                        while (kVar2 != null) {
                            if ((kVar2.f3307i & 1024) != 0) {
                                kVar = kVar2;
                                o0.e eVar = null;
                                while (kVar != null) {
                                    if (kVar instanceof t) {
                                        break loop0;
                                    }
                                    if ((kVar.f3307i & 1024) != 0 && (kVar instanceof c2.j)) {
                                        int i10 = 0;
                                        for (d1.k kVar3 = ((c2.j) kVar).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                            if ((kVar3.f3307i & 1024) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    kVar = kVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new d1.k[16]);
                                                    }
                                                    if (kVar != null) {
                                                        eVar.b(kVar);
                                                        kVar = null;
                                                    }
                                                    eVar.b(kVar3);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    kVar = c2.k.e(eVar);
                                }
                            }
                            kVar2 = kVar2.f3309s;
                        }
                    }
                    u2 = u2.s();
                    kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
                }
                t tVar2 = (t) kVar;
                if (tVar2 == null) {
                    return i1.b.f4585d;
                }
                int ordinal2 = tVar2.M().ordinal();
                if (ordinal2 == 0) {
                    return D(tVar2, i3);
                }
                if (ordinal2 == 1) {
                    return E(tVar2, i3);
                }
                if (ordinal2 == 2) {
                    return i1.b.f4586e;
                }
                if (ordinal2 != 3) {
                    r.p();
                    return null;
                }
                i1.b E = E(tVar2, i3);
                i1.b bVar = E != i1.b.f4585d ? E : null;
                return bVar == null ? D(tVar2, i3) : bVar;
            }
        }
        return i1.b.f4585d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v10, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final boolean F(t tVar) {
        o0.e eVar;
        b1 b1Var;
        k kVar;
        boolean z10;
        int i3;
        ?? r52;
        int i10;
        int i11;
        b1 b1Var2;
        k kVar2 = (k) c2.k.v(tVar).getFocusOwner();
        t f3 = kVar2.f();
        i1.r M = tVar.M();
        if (f3 == tVar) {
            tVar.J(M, M);
            return true;
        }
        if ((f3 == null || f3.C) && !tVar.C && !((k) c2.k.v(tVar).getFocusOwner()).f4601a.F()) {
            return false;
        }
        if (f3 != null) {
            eVar = new o0.e(new t[16]);
            if (!f3.f3305d.B) {
                z1.a.b("visitAncestors called on an unattached node");
            }
            d1.k kVar3 = f3.f3305d.f3309s;
            c2.g0 u2 = c2.k.u(f3);
            while (u2 != null) {
                if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                    while (kVar3 != null) {
                        if ((kVar3.f3307i & 1024) != 0) {
                            d1.k kVar4 = kVar3;
                            o0.e eVar2 = null;
                            while (kVar4 != null) {
                                if (kVar4 instanceof t) {
                                    eVar.b((t) kVar4);
                                } else if ((kVar4.f3307i & 1024) != 0 && (kVar4 instanceof c2.j)) {
                                    int i12 = 0;
                                    for (d1.k kVar5 = ((c2.j) kVar4).D; kVar5 != null; kVar5 = kVar5.f3310t) {
                                        if ((kVar5.f3307i & 1024) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                kVar4 = kVar5;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar4 != null) {
                                                    eVar2.b(kVar4);
                                                    kVar4 = null;
                                                }
                                                eVar2.b(kVar5);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                kVar4 = c2.k.e(eVar2);
                            }
                        }
                        kVar3 = kVar3.f3309s;
                    }
                }
                u2 = u2.s();
                kVar3 = (u2 == null || (b1Var2 = u2.S) == null) ? null : (z1) b1Var2.f1495f;
            }
        } else {
            eVar = null;
        }
        t[] tVarArr = new t[16];
        t[] tVarArr2 = new t[16];
        if (!tVar.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar6 = tVar.f3305d.f3309s;
        c2.g0 u10 = c2.k.u(tVar);
        boolean z11 = true;
        int i13 = 0;
        int i14 = 0;
        while (u10 != null) {
            if ((((d1.k) u10.S.g).f3308r & 1024) != 0) {
                while (kVar6 != null) {
                    if ((kVar6.f3307i & 1024) != 0) {
                        t tVar2 = kVar6;
                        o0.e eVar3 = null;
                        while (tVar2 != 0) {
                            if (tVar2 instanceof t) {
                                t tVar3 = tVar2;
                                if (Intrinsics.a(eVar != null ? Boolean.valueOf(eVar.k(tVar3)) : null, Boolean.TRUE)) {
                                    int i15 = i13 + 1;
                                    if (tVarArr.length < i15) {
                                        int length = tVarArr.length;
                                        kVar = kVar2;
                                        ?? r12 = new Object[Math.max(i15, length * 2)];
                                        i11 = i15;
                                        System.arraycopy(tVarArr, 0, r12, 0, length);
                                        tVarArr = r12;
                                    } else {
                                        kVar = kVar2;
                                        i11 = i15;
                                    }
                                    tVarArr[i13] = tVar3;
                                    i13 = i11;
                                } else {
                                    kVar = kVar2;
                                    int i16 = i14 + 1;
                                    if (tVarArr2.length < i16) {
                                        int length2 = tVarArr2.length;
                                        ?? r53 = new Object[Math.max(i16, length2 * 2)];
                                        i10 = i16;
                                        System.arraycopy(tVarArr2, 0, r53, 0, length2);
                                        tVarArr2 = r53;
                                    } else {
                                        i10 = i16;
                                    }
                                    tVarArr2[i14] = tVar3;
                                    i14 = i10;
                                }
                                if (tVar3 == f3) {
                                    z11 = false;
                                }
                                z10 = false;
                            } else {
                                kVar = kVar2;
                                z10 = true;
                            }
                            if (z10 && (tVar2.f3307i & 1024) != 0 && (tVar2 instanceof c2.j)) {
                                d1.k kVar7 = tVar2.D;
                                int i17 = 0;
                                tVar2 = tVar2;
                                while (kVar7 != null) {
                                    if ((kVar7.f3307i & 1024) != 0) {
                                        int i18 = i17 + 1;
                                        if (i18 == 1) {
                                            tVar2 = kVar7;
                                            i3 = i18;
                                        } else {
                                            if (eVar3 == null) {
                                                i3 = i18;
                                                r52 = new o0.e(new d1.k[16]);
                                            } else {
                                                i3 = i18;
                                                r52 = eVar3;
                                            }
                                            if (tVar2 != 0) {
                                                r52.b(tVar2);
                                                tVar2 = 0;
                                            }
                                            r52.b(kVar7);
                                            eVar3 = r52;
                                            tVar2 = tVar2;
                                        }
                                        i17 = i3;
                                    }
                                    kVar7 = kVar7.f3310t;
                                    tVar2 = tVar2;
                                }
                                if (i17 == 1) {
                                    kVar2 = kVar;
                                }
                            }
                            tVar2 = c2.k.e(eVar3);
                            kVar2 = kVar;
                        }
                    }
                    kVar6 = kVar6.f3309s;
                    kVar2 = kVar2;
                }
            }
            k kVar8 = kVar2;
            u10 = u10.s();
            kVar6 = (u10 == null || (b1Var = u10.S) == null) ? null : (z1) b1Var.f1495f;
            kVar2 = kVar8;
        }
        k kVar9 = kVar2;
        if (z11 && f3 != null && !j(f3, false)) {
            return false;
        }
        c2.k.r(tVar, new a0(7, tVar));
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        r.p();
                        return false;
                    }
                }
            }
            ((k) c2.k.v(tVar).getFocusOwner()).h(tVar);
        }
        if (z11 && f3 != null) {
            f3.J(i1.r.f4626d, i1.r.f4628i);
        }
        if (eVar != null) {
            int i19 = eVar.f7319i - 1;
            Object[] objArr = eVar.f7317d;
            if (i19 < objArr.length) {
                while (i19 >= 0) {
                    t tVar4 = (t) objArr[i19];
                    if (kVar9.f() != tVar) {
                        return false;
                    }
                    tVar4.J(i1.r.f4627e, i1.r.f4628i);
                    i19--;
                }
            }
        }
        int i20 = i14 - 1;
        if (i20 < tVarArr2.length) {
            while (i20 >= 0) {
                t tVar5 = tVarArr2[i20];
                if (kVar9.f() != tVar) {
                    return false;
                }
                tVar5.J(tVar5 == f3 ? i1.r.f4626d : i1.r.f4628i, i1.r.f4627e);
                i20--;
            }
        }
        if (kVar9.f() != tVar) {
            return false;
        }
        tVar.J(M, i1.r.f4626d);
        return kVar9.f() == tVar;
    }

    public static final void G(q0.k kVar, n0.a aVar, int i3) {
        while (true) {
            int i10 = kVar.f7779v;
            if (i3 > i10 && i3 < kVar.f7778u) {
                return;
            }
            if (i10 == 0 && i3 == 0) {
                return;
            }
            kVar.M();
            if (kVar.y(kVar.f7779v)) {
                aVar.l();
            }
            kVar.j();
        }
    }

    public static final List J(i5.c cVar) {
        int H = i7.a.H(cVar, "id");
        int H2 = i7.a.H(cVar, "seq");
        int H3 = i7.a.H(cVar, "from");
        int H4 = i7.a.H(cVar, "to");
        id.d b10 = x.b();
        while (cVar.E()) {
            b10.add(new e5.f((int) cVar.getLong(H), (int) cVar.getLong(H2), cVar.k(H3), cVar.k(H4)));
        }
        return CollectionsKt.K(x.a(b10));
    }

    public static final e5.j K(i5.a aVar, String str, boolean z10) {
        i5.c K = aVar.K("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int H = i7.a.H(K, "seqno");
            int H2 = i7.a.H(K, "cid");
            int H3 = i7.a.H(K, "name");
            int H4 = i7.a.H(K, "desc");
            if (H != -1 && H2 != -1 && H3 != -1 && H4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (K.E()) {
                    if (((int) K.getLong(H2)) >= 0) {
                        int i3 = (int) K.getLong(H);
                        String k10 = K.k(H3);
                        String str2 = K.getLong(H4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i3), k10);
                        linkedHashMap2.put(Integer.valueOf(i3), str2);
                    }
                }
                List L = CollectionsKt.L(linkedHashMap.entrySet(), new e5.g(0));
                ArrayList arrayList = new ArrayList(z.j(L, 10));
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List Q = CollectionsKt.Q(arrayList);
                List L2 = CollectionsKt.L(linkedHashMap2.entrySet(), new e5.g(1));
                ArrayList arrayList2 = new ArrayList(z.j(L2, 10));
                Iterator it2 = L2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                e5.j jVar = new e5.j(str, z10, Q, CollectionsKt.Q(arrayList2));
                cf.c.m(K, null);
                return jVar;
            }
            cf.c.m(K, null);
            return null;
        } finally {
        }
    }

    public static Intent L(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i3 = Build.VERSION.SDK_INT;
        return i3 >= 33 ? e3.j.h(context, broadcastReceiver, intentFilter) : i3 >= 26 ? e3.j.g(context, broadcastReceiver, intentFilter) : context.registerReceiver(broadcastReceiver, intentFilter, null, null);
    }

    public static final void M(Object[] objArr, int i3, int i10) {
        objArr.getClass();
        while (i3 < i10) {
            objArr[i3] = null;
            i3++;
        }
    }

    public static List N(List list) {
        return list instanceof b8.g ? ((b8.g) list).p() : list instanceof b8.o ? ((b8.o) list).f1438d : list instanceof RandomAccess ? new b8.m(list) : new b8.o(list);
    }

    public static void R(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            d2.a(view, charSequence);
            return;
        }
        f2 f2Var = f2.f6063y;
        if (f2Var != null && f2Var.f6065d == view) {
            f2.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new f2(view, charSequence);
            return;
        }
        f2 f2Var2 = f2.f6064z;
        if (f2Var2 != null && f2Var2.f6065d == view) {
            f2Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static boolean S(PermissionsActivity permissionsActivity, String str) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i3 >= 32) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
        if (i3 != 31) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(permissionsActivity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return permissionsActivity.shouldShowRequestPermissionRationale(str);
        }
    }

    public static final int T(s.v vVar) {
        int b10;
        int i3 = vVar.f8390b;
        int b11 = vVar.b(0);
        while (vVar.f8390b != 0 && vVar.b(0) == b11) {
            int i10 = vVar.f8390b;
            if (i10 == 0) {
                throw new NoSuchElementException("IntList is empty.");
            }
            vVar.d(0, vVar.f8389a[i10 - 1]);
            vVar.c(vVar.f8390b - 1);
            int i11 = vVar.f8390b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int b12 = vVar.b(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int b13 = vVar.b(i15);
                if (i14 >= i11 || (b10 = vVar.b(i14)) <= b13) {
                    if (b13 > b12) {
                        vVar.d(i13, b13);
                        vVar.d(i15, b12);
                        i13 = i15;
                    }
                } else if (b10 > b12) {
                    vVar.d(i13, b10);
                    vVar.d(i14, b12);
                    i13 = i14;
                }
            }
        }
        return b11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized ClassLoader U() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        synchronized (e.class) {
            if (f5497d == null) {
                Thread thread2 = f5498e;
                ClassLoader classLoader2 = null;
                if (thread2 == null) {
                    ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                    if (threadGroup2 == null) {
                        thread2 = null;
                    } else {
                        synchronized (Void.class) {
                            try {
                                try {
                                    int activeGroupCount = threadGroup2.activeGroupCount();
                                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                                    threadGroup2.enumerate(threadGroupArr);
                                    int i3 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= activeGroupCount) {
                                            threadGroup = null;
                                            break;
                                        }
                                        threadGroup = threadGroupArr[i10];
                                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                                            break;
                                        }
                                        i10++;
                                    }
                                    if (threadGroup == null) {
                                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                    }
                                    int activeCount = threadGroup.activeCount();
                                    Thread[] threadArr = new Thread[activeCount];
                                    threadGroup.enumerate(threadArr);
                                    while (true) {
                                        if (i3 >= activeCount) {
                                            thread = null;
                                            break;
                                        }
                                        thread = threadArr[i3];
                                        if ("GmsDynamite".equals(thread.getName())) {
                                            break;
                                        }
                                        i3++;
                                    }
                                    if (thread == null) {
                                        try {
                                            d dVar = new d(threadGroup, "GmsDynamite");
                                            try {
                                                dVar.setContextClassLoader(null);
                                                dVar.start();
                                                thread = dVar;
                                            } catch (SecurityException e9) {
                                                e2 = e9;
                                                thread = dVar;
                                                String message = e2.getMessage();
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 39);
                                                sb2.append("Failed to enumerate thread/threadgroup ");
                                                sb2.append(message);
                                                Log.w("DynamiteLoaderV2CL", sb2.toString());
                                                thread2 = thread;
                                                f5498e = thread2;
                                            }
                                        } catch (SecurityException e10) {
                                            e2 = e10;
                                        }
                                    }
                                } finally {
                                }
                            } catch (SecurityException e11) {
                                e2 = e11;
                                thread = null;
                            }
                        }
                        thread2 = thread;
                    }
                    f5498e = thread2;
                }
                synchronized (thread2) {
                    try {
                        classLoader2 = f5498e.getContextClassLoader();
                    } catch (SecurityException e12) {
                        String message2 = e12.getMessage();
                        StringBuilder sb3 = new StringBuilder(String.valueOf(message2).length() + 41);
                        sb3.append("Failed to get thread context classloader ");
                        sb3.append(message2);
                        Log.w("DynamiteLoaderV2CL", sb3.toString());
                    }
                }
                f5497d = classLoader2;
            }
            classLoader = f5497d;
        }
        return classLoader;
    }

    public static final void a(boolean z10, Function0 function0, i0 i0Var, int i3) {
        i0Var.X(-361453782);
        int i10 = (i0Var.g(z10) ? 4 : 2) | i3 | (i0Var.h(function0) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            Object a9 = t4.a.a(i0Var);
            if (a9 == null) {
                i0Var.W(535274673);
                a9 = e.i.a(i0Var);
            } else {
                i0Var.W(535271790);
            }
            i0Var.p(false);
            if (a9 == null) {
                kotlin.collections.i0.l("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean f3 = i0Var.f(a9);
            Object L = i0Var.L();
            Object obj = n0.k.f6729a;
            if (f3 || L == obj) {
                s4.c cVar = a9 instanceof s4.c ? (s4.c) a9 : null;
                c6.i c10 = cVar != null ? cVar.c() : null;
                e0 e0Var = a9 instanceof e0 ? (e0) a9 : null;
                L = new f.b(c10, e0Var != null ? e0Var.a() : null);
                i0Var.g0(L);
            }
            Object obj2 = (f.b) L;
            long j = i0Var.T;
            boolean f10 = i0Var.f(obj2) | i0Var.e(j);
            Object L2 = i0Var.L();
            Object obj3 = L2;
            if (f10 || L2 == obj) {
                e.f fVar = new e.f(new e.a(j, a9));
                fVar.f3745c = new a1.k(4);
                i0Var.g0(fVar);
                obj3 = fVar;
            }
            e.f fVar2 = (e.f) obj3;
            i0Var.W(-585307852);
            boolean h10 = i0Var.h(fVar2) | ((i10 & 112) == 32);
            Object L3 = i0Var.L();
            if (h10 || L3 == obj) {
                L3 = new a4.a(2, fVar2, function0);
                i0Var.g0(L3);
            }
            n0.h.g((Function0) L3, i0Var);
            Boolean valueOf = Boolean.valueOf(z10);
            int i11 = i10 & 14;
            boolean h11 = i0Var.h(fVar2) | (i11 == 4);
            Object L4 = i0Var.L();
            if (h11 || L4 == obj) {
                L4 = new e.b(fVar2, z10, 0);
                i0Var.g0(L4);
            }
            cf.c.f(valueOf, fVar2, null, (Function1) L4, i0Var, i11);
            boolean h12 = i0Var.h(obj2) | i0Var.h(fVar2);
            Object L5 = i0Var.L();
            if (h12 || L5 == obj) {
                L5 = new l0(3, obj2, fVar2);
                i0Var.g0(L5);
            }
            n0.h.c(obj2, fVar2, (Function1) L5, i0Var);
            i0Var.p(false);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new e.c(z10, function0, i3, 0);
        }
    }

    public static final void b(Function0 function0, b3.o oVar, x0.d dVar, i0 i0Var, int i3) {
        i0 i0Var2;
        l lVar;
        Object obj;
        i0Var.X(826668973);
        int i10 = i3 | (i0Var.h(function0) ? 4 : 2) | (i0Var.f(oVar) ? 32 : 16);
        if (i0Var.O(i10 & 1, (i10 & 147) != 146)) {
            View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f469f);
            x2.c cVar = (x2.c) i0Var.j(d1.f3384h);
            l lVar2 = (l) i0Var.j(d1.f3389n);
            n0.h0 u2 = n0.h.u(i0Var);
            z0 v10 = n0.h.v(dVar, i0Var);
            Object[] objArr = new Object[0];
            Object L = i0Var.L();
            n0.e eVar = n0.k.f6729a;
            if (L == eVar) {
                L = b3.f.f1060e;
                i0Var.g0(L);
            }
            Object b10 = s.b(Arrays.copyOf(objArr, 0), s.f50a, (Function0) L, i0Var, 3456, 0);
            i0 i0Var3 = i0Var;
            UUID uuid = (UUID) b10;
            boolean d10 = i0Var3.d(oVar.g) | i0Var3.f(view) | i0Var3.f(cVar) | i0Var3.f(null);
            Object L2 = i0Var3.L();
            if (d10 || L2 == eVar) {
                lVar = lVar2;
                b3.q qVar = new b3.q(function0, oVar, view, lVar, cVar, uuid);
                x0.d dVar2 = new x0.d(-1338939603, true, new b3.e(0, v10));
                n nVar = qVar.f1088v;
                nVar.setParentCompositionContext(u2);
                nVar.f1072y.setValue(dVar2);
                nVar.C = true;
                nVar.e();
                i0Var3.g0(qVar);
                obj = qVar;
            } else {
                obj = L2;
                lVar = lVar2;
            }
            b3.q qVar2 = (b3.q) obj;
            boolean h10 = i0Var3.h(qVar2);
            Object L3 = i0Var3.L();
            if (h10 || L3 == eVar) {
                L3 = new b3.b(qVar2, 0);
                i0Var3.g0(L3);
            }
            n0.h.d(qVar2, (Function1) L3, i0Var3);
            boolean h11 = i0Var3.h(qVar2) | ((i10 & 14) == 4) | ((i10 & 112) == 32) | i0Var3.d(lVar.ordinal());
            Object L4 = i0Var3.L();
            if (h11 || L4 == eVar) {
                L4 = new b3.c(qVar2, function0, oVar, lVar);
                i0Var3.g0(L4);
            }
            n0.h.g((Function0) L4, i0Var3);
            i0Var2 = i0Var3;
        } else {
            i0 i0Var4 = i0Var;
            i0Var4.R();
            i0Var2 = i0Var4;
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new a3.p(function0, oVar, dVar, i3, 1);
        }
    }

    public static final void c(d1.l lVar, Function2 function2, i0 i0Var, int i3) {
        int i10;
        i0Var.X(1090521195);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(lVar) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.h(function2) ? 32 : 16;
        }
        if (i0Var.O(i10 & 1, (i10 & 19) != 18)) {
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = b3.g.f1064a;
                i0Var.g0(L);
            }
            a2.g0 g0Var = (a2.g0) L;
            int hashCode = Long.hashCode(i0Var.T);
            x0.h l10 = i0Var.l();
            d1.l C = z4.w.C(lVar, i0Var);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            int i11 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            i0Var.Z();
            if (i0Var.S) {
                i0Var.k(zVar);
            } else {
                i0Var.j0();
            }
            n0.h.y(g0Var, c2.f.f1536e, i0Var);
            n0.h.y(l10, c2.f.f1535d, i0Var);
            n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
            n0.h.t(i0Var, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var);
            function2.invoke(i0Var, Integer.valueOf((i11 >> 6) & 14));
            i0Var.p(true);
        } else {
            i0Var.R();
        }
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new v0(lVar, function2, i3, 1);
        }
    }

    public static final String d(Object[] objArr, int i3, int i10, kotlin.collections.l lVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i3 + i11];
            if (obj == lVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final void e(s.v vVar, int i3) {
        if (vVar.f8390b == 0 || !(vVar.b(0) == i3 || vVar.b(vVar.f8390b - 1) == i3)) {
            int i10 = vVar.f8390b;
            vVar.a(i3);
            while (i10 > 0) {
                int i11 = ((i10 + 1) >>> 1) - 1;
                int b10 = vVar.b(i11);
                if (i3 <= b10) {
                    break;
                }
                vVar.d(i10, b10);
                i10 = i11;
            }
            vVar.d(i10, i3);
        }
    }

    public static int i(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new e3.t(context).f3851b.areNotificationsEnabled() ? 0 : -1;
        }
        r.j("permission must be non-null");
        return 0;
    }

    public static final boolean j(t tVar, boolean z10) {
        int ordinal = tVar.M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t r9 = z4.w.r(tVar);
                if (!(r9 != null ? j(r9, z10) : true)) {
                    return false;
                }
                tVar.J(i1.r.f4627e, i1.r.f4628i);
                return true;
            }
            if (ordinal == 2) {
                return z10;
            }
            if (ordinal != 3) {
                r.p();
                return false;
            }
        }
        return true;
    }

    public static void l(String str, String str2, Object obj) {
        String v10 = v(str);
        if (Log.isLoggable(v10, 3)) {
            Log.d(v10, String.format(str2, obj));
        }
    }

    public static final k4.b n(androidx.lifecycle.a1 a1Var) {
        return a1Var instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a1Var).e() : k4.a.f5385b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(f1.e eVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        j2.n nVar;
        j2.m mVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            ViewTranslationResponse o6 = a7.h.o(longSparseArray.get(keyAt));
            if (o6 != null && value != null && text != null && (nVar = (j2.n) eVar.f().b((int) keyAt)) != null && (mVar = nVar.f4986a) != null) {
                Object g = mVar.f4983d.f4975d.g(j2.i.f4959k);
                if (g == null) {
                    g = null;
                }
                j2.a aVar = (j2.a) g;
                if (aVar != null && (function1 = (Function1) aVar.f4929b) != null) {
                }
            }
        }
    }

    public static void p(String str, String str2, Exception exc) {
        String v10 = v(str);
        if (Log.isLoggable(v10, 6)) {
            Log.e(v10, str2, exc);
        }
    }

    public static long q(int i3, int i10, int i11, int i12) {
        int i13 = 262142;
        int min = Math.min(i11, 262142);
        int min2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int i14 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    x2.b.j(i14);
                    throw new hd.d();
                }
                i13 = 8190;
            }
        }
        return x2.b.a(Math.min(i13, i3), i10 != Integer.MAX_VALUE ? Math.min(i13, i10) : Integer.MAX_VALUE, min, min2);
    }

    public static long r(int i3, int i10, int i11, int i12) {
        int i13 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i10, 262142);
        int i14 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i14 >= 8191) {
            if (i14 < 32767) {
                i13 = 65534;
            } else if (i14 < 65535) {
                i13 = 32766;
            } else {
                if (i14 >= 262143) {
                    x2.b.j(i14);
                    throw new hd.d();
                }
                i13 = 8190;
            }
        }
        return x2.b.a(min, min2, Math.min(i13, i11), i12 != Integer.MAX_VALUE ? Math.min(i13, i12) : Integer.MAX_VALUE);
    }

    public static final String s() {
        byte[] bArr = new byte[16];
        fe.a.f4214a.nextBytes(bArr);
        byte b10 = (byte) (bArr[6] & 15);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | 64);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long G = a.a.G(0, bArr);
        long G2 = a.a.G(8, bArr);
        return ((G == 0 && G2 == 0) ? fe.b.f4215i : new fe.b(G, G2)).toString();
    }

    public static s2.b t() {
        p.e eVar = s2.c.f8412a;
        eVar.getClass();
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((c0) eVar.f7590r)) {
            try {
                s2.b bVar = (s2.b) eVar.f7589i;
                if (bVar != null && localeList == ((LocaleList) eVar.f7588e)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList.add(new s2.a(localeList.get(i3)));
                }
                s2.b bVar2 = new s2.b(arrayList);
                eVar.f7588e = localeList;
                eVar.f7589i = bVar2;
                return bVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final u3.a u(View view) {
        u3.a aVar = (u3.a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (aVar != null) {
            return aVar;
        }
        u3.a aVar2 = new u3.a();
        view.setTag(R.id.pooling_container_listener_holder_tag, aVar2);
        return aVar2;
    }

    public static String v(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final int x(int i3, int i10) {
        return (i3 >> i10) & 31;
    }

    public static String y(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i3 = 0;
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, sb4.length() != 0 ? "Exception during lenientFormat for ".concat(sb4) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(name2.length() + sb4.length() + 9);
                    sb5.append("<");
                    sb5.append(sb4);
                    sb5.append(" threw ");
                    sb5.append(name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i10] = sb2;
        }
        StringBuilder sb6 = new StringBuilder((objArr.length * 16) + str.length());
        int i11 = 0;
        while (i3 < objArr.length && (indexOf = str.indexOf("%s", i11)) != -1) {
            sb6.append((CharSequence) str, i11, indexOf);
            sb6.append(objArr[i3]);
            i11 = indexOf + 2;
            i3++;
        }
        sb6.append((CharSequence) str, i11, str.length());
        if (i3 < objArr.length) {
            sb6.append(" [");
            sb6.append(objArr[i3]);
            for (int i12 = i3 + 1; i12 < objArr.length; i12++) {
                sb6.append(", ");
                sb6.append(objArr[i12]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static final ArrayList z(Map map, Function1 function1) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            n4.g gVar = (n4.g) entry.getValue();
            Boolean valueOf = gVar != null ? Boolean.valueOf(gVar.f7059b) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !gVar.f7060c) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) function1.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public abstract void H(c3.g gVar, c3.g gVar2);

    public abstract void I(c3.g gVar, Thread thread);

    public abstract void P(boolean z10);

    public abstract void Q();

    public abstract boolean f(c3.h hVar, c3.d dVar, c3.d dVar2);

    public abstract boolean g(c3.h hVar, Object obj, Object obj2);

    public abstract boolean h(c3.h hVar, c3.g gVar, c3.g gVar2);

    public abstract void k(f8.c0 c0Var, Set set);

    public abstract int m(f8.c0 c0Var);

    public abstract void w();

    public void O(boolean z10) {
    }
}
