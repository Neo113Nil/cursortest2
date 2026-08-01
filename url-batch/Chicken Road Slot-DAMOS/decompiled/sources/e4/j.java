package e4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import c4.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final TransformationMethod f3871d;

    public j(TransformationMethod transformationMethod) {
        this.f3871d = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3871d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || k.a().b() != 1) {
            return charSequence;
        }
        k a9 = k.a();
        a9.getClass();
        return a9.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z10, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f3871d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z10, i3, rect);
        }
    }
}
