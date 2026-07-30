package com.google.android.gms.internal.ads;

import java.io.IOException;
import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public class W4 extends IOException {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28364n;

    /* renamed from: u, reason: collision with root package name */
    public final int f28365u;

    public W4(String str, RuntimeException runtimeException, boolean z8, int i) {
        super(str, runtimeException);
        this.f28364n = z8;
        this.f28365u = i;
    }

    public static W4 a(RuntimeException runtimeException, String str) {
        return new W4(str, runtimeException, true, 1);
    }

    public static W4 c(String str) {
        return new W4(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : "";
        int length = concat.length();
        boolean z8 = this.f28364n;
        int length2 = String.valueOf(z8).length() + length + 20;
        int i = this.f28365u;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z8);
        sb.append(", dataType=");
        return AbstractC5051n.e(i, "}", sb);
    }
}
