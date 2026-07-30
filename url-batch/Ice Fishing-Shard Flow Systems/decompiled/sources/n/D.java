package n;

import I.C0108d;
import I.InterfaceC0107c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class D {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0107c interfaceC0107c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0107c = new l2.c(clipData, 3);
            } else {
                C0108d c0108d = new C0108d();
                c0108d.f1177e = clipData;
                c0108d.f1178i = 3;
                interfaceC0107c = c0108d;
            }
            I.T.g(textView, interfaceC0107c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0107c interfaceC0107c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0107c = new l2.c(clipData, 3);
        } else {
            C0108d c0108d = new C0108d();
            c0108d.f1177e = clipData;
            c0108d.f1178i = 3;
            interfaceC0107c = c0108d;
        }
        I.T.g(view, interfaceC0107c.build());
        return true;
    }
}
