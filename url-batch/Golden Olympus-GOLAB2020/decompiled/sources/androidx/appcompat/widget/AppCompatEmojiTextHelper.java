package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f10583a;

    /* renamed from: b, reason: collision with root package name */
    private final U.f f10584b;

    AppCompatEmojiTextHelper(TextView textView) {
        this.f10583a = textView;
        this.f10584b = new U.f(textView, false);
    }

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f10584b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f10584b.b();
    }

    void c(AttributeSet attributeSet, int i4) {
        TypedArray obtainStyledAttributes = this.f10583a.getContext().obtainStyledAttributes(attributeSet, e.j.f36501g0, i4, 0);
        try {
            boolean z4 = obtainStyledAttributes.hasValue(e.j.f36571u0) ? obtainStyledAttributes.getBoolean(e.j.f36571u0, true) : true;
            obtainStyledAttributes.recycle();
            e(z4);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    void d(boolean z4) {
        this.f10584b.c(z4);
    }

    void e(boolean z4) {
        this.f10584b.d(z4);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f10584b.e(transformationMethod);
    }
}
