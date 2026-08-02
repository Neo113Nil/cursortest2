package squareup.cash.savings;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes10.dex */
public final class SavingsConfig$SavingsAppletUi$FolderSubtitles$Yield$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, (LocalizedString) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield = (SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) obj;
        reverseProtoWriter.getClass();
        yield.getClass();
        reverseProtoWriter.writeBytes(yield.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, yield.yield_current_rate_enhanced);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, yield.yield_current_rate_standard);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, yield.yield_subtitle_earn_enhanced);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, yield.yield_earn_up_to_enhanced);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield = (SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) obj;
        yield.getClass();
        int size$okio = yield.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, yield.yield_current_rate_enhanced) + protoAdapter.encodedSizeWithTag(3, yield.yield_current_rate_standard) + protoAdapter.encodedSizeWithTag(2, yield.yield_subtitle_earn_enhanced) + protoAdapter.encodedSizeWithTag(1, yield.yield_earn_up_to_enhanced) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield = (SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) obj;
        yield.getClass();
        LocalizedString localizedString = yield.yield_earn_up_to_enhanced;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = yield.yield_subtitle_earn_enhanced;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = yield.yield_current_rate_standard;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        LocalizedString localizedString7 = yield.yield_current_rate_enhanced;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield(localizedString2, localizedString4, localizedString6, localizedString8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield yield = (SavingsConfig.SavingsAppletUi.FolderSubtitles.Yield) obj;
        yield.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, yield.yield_earn_up_to_enhanced);
        protoAdapter.encodeWithTag(protoWriter, 2, yield.yield_subtitle_earn_enhanced);
        protoAdapter.encodeWithTag(protoWriter, 3, yield.yield_current_rate_standard);
        protoAdapter.encodeWithTag(protoWriter, 4, yield.yield_current_rate_enhanced);
        protoWriter.writeBytes(yield.unknownFields());
    }
}
