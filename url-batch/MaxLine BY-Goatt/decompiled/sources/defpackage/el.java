package defpackage;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class el implements ObjectEncoder {
    public static final el a = new el();
    public static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
    public static final FieldDescriptor c = FieldDescriptor.of("eventCode");
    public static final FieldDescriptor d = FieldDescriptor.of("eventUptimeMs");
    public static final FieldDescriptor e = FieldDescriptor.of("sourceExtension");
    public static final FieldDescriptor f = FieldDescriptor.of("sourceExtensionJsonProto3");
    public static final FieldDescriptor g = FieldDescriptor.of("timezoneOffsetSeconds");
    public static final FieldDescriptor h = FieldDescriptor.of("networkConnectionInfo");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        bg1 bg1Var = (bg1) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, ((yl) bg1Var).a);
        yl ylVar = (yl) bg1Var;
        objectEncoderContext2.add(c, ylVar.b);
        objectEncoderContext2.add(d, ylVar.c);
        objectEncoderContext2.add(e, ylVar.d);
        objectEncoderContext2.add(f, ylVar.e);
        objectEncoderContext2.add(g, ylVar.f);
        objectEncoderContext2.add(h, ylVar.g);
    }
}
