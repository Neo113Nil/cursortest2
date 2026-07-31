package i0;

import A.k;
import B.Y;
import K2.m;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.TypedValue;
import f2.j;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlResourceParser f6237a;

    /* renamed from: b, reason: collision with root package name */
    public int f6238b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Y f6239c;

    public C0515a(XmlResourceParser xmlResourceParser) {
        this.f6237a = xmlResourceParser;
        Y y3 = new Y();
        y3.f334d = new float[64];
        this.f6239c = y3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r7 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(TypedArray typedArray, Resources.Theme theme, String str, int i3) {
        m mVar;
        if (W0.b.a(this.f6237a, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i3, typedValue);
            int i4 = typedValue.type;
            if (i4 < 28 || i4 > 31) {
                try {
                    mVar = m.c(typedArray.getResources(), typedArray.getResourceId(i3, 0), theme);
                } catch (Exception e3) {
                    Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e3);
                    mVar = null;
                }
            } else {
                mVar = new m(typedValue.data, 2, null);
            }
            c(typedArray.getChangingConfigurations());
            return mVar;
        }
        mVar = new m(0, 2, null);
        c(typedArray.getChangingConfigurations());
        return mVar;
    }

    public final float b(TypedArray typedArray, String str, int i3, float f3) {
        if (W0.b.a(this.f6237a, str)) {
            f3 = typedArray.getFloat(i3, f3);
        }
        c(typedArray.getChangingConfigurations());
        return f3;
    }

    public final void c(int i3) {
        this.f6238b = i3 | this.f6238b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0515a)) {
            return false;
        }
        C0515a c0515a = (C0515a) obj;
        return j.a(this.f6237a, c0515a.f6237a) && this.f6238b == c0515a.f6238b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6238b) + (this.f6237a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f6237a);
        sb.append(", config=");
        return k.j(sb, this.f6238b, ')');
    }
}
