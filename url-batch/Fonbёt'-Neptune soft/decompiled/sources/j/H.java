package j;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class H implements AdapterView.OnItemSelectedListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2868f;

    public /* synthetic */ H(int i2, Object obj) {
        this.f2867e = i2;
        this.f2868f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        N n2;
        switch (this.f2867e) {
            case 0:
                if (i2 != -1 && (n2 = ((L) this.f2868f).f2878g) != null) {
                    n2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2868f).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2867e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
