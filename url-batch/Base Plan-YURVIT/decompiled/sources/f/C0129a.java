package f;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129a implements TransformationMethod {

    /* renamed from: e, reason: collision with root package name */
    public Locale f1888e;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f1888e);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
    }
}
