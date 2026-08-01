package o2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.oriondriftchasers.arordrft.R;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class v extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2974e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f2975f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f2976g;

    public v(o oVar, int i) {
        super(oVar);
        this.f2974e = R.drawable.design_password_eye;
        this.f2976g = new com.google.android.material.datepicker.n(3, this);
        if (i != 0) {
            this.f2974e = i;
        }
    }

    @Override // o2.p
    public final void b() {
        p();
    }

    @Override // o2.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // o2.p
    public final int d() {
        return this.f2974e;
    }

    @Override // o2.p
    public final View.OnClickListener f() {
        return this.f2976g;
    }

    @Override // o2.p
    public final boolean j() {
        return true;
    }

    @Override // o2.p
    public final boolean k() {
        EditText editText = this.f2975f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // o2.p
    public final void l(EditText editText) {
        this.f2975f = editText;
        p();
    }

    @Override // o2.p
    public final void q() {
        EditText editText = this.f2975f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2975f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // o2.p
    public final void r() {
        EditText editText = this.f2975f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
