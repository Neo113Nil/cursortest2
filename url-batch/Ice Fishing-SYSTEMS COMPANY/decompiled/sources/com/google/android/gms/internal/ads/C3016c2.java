package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.c2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3016c2 extends Y1 {

    /* renamed from: b, reason: collision with root package name */
    public final String f29621b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f29622c;

    public C3016c2(String str, byte[] bArr) {
        super(com.anythink.basead.exoplayer.g.b.j.f7488a);
        this.f29621b = str;
        this.f29622c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3016c2.class == obj.getClass()) {
            C3016c2 c3016c2 = (C3016c2) obj;
            if (Objects.equals(this.f29621b, c3016c2.f29621b) && Arrays.equals(this.f29622c, c3016c2.f29622c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29622c) + ((this.f29621b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.Y1
    public final String toString() {
        String str = this.f28771a;
        int length = String.valueOf(str).length() + 8;
        String str2 = this.f29621b;
        return D.y.o(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
