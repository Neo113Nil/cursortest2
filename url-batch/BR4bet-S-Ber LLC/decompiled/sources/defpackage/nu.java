package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.moontiko.really.admiralcasino.MainActivity2;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class nu implements TextWatcher {
    public final /* synthetic */ MainActivity2 f;

    public nu(MainActivity2 mainActivity2) {
        this.f = mainActivity2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = MainActivity2.H;
        ry r = this.f.r();
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        r.getClass();
        r.e = obj;
        r.d();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
