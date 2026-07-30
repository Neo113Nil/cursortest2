package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ll implements ObjectEncoder {
    public static final ll a = new ll();
    public static final FieldDescriptor b = q40.g(1, FieldDescriptor.builder("logSource"));
    public static final FieldDescriptor c = q40.g(2, FieldDescriptor.builder("logEventDropped"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        fg1 fg1Var = (fg1) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, fg1Var.a);
        objectEncoderContext2.add(c, fg1Var.b);
    }
}
