package squareup.cash.savings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SavingsExternalElements$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsExternalElements((SavingsExternalReference) obj, m, (SavingsExternalReferenceIdentifier) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SavingsExternalReference.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                m.add(ArcadeElement.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(SavingsExternalReferenceIdentifier.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
        reverseProtoWriter.getClass();
        savingsExternalElements.getClass();
        reverseProtoWriter.writeBytes(savingsExternalElements.unknownFields());
        SavingsExternalReferenceIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 3, savingsExternalElements.savings_external_reference_id);
        ArcadeElement.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, savingsExternalElements.elements);
        SavingsExternalReference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsExternalElements.savings_external_reference);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
        savingsExternalElements.getClass();
        return SavingsExternalReferenceIdentifier.ADAPTER.encodedSizeWithTag(3, savingsExternalElements.savings_external_reference_id) + ArcadeElement.ADAPTER.asRepeated().encodedSizeWithTag(2, savingsExternalElements.elements) + SavingsExternalReference.ADAPTER.encodedSizeWithTag(1, savingsExternalElements.savings_external_reference) + savingsExternalElements.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
        savingsExternalElements.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(savingsExternalElements.elements, ArcadeElement.ADAPTER);
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = savingsExternalElements.savings_external_reference_id;
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier2 = savingsExternalReferenceIdentifier != null ? (SavingsExternalReferenceIdentifier) SavingsExternalReferenceIdentifier.ADAPTER.redact(savingsExternalReferenceIdentifier) : null;
        ByteString byteString = ByteString.EMPTY;
        SavingsExternalReference savingsExternalReference = savingsExternalElements.savings_external_reference;
        byteString.getClass();
        return new SavingsExternalElements(savingsExternalReference, m1169redactElements, savingsExternalReferenceIdentifier2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
        savingsExternalElements.getClass();
        SavingsExternalReference.ADAPTER.encodeWithTag(protoWriter, 1, savingsExternalElements.savings_external_reference);
        ArcadeElement.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, savingsExternalElements.elements);
        SavingsExternalReferenceIdentifier.ADAPTER.encodeWithTag(protoWriter, 3, savingsExternalElements.savings_external_reference_id);
        protoWriter.writeBytes(savingsExternalElements.unknownFields());
    }
}
