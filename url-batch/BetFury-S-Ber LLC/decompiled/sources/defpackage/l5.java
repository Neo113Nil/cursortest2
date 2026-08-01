package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class l5 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        wf wfVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                wfVar = new o0(clipData, 3);
            } else {
                xf xfVar = new xf();
                xfVar.g = clipData;
                xfVar.h = 3;
                wfVar = xfVar;
            }
            hm0.i(textView, wfVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        wf wfVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            wfVar = new o0(clipData, 3);
        } else {
            xf xfVar = new xf();
            xfVar.g = clipData;
            xfVar.h = 3;
            wfVar = xfVar;
        }
        hm0.i(view, wfVar.build());
        return true;
    }
}
