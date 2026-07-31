package U;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final b f9326a;

    /* renamed from: b, reason: collision with root package name */
    private int f9327b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private int f9328c = 0;

    /* renamed from: U.a$a, reason: collision with other inner class name */
    private static class C0065a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final EditText f9329a;

        /* renamed from: b, reason: collision with root package name */
        private final g f9330b;

        C0065a(EditText editText, boolean z4) {
            this.f9329a = editText;
            g gVar = new g(editText, z4);
            this.f9330b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(U.b.getInstance());
        }

        @Override // U.a.b
        KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // U.a.b
        InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f9329a, inputConnection, editorInfo);
        }

        @Override // U.a.b
        void c(boolean z4) {
            this.f9330b.c(z4);
        }
    }

    static class b {
        b() {
        }

        abstract KeyListener a(KeyListener keyListener);

        abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        abstract void c(boolean z4);
    }

    public a(EditText editText, boolean z4) {
        A.h.g(editText, "editText cannot be null");
        this.f9326a = new C0065a(editText, z4);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f9326a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f9326a.b(inputConnection, editorInfo);
    }

    public void c(boolean z4) {
        this.f9326a.c(z4);
    }
}
