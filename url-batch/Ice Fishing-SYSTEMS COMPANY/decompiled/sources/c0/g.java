package c0;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends w8.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f5648a;

    public g(TextView textView) {
        this.f5648a = new f(textView);
    }

    @Override // w8.a
    public final InputFilter[] e(InputFilter[] inputFilterArr) {
        return !(androidx.emoji2.text.j.f4887k != null) ? inputFilterArr : this.f5648a.e(inputFilterArr);
    }

    @Override // w8.a
    public final void i(boolean z8) {
        if (androidx.emoji2.text.j.f4887k != null) {
            this.f5648a.i(z8);
        }
    }

    @Override // w8.a
    public final void j(boolean z8) {
        boolean z9 = androidx.emoji2.text.j.f4887k != null;
        f fVar = this.f5648a;
        if (z9) {
            fVar.j(z8);
        } else {
            fVar.f5647c = z8;
        }
    }
}
