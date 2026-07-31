package e0;

import android.graphics.Outline;
import b0.C0278k;
import b0.InterfaceC0258I;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f4569a = new k();

    public final void a(Outline outline, InterfaceC0258I interfaceC0258I) {
        if (!(interfaceC0258I instanceof C0278k)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((C0278k) interfaceC0258I).f4278a);
    }
}
