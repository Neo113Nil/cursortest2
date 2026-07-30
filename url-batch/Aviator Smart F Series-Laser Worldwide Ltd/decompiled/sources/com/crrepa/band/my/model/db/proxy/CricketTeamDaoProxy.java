package com.crrepa.band.my.model.db.proxy;

import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.greendao.utils.c;
import com.crrepa.band.my.model.db.CricketTeamModel;
import com.crrepa.band.my.model.db.greendao.CricketTeamModelDao;
import com.moyoung.dafit.module.common.utils.d;
import com.orhanobut.logger.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class CricketTeamDaoProxy {
    private static final Integer[] DEFAULT_TEAM_ICON_ID_ARRAY = {Integer.valueOf(R$drawable.ic_flag_afghanistan), Integer.valueOf(R$drawable.ic_flag_australia), Integer.valueOf(R$drawable.ic_flag_bangladesh), Integer.valueOf(R$drawable.ic_flag_england), Integer.valueOf(R$drawable.ic_flag_india), Integer.valueOf(R$drawable.ic_flag_netherlands), Integer.valueOf(R$drawable.ic_flag_new_zealand), Integer.valueOf(R$drawable.ic_flag_pakistan), Integer.valueOf(R$drawable.ic_flag_south_africa), Integer.valueOf(R$drawable.ic_flag_sri_lanka)};
    private static final String[] DEFAULT_TEAM_NAME_ARRAY = d.get().getResources().getStringArray(R.array.cricket_team_name);
    private CricketTeamModelDao dao = c.getInstance().getDaoSession().getCricketTeamModelDao();

    @DrawableRes
    public static int getTeamIcon(String str) {
        int i8 = 0;
        while (true) {
            String[] strArr = DEFAULT_TEAM_NAME_ARRAY;
            if (i8 >= strArr.length) {
                i8 = -1;
                break;
            }
            if (TextUtils.equals(str, strArr[i8])) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            return R$drawable.ic_flag_unkonw;
        }
        Integer[] numArr = DEFAULT_TEAM_ICON_ID_ARRAY;
        return numArr.length <= i8 ? R$drawable.ic_flag_unkonw : numArr[i8].intValue();
    }

    public List<CricketTeamModel> getAll() {
        List list = this.dao.queryBuilder().orderAsc(CricketTeamModelDao.Properties.Id).build().list();
        if (list != null && !list.isEmpty()) {
            return list;
        }
        List<CricketTeamModel> defaultTeamList = getDefaultTeamList();
        this.dao.insertInTx(defaultTeamList);
        return defaultTeamList;
    }

    public List<CricketTeamModel> getDefaultTeamList() {
        if (DEFAULT_TEAM_ICON_ID_ARRAY.length != DEFAULT_TEAM_NAME_ARRAY.length) {
            f.d("The default team name and number of icons are inconsistent!");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            Integer[] numArr = DEFAULT_TEAM_ICON_ID_ARRAY;
            if (i8 >= numArr.length) {
                return arrayList;
            }
            arrayList.add(new CricketTeamModel(Long.valueOf(i8), numArr[i8], DEFAULT_TEAM_NAME_ARRAY[i8], Boolean.FALSE));
            i8++;
        }
    }

    public void update(CricketTeamModel cricketTeamModel) {
        this.dao.update(cricketTeamModel);
    }
}
