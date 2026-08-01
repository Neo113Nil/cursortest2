package U0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.fortunequest.neontrack.R;

/* loaded from: classes.dex */
public final class x extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f1233e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1234f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0031a f1235g;

    public x(p pVar, int i) {
        super(pVar);
        this.f1233e = R.drawable.design_password_eye;
        this.f1235g = new ViewOnClickListenerC0031a(2, this);
        if (i != 0) {
            this.f1233e = i;
        }
    }

    @Override // U0.q
    public final void b() {
        q();
    }

    @Override // U0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // U0.q
    public final int d() {
        return this.f1233e;
    }

    @Override // U0.q
    public final View.OnClickListener f() {
        return this.f1235g;
    }

    @Override // U0.q
    public final boolean k() {
        return true;
    }

    @Override // U0.q
    public final boolean l() {
        EditText editText = this.f1234f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // U0.q
    public final void m(EditText editText) {
        this.f1234f = editText;
        q();
    }

    @Override // U0.q
    public final void r() {
        EditText editText = this.f1234f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1234f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // U0.q
    public final void s() {
        EditText editText = this.f1234f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
