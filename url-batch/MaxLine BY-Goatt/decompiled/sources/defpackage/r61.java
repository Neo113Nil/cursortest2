package defpackage;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class r61 implements ObjectEncoder {
    public final /* synthetic */ int a;

    public /* synthetic */ r61(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        switch (this.a) {
            case 0:
                JsonDataEncoderBuilder.lambda$static$0(obj, objectEncoderContext2);
                break;
            default:
                ProtobufEncoder.Builder.lambda$static$0(obj, objectEncoderContext2);
                break;
        }
    }
}
