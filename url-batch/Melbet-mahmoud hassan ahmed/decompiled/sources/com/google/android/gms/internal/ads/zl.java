package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zl extends IOException {

    /* renamed from: f, reason: collision with root package name */
    public final vl f15180f;

    public zl(IOException iOException, vl vlVar, int i7) {
        super(iOException);
        this.f15180f = vlVar;
    }

    public zl(String str, vl vlVar, int i7) {
        super(str);
        this.f15180f = vlVar;
    }

    public zl(String str, IOException iOException, vl vlVar, int i7) {
        super(str, iOException);
        this.f15180f = vlVar;
    }
}
