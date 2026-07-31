package com.unity3d.player;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.unity3d.player.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0166r implements TextView.OnEditorActionListener {
    public final /* synthetic */ AbstractC0167s a;

    public C0166r(AbstractC0167s abstractC0167s) {
        this.a = abstractC0167s;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            AbstractC0167s abstractC0167s = this.a;
            abstractC0167s.a(abstractC0167s.a(), false);
        }
        return false;
    }
}
