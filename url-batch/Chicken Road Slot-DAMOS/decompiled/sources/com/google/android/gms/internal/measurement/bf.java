package com.google.android.gms.internal.measurement;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class bf implements f8.y {

    /* renamed from: d, reason: collision with root package name */
    public int f2174d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2175e;

    public /* synthetic */ bf(int i3, Object obj) {
        this.f2175e = obj;
        this.f2174d = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e2, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bf c(Resources resources, int i3, Resources.Theme theme) {
        int next;
        int i10;
        int i11;
        float f3;
        float f10;
        Object radialGradient;
        int i12;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i3);
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
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new bf(g3.c.b(resources, xml, asAttributeSet, theme).getDefaultColor(), obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = d3.a.f3614e;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", com.onesignal.inAppMessages.internal.display.impl.n.EVENT_TYPE_KEY) != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) {
            i10 = 0;
            i11 = obtainAttributes.getColor(1, 0);
        } else {
            i10 = 0;
            i11 = 0;
        }
        int i14 = 1;
        int i15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, i10) : 0;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f3 = f11;
            if (next2 == i14) {
                f10 = f12;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = f12;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = d3.a.f3615f;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i12 = 0;
                } else {
                    i12 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i12);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color3 = obtainStyledAttributes.getColor(0, 0);
                float f19 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color3));
                arrayList.add(Float.valueOf(f19));
            }
            f11 = f3;
            f12 = f10;
            i14 = 1;
        }
        c6.l lVar = arrayList2.size() > 0 ? new c6.l(arrayList2, arrayList) : null;
        if (lVar == null) {
            lVar = z10 ? new c6.l(color, color2, i11) : new c6.l(color, i11);
        }
        if (i13 != 1) {
            if (i13 != 2) {
                radialGradient = new LinearGradient(f3, f10, f13, f14, (int[]) lVar.f1829e, (float[]) lVar.f1830i, i15 != 1 ? i15 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f15, f16, (int[]) lVar.f1829e, (float[]) lVar.f1830i);
            }
        } else {
            if (f18 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f15, f16, f18, (int[]) lVar.f1829e, (float[]) lVar.f1830i, i15 != 1 ? i15 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new bf(0, radialGradient);
    }

    public void a(long j) {
        if (b(j)) {
            return;
        }
        int i3 = this.f2174d;
        long[] jArr = (long[]) this.f2175e;
        if (i3 >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i3 + 1, jArr.length * 2));
            this.f2175e = jArr;
        }
        jArr[i3] = j;
        if (i3 >= this.f2174d) {
            this.f2174d = i3 + 1;
        }
    }

    public boolean b(long j) {
        int i3 = this.f2174d;
        for (int i10 = 0; i10 < i3; i10++) {
            if (((long[]) this.f2175e)[i10] == j) {
                return true;
            }
        }
        return false;
    }

    @Override // f8.y
    public /* synthetic */ ListenableFuture call() {
        return ((ra) this.f2175e).m(this.f2174d);
    }

    public void d(long j) {
        int i3 = this.f2174d;
        int i10 = 0;
        while (i10 < i3) {
            if (j == ((long[]) this.f2175e)[i10]) {
                int i11 = this.f2174d - 1;
                while (i10 < i11) {
                    long[] jArr = (long[]) this.f2175e;
                    int i12 = i10 + 1;
                    jArr[i10] = jArr[i12];
                    i10 = i12;
                }
                this.f2174d--;
                return;
            }
            i10++;
        }
    }
}
