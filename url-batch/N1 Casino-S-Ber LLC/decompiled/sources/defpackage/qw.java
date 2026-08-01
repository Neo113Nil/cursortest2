package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.derinko.gbini.n1casino.R;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class qw extends li {
    public final int e;
    public EditText f;
    public final qa g;

    public qw(ki kiVar, int i) {
        super(kiVar);
        this.e = R.drawable.design_password_eye;
        this.g = new qa(4, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.li
    public final void b() {
        p();
    }

    @Override // defpackage.li
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.li
    public final int d() {
        return this.e;
    }

    @Override // defpackage.li
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.li
    public final boolean j() {
        return true;
    }

    @Override // defpackage.li
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.li
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.li
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.li
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
