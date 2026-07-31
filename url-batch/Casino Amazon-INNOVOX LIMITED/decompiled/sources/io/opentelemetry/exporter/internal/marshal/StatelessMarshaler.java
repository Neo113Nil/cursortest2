package io.opentelemetry.exporter.internal.marshal;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface StatelessMarshaler<T> {
    int getBinarySerializedSize(T t, MarshalerContext marshalerContext);

    void writeTo(Serializer serializer, T t, MarshalerContext marshalerContext) throws IOException;
}
