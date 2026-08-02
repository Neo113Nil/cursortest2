package com.squareup.protos.franklin.ui;

import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes8.dex */
public final class UiCryptoCurrency$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiCryptoCurrency((BitcoinDisplayUnits) obj4, (Boolean) obj5, (Boolean) obj6, (EnableCryptocurrencyTransferOutStatus) obj7, (String) obj8, (EnableCryptocurrencyTransferInStatus) obj9, (String) obj10, (Boolean) obj11, (Long) obj12, (Boolean) obj13, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    try {
                        obj4 = BitcoinDisplayUnits.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
                case 2:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 3:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 4:
                    obj = obj4;
                    obj2 = obj5;
                    try {
                        obj4 = obj;
                        obj7 = EnableCryptocurrencyTransferOutStatus.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        obj3 = obj6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                    obj5 = obj2;
                    break;
                case 5:
                    obj8 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj9 = EnableCryptocurrencyTransferInStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        obj = obj4;
                        obj2 = obj5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj11 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 9:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 10:
                    obj13 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj4;
                    obj2 = obj5;
                    obj3 = obj6;
                    obj4 = obj;
                    obj6 = obj3;
                    obj5 = obj2;
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiCryptoCurrency uiCryptoCurrency = (UiCryptoCurrency) obj;
        reverseProtoWriter.getClass();
        uiCryptoCurrency.getClass();
        reverseProtoWriter.writeBytes(uiCryptoCurrency.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, uiCryptoCurrency.has_usd_over_ln_payment);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 9, uiCryptoCurrency.accepted_crypto_terms_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, uiCryptoCurrency.bitcoin_p2p_enabled);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, uiCryptoCurrency.enable_cryptocurrency_transfer_in_button_text);
        EnableCryptocurrencyTransferInStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 6, uiCryptoCurrency.enable_cryptocurrency_transfer_in_status);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, uiCryptoCurrency.enable_cryptocurrency_transfer_out_button_text);
        EnableCryptocurrencyTransferOutStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, uiCryptoCurrency.enable_cryptocurrency_transfer_out_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiCryptoCurrency.bitcoin_deposit_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiCryptoCurrency.bitcoin_withdrawal_enabled);
        BitcoinDisplayUnits.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiCryptoCurrency.bitcoin_display_units);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiCryptoCurrency uiCryptoCurrency = (UiCryptoCurrency) obj;
        uiCryptoCurrency.getClass();
        int encodedSizeWithTag = BitcoinDisplayUnits.ADAPTER.encodedSizeWithTag(1, uiCryptoCurrency.bitcoin_display_units) + uiCryptoCurrency.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = EnableCryptocurrencyTransferOutStatus.ADAPTER.encodedSizeWithTag(4, uiCryptoCurrency.enable_cryptocurrency_transfer_out_status) + protoAdapter.encodedSizeWithTag(3, uiCryptoCurrency.bitcoin_deposit_enabled) + protoAdapter.encodedSizeWithTag(2, uiCryptoCurrency.bitcoin_withdrawal_enabled) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(10, uiCryptoCurrency.has_usd_over_ln_payment) + ProtoAdapter.INT64.encodedSizeWithTag(9, uiCryptoCurrency.accepted_crypto_terms_at) + protoAdapter.encodedSizeWithTag(8, uiCryptoCurrency.bitcoin_p2p_enabled) + protoAdapter2.encodedSizeWithTag(7, uiCryptoCurrency.enable_cryptocurrency_transfer_in_button_text) + EnableCryptocurrencyTransferInStatus.ADAPTER.encodedSizeWithTag(6, uiCryptoCurrency.enable_cryptocurrency_transfer_in_status) + protoAdapter2.encodedSizeWithTag(5, uiCryptoCurrency.enable_cryptocurrency_transfer_out_button_text) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiCryptoCurrency uiCryptoCurrency = (UiCryptoCurrency) obj;
        uiCryptoCurrency.getClass();
        ByteString byteString = ByteString.EMPTY;
        BitcoinDisplayUnits bitcoinDisplayUnits = uiCryptoCurrency.bitcoin_display_units;
        Boolean bool = uiCryptoCurrency.bitcoin_withdrawal_enabled;
        Boolean bool2 = uiCryptoCurrency.bitcoin_deposit_enabled;
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = uiCryptoCurrency.enable_cryptocurrency_transfer_out_status;
        String str = uiCryptoCurrency.enable_cryptocurrency_transfer_out_button_text;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = uiCryptoCurrency.enable_cryptocurrency_transfer_in_status;
        String str2 = uiCryptoCurrency.enable_cryptocurrency_transfer_in_button_text;
        Boolean bool3 = uiCryptoCurrency.bitcoin_p2p_enabled;
        Long l = uiCryptoCurrency.accepted_crypto_terms_at;
        Boolean bool4 = uiCryptoCurrency.has_usd_over_ln_payment;
        byteString.getClass();
        return new UiCryptoCurrency(bitcoinDisplayUnits, bool, bool2, enableCryptocurrencyTransferOutStatus, str, enableCryptocurrencyTransferInStatus, str2, bool3, l, bool4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiCryptoCurrency uiCryptoCurrency = (UiCryptoCurrency) obj;
        uiCryptoCurrency.getClass();
        BitcoinDisplayUnits.ADAPTER.encodeWithTag(protoWriter, 1, uiCryptoCurrency.bitcoin_display_units);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, uiCryptoCurrency.bitcoin_withdrawal_enabled);
        protoAdapter.encodeWithTag(protoWriter, 3, uiCryptoCurrency.bitcoin_deposit_enabled);
        EnableCryptocurrencyTransferOutStatus.ADAPTER.encodeWithTag(protoWriter, 4, uiCryptoCurrency.enable_cryptocurrency_transfer_out_status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 5, uiCryptoCurrency.enable_cryptocurrency_transfer_out_button_text);
        EnableCryptocurrencyTransferInStatus.ADAPTER.encodeWithTag(protoWriter, 6, uiCryptoCurrency.enable_cryptocurrency_transfer_in_status);
        protoAdapter2.encodeWithTag(protoWriter, 7, uiCryptoCurrency.enable_cryptocurrency_transfer_in_button_text);
        protoAdapter.encodeWithTag(protoWriter, 8, uiCryptoCurrency.bitcoin_p2p_enabled);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 9, uiCryptoCurrency.accepted_crypto_terms_at);
        protoAdapter.encodeWithTag(protoWriter, 10, uiCryptoCurrency.has_usd_over_ln_payment);
        protoWriter.writeBytes(uiCryptoCurrency.unknownFields());
    }
}
