package com.squareup.lending;

import androidx.room.TransactorKt;
import app.cash.local.presenters.internal.CashBalanceKt;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.Toggle;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PrepurchaseCashCardAppletData$FooterButtonContent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        CashBalanceKt cashBalanceKt = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PrepurchaseCashCardAppletData.FooterButtonContent((LocalizedString) obj, cashBalanceKt, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                cashBalanceKt = new PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss((PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss) PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                cashBalanceKt = new PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle((Toggle) Toggle.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                cashBalanceKt = new PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute((String) ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent = (PrepurchaseCashCardAppletData.FooterButtonContent) obj;
        reverseProtoWriter.getClass();
        footerButtonContent.getClass();
        reverseProtoWriter.writeBytes(footerButtonContent.unknownFields());
        CashBalanceKt cashBalanceKt = footerButtonContent.action;
        if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) {
            PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) cashBalanceKt).value);
        } else if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) {
            Toggle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) cashBalanceKt).value);
        } else if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) cashBalanceKt).value);
        } else if (cashBalanceKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, footerButtonContent.should_action_dismiss_half_sheet);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, footerButtonContent.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent = (PrepurchaseCashCardAppletData.FooterButtonContent) obj;
        footerButtonContent.getClass();
        int encodedSizeWithTag2 = LocalizedString.ADAPTER.encodedSizeWithTag(1, footerButtonContent.text) + footerButtonContent.unknownFields().getSize$okio();
        CashBalanceKt cashBalanceKt = footerButtonContent.action;
        if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) {
            encodedSizeWithTag = PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss.ADAPTER.encodedSizeWithTag(2, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) cashBalanceKt).value);
        } else if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) {
            encodedSizeWithTag = Toggle.ADAPTER.encodedSizeWithTag(3, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) cashBalanceKt).value);
        } else {
            if (!(cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute)) {
                if (cashBalanceKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return ProtoAdapter.BOOL.encodedSizeWithTag(5, footerButtonContent.should_action_dismiss_half_sheet) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(4, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) cashBalanceKt).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return ProtoAdapter.BOOL.encodedSizeWithTag(5, footerButtonContent.should_action_dismiss_half_sheet) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent = (PrepurchaseCashCardAppletData.FooterButtonContent) obj;
        footerButtonContent.getClass();
        LocalizedString localizedString = footerButtonContent.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        CashBalanceKt cashBalanceKt = footerButtonContent.action;
        Boolean bool = footerButtonContent.should_action_dismiss_half_sheet;
        byteString.getClass();
        return new PrepurchaseCashCardAppletData.FooterButtonContent(localizedString2, cashBalanceKt, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PrepurchaseCashCardAppletData.FooterButtonContent footerButtonContent = (PrepurchaseCashCardAppletData.FooterButtonContent) obj;
        footerButtonContent.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, footerButtonContent.text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, footerButtonContent.should_action_dismiss_half_sheet);
        CashBalanceKt cashBalanceKt = footerButtonContent.action;
        if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) {
            PrepurchaseCashCardAppletData.FooterButtonContent.Dismiss.ADAPTER.encodeWithTag(protoWriter, 2, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Dismiss) cashBalanceKt).value);
        } else if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) {
            Toggle.ADAPTER.encodeWithTag(protoWriter, 3, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$Toggle) cashBalanceKt).value);
        } else if (cashBalanceKt instanceof PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, ((PrepurchaseCashCardAppletData$FooterButtonContent$Action$ClientRoute) cashBalanceKt).value);
        } else if (cashBalanceKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(footerButtonContent.unknownFields());
    }
}
