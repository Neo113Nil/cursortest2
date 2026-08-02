package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedSavingsScreens$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedSavingsScreens((SavingsScreens) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SavingsScreens.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
        reverseProtoWriter.getClass();
        versionedSavingsScreens.getClass();
        reverseProtoWriter.writeBytes(versionedSavingsScreens.unknownFields());
        SavingsScreens.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedSavingsScreens.v2_screens);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
        versionedSavingsScreens.getClass();
        return SavingsScreens.ADAPTER.encodedSizeWithTag(1, versionedSavingsScreens.v2_screens) + versionedSavingsScreens.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
        versionedSavingsScreens.getClass();
        SavingsScreens savingsScreens = versionedSavingsScreens.v2_screens;
        SavingsScreens savingsScreens2 = savingsScreens != null ? (SavingsScreens) SavingsScreens.ADAPTER.redact(savingsScreens) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedSavingsScreens(savingsScreens2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedSavingsScreens versionedSavingsScreens = (VersionedSavingsScreens) obj;
        versionedSavingsScreens.getClass();
        SavingsScreens.ADAPTER.encodeWithTag(protoWriter, 1, versionedSavingsScreens.v2_screens);
        protoWriter.writeBytes(versionedSavingsScreens.unknownFields());
    }
}
