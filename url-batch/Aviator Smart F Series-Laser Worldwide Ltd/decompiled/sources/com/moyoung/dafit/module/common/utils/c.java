package com.moyoung.dafit.module.common.utils;

import android.content.Context;
import android.transition.Slide;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.moyoung.dafit.module.common.R$integer;

/* loaded from: classes4.dex */
public class c {
    @NonNull
    @RequiresApi(api = 21)
    public static Slide createBottomSlideAnimation(Context context) {
        Slide slide = new Slide();
        slide.setSlideEdge(80);
        slide.setDuration(context.getResources().getInteger(R$integer.anim_duration_medium));
        return slide;
    }

    @NonNull
    @RequiresApi(api = 21)
    public static Slide createTopSlideAnimation(Context context) {
        Slide slide = new Slide();
        slide.setSlideEdge(48);
        slide.setDuration(context.getResources().getInteger(R$integer.anim_duration_medium));
        return slide;
    }
}
