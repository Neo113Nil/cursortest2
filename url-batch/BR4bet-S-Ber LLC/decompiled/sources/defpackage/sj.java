package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class sj extends InputConnectionWrapper {
    public final TextView a;
    public final ej b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        ej ejVar = new ej(20);
        this.a = textView;
        this.b = ejVar;
        if (lj.k != null) {
            lj a = lj.a();
            if (a.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            hj hjVar = a.e;
            hjVar.getClass();
            Bundle bundle = editorInfo.extras;
            ix ixVar = (ix) hjVar.c.f;
            int a2 = ixVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? ((ByteBuffer) ixVar.d).getInt(a2 + ixVar.a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return ej.k(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.a.getEditableText();
        this.b.getClass();
        return ej.k(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
