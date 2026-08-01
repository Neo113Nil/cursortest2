package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.trembin.nirefon.betfury.MainActivity2;
import com.trembin.nirefon.betfury.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class nz {
    public static final yv e = new yv(0);
    public static final yv f = new yv(1);
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;

    public nz(u60 u60Var, int i, String str) {
        this.a = 3;
        u60Var.getClass();
        this.c = u60Var;
        this.b = i;
        this.d = str;
    }

    public static void b(x80 x80Var) {
        View view = x80Var.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float floatValue = ((Float) tag).floatValue();
            WeakHashMap weakHashMap = hm0.a;
            view.setElevation(floatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public static int c(int i, int i2) {
        int i3;
        int i4 = i & 3158064;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 >> 2;
        } else {
            int i6 = i4 >> 1;
            i5 |= (-3158065) & i6;
            i3 = (i6 & 3158064) >> 2;
        }
        return i5 | i3;
    }

    public static int d(int i, int i2) {
        int i3;
        int i4 = i & 789516;
        if (i4 == 0) {
            return i;
        }
        int i5 = i & (~i4);
        if (i2 == 0) {
            i3 = i4 << 2;
        } else {
            int i6 = i4 << 1;
            i5 |= (-789517) & i6;
            i3 = (i6 & 789516) << 2;
        }
        return i5 | i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new defpackage.i5(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.g;
        r17 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new defpackage.nz(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.g;
        r21 = (float[]) r0.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new defpackage.i5(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new defpackage.i5(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static nz e(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        int i3;
        float f4;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList b = ed.b(resources, xml, asAttributeSet, theme);
                return new nz((Shader) null, b, b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray i4 = bd0.i(resources, theme, asAttributeSet, z60.e);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? i4.getFloat(8, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? i4.getFloat(9, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? i4.getFloat(10, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? i4.getFloat(11, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? i4.getFloat(3, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? i4.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? i4.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? i4.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? i4.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f2 = f5;
            i2 = i4.getColor(1, 0);
        } else {
            f2 = f5;
            i2 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f3 = f6;
            i3 = i4.getInt(6, 0);
        } else {
            f3 = f6;
            i3 = 0;
        }
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? i4.getFloat(5, 0.0f) : 0.0f;
        i4.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f13 = f7;
            if (next2 == 1) {
                f4 = f8;
                break;
            }
            int depth2 = xml.getDepth();
            f4 = f8;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray i6 = bd0.i(resources, theme, asAttributeSet, z60.f);
                boolean hasValue = i6.hasValue(0);
                boolean hasValue2 = i6.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = i6.getColor(0, 0);
                float f14 = i6.getFloat(1, 0.0f);
                i6.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f14));
            }
            f7 = f13;
            f8 = f4;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public static void i(RecyclerView recyclerView, x80 x80Var, float f2, float f3, boolean z) {
        View view = x80Var.a;
        if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = hm0.a;
            Float valueOf = Float.valueOf(view.getElevation());
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = hm0.a;
                    float elevation = childAt.getElevation();
                    if (elevation > f4) {
                        f4 = elevation;
                    }
                }
            }
            view.setElevation(f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }

    public void a() {
        me meVar;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            rk.a(drawable);
        }
        if (drawable == null || (meVar = (me) this.d) == null) {
            return;
        }
        a5.e(drawable, meVar, imageView.getDrawableState());
    }

    public int f(RecyclerView recyclerView, int i, int i2, long j) {
        if (this.b == -1) {
            this.b = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (e.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f) * ((int) (f.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)) * ((int) Math.signum(i2)) * this.b)));
        return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
    }

    public boolean g() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void h(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = d70.f;
        s6 t = s6.t(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) t.b;
        hm0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) t.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = d50.v(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                rk.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(t.i(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(rk.b(typedArray.getInt(3, -1), null));
            }
            t.v();
        } catch (Throwable th) {
            t.v();
            throw th;
        }
    }

    public void j(int i) {
        ImageView imageView = (ImageView) this.c;
        if (i != 0) {
            Drawable v = d50.v(imageView.getContext(), i);
            if (v != null) {
                rk.a(v);
            }
            imageView.setImageDrawable(v);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((u60) this.c) == u60.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public nz(ImageView imageView) {
        this.a = 1;
        this.b = 0;
        this.c = imageView;
    }

    public nz(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 2;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public nz(c40 c40Var, MainActivity2 mainActivity2) {
        this.a = 0;
        this.c = c40Var;
        this.d = mainActivity2;
        this.b = -1;
    }
}
