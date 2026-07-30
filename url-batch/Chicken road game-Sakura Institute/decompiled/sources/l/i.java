package l;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5524a;

    /* renamed from: b, reason: collision with root package name */
    public int f5525b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5526c;

    public /* synthetic */ i(int i7, int i8, Object obj) {
        this.f5524a = i8;
        this.f5526c = obj;
        this.f5525b = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e1, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i d(Resources resources, int i7, Resources.Theme theme) {
        int next;
        float f9;
        float f10;
        Object radialGradient;
        int i8;
        TypedArray obtainStyledAttributes;
        XmlResourceParser xml = resources.getXml(i7);
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
        int i9 = 6;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new i(u2.c.b(resources, xml, asAttributeSet, theme).getDefaultColor(), i9, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = r2.a.f7931b;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f11 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f13 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f14 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f15 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f16 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? obtainAttributes.getColor(1, 0) : 0;
        int i11 = 1;
        int i12 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? obtainAttributes.getInt(6, 0) : 0;
        float f17 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f18 = f17;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f9 = f11;
            if (next2 == i11) {
                f10 = f12;
                break;
            }
            int depth2 = xml.getDepth();
            f10 = f12;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = r2.a.f7932c;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i8 = 0;
                } else {
                    i8 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i8);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = obtainStyledAttributes.getColor(0, 0);
                float f19 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f19));
            }
            f11 = f9;
            f12 = f10;
            i11 = 1;
        }
        s1.z0 z0Var = arrayList2.size() > 0 ? new s1.z0(arrayList2, arrayList) : null;
        if (z0Var == null) {
            z0Var = z8 ? new s1.z0(color, color2, color3) : new s1.z0(color, color3);
        }
        if (i10 != 1) {
            if (i10 != 2) {
                radialGradient = new LinearGradient(f9, f10, f13, f14, z0Var.f8490a, z0Var.f8491b, i12 != 1 ? i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f15, f16, z0Var.f8490a, z0Var.f8491b);
            }
        } else {
            if (f18 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f15, f16, f18, z0Var.f8490a, z0Var.f8491b, i12 != 1 ? i12 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        return new i(0, 6, radialGradient);
    }

    public void a(long j8) {
        if (c(j8)) {
            return;
        }
        int i7 = this.f5525b;
        long[] jArr = (long[]) this.f5526c;
        if (i7 >= jArr.length) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i7 + 1, jArr.length * 2));
            r6.k.e(copyOf, "copyOf(this, newSize)");
            this.f5526c = copyOf;
        }
        ((long[]) this.f5526c)[i7] = j8;
        if (i7 >= this.f5525b) {
            this.f5525b = i7 + 1;
        }
    }

    public k0 b(Float f9, int i7) {
        k0 k0Var = new k0(f9, z.f5734c);
        ((i.p) this.f5526c).i(i7, k0Var);
        return k0Var;
    }

    public boolean c(long j8) {
        int i7 = this.f5525b;
        for (int i8 = 0; i8 < i7; i8++) {
            if (((long[]) this.f5526c)[i8] == j8) {
                return true;
            }
        }
        return false;
    }

    public void e(int i7, String str, String str2) {
        HashSet hashSet = (HashSet) this.f5526c;
        if (h.d(i7) >= h.d(this.f5525b)) {
            if (hashSet == null || h.d(i7) > 0 || hashSet.contains(str)) {
                int d8 = h.d(i7);
                if (d8 == 0) {
                    Log.d(str, str2);
                    return;
                }
                if (d8 == 1) {
                    Log.i(str, str2);
                } else if (d8 == 2) {
                    Log.w(str, str2);
                } else {
                    if (d8 != 3) {
                        throw new RuntimeException("Should not reach here!");
                    }
                    Log.e(str, str2);
                }
            }
        }
    }

    public void f(int i7) {
        int i8 = this.f5525b;
        if (i7 < i8) {
            int i9 = i8 - 1;
            while (i7 < i9) {
                long[] jArr = (long[]) this.f5526c;
                int i10 = i7 + 1;
                jArr[i7] = jArr[i10];
                i7 = i10;
            }
            this.f5525b--;
        }
    }

    public String toString() {
        switch (this.f5524a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
                int i7 = this.f5525b;
                sb.append(i7 != 1 ? i7 != 2 ? "null" : "Finished" : "BoundReached");
                sb.append(", endState=");
                sb.append((l) this.f5526c);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public i(j4.b bVar, int i7) {
        this.f5524a = 3;
        m4.o.d(bVar);
        this.f5526c = bVar;
        this.f5525b = i7;
    }

    public i(int i7) {
        this.f5524a = 5;
        this.f5526c = null;
        this.f5525b = i7;
    }

    public i(int i7, y2.b[] bVarArr) {
        this.f5524a = 7;
        this.f5525b = i7;
        this.f5526c = bVarArr;
    }

    public i(int i7, byte b9) {
        this.f5524a = i7;
        switch (i7) {
            case 4:
                break;
            default:
                this.f5525b = 300;
                i.p pVar = i.i.f4750a;
                this.f5526c = new i.p();
                break;
        }
    }
}
