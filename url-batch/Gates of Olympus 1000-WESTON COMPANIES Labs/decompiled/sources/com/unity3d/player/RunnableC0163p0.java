package com.unity3d.player;

import android.widget.EditText;

/* renamed from: com.unity3d.player.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC0163p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ UnityPlayerForActivityOrService c;

    public RunnableC0163p0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, int i, int i2) {
        this.c = unityPlayerForActivityOrService;
        this.a = i;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0167s abstractC0167s;
        int i;
        abstractC0167s = this.c.mSoftInput;
        if (abstractC0167s != null) {
            int i2 = this.a;
            int i3 = this.b;
            EditText editText = abstractC0167s.c;
            if (editText == null || editText.getText().length() < (i = i3 + i2)) {
                return;
            }
            abstractC0167s.c.setSelection(i2, i);
        }
    }
}
