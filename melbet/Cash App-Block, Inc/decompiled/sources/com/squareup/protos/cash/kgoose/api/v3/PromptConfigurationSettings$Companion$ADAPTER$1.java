package com.squareup.protos.cash.kgoose.api.v3;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/PromptConfigurationSettings;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PromptConfigurationSettings$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PromptConfigurationSettings((Boolean) obj, (Boolean) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PromptConfigurationSettings promptConfigurationSettings = (PromptConfigurationSettings) obj;
        reverseProtoWriter.getClass();
        promptConfigurationSettings.getClass();
        reverseProtoWriter.writeBytes(promptConfigurationSettings.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, promptConfigurationSettings.include_time_emphasis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, promptConfigurationSettings.include_response_guidelines);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, promptConfigurationSettings.include_goose_model_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, promptConfigurationSettings.include_time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, promptConfigurationSettings.include_current_hour);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, promptConfigurationSettings.include_current_date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PromptConfigurationSettings promptConfigurationSettings = (PromptConfigurationSettings) obj;
        promptConfigurationSettings.getClass();
        int size$okio = promptConfigurationSettings.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(6, promptConfigurationSettings.include_time_emphasis) + protoAdapter.encodedSizeWithTag(5, promptConfigurationSettings.include_response_guidelines) + protoAdapter.encodedSizeWithTag(4, promptConfigurationSettings.include_goose_model_description) + protoAdapter.encodedSizeWithTag(3, promptConfigurationSettings.include_time_zone) + protoAdapter.encodedSizeWithTag(2, promptConfigurationSettings.include_current_hour) + protoAdapter.encodedSizeWithTag(1, promptConfigurationSettings.include_current_date) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PromptConfigurationSettings promptConfigurationSettings = (PromptConfigurationSettings) obj;
        promptConfigurationSettings.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = promptConfigurationSettings.include_current_date;
        Boolean bool2 = promptConfigurationSettings.include_current_hour;
        Boolean bool3 = promptConfigurationSettings.include_time_zone;
        Boolean bool4 = promptConfigurationSettings.include_goose_model_description;
        Boolean bool5 = promptConfigurationSettings.include_response_guidelines;
        Boolean bool6 = promptConfigurationSettings.include_time_emphasis;
        byteString.getClass();
        return new PromptConfigurationSettings(bool, bool2, bool3, bool4, bool5, bool6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PromptConfigurationSettings promptConfigurationSettings = (PromptConfigurationSettings) obj;
        promptConfigurationSettings.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, promptConfigurationSettings.include_current_date);
        protoAdapter.encodeWithTag(protoWriter, 2, promptConfigurationSettings.include_current_hour);
        protoAdapter.encodeWithTag(protoWriter, 3, promptConfigurationSettings.include_time_zone);
        protoAdapter.encodeWithTag(protoWriter, 4, promptConfigurationSettings.include_goose_model_description);
        protoAdapter.encodeWithTag(protoWriter, 5, promptConfigurationSettings.include_response_guidelines);
        protoAdapter.encodeWithTag(protoWriter, 6, promptConfigurationSettings.include_time_emphasis);
        protoWriter.writeBytes(promptConfigurationSettings.unknownFields());
    }
}
