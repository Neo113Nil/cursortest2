package squareup.cash.phoneplans.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class VersionedPhonePlanApplet$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VersionedPhonePlanApplet((PhonePlanAppletV1) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PhonePlanAppletV1.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
        reverseProtoWriter.getClass();
        versionedPhonePlanApplet.getClass();
        reverseProtoWriter.writeBytes(versionedPhonePlanApplet.unknownFields());
        PhonePlanAppletV1.ADAPTER.encodeWithTag(reverseProtoWriter, 1, versionedPhonePlanApplet.phone_plan_applet_v1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
        versionedPhonePlanApplet.getClass();
        return PhonePlanAppletV1.ADAPTER.encodedSizeWithTag(1, versionedPhonePlanApplet.phone_plan_applet_v1) + versionedPhonePlanApplet.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
        versionedPhonePlanApplet.getClass();
        PhonePlanAppletV1 phonePlanAppletV1 = versionedPhonePlanApplet.phone_plan_applet_v1;
        PhonePlanAppletV1 phonePlanAppletV12 = phonePlanAppletV1 != null ? (PhonePlanAppletV1) PhonePlanAppletV1.ADAPTER.redact(phonePlanAppletV1) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VersionedPhonePlanApplet(phonePlanAppletV12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VersionedPhonePlanApplet versionedPhonePlanApplet = (VersionedPhonePlanApplet) obj;
        versionedPhonePlanApplet.getClass();
        PhonePlanAppletV1.ADAPTER.encodeWithTag(protoWriter, 1, versionedPhonePlanApplet.phone_plan_applet_v1);
        protoWriter.writeBytes(versionedPhonePlanApplet.unknownFields());
    }
}
