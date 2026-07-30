package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.Tp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2800Tp {

    /* renamed from: a, reason: collision with root package name */
    public final String f27838a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27839b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f27840c;

    public C2800Tp(String str, String str2, Drawable drawable) {
        this.f27838a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f27839b = str2;
        this.f27840c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2800Tp) {
            C2800Tp c2800Tp = (C2800Tp) obj;
            String str = this.f27838a;
            if (str != null ? str.equals(c2800Tp.f27838a) : c2800Tp.f27838a == null) {
                if (this.f27839b.equals(c2800Tp.f27839b)) {
                    Drawable drawable = c2800Tp.f27840c;
                    Drawable drawable2 = this.f27840c;
                    if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f27838a;
        int hashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f27839b.hashCode();
        Drawable drawable = this.f27840c;
        return (drawable != null ? drawable.hashCode() : 0) ^ (hashCode * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27840c);
        String str = this.f27838a;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        String str2 = this.f27839b;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        AbstractC5051n.j(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return D.y.o(sb, ", icon=", valueOf, "}");
    }
}
