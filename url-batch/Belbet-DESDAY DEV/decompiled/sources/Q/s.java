package Q;

import K.C0006f;
import K.InterfaceC0005e;
import K.InterfaceC0018s;
import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class s implements InterfaceC0018s {
    public final C0006f a(View view, C0006f c0006f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0006f);
        }
        if (c0006f.f407a.c() == 2) {
            return c0006f;
        }
        InterfaceC0005e interfaceC0005e = c0006f.f407a;
        ClipData f2 = interfaceC0005e.f();
        int j2 = interfaceC0005e.j();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i = 0; i < f2.getItemCount(); i++) {
            ClipData.Item itemAt = f2.getItemAt(i);
            if ((j2 & 1) != 0) {
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
