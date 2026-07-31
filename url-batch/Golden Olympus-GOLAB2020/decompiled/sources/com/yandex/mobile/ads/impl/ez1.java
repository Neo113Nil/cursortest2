package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ez1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final km0 f25526a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final im0 f25527b;

    public ez1(@NotNull km0 viewHolderManager) {
        Intrinsics.checkNotNullParameter(viewHolderManager, "viewHolderManager");
        this.f25526a = viewHolderManager;
        this.f25527b = new im0();
    }

    public final void a() {
        db2 db2Var;
        db2 db2Var2;
        j70 instreamAdView;
        j70 instreamAdView2;
        jm0 a4 = this.f25526a.a();
        if (a4 == null || (instreamAdView2 = a4.b()) == null) {
            db2Var = null;
        } else {
            this.f25527b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView2, "instreamAdView");
            db2Var = instreamAdView2.getAdUiElements();
        }
        TextView m4 = db2Var != null ? db2Var.m() : null;
        if (m4 != null) {
            m4.setVisibility(8);
        }
        jm0 a5 = this.f25526a.a();
        if (a5 == null || (instreamAdView = a5.b()) == null) {
            db2Var2 = null;
        } else {
            this.f25527b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            db2Var2 = instreamAdView.getAdUiElements();
        }
        View n4 = db2Var2 != null ? db2Var2.n() : null;
        if (n4 != null) {
            n4.setVisibility(0);
            n4.setEnabled(true);
        }
    }

    public final void a(long j4, long j5) {
        db2 db2Var;
        j70 instreamAdView;
        jm0 a4 = this.f25526a.a();
        if (a4 == null || (instreamAdView = a4.b()) == null) {
            db2Var = null;
        } else {
            this.f25527b.getClass();
            Intrinsics.checkNotNullParameter(instreamAdView, "instreamAdView");
            db2Var = instreamAdView.getAdUiElements();
        }
        TextView m4 = db2Var != null ? db2Var.m() : null;
        int i4 = ((int) ((j4 - j5) / 1000)) + 1;
        if (m4 != null) {
            m4.setText(String.valueOf(i4));
            m4.setVisibility(0);
        }
    }
}
