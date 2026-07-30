package com.crrepa.band.my.health.base.editpage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.water.model.WaterIntakeChangeEvent;
import com.crrepa.band.my.health.weight.model.WeightChangeEvent;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.Water;
import com.crrepa.band.my.model.db.Weight;
import com.crrepa.band.my.model.db.proxy.WeightDaoProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.gson.Gson;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class h {
    private static h instance;

    public static h getInstance() {
        if (instance == null) {
            synchronized (h.class) {
                try {
                    if (instance == null) {
                        instance = new h();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public String formatWaterDate(Context context, int i8, Water water) {
        if (i8 == 0) {
            return m.format(water.getDate(), i3.a.getTimeFormat(context));
        }
        if (i8 != 1) {
            return "";
        }
        if (BandUnitSystemProvider.getUnitSystem() == 0) {
            return water.getIntakeMl() + context.getString(R.string.water_ml);
        }
        return water.getIntakeOz() + context.getString(R.string.water_oz);
    }

    public String formatWeightDate(Context context, int i8, Weight weight) {
        if (i8 == 0) {
            return m.format(weight.getDate(), context.getString(R.string.year_month_day_format));
        }
        if (i8 == 1) {
            return m.format(weight.getDate(), i3.a.getTimeFormat(context));
        }
        if (i8 != 2) {
            return "";
        }
        boolean z7 = BandUnitSystemProvider.getUnitSystem() == 0;
        StringBuilder sb = new StringBuilder();
        sb.append(n.formatWeight((z7 ? weight.getWeightKg() : weight.getWeightLb()).floatValue(), 1));
        sb.append(context.getString(z7 ? R.string.weight_kg : R.string.weight_lb));
        return sb.toString();
    }

    public int getDataColor(Context context, int i8) {
        return ContextCompat.getColor(context, i8 == 0 ? R.color.color_weight : i8 == 1 ? R.color.color_water : R.color.black);
    }

    public Drawable getDoneBtnBackground(Context context, int i8) {
        if (i8 == 0) {
            return ContextCompat.getDrawable(context, R.drawable.shape_weight_record_bg);
        }
        if (i8 == 1) {
            return ContextCompat.getDrawable(context, R.drawable.shape_water_record_bg);
        }
        return null;
    }

    public Object getEditObject(int i8) {
        String string = com.moyoung.dafit.module.common.network.provider.g.getInstance().getString(BaseParamNames.EDIT_SELECT_OBJECT, null);
        if (!TextUtils.isEmpty(string)) {
            if (i8 == 0) {
                return new Gson().fromJson(string, Weight.class);
            }
            if (i8 == 1) {
                return new Gson().fromJson(string, Water.class);
            }
        }
        return null;
    }

    public String[] getEditTitleArray(Context context, int i8) {
        if (i8 == 0) {
            return context.getResources().getStringArray(R.array.weight_edit_title_array);
        }
        if (i8 == 1) {
            return context.getResources().getStringArray(R.array.water_edit_title_array);
        }
        return null;
    }

    public int getEditType(int i8, int i9) {
        if (i9 == 0 || i9 == 1) {
            return i8;
        }
        return 0;
    }

    public String getToolBarTitleName(Context context, int i8) {
        return i8 == 0 ? context.getString(R.string.tv_weight_data_detail) : i8 == 1 ? context.getString(R.string.water_data_detail) : "";
    }

    public ArrayList<String> setEditObject(Context context, int i8, Object obj) {
        Water water;
        String bean2Json = s.bean2Json(obj);
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putString(BaseParamNames.EDIT_SELECT_OBJECT, bean2Json);
        ArrayList<String> arrayList = new ArrayList<>();
        if (i8 != 0) {
            if (i8 != 1 || (water = (Water) new Gson().fromJson(bean2Json, Water.class)) == null) {
                return null;
            }
            arrayList.add(formatWaterDate(context, 0, water));
            arrayList.add(formatWaterDate(context, 1, water));
            return arrayList;
        }
        Weight weight = (Weight) new Gson().fromJson(bean2Json, Weight.class);
        if (weight == null) {
            return null;
        }
        arrayList.add(formatWeightDate(context, 0, weight));
        arrayList.add(formatWeightDate(context, 1, weight));
        arrayList.add(formatWeightDate(context, 2, weight));
        return arrayList;
    }

    public void updateWater(Water water, Water water2) {
        com.orhanobut.logger.f.d("water ==> edit-date : " + water2.getDate() + ";  intake(ml/oz) : " + water2.getIntakeMl() + "/" + water2.getIntakeOz());
        com.crrepa.band.my.health.water.util.a.getInstance().updateWaterRecord(water, water2);
        org.greenrobot.eventbus.c.getDefault().post(new WaterIntakeChangeEvent());
    }

    public void updateWeight(Weight weight) {
        com.orhanobut.logger.f.d("weight ==> edit-date : " + weight.getDate() + ";  num(kg/lb) : " + weight.getWeightKg() + "/" + weight.getWeightLb());
        new WeightDaoProxy().update(weight);
        org.greenrobot.eventbus.c.getDefault().post(new WeightChangeEvent());
    }
}
