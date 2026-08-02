package com.squareup.protos.cash.local.client.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class LocalCashActivity$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalCashActivity((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(LocalCashActivity.Row.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCashActivity localCashActivity = (LocalCashActivity) obj;
        reverseProtoWriter.getClass();
        localCashActivity.getClass();
        reverseProtoWriter.writeBytes(localCashActivity.unknownFields());
        LocalCashActivity.Row.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, localCashActivity.rows);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, localCashActivity.header);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCashActivity localCashActivity = (LocalCashActivity) obj;
        localCashActivity.getClass();
        return LocalCashActivity.Row.ADAPTER.asRepeated().encodedSizeWithTag(2, localCashActivity.rows) + ProtoAdapter.STRING.encodedSizeWithTag(1, localCashActivity.header) + localCashActivity.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCashActivity localCashActivity = (LocalCashActivity) obj;
        localCashActivity.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(localCashActivity.rows, LocalCashActivity.Row.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = localCashActivity.header;
        byteString.getClass();
        return new LocalCashActivity(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCashActivity localCashActivity = (LocalCashActivity) obj;
        localCashActivity.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, localCashActivity.header);
        LocalCashActivity.Row.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, localCashActivity.rows);
        protoWriter.writeBytes(localCashActivity.unknownFields());
    }
}
