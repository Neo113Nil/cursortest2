package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes10.dex */
public final class SavingsConfig$SavingsAppletUi$FolderSubtitles$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsConfig.SavingsAppletUi.FolderSubtitles((SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles = (SavingsConfig.SavingsAppletUi.FolderSubtitles) obj;
        reverseProtoWriter.getClass();
        folderSubtitles.getClass();
        reverseProtoWriter.writeBytes(folderSubtitles.unknownFields());
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.ADAPTER.encodeWithTag(reverseProtoWriter, 1, folderSubtitles.yield);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles = (SavingsConfig.SavingsAppletUi.FolderSubtitles) obj;
        folderSubtitles.getClass();
        return SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.ADAPTER.encodedSizeWithTag(1, folderSubtitles.yield) + folderSubtitles.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles = (SavingsConfig.SavingsAppletUi.FolderSubtitles) obj;
        folderSubtitles.getClass();
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield = folderSubtitles.yield;
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield2 = yield != null ? (SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.ADAPTER.redact(yield) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsConfig.SavingsAppletUi.FolderSubtitles(yield2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles = (SavingsConfig.SavingsAppletUi.FolderSubtitles) obj;
        folderSubtitles.getClass();
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield.ADAPTER.encodeWithTag(protoWriter, 1, folderSubtitles.yield);
        protoWriter.writeBytes(folderSubtitles.unknownFields());
    }
}
