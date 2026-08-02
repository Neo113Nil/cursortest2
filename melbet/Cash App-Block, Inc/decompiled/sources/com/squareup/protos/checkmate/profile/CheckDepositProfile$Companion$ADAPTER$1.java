package com.squareup.protos.checkmate.profile;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CheckDepositProfile$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CheckDepositProfile((Boolean) obj, (BalanceData.Button) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(BalanceData.Button.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CheckDepositProfile checkDepositProfile = (CheckDepositProfile) obj;
        reverseProtoWriter.getClass();
        checkDepositProfile.getClass();
        reverseProtoWriter.writeBytes(checkDepositProfile.unknownFields());
        BalanceData.Button.ADAPTER.encodeWithTag(reverseProtoWriter, 2, checkDepositProfile.deposit_check);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, checkDepositProfile.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CheckDepositProfile checkDepositProfile = (CheckDepositProfile) obj;
        checkDepositProfile.getClass();
        return BalanceData.Button.ADAPTER.encodedSizeWithTag(2, checkDepositProfile.deposit_check) + ProtoAdapter.BOOL.encodedSizeWithTag(1, checkDepositProfile.enabled) + checkDepositProfile.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CheckDepositProfile checkDepositProfile = (CheckDepositProfile) obj;
        checkDepositProfile.getClass();
        BalanceData.Button button = checkDepositProfile.deposit_check;
        BalanceData.Button button2 = button != null ? (BalanceData.Button) BalanceData.Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = checkDepositProfile.enabled;
        byteString.getClass();
        return new CheckDepositProfile(bool, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CheckDepositProfile checkDepositProfile = (CheckDepositProfile) obj;
        checkDepositProfile.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, checkDepositProfile.enabled);
        BalanceData.Button.ADAPTER.encodeWithTag(protoWriter, 2, checkDepositProfile.deposit_check);
        protoWriter.writeBytes(checkDepositProfile.unknownFields());
    }
}
