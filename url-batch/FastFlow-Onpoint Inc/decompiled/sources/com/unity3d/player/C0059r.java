package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059r implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0060s a;

    public C0059r(AbstractC0060s abstractC0060s) {
        this.a = abstractC0060s;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0060s abstractC0060s = this.a;
            abstractC0060s.a(abstractC0060s.a(), false);
        }
        return false;
    }
}
