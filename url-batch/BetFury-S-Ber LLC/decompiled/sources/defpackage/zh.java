package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.trembin.nirefon.betfury.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zh extends BaseAdapter {
    public final Calendar f;
    public final int g;
    public final int h;

    public zh() {
        Calendar c = xk0.c(null);
        this.f = c;
        this.g = c.getMaximum(7);
        this.h = c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.g;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.h;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.h;
        int i3 = this.g;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public zh(int i) {
        Calendar c = xk0.c(null);
        this.f = c;
        this.g = c.getMaximum(7);
        this.h = i;
    }
}
