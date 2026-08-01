package P0;

import com.playgen.securelock.R;

/* loaded from: classes.dex */
public enum b {
    SECURE(R.string.type_secure, R.string.type_secure_desc),
    PIN(R.string.type_pin, R.string.type_pin_desc),
    PASSPHRASE(R.string.type_passphrase, R.string.type_passphrase_desc),
    ALPHANUMERIC(R.string.type_alphanumeric, R.string.type_alphanumeric_desc),
    HEX(R.string.type_hex, R.string.type_hex_desc);


    /* renamed from: a, reason: collision with root package name */
    public final int f640a;

    /* renamed from: b, reason: collision with root package name */
    public final int f641b;

    b(int i, int i2) {
        this.f640a = i;
        this.f641b = i2;
    }
}
