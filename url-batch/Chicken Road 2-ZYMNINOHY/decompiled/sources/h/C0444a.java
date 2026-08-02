package h;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public Locale f9040a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f9040a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i4, Rect rect) {
    }
}
