package W;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2768a;

    /* renamed from: b, reason: collision with root package name */
    public final q1.h f2769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        q1.h hVar = new q1.h(11);
        this.f2768a = editText;
        this.f2769b = hVar;
        if (U.j.j != null) {
            U.j a7 = U.j.a();
            if (a7.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            U.f fVar = a7.f2671e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            V.b bVar = (V.b) fVar.f2665c.f2200a;
            int a8 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a8 != 0 ? ((ByteBuffer) bVar.f1145l).getInt(a8 + bVar.f1142d) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i5) {
        Editable editableText = this.f2768a.getEditableText();
        this.f2769b.getClass();
        return q1.h.q(this, editableText, i2, i5, false) || super.deleteSurroundingText(i2, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i5) {
        Editable editableText = this.f2768a.getEditableText();
        this.f2769b.getClass();
        return q1.h.q(this, editableText, i2, i5, true) || super.deleteSurroundingTextInCodePoints(i2, i5);
    }
}
