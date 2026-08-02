package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: k.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1181E implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13916b;

    public /* synthetic */ C1181E(int i4, Object obj) {
        this.f13915a = i4;
        this.f13916b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
        C1187K c1187k;
        switch (this.f13915a) {
            case 0:
                if (i4 != -1 && (c1187k = ((AbstractC1185I) this.f13916b).f13925c) != null) {
                    c1187k.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f13916b).m(i4);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i4 = this.f13915a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
