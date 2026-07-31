package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes5.dex */
public final class DragAndDropPermissionsCompat {

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static DragAndDropPermissions requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }

        @DoNotInline
        static void release(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }
    }
}
