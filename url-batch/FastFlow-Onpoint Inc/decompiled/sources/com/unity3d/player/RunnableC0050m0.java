package com.unity3d.player;

import android.widget.EditText;

/* renamed from: com.unity3d.player.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0050m0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ UnityPlayerForActivityOrService b;

    public RunnableC0050m0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, String str) {
        this.b = unityPlayerForActivityOrService;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0060s abstractC0060s;
        String str;
        EditText editText;
        abstractC0060s = this.b.mSoftInput;
        if (abstractC0060s == null || (str = this.a) == null || (editText = abstractC0060s.c) == null) {
            return;
        }
        editText.setText(str);
        abstractC0060s.c.setSelection(str.length());
    }
}
