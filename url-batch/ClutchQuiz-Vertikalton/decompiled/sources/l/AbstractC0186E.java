package l;

import K.C0004e;
import K.InterfaceC0003d;
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
public abstract class AbstractC0186E {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0003d interfaceC0003d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0003d = new A0.h(clipData, 3);
            } else {
                C0004e c0004e = new C0004e();
                c0004e.f387b = clipData;
                c0004e.f388c = 3;
                interfaceC0003d = c0004e;
            }
            K.S.h(textView, interfaceC0003d.j());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0003d interfaceC0003d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0003d = new A0.h(clipData, 3);
        } else {
            C0004e c0004e = new C0004e();
            c0004e.f387b = clipData;
            c0004e.f388c = 3;
            interfaceC0003d = c0004e;
        }
        K.S.h(view, interfaceC0003d.j());
        return true;
    }
}
