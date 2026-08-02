package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum v0 implements Internal.EnumLite {
    root_management_apps_found(0),
    potentially_dangerous_apps_found(1),
    binary_su_found(2),
    executable_su_found(3),
    executable_su_found_by_native_call(4),
    paths_that_should_not_be_writable_found(5),
    test_keys_found(6),
    magisk_binary_found(7),
    UNRECOGNIZED(-1);

    public final int a;

    v0(int i) {
        this.a = i;
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
