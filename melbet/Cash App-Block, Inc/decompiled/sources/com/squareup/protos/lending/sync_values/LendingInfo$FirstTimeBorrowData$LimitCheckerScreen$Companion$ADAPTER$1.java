package com.squareup.protos.lending.sync_values;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.lending.sync_values.LendingInfo;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingInfo$FirstTimeBorrowData$LimitCheckerScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LendingInfo.FirstTimeBorrowData.LimitCheckerScreen((String) obj, (String) obj2, m, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen = (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) obj;
        reverseProtoWriter.getClass();
        limitCheckerScreen.getClass();
        reverseProtoWriter.writeBytes(limitCheckerScreen.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, limitCheckerScreen.animation_millis);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, limitCheckerScreen.bullets);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, limitCheckerScreen.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, limitCheckerScreen.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen = (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) obj;
        limitCheckerScreen.getClass();
        int size$okio = limitCheckerScreen.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, limitCheckerScreen.animation_millis) + protoAdapter.asRepeated().encodedSizeWithTag(3, limitCheckerScreen.bullets) + protoAdapter.encodedSizeWithTag(2, limitCheckerScreen.subtitle) + protoAdapter.encodedSizeWithTag(1, limitCheckerScreen.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen = (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) obj;
        limitCheckerScreen.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = limitCheckerScreen.title;
        String str2 = limitCheckerScreen.subtitle;
        List list = limitCheckerScreen.bullets;
        Integer num = limitCheckerScreen.animation_millis;
        list.getClass();
        byteString.getClass();
        return new LendingInfo.FirstTimeBorrowData.LimitCheckerScreen(str, str2, list, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingInfo.FirstTimeBorrowData.LimitCheckerScreen limitCheckerScreen = (LendingInfo.FirstTimeBorrowData.LimitCheckerScreen) obj;
        limitCheckerScreen.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, limitCheckerScreen.title);
        protoAdapter.encodeWithTag(protoWriter, 2, limitCheckerScreen.subtitle);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, limitCheckerScreen.bullets);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, limitCheckerScreen.animation_millis);
        protoWriter.writeBytes(limitCheckerScreen.unknownFields());
    }
}
