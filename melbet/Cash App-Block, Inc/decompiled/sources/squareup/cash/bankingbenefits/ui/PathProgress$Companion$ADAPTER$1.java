package squareup.cash.bankingbenefits.ui;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class PathProgress$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        PathProgress$Progress$Spend pathProgress$Progress$Spend = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PathProgress(pathProgress$Progress$Spend, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                pathProgress$Progress$Spend = new PathProgress$Progress$Spend((SpendPathProgress) SpendPathProgress.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PathProgress pathProgress = (PathProgress) obj;
        reverseProtoWriter.getClass();
        pathProgress.getClass();
        reverseProtoWriter.writeBytes(pathProgress.unknownFields());
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress.progress;
        if (pathProgress$Progress$Spend != null) {
            SpendPathProgress.ADAPTER.encodeWithTag(reverseProtoWriter, 1, pathProgress$Progress$Spend.value);
        } else {
            if (pathProgress$Progress$Spend == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PathProgress pathProgress = (PathProgress) obj;
        pathProgress.getClass();
        int size$okio = pathProgress.unknownFields().getSize$okio();
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress.progress;
        if (pathProgress$Progress$Spend != null) {
            return SpendPathProgress.ADAPTER.encodedSizeWithTag(1, pathProgress$Progress$Spend.value) + size$okio;
        }
        if (pathProgress$Progress$Spend == null) {
            return size$okio;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PathProgress pathProgress = (PathProgress) obj;
        pathProgress.getClass();
        ByteString byteString = ByteString.EMPTY;
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress.progress;
        byteString.getClass();
        return new PathProgress(pathProgress$Progress$Spend, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PathProgress pathProgress = (PathProgress) obj;
        pathProgress.getClass();
        PathProgress$Progress$Spend pathProgress$Progress$Spend = pathProgress.progress;
        if (pathProgress$Progress$Spend != null) {
            SpendPathProgress.ADAPTER.encodeWithTag(protoWriter, 1, pathProgress$Progress$Spend.value);
        } else if (pathProgress$Progress$Spend != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(pathProgress.unknownFields());
    }
}
