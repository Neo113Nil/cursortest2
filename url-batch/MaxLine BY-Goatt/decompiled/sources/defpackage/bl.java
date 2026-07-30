package defpackage;

import com.facebook.appevents.UserDataStore;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bl implements ObjectEncoder {
    public static final bl a = new bl();
    public static final FieldDescriptor b = FieldDescriptor.of("sdkVersion");
    public static final FieldDescriptor c = FieldDescriptor.of(DeviceRequestsHelper.DEVICE_INFO_MODEL);
    public static final FieldDescriptor d = FieldDescriptor.of("hardware");
    public static final FieldDescriptor e = FieldDescriptor.of(DeviceRequestsHelper.DEVICE_INFO_DEVICE);
    public static final FieldDescriptor f = FieldDescriptor.of("product");
    public static final FieldDescriptor g = FieldDescriptor.of("osBuild");
    public static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
    public static final FieldDescriptor i = FieldDescriptor.of("fingerprint");
    public static final FieldDescriptor j = FieldDescriptor.of("locale");
    public static final FieldDescriptor k = FieldDescriptor.of(UserDataStore.COUNTRY);
    public static final FieldDescriptor l = FieldDescriptor.of("mccMnc");
    public static final FieldDescriptor m = FieldDescriptor.of("applicationBuild");

    @Override // com.google.firebase.encoders.Encoder
    public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
        b7 b7Var = (b7) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(b, ((ql) b7Var).a);
        ql qlVar = (ql) b7Var;
        objectEncoderContext2.add(c, qlVar.b);
        objectEncoderContext2.add(d, qlVar.c);
        objectEncoderContext2.add(e, qlVar.d);
        objectEncoderContext2.add(f, qlVar.e);
        objectEncoderContext2.add(g, qlVar.f);
        objectEncoderContext2.add(h, qlVar.g);
        objectEncoderContext2.add(i, qlVar.h);
        objectEncoderContext2.add(j, qlVar.i);
        objectEncoderContext2.add(k, qlVar.j);
        objectEncoderContext2.add(l, qlVar.k);
        objectEncoderContext2.add(m, qlVar.l);
    }
}
