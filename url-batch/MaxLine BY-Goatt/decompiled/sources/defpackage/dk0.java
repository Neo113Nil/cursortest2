package defpackage;

import com.facebook.FacebookSdk;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dk0 implements Callable {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ dk0(int i, Object obj) {
        this.m = i;
        this.n = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Void sdkInitialize$lambda$9;
        Void deleteFirebaseInstallationId;
        int i = this.m;
        Object obj = this.n;
        switch (i) {
            case 0:
                sdkInitialize$lambda$9 = FacebookSdk.sdkInitialize$lambda$9((FacebookSdk.InitializeCallback) obj);
                return sdkInitialize$lambda$9;
            default:
                deleteFirebaseInstallationId = ((FirebaseInstallations) obj).deleteFirebaseInstallationId();
                return deleteFirebaseInstallationId;
        }
    }
}
