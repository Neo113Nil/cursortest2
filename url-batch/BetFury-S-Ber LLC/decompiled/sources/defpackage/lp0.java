package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lp0 extends z70 {
    public final s00 d;

    public lp0(s00 s00Var) {
        this.d = s00Var;
    }

    @Override // defpackage.z70
    public final int a() {
        return this.d.a0.k;
    }

    @Override // defpackage.z70
    public final void c(x80 x80Var, int i) {
        s00 s00Var = this.d;
        int i2 = s00Var.a0.f.h + i;
        TextView textView = ((kp0) x80Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(xk0.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        s6 s6Var = s00Var.d0;
        if (xk0.b().get(1) == i2) {
            Object obj = s6Var.d;
        } else {
            Object obj2 = s6Var.c;
        }
        throw null;
    }

    @Override // defpackage.z70
    public final x80 d(ViewGroup viewGroup) {
        return new kp0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
