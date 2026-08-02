package net.idrnd.face.iad.capture.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.protobuf.Internal;

/* loaded from: classes9.dex */
public enum u0 implements Internal.EnumLite {
    brand_starts_with_generic(0),
    fingerprint_starts_with_generic(1),
    fingerprint_starts_with_unknown(2),
    hardware_contains_goldfish(3),
    hardware_contains_ranchu(4),
    hardware_contains_google_sdk(5),
    model_contains_emulator(6),
    model_contains_android_sdk(7),
    manufacturer_contains_genymotion(8),
    product_contains_sdk_google(9),
    product_contains_google_sdk(10),
    product_contains_sdk(11),
    product_contains_sdk_x86(12),
    product_contains_sdk_gphone64_arm64(13),
    product_contains_vbox_86p(14),
    product_contains_emulator(15),
    product_contains_simulator(16),
    UNRECOGNIZED(-1);

    public final int a;

    u0(int i) {
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
