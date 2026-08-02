package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ps extends ar {
    final Handler aj = new Handler(Looper.getMainLooper());
    final Runnable ak = new nc(this, 6, null);
    public pq al;
    public int am;
    public int an;
    public ImageView ao;
    TextView ap;

    private final int aF(int i) {
        Context x = x();
        if (x == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        x.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = x.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // defpackage.ar
    public final Dialog a(Bundle bundle) {
        df dfVar = new df(y());
        dfVar.g(this.al.g());
        View inflate = LayoutInflater.from(dfVar.a()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            CharSequence f = this.al.f();
            if (TextUtils.isEmpty(f)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(f);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            CharSequence d = this.al.d();
            if (TextUtils.isEmpty(d)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(d);
            }
        }
        this.ao = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.ap = (TextView) inflate.findViewById(R.id.fingerprint_error);
        pq pqVar = this.al;
        dfVar.e(pj.c(pqVar.n) ? R(R.string.confirm_device_credential_password) : pqVar.e(), new ahu((ar) this, 1));
        dfVar.h(inflate);
        dg b = dfVar.b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }

    @Override // defpackage.bd
    public final void aa() {
        super.aa();
        this.aj.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.bd
    public final void ac() {
        super.ac();
        pq pqVar = this.al;
        pqVar.w = 0;
        pqVar.l(1);
        this.al.k(R(R.string.fingerprint_dialog_touch_sensor));
    }

    @Override // defpackage.ar, defpackage.bd
    public final void f(Bundle bundle) {
        super.f(bundle);
        pq a = pg.a(this, this.n.getBoolean("host_activity", true));
        this.al = a;
        if (a.x == null) {
            a.x = new afc();
        }
        a.x.d(this, new pr(this, 0));
        pq pqVar = this.al;
        if (pqVar.y == null) {
            pqVar.y = new afc();
        }
        pqVar.y.d(this, new pr(this, 2));
        this.am = aF(R.attr.colorError);
        this.an = aF(android.R.attr.textColorSecondary);
    }

    @Override // defpackage.ar, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.al.j(true);
    }
}
