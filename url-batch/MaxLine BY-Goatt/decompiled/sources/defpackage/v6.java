package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class v6 extends nm implements uh2, mo0 {
    public final mm a;
    public final ei2 b;
    public final t7 c;
    public final x72 d;
    public final String e;
    public final AutofillId f;
    public final an1 g;
    public boolean h;

    public v6(mm mmVar, ei2 ei2Var, t7 t7Var, x72 x72Var, String str) {
        this.a = mmVar;
        this.b = ei2Var;
        this.c = t7Var;
        this.d = x72Var;
        this.e = str;
        new Rect();
        t7Var.setImportantForAutofill(1);
        mm k = th2.k(t7Var);
        AutofillId autofillId = k != null ? (AutofillId) k.a : null;
        if (autofillId == null) {
            throw q40.f("Required value was null.");
        }
        this.f = autofillId;
        this.g = new an1();
    }

    public final void a(SparseArray sparseArray) {
        sh2 w;
        Function1 function1;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue a = a.a(sparseArray.get(keyAt));
            if (a.isText()) {
                i91 i91Var = (i91) this.b.c.b(keyAt);
                if (i91Var != null && (w = i91Var.w()) != null) {
                    Object g = w.m.g(rh2.g);
                    if (g == null) {
                        g = null;
                    }
                    r1 r1Var = (r1) g;
                    if (r1Var != null && (function1 = (Function1) r1Var.b) != null) {
                    }
                }
            } else if (a.isDate()) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (a.isList()) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (a.isToggle()) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }
}
