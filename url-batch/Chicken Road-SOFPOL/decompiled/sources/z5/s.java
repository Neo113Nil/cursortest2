package z5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.snovikpovik.vuevnxsj.R;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f9268e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f9269f;

    /* renamed from: g, reason: collision with root package name */
    public final a f9270g;

    public s(o oVar, int i) {
        super(oVar);
        this.f9268e = R.drawable.design_password_eye;
        this.f9270g = new a(this, 2);
        if (i != 0) {
            this.f9268e = i;
        }
    }

    @Override // z5.p
    public final void b() {
        p();
    }

    @Override // z5.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // z5.p
    public final int d() {
        return this.f9268e;
    }

    @Override // z5.p
    public final View.OnClickListener f() {
        return this.f9270g;
    }

    @Override // z5.p
    public final boolean j() {
        return true;
    }

    @Override // z5.p
    public final boolean k() {
        EditText editText = this.f9269f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // z5.p
    public final void l(EditText editText) {
        this.f9269f = editText;
        p();
    }

    @Override // z5.p
    public final void q() {
        EditText editText = this.f9269f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f9269f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // z5.p
    public final void r() {
        EditText editText = this.f9269f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
