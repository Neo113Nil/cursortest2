package com.explorestack.protobuf;

import java.util.List;

/* loaded from: classes5.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    ByteString getByteString(int i);

    Object getRaw(int i);

    List getUnderlyingElements();

    LazyStringList getUnmodifiableView();
}
