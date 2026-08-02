package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.kgoose.api.v3.ProgressRing;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/ProgressRing$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/ProgressRing;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProgressRing$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProgressRing((Double) obj, (Color) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(ProgressRing.ProgressRingContent.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProgressRing progressRing = (ProgressRing) obj;
        reverseProtoWriter.getClass();
        progressRing.getClass();
        reverseProtoWriter.writeBytes(progressRing.unknownFields());
        ProgressRing.ProgressRingContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, progressRing.contents);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, progressRing.color);
        ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 1, progressRing.fraction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProgressRing progressRing = (ProgressRing) obj;
        progressRing.getClass();
        return ProgressRing.ProgressRingContent.ADAPTER.asRepeated().encodedSizeWithTag(3, progressRing.contents) + Color.ADAPTER.encodedSizeWithTag(2, progressRing.color) + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, progressRing.fraction) + progressRing.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProgressRing progressRing = (ProgressRing) obj;
        progressRing.getClass();
        Color color = progressRing.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(progressRing.contents, ProgressRing.ProgressRingContent.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Double d = progressRing.fraction;
        byteString.getClass();
        return new ProgressRing(d, color2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProgressRing progressRing = (ProgressRing) obj;
        progressRing.getClass();
        ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, progressRing.fraction);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, progressRing.color);
        ProgressRing.ProgressRingContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, progressRing.contents);
        protoWriter.writeBytes(progressRing.unknownFields());
    }
}
