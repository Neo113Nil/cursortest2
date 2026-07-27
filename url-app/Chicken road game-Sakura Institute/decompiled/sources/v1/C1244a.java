package v1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244a implements InterfaceC1247d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10976a;

    public C1244a(C1248e registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f10976a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // v1.InterfaceC1247d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f10976a));
        return bundle;
    }
}
