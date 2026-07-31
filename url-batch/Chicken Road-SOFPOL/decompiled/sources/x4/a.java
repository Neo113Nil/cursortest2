package x4;

import android.os.Bundle;
import d6.m;
import java.util.Arrays;
import java.util.LinkedHashSet;
import r2.o;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f8652a = new LinkedHashSet();

    public a(e eVar) {
        eVar.f("androidx.savedstate.Restarter", this);
    }

    @Override // x4.d
    public final Bundle a() {
        Bundle j7 = h0.a.j((c6.f[]) Arrays.copyOf(new c6.f[0], 0));
        o.h0(j7, "classes_to_restore", m.g0(this.f8652a));
        return j7;
    }
}
