package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import com.trembin.nirefon.betfury.data.Note;
import com.trembin.nirefon.betfury.databinding.ItemNoteBinding;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class c40 extends z70 {
    public final m7 d;
    public final jz e;
    public final jz f;
    public final SimpleDateFormat g;

    public c40(jz jzVar, jz jzVar2) {
        zx zxVar = new zx(this);
        o0 o0Var = new o0(4, this);
        synchronized (gk0.a) {
            try {
                if (gk0.b == null) {
                    gk0.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m7 m7Var = new m7(o0Var, new o0(8, gk0.b));
        this.d = m7Var;
        m7Var.d.add(zxVar);
        this.e = jzVar;
        this.f = jzVar2;
        this.g = new SimpleDateFormat("MMM d, HH:mm", Locale.getDefault());
    }

    @Override // defpackage.z70
    public final int a() {
        return this.d.f.size();
    }

    @Override // defpackage.z70
    public final void c(x80 x80Var, int i) {
        ck0 ck0Var;
        b40 b40Var = (b40) x80Var;
        Object obj = this.d.f.get(i);
        obj.getClass();
        final Note note = (Note) obj;
        final c40 c40Var = b40Var.v;
        ItemNoteBinding itemNoteBinding = b40Var.u;
        Context context = itemNoteBinding.getRoot().getContext();
        itemNoteBinding.tvTitle.setText(note.getTitle());
        TextView textView = itemNoteBinding.tvContent;
        String content = note.getContent();
        if (mf0.y(content)) {
            content = "—";
        }
        textView.setText(content);
        itemNoteBinding.tvDate.setText(c40Var.g.format(new Date(note.getUpdatedAt())));
        itemNoteBinding.ivPin.setVisibility(note.isPinned() ? 0 : 8);
        itemNoteBinding.ivReminder.setVisibility(note.getReminderTime() != null ? 0 : 8);
        int i2 = a40.a[note.getPriority().ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            ck0Var = new ck0(Integer.valueOf(context.getColor(R.color.priorityLow)), Integer.valueOf(context.getColor(R.color.priorityLowAlpha)), Integer.valueOf(R.string.priority_low));
        } else if (i2 == 2) {
            ck0Var = new ck0(Integer.valueOf(context.getColor(R.color.priorityMedium)), Integer.valueOf(context.getColor(R.color.priorityMediumAlpha)), Integer.valueOf(R.string.priority_medium));
        } else if (i2 == 3) {
            ck0Var = new ck0(Integer.valueOf(context.getColor(R.color.priorityHigh)), Integer.valueOf(context.getColor(R.color.priorityHighAlpha)), Integer.valueOf(R.string.priority_high));
        } else {
            if (i2 != 4) {
                throw new md();
            }
            ck0Var = new ck0(Integer.valueOf(context.getColor(R.color.priorityUrgent)), Integer.valueOf(context.getColor(R.color.priorityUrgentAlpha)), Integer.valueOf(R.string.priority_urgent));
        }
        int intValue = ck0Var.f.intValue();
        int intValue2 = ck0Var.g.intValue();
        int intValue3 = ck0Var.h.intValue();
        itemNoteBinding.priorityStrip.setBackgroundColor(intValue);
        itemNoteBinding.tvPriorityLabel.setTextColor(intValue);
        itemNoteBinding.tvPriorityLabel.setText(context.getString(intValue3));
        itemNoteBinding.getRoot().setCardBackgroundColor(intValue2);
        itemNoteBinding.getRoot().setOnClickListener(new mz(c40Var, note, i3));
        itemNoteBinding.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: z30
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                c40.this.f.h(note);
                return true;
            }
        });
    }

    @Override // defpackage.z70
    public final x80 d(ViewGroup viewGroup) {
        ItemNoteBinding inflate = ItemNoteBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        inflate.getClass();
        return new b40(this, inflate);
    }
}
