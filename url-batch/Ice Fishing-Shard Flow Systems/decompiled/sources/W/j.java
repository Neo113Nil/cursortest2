package W;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final TransformationMethod f2785d;

    public j(TransformationMethod transformationMethod) {
        this.f2785d = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2785d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || U.j.a().b() != 1) {
            return charSequence;
        }
        U.j a7 = U.j.a();
        a7.getClass();
        return a7.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z7, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f2785d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z7, i2, rect);
        }
    }
}
