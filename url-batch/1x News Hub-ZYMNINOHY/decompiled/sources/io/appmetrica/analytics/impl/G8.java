package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes.dex */
public class G8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f6032a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f6033b;

    public G8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f6032a = stateSerializer;
        this.f6033b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f6032a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f6033b.encrypt(this.f6032a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f6032a.toState(this.f6033b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
