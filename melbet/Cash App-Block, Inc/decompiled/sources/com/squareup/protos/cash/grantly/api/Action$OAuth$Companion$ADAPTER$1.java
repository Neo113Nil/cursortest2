package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashoauth.apiProto.Scope;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth(m, (Action.OAuth.Metadata) obj, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    Action.OAuth.Permission.ADAPTER.tryDecode(protoReader, m);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Action.OAuth.Metadata.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    Scope.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth oAuth = (Action.OAuth) obj;
        reverseProtoWriter.getClass();
        oAuth.getClass();
        reverseProtoWriter.writeBytes(oAuth.unknownFields());
        Scope.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, oAuth.scopes_requested);
        Action.OAuth.Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 2, oAuth.metadata);
        Action.OAuth.Permission.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, oAuth.permissions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth oAuth = (Action.OAuth) obj;
        oAuth.getClass();
        return Scope.ADAPTER.asRepeated().encodedSizeWithTag(3, oAuth.scopes_requested) + Action.OAuth.Metadata.ADAPTER.encodedSizeWithTag(2, oAuth.metadata) + Action.OAuth.Permission.ADAPTER.asRepeated().encodedSizeWithTag(1, oAuth.permissions) + oAuth.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth oAuth = (Action.OAuth) obj;
        oAuth.getClass();
        Action.OAuth.Metadata metadata = oAuth.metadata;
        Action.OAuth.Metadata metadata2 = metadata != null ? (Action.OAuth.Metadata) Action.OAuth.Metadata.ADAPTER.redact(metadata) : null;
        ByteString byteString = ByteString.EMPTY;
        List list = oAuth.permissions;
        List list2 = oAuth.scopes_requested;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new Action.OAuth(list, metadata2, list2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth oAuth = (Action.OAuth) obj;
        oAuth.getClass();
        Action.OAuth.Permission.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, oAuth.permissions);
        Action.OAuth.Metadata.ADAPTER.encodeWithTag(protoWriter, 2, oAuth.metadata);
        Scope.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, oAuth.scopes_requested);
        protoWriter.writeBytes(oAuth.unknownFields());
    }
}
