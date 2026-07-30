package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fl implements ObjectEncoder {
    public static final fl a = new fl();
    public static final FieldDescriptor b = FieldDescriptor.of("requestTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("requestUptimeMs");
    public static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
    public static final FieldDescriptor e = FieldDescriptor.of("logSource");
    public static final FieldDescriptor f = FieldDescriptor.of("logSourceName");
    public static final FieldDescriptor g = FieldDescriptor.of("logEvent");
    public static final FieldDescriptor h = FieldDescriptor.of("qosTier");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        eg1 eg1Var = (eg1) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, ((zl) eg1Var).a);
        zl zlVar = (zl) eg1Var;
        objectEncoderContext2.add(c, zlVar.b);
        objectEncoderContext2.add(d, zlVar.c);
        objectEncoderContext2.add(e, zlVar.d);
        objectEncoderContext2.add(f, zlVar.e);
        objectEncoderContext2.add(g, zlVar.f);
        objectEncoderContext2.add(h, x52.m);
    }
}
