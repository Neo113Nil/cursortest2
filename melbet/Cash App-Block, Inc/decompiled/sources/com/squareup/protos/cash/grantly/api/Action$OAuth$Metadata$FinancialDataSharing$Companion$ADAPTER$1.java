package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) obj, (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) obj2, m, (Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Action.OAuth.Metadata.FinancialDataSharing.DataRecipient.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(Action.OAuth.Metadata.FinancialDataSharing.Intermediary.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing financialDataSharing = (Action.OAuth.Metadata.FinancialDataSharing) obj;
        reverseProtoWriter.getClass();
        financialDataSharing.getClass();
        reverseProtoWriter.writeBytes(financialDataSharing.unknownFields());
        Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ADAPTER.encodeWithTag(reverseProtoWriter, 4, financialDataSharing.selected_duration);
        Action.OAuth.Metadata.FinancialDataSharing.Intermediary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, financialDataSharing.intermediaries);
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient.ADAPTER.encodeWithTag(reverseProtoWriter, 2, financialDataSharing.data_recipient);
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.ADAPTER.encodeWithTag(reverseProtoWriter, 1, financialDataSharing.authorized_account_types);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing financialDataSharing = (Action.OAuth.Metadata.FinancialDataSharing) obj;
        financialDataSharing.getClass();
        return Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ADAPTER.encodedSizeWithTag(4, financialDataSharing.selected_duration) + Action.OAuth.Metadata.FinancialDataSharing.Intermediary.ADAPTER.asRepeated().encodedSizeWithTag(3, financialDataSharing.intermediaries) + Action.OAuth.Metadata.FinancialDataSharing.DataRecipient.ADAPTER.encodedSizeWithTag(2, financialDataSharing.data_recipient) + Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.ADAPTER.encodedSizeWithTag(1, financialDataSharing.authorized_account_types) + financialDataSharing.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing financialDataSharing = (Action.OAuth.Metadata.FinancialDataSharing) obj;
        financialDataSharing.getClass();
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes = financialDataSharing.authorized_account_types;
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes2 = authorizedAccountTypes != null ? (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.ADAPTER.redact(authorizedAccountTypes) : null;
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient = financialDataSharing.data_recipient;
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient dataRecipient2 = dataRecipient != null ? (Action.OAuth.Metadata.FinancialDataSharing.DataRecipient) Action.OAuth.Metadata.FinancialDataSharing.DataRecipient.ADAPTER.redact(dataRecipient) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(financialDataSharing.intermediaries, Action.OAuth.Metadata.FinancialDataSharing.Intermediary.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration dataSharingDuration = financialDataSharing.selected_duration;
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing(authorizedAccountTypes2, dataRecipient2, m1169redactElements, dataSharingDuration, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing financialDataSharing = (Action.OAuth.Metadata.FinancialDataSharing) obj;
        financialDataSharing.getClass();
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.ADAPTER.encodeWithTag(protoWriter, 1, financialDataSharing.authorized_account_types);
        Action.OAuth.Metadata.FinancialDataSharing.DataRecipient.ADAPTER.encodeWithTag(protoWriter, 2, financialDataSharing.data_recipient);
        Action.OAuth.Metadata.FinancialDataSharing.Intermediary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, financialDataSharing.intermediaries);
        Action.OAuth.Metadata.FinancialDataSharing.DataSharingDuration.ADAPTER.encodeWithTag(protoWriter, 4, financialDataSharing.selected_duration);
        protoWriter.writeBytes(financialDataSharing.unknownFields());
    }
}
