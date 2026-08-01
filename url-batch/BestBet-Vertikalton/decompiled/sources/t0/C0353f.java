package t0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fortunequest.neontrack.R;
import com.google.android.material.button.MaterialButton;
import g0.AbstractC0161z;
import g0.Y;
import u0.C0372k;
import u0.C0373l;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353f extends AbstractC0161z {
    public final C0350c d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4125e = Y0.s.f1516a;

    public C0353f(C0350c c0350c) {
        this.d = c0350c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // g0.AbstractC0161z
    public final int a() {
        return this.f4125e.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // g0.AbstractC0161z
    public final void c(Y y2, int i) {
        final C0373l c0373l = (C0373l) this.f4125e.get(i);
        k1.e.e(c0373l, "item");
        final C0350c c0350c = this.d;
        k1.e.e(c0350c, "onDelete");
        C0372k c0372k = ((C0352e) y2).f4124u;
        ((TextView) c0372k.f4192c).setText(c0373l.f4194b);
        ((MaterialButton) c0372k.f4191b).setOnClickListener(new View.OnClickListener() { // from class: t0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0350c.this.g(Long.valueOf(c0373l.f4193a));
            }
        });
    }

    @Override // g0.AbstractC0161z
    public final Y d(ViewGroup viewGroup) {
        k1.e.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_habit_manage, viewGroup, false);
        int i = R.id.habitItemDelete;
        MaterialButton materialButton = (MaterialButton) b1.g.l(inflate, R.id.habitItemDelete);
        if (materialButton != null) {
            i = R.id.habitItemTitle;
            TextView textView = (TextView) b1.g.l(inflate, R.id.habitItemTitle);
            if (textView != null) {
                C0372k c0372k = new C0372k();
                c0372k.f4190a = (LinearLayout) inflate;
                c0372k.f4191b = materialButton;
                c0372k.f4192c = textView;
                return new C0352e(c0372k);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
