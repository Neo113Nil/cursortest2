package F3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.icefishing.icefishingliveapp.C5284R;

/* loaded from: classes2.dex */
public final class z extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1134e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1135f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0307a f1136g;

    public z(r rVar, int i) {
        super(rVar);
        this.f1134e = C5284R.drawable.design_password_eye;
        this.f1136g = new ViewOnClickListenerC0307a(2, this);
        if (i != 0) {
            this.f1134e = i;
        }
    }

    @Override // F3.s
    public final void b() {
        q();
    }

    @Override // F3.s
    public final int c() {
        return C5284R.string.password_toggle_content_description;
    }

    @Override // F3.s
    public final int d() {
        return this.f1134e;
    }

    @Override // F3.s
    public final View.OnClickListener f() {
        return this.f1136g;
    }

    @Override // F3.s
    public final boolean k() {
        return true;
    }

    @Override // F3.s
    public final boolean l() {
        EditText editText = this.f1135f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // F3.s
    public final void m(EditText editText) {
        this.f1135f = editText;
        q();
    }

    @Override // F3.s
    public final void r() {
        EditText editText = this.f1135f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1135f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // F3.s
    public final void s() {
        EditText editText = this.f1135f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
