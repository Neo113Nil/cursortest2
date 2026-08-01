package k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        k0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new a2.e(clipData, 3);
            } else {
                k0.d dVar = new k0.d();
                dVar.g = clipData;
                dVar.h = 3;
                cVar = dVar;
            }
            k0.j0.i(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        k0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new a2.e(clipData, 3);
        } else {
            k0.d dVar = new k0.d();
            dVar.g = clipData;
            dVar.h = 3;
            cVar = dVar;
        }
        k0.j0.i(view, cVar.build());
        return true;
    }
}
