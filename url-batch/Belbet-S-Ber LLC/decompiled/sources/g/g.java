package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class g implements h1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1519a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1520b;

    public g(h1.c cVar) {
        this.f1519a = 1;
        this.f1520b = new LinkedHashSet();
        cVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h1.b
    public final Bundle a() {
        switch (this.f1519a) {
            case 0:
                Bundle bundle = new Bundle();
                ((i) this.f1520b).k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1520b));
                return bundle2;
        }
    }

    public g(i iVar) {
        this.f1519a = 0;
        this.f1520b = iVar;
    }
}
