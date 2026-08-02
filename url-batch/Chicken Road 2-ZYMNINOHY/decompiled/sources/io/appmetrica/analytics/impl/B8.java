package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.StateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.IOException;

/* loaded from: classes.dex */
public class B8 implements StateSerializer {

    /* renamed from: a, reason: collision with root package name */
    public final StateSerializer f10092a;

    /* renamed from: b, reason: collision with root package name */
    public final AESEncrypter f10093b;

    public B8(StateSerializer<Object> stateSerializer, AESEncrypter aESEncrypter) {
        this.f10092a = stateSerializer;
        this.f10093b = aESEncrypter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return this.f10092a.defaultValue();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        try {
            return this.f10093b.encrypt(this.f10092a.toByteArray(obj));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object toState(byte[] bArr) throws IOException {
        try {
            return this.f10092a.toState(this.f10093b.decrypt(bArr));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
