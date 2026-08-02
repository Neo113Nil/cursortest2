package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsHome;
import squareup.cash.savings.action.Button;

/* loaded from: classes10.dex */
public final class SavingsHome$Header$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsHome.Header((Button) obj, (Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsHome.Header header = (SavingsHome.Header) obj;
        reverseProtoWriter.getClass();
        header.getClass();
        reverseProtoWriter.writeBytes(header.unknownFields());
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, header.alert_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, header.interest_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsHome.Header header = (SavingsHome.Header) obj;
        header.getClass();
        int size$okio = header.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, header.alert_button) + protoAdapter.encodedSizeWithTag(1, header.interest_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsHome.Header header = (SavingsHome.Header) obj;
        header.getClass();
        Button button = header.interest_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        Button button3 = header.alert_button;
        Button button4 = button3 != null ? (Button) Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsHome.Header(button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsHome.Header header = (SavingsHome.Header) obj;
        header.getClass();
        ProtoAdapter protoAdapter = Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, header.interest_button);
        protoAdapter.encodeWithTag(protoWriter, 2, header.alert_button);
        protoWriter.writeBytes(header.unknownFields());
    }
}
