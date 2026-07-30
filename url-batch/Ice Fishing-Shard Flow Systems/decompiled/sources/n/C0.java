package n;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class C0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6628e;

    public /* synthetic */ C0(int i2, Object obj) {
        this.f6627d = i2;
        this.f6628e = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
        C0742w0 c0742w0;
        switch (this.f6627d) {
            case 0:
                if (i2 != -1 && (c0742w0 = ((I0) this.f6628e).f6652i) != null) {
                    c0742w0.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f6628e).n(i2);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i2 = this.f6627d;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
