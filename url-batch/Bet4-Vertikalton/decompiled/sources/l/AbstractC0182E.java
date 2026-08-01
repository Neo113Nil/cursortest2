package l;

import K.C0006d;
import K.InterfaceC0004c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0182E {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0004c interfaceC0004c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0004c = new C.g(clipData, 3);
            } else {
                C0006d c0006d = new C0006d();
                c0006d.f445b = clipData;
                c0006d.f446c = 3;
                interfaceC0004c = c0006d;
            }
            K.T.h(textView, interfaceC0004c.j());
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
            interfaceC0004c = new C.g(clipData, 3);
        } else {
            C0006d c0006d = new C0006d();
            c0006d.f445b = clipData;
            c0006d.f446c = 3;
            interfaceC0004c = c0006d;
        }
        K.T.h(view, interfaceC0004c.j());
        return true;
    }
}
