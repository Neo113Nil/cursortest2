package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public abstract class k5 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        jd jdVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                jdVar = new j1(clipData, 3);
            } else {
                kd kdVar = new kd();
                kdVar.g = clipData;
                kdVar.h = 3;
                jdVar = kdVar;
            }
            e90.i(textView, jdVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        jd jdVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            jdVar = new j1(clipData, 3);
        } else {
            kd kdVar = new kd();
            kdVar.g = clipData;
            kdVar.h = 3;
            jdVar = kdVar;
        }
        e90.i(view, jdVar.build());
        return true;
    }
}
