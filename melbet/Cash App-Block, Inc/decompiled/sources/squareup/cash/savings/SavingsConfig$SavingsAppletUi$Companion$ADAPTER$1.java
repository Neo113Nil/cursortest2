package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes10.dex */
public final class SavingsConfig$SavingsAppletUi$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsConfig.SavingsAppletUi((SavingsConfig.SavingsAppletUi.FolderSubtitles) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SavingsConfig.SavingsAppletUi.FolderSubtitles.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi savingsAppletUi = (SavingsConfig.SavingsAppletUi) obj;
        reverseProtoWriter.getClass();
        savingsAppletUi.getClass();
        reverseProtoWriter.writeBytes(savingsAppletUi.unknownFields());
        SavingsConfig.SavingsAppletUi.FolderSubtitles.ADAPTER.encodeWithTag(reverseProtoWriter, 1, savingsAppletUi.subtitles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.SavingsAppletUi savingsAppletUi = (SavingsConfig.SavingsAppletUi) obj;
        savingsAppletUi.getClass();
        return SavingsConfig.SavingsAppletUi.FolderSubtitles.ADAPTER.encodedSizeWithTag(1, savingsAppletUi.subtitles) + savingsAppletUi.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.SavingsAppletUi savingsAppletUi = (SavingsConfig.SavingsAppletUi) obj;
        savingsAppletUi.getClass();
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles = savingsAppletUi.subtitles;
        SavingsConfig.SavingsAppletUi.FolderSubtitles folderSubtitles2 = folderSubtitles != null ? (SavingsConfig.SavingsAppletUi.FolderSubtitles) SavingsConfig.SavingsAppletUi.FolderSubtitles.ADAPTER.redact(folderSubtitles) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsConfig.SavingsAppletUi(folderSubtitles2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi savingsAppletUi = (SavingsConfig.SavingsAppletUi) obj;
        savingsAppletUi.getClass();
        SavingsConfig.SavingsAppletUi.FolderSubtitles.ADAPTER.encodeWithTag(protoWriter, 1, savingsAppletUi.subtitles);
        protoWriter.writeBytes(savingsAppletUi.unknownFields());
    }
}
