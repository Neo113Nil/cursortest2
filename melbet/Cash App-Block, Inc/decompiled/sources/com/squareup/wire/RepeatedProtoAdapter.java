package com.squareup.wire;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final class RepeatedProtoAdapter extends ProtoAdapter {
    public final ProtoAdapter originalAdapter;

    public RepeatedProtoAdapter(ProtoAdapter protoAdapter) {
        super(protoAdapter.getFieldEncoding$wire_runtime(), Reflection.factory.getOrCreateKotlinClass(List.class), (String) null, protoAdapter.getSyntax(), EmptyList.INSTANCE, 32);
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return CollectionsKt__CollectionsJVMKt.listOf(this.originalAdapter.decode(protoReader32));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        reverseProtoWriter.getClass();
        ((List) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        List list = (List) obj;
        reverseProtoWriter.getClass();
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.originalAdapter.encodeWithTag(reverseProtoWriter, i, list.get(size));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ((List) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += this.originalAdapter.encodedSizeWithTag(i, list.get(i3));
        }
        return i2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((List) obj).getClass();
        return EmptyList.INSTANCE;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        return CollectionsKt__CollectionsJVMKt.listOf(this.originalAdapter.decode(protoReader));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ((List) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        List list = (List) obj;
        protoWriter.getClass();
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.originalAdapter.encodeWithTag(protoWriter, i, list.get(i2));
        }
    }
}
