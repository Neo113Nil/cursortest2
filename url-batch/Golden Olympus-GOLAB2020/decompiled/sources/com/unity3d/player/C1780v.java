package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1780v implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1782w f22260a;

    public C1780v(AbstractC1782w abstractC1782w) {
        this.f22260a = abstractC1782w;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
        if (i4 == 6) {
            AbstractC1782w abstractC1782w = this.f22260a;
            abstractC1782w.a(abstractC1782w.b(), false);
        }
        return false;
    }
}
