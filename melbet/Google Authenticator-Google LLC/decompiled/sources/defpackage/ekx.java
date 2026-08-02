package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.material.button.MaterialButton;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ekx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public ekx(ehq ehqVar, byte[] bArr) {
        this.c = ehqVar.a;
        this.b = ehqVar.b;
        this.a = i(true, new aux(this, 16));
        this.d = i(false, new aux(this, 17));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void d(efu efuVar, View view) {
        if (view instanceof efw) {
            ((efw) view).b(efuVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                d(efuVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void f(efu efuVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                f(efuVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof efw) {
            ((efw) view).e(efuVar);
        }
    }

    private final kzq i(boolean z, kri kriVar) {
        return new kzl(new ehp(this, kriVar, z, (kqj) null, 0));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, koe] */
    public final void a() {
        if (((AtomicBoolean) this.a).getAndSet(true)) {
            return;
        }
        if (!((gzp) this.c).f()) {
            ((eni) ((gzs) this.b).a.b()).l();
        }
        ((epq) ((gzs) this.d).a.b()).a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dqy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dov, java.lang.Object] */
    public final ehv b() {
        return dih.H(this.c, this.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [efx, java.lang.Object] */
    public final hvi c(gzf gzfVar) {
        return hoq.au(this.c.a(), new egl(this, gzfVar, 0), huf.a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [efu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [dov, java.lang.Object] */
    public final void e(View view, int i, Object obj) {
        efo efoVar;
        if (obj == null) {
            efoVar = new efo(2, null);
        } else {
            ?? r2 = this.b;
            if (r2.i(obj)) {
                String d = r2.d(obj);
                efoVar = (d == null || !d.contains("@")) ? new efo(2, null) : new efo(1, d);
            } else {
                efoVar = new efo(3, null);
            }
        }
        efo efoVar2 = (efo) view.getTag(R.id.view_bound_account_tag);
        if (efoVar.equals(efoVar2)) {
            return;
        }
        if (efoVar2 == null) {
            ((ehn) this.d).b(view, i, efoVar);
            view.setTag(R.id.view_bound_account_tag, efoVar);
            return;
        }
        int i2 = yq.a;
        if (view.isAttachedToWindow()) {
            ?? r1 = this.a;
            f(r1, view);
            ehn ehnVar = (ehn) this.d;
            ((efv) ehnVar.a).e(view);
            ehnVar.b(view, i, efoVar);
            d(r1, view);
            view.setTag(R.id.view_bound_account_tag, efoVar);
        }
    }

    public final CharSequence g(Context context) {
        CharSequence charSequence;
        BiometricManager.Strings strings;
        Object obj = this.b;
        if (obj != null) {
            if (Build.VERSION.SDK_INT < 31 || (strings = ((oz) obj).a) == null) {
                pa paVar = ((oz) obj).b;
                if (paVar == null) {
                    Log.e("BiometricManager", "Failure in Strings.getButtonLabel(). No available string provider.");
                } else if (paVar.c.a(255) == 0) {
                    int i = paVar.b & (-2);
                    charSequence = i != 4 ? i != 8 ? paVar.a.getString(R.string.use_biometric_label) : paVar.a.getString(R.string.use_face_label) : paVar.a.getString(R.string.use_fingerprint_label);
                } else if ((paVar.b & 1) != 0) {
                    charSequence = paVar.a.getString(R.string.use_screen_lock_label);
                }
                charSequence = null;
            } else {
                charSequence = oy.b(strings);
            }
            if (charSequence != null) {
                return charSequence;
            }
        }
        String string = context.getString(R.string.aag_privacy_lock_auth_button_label);
        string.getClass();
        return string;
    }

    public final void h() {
        if (((pb) this.c).a(33023) == 0) {
            ((pg) this.d).b((pe) this.a);
        }
    }

    public ekx(ViewGroup viewGroup, ViewGroup viewGroup2, eaq eaqVar, eaq eaqVar2) {
        this.c = viewGroup;
        this.b = viewGroup2;
        this.a = eaqVar;
        this.d = eaqVar2;
    }

    public ekx(dym dymVar, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3) {
        this.a = dymVar;
        this.c = materialButton;
        this.d = materialButton2;
        this.b = materialButton3;
    }

    public ekx(efu efuVar, ehn ehnVar, dov dovVar, dqy dqyVar) {
        this.a = efuVar;
        this.d = ehnVar;
        this.b = dovVar;
        this.c = dqyVar;
    }

    public ekx(fwm fwmVar, cfe cfeVar, dja djaVar, bst bstVar) {
        this.b = fwmVar;
        this.c = cfeVar;
        this.d = djaVar;
        this.a = bstVar;
    }

    public ekx(Object obj, Object obj2, Object obj3, Object obj4) {
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.a = obj4;
    }

    public ekx(Context context, jdd jddVar, efx efxVar, gzp gzpVar) {
        this.b = jddVar;
        this.c = efxVar;
        this.a = gzpVar;
        this.d = context.getPackageName();
    }

    public ekx(View view, ImageView imageView, dze dzeVar, FrameLayout frameLayout) {
        this.a = view;
        this.c = imageView;
        this.d = dzeVar;
        this.b = frameLayout;
    }

    public ekx(ehq ehqVar) {
        this.c = ehqVar;
        ekx ekxVar = new ekx(ehqVar, null);
        this.b = ekxVar;
        this.d = ekxVar.a;
        this.a = ekxVar.d;
    }

    public ekx(gzp gzpVar, gzp gzpVar2, gzp gzpVar3) {
        this.a = new AtomicBoolean(false);
        this.b = gzpVar;
        this.c = gzpVar2;
        this.d = gzpVar3;
    }
}
