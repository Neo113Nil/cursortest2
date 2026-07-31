package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes14.dex */
public final class AppLocalesMetadataHolderService extends Service {

    @RequiresApi
    private static class Api24Impl {
        @DoNotInline
        static int getDisabledComponentFlag() {
            return 512;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }

    public static ServiceInfo getServiceInfo(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Api24Impl.getDisabledComponentFlag() | 128);
    }
}
