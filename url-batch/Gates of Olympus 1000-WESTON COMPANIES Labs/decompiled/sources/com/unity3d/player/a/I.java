package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0173y;
import com.unity3d.player.F0;

/* loaded from: classes2.dex */
public final class I implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C0173y a;

    public I(C0173y c0173y) {
        this.a = c0173y;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F0 f0 = this.a.f;
        if (f0 != null) {
            f0.a();
        }
    }
}
