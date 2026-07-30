package androidx.work;

import G0.C0103c;
import G0.s;
import H0.p;
import android.content.Context;
import c2.e;
import java.util.Collections;
import java.util.List;
import o0.InterfaceC0797b;

/* loaded from: classes.dex */
public final class WorkManagerInitializer implements InterfaceC0797b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4080a = s.f("WrkMgrInitializer");

    @Override // o0.InterfaceC0797b
    public final Object create(Context context) {
        s.d().a(f4080a, "Initializing WorkManager with default configuration.");
        p.b(context, new C0103c(new e()));
        return p.a(context);
    }

    @Override // o0.InterfaceC0797b
    public final List dependencies() {
        return Collections.EMPTY_LIST;
    }
}
