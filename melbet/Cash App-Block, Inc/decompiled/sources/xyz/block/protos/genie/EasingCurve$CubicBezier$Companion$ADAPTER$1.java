package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class EasingCurve$CubicBezier$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.DOUBLE.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.DOUBLE.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Double d = (Double) obj;
        if (d == null) {
            TransactorKt.missingRequiredFields(obj, "x1");
            throw null;
        }
        double doubleValue = d.doubleValue();
        Double d2 = (Double) obj2;
        if (d2 == null) {
            TransactorKt.missingRequiredFields(obj2, "y1");
            throw null;
        }
        double doubleValue2 = d2.doubleValue();
        Double d3 = (Double) obj3;
        if (d3 == null) {
            TransactorKt.missingRequiredFields(obj3, "x2");
            throw null;
        }
        double doubleValue3 = d3.doubleValue();
        Double d4 = (Double) obj4;
        if (d4 != null) {
            return new EasingCurve.CubicBezier(doubleValue, doubleValue2, doubleValue3, d4.doubleValue(), endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "y2");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EasingCurve.CubicBezier cubicBezier = (EasingCurve.CubicBezier) obj;
        reverseProtoWriter.getClass();
        cubicBezier.getClass();
        reverseProtoWriter.writeBytes(cubicBezier.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, Double.valueOf(cubicBezier.y2));
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, Double.valueOf(cubicBezier.x2));
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, Double.valueOf(cubicBezier.y1));
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, Double.valueOf(cubicBezier.x1));
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EasingCurve.CubicBezier cubicBezier = (EasingCurve.CubicBezier) obj;
        cubicBezier.getClass();
        int size$okio = cubicBezier.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        return protoAdapter.encodedSizeWithTag(4, Double.valueOf(cubicBezier.y2)) + protoAdapter.encodedSizeWithTag(3, Double.valueOf(cubicBezier.x2)) + protoAdapter.encodedSizeWithTag(2, Double.valueOf(cubicBezier.y1)) + protoAdapter.encodedSizeWithTag(1, Double.valueOf(cubicBezier.x1)) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EasingCurve.CubicBezier cubicBezier = (EasingCurve.CubicBezier) obj;
        cubicBezier.getClass();
        ByteString byteString = ByteString.EMPTY;
        double d = cubicBezier.x1;
        double d2 = cubicBezier.y1;
        double d3 = cubicBezier.x2;
        double d4 = cubicBezier.y2;
        byteString.getClass();
        return new EasingCurve.CubicBezier(d, d2, d3, d4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EasingCurve.CubicBezier cubicBezier = (EasingCurve.CubicBezier) obj;
        cubicBezier.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.DOUBLE;
        protoAdapter.encodeWithTag(protoWriter, 1, Double.valueOf(cubicBezier.x1));
        protoAdapter.encodeWithTag(protoWriter, 2, Double.valueOf(cubicBezier.y1));
        protoAdapter.encodeWithTag(protoWriter, 3, Double.valueOf(cubicBezier.x2));
        protoAdapter.encodeWithTag(protoWriter, 4, Double.valueOf(cubicBezier.y2));
        protoWriter.writeBytes(cubicBezier.unknownFields());
    }
}
