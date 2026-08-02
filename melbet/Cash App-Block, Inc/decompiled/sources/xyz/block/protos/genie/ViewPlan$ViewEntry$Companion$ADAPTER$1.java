package xyz.block.protos.genie;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes10.dex */
public final class ViewPlan$ViewEntry$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ViewSpec.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        String str = (String) obj;
        if (str == null) {
            TransactorKt.missingRequiredFields(obj, "view_slug");
            throw null;
        }
        ViewSpec viewSpec = (ViewSpec) obj2;
        if (viewSpec != null) {
            return new ViewPlan.ViewEntry(str, viewSpec, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "view");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ViewPlan.ViewEntry viewEntry = (ViewPlan.ViewEntry) obj;
        reverseProtoWriter.getClass();
        viewEntry.getClass();
        reverseProtoWriter.writeBytes(viewEntry.unknownFields());
        ViewSpec.ADAPTER.encodeWithTag(reverseProtoWriter, 2, viewEntry.view);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, viewEntry.view_slug);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewPlan.ViewEntry viewEntry = (ViewPlan.ViewEntry) obj;
        viewEntry.getClass();
        return ViewSpec.ADAPTER.encodedSizeWithTag(2, viewEntry.view) + ProtoAdapter.STRING.encodedSizeWithTag(1, viewEntry.view_slug) + viewEntry.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewPlan.ViewEntry viewEntry = (ViewPlan.ViewEntry) obj;
        viewEntry.getClass();
        ViewSpec viewSpec = (ViewSpec) ViewSpec.ADAPTER.redact(viewEntry.view);
        ByteString byteString = ByteString.EMPTY;
        String str = viewEntry.view_slug;
        str.getClass();
        viewSpec.getClass();
        byteString.getClass();
        return new ViewPlan.ViewEntry(str, viewSpec, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewPlan.ViewEntry viewEntry = (ViewPlan.ViewEntry) obj;
        viewEntry.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, viewEntry.view_slug);
        ViewSpec.ADAPTER.encodeWithTag(protoWriter, 2, viewEntry.view);
        protoWriter.writeBytes(viewEntry.unknownFields());
    }
}
