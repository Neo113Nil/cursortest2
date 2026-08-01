package M0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.playbag.tripgear.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f667e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f668f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0028a f669g;

    public y(q qVar, int i) {
        super(qVar);
        this.f667e = R.drawable.design_password_eye;
        this.f669g = new ViewOnClickListenerC0028a(2, this);
        if (i != 0) {
            this.f667e = i;
        }
    }

    @Override // M0.r
    public final void b() {
        q();
    }

    @Override // M0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // M0.r
    public final int d() {
        return this.f667e;
    }

    @Override // M0.r
    public final View.OnClickListener f() {
        return this.f669g;
    }

    @Override // M0.r
    public final boolean k() {
        return true;
    }

    @Override // M0.r
    public final boolean l() {
        EditText editText = this.f668f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // M0.r
    public final void m(EditText editText) {
        this.f668f = editText;
        q();
    }

    @Override // M0.r
    public final void r() {
        EditText editText = this.f668f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f668f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // M0.r
    public final void s() {
        EditText editText = this.f668f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
