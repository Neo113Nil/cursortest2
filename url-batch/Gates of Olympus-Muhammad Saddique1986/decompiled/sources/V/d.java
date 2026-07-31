package V;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f4548a = new d();

    public final AutofillId a(ViewStructure viewStructure) {
        AutofillId autofillId;
        autofillId = viewStructure.getAutofillId();
        return autofillId;
    }

    public final boolean b(AutofillValue autofillValue) {
        boolean isDate;
        isDate = autofillValue.isDate();
        return isDate;
    }

    public final boolean c(AutofillValue autofillValue) {
        boolean isList;
        isList = autofillValue.isList();
        return isList;
    }

    public final boolean d(AutofillValue autofillValue) {
        boolean isText;
        isText = autofillValue.isText();
        return isText;
    }

    public final boolean e(AutofillValue autofillValue) {
        boolean isToggle;
        isToggle = autofillValue.isToggle();
        return isToggle;
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i3) {
        viewStructure.setAutofillId(autofillId, i3);
    }

    public final void h(ViewStructure viewStructure, int i3) {
        viewStructure.setAutofillType(i3);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        CharSequence textValue;
        textValue = autofillValue.getTextValue();
        return textValue;
    }
}
