package com.google.android.recaptcha.internal;

import android.content.Context;
import f2.i;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) {
        return i.c(file);
    }

    public static final void zzb(File file, byte[] bArr) {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        i.f(file, bArr);
    }
}
