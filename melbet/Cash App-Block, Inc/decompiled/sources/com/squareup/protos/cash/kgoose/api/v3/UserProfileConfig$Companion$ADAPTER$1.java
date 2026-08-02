package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/UserProfileConfig$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/UserProfileConfig;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserProfileConfig$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UserProfileConfig(m, (Map) obj, (Model) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ExtensionConfig.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(ProtoAdapter.STRUCT_MAP, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Model.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UserProfileConfig userProfileConfig = (UserProfileConfig) obj;
        reverseProtoWriter.getClass();
        userProfileConfig.getClass();
        reverseProtoWriter.writeBytes(userProfileConfig.unknownFields());
        Model.ADAPTER.encodeWithTag(reverseProtoWriter, 3, userProfileConfig.preferred_model);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(reverseProtoWriter, 2, userProfileConfig.extra_args);
        ExtensionConfig.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, userProfileConfig.client_tools);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UserProfileConfig userProfileConfig = (UserProfileConfig) obj;
        userProfileConfig.getClass();
        return Model.ADAPTER.encodedSizeWithTag(3, userProfileConfig.preferred_model) + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(2, userProfileConfig.extra_args) + ExtensionConfig.ADAPTER.asRepeated().encodedSizeWithTag(1, userProfileConfig.client_tools) + userProfileConfig.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UserProfileConfig userProfileConfig = (UserProfileConfig) obj;
        userProfileConfig.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(userProfileConfig.client_tools, ExtensionConfig.ADAPTER);
        Map<String, ?> map = userProfileConfig.extra_args;
        Map map2 = map != null ? (Map) ProtoAdapter.STRUCT_MAP.redact(map) : null;
        Model model = userProfileConfig.preferred_model;
        Model model2 = model != null ? (Model) Model.ADAPTER.redact(model) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UserProfileConfig(m1169redactElements, map2, model2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UserProfileConfig userProfileConfig = (UserProfileConfig) obj;
        userProfileConfig.getClass();
        ExtensionConfig.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, userProfileConfig.client_tools);
        ProtoAdapter.STRUCT_MAP.encodeWithTag(protoWriter, 2, userProfileConfig.extra_args);
        Model.ADAPTER.encodeWithTag(protoWriter, 3, userProfileConfig.preferred_model);
        protoWriter.writeBytes(userProfileConfig.unknownFields());
    }
}
