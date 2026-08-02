package squareup.cash.bankingbenefits.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedGreenBenefits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedGreenBenefits((GreenBenefitsV1) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(GreenBenefitsV1.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
        reverseProtoWriter.getClass();
        versionedGreenBenefits.getClass();
        reverseProtoWriter.writeBytes(versionedGreenBenefits.unknownFields());
        GreenBenefitsV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedGreenBenefits.green_benefits_v1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
        versionedGreenBenefits.getClass();
        return GreenBenefitsV1.ADAPTER.encodedSizeWithTag(1, versionedGreenBenefits.green_benefits_v1) + versionedGreenBenefits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
        versionedGreenBenefits.getClass();
        GreenBenefitsV1 greenBenefitsV1 = versionedGreenBenefits.green_benefits_v1;
        GreenBenefitsV1 greenBenefitsV12 = greenBenefitsV1 != null ? (GreenBenefitsV1) GreenBenefitsV1.ADAPTER.redact(greenBenefitsV1) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedGreenBenefits(greenBenefitsV12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedGreenBenefits versionedGreenBenefits = (VersionedGreenBenefits) obj;
        versionedGreenBenefits.getClass();
        GreenBenefitsV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedGreenBenefits.green_benefits_v1);
        protoWriter.writeBytes(versionedGreenBenefits.unknownFields());
    }
}
