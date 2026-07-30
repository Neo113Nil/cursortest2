package com.crrepa.band.my.health.steps;

import android.content.Context;
import android.widget.TextView;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Step;
import com.moyoung.dafit.module.common.utils.h;
import com.moyoung.dafit.module.common.utils.n;

/* loaded from: classes2.dex */
public class b {
    private b() {
    }

    public static void bindView(Context context, Step step, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        String format;
        String str;
        String str2;
        if (context == null) {
            return;
        }
        String string = context.getString(R.string.data_blank);
        int unitSystem = BandUnitSystemProvider.getUnitSystem();
        if (step == null) {
            str = string + l.SPACE + context.getString(com.crrepa.band.my.health.base.a.getActionDistanceUnit(0.0f, unitSystem));
            str2 = string;
            format = str2;
        } else {
            String valueOf = String.valueOf(step.getSteps().intValue());
            String convertDistance = b3.a.convertDistance(context, step.getDistance());
            format = n.format(step.getCalory().floatValue());
            String format2 = n.format(h.getActiveTime(r0, step.getTime()));
            str = convertDistance;
            str2 = format2;
            string = valueOf;
        }
        textView.setText(string);
        textView2.setText(str);
        textView3.setText(context.getString(R.string.activity_calorie, format));
        textView4.setText(context.getString(R.string.activity_time, str2));
    }
}
