package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class hy implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hy(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        xk xkVar;
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 0:
                if (i != -1 && (xkVar = ((ny) obj).h) != null) {
                    xkVar.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) obj).o(i);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
