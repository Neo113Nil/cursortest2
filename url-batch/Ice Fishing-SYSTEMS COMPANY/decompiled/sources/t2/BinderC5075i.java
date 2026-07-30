package t2;

import android.content.Context;
import java.util.Objects;
import q2.AbstractBinderC4904n0;
import q2.C4927z0;

/* renamed from: t2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC5075i extends AbstractBinderC4904n0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f40905n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C5077k f40906u;

    public BinderC5075i(C5077k c5077k, Context context) {
        this.f40905n = context;
        Objects.requireNonNull(c5077k);
        this.f40906u = c5077k;
    }

    @Override // q2.InterfaceC4906o0
    public final void c0(C4927z0 c4927z0) {
        if (c4927z0 == null) {
            return;
        }
        this.f40906u.i(this.f40905n, c4927z0.f40123u, true, true);
    }
}
