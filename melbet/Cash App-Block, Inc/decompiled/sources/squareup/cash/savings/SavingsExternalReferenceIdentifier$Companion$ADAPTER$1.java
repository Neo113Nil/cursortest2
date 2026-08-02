package squareup.cash.savings;

import com.squareup.cash.money.viewmodels.api.Section;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class SavingsExternalReferenceIdentifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Section.Header header = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsExternalReferenceIdentifier((SavingsExternalReference) obj, header, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SavingsExternalReference.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                header = new SavingsExternalReferenceIdentifier$Screen$SavingsHome(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            } else if (nextTag == 3) {
                header = new SavingsExternalReferenceIdentifier$Screen$GeneralSavings(((Boolean) ProtoAdapter.BOOL.decode(protoReader)).booleanValue());
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                header = new SavingsExternalReferenceIdentifier$Screen$GoalFolderToken((String) ProtoAdapter.STRING.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = (SavingsExternalReferenceIdentifier) obj;
        reverseProtoWriter.getClass();
        savingsExternalReferenceIdentifier.getClass();
        reverseProtoWriter.writeBytes(savingsExternalReferenceIdentifier.unknownFields());
        Section.Header header = savingsExternalReferenceIdentifier.screen;
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$SavingsHome) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, Boolean.valueOf(((SavingsExternalReferenceIdentifier$Screen$SavingsHome) header).value));
        } else if (header instanceof SavingsExternalReferenceIdentifier$Screen$GeneralSavings) {
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, Boolean.valueOf(((SavingsExternalReferenceIdentifier$Screen$GeneralSavings) header).value));
        } else if (header instanceof SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) header).value);
        } else if (header != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        SavingsExternalReference.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsExternalReferenceIdentifier.f1642type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = (SavingsExternalReferenceIdentifier) obj;
        savingsExternalReferenceIdentifier.getClass();
        int encodedSizeWithTag = SavingsExternalReference.ADAPTER.encodedSizeWithTag(1, savingsExternalReferenceIdentifier.f1642type) + savingsExternalReferenceIdentifier.unknownFields().getSize$okio();
        Section.Header header = savingsExternalReferenceIdentifier.screen;
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$SavingsHome) {
            return SizeMode$EnumUnboxingLocalUtility.m(((SavingsExternalReferenceIdentifier$Screen$SavingsHome) header).value, ProtoAdapter.BOOL, 2, encodedSizeWithTag);
        }
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$GeneralSavings) {
            return SizeMode$EnumUnboxingLocalUtility.m(((SavingsExternalReferenceIdentifier$Screen$GeneralSavings) header).value, ProtoAdapter.BOOL, 3, encodedSizeWithTag);
        }
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) {
            return ProtoAdapter.STRING.encodedSizeWithTag(4, ((SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) header).value) + encodedSizeWithTag;
        }
        if (header == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = (SavingsExternalReferenceIdentifier) obj;
        savingsExternalReferenceIdentifier.getClass();
        ByteString byteString = ByteString.EMPTY;
        SavingsExternalReference savingsExternalReference = savingsExternalReferenceIdentifier.f1642type;
        Section.Header header = savingsExternalReferenceIdentifier.screen;
        byteString.getClass();
        return new SavingsExternalReferenceIdentifier(savingsExternalReference, header, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = (SavingsExternalReferenceIdentifier) obj;
        savingsExternalReferenceIdentifier.getClass();
        SavingsExternalReference.ADAPTER.encodeWithTag(protoWriter, 1, savingsExternalReferenceIdentifier.f1642type);
        Section.Header header = savingsExternalReferenceIdentifier.screen;
        if (header instanceof SavingsExternalReferenceIdentifier$Screen$SavingsHome) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, Boolean.valueOf(((SavingsExternalReferenceIdentifier$Screen$SavingsHome) header).value));
        } else if (header instanceof SavingsExternalReferenceIdentifier$Screen$GeneralSavings) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, Boolean.valueOf(((SavingsExternalReferenceIdentifier$Screen$GeneralSavings) header).value));
        } else if (header instanceof SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ((SavingsExternalReferenceIdentifier$Screen$GoalFolderToken) header).value);
        } else if (header != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(savingsExternalReferenceIdentifier.unknownFields());
    }
}
