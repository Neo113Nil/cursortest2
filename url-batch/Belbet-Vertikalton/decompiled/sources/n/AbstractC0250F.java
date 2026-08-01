package n;

import M.C0008d;
import M.InterfaceC0007c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: n.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0250F {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0007c interfaceC0007c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0007c = new C1.d(clipData, 3);
            } else {
                C0008d c0008d = new C0008d();
                c0008d.f735b = clipData;
                c0008d.f736c = 3;
                interfaceC0007c = c0008d;
            }
            M.P.h(textView, interfaceC0007c.h());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0007c interfaceC0007c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0007c = new C1.d(clipData, 3);
        } else {
            C0008d c0008d = new C0008d();
            c0008d.f735b = clipData;
            c0008d.f736c = 3;
            interfaceC0007c = c0008d;
        }
        M.P.h(view, interfaceC0007c.h());
        return true;
    }
}
