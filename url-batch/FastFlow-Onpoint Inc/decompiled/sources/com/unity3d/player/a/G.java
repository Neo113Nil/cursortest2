package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.C0066y;

/* loaded from: classes.dex */
public final class G implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C0066y a;

    public G(C0066y c0066y) {
        this.a = c0066y;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.invokeOnClose();
    }
}
