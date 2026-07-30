package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5713a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f5715c;

    public /* synthetic */ n(m mVar, int i2, int i5) {
        this.f5713a = i5;
        this.f5715c = mVar;
        this.f5714b = i2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        switch (this.f5713a) {
            case 0:
                u uVar = (u) this.f5715c;
                int i2 = this.f5714b;
                if (!z7) {
                    io.flutter.plugin.editing.i iVar = uVar.f5759o;
                    if (iVar != null) {
                        iVar.b(i2);
                        break;
                    }
                } else {
                    s4.q qVar = (s4.q) uVar.f5760p.f2251d;
                    if (qVar != null) {
                        qVar.a("viewFocused", Integer.valueOf(i2), null);
                        break;
                    }
                }
                break;
            default:
                t tVar = (t) this.f5715c;
                int i5 = this.f5714b;
                if (!z7) {
                    io.flutter.plugin.editing.i iVar2 = tVar.f5735n;
                    if (iVar2 != null) {
                        iVar2.b(i5);
                        break;
                    }
                } else {
                    s4.q qVar2 = (s4.q) tVar.f5736o.f2209e;
                    if (qVar2 != null) {
                        qVar2.a("viewFocused", Integer.valueOf(i5), null);
                        break;
                    }
                }
                break;
        }
    }
}
