package com.explorestack.protobuf;

/* loaded from: classes15.dex */
interface Schema {
    int getSerializedSize(Object obj);

    void makeImmutable(Object obj);

    void mergeFrom(Object obj, Reader reader, ExtensionRegistryLite extensionRegistryLite);

    Object newInstance();
}
