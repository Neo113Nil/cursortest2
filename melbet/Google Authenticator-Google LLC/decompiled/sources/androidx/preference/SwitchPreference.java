package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.google.android.apps.authenticator2.R;
import defpackage.aiu;
import defpackage.aiv;
import defpackage.aiz;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SwitchPreference extends TwoStatePreference {
    private final aiz c;
    private final CharSequence d;
    private final CharSequence e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int x = pi.x(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        this.c = new aiz(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.l, x, 0);
        o(pi.C(obtainStyledAttributes, 7, 0));
        l(pi.C(obtainStyledAttributes, 6, 1));
        this.d = pi.C(obtainStyledAttributes, 9, 3);
        d();
        this.e = pi.C(obtainStyledAttributes, 8, 4);
        d();
        ((TwoStatePreference) this).b = pi.D(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void X(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.a);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.d);
            r4.setTextOff(this.e);
            r4.setOnCheckedChangeListener(this.c);
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        X(aiuVar.C(android.R.id.switch_widget));
        W(aiuVar);
    }

    @Override // androidx.preference.Preference
    public final void b(View view) {
        B();
        if (((AccessibilityManager) this.j.getSystemService("accessibility")).isEnabled()) {
            X(view.findViewById(android.R.id.switch_widget));
            V(view.findViewById(android.R.id.summary));
        }
    }
}
