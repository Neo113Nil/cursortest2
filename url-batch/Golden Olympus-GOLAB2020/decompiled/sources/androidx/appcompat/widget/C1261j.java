package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1261j {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f10945a;

    /* renamed from: b, reason: collision with root package name */
    private final U.a f10946b;

    C1261j(EditText editText) {
        this.f10945a = editText;
        this.f10946b = new U.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f10946b.a(keyListener) : keyListener;
    }

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f10945a.getContext().obtainStyledAttributes(attributeSet, e.j.f36501g0, i4, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(e.j.f36571u0) ? obtainStyledAttributes.getBoolean(e.j.f36571u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f10946b.b(inputConnection, editorInfo);
    }

    void e(boolean z4) {
        this.f10946b.c(z4);
    }
}
