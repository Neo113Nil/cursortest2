package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class rp1 extends qo1 {

    /* renamed from: h, reason: collision with root package name */
    public final String f11313h;

    /* renamed from: i, reason: collision with root package name */
    public final Map<String, List<String>> f11314i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f11315j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rp1(int i7, String str, IOException iOException, Map<String, List<String>> map, li1 li1Var, byte[] bArr) {
        super(r0.toString(), iOException, li1Var, 2004, 1);
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i7);
        this.f11313h = str;
        this.f11314i = map;
        this.f11315j = bArr;
    }
}
