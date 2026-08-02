package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.SubmitBlockerResponse;
import com.squareup.protos.franklin.common.Profile;
import com.squareup.protos.franklin.common.SyncEntitiesResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SubmitBlockerResponse$AppResponseContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SubmitBlockerResponse.AppResponseContext((Profile) obj, (SyncEntitiesResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Profile.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SyncEntitiesResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SubmitBlockerResponse.AppResponseContext appResponseContext = (SubmitBlockerResponse.AppResponseContext) obj;
        reverseProtoWriter.getClass();
        appResponseContext.getClass();
        reverseProtoWriter.writeBytes(appResponseContext.unknownFields());
        SyncEntitiesResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, appResponseContext.sync_entities_data);
        Profile.ADAPTER.encodeWithTag(reverseProtoWriter, 1, appResponseContext.profile);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SubmitBlockerResponse.AppResponseContext appResponseContext = (SubmitBlockerResponse.AppResponseContext) obj;
        appResponseContext.getClass();
        return SyncEntitiesResponse.ADAPTER.encodedSizeWithTag(2, appResponseContext.sync_entities_data) + Profile.ADAPTER.encodedSizeWithTag(1, appResponseContext.profile) + appResponseContext.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SubmitBlockerResponse.AppResponseContext appResponseContext = (SubmitBlockerResponse.AppResponseContext) obj;
        appResponseContext.getClass();
        Profile profile = appResponseContext.profile;
        Profile profile2 = profile != null ? (Profile) Profile.ADAPTER.redact(profile) : null;
        SyncEntitiesResponse syncEntitiesResponse = appResponseContext.sync_entities_data;
        SyncEntitiesResponse syncEntitiesResponse2 = syncEntitiesResponse != null ? (SyncEntitiesResponse) SyncEntitiesResponse.ADAPTER.redact(syncEntitiesResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SubmitBlockerResponse.AppResponseContext(profile2, syncEntitiesResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SubmitBlockerResponse.AppResponseContext appResponseContext = (SubmitBlockerResponse.AppResponseContext) obj;
        appResponseContext.getClass();
        Profile.ADAPTER.encodeWithTag(protoWriter, 1, appResponseContext.profile);
        SyncEntitiesResponse.ADAPTER.encodeWithTag(protoWriter, 2, appResponseContext.sync_entities_data);
        protoWriter.writeBytes(appResponseContext.unknownFields());
    }
}
