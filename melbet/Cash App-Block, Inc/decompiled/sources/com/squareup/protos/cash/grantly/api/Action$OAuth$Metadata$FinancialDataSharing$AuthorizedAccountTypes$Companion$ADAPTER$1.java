package com.squareup.protos.cash.grantly.api;

import coil3.util.IntPair;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        IntPair intPair = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type) obj, intPair, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                intPair = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes) Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes.ADAPTER.decode(protoReader));
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                intPair = new Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes((Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes) Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) obj;
        reverseProtoWriter.getClass();
        authorizedAccountTypes.getClass();
        reverseProtoWriter.writeBytes(authorizedAccountTypes.unknownFields());
        IntPair intPair = authorizedAccountTypes.authorized_account_types;
        if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) intPair).value);
        } else if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) intPair).value);
        } else if (intPair != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, authorizedAccountTypes.f1270type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) obj;
        authorizedAccountTypes.getClass();
        int encodedSizeWithTag = Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type.ADAPTER.encodedSizeWithTag(1, authorizedAccountTypes.f1270type) + authorizedAccountTypes.unknownFields().getSize$okio();
        IntPair intPair = authorizedAccountTypes.authorized_account_types;
        if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes.ADAPTER.encodedSizeWithTag(2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) intPair).value) + encodedSizeWithTag;
        }
        if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) {
            return Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes.ADAPTER.encodedSizeWithTag(3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) intPair).value) + encodedSizeWithTag;
        }
        if (intPair == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) obj;
        authorizedAccountTypes.getClass();
        ByteString byteString = ByteString.EMPTY;
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type type2 = authorizedAccountTypes.f1270type;
        IntPair intPair = authorizedAccountTypes.authorized_account_types;
        byteString.getClass();
        return new Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes(type2, intPair, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes authorizedAccountTypes = (Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes) obj;
        authorizedAccountTypes.getClass();
        Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.Type.ADAPTER.encodeWithTag(protoWriter, 1, authorizedAccountTypes.f1270type);
        IntPair intPair = authorizedAccountTypes.authorized_account_types;
        if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.AllAccountTypes.ADAPTER.encodeWithTag(protoWriter, 2, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$AllAccountTypes) intPair).value);
        } else if (intPair instanceof Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) {
            Action.OAuth.Metadata.FinancialDataSharing.AuthorizedAccountTypes.LimitedAccountTypes.ADAPTER.encodeWithTag(protoWriter, 3, ((Action$OAuth$Metadata$FinancialDataSharing$AuthorizedAccountTypes$AuthorizedAccountTypes$LimitedAccountTypes) intPair).value);
        } else if (intPair != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(authorizedAccountTypes.unknownFields());
    }
}
