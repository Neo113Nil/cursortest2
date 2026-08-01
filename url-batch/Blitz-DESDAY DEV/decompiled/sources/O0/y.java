package O0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winfour.neondrop.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f754e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f755f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f756g;

    public y(q qVar, int i) {
        super(qVar);
        this.f754e = R.drawable.design_password_eye;
        this.f756g = new ViewOnClickListenerC0025a(2, this);
        if (i != 0) {
            this.f754e = i;
        }
    }

    @Override // O0.r
    public final void b() {
        q();
    }

    @Override // O0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // O0.r
    public final int d() {
        return this.f754e;
    }

    @Override // O0.r
    public final View.OnClickListener f() {
        return this.f756g;
    }

    @Override // O0.r
    public final boolean k() {
        return true;
    }

    @Override // O0.r
    public final boolean l() {
        EditText editText = this.f755f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // O0.r
    public final void m(EditText editText) {
        this.f755f = editText;
        q();
    }

    @Override // O0.r
    public final void r() {
        EditText editText = this.f755f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f755f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // O0.r
    public final void s() {
        EditText editText = this.f755f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
