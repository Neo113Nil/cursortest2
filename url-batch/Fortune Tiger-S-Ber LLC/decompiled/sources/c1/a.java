package c1;

import android.os.Bundle;
import f.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f996a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f997b;

    public a(d dVar) {
        this.f996a = 0;
        this.f997b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f996a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f997b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((i) this.f997b).m().getClass();
                return bundle2;
        }
    }

    public a(i iVar) {
        this.f996a = 1;
        this.f997b = iVar;
    }
}
