package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0173y;

/* loaded from: classes2.dex */
public final class G implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C0173y a;

    public G(C0173y c0173y) {
        this.a = c0173y;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
