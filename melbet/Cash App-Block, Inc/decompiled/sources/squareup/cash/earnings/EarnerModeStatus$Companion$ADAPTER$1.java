package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.time.Instant;
import okio.ByteString;
import squareup.cash.earnings.EarnerModeStatus;

/* loaded from: classes10.dex */
public final class EarnerModeStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarnerModeStatus((EarnerModeStatus.Status) obj, (Instant) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = EarnerModeStatus.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ProtoAdapter.INSTANT, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarnerModeStatus earnerModeStatus = (EarnerModeStatus) obj;
        reverseProtoWriter.getClass();
        earnerModeStatus.getClass();
        reverseProtoWriter.writeBytes(earnerModeStatus.unknownFields());
        ProtoAdapter.INSTANT.encodeWithTag(reverseProtoWriter, 2, earnerModeStatus.ends_at);
        EarnerModeStatus.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earnerModeStatus.status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarnerModeStatus earnerModeStatus = (EarnerModeStatus) obj;
        earnerModeStatus.getClass();
        return ProtoAdapter.INSTANT.encodedSizeWithTag(2, earnerModeStatus.ends_at) + EarnerModeStatus.Status.ADAPTER.encodedSizeWithTag(1, earnerModeStatus.status) + earnerModeStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarnerModeStatus earnerModeStatus = (EarnerModeStatus) obj;
        earnerModeStatus.getClass();
        Instant instant = earnerModeStatus.ends_at;
        Instant instant2 = instant != null ? (Instant) ProtoAdapter.INSTANT.redact(instant) : null;
        ByteString byteString = ByteString.EMPTY;
        EarnerModeStatus.Status status = earnerModeStatus.status;
        byteString.getClass();
        return new EarnerModeStatus(status, instant2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarnerModeStatus earnerModeStatus = (EarnerModeStatus) obj;
        earnerModeStatus.getClass();
        EarnerModeStatus.Status.ADAPTER.encodeWithTag(protoWriter, 1, earnerModeStatus.status);
        ProtoAdapter.INSTANT.encodeWithTag(protoWriter, 2, earnerModeStatus.ends_at);
        protoWriter.writeBytes(earnerModeStatus.unknownFields());
    }
}
