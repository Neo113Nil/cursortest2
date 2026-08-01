package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.awerser.monnit.betplay.R;
import java.util.Locale;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class hc0 extends fz {
    public final ct d;

    public hc0(ct ctVar) {
        this.d = ctVar;
    }

    @Override // defpackage.fz
    public final int a() {
        return this.d.h.k;
    }

    @Override // defpackage.fz
    public final void c(c00 c00Var, int i) {
        ct ctVar = this.d;
        int i2 = ctVar.h.f.h + i;
        TextView textView = ((gc0) c00Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(w70.b().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        r6 r6Var = ctVar.k;
        if (w70.b().get(1) == i2) {
            Object obj = r6Var.d;
        } else {
            Object obj2 = r6Var.c;
        }
        throw null;
    }

    @Override // defpackage.fz
    public final c00 d(ViewGroup viewGroup) {
        return new gc0((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
