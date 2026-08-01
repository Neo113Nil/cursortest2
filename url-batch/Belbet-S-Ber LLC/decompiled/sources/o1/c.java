package o1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.gdmhkmf.belbet.R;
import com.google.android.material.card.MaterialCardView;
import g1.i0;
import g1.q0;
import g1.q1;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c extends q0 {
    public final g1.e d;

    /* renamed from: e, reason: collision with root package name */
    public final k f2889e;

    /* renamed from: f, reason: collision with root package name */
    public final k f2890f;

    /* renamed from: g, reason: collision with root package name */
    public final DateTimeFormatter f2891g;

    public c(k kVar, k kVar2) {
        i0 i0Var = new i0(this);
        a0.a aVar = new a0.a(11, this);
        synchronized (g1.b.f1612a) {
            try {
                if (g1.b.f1613b == null) {
                    g1.b.f1613b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g1.e eVar = new g1.e(aVar, new a0.a(12, g1.b.f1613b));
        this.d = eVar;
        eVar.d.add(i0Var);
        this.f2889e = kVar;
        this.f2890f = kVar2;
        this.f2891g = DateTimeFormatter.ofPattern("d MMMM", new Locale("ru"));
    }

    @Override // g1.q0
    public final int a() {
        return this.d.f1638f.size();
    }

    @Override // g1.q0
    public final void c(q1 q1Var, int i) {
        long c5;
        b bVar = (b) q1Var;
        Object obj = this.d.f1638f.get(i);
        i3.d.d(obj, "getItem(...)");
        h hVar = (h) obj;
        String str = hVar.d;
        p1.d dVar = bVar.f2887u;
        MaterialCardView materialCardView = dVar.f3073a;
        TextView textView = dVar.h;
        Context context = materialCardView.getContext();
        ZoneId zoneId = d.f2892a;
        LocalDate localDate = hVar.f2900c;
        c5 = d.c(localDate, d.e());
        String string = context.getString(d.h(localDate));
        i3.d.d(string, "getString(...)");
        String i4 = d.i(localDate);
        dVar.f3078g.setText(hVar.f2899b);
        TextView textView2 = dVar.f3077f;
        c cVar = bVar.f2888v;
        textView2.setText(localDate.format(cVar.f2891g));
        dVar.d.setText(d.a(context, localDate));
        dVar.i.setText(context.getString(R.string.zodiac_display, context.getString(R.string.zodiac_label), i4, string));
        TextView textView3 = dVar.f3076e;
        textView3.setText(c5 == 0 ? context.getString(R.string.days_today) : c5 == 1 ? context.getString(R.string.days_tomorrow) : context.getString(R.string.stats_nearest_days, Integer.valueOf((int) c5)));
        textView3.setBackgroundResource(c5 == 0 ? R.drawable.bg_badge_today : c5 <= 7 ? R.drawable.bg_badge_soon : R.drawable.bg_badge_later);
        int i5 = 0;
        if (p3.d.y0(str)) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
        dVar.f3075c.setOnClickListener(new a(cVar, hVar, i5));
        dVar.f3074b.setOnClickListener(new a(cVar, hVar, 1));
    }

    @Override // g1.q0
    public final q1 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_birthday, viewGroup, false);
        int i = R.id.btnDelete;
        ImageButton imageButton = (ImageButton) b4.d.v(inflate, R.id.btnDelete);
        if (imageButton != null) {
            i = R.id.btnEdit;
            ImageButton imageButton2 = (ImageButton) b4.d.v(inflate, R.id.btnEdit);
            if (imageButton2 != null) {
                i = R.id.tvAgeInfo;
                TextView textView = (TextView) b4.d.v(inflate, R.id.tvAgeInfo);
                if (textView != null) {
                    i = R.id.tvBadge;
                    TextView textView2 = (TextView) b4.d.v(inflate, R.id.tvBadge);
                    if (textView2 != null) {
                        i = R.id.tvDate;
                        TextView textView3 = (TextView) b4.d.v(inflate, R.id.tvDate);
                        if (textView3 != null) {
                            i = R.id.tvName;
                            TextView textView4 = (TextView) b4.d.v(inflate, R.id.tvName);
                            if (textView4 != null) {
                                i = R.id.tvNote;
                                TextView textView5 = (TextView) b4.d.v(inflate, R.id.tvNote);
                                if (textView5 != null) {
                                    i = R.id.tvZodiac;
                                    TextView textView6 = (TextView) b4.d.v(inflate, R.id.tvZodiac);
                                    if (textView6 != null) {
                                        return new b(this, new p1.d((MaterialCardView) inflate, imageButton, imageButton2, textView, textView2, textView3, textView4, textView5, textView6));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
