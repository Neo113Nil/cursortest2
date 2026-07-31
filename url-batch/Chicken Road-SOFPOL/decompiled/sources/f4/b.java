package f4;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import d4.l;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f2720a;

    /* renamed from: b, reason: collision with root package name */
    public final w5.f f2721b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        w5.f fVar = new w5.f(15);
        this.f2720a = editText;
        this.f2721b = fVar;
        if (l.c()) {
            l a8 = l.a();
            if (a8.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            d4.g gVar = a8.f2272e;
            gVar.getClass();
            Bundle bundle = editorInfo.extras;
            e4.b bVar = (e4.b) gVar.f2262c.f1737d;
            int a9 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a9 != 0 ? ((ByteBuffer) bVar.f2491g).getInt(a9 + bVar.f2488d) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i8) {
        Editable editableText = this.f2720a.getEditableText();
        this.f2721b.getClass();
        return w5.f.j(this, editableText, i, i8, false) || super.deleteSurroundingText(i, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i8) {
        Editable editableText = this.f2720a.getEditableText();
        this.f2721b.getClass();
        return w5.f.j(this, editableText, i, i8, true) || super.deleteSurroundingTextInCodePoints(i, i8);
    }
}
