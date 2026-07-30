package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class il implements ObjectEncoder {
    public static final il a = new il();
    public static final FieldDescriptor b = q40.g(1, FieldDescriptor.builder("window"));
    public static final FieldDescriptor c = q40.g(2, FieldDescriptor.builder("logSourceMetrics"));
    public static final FieldDescriptor d = q40.g(3, FieldDescriptor.builder("globalMetrics"));
    public static final FieldDescriptor e = q40.g(4, FieldDescriptor.builder("appNamespace"));

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        ru ruVar = (ru) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, ruVar.a);
        objectEncoderContext2.add(c, ruVar.b);
        objectEncoderContext2.add(d, ruVar.c);
        objectEncoderContext2.add(e, ruVar.d);
    }
}
