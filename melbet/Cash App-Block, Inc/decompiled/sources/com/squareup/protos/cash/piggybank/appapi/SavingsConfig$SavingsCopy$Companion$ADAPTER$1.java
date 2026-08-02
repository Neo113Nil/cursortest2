package com.squareup.protos.cash.piggybank.appapi;

import com.squareup.protos.cash.piggybank.appapi.SavingsConfig;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SavingsConfig$SavingsCopy$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SavingsConfig.SavingsCopy((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        SavingsConfig.SavingsCopy savingsCopy = (SavingsConfig.SavingsCopy) obj;
        reverseProtoWriter.getClass();
        savingsCopy.getClass();
        reverseProtoWriter.writeBytes(savingsCopy.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, savingsCopy.savings_interest_header_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, savingsCopy.default_savings_folder_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, savingsCopy.remove_goal_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, savingsCopy.goal_complete_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.SavingsCopy savingsCopy = (SavingsConfig.SavingsCopy) obj;
        savingsCopy.getClass();
        int size$okio = savingsCopy.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, savingsCopy.savings_interest_header_text) + protoAdapter.encodedSizeWithTag(3, savingsCopy.default_savings_folder_label) + protoAdapter.encodedSizeWithTag(2, savingsCopy.remove_goal_text) + protoAdapter.encodedSizeWithTag(1, savingsCopy.goal_complete_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.SavingsCopy savingsCopy = (SavingsConfig.SavingsCopy) obj;
        savingsCopy.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = savingsCopy.goal_complete_text;
        String str2 = savingsCopy.remove_goal_text;
        String str3 = savingsCopy.default_savings_folder_label;
        String str4 = savingsCopy.savings_interest_header_text;
        byteString.getClass();
        return new SavingsConfig.SavingsCopy(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.SavingsCopy savingsCopy = (SavingsConfig.SavingsCopy) obj;
        savingsCopy.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, savingsCopy.goal_complete_text);
        protoAdapter.encodeWithTag(protoWriter, 2, savingsCopy.remove_goal_text);
        protoAdapter.encodeWithTag(protoWriter, 3, savingsCopy.default_savings_folder_label);
        protoAdapter.encodeWithTag(protoWriter, 4, savingsCopy.savings_interest_header_text);
        protoWriter.writeBytes(savingsCopy.unknownFields());
    }
}
