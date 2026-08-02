package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FormattedDetail$CreditInfoCheck$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new FormattedDetail.CreditInfoCheck((String) obj, (LocalizedString) obj2, (LocalizedString) obj3, (Money) obj4, (StyledText) obj5, (StyledText) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj5 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj5);
                    break;
                case 3:
                    obj6 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj6);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 6:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormattedDetail.CreditInfoCheck creditInfoCheck = (FormattedDetail.CreditInfoCheck) obj;
        reverseProtoWriter.getClass();
        creditInfoCheck.getClass();
        reverseProtoWriter.writeBytes(creditInfoCheck.unknownFields());
        ProtoAdapter protoAdapter = StyledText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, creditInfoCheck.limit_unknown);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, creditInfoCheck.credit_limit_reached);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, creditInfoCheck.min_credit);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, creditInfoCheck.l_limit_unknown);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, creditInfoCheck.l_credit_limit_reached);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, creditInfoCheck.string_to_replace);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormattedDetail.CreditInfoCheck creditInfoCheck = (FormattedDetail.CreditInfoCheck) obj;
        creditInfoCheck.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, creditInfoCheck.string_to_replace) + creditInfoCheck.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        int encodedSizeWithTag2 = Money.ADAPTER.encodedSizeWithTag(4, creditInfoCheck.min_credit) + protoAdapter.encodedSizeWithTag(6, creditInfoCheck.l_limit_unknown) + protoAdapter.encodedSizeWithTag(5, creditInfoCheck.l_credit_limit_reached) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(3, creditInfoCheck.limit_unknown) + protoAdapter2.encodedSizeWithTag(2, creditInfoCheck.credit_limit_reached) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormattedDetail.CreditInfoCheck creditInfoCheck = (FormattedDetail.CreditInfoCheck) obj;
        creditInfoCheck.getClass();
        LocalizedString localizedString = creditInfoCheck.l_credit_limit_reached;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = creditInfoCheck.l_limit_unknown;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        Money money = creditInfoCheck.min_credit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        StyledText styledText = creditInfoCheck.credit_limit_reached;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        StyledText styledText3 = creditInfoCheck.limit_unknown;
        StyledText styledText4 = styledText3 != null ? (StyledText) StyledText.ADAPTER.redact(styledText3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = creditInfoCheck.string_to_replace;
        byteString.getClass();
        return new FormattedDetail.CreditInfoCheck(str, localizedString2, localizedString4, money2, styledText2, styledText4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormattedDetail.CreditInfoCheck creditInfoCheck = (FormattedDetail.CreditInfoCheck) obj;
        creditInfoCheck.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, creditInfoCheck.string_to_replace);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 5, creditInfoCheck.l_credit_limit_reached);
        protoAdapter.encodeWithTag(protoWriter, 6, creditInfoCheck.l_limit_unknown);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, creditInfoCheck.min_credit);
        ProtoAdapter protoAdapter2 = StyledText.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, creditInfoCheck.credit_limit_reached);
        protoAdapter2.encodeWithTag(protoWriter, 3, creditInfoCheck.limit_unknown);
        protoWriter.writeBytes(creditInfoCheck.unknownFields());
    }
}
