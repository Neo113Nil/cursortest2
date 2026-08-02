package okhttp3.internal.platform;

import android.content.Context;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Landroidx/startup/Initializer;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformInitializer implements Initializer {
    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        context.getClass();
        Android10Platform android10Platform = Platform.platform;
        Android10Platform android10Platform2 = Platform.platform;
        if (android10Platform2 == null) {
            android10Platform2 = null;
        }
        if (android10Platform2 != null) {
            android10Platform2.applicationContext = context;
        }
        return Platform.platform;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return EmptyList.INSTANCE;
    }
}
