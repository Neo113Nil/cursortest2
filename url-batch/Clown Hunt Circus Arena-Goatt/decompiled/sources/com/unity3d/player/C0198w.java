package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198w implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0200x a;

    public C0198w(AbstractC0200x abstractC0200x) {
        this.a = abstractC0200x;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0200x abstractC0200x = this.a;
            abstractC0200x.a(abstractC0200x.b(), false);
        }
        return false;
    }
}
