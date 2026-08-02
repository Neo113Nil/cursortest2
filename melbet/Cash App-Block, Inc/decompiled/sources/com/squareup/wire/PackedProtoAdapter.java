package com.squareup.wire;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final class PackedProtoAdapter extends ProtoAdapter {
    public final ProtoAdapter originalAdapter;

    public PackedProtoAdapter(ProtoAdapter protoAdapter) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(List.class), (String) null, protoAdapter.getSyntax(), EmptyList.INSTANCE, 32);
        this.originalAdapter = protoAdapter;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        return CollectionsKt__CollectionsJVMKt.listOf(this.originalAdapter.decode(protoReader32));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        List list = (List) obj;
        reverseProtoWriter.getClass();
        list.getClass();
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.originalAdapter.encode(reverseProtoWriter, list.get(size));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        List list = (List) obj;
        protoWriter.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(protoWriter, i, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        List list = (List) obj;
        list.getClass();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.originalAdapter.encodedSize(list.get(i2));
        }
        return i;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i, list);
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
    public final void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        List list = (List) obj;
        reverseProtoWriter.getClass();
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(reverseProtoWriter, i, list);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        List list = (List) obj;
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.originalAdapter.encode(protoWriter, list.get(i));
        }
    }
}
