package m;

import L.C0006d;
import L.InterfaceC0004c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: m.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0188F {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0004c interfaceC0004c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0004c = new D.g(clipData, 3);
            } else {
                C0006d c0006d = new C0006d();
                c0006d.f512b = clipData;
                c0006d.f513c = 3;
                interfaceC0004c = c0006d;
            }
            L.T.h(textView, interfaceC0004c.k());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0004c interfaceC0004c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0004c = new D.g(clipData, 3);
        } else {
            C0006d c0006d = new C0006d();
            c0006d.f512b = clipData;
            c0006d.f513c = 3;
            interfaceC0004c = c0006d;
        }
        L.T.h(view, interfaceC0004c.k());
        return true;
    }
}
