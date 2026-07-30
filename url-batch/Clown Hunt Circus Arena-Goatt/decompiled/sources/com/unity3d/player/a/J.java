package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.N0;

/* loaded from: classes.dex */
public final class J implements DialogInterface.OnCancelListener {
    public final /* synthetic */ com.unity3d.player.E a;

    public J(com.unity3d.player.E e) {
        this.a = e;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        N0 n0 = this.a.f;
        if (n0 != null) {
            n0.a();
        }
    }
}
