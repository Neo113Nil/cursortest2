package o1;

import android.text.Editable;
import android.text.TextWatcher;
import com.gdmhkmf.belbet.MainActivity2;
import java.util.Locale;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class n implements TextWatcher {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MainActivity2 f2913f;

    public n(MainActivity2 mainActivity2) {
        this.f2913f = mainActivity2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String obj;
        String obj2 = (editable == null || (obj = editable.toString()) == null) ? null : p3.d.E0(obj).toString();
        if (obj2 == null) {
            obj2 = "";
        }
        Locale locale = Locale.getDefault();
        i3.d.d(locale, "getDefault(...)");
        String lowerCase = obj2.toLowerCase(locale);
        i3.d.d(lowerCase, "toLowerCase(...)");
        MainActivity2 mainActivity2 = this.f2913f;
        mainActivity2.L = lowerCase;
        mainActivity2.s();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i5) {
    }
}
