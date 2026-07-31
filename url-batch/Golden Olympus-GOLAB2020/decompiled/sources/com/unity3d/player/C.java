package com.unity3d.player;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes2.dex */
public final class C extends EditText {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1782w f21999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f22000b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(D d4, Context context, AbstractC1782w abstractC1782w) {
        super(context);
        this.f22000b = d4;
        this.f21999a = abstractC1782w;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
        h1.X x4;
        h1.W w4;
        Runnable runnable;
        if (i4 == 4) {
            if (keyEvent.getAction() == 1 && (x4 = this.f22000b.f22004h.f22282e) != null && (w4 = x4.f36724a) != null && (runnable = w4.f36723a) != null) {
                runnable.run();
            }
            return true;
        }
        if (i4 == 84) {
            return true;
        }
        if (i4 == 66 && keyEvent.getAction() == 0 && (getInputType() & 131072) == 0) {
            AbstractC1782w abstractC1782w = this.f21999a;
            abstractC1782w.a(abstractC1782w.b(), false);
            return true;
        }
        if (i4 != 111 || keyEvent.getAction() != 0) {
            return super.onKeyPreIme(i4, keyEvent);
        }
        AbstractC1782w abstractC1782w2 = this.f21999a;
        abstractC1782w2.a(abstractC1782w2.b(), true);
        return true;
    }

    @Override // android.widget.TextView
    public void onSelectionChanged(int i4, int i5) {
        super.onSelectionChanged(i4, i5);
        this.f21999a.f22264b.reportSoftInputSelection(i4, i5 - i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (z4) {
            requestFocus();
            this.f21999a.c();
        }
    }
}
