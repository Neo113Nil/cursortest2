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
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$LimitedAccountTypes$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes(m, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.tryDecode(protoReader, arrayList);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes limitedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes) obj;
        reverseProtoWriter.getClass();
        limitedAccountTypes.getClass();
        reverseProtoWriter.writeBytes(limitedAccountTypes.unknownFields());
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, limitedAccountTypes.account_types);
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, limitedAccountTypes.accounts);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes limitedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes) obj;
        limitedAccountTypes.getClass();
        return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.asRepeated().encodedSizeWithTag(2, limitedAccountTypes.account_types) + Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.ADAPTER.asRepeated().encodedSizeWithTag(1, limitedAccountTypes.accounts) + limitedAccountTypes.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes limitedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes) obj;
        limitedAccountTypes.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(limitedAccountTypes.accounts, Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        List list = limitedAccountTypes.account_types;
        list.getClass();
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes(m1169redactElements, list, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes limitedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes) obj;
        limitedAccountTypes.getClass();
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, limitedAccountTypes.accounts);
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, limitedAccountTypes.account_types);
        protoWriter.writeBytes(limitedAccountTypes.unknownFields());
    }
}
