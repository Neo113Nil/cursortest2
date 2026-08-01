package P0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.glasspulse.glasspulse.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f691e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f692f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0025a f693g;

    public x(p pVar, int i) {
        super(pVar);
        this.f691e = R.drawable.design_password_eye;
        this.f693g = new ViewOnClickListenerC0025a(2, this);
        if (i != 0) {
            this.f691e = i;
        }
    }

    @Override // P0.q
    public final void b() {
        q();
    }

    @Override // P0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // P0.q
    public final int d() {
        return this.f691e;
    }

    @Override // P0.q
    public final View.OnClickListener f() {
        return this.f693g;
    }

    @Override // P0.q
    public final boolean k() {
        return true;
    }

    @Override // P0.q
    public final boolean l() {
        EditText editText = this.f692f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // P0.q
    public final void m(EditText editText) {
        this.f692f = editText;
        q();
    }

    @Override // P0.q
    public final void r() {
        EditText editText = this.f692f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f692f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // P0.q
    public final void s() {
        EditText editText = this.f692f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
