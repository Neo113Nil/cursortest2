package l;

import K.C0003d;
import K.InterfaceC0002c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0193F {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0002c interfaceC0002c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0002c = new C.g(clipData, 3);
            } else {
                C0003d c0003d = new C0003d();
                c0003d.f388b = clipData;
                c0003d.f389c = 3;
                interfaceC0002c = c0003d;
            }
            K.S.h(textView, interfaceC0002c.j());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0002c interfaceC0002c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0002c = new C.g(clipData, 3);
        } else {
            C0003d c0003d = new C0003d();
            c0003d.f388b = clipData;
            c0003d.f389c = 3;
            interfaceC0002c = c0003d;
        }
        K.S.h(view, interfaceC0002c.j());
        return true;
    }
}
