package i;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: i.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152G implements AdapterView.OnItemSelectedListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2128f;

    public /* synthetic */ C0152G(int i2, Object obj) {
        this.f2127e = i2;
        this.f2128f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        M m2;
        switch (this.f2127e) {
            case 0:
                if (i2 != -1 && (m2 = ((K) this.f2128f).f2137g) != null) {
                    m2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2128f).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2127e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
