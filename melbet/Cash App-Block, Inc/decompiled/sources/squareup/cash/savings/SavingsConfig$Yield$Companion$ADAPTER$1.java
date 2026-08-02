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
public final class SavingsConfig$Yield$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SavingsConfig.Yield((LocalizedString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SavingsConfig.Yield yield = (SavingsConfig.Yield) obj;
        reverseProtoWriter.getClass();
        yield.getClass();
        reverseProtoWriter.writeBytes(yield.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, yield.yield_current_rate_enhanced);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SavingsConfig.Yield yield = (SavingsConfig.Yield) obj;
        yield.getClass();
        return LocalizedString.ADAPTER.encodedSizeWithTag(1, yield.yield_current_rate_enhanced) + yield.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SavingsConfig.Yield yield = (SavingsConfig.Yield) obj;
        yield.getClass();
        LocalizedString localizedString = yield.yield_current_rate_enhanced;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SavingsConfig.Yield(localizedString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SavingsConfig.Yield yield = (SavingsConfig.Yield) obj;
        yield.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, yield.yield_current_rate_enhanced);
        protoWriter.writeBytes(yield.unknownFields());
    }
}
