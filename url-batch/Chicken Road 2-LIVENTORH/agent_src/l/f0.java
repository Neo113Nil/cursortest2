package l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class f0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        n0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new a0.a(clipData, 3);
            } else {
                n0.d dVar = new n0.d();
                dVar.f2721g = clipData;
                dVar.f2722h = 3;
                cVar = dVar;
            }
            n0.l0.i(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        n0.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new a0.a(clipData, 3);
        } else {
            n0.d dVar = new n0.d();
            dVar.f2721g = clipData;
            dVar.f2722h = 3;
            cVar = dVar;
        }
        n0.l0.i(view, cVar.build());
        return true;
    }
}
