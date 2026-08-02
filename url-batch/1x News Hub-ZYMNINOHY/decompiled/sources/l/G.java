package l;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class G implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9726b;

    public /* synthetic */ G(int i3, Object obj) {
        this.f9725a = i3;
        this.f9726b = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        M m3;
        switch (this.f9725a) {
            case 0:
                if (i3 != -1 && (m3 = ((K) this.f9726b).f9735c) != null) {
                    m3.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f9726b).m(i3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f9725a;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
