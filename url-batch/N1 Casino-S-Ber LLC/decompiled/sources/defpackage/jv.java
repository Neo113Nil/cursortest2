package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.derinko.gbini.n1casino.R;
import com.google.android.material.card.MaterialCardView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class jv extends py {
    public final t6 d;
    public final lr e;
    public final lr f;

    public jv(lr lrVar, lr lrVar2) {
        dh dhVar = new dh(28);
        mq mqVar = new mq(this);
        k0 k0Var = new k0(3, this);
        synchronized (e70.a) {
            try {
                if (e70.b == null) {
                    e70.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        t6 t6Var = new t6(k0Var, new q4(e70.b, dhVar, 8));
        this.d = t6Var;
        t6Var.d.add(mqVar);
        this.e = lrVar;
        this.f = lrVar2;
    }

    @Override // defpackage.py
    public final int a() {
        return this.d.f.size();
    }

    @Override // defpackage.py
    public final int c(int i) {
        ov ovVar = (ov) this.d.f.get(i);
        if (ovVar instanceof mv) {
            return 0;
        }
        if (ovVar instanceof nv) {
            return 1;
        }
        throw new lk();
    }

    @Override // defpackage.py
    public final void d(nz nzVar, int i) {
        String format;
        ov ovVar = (ov) this.d.f.get(i);
        if (ovVar instanceof mv) {
            ((TextView) ((gv) nzVar).u.h).setText(((mv) ovVar).a);
            return;
        }
        if (!(ovVar instanceof nv)) {
            throw new lk();
        }
        iv ivVar = (iv) nzVar;
        final fv fvVar = ((nv) ovVar).a;
        final jv jvVar = ivVar.v;
        fvVar.getClass();
        String str = fvVar.c;
        String str2 = fvVar.b;
        n1 n1Var = ivVar.u;
        MaterialCardView materialCardView = (MaterialCardView) n1Var.c;
        TextView textView = (TextView) n1Var.d;
        TextView textView2 = (TextView) n1Var.f;
        materialCardView.setCardBackgroundColor(Color.parseColor(fvVar.d));
        ((LinearLayout) n1Var.b).setVisibility(fvVar.e ? 0 : 8);
        if (c40.t0(str2)) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(str2);
        }
        if (c40.t0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        TextView textView3 = (TextView) n1Var.e;
        long j = fvVar.g;
        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        if (zo.b(simpleDateFormat.format(new Date(j)), simpleDateFormat.format(new Date(currentTimeMillis)))) {
            format = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
            format.getClass();
        } else {
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy", Locale.getDefault());
            if (zo.b(simpleDateFormat2.format(new Date(j)), simpleDateFormat2.format(new Date(currentTimeMillis)))) {
                format = new SimpleDateFormat("d MMM", Locale.getDefault()).format(date);
                format.getClass();
            } else {
                format = new SimpleDateFormat("d MMM yyyy", Locale.getDefault()).format(date);
                format.getClass();
            }
        }
        textView3.setText(format);
        materialCardView.setOnClickListener(new nr(jvVar, fvVar, 1));
        materialCardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: hv
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                jv.this.f.a(fvVar);
                return true;
            }
        });
    }

    @Override // defpackage.py
    public final nz e(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_header, viewGroup, false);
            if (inflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) inflate;
            return new gv(new q4(textView, textView, 21));
        }
        View inflate2 = from.inflate(R.layout.item_note, viewGroup, false);
        MaterialCardView materialCardView = (MaterialCardView) inflate2;
        int i2 = R.id.pinRow;
        LinearLayout linearLayout = (LinearLayout) jw.r(inflate2, R.id.pinRow);
        if (linearLayout != null) {
            i2 = R.id.tvContent;
            TextView textView2 = (TextView) jw.r(inflate2, R.id.tvContent);
            if (textView2 != null) {
                i2 = R.id.tvTimestamp;
                TextView textView3 = (TextView) jw.r(inflate2, R.id.tvTimestamp);
                if (textView3 != null) {
                    i2 = R.id.tvTitle;
                    TextView textView4 = (TextView) jw.r(inflate2, R.id.tvTitle);
                    if (textView4 != null) {
                        return new iv(this, new n1(materialCardView, materialCardView, linearLayout, textView2, textView3, textView4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
    }

    @Override // defpackage.py
    public final void f(nz nzVar) {
        if (nzVar instanceof gv) {
            ViewGroup.LayoutParams layoutParams = nzVar.a.getLayoutParams();
            o30 o30Var = layoutParams instanceof o30 ? (o30) layoutParams : null;
            if (o30Var != null) {
                o30Var.f = true;
            }
        }
    }
}
