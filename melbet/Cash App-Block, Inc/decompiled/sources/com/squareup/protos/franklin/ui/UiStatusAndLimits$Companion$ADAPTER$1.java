package com.squareup.protos.franklin.ui;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.StaticLimitGroup;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UiStatusAndLimits$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiStatusAndLimits((Boolean) obj, (Boolean) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(StaticLimitGroup.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
        reverseProtoWriter.getClass();
        uiStatusAndLimits.getClass();
        reverseProtoWriter.writeBytes(uiStatusAndLimits.unknownFields());
        StaticLimitGroup.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, uiStatusAndLimits.balance_limit_groups);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, uiStatusAndLimits.adding_cash_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, uiStatusAndLimits.has_passed_idv);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
        uiStatusAndLimits.getClass();
        int size$okio = uiStatusAndLimits.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return StaticLimitGroup.ADAPTER.asRepeated().encodedSizeWithTag(3, uiStatusAndLimits.balance_limit_groups) + protoAdapter.encodedSizeWithTag(2, uiStatusAndLimits.adding_cash_enabled) + protoAdapter.encodedSizeWithTag(1, uiStatusAndLimits.has_passed_idv) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
        uiStatusAndLimits.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(uiStatusAndLimits.balance_limit_groups, StaticLimitGroup.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uiStatusAndLimits.has_passed_idv;
        Boolean bool2 = uiStatusAndLimits.adding_cash_enabled;
        byteString.getClass();
        return new UiStatusAndLimits(bool, bool2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiStatusAndLimits uiStatusAndLimits = (UiStatusAndLimits) obj;
        uiStatusAndLimits.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, uiStatusAndLimits.has_passed_idv);
        protoAdapter.encodeWithTag(protoWriter, 2, uiStatusAndLimits.adding_cash_enabled);
        StaticLimitGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, uiStatusAndLimits.balance_limit_groups);
        protoWriter.writeBytes(uiStatusAndLimits.unknownFields());
    }
}
