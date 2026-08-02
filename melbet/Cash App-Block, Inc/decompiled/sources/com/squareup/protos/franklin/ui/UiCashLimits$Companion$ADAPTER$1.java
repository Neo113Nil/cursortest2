package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.StaticLimitGroup;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiCashLimits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiCashLimits((StaticLimitGroup) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(StaticLimitGroup.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiCashLimits uiCashLimits = (UiCashLimits) obj;
        reverseProtoWriter.getClass();
        uiCashLimits.getClass();
        reverseProtoWriter.writeBytes(uiCashLimits.unknownFields());
        StaticLimitGroup.ADAPTER.encodeWithTag(reverseProtoWriter, 1, uiCashLimits.cash_limit_group);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiCashLimits uiCashLimits = (UiCashLimits) obj;
        uiCashLimits.getClass();
        return StaticLimitGroup.ADAPTER.encodedSizeWithTag(1, uiCashLimits.cash_limit_group) + uiCashLimits.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiCashLimits uiCashLimits = (UiCashLimits) obj;
        uiCashLimits.getClass();
        StaticLimitGroup staticLimitGroup = uiCashLimits.cash_limit_group;
        StaticLimitGroup staticLimitGroup2 = staticLimitGroup != null ? (StaticLimitGroup) StaticLimitGroup.ADAPTER.redact(staticLimitGroup) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiCashLimits(staticLimitGroup2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiCashLimits uiCashLimits = (UiCashLimits) obj;
        uiCashLimits.getClass();
        StaticLimitGroup.ADAPTER.encodeWithTag(protoWriter, 1, uiCashLimits.cash_limit_group);
        protoWriter.writeBytes(uiCashLimits.unknownFields());
    }
}
