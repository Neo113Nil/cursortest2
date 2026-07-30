package com.moyoung.classes.meditation.localclass.model;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import com.moyoung.classes.R$mipmap;
import com.moyoung.classes.R$raw;
import com.moyoung.classes.R$string;
import com.moyoung.classes.meditation.localclass.model.LocalClassBean;
import com.moyoung.classes.meditation.model.MeditationTagBean;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class MeditationLocalModel {
    private static LocalClassBean getLocalClassById(Context context, int i8) {
        Resources resources = context.getResources();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i8 == 0) {
            arrayList.add(resources.getString(R$string.stressed_postscript_1));
            arrayList.add(resources.getString(R$string.stressed_postscript_2));
            arrayList2.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.HOLD_ON, 0, R$mipmap.local_class_stressed_posture, resources.getString(R$string.stressed_posture_description)));
            arrayList2.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.INHALE, 4, R$mipmap.local_class_stressed_inhale, resources.getString(R$string.stressed_inhale_description)));
            arrayList2.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.EXHALE, 4, R$mipmap.local_class_stressed_exhale, resources.getString(R$string.stressed_exhale_description)));
            return new LocalClassBean(0, resources.getString(R$string.stressed_title), resources.getString(R$string.stressed_description), R$mipmap.local_class_stressed, R$raw.anim_local_class_stressed, arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(resources.getString(R$string.asleep_postscript_1));
        arrayList3.add(resources.getString(R$string.asleep_postscript_2));
        arrayList3.add(resources.getString(R$string.asleep_postscript_3));
        arrayList3.add(resources.getString(R$string.asleep_postscript_4));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.HOLD_ON, 7, R$mipmap.local_class_asleep_posture, resources.getString(R$string.asleep_posture_description)));
        arrayList4.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.INHALE, 4, R$mipmap.local_class_asleep_inhale, resources.getString(R$string.asleep_inhale_description)));
        arrayList4.add(new LocalClassBean.ActionMsg(LocalClassBean.ActionMsg.ActionType.EXHALE, 8, R$mipmap.local_class_asleep_exhale, resources.getString(R$string.asleep_exhale_description)));
        return new LocalClassBean(1, resources.getString(R$string.asleep_title), resources.getString(R$string.asleep_description), R$mipmap.local_class_asleep, R$raw.anim_local_class_falling_asleep, arrayList3, arrayList4);
    }

    @NonNull
    public static List<Integer> getLocalClassDurationList() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 1; i8 <= 15; i8++) {
            arrayList.add(Integer.valueOf(i8));
        }
        return arrayList;
    }

    public static List<MeditationTagBean> getLocalClassList(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MeditationTagBean(context.getString(R$string.local_class_title), getWhiteNoiseClassList(context), true));
        return arrayList;
    }

    public static WhiteNoiseBean getWhiteNoiseById(Integer num) {
        return num.intValue() == 1 ? new WhiteNoiseBean(1, R$string.white_noise_fire, R$mipmap.local_class_white_noise_thumb_fire, R$mipmap.local_class_white_noise_bg_fire, R$raw.camp_fire) : num.intValue() == 2 ? new WhiteNoiseBean(2, R$string.white_noise_ocean, R$mipmap.local_class_white_noise_thumb_ocean, R$mipmap.local_class_white_noise_bg_ocean, R$raw.ocean) : num.intValue() == 3 ? new WhiteNoiseBean(3, R$string.white_noise_birds, R$mipmap.local_class_white_noise_thumb_birds, R$mipmap.local_class_white_noise_bg_birds, R$raw.birds) : num.intValue() == 4 ? new WhiteNoiseBean(4, R$string.white_noise_rain, R$mipmap.local_class_white_noise_thumb_rain, R$mipmap.local_class_white_noise_bg_rain, R$raw.rain) : new WhiteNoiseBean(0, R$string.white_noise_river, R$mipmap.local_class_white_noise_thumb_river, R$mipmap.local_class_white_noise_bg_river, R$raw.river);
    }

    public static List<LocalClassBean> getWhiteNoiseClassList(Context context) {
        context.getResources();
        ArrayList arrayList = new ArrayList();
        LocalClassBean localClassById = getLocalClassById(context, 0);
        LocalClassBean localClassById2 = getLocalClassById(context, 1);
        arrayList.add(localClassById);
        arrayList.add(localClassById2);
        return arrayList;
    }

    public static List<WhiteNoiseBean> getWhiteNoiseList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getWhiteNoiseById(0));
        arrayList.add(getWhiteNoiseById(1));
        arrayList.add(getWhiteNoiseById(2));
        arrayList.add(getWhiteNoiseById(3));
        arrayList.add(getWhiteNoiseById(4));
        return arrayList;
    }
}
