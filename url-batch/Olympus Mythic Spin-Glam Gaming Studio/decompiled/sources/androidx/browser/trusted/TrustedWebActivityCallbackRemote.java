package androidx.browser.trusted;

import android.os.IBinder;
import android.support.customtabs.trusted.ITrustedWebActivityCallback;

/* loaded from: classes4.dex */
public class TrustedWebActivityCallbackRemote {
    private final ITrustedWebActivityCallback mCallbackBinder;

    private TrustedWebActivityCallbackRemote(ITrustedWebActivityCallback iTrustedWebActivityCallback) {
        this.mCallbackBinder = iTrustedWebActivityCallback;
    }

    static TrustedWebActivityCallbackRemote fromBinder(IBinder iBinder) {
        ITrustedWebActivityCallback asInterface = iBinder == null ? null : ITrustedWebActivityCallback.Stub.asInterface(iBinder);
        if (asInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(asInterface);
    }
}
