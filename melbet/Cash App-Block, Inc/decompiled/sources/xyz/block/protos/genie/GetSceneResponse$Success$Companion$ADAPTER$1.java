package xyz.block.protos.genie;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.GetSceneResponse;

/* loaded from: classes10.dex */
public final class GetSceneResponse$Success$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetSceneResponse.Success((ViewPlan) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ViewPlan.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetSceneResponse.Success success = (GetSceneResponse.Success) obj;
        reverseProtoWriter.getClass();
        success.getClass();
        reverseProtoWriter.writeBytes(success.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, success.scene_session_token);
        ViewPlan.ADAPTER.encodeWithTag(reverseProtoWriter, 1, success.view_plan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetSceneResponse.Success success = (GetSceneResponse.Success) obj;
        success.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, success.scene_session_token) + ViewPlan.ADAPTER.encodedSizeWithTag(1, success.view_plan) + success.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetSceneResponse.Success success = (GetSceneResponse.Success) obj;
        success.getClass();
        ViewPlan viewPlan = success.view_plan;
        ViewPlan viewPlan2 = viewPlan != null ? (ViewPlan) ViewPlan.ADAPTER.redact(viewPlan) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetSceneResponse.Success(viewPlan2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetSceneResponse.Success success = (GetSceneResponse.Success) obj;
        success.getClass();
        ViewPlan.ADAPTER.encodeWithTag(protoWriter, 1, success.view_plan);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, success.scene_session_token);
        protoWriter.writeBytes(success.unknownFields());
    }
}
