package g;

import android.os.Bundle;
import com.shotwins.games.MainActivity;
import h0.C0132d;
import h0.InterfaceC0131c;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123g implements InterfaceC0131c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2318a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2319b;

    public C0123g(C0132d c0132d) {
        X0.d.e(c0132d, "registry");
        this.f2319b = new LinkedHashSet();
        c0132d.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.InterfaceC0131c
    public final Bundle a() {
        switch (this.f2318a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f2319b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2319b));
                return bundle2;
        }
    }

    public C0123g(MainActivity mainActivity) {
        this.f2319b = mainActivity;
    }
}
