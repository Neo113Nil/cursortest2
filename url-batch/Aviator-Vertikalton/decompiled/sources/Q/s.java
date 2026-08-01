package Q;

import K.C0010f;
import K.InterfaceC0008e;
import K.InterfaceC0026w;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class s implements InterfaceC0026w {
    public final C0010f a(View view, C0010f c0010f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0010f);
        }
        if (c0010f.f439a.d() == 2) {
            return c0010f;
        }
        InterfaceC0008e interfaceC0008e = c0010f.f439a;
        ClipData h = interfaceC0008e.h();
        int l2 = interfaceC0008e.l();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i = 0; i < h.getItemCount(); i++) {
            ClipData.Item itemAt = h.getItemAt(i);
            if ((l2 & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
