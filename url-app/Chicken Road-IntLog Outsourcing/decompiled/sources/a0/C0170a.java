package a0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.i;

/* renamed from: a0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170a implements InterfaceC0174e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3820a;

    public C0170a(C0175f registry) {
        i.e(registry, "registry");
        this.f3820a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // a0.InterfaceC0174e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f3820a));
        return bundle;
    }
}
