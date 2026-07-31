package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class ye4 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f14637a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f14638b;

    public ye4() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f14637a = byteArrayOutputStream;
        this.f14638b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(xe4 xe4Var) {
        this.f14637a.reset();
        try {
            b(this.f14638b, xe4Var.f14186f);
            String str = xe4Var.f14187g;
            if (str == null) {
                str = "";
            }
            b(this.f14638b, str);
            this.f14638b.writeLong(xe4Var.f14188h);
            this.f14638b.writeLong(xe4Var.f14189i);
            this.f14638b.write(xe4Var.f14190j);
            this.f14638b.flush();
            return this.f14637a.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
