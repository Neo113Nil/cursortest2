package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum w0 implements Internal.EnumLite {
    hack_environment_variables_or_preloads_found(0),
    image_timestamp_is_not_from_current_capture_session(1),
    sandbox_paths_found(2),
    sandbox_shared_objects_found(3),
    library_integrity_broken(4),
    frida_found(5),
    UNRECOGNIZED(-1);

    public final int a;

    w0(int i2) {
        this.a = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
        return 0;
    }
}
