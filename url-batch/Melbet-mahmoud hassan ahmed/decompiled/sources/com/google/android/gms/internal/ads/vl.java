package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class vl {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f13430a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13431b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13432c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13433d;

    public vl(Uri uri, byte[] bArr, long j7, long j8, long j9, String str, int i7) {
        jm.c(j7 >= 0);
        jm.c(j8 >= 0);
        jm.c(j9 > 0 || j9 == -1);
        this.f13430a = uri;
        this.f13431b = j7;
        this.f13432c = j8;
        this.f13433d = j9;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f13430a);
        String arrays = Arrays.toString((byte[]) null);
        long j7 = this.f13431b;
        long j8 = this.f13432c;
        long j9 = this.f13433d;
        StringBuilder sb = new StringBuilder(valueOf.length() + 93 + String.valueOf(arrays).length() + 4);
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", ");
        sb.append(j9);
        sb.append(", null, 0]");
        return sb.toString();
    }
}
