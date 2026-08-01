package f5;

import android.os.Bundle;
import c6.l;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.k0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4106a = new LinkedHashSet();

    public a(l lVar) {
        lVar.i("androidx.savedstate.Restarter", this);
    }

    @Override // f5.d
    public final Bundle a() {
        k0.f5575d.getClass();
        Bundle h10 = w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        cf.c.D(h10, "classes_to_restore", CollectionsKt.Q(this.f4106a));
        return h10;
    }
}
