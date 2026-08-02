package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes10.dex */
public final class Navigate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Navigate((Navigate.Present) obj, (Navigate.Dismiss) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Navigate.Present.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Navigate.Dismiss.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Navigate navigate = (Navigate) obj;
        reverseProtoWriter.getClass();
        navigate.getClass();
        reverseProtoWriter.writeBytes(navigate.unknownFields());
        Navigate.Dismiss.ADAPTER.encodeWithTag(reverseProtoWriter, 2, navigate.dismiss);
        Navigate.Present.ADAPTER.encodeWithTag(reverseProtoWriter, 1, navigate.present);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Navigate navigate = (Navigate) obj;
        navigate.getClass();
        return Navigate.Dismiss.ADAPTER.encodedSizeWithTag(2, navigate.dismiss) + Navigate.Present.ADAPTER.encodedSizeWithTag(1, navigate.present) + navigate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Navigate navigate = (Navigate) obj;
        navigate.getClass();
        Navigate.Present present = navigate.present;
        Navigate.Present present2 = present != null ? (Navigate.Present) Navigate.Present.ADAPTER.redact(present) : null;
        Navigate.Dismiss dismiss = navigate.dismiss;
        Navigate.Dismiss dismiss2 = dismiss != null ? (Navigate.Dismiss) Navigate.Dismiss.ADAPTER.redact(dismiss) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Navigate(present2, dismiss2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Navigate navigate = (Navigate) obj;
        navigate.getClass();
        Navigate.Present.ADAPTER.encodeWithTag(protoWriter, 1, navigate.present);
        Navigate.Dismiss.ADAPTER.encodeWithTag(protoWriter, 2, navigate.dismiss);
        protoWriter.writeBytes(navigate.unknownFields());
    }
}
