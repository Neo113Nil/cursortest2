package com.yandex.mobile.ads.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class q50 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f30675a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f30676b;

    public q50() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(UserVerificationMethods.USER_VERIFY_NONE);
        this.f30675a = byteArrayOutputStream;
        this.f30676b = new DataOutputStream(byteArrayOutputStream);
    }

    public final byte[] a(o50 o50Var) {
        this.f30675a.reset();
        try {
            DataOutputStream dataOutputStream = this.f30676b;
            dataOutputStream.writeBytes(o50Var.f29903b);
            dataOutputStream.writeByte(0);
            String str = o50Var.f29904c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = this.f30676b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            this.f30676b.writeLong(o50Var.f29905d);
            this.f30676b.writeLong(o50Var.f29906e);
            this.f30676b.write(o50Var.f29907f);
            this.f30676b.flush();
            return this.f30675a.toByteArray();
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }
}
