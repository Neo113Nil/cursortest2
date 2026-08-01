package defpackage;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.moontiko.really.admiralcasino.R;
import com.moontiko.really.admiralcasino.data.Note;
import java.util.Date;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ny extends t10 {
    public final d7 d;
    public final iu e;
    public final iu f;

    public ny(iu iuVar, iu iuVar2) {
        at atVar = new at(this);
        rc0 rc0Var = new rc0(4, this);
        synchronized (mz.a) {
            try {
                if (mz.b == null) {
                    mz.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d7 d7Var = new d7(rc0Var, new rc0(9, mz.b));
        this.d = d7Var;
        d7Var.d.add(atVar);
        this.e = iuVar;
        this.f = iuVar2;
    }

    @Override // defpackage.t10
    public final int a() {
        return this.d.f.size();
    }

    @Override // defpackage.t10
    public final void c(q20 q20Var, int i) {
        my myVar = (my) q20Var;
        Object obj = this.d.f.get(i);
        obj.getClass();
        final Note note = (Note) obj;
        o1 o1Var = myVar.u;
        final ny nyVar = myVar.w;
        TextView textView = (TextView) o1Var.f;
        TextView textView2 = (TextView) o1Var.d;
        MaterialCardView materialCardView = (MaterialCardView) o1Var.a;
        String title = note.getTitle();
        if (f70.b0(title)) {
            title = materialCardView.getContext().getString(R.string.untitled);
            title.getClass();
        }
        textView.setText(title);
        if (f70.b0(note.getContent())) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(note.getContent());
        }
        ((TextView) o1Var.c).setText(note.getCategory());
        ((TextView) o1Var.e).setText(myVar.v.format(new Date(note.getUpdatedAt())));
        ((ImageView) o1Var.b).setVisibility(note.isPinned() ? 0 : 8);
        try {
            materialCardView.setCardBackgroundColor(Color.parseColor(note.getColorHex()));
        } catch (IllegalArgumentException unused) {
            materialCardView.setCardBackgroundColor(Color.parseColor("#FAFAFA"));
        }
        materialCardView.setOnClickListener(new lu(nyVar, note, 1));
        materialCardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: ly
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                ny.this.f.g(note);
                return true;
            }
        });
    }

    @Override // defpackage.t10
    public final q20 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_note, viewGroup, false);
        int i = R.id.ivPin;
        ImageView imageView = (ImageView) la0.t(inflate, R.id.ivPin);
        if (imageView != null) {
            i = R.id.tvCategory;
            TextView textView = (TextView) la0.t(inflate, R.id.tvCategory);
            if (textView != null) {
                i = R.id.tvContent;
                TextView textView2 = (TextView) la0.t(inflate, R.id.tvContent);
                if (textView2 != null) {
                    i = R.id.tvDate;
                    TextView textView3 = (TextView) la0.t(inflate, R.id.tvDate);
                    if (textView3 != null) {
                        i = R.id.tvTitle;
                        TextView textView4 = (TextView) la0.t(inflate, R.id.tvTitle);
                        if (textView4 != null) {
                            return new my(this, new o1((MaterialCardView) inflate, imageView, textView, textView2, textView3, textView4));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
