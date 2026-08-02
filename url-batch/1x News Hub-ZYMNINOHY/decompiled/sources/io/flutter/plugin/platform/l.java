package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f9264c;

    public /* synthetic */ l(k kVar, int i3, int i4) {
        this.f9262a = i4;
        this.f9264c = kVar;
        this.f9263b = i3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f9262a) {
            case 0:
                r rVar = (r) this.f9264c;
                int i3 = this.f9263b;
                if (!z) {
                    io.flutter.plugin.editing.k kVar = rVar.f9300g;
                    if (kVar != null) {
                        kVar.b(i3);
                        break;
                    }
                } else {
                    P1.o oVar = (P1.o) rVar.f9301h.f1599b;
                    if (oVar != null) {
                        oVar.a("viewFocused", Integer.valueOf(i3), null);
                        break;
                    }
                }
                break;
            default:
                q qVar = (q) this.f9264c;
                int i4 = this.f9263b;
                if (!z) {
                    io.flutter.plugin.editing.k kVar2 = qVar.f;
                    if (kVar2 != null) {
                        kVar2.b(i4);
                        break;
                    }
                } else {
                    P1.o oVar2 = (P1.o) qVar.f9284g.f1599b;
                    if (oVar2 != null) {
                        oVar2.a("viewFocused", Integer.valueOf(i4), null);
                        break;
                    }
                }
                break;
        }
    }
}
