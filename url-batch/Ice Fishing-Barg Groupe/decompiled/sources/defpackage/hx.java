package defpackage;

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
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class hx {
    public static final ep1 PxuCJdSBwIXG;

    static {
        PxuCJdSBwIXG = new ep1((30 & 1) == 0, m12.rtx2ld2ELZv4, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        if (r0 == defpackage.fp.lS5Rgt96tfkO) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PxuCJdSBwIXG(df2 df2Var, pe2 pe2Var, hp hpVar, int i) {
        Context context;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1904307118);
        int i2 = (tf0Var.a92UlCVFR9N8(df2Var) ? 4 : 2) | i | (tf0Var.rtx2ld2ELZv4(pe2Var) ? 32 : 16);
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            if (Build.VERSION.SDK_INT >= 28) {
                tf0Var.IXK6ba3ucyzm(-1009482584);
                context = (Context) tf0Var.wdg6QnbFHrFF(h2.lS5Rgt96tfkO);
                tf0Var.gPXPFXrUH4XX(false);
            } else {
                tf0Var.IXK6ba3ucyzm(-1009433480);
                tf0Var.gPXPFXrUH4XX(false);
                context = null;
            }
            boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(pe2Var) | ((i2 & 14) == 4) | tf0Var.rtx2ld2ELZv4(context);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!rtx2ld2ELZv4) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new cd(pe2Var, context, df2Var, 3);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            zs.lS5Rgt96tfkO(null, null, (le0) nLZGh9p8gVSu, tf0Var, 0, 3);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new bf(i, 5, df2Var, pe2Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r2 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b3, code lost:
    
        if (r12 == r3) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TSizfFm2Yiuu(df2 df2Var, qe2 qe2Var, ae0 ae0Var, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-2040393164);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tf0Var.a92UlCVFR9N8(df2Var) : tf0Var.rtx2ld2ELZv4(df2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tf0Var.a92UlCVFR9N8(qe2Var) : tf0Var.rtx2ld2ELZv4(qe2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(ae0Var) ? 256 : 128;
        }
        boolean z = false;
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 147) != 146)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && tf0Var.a92UlCVFR9N8(qe2Var));
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            jx1 jx1Var = fp.lS5Rgt96tfkO;
            if (!z2) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = new i41(new i2(5, new e6(6, qe2Var, ae0Var)));
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            i41 i41Var = (i41) nLZGh9p8gVSu;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && tf0Var.rtx2ld2ELZv4(df2Var))) {
                z = true;
            }
            Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
            if (!z) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu2 = new o5(9, df2Var);
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu2);
            j5.PxuCJdSBwIXG(i41Var, (ae0) nLZGh9p8gVSu2, PxuCJdSBwIXG, bs0.kpCQ9veP6n3I(1315155414, new bf(4, qe2Var, df2Var), tf0Var), tf0Var, 3456, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(df2Var, qe2Var, ae0Var, i, 5);
        }
    }

    public static final void Y1f8riQaR6yg(n61 n61Var, on onVar, hp hpVar, int i) {
        int i2;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(1392105195);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tf0Var.a92UlCVFR9N8(n61Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tf0Var.rtx2ld2ELZv4(onVar) ? 32 : 16;
        }
        if (tf0Var.Pf0ThKz3j5YS(i2 & 1, (i2 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            mm2.cpQdD2nAriOS(n61Var, bf2.PxuCJdSBwIXG, onVar, tf0Var, ((i2 << 6) & 7168) | (i2 & 14) | 432);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new l6(n61Var, onVar, i, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r13 == defpackage.fp.lS5Rgt96tfkO) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x056b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x064e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void lS5Rgt96tfkO(final int i, long j, hp hpVar, final int i2) {
        TypedValue typedValue;
        int i3;
        boolean z;
        td tdVar;
        Object w3Var;
        qi1 qdVar;
        td PxuCJdSBwIXG2;
        TypedArray typedArray;
        boolean z2;
        long j2;
        int i4;
        int i5;
        int i6;
        char c;
        int i7;
        TypedArray obtainStyledAttributes;
        int i8;
        TypedArray obtainStyledAttributes2;
        int i9;
        int i10;
        int i11;
        ColorStateList colorStateList;
        final long j3 = j;
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(-1240244237);
        int i12 = (i2 & 6) == 0 ? i2 | (tf0Var.Y1f8riQaR6yg(i) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i12 |= tf0Var.e9gEMXR7LXtO(j3) ? 32 : 16;
        }
        int i13 = i12;
        if (tf0Var.Pf0ThKz3j5YS(i13 & 1, (i13 & 19) != 18)) {
            gg1 gg1Var = mp.PxuCJdSBwIXG;
            t92 t92Var = h2.lS5Rgt96tfkO;
            Context context = (Context) tf0Var.wdg6QnbFHrFF(t92Var);
            boolean a92UlCVFR9N8 = tf0Var.a92UlCVFR9N8(context) | ((i13 & 14) == 4);
            Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
            if (!a92UlCVFR9N8) {
                hp.Companion.getClass();
            }
            nLZGh9p8gVSu = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
            tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
            int intValue = ((Number) nLZGh9p8gVSu).intValue();
            if (intValue == -1) {
                zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
                if (XL4ISE6Oc65B != null) {
                    final int i14 = 1;
                    XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: fx
                        @Override // defpackage.pe0
                        public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
                            int i15 = i14;
                            no2 no2Var = no2.PxuCJdSBwIXG;
                            int i16 = i2;
                            long j4 = j3;
                            int i17 = i;
                            hp hpVar2 = (hp) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    hx.lS5Rgt96tfkO(i17, j4, hpVar2, ki0.bEKsvqmvPh2y(i16 | 1));
                                    break;
                                default:
                                    hx.lS5Rgt96tfkO(i17, j4, hpVar2, ki0.bEKsvqmvPh2y(i16 | 1));
                                    break;
                            }
                            return no2Var;
                        }
                    };
                    return;
                }
                return;
            }
            Context context2 = (Context) tf0Var.wdg6QnbFHrFF(t92Var);
            Resources resources = (Resources) tf0Var.wdg6QnbFHrFF(h2.TSizfFm2Yiuu);
            kv1 kv1Var = (kv1) tf0Var.wdg6QnbFHrFF(h2.e9gEMXR7LXtO);
            synchronized (kv1Var) {
                typedValue = (TypedValue) kv1Var.PxuCJdSBwIXG.lS5Rgt96tfkO(intValue);
                if (typedValue == null) {
                    typedValue = new TypedValue();
                    resources.getValue(intValue, typedValue, true);
                    c81 c81Var = kv1Var.PxuCJdSBwIXG;
                    int Y1f8riQaR6yg = c81Var.Y1f8riQaR6yg(intValue);
                    Object[] objArr = c81Var.TSizfFm2Yiuu;
                    Object obj = objArr[Y1f8riQaR6yg];
                    c81Var.lS5Rgt96tfkO[Y1f8riQaR6yg] = intValue;
                    objArr[Y1f8riQaR6yg] = typedValue;
                }
            }
            CharSequence charSequence = typedValue.string;
            if (charSequence == null || !ia2.PsecLrZVVK61(charSequence, ".xml")) {
                i3 = i13;
                z = true;
                tf0Var.IXK6ba3ucyzm(-1771643000);
                boolean a92UlCVFR9N82 = tf0Var.a92UlCVFR9N8(context2.getTheme()) | tf0Var.a92UlCVFR9N8(charSequence) | tf0Var.Y1f8riQaR6yg(intValue);
                Object nLZGh9p8gVSu2 = tf0Var.nLZGh9p8gVSu();
                try {
                    if (!a92UlCVFR9N82) {
                        hp.Companion.getClass();
                        if (nLZGh9p8gVSu2 != fp.lS5Rgt96tfkO) {
                            w3Var = nLZGh9p8gVSu2;
                            tdVar = null;
                            qdVar = new qd((ym0) w3Var);
                            tf0Var.gPXPFXrUH4XX(false);
                        }
                    }
                    xm0 xm0Var = ym0.Companion;
                    tdVar = null;
                    Drawable drawable = resources.getDrawable(intValue, null);
                    drawable.getClass();
                    w3Var = new w3(((BitmapDrawable) drawable).getBitmap());
                    tf0Var.JTxCbbCwomzt(w3Var);
                    qdVar = new qd((ym0) w3Var);
                    tf0Var.gPXPFXrUH4XX(false);
                } catch (Exception e) {
                    throw new tm("Error attempting to load resource: " + ((Object) charSequence), e);
                }
            } else {
                tf0Var.IXK6ba3ucyzm(-1771798434);
                Resources.Theme theme = context2.getTheme();
                int i15 = typedValue.changingConfigurations;
                hn0 hn0Var = (hn0) tf0Var.wdg6QnbFHrFF(h2.Y1f8riQaR6yg);
                gn0 gn0Var = new gn0(theme, intValue);
                WeakReference weakReference = (WeakReference) hn0Var.PxuCJdSBwIXG.get(gn0Var);
                fn0 fn0Var = weakReference != null ? (fn0) weakReference.get() : null;
                if (fn0Var == null) {
                    XmlResourceParser xml = resources.getXml(intValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!cs0.wdg6QnbFHrFF(xml.getName(), "vector")) {
                        u9.XL4ISE6Oc65B("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return;
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    y6 y6Var = new y6(xml);
                    int[] iArr = bs0.PxuCJdSBwIXG;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
                    y6Var.TSizfFm2Yiuu(obtainAttributes.getChangingConfigurations());
                    if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
                        typedArray = obtainAttributes;
                        z2 = typedArray.getBoolean(5, false);
                    } else {
                        typedArray = obtainAttributes;
                        z2 = false;
                    }
                    y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                    float lS5Rgt96tfkO = y6Var.lS5Rgt96tfkO(typedArray, "viewportWidth", 7, 0.0f);
                    float lS5Rgt96tfkO2 = y6Var.lS5Rgt96tfkO(typedArray, "viewportHeight", 8, 0.0f);
                    if (lS5Rgt96tfkO <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
                    }
                    if (lS5Rgt96tfkO2 <= 0.0f) {
                        throw new XmlPullParserException(typedArray.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
                    }
                    float dimension = typedArray.getDimension(3, 0.0f);
                    y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                    float dimension2 = typedArray.getDimension(2, 0.0f);
                    y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                    if (typedArray.hasValue(1)) {
                        TypedValue typedValue2 = new TypedValue();
                        typedArray.getValue(1, typedValue2);
                        if (typedValue2.type == 2) {
                            hl.Companion.getClass();
                            j2 = hl.RAsUl2FVSrh6;
                            i3 = i13;
                        } else {
                            if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
                                TypedValue typedValue3 = new TypedValue();
                                typedArray.getValue(1, typedValue3);
                                int i16 = typedValue3.type;
                                if (i16 == 2) {
                                    throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue3);
                                }
                                if (i16 < 28 || i16 > 31) {
                                    Resources resources2 = typedArray.getResources();
                                    i3 = i13;
                                    int resourceId = typedArray.getResourceId(1, 0);
                                    ThreadLocal threadLocal = xl.PxuCJdSBwIXG;
                                    try {
                                        colorStateList = xl.PxuCJdSBwIXG(resources2, resources2.getXml(resourceId), theme);
                                    } catch (Exception e2) {
                                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                                    }
                                } else {
                                    colorStateList = ColorStateList.valueOf(typedValue3.data);
                                    i3 = i13;
                                }
                                y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                                if (colorStateList == null) {
                                    j2 = mm2.TSizfFm2Yiuu(colorStateList.getDefaultColor());
                                } else {
                                    hl.Companion.getClass();
                                    j2 = hl.RAsUl2FVSrh6;
                                }
                            } else {
                                i3 = i13;
                            }
                            colorStateList = null;
                            y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                            if (colorStateList == null) {
                            }
                        }
                    } else {
                        i3 = i13;
                        hl.Companion.getClass();
                        j2 = hl.RAsUl2FVSrh6;
                    }
                    long j4 = j2;
                    int i17 = typedArray.getInt(6, -1);
                    y6Var.TSizfFm2Yiuu(typedArray.getChangingConfigurations());
                    if (i17 != -1) {
                        if (i17 == 3) {
                            sd.Companion.getClass();
                            i4 = 3;
                        } else if (i17 == 5) {
                            sd.Companion.getClass();
                        } else if (i17 != 9) {
                            switch (i17) {
                                case 14:
                                    sd.Companion.getClass();
                                    i4 = 13;
                                    break;
                                case 15:
                                    sd.Companion.getClass();
                                    i4 = 14;
                                    break;
                                case 16:
                                    sd.Companion.getClass();
                                    i4 = 12;
                                    break;
                                default:
                                    sd.Companion.getClass();
                                    break;
                            }
                        } else {
                            sd.Companion.getClass();
                            i4 = 9;
                        }
                        float f = dimension / resources.getDisplayMetrics().density;
                        float f2 = dimension2 / resources.getDisplayMetrics().density;
                        typedArray.recycle();
                        cn0 cn0Var = new cn0(f, f2, lS5Rgt96tfkO, lS5Rgt96tfkO2, j4, i4, z2, 1);
                        i5 = 0;
                        while (true) {
                            if (xml.getEventType() == 1) {
                                z = (xml.getDepth() < 1 && xml.getEventType() == 3) ? true : true;
                                List list = p50.rtx2ld2ELZv4;
                                XmlPullParser xmlPullParser = y6Var.PxuCJdSBwIXG;
                                i2 i2Var = y6Var.TSizfFm2Yiuu;
                                int i18 = i5;
                                int eventType = xmlPullParser.getEventType();
                                XmlResourceParser xmlResourceParser = xml;
                                if (eventType != 2) {
                                    if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                        int i19 = i18 + 1;
                                        for (int i20 = 0; i20 < i19; i20++) {
                                            ArrayList arrayList = cn0Var.OPXfSBeufaJ8;
                                            if (cn0Var.dgRBjINgWbAK) {
                                                ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                            }
                                            bn0 bn0Var = (bn0) arrayList.remove(arrayList.size() - 1);
                                            ((bn0) arrayList.get(arrayList.size() - 1)).wdg6QnbFHrFF.add(new np2(bn0Var.PxuCJdSBwIXG, bn0Var.lS5Rgt96tfkO, bn0Var.TSizfFm2Yiuu, bn0Var.Y1f8riQaR6yg, bn0Var.e9gEMXR7LXtO, bn0Var.a92UlCVFR9N8, bn0Var.RAsUl2FVSrh6, bn0Var.rtx2ld2ELZv4, bn0Var.OPXfSBeufaJ8, bn0Var.wdg6QnbFHrFF));
                                        }
                                        i6 = i15;
                                        c = '\t';
                                        i18 = 0;
                                        xmlResourceParser.next();
                                        i5 = i18;
                                        xml = xmlResourceParser;
                                        i15 = i6;
                                    }
                                    i6 = i15;
                                } else {
                                    String name = xmlPullParser.getName();
                                    if (name != null) {
                                        int hashCode = name.hashCode();
                                        i6 = i15;
                                        if (hashCode == -1649314686) {
                                            c = '\t';
                                            if (name.equals("clip-path")) {
                                                int[] iArr2 = bs0.Y1f8riQaR6yg;
                                                if (theme == null) {
                                                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                                                    i7 = 0;
                                                } else {
                                                    i7 = 0;
                                                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                                                }
                                                y6Var.TSizfFm2Yiuu(obtainStyledAttributes.getChangingConfigurations());
                                                String string = obtainStyledAttributes.getString(i7);
                                                y6Var.TSizfFm2Yiuu(obtainStyledAttributes.getChangingConfigurations());
                                                String str = string == null ? "" : string;
                                                String string2 = obtainStyledAttributes.getString(1);
                                                y6Var.TSizfFm2Yiuu(obtainStyledAttributes.getChangingConfigurations());
                                                if (string2 == null) {
                                                    int i21 = op2.PxuCJdSBwIXG;
                                                } else {
                                                    list = i2.dgRBjINgWbAK(i2Var, string2);
                                                }
                                                List list2 = list;
                                                obtainStyledAttributes.recycle();
                                                if (cn0Var.dgRBjINgWbAK) {
                                                    ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                cn0Var.OPXfSBeufaJ8.add(new bn0(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                                                i18++;
                                            }
                                            xmlResourceParser.next();
                                            i5 = i18;
                                            xml = xmlResourceParser;
                                            i15 = i6;
                                        } else if (hashCode != 3433509) {
                                            if (hashCode == 98629247 && name.equals("group")) {
                                                int[] iArr3 = bs0.lS5Rgt96tfkO;
                                                TypedArray obtainAttributes2 = theme == null ? resources.obtainAttributes(asAttributeSet, iArr3) : theme.obtainStyledAttributes(asAttributeSet, iArr3, 0, 0);
                                                y6Var.TSizfFm2Yiuu(obtainAttributes2.getChangingConfigurations());
                                                float lS5Rgt96tfkO3 = y6Var.lS5Rgt96tfkO(obtainAttributes2, "rotation", 5, 0.0f);
                                                float f3 = obtainAttributes2.getFloat(1, 0.0f);
                                                y6Var.TSizfFm2Yiuu(obtainAttributes2.getChangingConfigurations());
                                                float f4 = obtainAttributes2.getFloat(2, 0.0f);
                                                y6Var.TSizfFm2Yiuu(obtainAttributes2.getChangingConfigurations());
                                                float lS5Rgt96tfkO4 = y6Var.lS5Rgt96tfkO(obtainAttributes2, "scaleX", 3, 1.0f);
                                                float lS5Rgt96tfkO5 = y6Var.lS5Rgt96tfkO(obtainAttributes2, "scaleY", 4, 1.0f);
                                                float lS5Rgt96tfkO6 = y6Var.lS5Rgt96tfkO(obtainAttributes2, "translateX", 6, 0.0f);
                                                float lS5Rgt96tfkO7 = y6Var.lS5Rgt96tfkO(obtainAttributes2, "translateY", 7, 0.0f);
                                                String string3 = obtainAttributes2.getString(0);
                                                y6Var.TSizfFm2Yiuu(obtainAttributes2.getChangingConfigurations());
                                                String str2 = string3 == null ? "" : string3;
                                                obtainAttributes2.recycle();
                                                int i22 = op2.PxuCJdSBwIXG;
                                                if (cn0Var.dgRBjINgWbAK) {
                                                    ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                }
                                                cn0Var.OPXfSBeufaJ8.add(new bn0(str2, lS5Rgt96tfkO3, f3, f4, lS5Rgt96tfkO4, lS5Rgt96tfkO5, lS5Rgt96tfkO6, lS5Rgt96tfkO7, list, 512));
                                            }
                                        } else if (name.equals("path")) {
                                            int[] iArr4 = bs0.TSizfFm2Yiuu;
                                            if (theme == null) {
                                                obtainStyledAttributes2 = resources.obtainAttributes(asAttributeSet, iArr4);
                                                i8 = 0;
                                            } else {
                                                i8 = 0;
                                                obtainStyledAttributes2 = theme.obtainStyledAttributes(asAttributeSet, iArr4, 0, 0);
                                            }
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                                u9.XL4ISE6Oc65B("No path data available");
                                                return;
                                            }
                                            String string4 = obtainStyledAttributes2.getString(i8);
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            String str3 = string4 == null ? "" : string4;
                                            String string5 = obtainStyledAttributes2.getString(2);
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            if (string5 == null) {
                                                int i23 = op2.PxuCJdSBwIXG;
                                            } else {
                                                list = i2.dgRBjINgWbAK(i2Var, string5);
                                            }
                                            List list3 = list;
                                            um PxuCJdSBwIXG3 = y6Var.PxuCJdSBwIXG(obtainStyledAttributes2, theme, "fillColor", 1);
                                            float lS5Rgt96tfkO8 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "fillAlpha", 12, 1.0f);
                                            int i24 = !ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "strokeLineCap") ? -1 : obtainStyledAttributes2.getInt(8, -1);
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            ta2.Companion.getClass();
                                            if (i24 != 0) {
                                                if (i24 == 1) {
                                                    i9 = 1;
                                                } else if (i24 == 2) {
                                                    i9 = 2;
                                                }
                                                i10 = ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "strokeLineJoin") ? -1 : obtainStyledAttributes2.getInt(9, -1);
                                                y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                                va2.Companion.getClass();
                                                if (i10 != 0) {
                                                    if (i10 == 1) {
                                                        i11 = 1;
                                                    } else if (i10 == 2) {
                                                        i11 = 2;
                                                    }
                                                    float lS5Rgt96tfkO9 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                    um PxuCJdSBwIXG4 = y6Var.PxuCJdSBwIXG(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                    float lS5Rgt96tfkO10 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                    float lS5Rgt96tfkO11 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                    float lS5Rgt96tfkO12 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                    float lS5Rgt96tfkO13 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                    float lS5Rgt96tfkO14 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                    int i25 = !ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "fillType") ? 0 : obtainStyledAttributes2.getInt(13, 0);
                                                    y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                                    obtainStyledAttributes2.recycle();
                                                    Shader shader = (Shader) PxuCJdSBwIXG3.TSizfFm2Yiuu;
                                                    int i26 = PxuCJdSBwIXG3.lS5Rgt96tfkO;
                                                    uf vfVar = (shader == null && i26 == 0) ? null : shader != null ? new vf(shader) : new m82(mm2.TSizfFm2Yiuu(i26));
                                                    Shader shader2 = (Shader) PxuCJdSBwIXG4.TSizfFm2Yiuu;
                                                    int i27 = PxuCJdSBwIXG4.lS5Rgt96tfkO;
                                                    uf vfVar2 = (shader2 == null && i27 == 0) ? null : shader2 == null ? new vf(shader2) : new m82(mm2.TSizfFm2Yiuu(i27));
                                                    bk1.Companion.getClass();
                                                    int i28 = i25 == 0 ? 0 : 1;
                                                    if (cn0Var.dgRBjINgWbAK) {
                                                        ep0.lS5Rgt96tfkO("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                                    }
                                                    ((bn0) cn0Var.OPXfSBeufaJ8.get(r0.size() - 1)).wdg6QnbFHrFF.add(new rp2(str3, list3, i28, vfVar, lS5Rgt96tfkO8, vfVar2, lS5Rgt96tfkO10, lS5Rgt96tfkO11, i9, i11, lS5Rgt96tfkO9, lS5Rgt96tfkO14, lS5Rgt96tfkO12, lS5Rgt96tfkO13));
                                                    c = '\t';
                                                    xmlResourceParser.next();
                                                    i5 = i18;
                                                    xml = xmlResourceParser;
                                                    i15 = i6;
                                                }
                                                i11 = 0;
                                                float lS5Rgt96tfkO92 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                                um PxuCJdSBwIXG42 = y6Var.PxuCJdSBwIXG(obtainStyledAttributes2, theme, "strokeColor", 3);
                                                float lS5Rgt96tfkO102 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                                float lS5Rgt96tfkO112 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                                float lS5Rgt96tfkO122 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                                float lS5Rgt96tfkO132 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                                float lS5Rgt96tfkO142 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                                if (!ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "fillType")) {
                                                }
                                                y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                                obtainStyledAttributes2.recycle();
                                                Shader shader3 = (Shader) PxuCJdSBwIXG3.TSizfFm2Yiuu;
                                                int i262 = PxuCJdSBwIXG3.lS5Rgt96tfkO;
                                                if (shader3 == null) {
                                                    Shader shader22 = (Shader) PxuCJdSBwIXG42.TSizfFm2Yiuu;
                                                    int i272 = PxuCJdSBwIXG42.lS5Rgt96tfkO;
                                                    if (shader22 == null) {
                                                        bk1.Companion.getClass();
                                                        if (i25 == 0) {
                                                        }
                                                        if (cn0Var.dgRBjINgWbAK) {
                                                        }
                                                        ((bn0) cn0Var.OPXfSBeufaJ8.get(r0.size() - 1)).wdg6QnbFHrFF.add(new rp2(str3, list3, i28, vfVar, lS5Rgt96tfkO8, vfVar2, lS5Rgt96tfkO102, lS5Rgt96tfkO112, i9, i11, lS5Rgt96tfkO92, lS5Rgt96tfkO142, lS5Rgt96tfkO122, lS5Rgt96tfkO132));
                                                        c = '\t';
                                                        xmlResourceParser.next();
                                                        i5 = i18;
                                                        xml = xmlResourceParser;
                                                        i15 = i6;
                                                    }
                                                    bk1.Companion.getClass();
                                                    if (i25 == 0) {
                                                    }
                                                    if (cn0Var.dgRBjINgWbAK) {
                                                    }
                                                    ((bn0) cn0Var.OPXfSBeufaJ8.get(r0.size() - 1)).wdg6QnbFHrFF.add(new rp2(str3, list3, i28, vfVar, lS5Rgt96tfkO8, vfVar2, lS5Rgt96tfkO102, lS5Rgt96tfkO112, i9, i11, lS5Rgt96tfkO92, lS5Rgt96tfkO142, lS5Rgt96tfkO122, lS5Rgt96tfkO132));
                                                    c = '\t';
                                                    xmlResourceParser.next();
                                                    i5 = i18;
                                                    xml = xmlResourceParser;
                                                    i15 = i6;
                                                }
                                                Shader shader222 = (Shader) PxuCJdSBwIXG42.TSizfFm2Yiuu;
                                                int i2722 = PxuCJdSBwIXG42.lS5Rgt96tfkO;
                                                if (shader222 == null) {
                                                }
                                                bk1.Companion.getClass();
                                                if (i25 == 0) {
                                                }
                                                if (cn0Var.dgRBjINgWbAK) {
                                                }
                                                ((bn0) cn0Var.OPXfSBeufaJ8.get(r0.size() - 1)).wdg6QnbFHrFF.add(new rp2(str3, list3, i28, vfVar, lS5Rgt96tfkO8, vfVar2, lS5Rgt96tfkO102, lS5Rgt96tfkO112, i9, i11, lS5Rgt96tfkO92, lS5Rgt96tfkO142, lS5Rgt96tfkO122, lS5Rgt96tfkO132));
                                                c = '\t';
                                                xmlResourceParser.next();
                                                i5 = i18;
                                                xml = xmlResourceParser;
                                                i15 = i6;
                                            }
                                            i9 = 0;
                                            if (ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "strokeLineJoin")) {
                                            }
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            va2.Companion.getClass();
                                            if (i10 != 0) {
                                            }
                                            i11 = 0;
                                            float lS5Rgt96tfkO922 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeMiterLimit", 10, 4.0f);
                                            um PxuCJdSBwIXG422 = y6Var.PxuCJdSBwIXG(obtainStyledAttributes2, theme, "strokeColor", 3);
                                            float lS5Rgt96tfkO1022 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeAlpha", 11, 1.0f);
                                            float lS5Rgt96tfkO1122 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "strokeWidth", 4, 1.0f);
                                            float lS5Rgt96tfkO1222 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathEnd", 6, 1.0f);
                                            float lS5Rgt96tfkO1322 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathOffset", 7, 0.0f);
                                            float lS5Rgt96tfkO1422 = y6Var.lS5Rgt96tfkO(obtainStyledAttributes2, "trimPathStart", 5, 0.0f);
                                            if (!ni0.jyegZNwi31qc(y6Var.PxuCJdSBwIXG, "fillType")) {
                                            }
                                            y6Var.TSizfFm2Yiuu(obtainStyledAttributes2.getChangingConfigurations());
                                            obtainStyledAttributes2.recycle();
                                            Shader shader32 = (Shader) PxuCJdSBwIXG3.TSizfFm2Yiuu;
                                            int i2622 = PxuCJdSBwIXG3.lS5Rgt96tfkO;
                                            if (shader32 == null) {
                                            }
                                            Shader shader2222 = (Shader) PxuCJdSBwIXG422.TSizfFm2Yiuu;
                                            int i27222 = PxuCJdSBwIXG422.lS5Rgt96tfkO;
                                            if (shader2222 == null) {
                                            }
                                            bk1.Companion.getClass();
                                            if (i25 == 0) {
                                            }
                                            if (cn0Var.dgRBjINgWbAK) {
                                            }
                                            ((bn0) cn0Var.OPXfSBeufaJ8.get(r0.size() - 1)).wdg6QnbFHrFF.add(new rp2(str3, list3, i28, vfVar, lS5Rgt96tfkO8, vfVar2, lS5Rgt96tfkO1022, lS5Rgt96tfkO1122, i9, i11, lS5Rgt96tfkO922, lS5Rgt96tfkO1422, lS5Rgt96tfkO1222, lS5Rgt96tfkO1322));
                                            c = '\t';
                                            xmlResourceParser.next();
                                            i5 = i18;
                                            xml = xmlResourceParser;
                                            i15 = i6;
                                        }
                                    }
                                    i6 = i15;
                                }
                                c = '\t';
                                xmlResourceParser.next();
                                i5 = i18;
                                xml = xmlResourceParser;
                                i15 = i6;
                            }
                        }
                        fn0 fn0Var2 = new fn0(cn0Var.PxuCJdSBwIXG(), i15 | y6Var.lS5Rgt96tfkO);
                        hn0Var.PxuCJdSBwIXG.put(gn0Var, new WeakReference(fn0Var2));
                        fn0Var = fn0Var2;
                    } else {
                        sd.Companion.getClass();
                    }
                    i4 = 5;
                    float f5 = dimension / resources.getDisplayMetrics().density;
                    float f22 = dimension2 / resources.getDisplayMetrics().density;
                    typedArray.recycle();
                    cn0 cn0Var2 = new cn0(f5, f22, lS5Rgt96tfkO, lS5Rgt96tfkO2, j4, i4, z2, 1);
                    i5 = 0;
                    while (true) {
                        if (xml.getEventType() == 1) {
                        }
                        xmlResourceParser.next();
                        i5 = i18;
                        xml = xmlResourceParser;
                        i15 = i6;
                    }
                    fn0 fn0Var22 = new fn0(cn0Var2.PxuCJdSBwIXG(), i15 | y6Var.lS5Rgt96tfkO);
                    hn0Var.PxuCJdSBwIXG.put(gn0Var, new WeakReference(fn0Var22));
                    fn0Var = fn0Var22;
                } else {
                    i3 = i13;
                    z = true;
                }
                en0 en0Var = fn0Var.PxuCJdSBwIXG;
                gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                qdVar = xi0.zf8DYfih6EZu(en0Var, tf0Var);
                tf0Var.gPXPFXrUH4XX(false);
                tdVar = null;
            }
            boolean z3 = (i3 & 112) == 32 ? z : false;
            Object nLZGh9p8gVSu3 = tf0Var.nLZGh9p8gVSu();
            if (!z3) {
                hp.Companion.getClass();
                if (nLZGh9p8gVSu3 != fp.lS5Rgt96tfkO) {
                    j3 = j;
                    n61 a92UlCVFR9N83 = c62.a92UlCVFR9N8(n61.Companion, ts.e9gEMXR7LXtO);
                    hs.Companion.getClass();
                    xe.PxuCJdSBwIXG(zv.Pf0ThKz3j5YS(a92UlCVFR9N83, qdVar, (jl) nLZGh9p8gVSu3), tf0Var, 0);
                }
            }
            if (j == 16) {
                j3 = j;
                PxuCJdSBwIXG2 = tdVar;
            } else {
                j3 = j;
                PxuCJdSBwIXG2 = il.PxuCJdSBwIXG(jl.Companion, j3);
            }
            tf0Var.JTxCbbCwomzt(PxuCJdSBwIXG2);
            nLZGh9p8gVSu3 = PxuCJdSBwIXG2;
            n61 a92UlCVFR9N832 = c62.a92UlCVFR9N8(n61.Companion, ts.e9gEMXR7LXtO);
            hs.Companion.getClass();
            xe.PxuCJdSBwIXG(zv.Pf0ThKz3j5YS(a92UlCVFR9N832, qdVar, (jl) nLZGh9p8gVSu3), tf0Var, 0);
        } else {
            tf0Var.i68hK7ahKtgp();
        }
        zs1 XL4ISE6Oc65B2 = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B2 != null) {
            final int i29 = 0;
            XL4ISE6Oc65B2.Y1f8riQaR6yg = new pe0() { // from class: fx
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj2, Object obj22) {
                    int i152 = i29;
                    no2 no2Var = no2.PxuCJdSBwIXG;
                    int i162 = i2;
                    long j42 = j3;
                    int i172 = i;
                    hp hpVar2 = (hp) obj2;
                    ((Integer) obj22).getClass();
                    switch (i152) {
                        case 0:
                            hx.lS5Rgt96tfkO(i172, j42, hpVar2, ki0.bEKsvqmvPh2y(i162 | 1));
                            break;
                        default:
                            hx.lS5Rgt96tfkO(i172, j42, hpVar2, ki0.bEKsvqmvPh2y(i162 | 1));
                            break;
                    }
                    return no2Var;
                }
            };
        }
    }
}
