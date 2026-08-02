package sqip.internal;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, d2 = {"Lsqip/internal/AndroidModule;", "", "()V", "application", "Landroid/app/Application;", "resources", "Landroid/content/res/Resources;", "nonce-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AndroidModule {
    public static final AndroidModule INSTANCE = new AndroidModule();

    private AndroidModule() {
    }

    public final Application application() {
        Context providerContext = ContextCaptureContentProvider.INSTANCE.getProviderContext();
        providerContext.getClass();
        return (Application) providerContext;
    }

    public final Resources resources(Application application) {
        application.getClass();
        Resources resources = application.getResources();
        resources.getClass();
        return resources;
    }
}
