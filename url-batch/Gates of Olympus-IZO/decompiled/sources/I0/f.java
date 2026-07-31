package I0;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final B0.i f2448a;

    public f(B0.i iVar) {
        this.f2448a = iVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f2448a.getClass();
    }
}
