package com.squareup.protos.cash.aegis.client_routes;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DependentDetailsEntryDialog$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DependentDetailsEntryDialog((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DependentDetailsEntryDialog dependentDetailsEntryDialog = (DependentDetailsEntryDialog) obj;
        reverseProtoWriter.getClass();
        dependentDetailsEntryDialog.getClass();
        reverseProtoWriter.writeBytes(dependentDetailsEntryDialog.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dependentDetailsEntryDialog.dark_img_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dependentDetailsEntryDialog.light_img_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dependentDetailsEntryDialog.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dependentDetailsEntryDialog.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DependentDetailsEntryDialog dependentDetailsEntryDialog = (DependentDetailsEntryDialog) obj;
        dependentDetailsEntryDialog.getClass();
        int size$okio = dependentDetailsEntryDialog.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, dependentDetailsEntryDialog.dark_img_url) + protoAdapter.encodedSizeWithTag(3, dependentDetailsEntryDialog.light_img_url) + protoAdapter.encodedSizeWithTag(2, dependentDetailsEntryDialog.subtitle) + protoAdapter.encodedSizeWithTag(1, dependentDetailsEntryDialog.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DependentDetailsEntryDialog dependentDetailsEntryDialog = (DependentDetailsEntryDialog) obj;
        dependentDetailsEntryDialog.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dependentDetailsEntryDialog.light_img_url;
        String str2 = dependentDetailsEntryDialog.dark_img_url;
        byteString.getClass();
        return new DependentDetailsEntryDialog(null, null, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DependentDetailsEntryDialog dependentDetailsEntryDialog = (DependentDetailsEntryDialog) obj;
        dependentDetailsEntryDialog.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dependentDetailsEntryDialog.title);
        protoAdapter.encodeWithTag(protoWriter, 2, dependentDetailsEntryDialog.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 3, dependentDetailsEntryDialog.light_img_url);
        protoAdapter.encodeWithTag(protoWriter, 4, dependentDetailsEntryDialog.dark_img_url);
        protoWriter.writeBytes(dependentDetailsEntryDialog.unknownFields());
    }
}
