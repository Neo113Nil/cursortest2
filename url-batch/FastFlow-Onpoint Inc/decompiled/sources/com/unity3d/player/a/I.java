package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0066y;
import com.unity3d.player.F0;

/* loaded from: classes.dex */
public final class I implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C0066y a;

    public I(C0066y c0066y) {
        this.a = c0066y;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        F0 f0 = this.a.f;
        if (f0 != null) {
            f0.a();
        }
    }
}
