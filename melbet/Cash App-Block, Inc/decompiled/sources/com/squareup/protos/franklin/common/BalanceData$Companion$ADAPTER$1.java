package com.squareup.protos.franklin.common;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BalanceData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x003b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        Object obj3;
        ?? r0;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Boolean bool = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        String str = null;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = null;
        String str2 = null;
        Object obj7 = null;
        Boolean bool2 = null;
        Object obj8 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Integer num = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BalanceData(m, bool, num, bool5, enableCryptocurrencyTransferOutStatus, str, enableCryptocurrencyTransferInStatus, str2, arrayList, (ScheduledReloadData) obj7, bool2, (ScheduledReloadData) obj8, bool3, bool4, (BalanceData.Button) obj4, (BalanceData.Button) obj5, (BalanceData.Button) obj6, bool6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                if (nextTag != 2) {
                    if (nextTag == 3) {
                        num = ProtoAdapter.INT32.decode(protoReader);
                    } else if (nextTag != 4) {
                        switch (nextTag) {
                            case 8:
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                try {
                                    enableCryptocurrencyTransferOutStatus = EnableCryptocurrencyTransferOutStatus.ADAPTER.decode(protoReader);
                                    obj4 = obj;
                                    obj6 = obj3;
                                    obj5 = obj2;
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            case 9:
                                str = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 10:
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                arrayList.add(StaticLimitGroup.ADAPTER.decode(protoReader));
                                break;
                            case 11:
                                obj7 = TransactorKt.decodeMessageOrMerge(ScheduledReloadData.ADAPTER, protoReader, obj7);
                                break;
                            case 12:
                                bool2 = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 13:
                                try {
                                    enableCryptocurrencyTransferInStatus = EnableCryptocurrencyTransferInStatus.ADAPTER.decode(protoReader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    obj = obj4;
                                    obj2 = obj5;
                                    obj3 = obj6;
                                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                    break;
                                }
                            case 14:
                                str2 = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                obj8 = TransactorKt.decodeMessageOrMerge(ScheduledReloadData.ADAPTER, protoReader, obj8);
                                break;
                            case 16:
                                bool3 = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 17:
                                bool4 = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 18:
                                obj4 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj4);
                                break;
                            case 19:
                                obj5 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj5);
                                break;
                            case 20:
                                obj6 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj6);
                                break;
                            case 21:
                                bool6 = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            default:
                                protoReader.readUnknownField(nextTag);
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                break;
                        }
                    } else {
                        bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                    r0 = bool;
                } else {
                    r0 = ProtoAdapter.BOOL.decode(protoReader);
                }
                bool = r0;
            } else {
                obj = obj4;
                obj2 = obj5;
                obj3 = obj6;
                m.add(TransferInstrumentMap.ADAPTER.decode(protoReader));
            }
            r0 = bool;
            obj4 = obj;
            obj6 = obj3;
            obj5 = obj2;
            bool = r0;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BalanceData balanceData = (BalanceData) obj;
        reverseProtoWriter.getClass();
        balanceData.getClass();
        reverseProtoWriter.writeBytes(balanceData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, balanceData.bitcoin_p2p_enabled);
        ProtoAdapter protoAdapter2 = BalanceData.Button.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 20, balanceData.dda_form);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, balanceData.deposit_check);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, balanceData.direct_deposit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, balanceData.check_deposits_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, balanceData.scheduled_btc_buy_enabled);
        ProtoAdapter protoAdapter3 = ScheduledReloadData.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 15, balanceData.scheduled_btc_buy_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, balanceData.scheduled_reload_enabled);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 11, balanceData.scheduled_reload_data);
        StaticLimitGroup.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 10, balanceData.balance_limit_groups);
        ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 14, balanceData.enable_cryptocurrency_transfer_in_button_text);
        EnableCryptocurrencyTransferInStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 13, balanceData.enable_cryptocurrency_transfer_in_status);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 9, balanceData.enable_cryptocurrency_transfer_out_button_text);
        EnableCryptocurrencyTransferOutStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 8, balanceData.enable_cryptocurrency_transfer_out_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, balanceData.adding_cash_enabled);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, balanceData.cash_balance_home_screen_button_priority);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, balanceData.cash_balance_home_screen_button_enabled);
        TransferInstrumentMap.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, balanceData.supported_transfer_instruments);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BalanceData balanceData = (BalanceData) obj;
        balanceData.getClass();
        int encodedSizeWithTag = TransferInstrumentMap.ADAPTER.asRepeated().encodedSizeWithTag(1, balanceData.supported_transfer_instruments) + balanceData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag2 = EnableCryptocurrencyTransferOutStatus.ADAPTER.encodedSizeWithTag(8, balanceData.enable_cryptocurrency_transfer_out_status) + protoAdapter.encodedSizeWithTag(4, balanceData.adding_cash_enabled) + ProtoAdapter.INT32.encodedSizeWithTag(3, balanceData.cash_balance_home_screen_button_priority) + protoAdapter.encodedSizeWithTag(2, balanceData.cash_balance_home_screen_button_enabled) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag3 = StaticLimitGroup.ADAPTER.asRepeated().encodedSizeWithTag(10, balanceData.balance_limit_groups) + protoAdapter2.encodedSizeWithTag(14, balanceData.enable_cryptocurrency_transfer_in_button_text) + EnableCryptocurrencyTransferInStatus.ADAPTER.encodedSizeWithTag(13, balanceData.enable_cryptocurrency_transfer_in_status) + protoAdapter2.encodedSizeWithTag(9, balanceData.enable_cryptocurrency_transfer_out_button_text) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = ScheduledReloadData.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(17, balanceData.check_deposits_enabled) + protoAdapter.encodedSizeWithTag(16, balanceData.scheduled_btc_buy_enabled) + protoAdapter3.encodedSizeWithTag(15, balanceData.scheduled_btc_buy_data) + protoAdapter.encodedSizeWithTag(12, balanceData.scheduled_reload_enabled) + protoAdapter3.encodedSizeWithTag(11, balanceData.scheduled_reload_data) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter4 = BalanceData.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(21, balanceData.bitcoin_p2p_enabled) + protoAdapter4.encodedSizeWithTag(20, balanceData.dda_form) + protoAdapter4.encodedSizeWithTag(19, balanceData.deposit_check) + protoAdapter4.encodedSizeWithTag(18, balanceData.direct_deposit) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BalanceData balanceData = (BalanceData) obj;
        balanceData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(balanceData.supported_transfer_instruments, TransferInstrumentMap.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(balanceData.balance_limit_groups, StaticLimitGroup.ADAPTER);
        ScheduledReloadData scheduledReloadData = balanceData.scheduled_reload_data;
        ScheduledReloadData scheduledReloadData2 = scheduledReloadData != null ? (ScheduledReloadData) ScheduledReloadData.ADAPTER.redact(scheduledReloadData) : null;
        ScheduledReloadData scheduledReloadData3 = balanceData.scheduled_btc_buy_data;
        ScheduledReloadData scheduledReloadData4 = scheduledReloadData3 != null ? (ScheduledReloadData) ScheduledReloadData.ADAPTER.redact(scheduledReloadData3) : null;
        BalanceData.Button button = balanceData.direct_deposit;
        BalanceData.Button button2 = button != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button) : null;
        BalanceData.Button button3 = balanceData.deposit_check;
        BalanceData.Button button4 = button3 != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button3) : null;
        BalanceData.Button button5 = balanceData.dda_form;
        BalanceData.Button button6 = button5 != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button5) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = balanceData.cash_balance_home_screen_button_enabled;
        Integer num = balanceData.cash_balance_home_screen_button_priority;
        Boolean bool2 = balanceData.adding_cash_enabled;
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = balanceData.enable_cryptocurrency_transfer_out_status;
        String str = balanceData.enable_cryptocurrency_transfer_out_button_text;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = balanceData.enable_cryptocurrency_transfer_in_status;
        String str2 = balanceData.enable_cryptocurrency_transfer_in_button_text;
        Boolean bool3 = balanceData.scheduled_reload_enabled;
        Boolean bool4 = balanceData.scheduled_btc_buy_enabled;
        Boolean bool5 = balanceData.check_deposits_enabled;
        Boolean bool6 = balanceData.bitcoin_p2p_enabled;
        byteString.getClass();
        return new BalanceData(m1169redactElements, bool, num, bool2, enableCryptocurrencyTransferOutStatus, str, enableCryptocurrencyTransferInStatus, str2, m1169redactElements2, scheduledReloadData2, bool3, scheduledReloadData4, bool4, bool5, button2, button4, button6, bool6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BalanceData balanceData = (BalanceData) obj;
        balanceData.getClass();
        TransferInstrumentMap.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, balanceData.supported_transfer_instruments);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, balanceData.cash_balance_home_screen_button_enabled);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, balanceData.cash_balance_home_screen_button_priority);
        protoAdapter.encodeWithTag(protoWriter, 4, balanceData.adding_cash_enabled);
        EnableCryptocurrencyTransferOutStatus.ADAPTER.encodeWithTag(protoWriter, 8, balanceData.enable_cryptocurrency_transfer_out_status);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 9, balanceData.enable_cryptocurrency_transfer_out_button_text);
        EnableCryptocurrencyTransferInStatus.ADAPTER.encodeWithTag(protoWriter, 13, balanceData.enable_cryptocurrency_transfer_in_status);
        protoAdapter2.encodeWithTag(protoWriter, 14, balanceData.enable_cryptocurrency_transfer_in_button_text);
        StaticLimitGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 10, balanceData.balance_limit_groups);
        ProtoAdapter protoAdapter3 = ScheduledReloadData.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 11, balanceData.scheduled_reload_data);
        protoAdapter.encodeWithTag(protoWriter, 12, balanceData.scheduled_reload_enabled);
        protoAdapter3.encodeWithTag(protoWriter, 15, balanceData.scheduled_btc_buy_data);
        protoAdapter.encodeWithTag(protoWriter, 16, balanceData.scheduled_btc_buy_enabled);
        protoAdapter.encodeWithTag(protoWriter, 17, balanceData.check_deposits_enabled);
        ProtoAdapter protoAdapter4 = BalanceData.Button.ADAPTER;
        protoAdapter4.encodeWithTag(protoWriter, 18, balanceData.direct_deposit);
        protoAdapter4.encodeWithTag(protoWriter, 19, balanceData.deposit_check);
        protoAdapter4.encodeWithTag(protoWriter, 20, balanceData.dda_form);
        protoAdapter.encodeWithTag(protoWriter, 21, balanceData.bitcoin_p2p_enabled);
        protoWriter.writeBytes(balanceData.unknownFields());
    }
}
