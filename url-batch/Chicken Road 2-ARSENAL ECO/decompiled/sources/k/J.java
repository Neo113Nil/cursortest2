package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class J implements AdapterView.OnItemSelectedListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4927f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4928g;

    public /* synthetic */ J(int i7, Object obj) {
        this.f4927f = i7;
        this.f4928g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i7, long j4) {
        P p4;
        switch (this.f4927f) {
            case 0:
                if (i7 != -1 && (p4 = ((N) this.f4928g).f4938h) != null) {
                    p4.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f4928g).m(i7);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i7 = this.f4927f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
