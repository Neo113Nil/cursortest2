package w0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f3560a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3561b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        b bVar = new b();
        this.f3560a = editText;
        this.f3561b = bVar;
        if (l.f332k != null) {
            l a2 = l.a();
            if (a2.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a2.f336e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            v0.b bVar2 = (v0.b) fVar.f324c.f100f;
            int a4 = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a4 != 0 ? ((ByteBuffer) bVar2.d).getInt(a4 + bVar2.f2710a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f3560a.getEditableText();
        this.f3561b.getClass();
        return b.a(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f3560a.getEditableText();
        this.f3561b.getClass();
        return b.a(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
