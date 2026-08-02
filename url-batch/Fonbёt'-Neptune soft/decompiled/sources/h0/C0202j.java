package h0;

import P.O;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0280a;
import s.AbstractC0291b;
import s.AbstractC0292c;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202j implements InterfaceC0200h {

    /* renamed from: a, reason: collision with root package name */
    public int f2318a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2319b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2320c;

    public C0202j(Shader shader, ColorStateList colorStateList, int i2) {
        this.f2319b = shader;
        this.f2320c = colorStateList;
        this.f2318a = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0202j c(Resources resources, int i2, Resources.Theme theme) {
        int next;
        float f2;
        int i3;
        float f3;
        float f4;
        float f5;
        float f6;
        int i4;
        Shader radialGradient;
        XmlResourceParser xml = resources.getXml(i2);
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
                ColorStateList b2 = AbstractC0292c.b(resources, xml, asAttributeSet, theme);
                return new C0202j(null, b2, b2.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray h2 = AbstractC0291b.h(resources, theme, asAttributeSet, AbstractC0280a.f3369d);
        float f7 = !AbstractC0291b.e(xml, "startX") ? 0.0f : h2.getFloat(8, 0.0f);
        float f8 = !AbstractC0291b.e(xml, "startY") ? 0.0f : h2.getFloat(9, 0.0f);
        float f9 = !AbstractC0291b.e(xml, "endX") ? 0.0f : h2.getFloat(10, 0.0f);
        float f10 = !AbstractC0291b.e(xml, "endY") ? 0.0f : h2.getFloat(11, 0.0f);
        float f11 = !AbstractC0291b.e(xml, "centerX") ? 0.0f : h2.getFloat(3, 0.0f);
        float f12 = !AbstractC0291b.e(xml, "centerY") ? 0.0f : h2.getFloat(4, 0.0f);
        int i5 = !AbstractC0291b.e(xml, "type") ? 0 : h2.getInt(2, 0);
        int color = !AbstractC0291b.e(xml, "startColor") ? 0 : h2.getColor(0, 0);
        boolean e2 = AbstractC0291b.e(xml, "centerColor");
        int color2 = !AbstractC0291b.e(xml, "centerColor") ? 0 : h2.getColor(7, 0);
        int color3 = !AbstractC0291b.e(xml, "endColor") ? 0 : h2.getColor(1, 0);
        if (AbstractC0291b.e(xml, "tileMode")) {
            f2 = f11;
            i3 = h2.getInt(6, 0);
        } else {
            f2 = f11;
            i3 = 0;
        }
        if (AbstractC0291b.e(xml, "gradientRadius")) {
            f3 = f12;
            f4 = h2.getFloat(5, 0.0f);
        } else {
            f3 = f12;
            f4 = 0.0f;
        }
        h2.recycle();
        int depth = xml.getDepth() + 1;
        float f13 = f4;
        ArrayList arrayList = new ArrayList(20);
        float f14 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f5 = f9;
            if (next2 == 1) {
                f6 = f8;
                break;
            }
            int depth2 = xml.getDepth();
            f6 = f8;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray h3 = AbstractC0291b.h(resources, theme, asAttributeSet, AbstractC0280a.f3370e);
                boolean hasValue = h3.hasValue(0);
                boolean hasValue2 = h3.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = h3.getColor(0, 0);
                float f15 = h3.getFloat(1, 0.0f);
                h3.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f15));
            }
            f9 = f5;
            f8 = f6;
        }
        O o2 = arrayList2.size() > 0 ? new O(arrayList2, arrayList) : null;
        if (o2 == null) {
            o2 = e2 ? new O(color, color2, color3) : new O(color, color3);
        }
        if (i5 == 1) {
            float f16 = f2;
            float f17 = f3;
            i4 = 0;
            if (f13 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f16, f17, f13, (int[]) o2.f875f, (float[]) o2.f876g, i3 != 1 ? i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else if (i5 != 2) {
            i4 = 0;
            radialGradient = new LinearGradient(f7, f6, f5, f14, (int[]) o2.f875f, (float[]) o2.f876g, i3 != 1 ? i3 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        } else {
            i4 = 0;
            radialGradient = new SweepGradient(f2, f3, (int[]) o2.f875f, (float[]) o2.f876g);
        }
        return new C0202j(radialGradient, null, i4);
    }

    @Override // h0.InterfaceC0200h
    public void a() {
        HandlerThread handlerThread = (HandlerThread) this.f2319b;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f2319b = null;
            this.f2320c = null;
        }
    }

    @Override // h0.InterfaceC0200h
    public void b(C0197e c0197e, Runnable runnable) {
        ((Handler) this.f2320c).post(runnable);
    }

    public boolean d() {
        ColorStateList colorStateList;
        return ((Shader) this.f2319b) == null && (colorStateList = (ColorStateList) this.f2320c) != null && colorStateList.isStateful();
    }

    @Override // h0.InterfaceC0200h
    public void start() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f2318a);
        this.f2319b = handlerThread;
        handlerThread.start();
        this.f2320c = new Handler(((HandlerThread) this.f2319b).getLooper());
    }
}
