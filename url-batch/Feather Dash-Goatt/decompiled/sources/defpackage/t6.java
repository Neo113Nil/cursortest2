package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class t6 {
    public final XmlPullParser a;
    public int b = 0;
    public final s2 c;

    public t6(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        s2 s2Var = new s2();
        s2Var.b = new float[64];
        this.c = s2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final jj a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        jj jjVar;
        if (t80.y(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    jjVar = jj.e(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    jjVar = null;
                }
            } else {
                jjVar = new jj(typedValue.data, (Object) null);
            }
            c(typedArray.getChangingConfigurations());
            return jjVar;
        }
        jjVar = new jj(0, (Object) null);
        c(typedArray.getChangingConfigurations());
        return jjVar;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (t80.y(this.a, str)) {
            f = typedArray.getFloat(i, f);
        }
        c(typedArray.getChangingConfigurations());
        return f;
    }

    public final void c(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return Intrinsics.a(this.a, t6Var.a) && this.b == t6Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return qy0.m(sb, this.b, ')');
    }
}
