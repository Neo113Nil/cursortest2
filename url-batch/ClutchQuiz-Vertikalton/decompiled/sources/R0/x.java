package R0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.clutchquizarena.app.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f753e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f754f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f755g;

    public x(p pVar, int i) {
        super(pVar);
        this.f753e = R.drawable.design_password_eye;
        this.f755g = new ViewOnClickListenerC0025a(2, this);
        if (i != 0) {
            this.f753e = i;
        }
    }

    @Override // R0.q
    public final void b() {
        q();
    }

    @Override // R0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // R0.q
    public final int d() {
        return this.f753e;
    }

    @Override // R0.q
    public final View.OnClickListener f() {
        return this.f755g;
    }

    @Override // R0.q
    public final boolean k() {
        return true;
    }

    @Override // R0.q
    public final boolean l() {
        EditText editText = this.f754f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // R0.q
    public final void m(EditText editText) {
        this.f754f = editText;
        q();
    }

    @Override // R0.q
    public final void r() {
        EditText editText = this.f754f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f754f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // R0.q
    public final void s() {
        EditText editText = this.f754f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
