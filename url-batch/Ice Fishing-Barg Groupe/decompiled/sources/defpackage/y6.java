package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class y6 {
    public final XmlPullParser PxuCJdSBwIXG;
    public final i2 TSizfFm2Yiuu;
    public int lS5Rgt96tfkO = 0;

    public y6(XmlResourceParser xmlResourceParser) {
        this.PxuCJdSBwIXG = xmlResourceParser;
        i2 i2Var = new i2(20, (char) 0);
        i2Var.OPXfSBeufaJ8 = new float[64];
        this.TSizfFm2Yiuu = i2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final um PxuCJdSBwIXG(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        um umVar;
        if (ni0.jyegZNwi31qc(this.PxuCJdSBwIXG, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    umVar = um.Y1f8riQaR6yg(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    umVar = null;
                }
            } else {
                umVar = new um(typedValue.data, 0, null);
            }
            TSizfFm2Yiuu(typedArray.getChangingConfigurations());
            return umVar;
        }
        umVar = new um(0, 0, null);
        TSizfFm2Yiuu(typedArray.getChangingConfigurations());
        return umVar;
    }

    public final void TSizfFm2Yiuu(int i) {
        this.lS5Rgt96tfkO = i | this.lS5Rgt96tfkO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6)) {
            return false;
        }
        y6 y6Var = (y6) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, y6Var.PxuCJdSBwIXG) && this.lS5Rgt96tfkO == y6Var.lS5Rgt96tfkO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.lS5Rgt96tfkO) + (this.PxuCJdSBwIXG.hashCode() * 31);
    }

    public final float lS5Rgt96tfkO(TypedArray typedArray, String str, int i, float f) {
        if (ni0.jyegZNwi31qc(this.PxuCJdSBwIXG, str)) {
            f = typedArray.getFloat(i, f);
        }
        TSizfFm2Yiuu(typedArray.getChangingConfigurations());
        return f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.PxuCJdSBwIXG);
        sb.append(", config=");
        return o0.r3s1LDPKFs1S(sb, this.lS5Rgt96tfkO, ')');
    }
}
