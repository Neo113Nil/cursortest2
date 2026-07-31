package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
final class dp {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f4266a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f4267b = new Base64OutputStream(this.f4266a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        try {
            this.f4267b.close();
        } catch (IOException e7) {
            io0.e("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            try {
                this.f4266a.close();
                str = this.f4266a.toString();
            } catch (IOException e8) {
                io0.e("HashManager: Unable to convert to Base64.", e8);
                str = "";
            }
            return str;
        } finally {
            this.f4266a = null;
            this.f4267b = null;
        }
    }
}
