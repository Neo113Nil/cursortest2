package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.PxuCJdSBwIXG;
import kotlinx.serialization.json.TSizfFm2Yiuu;
import kotlinx.serialization.json.Y1f8riQaR6yg;
import kotlinx.serialization.json.lS5Rgt96tfkO;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class um {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public Object TSizfFm2Yiuu;
    public int lS5Rgt96tfkO;

    public um(int i, ArrayList arrayList) {
        this.PxuCJdSBwIXG = i;
        switch (i) {
            case 7:
                this.TSizfFm2Yiuu = arrayList;
                break;
            default:
                this.lS5Rgt96tfkO = 0;
                this.TSizfFm2Yiuu = arrayList;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object PxuCJdSBwIXG(um umVar, dw dwVar, nc ncVar) {
        cu0 cu0Var;
        int i;
        LinkedHashMap linkedHashMap;
        dw dwVar2;
        byte b;
        cb1 cb1Var;
        um umVar2;
        cb1 cb1Var2 = (cb1) umVar.TSizfFm2Yiuu;
        if (ncVar instanceof cu0) {
            cu0Var = (cu0) ncVar;
            int i2 = cu0Var.XL4ISE6Oc65B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cu0Var.XL4ISE6Oc65B = i2 - Integer.MIN_VALUE;
                Object obj = cu0Var.gPXPFXrUH4XX;
                i = cu0Var.XL4ISE6Oc65B;
                int i3 = 0;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    byte a92UlCVFR9N8 = cb1Var2.a92UlCVFR9N8((byte) 6);
                    if (cb1Var2.gPXPFXrUH4XX() == 4) {
                        cb1.x50lh2ztY7Y5(cb1Var2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                    dwVar2 = dwVar;
                    b = a92UlCVFR9N8;
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = cu0Var.QrzZRwfaDlRX;
                    String str = cu0Var.r3s1LDPKFs1S;
                    linkedHashMap = cu0Var.cpQdD2nAriOS;
                    umVar2 = cu0Var.x50lh2ztY7Y5;
                    dwVar2 = cu0Var.dgRBjINgWbAK;
                    ng0.tmVwIGCQF4zR(obj);
                    linkedHashMap.put(str, (lS5Rgt96tfkO) obj);
                    b = ((cb1) umVar2.TSizfFm2Yiuu).e9gEMXR7LXtO();
                    if (b != 4) {
                        if (b != 7) {
                            cb1.x50lh2ztY7Y5((cb1) umVar2.TSizfFm2Yiuu, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        cb1 cb1Var3 = (cb1) umVar2.TSizfFm2Yiuu;
                        if (b != 6) {
                            cb1Var3.a92UlCVFR9N8((byte) 7);
                        } else if (b == 4) {
                            vi0.ozEBbv0hFTAB(cb1Var3, "object");
                            throw null;
                        }
                        return new TSizfFm2Yiuu(linkedHashMap);
                    }
                    i3 = i4;
                    umVar = umVar2;
                }
                cb1Var = (cb1) umVar.TSizfFm2Yiuu;
                if (cb1Var.lS5Rgt96tfkO()) {
                    umVar2 = umVar;
                    cb1 cb1Var32 = (cb1) umVar2.TSizfFm2Yiuu;
                    if (b != 6) {
                    }
                    return new TSizfFm2Yiuu(linkedHashMap);
                }
                String OPXfSBeufaJ8 = cb1Var.OPXfSBeufaJ8();
                cb1Var.a92UlCVFR9N8((byte) 5);
                cu0Var.dgRBjINgWbAK = dwVar2;
                cu0Var.x50lh2ztY7Y5 = umVar;
                cu0Var.cpQdD2nAriOS = linkedHashMap;
                cu0Var.r3s1LDPKFs1S = OPXfSBeufaJ8;
                cu0Var.QrzZRwfaDlRX = i3;
                cu0Var.XL4ISE6Oc65B = 1;
                dwVar2.getClass();
                dwVar2.OPXfSBeufaJ8 = cu0Var;
                return su.rtx2ld2ELZv4;
            }
        }
        cu0Var = new cu0(umVar, ncVar);
        Object obj2 = cu0Var.gPXPFXrUH4XX;
        i = cu0Var.XL4ISE6Oc65B;
        int i32 = 0;
        if (i != 0) {
        }
        cb1Var = (cb1) umVar.TSizfFm2Yiuu;
        if (cb1Var.lS5Rgt96tfkO()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static um Y1f8riQaR6yg(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        int i2;
        float f2;
        float f3;
        Object radialGradient;
        int i3;
        TypedArray obtainStyledAttributes;
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
        int i4 = 0;
        Object obj = null;
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                return new um(xl.lS5Rgt96tfkO(resources, xml, asAttributeSet, theme).getDefaultColor(), i4, obj);
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        int[] iArr = rr1.e9gEMXR7LXtO;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(asAttributeSet, iArr) : theme.obtainStyledAttributes(asAttributeSet, iArr, 0, 0);
        float f4 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null ? obtainAttributes.getFloat(8, 0.0f) : 0.0f;
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? obtainAttributes.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? obtainAttributes.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? obtainAttributes.getFloat(11, 0.0f) : 0.0f;
        float f8 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null ? obtainAttributes.getFloat(3, 0.0f) : 0.0f;
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? obtainAttributes.getFloat(4, 0.0f) : 0.0f;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null ? obtainAttributes.getInt(2, 0) : 0;
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? obtainAttributes.getColor(0, 0) : 0;
        boolean z = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? obtainAttributes.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? obtainAttributes.getColor(1, 0) : 0;
        if (xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) {
            f = f4;
            i2 = obtainAttributes.getInt(6, 0);
        } else {
            f = f4;
            i2 = 0;
        }
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? obtainAttributes.getFloat(5, 0.0f) : 0.0f;
        obtainAttributes.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f2 = f5;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                int[] iArr2 = rr1.a92UlCVFR9N8;
                if (theme == null) {
                    obtainStyledAttributes = resources.obtainAttributes(asAttributeSet, iArr2);
                    i3 = 0;
                } else {
                    i3 = 0;
                    obtainStyledAttributes = theme.obtainStyledAttributes(asAttributeSet, iArr2, 0, 0);
                }
                boolean hasValue = obtainStyledAttributes.hasValue(i3);
                boolean hasValue2 = obtainStyledAttributes.hasValue(1);
                if (!hasValue || !hasValue2) {
                    break;
                }
                int color4 = obtainStyledAttributes.getColor(0, 0);
                float f12 = obtainStyledAttributes.getFloat(1, 0.0f);
                obtainStyledAttributes.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f5 = f2;
            f6 = f3;
        }
        nh nhVar = arrayList2.size() > 0 ? new nh(arrayList2, arrayList) : null;
        if (nhVar == null) {
            nhVar = z ? new nh(color, color2, color3) : new nh(color, color3);
        }
        if (i5 != 1) {
            if (i5 != 2) {
                radialGradient = new LinearGradient(f, f2, f3, f7, nhVar.PxuCJdSBwIXG, nhVar.lS5Rgt96tfkO, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
            } else {
                radialGradient = new SweepGradient(f8, f9, nhVar.PxuCJdSBwIXG, nhVar.lS5Rgt96tfkO);
            }
        } else {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            radialGradient = new RadialGradient(f8, f9, f11, nhVar.PxuCJdSBwIXG, nhVar.lS5Rgt96tfkO, i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT);
        }
        int i6 = 0;
        return new um(i6, i6, radialGradient);
    }

    public Y1f8riQaR6yg OPXfSBeufaJ8(boolean z) {
        cb1 cb1Var = (cb1) this.TSizfFm2Yiuu;
        String wdg6QnbFHrFF = !z ? cb1Var.wdg6QnbFHrFF() : cb1Var.OPXfSBeufaJ8();
        return (z || !cs0.wdg6QnbFHrFF(wdg6QnbFHrFF, "null")) ? new ut0(wdg6QnbFHrFF, z) : JsonNull.INSTANCE;
    }

    public lS5Rgt96tfkO RAsUl2FVSrh6() {
        lS5Rgt96tfkO tSizfFm2Yiuu;
        Object obj;
        cb1 cb1Var = (cb1) this.TSizfFm2Yiuu;
        byte gPXPFXrUH4XX = cb1Var.gPXPFXrUH4XX();
        if (gPXPFXrUH4XX == 1) {
            return OPXfSBeufaJ8(true);
        }
        if (gPXPFXrUH4XX == 0) {
            return OPXfSBeufaJ8(false);
        }
        if (gPXPFXrUH4XX != 6) {
            if (gPXPFXrUH4XX == 8) {
                return rtx2ld2ELZv4();
            }
            cb1.x50lh2ztY7Y5(cb1Var, "Cannot read Json element because of unexpected ".concat(mm2.D0aTLcX6Uhyo(gPXPFXrUH4XX)), 0, null, 6);
            throw null;
        }
        int i = this.lS5Rgt96tfkO + 1;
        this.lS5Rgt96tfkO = i;
        if (i == 200) {
            bu0 bu0Var = new bu0(this, null);
            dw dwVar = new dw();
            dwVar.rtx2ld2ELZv4 = bu0Var;
            dwVar.OPXfSBeufaJ8 = dwVar;
            su suVar = f2.rtx2ld2ELZv4;
            dwVar.wdg6QnbFHrFF = suVar;
            while (true) {
                obj = dwVar.wdg6QnbFHrFF;
                bt btVar = dwVar.OPXfSBeufaJ8;
                if (btVar == null) {
                    break;
                }
                if (cs0.wdg6QnbFHrFF(suVar, obj)) {
                    try {
                        bu0 bu0Var2 = dwVar.rtx2ld2ELZv4;
                        mm2.S9EYkSpbGuxq(3, bu0Var2);
                        bu0 bu0Var3 = new bu0(bu0Var2.x50lh2ztY7Y5, btVar);
                        bu0Var3.dgRBjINgWbAK = dwVar;
                        Object RfyTYNmI9Srp = bu0Var3.RfyTYNmI9Srp(no2.PxuCJdSBwIXG);
                        if (RfyTYNmI9Srp != su.rtx2ld2ELZv4) {
                            btVar.RAsUl2FVSrh6(RfyTYNmI9Srp);
                        }
                    } catch (Throwable th) {
                        btVar.RAsUl2FVSrh6(new uv1(th));
                    }
                } else {
                    dwVar.wdg6QnbFHrFF = suVar;
                    btVar.RAsUl2FVSrh6(obj);
                }
            }
            ng0.tmVwIGCQF4zR(obj);
            tSizfFm2Yiuu = (lS5Rgt96tfkO) obj;
        } else {
            byte a92UlCVFR9N8 = cb1Var.a92UlCVFR9N8((byte) 6);
            if (cb1Var.gPXPFXrUH4XX() == 4) {
                cb1.x50lh2ztY7Y5(cb1Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!cb1Var.lS5Rgt96tfkO()) {
                    break;
                }
                String OPXfSBeufaJ8 = cb1Var.OPXfSBeufaJ8();
                cb1Var.a92UlCVFR9N8((byte) 5);
                linkedHashMap.put(OPXfSBeufaJ8, RAsUl2FVSrh6());
                a92UlCVFR9N8 = cb1Var.e9gEMXR7LXtO();
                if (a92UlCVFR9N8 != 4) {
                    if (a92UlCVFR9N8 != 7) {
                        cb1.x50lh2ztY7Y5(cb1Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (a92UlCVFR9N8 == 6) {
                cb1Var.a92UlCVFR9N8((byte) 7);
            } else if (a92UlCVFR9N8 == 4) {
                vi0.ozEBbv0hFTAB(cb1Var, "object");
                throw null;
            }
            tSizfFm2Yiuu = new TSizfFm2Yiuu(linkedHashMap);
        }
        this.lS5Rgt96tfkO--;
        return tSizfFm2Yiuu;
    }

    public boolean TSizfFm2Yiuu(long j) {
        int i = this.lS5Rgt96tfkO;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.TSizfFm2Yiuu)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public void a92UlCVFR9N8(int i, xa xaVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            xa xaVar2 = ((xa[]) this.TSizfFm2Yiuu)[i2];
            xaVar2.getClass();
            if (cs0.BRwzKIf41E4i(0L, xaVar.RAsUl2FVSrh6 - xaVar2.RAsUl2FVSrh6) <= 0) {
                break;
            }
            xaVar2.a92UlCVFR9N8 = i;
            ((xa[]) this.TSizfFm2Yiuu)[i] = xaVar2;
            i = i2;
        }
        ((xa[]) this.TSizfFm2Yiuu)[i] = xaVar;
        xaVar.a92UlCVFR9N8 = i;
    }

    public void cpQdD2nAriOS(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        e9gEMXR7LXtO(this.lS5Rgt96tfkO, length);
        str.getChars(0, str.length(), (char[]) this.TSizfFm2Yiuu, this.lS5Rgt96tfkO);
        this.lS5Rgt96tfkO += length;
    }

    public void dgRBjINgWbAK(long j) {
        int i = this.lS5Rgt96tfkO;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.TSizfFm2Yiuu)[i2]) {
                int i3 = this.lS5Rgt96tfkO - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.TSizfFm2Yiuu;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.lS5Rgt96tfkO--;
                return;
            }
            i2++;
        }
    }

    public void e9gEMXR7LXtO(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.TSizfFm2Yiuu;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.TSizfFm2Yiuu = Arrays.copyOf(cArr, i3);
        }
    }

    public void lS5Rgt96tfkO(long j) {
        if (TSizfFm2Yiuu(j)) {
            return;
        }
        int i = this.lS5Rgt96tfkO;
        long[] jArr = (long[]) this.TSizfFm2Yiuu;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.TSizfFm2Yiuu = jArr;
        }
        jArr[i] = j;
        if (i >= this.lS5Rgt96tfkO) {
            this.lS5Rgt96tfkO = i + 1;
        }
    }

    public PxuCJdSBwIXG rtx2ld2ELZv4() {
        cb1 cb1Var = (cb1) this.TSizfFm2Yiuu;
        byte e9gEMXR7LXtO = cb1Var.e9gEMXR7LXtO();
        if (cb1Var.gPXPFXrUH4XX() == 4) {
            cb1.x50lh2ztY7Y5(cb1Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (cb1Var.lS5Rgt96tfkO()) {
            arrayList.add(RAsUl2FVSrh6());
            e9gEMXR7LXtO = cb1Var.e9gEMXR7LXtO();
            if (e9gEMXR7LXtO != 4) {
                boolean z = e9gEMXR7LXtO == 9;
                int i = cb1Var.lS5Rgt96tfkO;
                if (!z) {
                    cb1.x50lh2ztY7Y5(cb1Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (e9gEMXR7LXtO == 8) {
            cb1Var.a92UlCVFR9N8((byte) 9);
        } else if (e9gEMXR7LXtO == 4) {
            vi0.ozEBbv0hFTAB(cb1Var, "array");
            throw null;
        }
        return new PxuCJdSBwIXG(arrayList);
    }

    public String toString() {
        switch (this.PxuCJdSBwIXG) {
            case 2:
                return new String((char[]) this.TSizfFm2Yiuu, 0, this.lS5Rgt96tfkO);
            default:
                return super.toString();
        }
    }

    public void wdg6QnbFHrFF() {
        jj jjVar = jj.TSizfFm2Yiuu;
        char[] cArr = (char[]) this.TSizfFm2Yiuu;
        jjVar.getClass();
        cArr.getClass();
        synchronized (jjVar) {
            int i = jjVar.lS5Rgt96tfkO;
            if (cArr.length + i < la.PxuCJdSBwIXG) {
                jjVar.lS5Rgt96tfkO = i + cArr.length;
                jjVar.PxuCJdSBwIXG.addLast(cArr);
            }
        }
    }

    public void x50lh2ztY7Y5(xa xaVar) {
        xa xaVar2;
        int i = xaVar.a92UlCVFR9N8;
        if (i == -1) {
            u9.XL4ISE6Oc65B("Failed requirement.");
            return;
        }
        int i2 = this.lS5Rgt96tfkO;
        xa xaVar3 = ((xa[]) this.TSizfFm2Yiuu)[i2];
        xaVar3.getClass();
        xaVar.a92UlCVFR9N8 = -1;
        ((xa[]) this.TSizfFm2Yiuu)[i2] = null;
        this.lS5Rgt96tfkO = i2 - 1;
        if (xaVar == xaVar3) {
            return;
        }
        int BRwzKIf41E4i = cs0.BRwzKIf41E4i(0L, xaVar3.RAsUl2FVSrh6 - xaVar.RAsUl2FVSrh6);
        if (BRwzKIf41E4i == 0) {
            ((xa[]) this.TSizfFm2Yiuu)[i] = xaVar3;
            xaVar3.a92UlCVFR9N8 = i;
            return;
        }
        if (BRwzKIf41E4i >= 0) {
            a92UlCVFR9N8(i, xaVar3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.lS5Rgt96tfkO;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                xaVar2 = ((xa[]) this.TSizfFm2Yiuu)[i3];
                xaVar2.getClass();
            } else {
                xaVar2 = ((xa[]) this.TSizfFm2Yiuu)[i3];
                xaVar2.getClass();
                xa xaVar4 = ((xa[]) this.TSizfFm2Yiuu)[i4];
                xaVar4.getClass();
                if (cs0.BRwzKIf41E4i(0L, xaVar4.RAsUl2FVSrh6 - xaVar2.RAsUl2FVSrh6) >= 0) {
                    xaVar2 = xaVar4;
                }
            }
            if (cs0.BRwzKIf41E4i(0L, xaVar2.RAsUl2FVSrh6 - xaVar3.RAsUl2FVSrh6) <= 0) {
                break;
            }
            int i6 = xaVar2.a92UlCVFR9N8;
            xaVar2.a92UlCVFR9N8 = i;
            ((xa[]) this.TSizfFm2Yiuu)[i] = xaVar2;
            i = i6;
        }
        ((xa[]) this.TSizfFm2Yiuu)[i] = xaVar3;
        xaVar3.a92UlCVFR9N8 = i;
    }

    public /* synthetic */ um(int i, int i2, Object obj) {
        this.PxuCJdSBwIXG = i2;
        this.TSizfFm2Yiuu = obj;
        this.lS5Rgt96tfkO = i;
    }

    public um(xq xqVar, int i) {
        this.PxuCJdSBwIXG = 9;
        jh0.x50lh2ztY7Y5(xqVar);
        this.TSizfFm2Yiuu = xqVar;
        this.lS5Rgt96tfkO = i;
    }

    public um(lt0 lt0Var, cb1 cb1Var) {
        this.PxuCJdSBwIXG = 3;
        this.TSizfFm2Yiuu = cb1Var;
    }

    public um() {
        this.PxuCJdSBwIXG = 1;
        this.lS5Rgt96tfkO = 1;
        this.TSizfFm2Yiuu = Collections.singletonList(null);
    }

    public /* synthetic */ um(int i) {
        this.PxuCJdSBwIXG = i;
    }
}
