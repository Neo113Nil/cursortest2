package j2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.gglhk.bofio.fortunetiger.R;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class y extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f2397e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f2398f;
    public final a g;

    public y(r rVar, int i4) {
        super(rVar);
        this.f2397e = R.drawable.design_password_eye;
        this.g = new a(this, 2);
        if (i4 != 0) {
            this.f2397e = i4;
        }
    }

    @Override // j2.s
    public final void b() {
        p();
    }

    @Override // j2.s
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // j2.s
    public final int d() {
        return this.f2397e;
    }

    @Override // j2.s
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // j2.s
    public final boolean j() {
        return true;
    }

    @Override // j2.s
    public final boolean k() {
        EditText editText = this.f2398f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // j2.s
    public final void l(EditText editText) {
        this.f2398f = editText;
        p();
    }

    @Override // j2.s
    public final void q() {
        EditText editText = this.f2398f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f2398f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // j2.s
    public final void r() {
        EditText editText = this.f2398f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
