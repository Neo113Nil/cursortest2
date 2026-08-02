package defpackage;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.TextView;
import androidx.preference.DialogPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aid extends ar implements DialogInterface.OnClickListener {
    private DialogPreference aj;
    private CharSequence ak;
    private CharSequence al;
    private CharSequence am;
    public int an;
    private CharSequence ao;
    private int ap;
    private BitmapDrawable aq;

    @Override // defpackage.ar
    public final Dialog a(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        int ime;
        this.an = -2;
        df dfVar = new df(y());
        dfVar.g(this.ak);
        dfVar.c(this.aq);
        dfVar.f(this.al, this);
        dfVar.e(this.am, this);
        y();
        int i = this.ap;
        View view = null;
        if (i != 0) {
            LayoutInflater layoutInflater = this.W;
            if (layoutInflater == null) {
                layoutInflater = H(null);
            }
            view = layoutInflater.inflate(i, (ViewGroup) null);
        }
        if (view != null) {
            aF(view);
            dfVar.h(view);
        } else {
            dfVar.d(this.ao);
        }
        bm(dfVar);
        dg b = dfVar.b();
        if (aJ()) {
            Window window = b.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsController = window.getDecorView().getWindowInsetsController();
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
                return b;
            }
            aH();
        }
        return b;
    }

    protected void aF(View view) {
        int i;
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.ao;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public abstract void aG(boolean z);

    protected boolean aJ() {
        return false;
    }

    public final DialogPreference aK() {
        DialogPreference dialogPreference = this.aj;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        DialogPreference dialogPreference2 = (DialogPreference) ((ahn) super.bt(true)).a(A().getString("key"));
        this.aj = dialogPreference2;
        return dialogPreference2;
    }

    @Override // defpackage.ar, defpackage.bd
    public void f(Bundle bundle) {
        super.f(bundle);
        aeh bt = super.bt(true);
        if (!(bt instanceof ahn)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        ahn ahnVar = (ahn) bt;
        String string = A().getString("key");
        if (bundle != null) {
            this.ak = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.al = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.am = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.ao = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.ap = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.aq = new BitmapDrawable(bs(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) ahnVar.a(string);
        this.aj = dialogPreference;
        this.ak = dialogPreference.a;
        this.al = dialogPreference.d;
        this.am = dialogPreference.e;
        this.ao = dialogPreference.b;
        this.ap = dialogPreference.f;
        Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.aq = (BitmapDrawable) drawable;
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.aq = new BitmapDrawable(bs(), createBitmap);
    }

    @Override // defpackage.ar, defpackage.bd
    public void i(Bundle bundle) {
        super.i(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.ak);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.al);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.am);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.ao);
        bundle.putInt("PreferenceDialogFragment.layout", this.ap);
        BitmapDrawable bitmapDrawable = this.aq;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.an = i;
    }

    @Override // defpackage.ar, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aG(this.an == -1);
    }

    protected void aH() {
    }

    protected void bm(df dfVar) {
    }
}
