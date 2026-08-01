package Q0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winpower.neonfit.R;

/* loaded from: classes.dex */
public final class y extends r {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1106f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0030a f1107g;

    public y(q qVar, int i) {
        super(qVar);
        this.e = R.drawable.design_password_eye;
        this.f1107g = new ViewOnClickListenerC0030a(2, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // Q0.r
    public final void b() {
        q();
    }

    @Override // Q0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // Q0.r
    public final int d() {
        return this.e;
    }

    @Override // Q0.r
    public final View.OnClickListener f() {
        return this.f1107g;
    }

    @Override // Q0.r
    public final boolean k() {
        return true;
    }

    @Override // Q0.r
    public final boolean l() {
        EditText editText = this.f1106f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // Q0.r
    public final void m(EditText editText) {
        this.f1106f = editText;
        q();
    }

    @Override // Q0.r
    public final void r() {
        EditText editText = this.f1106f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1106f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // Q0.r
    public final void s() {
        EditText editText = this.f1106f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
