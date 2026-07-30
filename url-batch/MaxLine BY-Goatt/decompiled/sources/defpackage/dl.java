package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dl implements ObjectEncoder {
    public static final dl a = new dl();
    public static final FieldDescriptor b = FieldDescriptor.of("clientType");
    public static final FieldDescriptor c = FieldDescriptor.of("androidClientInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        qu quVar = (qu) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        ((tl) quVar).getClass();
        objectEncoderContext2.add(b, pu.m);
        objectEncoderContext2.add(c, ((tl) quVar).a);
    }
}
