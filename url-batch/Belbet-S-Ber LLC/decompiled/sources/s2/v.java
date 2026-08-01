package s2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.gdmhkmf.belbet.R;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class v extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f3334e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3335f;

    /* renamed from: g, reason: collision with root package name */
    public final o1.e f3336g;

    public v(p pVar, int i) {
        super(pVar);
        this.f3334e = R.drawable.design_password_eye;
        this.f3336g = new o1.e(4, this);
        if (i != 0) {
            this.f3334e = i;
        }
    }

    @Override // s2.q
    public final void b() {
        p();
    }

    @Override // s2.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // s2.q
    public final int d() {
        return this.f3334e;
    }

    @Override // s2.q
    public final View.OnClickListener f() {
        return this.f3336g;
    }

    @Override // s2.q
    public final boolean j() {
        return true;
    }

    @Override // s2.q
    public final boolean k() {
        EditText editText = this.f3335f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // s2.q
    public final void l(EditText editText) {
        this.f3335f = editText;
        p();
    }

    @Override // s2.q
    public final void q() {
        EditText editText = this.f3335f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3335f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // s2.q
    public final void r() {
        EditText editText = this.f3335f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
