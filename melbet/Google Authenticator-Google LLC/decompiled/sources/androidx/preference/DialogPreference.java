package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.apps.authenticator2.R;
import defpackage.aio;
import defpackage.aiv;
import defpackage.pi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence a;
    public CharSequence b;
    public Drawable c;
    public CharSequence d;
    public CharSequence e;
    public int f;

    public DialogPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.c, i, 0);
        String C = pi.C(obtainStyledAttributes, 9, 0);
        this.a = C;
        if (C == null) {
            this.a = this.p;
        }
        this.b = pi.C(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.d = pi.C(obtainStyledAttributes, 11, 3);
        this.e = pi.C(obtainStyledAttributes, 10, 4);
        this.f = pi.z(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void c() {
        aio aioVar = this.k.e;
        if (aioVar != null) {
            aioVar.o(this);
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pi.x(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
