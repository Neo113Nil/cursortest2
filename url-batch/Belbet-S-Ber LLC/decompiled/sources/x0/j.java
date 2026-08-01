package x0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements TransformationMethod {

    /* renamed from: f, reason: collision with root package name */
    public final TransformationMethod f3855f;

    public j(TransformationMethod transformationMethod) {
        this.f3855f = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3855f;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || l.a().b() != 1) {
            return charSequence;
        }
        l a5 = l.a();
        a5.getClass();
        return a5.e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z4, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f3855f;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z4, i, rect);
        }
    }
}
