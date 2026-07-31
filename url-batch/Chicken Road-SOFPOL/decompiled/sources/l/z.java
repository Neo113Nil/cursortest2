package l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class z {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        q3.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new b1.b(clipData, 3);
            } else {
                q3.d dVar = new q3.d();
                dVar.f6093e = clipData;
                dVar.f6094f = 3;
                cVar = dVar;
            }
            q3.k0.g(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        q3.c cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new b1.b(clipData, 3);
        } else {
            q3.d dVar = new q3.d();
            dVar.f6093e = clipData;
            dVar.f6094f = 3;
            cVar = dVar;
        }
        q3.k0.g(view, cVar.build());
        return true;
    }
}
