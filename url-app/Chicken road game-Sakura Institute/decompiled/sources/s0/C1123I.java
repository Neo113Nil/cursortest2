package s0;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import l0.C0803a;
import l0.InterfaceC0817o;

/* renamed from: s0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1123I {

    /* renamed from: a, reason: collision with root package name */
    public static final C1123I f10055a = new C1123I();

    public final void a(View view, InterfaceC0817o interfaceC0817o) {
        PointerIcon systemIcon = interfaceC0817o instanceof C0803a ? PointerIcon.getSystemIcon(view.getContext(), ((C0803a) interfaceC0817o).f7884b) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        if (Intrinsics.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
