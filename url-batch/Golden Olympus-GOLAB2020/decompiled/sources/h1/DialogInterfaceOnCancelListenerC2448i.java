package h1;

import android.content.DialogInterface;
import com.unity3d.player.M0;

/* renamed from: h1.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnCancelListenerC2448i implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.D f36743a;

    public DialogInterfaceOnCancelListenerC2448i(com.unity3d.player.D d4) {
        this.f36743a = d4;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        M0 m02 = this.f36743a.f22268f;
        if (m02 != null) {
            m02.a();
        }
    }
}
