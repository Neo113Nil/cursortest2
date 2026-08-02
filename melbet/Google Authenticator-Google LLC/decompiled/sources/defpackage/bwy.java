package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class bwy implements gzf {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ bwy(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ((hkf) ((hkf) bwz.c.g()).i("com/google/android/apps/authenticator2/main/dataservice/OtpSyncOnStartDataServiceImpl", "performOtpSyncingAndUpdateSyncingIcon", 114, "OtpSyncOnStartDataServiceImpl.java")).s(true != this.a ? "User-triggered sync for otp sync for pseudonymous account" : "Otp sync for pseudonymous account");
            return bxe.SYNC_STATUS_NONE;
        }
        if (i != 1) {
            if (i != 2) {
                ((hkf) ((hkf) ((hkf) bwz.c.g()).h((kbr) obj)).i("com/google/android/apps/authenticator2/main/dataservice/OtpSyncOnStartDataServiceImpl", "performOtpSyncingAndUpdateSyncingIcon", 132, "OtpSyncOnStartDataServiceImpl.java")).s(true == this.a ? "Otp sync failed" : "User-triggered otp sync failed");
                return bxe.FAILED;
            }
            ((hkf) ((hkf) ((hkf) bwz.c.g()).h((kbt) obj)).i("com/google/android/apps/authenticator2/main/dataservice/OtpSyncOnStartDataServiceImpl", "performOtpSyncingAndUpdateSyncingIcon", 124, "OtpSyncOnStartDataServiceImpl.java")).s(true == this.a ? "Otp sync failed" : "User-triggered otp sync failed");
            return bxe.FAILED;
        }
        jkj C = ((btj) obj).C();
        if (!C.b.M()) {
            C.t();
        }
        boolean z = this.a;
        btj btjVar = (btj) C.b;
        btjVar.b |= 1;
        btjVar.c = z;
        return (btj) C.q();
    }
}
