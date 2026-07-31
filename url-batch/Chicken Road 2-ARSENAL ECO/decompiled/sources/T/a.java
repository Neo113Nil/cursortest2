package T;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2206a = new LinkedHashSet();

    public a(f fVar) {
        fVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // T.e
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f2206a));
        return bundle;
    }
}
