package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes10.dex */
public final class ViewPlan$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                m.add(ViewPlan.ViewEntry.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = ProtoAdapter.STRING.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str != null) {
            return new ViewPlan(m, str, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "initial_view_slug");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewPlan viewPlan = (ViewPlan) obj;
        reverseProtoWriter.getClass();
        viewPlan.getClass();
        reverseProtoWriter.writeBytes(viewPlan.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, viewPlan.initial_view_slug);
        ViewPlan.ViewEntry.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, viewPlan.view_entries);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewPlan viewPlan = (ViewPlan) obj;
        viewPlan.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, viewPlan.initial_view_slug) + ViewPlan.ViewEntry.ADAPTER.asRepeated().encodedSizeWithTag(1, viewPlan.view_entries) + viewPlan.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewPlan viewPlan = (ViewPlan) obj;
        viewPlan.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(viewPlan.view_entries, ViewPlan.ViewEntry.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = viewPlan.initial_view_slug;
        str.getClass();
        byteString.getClass();
        return new ViewPlan(m1169redactElements, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewPlan viewPlan = (ViewPlan) obj;
        viewPlan.getClass();
        ViewPlan.ViewEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, viewPlan.view_entries);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, viewPlan.initial_view_slug);
        protoWriter.writeBytes(viewPlan.unknownFields());
    }
}
