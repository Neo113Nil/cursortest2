package coil3.network.okhttp.internal;

import androidx.activity.OnBackPressedCallback$$ExternalSyntheticThrowIAE2;
import kotlin.Metadata;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0000¨\u0006\u0004"}, d2 = {"closeQuietly", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilsKt {
    public static final void closeQuietly(AutoCloseable autoCloseable) {
        try {
            OnBackPressedCallback$$ExternalSyntheticThrowIAE2.m5m((Object) autoCloseable);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }
}
