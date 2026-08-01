package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public abstract class t4 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        fd fdVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                fdVar = new k0(clipData, 3);
            } else {
                gd gdVar = new gd();
                gdVar.g = clipData;
                gdVar.h = 3;
                fdVar = gdVar;
            }
            x80.i(textView, fdVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        fd fdVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            fdVar = new k0(clipData, 3);
        } else {
            gd gdVar = new gd();
            gdVar.g = clipData;
            gdVar.h = 3;
            fdVar = gdVar;
        }
        x80.i(view, fdVar.build());
        return true;
    }
}
