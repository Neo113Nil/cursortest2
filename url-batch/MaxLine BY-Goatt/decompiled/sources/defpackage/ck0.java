package defpackage;

import com.facebook.FacebookSdk;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class ck0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        File sdkInitialize$lambda$3;
        sdkInitialize$lambda$3 = FacebookSdk.sdkInitialize$lambda$3();
        return sdkInitialize$lambda$3;
    }
}
