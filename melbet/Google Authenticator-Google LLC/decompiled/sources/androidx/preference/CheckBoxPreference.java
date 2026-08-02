package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.google.android.apps.authenticator2.R;
import defpackage.aiu;
import defpackage.aiv;
import defpackage.aiz;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckBoxPreference extends TwoStatePreference {
    private final aiz c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int x = pi.x(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        this.c = new aiz(this, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.b, x, 0);
        o(pi.C(obtainStyledAttributes, 5, 0));
        l(pi.C(obtainStyledAttributes, 4, 1));
        ((TwoStatePreference) this).b = pi.D(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        X(aiuVar.C(android.R.id.checkbox));
        W(aiuVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(android.R.id.checkbox));
            V(view.findViewById(android.R.id.summary));
        }
    }
}
