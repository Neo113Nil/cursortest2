package Z;

import a.AbstractC0086a;
import android.content.Context;
import android.text.TextUtils;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* loaded from: classes.dex */
public abstract class h {
    public static SidecarInterface a(Context context) {
        P0.h.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static T.h b() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            T.h hVar = T.h.f847j;
            return AbstractC0086a.B(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
