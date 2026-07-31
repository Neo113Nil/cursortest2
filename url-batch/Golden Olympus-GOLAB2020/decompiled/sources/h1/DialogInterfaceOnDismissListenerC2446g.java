package h1;

import android.content.DialogInterface;

/* renamed from: h1.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC2446g implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.D f36741a;

    public DialogInterfaceOnDismissListenerC2446g(com.unity3d.player.D d4) {
        this.f36741a = d4;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f36741a.invokeOnClose();
    }
}
