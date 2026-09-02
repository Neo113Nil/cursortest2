package m1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303a implements InterfaceC1306d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f14485a = new LinkedHashSet();

    public C1303a(C1307e c1307e) {
        c1307e.c("androidx.savedstate.Restarter", this);
    }

    @Override // m1.InterfaceC1306d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f14485a));
        return bundle;
    }
}
