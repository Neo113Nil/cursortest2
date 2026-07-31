package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.service.quicksettings.TileService;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes12.dex */
public class TileServiceCompat {

    interface TileServiceWrapper {
    }

    @RequiresApi
    private static class Api34Impl {
        @DoNotInline
        static void startActivityAndCollapse(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    @RequiresApi
    private static class Api24Impl {
        @DoNotInline
        static void startActivityAndCollapse(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }
}
