package u1;

import Z1.i;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f8509a;

    public C1011a(e eVar) {
        i.f(eVar, "registry");
        this.f8509a = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // u1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f8509a));
        return bundle;
    }
}
