package com.squareup.lending;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.lending.CashCreditScoreEntryPointData;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashCreditScoreEntryPointData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashCreditScoreEntryPointData(m, (CashCreditScoreEntryPointData.UninstalledState) obj, (CashCreditScoreEntryPointData.InstalledState) obj2, (CashCreditScoreEntryPointData.Action) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppSupport.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(CashCreditScoreEntryPointData.UninstalledState.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(CashCreditScoreEntryPointData.InstalledState.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(CashCreditScoreEntryPointData.Action.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) obj;
        reverseProtoWriter.getClass();
        cashCreditScoreEntryPointData.getClass();
        reverseProtoWriter.writeBytes(cashCreditScoreEntryPointData.unknownFields());
        CashCreditScoreEntryPointData.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 4, cashCreditScoreEntryPointData.action);
        CashCreditScoreEntryPointData.InstalledState.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashCreditScoreEntryPointData.installed_state);
        CashCreditScoreEntryPointData.UninstalledState.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashCreditScoreEntryPointData.uninstalled_state);
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, cashCreditScoreEntryPointData.app_supports);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) obj;
        cashCreditScoreEntryPointData.getClass();
        return CashCreditScoreEntryPointData.Action.ADAPTER.encodedSizeWithTag(4, cashCreditScoreEntryPointData.action) + CashCreditScoreEntryPointData.InstalledState.ADAPTER.encodedSizeWithTag(3, cashCreditScoreEntryPointData.installed_state) + CashCreditScoreEntryPointData.UninstalledState.ADAPTER.encodedSizeWithTag(2, cashCreditScoreEntryPointData.uninstalled_state) + AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, cashCreditScoreEntryPointData.app_supports) + cashCreditScoreEntryPointData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) obj;
        cashCreditScoreEntryPointData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashCreditScoreEntryPointData.app_supports, AppSupport.ADAPTER);
        CashCreditScoreEntryPointData.UninstalledState uninstalledState = cashCreditScoreEntryPointData.uninstalled_state;
        CashCreditScoreEntryPointData.UninstalledState uninstalledState2 = uninstalledState != null ? (CashCreditScoreEntryPointData.UninstalledState) CashCreditScoreEntryPointData.UninstalledState.ADAPTER.redact(uninstalledState) : null;
        CashCreditScoreEntryPointData.InstalledState installedState = cashCreditScoreEntryPointData.installed_state;
        CashCreditScoreEntryPointData.InstalledState installedState2 = installedState != null ? (CashCreditScoreEntryPointData.InstalledState) CashCreditScoreEntryPointData.InstalledState.ADAPTER.redact(installedState) : null;
        CashCreditScoreEntryPointData.Action action = cashCreditScoreEntryPointData.action;
        CashCreditScoreEntryPointData.Action action2 = action != null ? (CashCreditScoreEntryPointData.Action) CashCreditScoreEntryPointData.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashCreditScoreEntryPointData(m1169redactElements, uninstalledState2, installedState2, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashCreditScoreEntryPointData cashCreditScoreEntryPointData = (CashCreditScoreEntryPointData) obj;
        cashCreditScoreEntryPointData.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, cashCreditScoreEntryPointData.app_supports);
        CashCreditScoreEntryPointData.UninstalledState.ADAPTER.encodeWithTag(protoWriter, 2, cashCreditScoreEntryPointData.uninstalled_state);
        CashCreditScoreEntryPointData.InstalledState.ADAPTER.encodeWithTag(protoWriter, 3, cashCreditScoreEntryPointData.installed_state);
        CashCreditScoreEntryPointData.Action.ADAPTER.encodeWithTag(protoWriter, 4, cashCreditScoreEntryPointData.action);
        protoWriter.writeBytes(cashCreditScoreEntryPointData.unknownFields());
    }
}
