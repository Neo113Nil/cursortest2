package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.awerser.monnit.betplay.R;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class dx extends di {
    public final int e;
    public EditText f;
    public final m2 g;

    public dx(ci ciVar, int i) {
        super(ciVar);
        this.e = R.drawable.design_password_eye;
        this.g = new m2(5, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.di
    public final void b() {
        p();
    }

    @Override // defpackage.di
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.di
    public final int d() {
        return this.e;
    }

    @Override // defpackage.di
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.di
    public final boolean j() {
        return true;
    }

    @Override // defpackage.di
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.di
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.di
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.di
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
