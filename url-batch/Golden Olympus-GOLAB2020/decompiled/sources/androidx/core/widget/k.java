package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1286d;
import androidx.core.view.K;

/* loaded from: classes.dex */
public final class k implements K {
    private static CharSequence b(Context context, ClipData.Item item, int i4) {
        if ((i4 & 1) == 0) {
            return item.coerceToStyledText(context);
        }
        CharSequence coerceToText = item.coerceToText(context);
        return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.K
    public C1286d a(View view, C1286d c1286d) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c1286d);
        }
        if (c1286d.d() == 2) {
            return c1286d;
        }
        ClipData b4 = c1286d.b();
        int c4 = c1286d.c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z4 = false;
        for (int i4 = 0; i4 < b4.getItemCount(); i4++) {
            CharSequence b5 = b(context, b4.getItemAt(i4), c4);
            if (b5 != null) {
                if (z4) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b5);
                } else {
                    c(editable, b5);
                    z4 = true;
                }
            }
        }
        return null;
    }
}
