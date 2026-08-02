package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.franklin.common.DirectDepositAccount;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiDda$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiDda((DirectDepositAccount) obj, (Boolean) obj2, (BalanceData.Button) obj3, (BalanceData.Button) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DirectDepositAccount.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiDda uiDda = (UiDda) obj;
        reverseProtoWriter.getClass();
        uiDda.getClass();
        reverseProtoWriter.writeBytes(uiDda.unknownFields());
        ProtoAdapter protoAdapter = BalanceData.Button.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, uiDda.dda_form);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, uiDda.button);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uiDda.enabled);
        DirectDepositAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiDda.account);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiDda uiDda = (UiDda) obj;
        uiDda.getClass();
        int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(2, uiDda.enabled) + DirectDepositAccount.ADAPTER.encodedSizeWithTag(1, uiDda.account) + uiDda.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = BalanceData.Button.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, uiDda.dda_form) + protoAdapter.encodedSizeWithTag(3, uiDda.button) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiDda uiDda = (UiDda) obj;
        uiDda.getClass();
        DirectDepositAccount directDepositAccount = uiDda.account;
        DirectDepositAccount directDepositAccount2 = directDepositAccount != null ? (DirectDepositAccount) DirectDepositAccount.ADAPTER.redact(directDepositAccount) : null;
        BalanceData.Button button = uiDda.button;
        BalanceData.Button button2 = button != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button) : null;
        BalanceData.Button button3 = uiDda.dda_form;
        BalanceData.Button button4 = button3 != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button3) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiDda.enabled;
        byteString.getClass();
        return new UiDda(directDepositAccount2, bool, button2, button4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiDda uiDda = (UiDda) obj;
        uiDda.getClass();
        DirectDepositAccount.ADAPTER.encodeWithTag(protoWriter, 1, uiDda.account);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uiDda.enabled);
        ProtoAdapter protoAdapter = BalanceData.Button.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, uiDda.button);
        protoAdapter.encodeWithTag(protoWriter, 4, uiDda.dda_form);
        protoWriter.writeBytes(uiDda.unknownFields());
    }
}
