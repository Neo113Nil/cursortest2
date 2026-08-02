package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.a;
import defpackage.aik;
import defpackage.air;
import defpackage.aiv;
import defpackage.pi;
import defpackage.qy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class PreferenceGroup extends Preference {
    final qy a;
    public final List b;
    public int c;
    private boolean d;
    private int e;
    private boolean f;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new qy(0);
        new Handler(Looper.getMainLooper());
        this.d = true;
        this.e = 0;
        this.f = false;
        this.c = Integer.MAX_VALUE;
        this.b = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiv.i, i, i2);
        this.d = pi.D(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            V(pi.G(obtainStyledAttributes, 1, 1));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void A() {
        super.K();
        this.f = false;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).A();
        }
    }

    public final void V(int i) {
        if (i != Integer.MAX_VALUE && !N()) {
            Log.e("PreferenceGroup", String.valueOf(getClass().getSimpleName()).concat(" should have a key defined if it contains an expandable preference"));
        }
        this.c = i;
    }

    public boolean W() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(Preference preference) {
        long a;
        List list = this.b;
        if (list.contains(preference)) {
            return;
        }
        if (preference.s != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.B;
                if (preferenceGroup2 == null) {
                    break;
                } else {
                    preferenceGroup = preferenceGroup2;
                }
            }
            String str = preference.s;
            if (preferenceGroup.l(str) != null) {
                Log.e("PreferenceGroup", a.Z(str, "Found duplicated key: \"", "\". This can cause unintended behaviour, please use unique keys for every preference."));
            }
        }
        if (preference.o == Integer.MAX_VALUE) {
            if (this.d) {
                int i = this.e;
                this.e = i + 1;
                preference.F(i);
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).d = this.d;
            }
        }
        int binarySearch = Collections.binarySearch(list, preference);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        preference.R(j());
        synchronized (this) {
            this.b.add(binarySearch, preference);
        }
        air airVar = this.k;
        String str2 = preference.s;
        try {
            if (str2 != null) {
                qy qyVar = this.a;
                if (qyVar.containsKey(str2)) {
                    a = ((Long) qyVar.get(str2)).longValue();
                    qyVar.remove(str2);
                    preference.l = a;
                    preference.m = true;
                    preference.z(airVar);
                    preference.m = false;
                    if (preference.B == null) {
                        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                    }
                    preference.B = this;
                    if (this.f) {
                        preference.y();
                    }
                    x();
                    return;
                }
            }
            preference.z(airVar);
            preference.m = false;
            if (preference.B == null) {
            }
        } catch (Throwable th) {
            preference.m = false;
            throw th;
        }
        a = airVar.a();
        preference.l = a;
        preference.m = true;
    }

    @Override // androidx.preference.Preference
    protected final Parcelable bk() {
        return new aik(super.bk(), this.c);
    }

    @Override // androidx.preference.Preference
    protected final void g(Parcelable parcelable) {
        if (!parcelable.getClass().equals(aik.class)) {
            super.g(parcelable);
            return;
        }
        aik aikVar = (aik) parcelable;
        this.c = aikVar.a;
        super.g(aikVar.getSuperState());
    }

    public final int k() {
        return this.b.size();
    }

    public final Preference l(CharSequence charSequence) {
        Preference l;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.s, charSequence)) {
            return this;
        }
        int k = k();
        for (int i = 0; i < k; i++) {
            Preference o = o(i);
            if (TextUtils.equals(o.s, charSequence)) {
                return o;
            }
            if ((o instanceof PreferenceGroup) && (l = ((PreferenceGroup) o).l(charSequence)) != null) {
                return l;
            }
        }
        return null;
    }

    public final Preference o(int i) {
        return (Preference) this.b.get(i);
    }

    @Override // androidx.preference.Preference
    public final void u(Bundle bundle) {
        super.u(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).u(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void v(Bundle bundle) {
        super.v(bundle);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).v(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void w(boolean z) {
        super.w(z);
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).R(z);
        }
    }

    @Override // androidx.preference.Preference
    public final void y() {
        super.C();
        this.f = true;
        int k = k();
        for (int i = 0; i < k; i++) {
            o(i).y();
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
