package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningStream$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningStream((EarningStreamIdentifier) obj, (String) obj2, (UiAvatar) obj3, (Money) obj4, (String) obj5, (EarningsTimeFrame) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(EarningStreamIdentifier.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningStream earningStream = (EarningStream) obj;
        reverseProtoWriter.getClass();
        earningStream.getClass();
        reverseProtoWriter.writeBytes(earningStream.unknownFields());
        EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 6, earningStream.earliest_period);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, earningStream.client_route);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, earningStream.earnings);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, earningStream.avatar);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, earningStream.display_name);
        EarningStreamIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningStream.identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningStream earningStream = (EarningStream) obj;
        earningStream.getClass();
        int encodedSizeWithTag = EarningStreamIdentifier.ADAPTER.encodedSizeWithTag(1, earningStream.identifier) + earningStream.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return EarningsTimeFrame.ADAPTER.encodedSizeWithTag(6, earningStream.earliest_period) + protoAdapter.encodedSizeWithTag(5, earningStream.client_route) + Money.ADAPTER.encodedSizeWithTag(4, earningStream.earnings) + UiAvatar.ADAPTER.encodedSizeWithTag(3, earningStream.avatar) + protoAdapter.encodedSizeWithTag(2, earningStream.display_name) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningStream earningStream = (EarningStream) obj;
        earningStream.getClass();
        EarningStreamIdentifier earningStreamIdentifier = earningStream.identifier;
        EarningStreamIdentifier earningStreamIdentifier2 = earningStreamIdentifier != null ? (EarningStreamIdentifier) EarningStreamIdentifier.ADAPTER.redact(earningStreamIdentifier) : null;
        UiAvatar uiAvatar = earningStream.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        Money money = earningStream.earnings;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        EarningsTimeFrame earningsTimeFrame = earningStream.earliest_period;
        EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = earningStream.display_name;
        String str2 = earningStream.client_route;
        byteString.getClass();
        return new EarningStream(earningStreamIdentifier2, str, uiAvatar2, money2, str2, earningsTimeFrame2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningStream earningStream = (EarningStream) obj;
        earningStream.getClass();
        EarningStreamIdentifier.ADAPTER.encodeWithTag(protoWriter, 1, earningStream.identifier);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, earningStream.display_name);
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 3, earningStream.avatar);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, earningStream.earnings);
        protoAdapter.encodeWithTag(protoWriter, 5, earningStream.client_route);
        EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 6, earningStream.earliest_period);
        protoWriter.writeBytes(earningStream.unknownFields());
    }
}
