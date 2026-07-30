package h;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* renamed from: h.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146F implements AdapterView.OnItemSelectedListener {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2097f;

    public /* synthetic */ C0146F(int i2, Object obj) {
        this.f2096e = i2;
        this.f2097f = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        L l2;
        switch (this.f2096e) {
            case 0:
                if (i2 != -1 && (l2 = ((J) this.f2097f).f2106g) != null) {
                    l2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f2097f).m(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f2096e;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
