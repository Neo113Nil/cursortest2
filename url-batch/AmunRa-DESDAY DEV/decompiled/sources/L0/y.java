package L0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.visualfortune.eyerest.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f592e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f593f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f594g;

    public y(q qVar, int i) {
        super(qVar);
        this.f592e = R.drawable.design_password_eye;
        this.f594g = new ViewOnClickListenerC0025a(2, this);
        if (i != 0) {
            this.f592e = i;
        }
    }

    @Override // L0.r
    public final void b() {
        q();
    }

    @Override // L0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // L0.r
    public final int d() {
        return this.f592e;
    }

    @Override // L0.r
    public final View.OnClickListener f() {
        return this.f594g;
    }

    @Override // L0.r
    public final boolean k() {
        return true;
    }

    @Override // L0.r
    public final boolean l() {
        EditText editText = this.f593f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // L0.r
    public final void m(EditText editText) {
        this.f593f = editText;
        q();
    }

    @Override // L0.r
    public final void r() {
        EditText editText = this.f593f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f593f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // L0.r
    public final void s() {
        EditText editText = this.f593f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
