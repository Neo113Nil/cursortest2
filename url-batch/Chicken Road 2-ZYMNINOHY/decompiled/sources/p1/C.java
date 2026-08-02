package p1;

import android.view.View;
import android.view.ViewGroup;
import com.rockchicken.pump.up.road.R;

/* loaded from: classes.dex */
public final class C extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14731c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f14732d;

    public C(h hVar, ViewGroup viewGroup, View view, View view2) {
        this.f14732d = hVar;
        this.f14729a = viewGroup;
        this.f14730b = view;
        this.f14731c = view2;
    }

    @Override // p1.p
    public final void a(q qVar) {
        this.f14731c.setTag(R.id.save_overlay_view, null);
        this.f14729a.getOverlay().remove(this.f14730b);
        qVar.w(this);
    }

    @Override // p1.r, p1.p
    public final void b() {
        this.f14729a.getOverlay().remove(this.f14730b);
    }

    @Override // p1.r, p1.p
    public final void d() {
        View view = this.f14730b;
        if (view.getParent() == null) {
            this.f14729a.getOverlay().add(view);
        } else {
            this.f14732d.d();
        }
    }
}
