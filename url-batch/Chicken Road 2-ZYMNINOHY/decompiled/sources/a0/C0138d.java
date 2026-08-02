package a0;

import E.AbstractC0005f;
import T.C0097o;
import a.AbstractC0124a;
import android.text.TextUtils;

/* renamed from: a0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138d {

    /* renamed from: a, reason: collision with root package name */
    public final String f4080a;

    /* renamed from: b, reason: collision with root package name */
    public final C0097o f4081b;

    /* renamed from: c, reason: collision with root package name */
    public final C0097o f4082c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4083d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4084e;

    public C0138d(String str, C0097o c0097o, C0097o c0097o2, int i4, int i5) {
        AbstractC0124a.h(i4 == 0 || i5 == 0);
        AbstractC0124a.h(true ^ TextUtils.isEmpty(str));
        this.f4080a = str;
        c0097o.getClass();
        this.f4081b = c0097o;
        c0097o2.getClass();
        this.f4082c = c0097o2;
        this.f4083d = i4;
        this.f4084e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0138d.class == obj.getClass()) {
            C0138d c0138d = (C0138d) obj;
            if (this.f4083d == c0138d.f4083d && this.f4084e == c0138d.f4084e && this.f4080a.equals(c0138d.f4080a) && this.f4081b.equals(c0138d.f4081b) && this.f4082c.equals(c0138d.f4082c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4082c.hashCode() + ((this.f4081b.hashCode() + AbstractC0005f.f((((527 + this.f4083d) * 31) + this.f4084e) * 31, 31, this.f4080a)) * 31);
    }
}
