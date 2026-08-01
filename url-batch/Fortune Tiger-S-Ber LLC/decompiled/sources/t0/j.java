package t0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: f, reason: collision with root package name */
    public final TransformationMethod f3376f;

    public j(TransformationMethod transformationMethod) {
        this.f3376f = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3376f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l.a().b() != 1) {
            return charSequence;
        }
        l a4 = l.a();
        a4.getClass();
        return a4.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i4, Rect rect) {
        TransformationMethod transformationMethod = this.f3376f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i4, rect);
        }
    }
}
