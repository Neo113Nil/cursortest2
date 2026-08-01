package K0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.pairspot.fortunetiles.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f584e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f585f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0026a f586g;

    public y(q qVar, int i) {
        super(qVar);
        this.f584e = R.drawable.design_password_eye;
        this.f586g = new ViewOnClickListenerC0026a(2, this);
        if (i != 0) {
            this.f584e = i;
        }
    }

    @Override // K0.r
    public final void b() {
        q();
    }

    @Override // K0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // K0.r
    public final int d() {
        return this.f584e;
    }

    @Override // K0.r
    public final View.OnClickListener f() {
        return this.f586g;
    }

    @Override // K0.r
    public final boolean k() {
        return true;
    }

    @Override // K0.r
    public final boolean l() {
        EditText editText = this.f585f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // K0.r
    public final void m(EditText editText) {
        this.f585f = editText;
        q();
    }

    @Override // K0.r
    public final void r() {
        EditText editText = this.f585f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f585f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // K0.r
    public final void s() {
        EditText editText = this.f585f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
