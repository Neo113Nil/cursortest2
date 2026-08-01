package e0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.emoji2.text.t;
import java.util.ArrayList;
import l.j1;
import l.q2;
import l.r;
import n0.p0;
import org.xmlpull.v1.XmlPullParserException;
import t3.p;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1320a;

    /* renamed from: b, reason: collision with root package name */
    public int f1321b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1322c;
    public Object d;

    public d(p pVar, int i, String str) {
        this.f1320a = 2;
        this.f1322c = pVar;
        this.f1321b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new androidx.emoji2.text.q(r13, r7);
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
    
        r16 = (int[]) r0.f466g;
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
    
        return new e0.d(r11, (android.content.res.ColorStateList) null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f466g, (float[]) r0.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f466g;
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
    
        r0 = new androidx.emoji2.text.q(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new androidx.emoji2.text.q(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f5;
        int i4;
        float f6;
        int i5;
        float f7;
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
                ColorStateList b2 = c.b(resources, xml, asAttributeSet, theme);
                return new d((Shader) null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray f8 = b.f(resources, theme, asAttributeSet, b0.a.f822e);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f8.getFloat(8, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f8.getFloat(9, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f8.getFloat(10, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f8.getFloat(11, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f8.getFloat(3, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f8.getFloat(4, 0.0f) : 0.0f;
        int i6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? f8.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f8.getColor(0, 0) : 0;
        boolean z4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f8.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f5 = f9;
            i4 = f8.getColor(1, 0);
        } else {
            f5 = f9;
            i4 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f6 = f10;
            i5 = f8.getInt(6, 0);
        } else {
            f6 = f10;
            i5 = 0;
        }
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f8.getFloat(5, 0.0f) : 0.0f;
        f8.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f16 = f15;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f17 = f11;
            if (next2 == 1) {
                f7 = f12;
                break;
            }
            int depth2 = xml.getDepth();
            f7 = f12;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f18 = b.f(resources, theme, asAttributeSet, b0.a.f823f);
                boolean hasValue = f18.hasValue(0);
                boolean hasValue2 = f18.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f18.getColor(0, 0);
                float f19 = f18.getFloat(1, 0.0f);
                f18.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f19));
            }
            f11 = f17;
            f12 = f7;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void a() {
        q2 q2Var;
        ImageView imageView = (ImageView) this.f1322c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j1.a(drawable);
        }
        if (drawable == null || (q2Var = (q2) this.d) == null) {
            return;
        }
        r.e(drawable, q2Var, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f1322c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1322c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f1394f;
        t i4 = t.i(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) i4.f473b;
        p0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) i4.f473b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = b4.d.y(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(i4.c(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(j1.b(typedArray.getInt(3, -1), null));
            }
            i4.k();
        } catch (Throwable th) {
            i4.k();
            throw th;
        }
    }

    public void e(int i) {
        ImageView imageView = (ImageView) this.f1322c;
        if (i != 0) {
            Drawable y4 = b4.d.y(imageView.getContext(), i);
            if (y4 != null) {
                j1.a(y4);
            }
            imageView.setImageDrawable(y4);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    public String toString() {
        switch (this.f1320a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((p) this.f1322c) == p.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f1321b);
                sb.append(' ');
                sb.append((String) this.d);
                String sb2 = sb.toString();
                i3.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(ImageView imageView) {
        this.f1320a = 1;
        this.f1321b = 0;
        this.f1322c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f1320a = 0;
        this.f1322c = shader;
        this.d = colorStateList;
        this.f1321b = i;
    }
}
