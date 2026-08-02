package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Present$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
                Expression expression = (Expression) obj;
                if (expression != null) {
                    return new Navigate.Present(expression, m, arrayList, arrayList2, (Navigate.Present.Push) obj2, (Navigate.Present.PresentModal) obj3, (Navigate.Present.Transition) obj4, endMessageAndGetUnknownFields);
                }
                TransactorKt.missingRequiredFields(obj, "view_slug");
                throw null;
            }
            if (nextTag != 1001) {
                switch (nextTag) {
                    case 1:
                        obj = Expression.ADAPTER.decode(protoReader);
                        break;
                    case 2:
                        m.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        arrayList.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
                        break;
                    case 4:
                        arrayList2.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        obj2 = Navigate.Present.Push.ADAPTER.decode(protoReader);
                        break;
                    case 6:
                        obj3 = Navigate.Present.PresentModal.ADAPTER.decode(protoReader);
                        break;
                    default:
                        protoReader.readUnknownField(nextTag);
                        break;
                }
            } else {
                obj4 = Navigate.Present.Transition.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate.Present present = (Navigate.Present) obj;
        reverseProtoWriter.getClass();
        present.getClass();
        reverseProtoWriter.writeBytes(present.unknownFields());
        Navigate.Present.PresentModal.ADAPTER.encodeWithTag(reverseProtoWriter, 6, present.present_modal);
        Navigate.Present.Push.ADAPTER.encodeWithTag(reverseProtoWriter, 5, present.push);
        Navigate.Present.Transition.ADAPTER.encodeWithTag(reverseProtoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, present.transition);
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, present.on_error_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, present.on_start_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, present.value_mappings);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, present.view_slug);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate.Present present = (Navigate.Present) obj;
        present.getClass();
        int encodedSizeWithTag = Expression.ADAPTER.encodedSizeWithTag(1, present.view_slug) + present.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        return Navigate.Present.Transition.ADAPTER.encodedSizeWithTag(IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, present.transition) + Navigate.Present.PresentModal.ADAPTER.encodedSizeWithTag(6, present.present_modal) + Navigate.Present.Push.ADAPTER.encodedSizeWithTag(5, present.push) + protoAdapter.asRepeated().encodedSizeWithTag(4, present.on_error_value_mappings) + protoAdapter.asRepeated().encodedSizeWithTag(3, present.on_start_value_mappings) + protoAdapter.asRepeated().encodedSizeWithTag(2, present.value_mappings) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Navigate.Present present = (Navigate.Present) obj;
        present.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(present.view_slug);
        List list = present.value_mappings;
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(present.on_start_value_mappings, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(present.on_error_value_mappings, protoAdapter);
        Navigate.Present.Push push = present.push;
        Navigate.Present.Push push2 = push != null ? (Navigate.Present.Push) Navigate.Present.Push.ADAPTER.redact(push) : null;
        Navigate.Present.PresentModal presentModal = present.present_modal;
        Navigate.Present.PresentModal presentModal2 = presentModal != null ? (Navigate.Present.PresentModal) Navigate.Present.PresentModal.ADAPTER.redact(presentModal) : null;
        Navigate.Present.Transition transition = present.transition;
        Navigate.Present.Transition transition2 = transition != null ? (Navigate.Present.Transition) Navigate.Present.Transition.ADAPTER.redact(transition) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new Navigate.Present(expression, m1169redactElements, m1169redactElements2, m1169redactElements3, push2, presentModal2, transition2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate.Present present = (Navigate.Present) obj;
        present.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, present.view_slug);
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, present.value_mappings);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, present.on_start_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, present.on_error_value_mappings);
        Navigate.Present.Transition.ADAPTER.encodeWithTag(protoWriter, IptcConstants.IMAGE_RESOURCE_BLOCK_MACINTOSH_PRINT_INFO, present.transition);
        Navigate.Present.Push.ADAPTER.encodeWithTag(protoWriter, 5, present.push);
        Navigate.Present.PresentModal.ADAPTER.encodeWithTag(protoWriter, 6, present.present_modal);
        protoWriter.writeBytes(present.unknownFields());
    }
}
