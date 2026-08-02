package squareup.cash.savings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedSavingsFolders$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedSavingsFolders(m, (String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SavingsFolderV2.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        reverseProtoWriter.getClass();
        versionedSavingsFolders.getClass();
        reverseProtoWriter.writeBytes(versionedSavingsFolders.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, versionedSavingsFolders.v2_balance_token);
        SavingsFolderV2.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, versionedSavingsFolders.v2_folders);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        versionedSavingsFolders.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, versionedSavingsFolders.v2_balance_token) + SavingsFolderV2.ADAPTER.asRepeated().encodedSizeWithTag(1, versionedSavingsFolders.v2_folders) + versionedSavingsFolders.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        versionedSavingsFolders.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(versionedSavingsFolders.v2_folders, SavingsFolderV2.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = versionedSavingsFolders.v2_balance_token;
        byteString.getClass();
        return new VersionedSavingsFolders(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        versionedSavingsFolders.getClass();
        SavingsFolderV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, versionedSavingsFolders.v2_folders);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, versionedSavingsFolders.v2_balance_token);
        protoWriter.writeBytes(versionedSavingsFolders.unknownFields());
    }
}
