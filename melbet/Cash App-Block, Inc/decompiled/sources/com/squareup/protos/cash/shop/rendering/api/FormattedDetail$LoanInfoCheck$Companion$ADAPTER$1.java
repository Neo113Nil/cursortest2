package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FormattedDetail$LoanInfoCheck$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new FormattedDetail.LoanInfoCheck((String) obj, (LocalizedString) obj2, (StyledText) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj3 = TransactorKt.decodeMessageOrMerge(StyledText.ADAPTER, protoReader, obj3);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        FormattedDetail.LoanInfoCheck loanInfoCheck = (FormattedDetail.LoanInfoCheck) obj;
        reverseProtoWriter.getClass();
        loanInfoCheck.getClass();
        reverseProtoWriter.writeBytes(loanInfoCheck.unknownFields());
        StyledText.ADAPTER.encodeWithTag(reverseProtoWriter, 2, loanInfoCheck.loan_limit_reached);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 3, loanInfoCheck.l_loan_limit_reached);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, loanInfoCheck.string_to_replace);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        FormattedDetail.LoanInfoCheck loanInfoCheck = (FormattedDetail.LoanInfoCheck) obj;
        loanInfoCheck.getClass();
        return StyledText.ADAPTER.encodedSizeWithTag(2, loanInfoCheck.loan_limit_reached) + LocalizedString.ADAPTER.encodedSizeWithTag(3, loanInfoCheck.l_loan_limit_reached) + ProtoAdapter.STRING.encodedSizeWithTag(1, loanInfoCheck.string_to_replace) + loanInfoCheck.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        FormattedDetail.LoanInfoCheck loanInfoCheck = (FormattedDetail.LoanInfoCheck) obj;
        loanInfoCheck.getClass();
        LocalizedString localizedString = loanInfoCheck.l_loan_limit_reached;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        StyledText styledText = loanInfoCheck.loan_limit_reached;
        StyledText styledText2 = styledText != null ? (StyledText) StyledText.ADAPTER.redact(styledText) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = loanInfoCheck.string_to_replace;
        byteString.getClass();
        return new FormattedDetail.LoanInfoCheck(str, localizedString2, styledText2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        FormattedDetail.LoanInfoCheck loanInfoCheck = (FormattedDetail.LoanInfoCheck) obj;
        loanInfoCheck.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, loanInfoCheck.string_to_replace);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 3, loanInfoCheck.l_loan_limit_reached);
        StyledText.ADAPTER.encodeWithTag(protoWriter, 2, loanInfoCheck.loan_limit_reached);
        protoWriter.writeBytes(loanInfoCheck.unknownFields());
    }
}
