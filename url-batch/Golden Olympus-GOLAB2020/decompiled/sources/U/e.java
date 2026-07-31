package U;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final KeyListener f9340a;

    /* renamed from: b, reason: collision with root package name */
    private final a f9341b;

    public static class a {
        public boolean a(Editable editable, int i4, KeyEvent keyEvent) {
            return androidx.emoji2.text.f.g(editable, i4, keyEvent);
        }
    }

    e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i4) {
        this.f9340a.clearMetaKeyState(view, editable, i4);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f9340a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f9341b.a(editable, i4, keyEvent) || this.f9340a.onKeyDown(view, editable, i4, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f9340a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i4, KeyEvent keyEvent) {
        return this.f9340a.onKeyUp(view, editable, i4, keyEvent);
    }

    e(KeyListener keyListener, a aVar) {
        this.f9340a = keyListener;
        this.f9341b = aVar;
    }
}
