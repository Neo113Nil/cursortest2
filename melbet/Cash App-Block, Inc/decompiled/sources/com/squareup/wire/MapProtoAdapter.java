package com.squareup.wire;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes8.dex */
public final class MapProtoAdapter extends ProtoAdapter {
    public final MapEntryProtoAdapter entryAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MapProtoAdapter(ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2) {
        super(r1, r2, (String) null, r4, r5, 32);
        protoAdapter.getClass();
        protoAdapter2.getClass();
        FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Map.class);
        Syntax syntax = protoAdapter2.getSyntax();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.entryAdapter = new MapEntryProtoAdapter(protoAdapter, protoAdapter2);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader32 protoReader32) {
        protoReader32.getClass();
        MapEntryProtoAdapter mapEntryProtoAdapter = this.entryAdapter;
        Object identity = mapEntryProtoAdapter.keyAdapter.getIdentity();
        ProtoAdapter protoAdapter = mapEntryProtoAdapter.valueAdapter;
        Object identity2 = protoAdapter.getIdentity();
        ByteArrayProtoReader32 byteArrayProtoReader32 = (ByteArrayProtoReader32) protoReader32;
        int beginMessage = byteArrayProtoReader32.beginMessage();
        while (true) {
            int nextTag = byteArrayProtoReader32.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = mapEntryProtoAdapter.keyAdapter.decode(byteArrayProtoReader32);
            } else if (nextTag == 2) {
                identity2 = protoAdapter.decode(byteArrayProtoReader32);
            }
        }
        byteArrayProtoReader32.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return MapsKt__MapsJVMKt.mapOf(new Pair(identity, identity2));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Map entry with null value");
        return null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        reverseProtoWriter.getClass();
        ((Map) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ReverseProtoWriter reverseProtoWriter, int i, Object obj) {
        Map map = (Map) obj;
        reverseProtoWriter.getClass();
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        ArraysKt___ArraysKt.reverse(entryArr);
        for (Map.Entry entry : entryArr) {
            this.entryAdapter.encodeWithTag(reverseProtoWriter, i, entry);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ((Map) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSizeWithTag(int i, Object obj) {
        Map map = (Map) obj;
        int i2 = 0;
        if (map == null) {
            return 0;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            i2 += this.entryAdapter.encodedSizeWithTag(i, (Map.Entry) it.next());
        }
        return i2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((Map) obj).getClass();
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ((Map) obj).getClass();
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encodeWithTag(ProtoWriter protoWriter, int i, Object obj) {
        Map map = (Map) obj;
        protoWriter.getClass();
        if (map == null) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.entryAdapter.encodeWithTag(protoWriter, i, (Map.Entry) it.next());
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        MapEntryProtoAdapter mapEntryProtoAdapter = this.entryAdapter;
        Object identity = mapEntryProtoAdapter.keyAdapter.getIdentity();
        ProtoAdapter protoAdapter = mapEntryProtoAdapter.valueAdapter;
        Object identity2 = protoAdapter.getIdentity();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                identity = mapEntryProtoAdapter.keyAdapter.decode(protoReader);
            } else if (nextTag == 2) {
                identity2 = protoAdapter.decode(protoReader);
            }
        }
        protoReader.endMessageAndGetUnknownFields(beginMessage);
        if (identity == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Map entry with null key");
            return null;
        }
        if (identity2 != null) {
            return MapsKt__MapsJVMKt.mapOf(new Pair(identity, identity2));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Map entry with null value");
        return null;
    }
}
