package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.trembin.nirefon.betfury.R;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class l50 extends en {
    public final int e;
    public EditText f;
    public final hc g;

    public l50(dn dnVar, int i) {
        super(dnVar);
        this.e = R.drawable.design_password_eye;
        this.g = new hc(4, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.en
    public final void b() {
        p();
    }

    @Override // defpackage.en
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.en
    public final int d() {
        return this.e;
    }

    @Override // defpackage.en
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.en
    public final boolean j() {
        return true;
    }

    @Override // defpackage.en
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.en
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.en
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.en
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
