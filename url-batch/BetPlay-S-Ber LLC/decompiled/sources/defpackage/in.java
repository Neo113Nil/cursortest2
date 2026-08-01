package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.awerser.monnit.betplay.R;
import com.google.android.material.card.MaterialCardView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class in extends fz {
    public final List d;
    public final as e;
    public final as f;

    public in(ArrayList arrayList, as asVar, as asVar2) {
        arrayList.getClass();
        this.d = arrayList;
        this.e = asVar;
        this.f = asVar2;
    }

    @Override // defpackage.fz
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.fz
    public final void c(c00 c00Var, int i) {
        final hn hnVar = (hn) c00Var;
        en enVar = (en) this.d.get(i);
        pp ppVar = hnVar.u;
        TextView textView = (TextView) ppVar.d;
        CheckBox checkBox = (CheckBox) ppVar.c;
        textView.setText(enVar.getCategory().f);
        TextView textView2 = (TextView) ppVar.e;
        textView2.setText(enVar.getName());
        TextView textView3 = (TextView) ppVar.f;
        int streak = enVar.getStreak();
        MaterialCardView materialCardView = (MaterialCardView) ppVar.b;
        textView3.setText(streak > 0 ? materialCardView.getContext().getString(R.string.day_streak, Integer.valueOf(enVar.getStreak())) : materialCardView.getContext().getString(R.string.start_streak));
        checkBox.setOnClickListener(null);
        checkBox.setChecked(enVar.isCompletedToday());
        textView2.setPaintFlags(enVar.isCompletedToday() ? textView2.getPaintFlags() | 16 : textView2.getPaintFlags() & (-17));
        materialCardView.setCardBackgroundColor(materialCardView.getContext().getColor(enVar.isCompletedToday() ? R.color.card_done : R.color.surface));
        checkBox.setOnClickListener(new View.OnClickListener() { // from class: fn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecyclerView recyclerView;
                fz adapter;
                int F;
                hn hnVar2 = hn.this;
                if (hnVar2.s == null || (recyclerView = hnVar2.r) == null || (adapter = recyclerView.getAdapter()) == null || (F = hnVar2.r.F(hnVar2)) == -1 || hnVar2.s != adapter) {
                    F = -1;
                }
                if (F != -1) {
                    this.e.a(Integer.valueOf(F));
                }
            }
        });
        materialCardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: gn
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                RecyclerView recyclerView;
                fz adapter;
                int F;
                hn hnVar2 = hn.this;
                if (hnVar2.s == null || (recyclerView = hnVar2.r) == null || (adapter = recyclerView.getAdapter()) == null || (F = hnVar2.r.F(hnVar2)) == -1 || hnVar2.s != adapter) {
                    F = -1;
                }
                if (F == -1) {
                    return true;
                }
                this.f.a(Integer.valueOf(F));
                return true;
            }
        });
    }

    @Override // defpackage.fz
    public final c00 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_habit, viewGroup, false);
        int i = R.id.cbDone;
        CheckBox checkBox = (CheckBox) j8.m(inflate, R.id.cbDone);
        if (checkBox != null) {
            i = R.id.tvEmoji;
            TextView textView = (TextView) j8.m(inflate, R.id.tvEmoji);
            if (textView != null) {
                i = R.id.tvName;
                TextView textView2 = (TextView) j8.m(inflate, R.id.tvName);
                if (textView2 != null) {
                    i = R.id.tvStreak;
                    TextView textView3 = (TextView) j8.m(inflate, R.id.tvStreak);
                    if (textView3 != null) {
                        return new hn(new pp((MaterialCardView) inflate, checkBox, textView, textView2, textView3));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
