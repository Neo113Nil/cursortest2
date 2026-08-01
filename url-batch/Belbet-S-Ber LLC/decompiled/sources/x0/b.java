package x0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f3840a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.c f3841b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        w0.c cVar = new w0.c();
        this.f3840a = editText;
        this.f3841b = cVar;
        if (l.f454k != null) {
            l a5 = l.a();
            if (a5.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = a5.f458e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            w0.b bVar = (w0.b) fVar.f447c.f97f;
            int a6 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a6 != 0 ? ((ByteBuffer) bVar.d).getInt(a6 + bVar.f2771a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i4) {
        Editable editableText = this.f3840a.getEditableText();
        this.f3841b.getClass();
        return w0.c.a(this, editableText, i, i4, false) || super.deleteSurroundingText(i, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i4) {
        Editable editableText = this.f3840a.getEditableText();
        this.f3841b.getClass();
        return w0.c.a(this, editableText, i, i4, true) || super.deleteSurroundingTextInCodePoints(i, i4);
    }
}
