package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Dismiss$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Navigate.Dismiss((Navigate.Dismiss.Pop) obj, (Navigate.Dismiss.DismissModal) obj2, (Navigate.Dismiss.RetreatToView) obj3, (Navigate.Dismiss.Transition) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Navigate.Dismiss.Pop.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Navigate.Dismiss.DismissModal.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Navigate.Dismiss.RetreatToView.ADAPTER.decode(protoReader);
            } else if (nextTag != 1001) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = Navigate.Dismiss.Transition.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Dismiss dismiss = (Navigate.Dismiss) obj;
        reverseProtoWriter.getClass();
        dismiss.getClass();
        reverseProtoWriter.writeBytes(dismiss.unknownFields());
        Navigate.Dismiss.RetreatToView.ADAPTER.encodeWithTag(reverseProtoWriter, 3, dismiss.retreat_to_view);
        Navigate.Dismiss.DismissModal.ADAPTER.encodeWithTag(reverseProtoWriter, 2, dismiss.dismiss_modal);
        Navigate.Dismiss.Pop.ADAPTER.encodeWithTag(reverseProtoWriter, 1, dismiss.pop);
        Navigate.Dismiss.Transition.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, dismiss.transition);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Dismiss dismiss = (Navigate.Dismiss) obj;
        dismiss.getClass();
        return Navigate.Dismiss.Transition.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, dismiss.transition) + Navigate.Dismiss.RetreatToView.ADAPTER.encodedSizeWithTag(3, dismiss.retreat_to_view) + Navigate.Dismiss.DismissModal.ADAPTER.encodedSizeWithTag(2, dismiss.dismiss_modal) + Navigate.Dismiss.Pop.ADAPTER.encodedSizeWithTag(1, dismiss.pop) + dismiss.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Navigate.Dismiss dismiss = (Navigate.Dismiss) obj;
        dismiss.getClass();
        Navigate.Dismiss.Pop pop = dismiss.pop;
        Navigate.Dismiss.Pop pop2 = pop != null ? (Navigate.Dismiss.Pop) Navigate.Dismiss.Pop.ADAPTER.redact(pop) : null;
        Navigate.Dismiss.DismissModal dismissModal = dismiss.dismiss_modal;
        Navigate.Dismiss.DismissModal dismissModal2 = dismissModal != null ? (Navigate.Dismiss.DismissModal) Navigate.Dismiss.DismissModal.ADAPTER.redact(dismissModal) : null;
        Navigate.Dismiss.RetreatToView retreatToView = dismiss.retreat_to_view;
        Navigate.Dismiss.RetreatToView retreatToView2 = retreatToView != null ? (Navigate.Dismiss.RetreatToView) Navigate.Dismiss.RetreatToView.ADAPTER.redact(retreatToView) : null;
        Navigate.Dismiss.Transition transition = dismiss.transition;
        Navigate.Dismiss.Transition transition2 = transition != null ? (Navigate.Dismiss.Transition) Navigate.Dismiss.Transition.ADAPTER.redact(transition) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Navigate.Dismiss(pop2, dismissModal2, retreatToView2, transition2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Dismiss dismiss = (Navigate.Dismiss) obj;
        dismiss.getClass();
        Navigate.Dismiss.Transition.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, dismiss.transition);
        Navigate.Dismiss.Pop.ADAPTER.encodeWithTag(protoWriter, 1, dismiss.pop);
        Navigate.Dismiss.DismissModal.ADAPTER.encodeWithTag(protoWriter, 2, dismiss.dismiss_modal);
        Navigate.Dismiss.RetreatToView.ADAPTER.encodeWithTag(protoWriter, 3, dismiss.retreat_to_view);
        protoWriter.writeBytes(dismiss.unknownFields());
    }
}
