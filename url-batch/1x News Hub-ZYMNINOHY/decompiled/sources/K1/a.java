package K1;

import Y1.M;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import io.flutter.plugin.platform.j;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f866a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f868c;

    public a(View.OnFocusChangeListener onFocusChangeListener, b bVar) {
        this.f867b = onFocusChangeListener;
        this.f868c = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f866a) {
            case 0:
                b bVar = (b) this.f868c;
                this.f867b.onFocusChange(bVar, android.support.v4.media.session.a.U(bVar, new M(12)));
                break;
            default:
                j jVar = (j) this.f868c;
                this.f867b.onFocusChange(jVar, android.support.v4.media.session.a.U(jVar, new M(12)));
                break;
        }
    }

    public a(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f868c = jVar;
        this.f867b = onFocusChangeListener;
    }
}
