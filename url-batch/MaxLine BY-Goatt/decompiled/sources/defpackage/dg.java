package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class dg {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        k20 k20Var;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                k20Var = new j20(clipData, 3);
            } else {
                l20 l20Var = new l20();
                l20Var.b = clipData;
                l20Var.c = 3;
                k20Var = l20Var;
            }
            e53.g(textView, k20Var.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        k20 k20Var;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            k20Var = new j20(clipData, 3);
        } else {
            l20 l20Var = new l20();
            l20Var.b = clipData;
            l20Var.c = 3;
            k20Var = l20Var;
        }
        e53.g(view, k20Var.build());
        return true;
    }
}
