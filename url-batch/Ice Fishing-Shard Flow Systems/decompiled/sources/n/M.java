package n;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class M implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6675e;

    public /* synthetic */ M(int i2, Object obj) {
        this.f6674d = i2;
        this.f6675e = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        switch (this.f6674d) {
            case 0:
                O o7 = (O) this.f6675e;
                S s7 = o7.f6686N;
                s7.setSelection(i2);
                if (s7.getOnItemClickListener() != null) {
                    s7.performItemClick(view, i2, o7.f6683K.getItemId(i2));
                }
                o7.dismiss();
                break;
            default:
                ((SearchView) this.f6675e).m(i2);
                break;
        }
    }
}
