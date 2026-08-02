package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fqz extends fqt {
    public EditText a;
    private int b;
    private final View.OnClickListener c;

    public fqz(fqs fqsVar, int i) {
        super(fqsVar);
        this.b = R.drawable.design_password_eye;
        this.c = new cx(this, 16, null);
        if (i != 0) {
            this.b = i;
        }
    }

    @Override // defpackage.fqt
    public final int a() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.fqt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.fqt
    public final View.OnClickListener c() {
        return this.c;
    }

    @Override // defpackage.fqt
    public final void g(EditText editText) {
        this.a = editText;
        x();
    }

    @Override // defpackage.fqt
    public final void i() {
        EditText editText = this.a;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.a.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.fqt
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // defpackage.fqt
    public final boolean s() {
        return true;
    }

    @Override // defpackage.fqt
    public final boolean t() {
        return !k();
    }

    @Override // defpackage.fqt
    public final void y() {
        x();
    }
}
