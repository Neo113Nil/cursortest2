package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgr extends zzgp {
    public final int zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzgr(int i, String str, IOException iOException, Map map, zzge zzgeVar, byte[] bArr) {
        super(r10.toString(), iOException, zzgeVar, 2004, 1);
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("Response code: ");
        sb.append(i);
        this.zzc = i;
    }
}
