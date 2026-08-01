package x0;

import android.text.InputFilter;
import android.widget.TextView;
import androidx.emoji2.text.l;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g extends r1.b {

    /* renamed from: a, reason: collision with root package name */
    public final f f3851a;

    public g(TextView textView) {
        this.f3851a = new f(textView);
    }

    @Override // r1.b
    public final InputFilter[] l(InputFilter[] inputFilterArr) {
        return !(l.f454k != null) ? inputFilterArr : this.f3851a.l(inputFilterArr);
    }

    @Override // r1.b
    public final void y(boolean z4) {
        if (l.f454k != null) {
            this.f3851a.y(z4);
        }
    }

    @Override // r1.b
    public final void z(boolean z4) {
        f fVar = this.f3851a;
        if (l.f454k != null) {
            fVar.z(z4);
        } else {
            fVar.f3850c = z4;
        }
    }
}
