package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.earnings.EarningsHomeUIState;

/* loaded from: classes10.dex */
public final class EarningsHomeUIState$EarningsHomeConfiguration$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsHomeUIState.EarningsHomeConfiguration((EarningsHomeUi) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EarningsHomeUi.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = (EarningsHomeUIState.EarningsHomeConfiguration) obj;
        reverseProtoWriter.getClass();
        earningsHomeConfiguration.getClass();
        reverseProtoWriter.writeBytes(earningsHomeConfiguration.unknownFields());
        EarningsHomeUi.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningsHomeConfiguration.earnings_home_ui);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = (EarningsHomeUIState.EarningsHomeConfiguration) obj;
        earningsHomeConfiguration.getClass();
        return EarningsHomeUi.ADAPTER.encodedSizeWithTag(1, earningsHomeConfiguration.earnings_home_ui) + earningsHomeConfiguration.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = (EarningsHomeUIState.EarningsHomeConfiguration) obj;
        earningsHomeConfiguration.getClass();
        EarningsHomeUi earningsHomeUi = earningsHomeConfiguration.earnings_home_ui;
        EarningsHomeUi earningsHomeUi2 = earningsHomeUi != null ? (EarningsHomeUi) EarningsHomeUi.ADAPTER.redact(earningsHomeUi) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningsHomeUIState.EarningsHomeConfiguration(earningsHomeUi2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = (EarningsHomeUIState.EarningsHomeConfiguration) obj;
        earningsHomeConfiguration.getClass();
        EarningsHomeUi.ADAPTER.encodeWithTag(protoWriter, 1, earningsHomeConfiguration.earnings_home_ui);
        protoWriter.writeBytes(earningsHomeConfiguration.unknownFields());
    }
}
