package p3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f7654d;

    /* renamed from: e, reason: collision with root package name */
    public final f f7655e;

    /* renamed from: i, reason: collision with root package name */
    public final int f7656i;

    public a(int i3, f fVar, int i10) {
        this.f7654d = i3;
        this.f7655e = fVar;
        this.f7656i = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f7654d);
        this.f7655e.f7665a.performAction(this.f7656i, bundle);
    }
}
