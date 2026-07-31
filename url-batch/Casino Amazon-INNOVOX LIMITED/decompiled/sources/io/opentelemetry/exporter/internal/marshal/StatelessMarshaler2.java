package io.opentelemetry.exporter.internal.marshal;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface StatelessMarshaler2<K, V> {
    int getBinarySerializedSize(K k, V v, MarshalerContext marshalerContext);

    void writeTo(Serializer serializer, K k, V v, MarshalerContext marshalerContext) throws IOException;
}
