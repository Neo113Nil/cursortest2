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

/* loaded from: classes10.dex */
public final class Submit$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                m.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList2.add(ViewStateValueMapping.ADAPTER.decode(protoReader));
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new Submit(str, m, arrayList, arrayList2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "action_id");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Submit submit = (Submit) obj;
        reverseProtoWriter.getClass();
        submit.getClass();
        reverseProtoWriter.writeBytes(submit.unknownFields());
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 4, submit.on_error_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, submit.on_start_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, submit.request_value_mappings);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, submit.action_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Submit submit = (Submit) obj;
        submit.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, submit.action_id) + submit.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        return protoAdapter.asRepeated().encodedSizeWithTag(4, submit.on_error_value_mappings) + protoAdapter.asRepeated().encodedSizeWithTag(3, submit.on_start_value_mappings) + protoAdapter.asRepeated().encodedSizeWithTag(2, submit.request_value_mappings) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Submit submit = (Submit) obj;
        submit.getClass();
        List list = submit.request_value_mappings;
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(submit.on_start_value_mappings, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(submit.on_error_value_mappings, protoAdapter);
        ByteString byteString = ByteString.EMPTY;
        String str = submit.action_id;
        str.getClass();
        byteString.getClass();
        return new Submit(str, m1169redactElements, m1169redactElements2, m1169redactElements3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Submit submit = (Submit) obj;
        submit.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, submit.action_id);
        ProtoAdapter protoAdapter = ViewStateValueMapping.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, submit.request_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, submit.on_start_value_mappings);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, submit.on_error_value_mappings);
        protoWriter.writeBytes(submit.unknownFields());
    }
}
