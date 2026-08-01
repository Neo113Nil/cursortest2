package N0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.winfour.winrandom.R;

/* loaded from: classes.dex */
public final class y extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f744e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f745f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0028a f746g;

    public y(q qVar, int i) {
        super(qVar);
        this.f744e = R.drawable.design_password_eye;
        this.f746g = new ViewOnClickListenerC0028a(2, this);
        if (i != 0) {
            this.f744e = i;
        }
    }

    @Override // N0.r
    public final void b() {
        q();
    }

    @Override // N0.r
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // N0.r
    public final int d() {
        return this.f744e;
    }

    @Override // N0.r
    public final View.OnClickListener f() {
        return this.f746g;
    }

    @Override // N0.r
    public final boolean k() {
        return true;
    }

    @Override // N0.r
    public final boolean l() {
        EditText editText = this.f745f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // N0.r
    public final void m(EditText editText) {
        this.f745f = editText;
        q();
    }

    @Override // N0.r
    public final void r() {
        EditText editText = this.f745f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f745f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // N0.r
    public final void s() {
        EditText editText = this.f745f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
