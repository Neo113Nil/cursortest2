package t0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f3363a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.f f3364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        g2.f fVar = new g2.f(24);
        this.f3363a = editText;
        this.f3364b = fVar;
        if (l.f340k != null) {
            l a4 = l.a();
            if (a4.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar2 = a4.f344e;
            fVar2.getClass();
            Bundle bundle = editorInfo.extras;
            s0.b bVar = (s0.b) fVar2.c.f368f;
            int a5 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a5 != 0 ? ((ByteBuffer) bVar.f2795d).getInt(a5 + bVar.f2793a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i4, int i5) {
        Editable editableText = this.f3363a.getEditableText();
        this.f3364b.getClass();
        return g2.f.n(this, editableText, i4, i5, false) || super.deleteSurroundingText(i4, i5);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i4, int i5) {
        Editable editableText = this.f3363a.getEditableText();
        this.f3364b.getClass();
        return g2.f.n(this, editableText, i4, i5, true) || super.deleteSurroundingTextInCodePoints(i4, i5);
    }
}
