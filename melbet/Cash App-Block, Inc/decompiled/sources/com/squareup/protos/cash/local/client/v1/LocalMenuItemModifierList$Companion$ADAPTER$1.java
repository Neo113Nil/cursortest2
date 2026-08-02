package com.squareup.protos.cash.local.client.v1;

import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalMenuItemModifierList$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        zzit zzitVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalMenuItemModifierList((String) obj, (String) obj2, zzitVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                zzitVar = new LocalMenuItemModifierList$InputType$SelectFromList((LocalMenuItemModifierList.SelectFromList) LocalMenuItemModifierList.SelectFromList.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                zzitVar = new LocalMenuItemModifierList$InputType$FreeTextEntry((LocalMenuItemModifierList.FreeTextEntry) LocalMenuItemModifierList.FreeTextEntry.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalMenuItemModifierList localMenuItemModifierList = (LocalMenuItemModifierList) obj;
        reverseProtoWriter.getClass();
        localMenuItemModifierList.getClass();
        reverseProtoWriter.writeBytes(localMenuItemModifierList.unknownFields());
        zzit zzitVar = localMenuItemModifierList.input_type;
        if (zzitVar instanceof LocalMenuItemModifierList$InputType$SelectFromList) {
            LocalMenuItemModifierList.SelectFromList.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((LocalMenuItemModifierList$InputType$SelectFromList) zzitVar).value);
        } else if (zzitVar instanceof LocalMenuItemModifierList$InputType$FreeTextEntry) {
            LocalMenuItemModifierList.FreeTextEntry.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((LocalMenuItemModifierList$InputType$FreeTextEntry) zzitVar).value);
        } else if (zzitVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localMenuItemModifierList.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localMenuItemModifierList.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        LocalMenuItemModifierList localMenuItemModifierList = (LocalMenuItemModifierList) obj;
        localMenuItemModifierList.getClass();
        int size$okio = localMenuItemModifierList.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, localMenuItemModifierList.name) + protoAdapter.encodedSizeWithTag(1, localMenuItemModifierList.token) + size$okio;
        zzit zzitVar = localMenuItemModifierList.input_type;
        if (zzitVar instanceof LocalMenuItemModifierList$InputType$SelectFromList) {
            encodedSizeWithTag = LocalMenuItemModifierList.SelectFromList.ADAPTER.encodedSizeWithTag(3, ((LocalMenuItemModifierList$InputType$SelectFromList) zzitVar).value);
        } else {
            if (!(zzitVar instanceof LocalMenuItemModifierList$InputType$FreeTextEntry)) {
                if (zzitVar == null) {
                    return encodedSizeWithTag2;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = LocalMenuItemModifierList.FreeTextEntry.ADAPTER.encodedSizeWithTag(4, ((LocalMenuItemModifierList$InputType$FreeTextEntry) zzitVar).value);
        }
        return encodedSizeWithTag + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalMenuItemModifierList localMenuItemModifierList = (LocalMenuItemModifierList) obj;
        localMenuItemModifierList.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localMenuItemModifierList.token;
        String str2 = localMenuItemModifierList.name;
        zzit zzitVar = localMenuItemModifierList.input_type;
        byteString.getClass();
        return new LocalMenuItemModifierList(str, str2, zzitVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalMenuItemModifierList localMenuItemModifierList = (LocalMenuItemModifierList) obj;
        localMenuItemModifierList.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localMenuItemModifierList.token);
        protoAdapter.encodeWithTag(protoWriter, 2, localMenuItemModifierList.name);
        zzit zzitVar = localMenuItemModifierList.input_type;
        if (zzitVar instanceof LocalMenuItemModifierList$InputType$SelectFromList) {
            LocalMenuItemModifierList.SelectFromList.ADAPTER.encodeWithTag(protoWriter, 3, ((LocalMenuItemModifierList$InputType$SelectFromList) zzitVar).value);
        } else if (zzitVar instanceof LocalMenuItemModifierList$InputType$FreeTextEntry) {
            LocalMenuItemModifierList.FreeTextEntry.ADAPTER.encodeWithTag(protoWriter, 4, ((LocalMenuItemModifierList$InputType$FreeTextEntry) zzitVar).value);
        } else if (zzitVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(localMenuItemModifierList.unknownFields());
    }
}
