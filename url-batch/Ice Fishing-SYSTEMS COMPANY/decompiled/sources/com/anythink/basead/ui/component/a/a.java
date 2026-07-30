package com.anythink.basead.ui.component.a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.ScanningAnimButton;

/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    protected ScanningAnimButton f10846a;

    /* renamed from: b, reason: collision with root package name */
    protected ScanningAnimButton f10847b;

    @Override // com.anythink.basead.ui.component.a.d
    public void a(ViewGroup viewGroup) {
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final View b() {
        return this.f10846a;
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final View c() {
        return this.f10847b;
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void a(Drawable drawable) {
        ScanningAnimButton scanningAnimButton = this.f10846a;
        if (scanningAnimButton == null || drawable == null) {
            return;
        }
        try {
            scanningAnimButton.setBackground(drawable);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void a(String str) {
        ScanningAnimButton scanningAnimButton = this.f10846a;
        if (scanningAnimButton != null) {
            scanningAnimButton.setText(str);
        }
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final String a() {
        ScanningAnimButton scanningAnimButton = this.f10846a;
        if (scanningAnimButton != null) {
            scanningAnimButton.getText().toString();
            return "";
        }
        return "";
    }
}
