package com.unity3d.player;

import android.widget.EditText;

/* renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0157m0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0157m0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0167s abstractC0167s;
        String str;
        EditText editText;
        abstractC0167s = this.b.mSoftInput;
        if (abstractC0167s == null || (str = this.a) == null || (editText = abstractC0167s.c) == null) {
            return;
        }
        editText.setText(str);
        abstractC0167s.c.setSelection(str.length());
    }
}
