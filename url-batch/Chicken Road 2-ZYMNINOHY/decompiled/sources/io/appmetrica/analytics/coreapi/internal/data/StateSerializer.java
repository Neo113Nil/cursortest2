package io.appmetrica.analytics.coreapi.internal.data;

import java.io.IOException;

/* loaded from: classes.dex */
public interface StateSerializer<T> {
    T defaultValue();

    byte[] toByteArray(T t4);

    T toState(byte[] bArr) throws IOException;
}
