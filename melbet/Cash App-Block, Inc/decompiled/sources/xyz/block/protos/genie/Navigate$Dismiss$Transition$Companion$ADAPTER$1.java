package xyz.block.protos.genie;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Dismiss$Transition$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Navigate.Dismiss.Transition((TransitionEffect$Instant) obj, (TransitionEffect$Fade) obj2, (TransitionEffect$Pop) obj3, (TransitionEffect$Slide) obj4, (Navigate.MatchStrategy) obj5, (Integer) obj6, (EasingCurve) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransitionEffect$Instant.ADAPTER.decode(protoReader);
                    break;
                case 2:
                    obj2 = TransitionEffect$Fade.ADAPTER.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransitionEffect$Pop.ADAPTER.decode(protoReader);
                    break;
                case 4:
                    obj4 = TransitionEffect$Slide.ADAPTER.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = Navigate.MatchStrategy.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 7:
                    obj7 = EasingCurve.ADAPTER.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Dismiss.Transition transition = (Navigate.Dismiss.Transition) obj;
        reverseProtoWriter.getClass();
        transition.getClass();
        reverseProtoWriter.writeBytes(transition.unknownFields());
        TransitionEffect$Slide.ADAPTER.encodeWithTag(reverseProtoWriter, 4, transition.slide);
        TransitionEffect$Pop.ADAPTER.encodeWithTag(reverseProtoWriter, 3, transition.pop);
        TransitionEffect$Fade.ADAPTER.encodeWithTag(reverseProtoWriter, 2, transition.fade);
        TransitionEffect$Instant.ADAPTER.encodeWithTag(reverseProtoWriter, 1, transition.instant);
        EasingCurve.ADAPTER.encodeWithTag(reverseProtoWriter, 7, transition.easing_curve);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 6, transition.duration_ms);
        Navigate.MatchStrategy.ADAPTER.encodeWithTag(reverseProtoWriter, 5, transition.match_strategy);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Dismiss.Transition transition = (Navigate.Dismiss.Transition) obj;
        transition.getClass();
        return EasingCurve.ADAPTER.encodedSizeWithTag(7, transition.easing_curve) + ProtoAdapter.INT32.encodedSizeWithTag(6, transition.duration_ms) + Navigate.MatchStrategy.ADAPTER.encodedSizeWithTag(5, transition.match_strategy) + TransitionEffect$Slide.ADAPTER.encodedSizeWithTag(4, transition.slide) + TransitionEffect$Pop.ADAPTER.encodedSizeWithTag(3, transition.pop) + TransitionEffect$Fade.ADAPTER.encodedSizeWithTag(2, transition.fade) + TransitionEffect$Instant.ADAPTER.encodedSizeWithTag(1, transition.instant) + transition.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Navigate.Dismiss.Transition transition = (Navigate.Dismiss.Transition) obj;
        transition.getClass();
        TransitionEffect$Instant transitionEffect$Instant = transition.instant;
        TransitionEffect$Instant transitionEffect$Instant2 = transitionEffect$Instant != null ? (TransitionEffect$Instant) TransitionEffect$Instant.ADAPTER.redact(transitionEffect$Instant) : null;
        TransitionEffect$Fade transitionEffect$Fade = transition.fade;
        TransitionEffect$Fade transitionEffect$Fade2 = transitionEffect$Fade != null ? (TransitionEffect$Fade) TransitionEffect$Fade.ADAPTER.redact(transitionEffect$Fade) : null;
        TransitionEffect$Pop transitionEffect$Pop = transition.pop;
        TransitionEffect$Pop transitionEffect$Pop2 = transitionEffect$Pop != null ? (TransitionEffect$Pop) TransitionEffect$Pop.ADAPTER.redact(transitionEffect$Pop) : null;
        TransitionEffect$Slide transitionEffect$Slide = transition.slide;
        TransitionEffect$Slide transitionEffect$Slide2 = transitionEffect$Slide != null ? (TransitionEffect$Slide) TransitionEffect$Slide.ADAPTER.redact(transitionEffect$Slide) : null;
        EasingCurve easingCurve = transition.easing_curve;
        EasingCurve easingCurve2 = easingCurve != null ? (EasingCurve) EasingCurve.ADAPTER.redact(easingCurve) : null;
        ByteString byteString = ByteString.EMPTY;
        Navigate.MatchStrategy matchStrategy = transition.match_strategy;
        Integer num = transition.duration_ms;
        byteString.getClass();
        return new Navigate.Dismiss.Transition(transitionEffect$Instant2, transitionEffect$Fade2, transitionEffect$Pop2, transitionEffect$Slide2, matchStrategy, num, easingCurve2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Dismiss.Transition transition = (Navigate.Dismiss.Transition) obj;
        transition.getClass();
        Navigate.MatchStrategy.ADAPTER.encodeWithTag(protoWriter, 5, transition.match_strategy);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, transition.duration_ms);
        EasingCurve.ADAPTER.encodeWithTag(protoWriter, 7, transition.easing_curve);
        TransitionEffect$Instant.ADAPTER.encodeWithTag(protoWriter, 1, transition.instant);
        TransitionEffect$Fade.ADAPTER.encodeWithTag(protoWriter, 2, transition.fade);
        TransitionEffect$Pop.ADAPTER.encodeWithTag(protoWriter, 3, transition.pop);
        TransitionEffect$Slide.ADAPTER.encodeWithTag(protoWriter, 4, transition.slide);
        protoWriter.writeBytes(transition.unknownFields());
    }
}
