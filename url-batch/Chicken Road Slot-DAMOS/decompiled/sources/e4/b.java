package e4;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import c4.k;
import java.nio.ByteBuffer;
import m.n;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final n f3856a;

    /* renamed from: b, reason: collision with root package name */
    public final u8.d f3857b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        u8.d dVar = new u8.d(21);
        this.f3856a = nVar;
        this.f3857b = dVar;
        if (k.c()) {
            k a9 = k.a();
            if (a9.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            c4.g gVar = a9.f1761e;
            gVar.getClass();
            Bundle bundle = editorInfo.extras;
            d4.b bVar = (d4.b) gVar.f1752c.f1833d;
            int a10 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? ((ByteBuffer) bVar.f3619r).getInt(a10 + bVar.f3616d) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i10) {
        Editable editableText = this.f3856a.getEditableText();
        this.f3857b.getClass();
        return u8.d.d(this, editableText, i3, i10, false) || super.deleteSurroundingText(i3, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i10) {
        Editable editableText = this.f3856a.getEditableText();
        this.f3857b.getClass();
        return u8.d.d(this, editableText, i3, i10, true) || super.deleteSurroundingTextInCodePoints(i3, i10);
    }
}
