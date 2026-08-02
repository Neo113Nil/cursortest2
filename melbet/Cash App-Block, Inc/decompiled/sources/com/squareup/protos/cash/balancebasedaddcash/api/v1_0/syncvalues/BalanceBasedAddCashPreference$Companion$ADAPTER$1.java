package com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues;

import androidx.room.TransactorKt;
import app.cash.local.primitives.ComputedOrderSummaryKt;
import com.squareup.protos.cash.balancebasedaddcash.api.v1_0.syncvalues.BalanceBasedAddCashPreference;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BalanceBasedAddCashPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        ComputedOrderSummaryKt computedOrderSummaryKt = null;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceBasedAddCashPreference(computedOrderSummaryKt, (LocalizedString) obj, (LocalizedString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                computedOrderSummaryKt = new BalanceBasedAddCashPreference$Preference$Enabled((BalanceBasedAddCashPreference.Enabled) BalanceBasedAddCashPreference.Enabled.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                computedOrderSummaryKt = new BalanceBasedAddCashPreference$Preference$Disabled((BalanceBasedAddCashPreference.Disabled) BalanceBasedAddCashPreference.Disabled.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        reverseProtoWriter.getClass();
        balanceBasedAddCashPreference.getClass();
        reverseProtoWriter.writeBytes(balanceBasedAddCashPreference.unknownFields());
        ComputedOrderSummaryKt computedOrderSummaryKt = balanceBasedAddCashPreference.preference;
        if (computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Enabled) {
            BalanceBasedAddCashPreference.Enabled.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((BalanceBasedAddCashPreference$Preference$Enabled) computedOrderSummaryKt).value);
        } else if (computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Disabled) {
            BalanceBasedAddCashPreference.Disabled.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BalanceBasedAddCashPreference$Preference$Disabled) computedOrderSummaryKt).value);
        } else if (computedOrderSummaryKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, balanceBasedAddCashPreference.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, balanceBasedAddCashPreference.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        balanceBasedAddCashPreference.getClass();
        int size$okio = balanceBasedAddCashPreference.unknownFields().getSize$okio();
        ComputedOrderSummaryKt computedOrderSummaryKt = balanceBasedAddCashPreference.preference;
        if (computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Enabled) {
            encodedSizeWithTag = BalanceBasedAddCashPreference.Enabled.ADAPTER.encodedSizeWithTag(1, ((BalanceBasedAddCashPreference$Preference$Enabled) computedOrderSummaryKt).value);
        } else {
            if (!(computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Disabled)) {
                if (computedOrderSummaryKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
                return protoAdapter.encodedSizeWithTag(4, balanceBasedAddCashPreference.subtitle) + protoAdapter.encodedSizeWithTag(3, balanceBasedAddCashPreference.title) + size$okio;
            }
            encodedSizeWithTag = BalanceBasedAddCashPreference.Disabled.ADAPTER.encodedSizeWithTag(2, ((BalanceBasedAddCashPreference$Preference$Disabled) computedOrderSummaryKt).value);
        }
        size$okio += encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(4, balanceBasedAddCashPreference.subtitle) + protoAdapter2.encodedSizeWithTag(3, balanceBasedAddCashPreference.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        balanceBasedAddCashPreference.getClass();
        LocalizedString localizedString = balanceBasedAddCashPreference.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = balanceBasedAddCashPreference.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        ComputedOrderSummaryKt computedOrderSummaryKt = balanceBasedAddCashPreference.preference;
        byteString.getClass();
        return new BalanceBasedAddCashPreference(computedOrderSummaryKt, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceBasedAddCashPreference balanceBasedAddCashPreference = (BalanceBasedAddCashPreference) obj;
        balanceBasedAddCashPreference.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, balanceBasedAddCashPreference.title);
        protoAdapter.encodeWithTag(protoWriter, 4, balanceBasedAddCashPreference.subtitle);
        ComputedOrderSummaryKt computedOrderSummaryKt = balanceBasedAddCashPreference.preference;
        if (computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Enabled) {
            BalanceBasedAddCashPreference.Enabled.ADAPTER.encodeWithTag(protoWriter, 1, ((BalanceBasedAddCashPreference$Preference$Enabled) computedOrderSummaryKt).value);
        } else if (computedOrderSummaryKt instanceof BalanceBasedAddCashPreference$Preference$Disabled) {
            BalanceBasedAddCashPreference.Disabled.ADAPTER.encodeWithTag(protoWriter, 2, ((BalanceBasedAddCashPreference$Preference$Disabled) computedOrderSummaryKt).value);
        } else if (computedOrderSummaryKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(balanceBasedAddCashPreference.unknownFields());
    }
}
