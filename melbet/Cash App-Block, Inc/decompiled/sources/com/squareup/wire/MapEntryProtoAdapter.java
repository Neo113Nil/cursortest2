package com.squareup.wire;

import java.util.Map;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public final class MapEntryProtoAdapter extends ProtoAdapter {
    public final ProtoAdapter keyAdapter;
    public final ProtoAdapter valueAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapEntryProtoAdapter(ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2) {
        super(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Map.Entry.class), (String) null, protoAdapter2.getSyntax(), (Object) null, 48);
        protoAdapter.getClass();
        protoAdapter2.getClass();
        this.keyAdapter = protoAdapter;
        this.valueAdapter = protoAdapter2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        reverseProtoWriter.getClass();
        entry.getClass();
        this.valueAdapter.encodeWithTag(reverseProtoWriter, 2, entry.getValue());
        this.keyAdapter.encodeWithTag(reverseProtoWriter, 1, entry.getKey());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        return this.valueAdapter.encodedSizeWithTag(2, entry.getValue()) + this.keyAdapter.encodedSizeWithTag(1, entry.getKey());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        this.keyAdapter.encodeWithTag(protoWriter, 1, entry.getKey());
        this.valueAdapter.encodeWithTag(protoWriter, 2, entry.getValue());
    }
}
