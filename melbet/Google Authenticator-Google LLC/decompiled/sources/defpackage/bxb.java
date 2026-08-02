package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum bxb {
    ADD_OTP("Adding an OTP from a pseudonymous account", "Passbox otp addition failed"),
    ADD_OTPS("Adding OTPs from a pseudonymous account", "Passbox otps addition failed"),
    DELETE_OTP("Deleting an OTP from a pseudonymous account", "Passbox otp deletion failed"),
    DELETE_OTPS("Deleting OTPs from a pseudonymous account", "Passbox otps deletion failed"),
    UPDATE_OTP("Updating an OTP from a pseudonymous account", "Passbox otp update failed");

    private final String g;
    private final String h;

    bxb(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final void a(Throwable th) {
        if (th instanceof can) {
            ((hkf) ((hkf) bxc.b.e()).i("com/google/android/apps/authenticator2/main/dataservice/OtpsDataServiceImpl$PassboxAction", "logWarning", 59, "OtpsDataServiceImpl.java")).s(this.g);
        } else if ((th instanceof kbt) || (th instanceof kbr)) {
            ((hkf) ((hkf) ((hkf) bxc.b.g()).h(th)).i("com/google/android/apps/authenticator2/main/dataservice/OtpsDataServiceImpl$PassboxAction", "logWarning", 61, "OtpsDataServiceImpl.java")).s(this.h);
        }
    }
}
