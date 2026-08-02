package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FormattedDetail$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FormattedDetail((Icon) obj, (LocalizedString) obj2, (FormattedDetail.CreditInfoCheck) obj3, (FormattedDetail.LoanInfoCheck) obj4, (FormattedDetail.CountdownInfoCheck) obj5, (IconId) obj6, (StyledText) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj6 = IconId.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj7 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj7);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(FormattedDetail.CreditInfoCheck.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(FormattedDetail.LoanInfoCheck.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(FormattedDetail.CountdownInfoCheck.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
                    break;
                case 7:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormattedDetail formattedDetail = (FormattedDetail) obj;
        reverseProtoWriter.getClass();
        formattedDetail.getClass();
        reverseProtoWriter.writeBytes(formattedDetail.unknownFields());
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 2, formattedDetail.styled_text);
        IconId.ADAPTER.encodeWithTag(reverseProtoWriter, 1, formattedDetail.icon);
        FormattedDetail.CountdownInfoCheck.ADAPTER.encodeWithTag(reverseProtoWriter, 5, formattedDetail.countdown_check);
        FormattedDetail.LoanInfoCheck.ADAPTER.encodeWithTag(reverseProtoWriter, 4, formattedDetail.loan_check);
        FormattedDetail.CreditInfoCheck.ADAPTER.encodeWithTag(reverseProtoWriter, 3, formattedDetail.credit_check);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 7, formattedDetail.l_text);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, formattedDetail.arcade_icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormattedDetail formattedDetail = (FormattedDetail) obj;
        formattedDetail.getClass();
        return StyledText.ADAPTER.encodedSizeWithTag(2, formattedDetail.styled_text) + IconId.ADAPTER.encodedSizeWithTag(1, formattedDetail.icon) + FormattedDetail.CountdownInfoCheck.ADAPTER.encodedSizeWithTag(5, formattedDetail.countdown_check) + FormattedDetail.LoanInfoCheck.ADAPTER.encodedSizeWithTag(4, formattedDetail.loan_check) + FormattedDetail.CreditInfoCheck.ADAPTER.encodedSizeWithTag(3, formattedDetail.credit_check) + LocalizedString.ADAPTER.encodedSizeWithTag(7, formattedDetail.l_text) + Icon.ADAPTER.encodedSizeWithTag(6, formattedDetail.arcade_icon) + formattedDetail.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormattedDetail formattedDetail = (FormattedDetail) obj;
        formattedDetail.getClass();
        Icon icon = formattedDetail.arcade_icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        LocalizedString localizedString = formattedDetail.l_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        FormattedDetail.CreditInfoCheck creditInfoCheck = formattedDetail.credit_check;
        FormattedDetail.CreditInfoCheck creditInfoCheck2 = creditInfoCheck != null ? (FormattedDetail.CreditInfoCheck) FormattedDetail.CreditInfoCheck.ADAPTER.redact(creditInfoCheck) : null;
        FormattedDetail.LoanInfoCheck loanInfoCheck = formattedDetail.loan_check;
        FormattedDetail.LoanInfoCheck loanInfoCheck2 = loanInfoCheck != null ? (FormattedDetail.LoanInfoCheck) FormattedDetail.LoanInfoCheck.ADAPTER.redact(loanInfoCheck) : null;
        FormattedDetail.CountdownInfoCheck countdownInfoCheck = formattedDetail.countdown_check;
        FormattedDetail.CountdownInfoCheck countdownInfoCheck2 = countdownInfoCheck != null ? (FormattedDetail.CountdownInfoCheck) FormattedDetail.CountdownInfoCheck.ADAPTER.redact(countdownInfoCheck) : null;
        StyledText styledText = formattedDetail.styled_text;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        IconId iconId = formattedDetail.icon;
        byteString.getClass();
        return new FormattedDetail(icon2, localizedString2, creditInfoCheck2, loanInfoCheck2, countdownInfoCheck2, iconId, styledText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormattedDetail formattedDetail = (FormattedDetail) obj;
        formattedDetail.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 6, formattedDetail.arcade_icon);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 7, formattedDetail.l_text);
        FormattedDetail.CreditInfoCheck.ADAPTER.encodeWithTag(protoWriter, 3, formattedDetail.credit_check);
        FormattedDetail.LoanInfoCheck.ADAPTER.encodeWithTag(protoWriter, 4, formattedDetail.loan_check);
        FormattedDetail.CountdownInfoCheck.ADAPTER.encodeWithTag(protoWriter, 5, formattedDetail.countdown_check);
        IconId.ADAPTER.encodeWithTag(protoWriter, 1, formattedDetail.icon);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 2, formattedDetail.styled_text);
        protoWriter.writeBytes(formattedDetail.unknownFields());
    }
}
