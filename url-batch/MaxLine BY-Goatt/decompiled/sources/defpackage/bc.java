package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bc {
    public final XmlPullParser a;
    public int b = 0;
    public final r4 c;

    public bc(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        r4 r4Var = new r4();
        r4Var.b = new float[64];
        this.c = r4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r5 a(TypedArray typedArray, Resources.Theme theme, String str, int i) {
        r5 r5Var;
        if (ph2.h(this.a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 < 28 || i2 > 31) {
                try {
                    r5Var = r5.e(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
                } catch (Exception e) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                    r5Var = null;
                }
            } else {
                r5Var = new r5(typedValue.data, (Object) null);
            }
            c(typedArray.getChangingConfigurations());
            return r5Var;
        }
        r5Var = new r5(0, (Object) null);
        c(typedArray.getChangingConfigurations());
        return r5Var;
    }

    public final float b(TypedArray typedArray, String str, int i, float f) {
        if (ph2.h(this.a, str)) {
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
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        return Intrinsics.b(this.a, bcVar.a) && this.b == bcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return q40.o(sb, this.b, ')');
    }
}
