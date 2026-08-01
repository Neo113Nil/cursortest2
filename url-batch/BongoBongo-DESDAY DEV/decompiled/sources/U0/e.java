package U0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.winfour.winrandom.R;
import h.AbstractC0112a;
import h0.AbstractC0114B;
import h0.a0;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/* loaded from: classes.dex */
public final class e extends AbstractC0114B {
    public final ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final DateFormat f878e = DateFormat.getDateTimeInstance(3, 3);

    @Override // h0.AbstractC0114B
    public final int a() {
        return this.d.size();
    }

    @Override // h0.AbstractC0114B
    public final void c(a0 a0Var, int i) {
        R0.a aVar = (R0.a) this.d.get(i);
        DateFormat dateFormat = this.f878e;
        h1.d.d(dateFormat, "dateFormat");
        h1.d.e(aVar, "entry");
        S0.g gVar = ((d) a0Var).f877u;
        Context context = ((LinearLayout) gVar.f822a).getContext();
        ((TextView) gVar.d).setText(aVar.f797e);
        ((TextView) gVar.f824c).setText(context.getString(R.string.history_range, aVar.f795b));
        String string = aVar.d ? context.getString(R.string.history_yes) : context.getString(R.string.history_no);
        h1.d.b(string);
        ((TextView) gVar.f823b).setText(context.getString(R.string.history_meta, Integer.valueOf(aVar.f796c), string) + " В· " + dateFormat.format(new Date(aVar.f794a)));
    }

    @Override // h0.AbstractC0114B
    public final a0 d(ViewGroup viewGroup) {
        h1.d.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_history, viewGroup, false);
        int i = R.id.metaText;
        TextView textView = (TextView) AbstractC0112a.h(inflate, R.id.metaText);
        if (textView != null) {
            i = R.id.rangeText;
            TextView textView2 = (TextView) AbstractC0112a.h(inflate, R.id.rangeText);
            if (textView2 != null) {
                i = R.id.resultText;
                TextView textView3 = (TextView) AbstractC0112a.h(inflate, R.id.resultText);
                if (textView3 != null) {
                    return new d(new S0.g((LinearLayout) inflate, textView, textView2, textView3));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
