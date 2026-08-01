package y0;

import android.view.View;

/* renamed from: y0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424c extends AbstractC0422a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DialogC0426e f4717a;

    public C0424c(DialogC0426e dialogC0426e) {
        this.f4717a = dialogC0426e;
    }

    @Override // y0.AbstractC0422a
    public final void b(View view) {
    }

    @Override // y0.AbstractC0422a
    public final void c(View view, int i) {
        if (i == 5) {
            this.f4717a.cancel();
        }
    }
}
