package b0;

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
import c3.r;
import java.util.ArrayList;
import k.j1;
import k.s;
import k0.j0;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f698a;

    /* renamed from: b, reason: collision with root package name */
    public int f699b;
    public final Object c;

    /* renamed from: d, reason: collision with root package name */
    public Object f700d;

    public d(r rVar, int i4, String str) {
        this.f698a = 1;
        this.c = rVar;
        this.f699b = i4;
        this.f700d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new a2.s(r13, r7);
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
    
        return new b0.d(r11, (android.content.res.ColorStateList) null, 0);
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
    
        r0 = new a2.s(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new a2.s(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i4, Resources.Theme theme) {
        int next;
        float f4;
        int i5;
        float f5;
        int i6;
        float f6;
        XmlResourceParser xml = resources.getXml(i4);
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
        TypedArray f7 = b.f(resources, theme, asAttributeSet, y.a.f3609d);
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? f7.getFloat(8, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? f7.getFloat(9, 0.0f) : 0.0f;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? f7.getFloat(10, 0.0f) : 0.0f;
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? f7.getFloat(11, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? f7.getFloat(3, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? f7.getFloat(4, 0.0f) : 0.0f;
        int i7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? f7.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? f7.getColor(0, 0) : 0;
        boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? f7.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            f4 = f8;
            i5 = f7.getColor(1, 0);
        } else {
            f4 = f8;
            i5 = 0;
        }
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f5 = f9;
            i6 = f7.getInt(6, 0);
        } else {
            f5 = f9;
            i6 = 0;
        }
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? f7.getFloat(5, 0.0f) : 0.0f;
        f7.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f14;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            float f16 = f10;
            if (next2 == 1) {
                f6 = f11;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f11;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f17 = b.f(resources, theme, asAttributeSet, y.a.f3610e);
                boolean hasValue = f17.hasValue(0);
                boolean hasValue2 = f17.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = f17.getColor(0, 0);
                float f18 = f17.getFloat(1, 0.0f);
                f17.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f18));
            }
            f10 = f16;
            f11 = f6;
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
    }

    public void a() {
        c3.g gVar;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            j1.a(drawable);
        }
        if (drawable == null || (gVar = (c3.g) this.f700d) == null) {
            return;
        }
        s.e(drawable, gVar, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.f700d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i4) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = e.a.f1499f;
        androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(i4, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) r3.c;
        j0.l(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) r3.c, i4);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = k3.m.w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                j1.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(r3.h(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(j1.b(typedArray.getInt(3, -1), null));
            }
            r3.t();
        } catch (Throwable th) {
            r3.t();
            throw th;
        }
    }

    public String toString() {
        switch (this.f698a) {
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((r) this.c) == r.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f699b);
                sb.append(' ');
                sb.append((String) this.f700d);
                String sb2 = sb.toString();
                u2.c.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(ImageView imageView) {
        this.f698a = 2;
        this.f699b = 0;
        this.c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i4) {
        this.f698a = 0;
        this.c = shader;
        this.f700d = colorStateList;
        this.f699b = i4;
    }
}
