package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

@RequiresApi
@RestrictTo
/* loaded from: classes12.dex */
public class CoreComponentFactory extends android.app.AppComponentFactory {

    @RestrictTo
    public interface CompatWrapped {
        Object getWrapper();
    }

    public Activity instantiateActivity(ClassLoader classLoader, String str, Intent intent) {
        return (Activity) checkCompatWrapper(super.instantiateActivity(classLoader, str, intent));
    }

    public Application instantiateApplication(ClassLoader classLoader, String str) {
        return (Application) checkCompatWrapper(super.instantiateApplication(classLoader, str));
    }

    public BroadcastReceiver instantiateReceiver(ClassLoader classLoader, String str, Intent intent) {
        return (BroadcastReceiver) checkCompatWrapper(super.instantiateReceiver(classLoader, str, intent));
    }

    public ContentProvider instantiateProvider(ClassLoader classLoader, String str) {
        return (ContentProvider) checkCompatWrapper(super.instantiateProvider(classLoader, str));
    }

    public Service instantiateService(ClassLoader classLoader, String str, Intent intent) {
        return (Service) checkCompatWrapper(super.instantiateService(classLoader, str, intent));
    }

    static Object checkCompatWrapper(Object obj) {
        Object wrapper;
        return (!(obj instanceof CompatWrapped) || (wrapper = ((CompatWrapped) obj).getWrapper()) == null) ? obj : wrapper;
    }
}
