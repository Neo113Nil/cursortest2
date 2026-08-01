package B;

import K.C0014l;
import K.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import l.AbstractC0221m0;
import l.C0234t;
import l.T0;
import org.xmlpull.v1.XmlPullParserException;
import y.AbstractC0315a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18a;

    /* renamed from: b, reason: collision with root package name */
    public int f19b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20c;
    public Object d;

    public d(o1.q qVar, int i, String str) {
        this.f18a = 2;
        this.f20c = qVar;
        this.f19b = i;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f2;
        int i2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i3;
        Shader radialGradient;
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
        TypedArray f7 = b.f(resources, theme, asAttributeSet, AbstractC0315a.d);
        float f8 = !b.c(xml, "startX") ? 0.0f : f7.getFloat(8, RecyclerView.f1530C0);
        float f9 = !b.c(xml, "startY") ? 0.0f : f7.getFloat(9, RecyclerView.f1530C0);
        float f10 = !b.c(xml, "endX") ? 0.0f : f7.getFloat(10, RecyclerView.f1530C0);
        float f11 = !b.c(xml, "endY") ? 0.0f : f7.getFloat(11, RecyclerView.f1530C0);
        float f12 = !b.c(xml, "centerX") ? 0.0f : f7.getFloat(3, RecyclerView.f1530C0);
        float f13 = !b.c(xml, "centerY") ? 0.0f : f7.getFloat(4, RecyclerView.f1530C0);
        int i4 = !b.c(xml, "type") ? 0 : f7.getInt(2, 0);
        int color = !b.c(xml, "startColor") ? 0 : f7.getColor(0, 0);
        boolean c2 = b.c(xml, "centerColor");
        int color2 = !b.c(xml, "centerColor") ? 0 : f7.getColor(7, 0);
        int color3 = !b.c(xml, "endColor") ? 0 : f7.getColor(1, 0);
        if (b.c(xml, "tileMode")) {
            f2 = f12;
            i2 = f7.getInt(6, 0);
        } else {
            f2 = f12;
            i2 = 0;
        }
        if (b.c(xml, "gradientRadius")) {
            f3 = f13;
            f4 = f7.getFloat(5, RecyclerView.f1530C0);
        } else {
            f3 = f13;
            f4 = RecyclerView.f1530C0;
        }
        f7.recycle();
        int depth = xml.getDepth() + 1;
        float f14 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f15 = f11;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f10;
            if (next2 == 1) {
                f6 = f9;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f9;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray f16 = b.f(resources, theme, asAttributeSet, AbstractC0315a.f4251e);
                boolean hasValue = f16.hasValue(0);
                boolean hasValue2 = f16.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = f16.getColor(0, 0);
                float f17 = f16.getFloat(1, RecyclerView.f1530C0);
                f16.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f17));
            }
            f10 = f5;
            f9 = f6;
        }
        j jVar = arrayList2.size() > 0 ? new j(arrayList2, arrayList) : null;
        if (jVar == null) {
            jVar = c2 ? new j(color, color2, color3) : new j(color, color3);
        }
        if (i4 == 1) {
            float f18 = f2;
            float f19 = f3;
            i3 = 0;
            if (f14 <= RecyclerView.f1530C0) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f18, f19, f14, (int[]) jVar.f31b, (float[]) jVar.f32c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i4 != 2) {
            i3 = 0;
            radialGradient = new LinearGradient(f8, f6, f5, f15, (int[]) jVar.f31b, (float[]) jVar.f32c, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i3 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) jVar.f31b, (float[]) jVar.f32c);
        }
        return new d(radialGradient, (ColorStateList) null, i3);
    }

    public void a() {
        T0 t02;
        ImageView imageView = (ImageView) this.f20c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0221m0.a(drawable);
        }
        if (drawable == null || (t02 = (T0) this.d) == null) {
            return;
        }
        C0234t.e(drawable, t02, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f20c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f20c;
        Context context = imageView.getContext();
        int[] iArr = f.a.f2059f;
        C0014l i2 = C0014l.i(context, attributeSet, iArr, i);
        T.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) i2.f475b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) i2.f475b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = w1.l.z(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0221m0.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                Q.f.c(imageView, i2.b(2));
            }
            if (typedArray.hasValue(3)) {
                Q.f.d(imageView, AbstractC0221m0.b(typedArray.getInt(3, -1), null));
            }
            i2.k();
        } catch (Throwable th) {
            i2.k();
            throw th;
        }
    }

    public String toString() {
        switch (this.f18a) {
            case 2:
                StringBuilder sb = new StringBuilder();
                if (((o1.q) this.f20c) == o1.q.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f19b);
                sb.append(' ');
                sb.append((String) this.d);
                String sb2 = sb.toString();
                d1.d.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public d(ImageView imageView) {
        this.f18a = 1;
        this.f19b = 0;
        this.f20c = imageView;
    }

    public d(Shader shader, ColorStateList colorStateList, int i) {
        this.f18a = 0;
        this.f20c = shader;
        this.d = colorStateList;
        this.f19b = i;
    }
}
