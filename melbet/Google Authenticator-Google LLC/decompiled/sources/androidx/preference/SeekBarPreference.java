package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import defpackage.aiu;
import defpackage.aiv;
import defpackage.aiw;
import defpackage.aix;
import defpackage.aiy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SeekBarPreference extends Preference {
    private final boolean F;
    private final SeekBar.OnSeekBarChangeListener G;
    private final View.OnKeyListener H;
    public int a;
    public int b;
    public boolean c;
    public SeekBar d;
    public final boolean e;
    public final boolean f;
    private int g;
    private int h;
    private TextView i;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.G = new aiw(this);
        this.H = new aix(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.k, R.attr.seekBarPreferenceStyle, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.b;
        i = i < i2 ? i2 : i;
        if (i != this.g) {
            this.g = i;
            d();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.h) {
            this.h = Math.min(this.g - this.b, Math.abs(i3));
            d();
        }
        this.e = obtainStyledAttributes.getBoolean(2, true);
        this.F = obtainStyledAttributes.getBoolean(5, false);
        this.f = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    private final void o(int i, boolean z) {
        int i2 = this.b;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        if (i != this.a) {
            this.a = i;
            l(i);
            if (P() && i != p(~i)) {
                SharedPreferences.Editor b = this.k.b();
                b.putInt(this.s, i);
                super.J(b);
            }
            if (z) {
                d();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void a(aiu aiuVar) {
        super.a(aiuVar);
        aiuVar.a.setOnKeyListener(this.H);
        this.d = (SeekBar) aiuVar.C(R.id.seekbar);
        TextView textView = (TextView) aiuVar.C(R.id.seekbar_value);
        this.i = textView;
        if (this.F) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.i = null;
        }
        SeekBar seekBar = this.d;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.G);
        this.d.setMax(this.g - this.b);
        int i = this.h;
        SeekBar seekBar2 = this.d;
        if (i != 0) {
            seekBar2.setKeyProgressIncrement(i);
        } else {
            this.h = seekBar2.getKeyProgressIncrement();
        }
        this.d.setProgress(this.a - this.b);
        l(this.a);
        this.d.setEnabled(O());
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        Parcelable bk = super.bk();
        if (this.w) {
            return bk;
        }
        aiy aiyVar = new aiy(bk);
        aiyVar.a = this.a;
        aiyVar.b = this.b;
        aiyVar.c = this.g;
        return aiyVar;
    }

    @Override // androidx.preference.Preference
    protected final Object f(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aiy.class)) {
            super.g(parcelable);
            return;
        }
        aiy aiyVar = (aiy) parcelable;
        super.g(aiyVar.getSuperState());
        this.a = aiyVar.a;
        this.b = aiyVar.b;
        this.g = aiyVar.c;
        d();
    }

    @Override // androidx.preference.Preference
    protected final void h(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        o(p(((Integer) obj).intValue()), true);
    }

    public final void k(SeekBar seekBar) {
        int progress = this.b + seekBar.getProgress();
        if (progress != this.a) {
            if (L(Integer.valueOf(progress))) {
                o(progress, false);
            } else {
                seekBar.setProgress(this.a - this.b);
                l(this.a);
            }
        }
    }

    public final void l(int i) {
        TextView textView = this.i;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }
}
