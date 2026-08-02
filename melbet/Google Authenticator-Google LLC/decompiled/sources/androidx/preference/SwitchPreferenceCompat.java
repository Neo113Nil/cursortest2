package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import com.google.android.apps.authenticator2.R;
import defpackage.aiu;
import defpackage.aiv;
import defpackage.aiz;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    private final CharSequence c;
    private final CharSequence d;
    private final aiz e;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.e = new aiz(this, 2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.m, R.attr.switchPreferenceCompatStyle, 0);
        o(pi.C(obtainStyledAttributes, 7, 0));
        l(pi.C(obtainStyledAttributes, 6, 1));
        this.c = pi.C(obtainStyledAttributes, 9, 3);
        d();
        this.d = pi.C(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = pi.D(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.e(this.c);
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.d(this.d);
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener(this.e);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        X(aiuVar.C(R.id.switchWidget));
        W(aiuVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(R.id.switchWidget));
            V(view.findViewById(android.R.id.summary));
        }
    }
}
