package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedGreenBooklet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedGreenBooklet((GreenBookletV1) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GreenBookletV1.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) obj;
        reverseProtoWriter.getClass();
        versionedGreenBooklet.getClass();
        reverseProtoWriter.writeBytes(versionedGreenBooklet.unknownFields());
        GreenBookletV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedGreenBooklet.green_booklet_v1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) obj;
        versionedGreenBooklet.getClass();
        return GreenBookletV1.ADAPTER.encodedSizeWithTag(1, versionedGreenBooklet.green_booklet_v1) + versionedGreenBooklet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) obj;
        versionedGreenBooklet.getClass();
        GreenBookletV1 greenBookletV1 = versionedGreenBooklet.green_booklet_v1;
        GreenBookletV1 greenBookletV12 = greenBookletV1 != null ? (GreenBookletV1) GreenBookletV1.ADAPTER.redact(greenBookletV1) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedGreenBooklet(greenBookletV12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedGreenBooklet versionedGreenBooklet = (VersionedGreenBooklet) obj;
        versionedGreenBooklet.getClass();
        GreenBookletV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedGreenBooklet.green_booklet_v1);
        protoWriter.writeBytes(versionedGreenBooklet.unknownFields());
    }
}
