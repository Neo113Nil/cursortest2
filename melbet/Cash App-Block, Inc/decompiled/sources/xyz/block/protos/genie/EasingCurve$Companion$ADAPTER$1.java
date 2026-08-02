package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class EasingCurve$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EasingCurve((EasingCurve.Linear) obj, (EasingCurve.EaseIn) obj2, (EasingCurve.EaseOut) obj3, (EasingCurve.EaseInOut) obj4, (EasingCurve.CubicBezier) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = EasingCurve.Linear.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = EasingCurve.EaseIn.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = EasingCurve.EaseOut.ADAPTER.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = EasingCurve.EaseInOut.ADAPTER.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = EasingCurve.CubicBezier.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EasingCurve easingCurve = (EasingCurve) obj;
        reverseProtoWriter.getClass();
        easingCurve.getClass();
        reverseProtoWriter.writeBytes(easingCurve.unknownFields());
        EasingCurve.CubicBezier.ADAPTER.encodeWithTag(reverseProtoWriter, 5, easingCurve.cubic_bezier);
        EasingCurve.EaseInOut.ADAPTER.encodeWithTag(reverseProtoWriter, 4, easingCurve.ease_in_out);
        EasingCurve.EaseOut.ADAPTER.encodeWithTag(reverseProtoWriter, 3, easingCurve.ease_out);
        EasingCurve.EaseIn.ADAPTER.encodeWithTag(reverseProtoWriter, 2, easingCurve.ease_in);
        EasingCurve.Linear.ADAPTER.encodeWithTag(reverseProtoWriter, 1, easingCurve.linear);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EasingCurve easingCurve = (EasingCurve) obj;
        easingCurve.getClass();
        return EasingCurve.CubicBezier.ADAPTER.encodedSizeWithTag(5, easingCurve.cubic_bezier) + EasingCurve.EaseInOut.ADAPTER.encodedSizeWithTag(4, easingCurve.ease_in_out) + EasingCurve.EaseOut.ADAPTER.encodedSizeWithTag(3, easingCurve.ease_out) + EasingCurve.EaseIn.ADAPTER.encodedSizeWithTag(2, easingCurve.ease_in) + EasingCurve.Linear.ADAPTER.encodedSizeWithTag(1, easingCurve.linear) + easingCurve.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EasingCurve easingCurve = (EasingCurve) obj;
        easingCurve.getClass();
        EasingCurve.Linear linear = easingCurve.linear;
        EasingCurve.Linear linear2 = linear != null ? (EasingCurve.Linear) EasingCurve.Linear.ADAPTER.redact(linear) : null;
        EasingCurve.EaseIn easeIn = easingCurve.ease_in;
        EasingCurve.EaseIn easeIn2 = easeIn != null ? (EasingCurve.EaseIn) EasingCurve.EaseIn.ADAPTER.redact(easeIn) : null;
        EasingCurve.EaseOut easeOut = easingCurve.ease_out;
        EasingCurve.EaseOut easeOut2 = easeOut != null ? (EasingCurve.EaseOut) EasingCurve.EaseOut.ADAPTER.redact(easeOut) : null;
        EasingCurve.EaseInOut easeInOut = easingCurve.ease_in_out;
        EasingCurve.EaseInOut easeInOut2 = easeInOut != null ? (EasingCurve.EaseInOut) EasingCurve.EaseInOut.ADAPTER.redact(easeInOut) : null;
        EasingCurve.CubicBezier cubicBezier = easingCurve.cubic_bezier;
        EasingCurve.CubicBezier cubicBezier2 = cubicBezier != null ? (EasingCurve.CubicBezier) EasingCurve.CubicBezier.ADAPTER.redact(cubicBezier) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EasingCurve(linear2, easeIn2, easeOut2, easeInOut2, cubicBezier2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EasingCurve easingCurve = (EasingCurve) obj;
        easingCurve.getClass();
        EasingCurve.Linear.ADAPTER.encodeWithTag(protoWriter, 1, easingCurve.linear);
        EasingCurve.EaseIn.ADAPTER.encodeWithTag(protoWriter, 2, easingCurve.ease_in);
        EasingCurve.EaseOut.ADAPTER.encodeWithTag(protoWriter, 3, easingCurve.ease_out);
        EasingCurve.EaseInOut.ADAPTER.encodeWithTag(protoWriter, 4, easingCurve.ease_in_out);
        EasingCurve.CubicBezier.ADAPTER.encodeWithTag(protoWriter, 5, easingCurve.cubic_bezier);
        protoWriter.writeBytes(easingCurve.unknownFields());
    }
}
