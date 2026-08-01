package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j0 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l0 f1077g;

    public j0(l0 l0Var, int i) {
        this.f1077g = l0Var;
        this.f1076f = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q qVar = this.f1077g.d;
        x b2 = x.b(this.f1076f, qVar.f1088c0.f1123g);
        b bVar = qVar.f1087b0;
        x xVar = bVar.f1034g;
        x xVar2 = bVar.f1033f;
        if (b2.compareTo(xVar2) < 0) {
            b2 = xVar2;
        } else if (b2.compareTo(xVar) > 0) {
            b2 = xVar;
        }
        qVar.I(b2);
        qVar.J(1);
        MaterialButton materialButton = qVar.f1095l0;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
