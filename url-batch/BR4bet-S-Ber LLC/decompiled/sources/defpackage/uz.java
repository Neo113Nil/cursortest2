package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.moontiko.really.admiralcasino.R;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class uz extends qk {
    public final int e;
    public EditText f;
    public final kb g;

    public uz(pk pkVar, int i) {
        super(pkVar);
        this.e = R.drawable.design_password_eye;
        this.g = new kb(4, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.qk
    public final void b() {
        p();
    }

    @Override // defpackage.qk
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.qk
    public final int d() {
        return this.e;
    }

    @Override // defpackage.qk
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.qk
    public final boolean j() {
        return true;
    }

    @Override // defpackage.qk
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.qk
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.qk
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.qk
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
