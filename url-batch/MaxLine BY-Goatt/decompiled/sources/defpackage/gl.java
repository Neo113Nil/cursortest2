package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gl implements ObjectEncoder {
    public static final gl a = new gl();
    public static final FieldDescriptor b = FieldDescriptor.of("networkType");
    public static final FieldDescriptor c = FieldDescriptor.of("mobileSubtype");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ur1 ur1Var = (ur1) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, ((bm) ur1Var).a);
        objectEncoderContext2.add(c, ((bm) ur1Var).b);
    }
}
