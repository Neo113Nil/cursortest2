package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class d5 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        fe feVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                feVar = new rc0(clipData, 3);
            } else {
                ge geVar = new ge();
                geVar.g = clipData;
                geVar.h = 3;
                feVar = geVar;
            }
            ic0.i(textView, feVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        fe feVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            feVar = new rc0(clipData, 3);
        } else {
            ge geVar = new ge();
            geVar.g = clipData;
            geVar.h = 3;
            feVar = geVar;
        }
        ic0.i(view, feVar.build());
        return true;
    }
}
