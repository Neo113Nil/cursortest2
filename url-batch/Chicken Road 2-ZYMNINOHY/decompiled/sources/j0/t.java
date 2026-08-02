package j0;

import E.AbstractC0005f;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final String f13853a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13854b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13855c;

    public t(String str, boolean z, boolean z4) {
        this.f13853a = str;
        this.f13854b = z;
        this.f13855c = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == t.class) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f13853a, tVar.f13853a) && this.f13854b == tVar.f13854b && this.f13855c == tVar.f13855c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC0005f.f(31, 31, this.f13853a) + (this.f13854b ? 1231 : 1237)) * 31) + (this.f13855c ? 1231 : 1237);
    }
}
