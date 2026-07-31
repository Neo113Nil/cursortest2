package f4;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import d4.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: d, reason: collision with root package name */
    public final TransformationMethod f2735d;

    public j(TransformationMethod transformationMethod) {
        this.f2735d = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f2735d;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l.a().b() != 1) {
            return charSequence;
        }
        l a8 = l.a();
        a8.getClass();
        return a8.f(0, charSequence.length(), 0, charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f2735d;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i, rect);
        }
    }
}
