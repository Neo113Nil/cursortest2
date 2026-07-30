package defpackage;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class h8 {
    public static final h8 a = new h8();

    public final void a(View view, q22 q22Var) {
        Context context = view.getContext();
        PointerIcon systemIcon = q22Var instanceof va ? PointerIcon.getSystemIcon(context, ((va) q22Var).b) : PointerIcon.getSystemIcon(context, 1000);
        if (Intrinsics.b(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
