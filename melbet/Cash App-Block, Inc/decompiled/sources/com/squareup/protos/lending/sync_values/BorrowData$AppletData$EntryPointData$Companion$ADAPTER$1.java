package com.squareup.protos.lending.sync_values;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzji;
import com.google.android.gms.internal.mlkit_vision_face.zzjj;
import com.squareup.protos.lending.app_support.AppSupport;
import com.squareup.protos.lending.sync_values.BorrowData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BorrowData$AppletData$EntryPointData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        zzji zzjiVar = null;
        zzjj zzjjVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BorrowData.AppletData.EntryPointData(m, zzjiVar, zzjjVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    m.add(AppSupport.ADAPTER.decode(protoReader));
                    break;
                case 2:
                    zzjiVar = new BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint((BorrowData.AppletData.EntryPointData.HiddenEntryPoint) BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.decode(protoReader));
                    break;
                case 3:
                    zzjiVar = new BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint((BorrowData.AppletData.EntryPointData.RowEntryPoint) BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    zzjjVar = new BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2((BorrowData.AppletData.EntryPointData.HiddenEntryPoint) BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.decode(protoReader));
                    break;
                case 5:
                    zzjjVar = new BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2((BorrowData.AppletData.EntryPointData.RowEntryPoint) BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    zzjjVar = new BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2((BorrowData.AppletData.EntryPointData.TileEntryPoint) BorrowData.AppletData.EntryPointData.TileEntryPoint.ADAPTER.decode(protoReader));
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) obj;
        reverseProtoWriter.getClass();
        entryPointData.getClass();
        reverseProtoWriter.writeBytes(entryPointData.unknownFields());
        zzjj zzjjVar = entryPointData.entry_point_v2;
        if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) {
            BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) zzjjVar).value);
        } else if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) {
            BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 5, ((BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) zzjjVar).value);
        } else if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar).value);
        } else if (zzjjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzji zzjiVar = entryPointData.entry_point;
        if (zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) {
            BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) zzjiVar).value);
        } else if (zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) {
            BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) zzjiVar).value);
        } else if (zzjiVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        AppSupport.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, entryPointData.app_supports);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // com.squareup.wire.ProtoAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        zzjj zzjjVar;
        int encodedSizeWithTag2;
        BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) obj;
        entryPointData.getClass();
        int encodedSizeWithTag3 = AppSupport.ADAPTER.asRepeated().encodedSizeWithTag(1, entryPointData.app_supports) + entryPointData.unknownFields().getSize$okio();
        zzji zzjiVar = entryPointData.entry_point;
        if (zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) {
            encodedSizeWithTag = BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodedSizeWithTag(2, ((BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) zzjiVar).value);
        } else {
            if (!(zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint)) {
                if (zzjiVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                zzjjVar = entryPointData.entry_point_v2;
                if (!(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2)) {
                    encodedSizeWithTag2 = BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodedSizeWithTag(4, ((BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) zzjjVar).value);
                } else if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) {
                    encodedSizeWithTag2 = BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodedSizeWithTag(5, ((BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) zzjjVar).value);
                } else {
                    if (!(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2)) {
                        if (zzjjVar == null) {
                            return encodedSizeWithTag3;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                    encodedSizeWithTag2 = BorrowData.AppletData.EntryPointData.TileEntryPoint.ADAPTER.encodedSizeWithTag(6, ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar).value);
                }
                return encodedSizeWithTag2 + encodedSizeWithTag3;
            }
            encodedSizeWithTag = BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodedSizeWithTag(3, ((BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) zzjiVar).value);
        }
        encodedSizeWithTag3 += encodedSizeWithTag;
        zzjjVar = entryPointData.entry_point_v2;
        if (!(zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2)) {
        }
        return encodedSizeWithTag2 + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) obj;
        entryPointData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(entryPointData.app_supports, AppSupport.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        zzji zzjiVar = entryPointData.entry_point;
        zzjj zzjjVar = entryPointData.entry_point_v2;
        byteString.getClass();
        return new BorrowData.AppletData.EntryPointData(m1169redactElements, zzjiVar, zzjjVar, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BorrowData.AppletData.EntryPointData entryPointData = (BorrowData.AppletData.EntryPointData) obj;
        entryPointData.getClass();
        AppSupport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, entryPointData.app_supports);
        zzji zzjiVar = entryPointData.entry_point;
        if (zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) {
            BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodeWithTag(protoWriter, 2, ((BorrowData$AppletData$EntryPointData$EntryPoint$HiddenEntryPoint) zzjiVar).value);
        } else if (zzjiVar instanceof BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) {
            BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(protoWriter, 3, ((BorrowData$AppletData$EntryPointData$EntryPoint$RowEntryPoint) zzjiVar).value);
        } else if (zzjiVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        zzjj zzjjVar = entryPointData.entry_point_v2;
        if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) {
            BorrowData.AppletData.EntryPointData.HiddenEntryPoint.ADAPTER.encodeWithTag(protoWriter, 4, ((BorrowData$AppletData$EntryPointData$EntryPointV2$HiddenEntryPointV2) zzjjVar).value);
        } else if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) {
            BorrowData.AppletData.EntryPointData.RowEntryPoint.ADAPTER.encodeWithTag(protoWriter, 5, ((BorrowData$AppletData$EntryPointData$EntryPointV2$RowEntryPointV2) zzjjVar).value);
        } else if (zzjjVar instanceof BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) {
            BorrowData.AppletData.EntryPointData.TileEntryPoint.ADAPTER.encodeWithTag(protoWriter, 6, ((BorrowData$AppletData$EntryPointData$EntryPointV2$TileEntryPointV2) zzjjVar).value);
        } else if (zzjjVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(entryPointData.unknownFields());
    }
}
