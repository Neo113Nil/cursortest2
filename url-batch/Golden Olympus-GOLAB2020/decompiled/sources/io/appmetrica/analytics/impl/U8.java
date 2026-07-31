package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class U8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f38351a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f38352b;

    public U8(@NonNull StateSerializer<Object> stateSerializer, @NonNull AESEncrypter aESEncrypter) {
        this.f38351a = stateSerializer;
        this.f38352b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object defaultValue() {
        return this.f38351a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final byte[] toByteArray(@NonNull Object obj) {
        try {
            return this.f38352b.encrypt(this.f38351a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    @NonNull
    public final Object toState(@NonNull byte[] bArr) {
        try {
            return this.f38351a.toState(this.f38352b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
