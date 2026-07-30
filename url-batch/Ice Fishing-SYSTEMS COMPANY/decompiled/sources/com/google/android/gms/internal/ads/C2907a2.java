package com.google.android.gms.internal.ads;

import java.util.Objects;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.ads.a2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2907a2 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f29161c;

    /* renamed from: d, reason: collision with root package name */
    public final String f29162d;

    public C2907a2(String str, String str2, String str3) {
        super(com.anythink.basead.exoplayer.g.b.i.f7484a);
        this.f29160b = str;
        this.f29161c = str2;
        this.f29162d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2907a2.class == obj.getClass()) {
            C2907a2 c2907a2 = (C2907a2) obj;
            if (Objects.equals(this.f29161c, c2907a2.f29161c) && Objects.equals(this.f29160b, c2907a2.f29160b) && Objects.equals(this.f29162d, c2907a2.f29162d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f29162d.hashCode() + ((this.f29161c.hashCode() + ((this.f29160b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length() + 9;
        String str2 = this.f29160b;
        int a9 = AbstractC5051n.a(length, 14, str2);
        String str3 = this.f29161c;
        StringBuilder sb = new StringBuilder(str3.length() + a9);
        AbstractC5051n.j(sb, str, ": domain=", str2, ", description=");
        sb.append(str3);
        return sb.toString();
    }
}
