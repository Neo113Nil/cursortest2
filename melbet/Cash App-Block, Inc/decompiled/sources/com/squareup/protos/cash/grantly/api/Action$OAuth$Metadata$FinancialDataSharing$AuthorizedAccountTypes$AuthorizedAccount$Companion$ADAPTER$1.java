package com.squareup.protos.cash.grantly.api;

import coil3.util.FileSystemsKt;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        FileSystemsKt fileSystemsKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType) obj, fileSystemsKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                fileSystemsKt = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount) Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                fileSystemsKt = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount) Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount authorizedAccount = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount) obj;
        reverseProtoWriter.getClass();
        authorizedAccount.getClass();
        reverseProtoWriter.writeBytes(authorizedAccount.unknownFields());
        FileSystemsKt fileSystemsKt = authorizedAccount.account;
        if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) fileSystemsKt).value);
        } else if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) fileSystemsKt).value);
        } else if (fileSystemsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, authorizedAccount.f1271type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount authorizedAccount = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount) obj;
        authorizedAccount.getClass();
        int encodedSizeWithTag = Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.encodedSizeWithTag(1, authorizedAccount.f1271type) + authorizedAccount.unknownFields().getSize$okio();
        FileSystemsKt fileSystemsKt = authorizedAccount.account;
        if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount.ADAPTER.encodedSizeWithTag(2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) fileSystemsKt).value) + encodedSizeWithTag;
        }
        if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount.ADAPTER.encodedSizeWithTag(3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) fileSystemsKt).value) + encodedSizeWithTag;
        }
        if (fileSystemsKt == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount authorizedAccount = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount) obj;
        authorizedAccount.getClass();
        ByteString byteString = ByteString.EMPTY;
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType accountType = authorizedAccount.f1271type;
        FileSystemsKt fileSystemsKt = authorizedAccount.account;
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount(accountType, fileSystemsKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount authorizedAccount = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount) obj;
        authorizedAccount.getClass();
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AccountType.ADAPTER.encodeWithTag(protoWriter, 1, authorizedAccount.f1271type);
        FileSystemsKt fileSystemsKt = authorizedAccount.account;
        if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SvbAccount.ADAPTER.encodeWithTag(protoWriter, 2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Svb) fileSystemsKt).value);
        } else if (fileSystemsKt instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AuthorizedAccount.SavingsAccount.ADAPTER.encodeWithTag(protoWriter, 3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccount$Account$Savings) fileSystemsKt).value);
        } else if (fileSystemsKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(authorizedAccount.unknownFields());
    }
}
