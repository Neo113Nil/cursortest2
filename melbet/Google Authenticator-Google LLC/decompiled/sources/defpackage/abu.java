package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.drawerlayout.widget.DrawerLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abu extends wv {
    final /* synthetic */ DrawerLayout a;

    public abu(DrawerLayout drawerLayout) {
        this.a = drawerLayout;
        new Rect();
    }

    @Override // defpackage.wv
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.wv
    public final void c(View view, aah aahVar) {
        super.c(view, aahVar);
        aahVar.o("androidx.drawerlayout.widget.DrawerLayout");
        aahVar.u(false);
        aahVar.v(false);
        aahVar.H(aag.a);
        aahVar.H(aag.b);
    }

    @Override // defpackage.wv
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.g(view, accessibilityEvent);
        }
        accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.a;
        View f = drawerLayout.f();
        if (f == null) {
            return true;
        }
        Gravity.getAbsoluteGravity(drawerLayout.c(f), drawerLayout.getLayoutDirection());
        return true;
    }
}
