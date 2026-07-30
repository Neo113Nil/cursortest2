package m;

import O.C0340d;
import O.InterfaceC0338c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import g1.C4523c;

/* renamed from: m.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4717D {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0338c interfaceC0338c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0338c = new C4523c(clipData, 3);
            } else {
                C0340d c0340d = new C0340d();
                c0340d.f2252u = clipData;
                c0340d.f2253v = 3;
                interfaceC0338c = c0340d;
            }
            O.X.k(textView, interfaceC0338c.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0338c interfaceC0338c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0338c = new C4523c(clipData, 3);
        } else {
            C0340d c0340d = new C0340d();
            c0340d.f2252u = clipData;
            c0340d.f2253v = 3;
            interfaceC0338c = c0340d;
        }
        O.X.k(view, interfaceC0338c.build());
        return true;
    }
}
