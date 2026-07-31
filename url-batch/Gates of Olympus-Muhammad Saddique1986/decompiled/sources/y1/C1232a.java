package y1;

import android.os.Bundle;
import f2.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1232a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f10384a;

    public C1232a(e eVar) {
        j.f(eVar, "registry");
        this.f10384a = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // y1.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f10384a));
        return bundle;
    }
}
