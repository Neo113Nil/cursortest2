package V;

import O1.k;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f1588a;

    public a(k registry) {
        j.e(registry, "registry");
        this.f1588a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // V.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1588a));
        return bundle;
    }
}
