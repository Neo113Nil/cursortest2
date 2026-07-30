package a1;

import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.device.cricket.model.CricketGameEntity;
import com.crrepa.band.my.device.cricket.model.CricketGameModel;
import com.crrepa.band.my.device.cricket.model.CricketTeamEntity;
import com.crrepa.band.my.device.cricket.model.DayCricketGameModel;
import com.crrepa.band.my.model.band.provider.BandTimeSystemProvider;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.proxy.CricketGameProxy;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    public static final String AFGHANISTAN = "afghanistan";
    public static final String AUSTRALIA = "australia";
    public static final String BANGLADESH = "bangladesh";
    public static final String ENGLAND = "england";
    public static final String INDIA = "india";
    public static final String NETHERLANDS = "netherlands";
    public static final String NEW_ZEALAND = "new zealand";
    public static final String PAKISTAN = "pakistan";
    public static final String SOUTH_AFRICA = "south africa";
    public static final String SRI_LANKA = "sri lanka";
    private static final String[] DEFAULT_CRICKET_TEAM_NAME_ARRAY = com.moyoung.dafit.module.common.utils.d.get().getResources().getStringArray(R.array.cricket_team_name);
    private static final String[] DEFAULT_CRICKET_TEAM_COUNTRY_ARRAY = {"AF", "AU", "BD", "GB", u.COUNTRY_IN, "NL", "NZ", "PK", u.COUNTRY_ZA, "LK", u.COUNTRY_CN};

    public static List<DayCricketGameModel> convertGameList(List<CricketGameEntity> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Date date = new Date(list.get(0).getStart_time_timestamp().longValue() * 1000);
        arrayList2.add(date);
        for (int i8 = 0; i8 < list.size(); i8++) {
            Date date2 = new Date(list.get(i8).getStart_time_timestamp().longValue() * 1000);
            if (!m.isSameDay(date, date2)) {
                arrayList2.add(date2);
                date = date2;
            }
        }
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            Date date3 = (Date) arrayList2.get(i9);
            DayCricketGameModel dayCricketGameModel = new DayCricketGameModel();
            dayCricketGameModel.setDateTitle(m.format(date3, "dd MMMM.yyyy,EE"));
            ArrayList arrayList3 = new ArrayList();
            for (CricketGameEntity cricketGameEntity : list) {
                if (m.isSameDay(date3, new Date(cricketGameEntity.getStart_time_timestamp().longValue() * 1000))) {
                    arrayList3.add(getCricketGamesModel(cricketGameEntity.getTeams(), cricketGameEntity));
                }
            }
            dayCricketGameModel.setGames(arrayList3);
            arrayList.add(dayCricketGameModel);
        }
        return arrayList;
    }

    public static List<DayCricketGameModel> convertGameListWithDatabase(List<CricketGame> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Date date = new Date(list.get(0).getStartTimestamp().longValue());
            arrayList2.add(date);
            for (int i8 = 0; i8 < list.size(); i8++) {
                Date date2 = new Date(list.get(i8).getStartTimestamp().longValue());
                if (!m.isSameDay(date, date2)) {
                    arrayList2.add(date2);
                    date = date2;
                }
            }
            String string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_date);
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                Date date3 = (Date) arrayList2.get(i9);
                DayCricketGameModel dayCricketGameModel = new DayCricketGameModel();
                dayCricketGameModel.setDate(date3);
                dayCricketGameModel.setDateTitle(m.format(date3, string));
                ArrayList arrayList3 = new ArrayList();
                for (CricketGame cricketGame : list) {
                    if (m.isSameDay(date3, new Date(cricketGame.getStartTimestamp().longValue()))) {
                        arrayList3.add(getCricketGamesModel(cricketGame));
                    }
                }
                dayCricketGameModel.setGames(arrayList3);
                arrayList.add(dayCricketGameModel);
            }
        }
        return arrayList;
    }

    public static CricketGameModel getCricketGamesModel(CricketGame cricketGame) {
        CricketGameModel cricketGameModel = new CricketGameModel();
        String string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.hour_minute_format_24);
        Date date = new Date(cricketGame.getStartTimestamp().longValue());
        Date date2 = new Date(cricketGame.getEndTimestamp().longValue());
        if (BandTimeSystemProvider.is12HourTime()) {
            string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.hour_minute_format_12);
        }
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        if (json2List != null && json2List.size() > 1) {
            cricketGameModel.setStartTime(m.format(date, string));
            cricketGameModel.setEndTime(date2);
            cricketGameModel.setId(cricketGame.getGameId().intValue());
            cricketGameModel.setTitle(cricketGame.getTitle());
            cricketGameModel.setReserved(cricketGame.getReserved().booleanValue());
            CricketTeamEntity cricketTeamEntity = (CricketTeamEntity) json2List.get(0);
            cricketGameModel.setTeamName1(getTeamName(cricketTeamEntity.getName()));
            if (!TextUtils.isEmpty(cricketTeamEntity.getScore())) {
                cricketGameModel.setScore1(cricketTeamEntity.getScore());
            }
            CricketTeamEntity cricketTeamEntity2 = (CricketTeamEntity) json2List.get(1);
            cricketGameModel.setTeamName2(getTeamName(cricketTeamEntity2.getName()));
            if (!TextUtils.isEmpty(cricketTeamEntity2.getScore())) {
                cricketGameModel.setScore2(cricketTeamEntity2.getScore());
            }
        }
        return cricketGameModel;
    }

    public static int getImageFlag(String str) {
        String lowerCase = str.toLowerCase();
        return AFGHANISTAN.equals(lowerCase) ? R$drawable.ic_flag_afghanistan : AUSTRALIA.equals(lowerCase) ? R$drawable.ic_flag_australia : BANGLADESH.equals(lowerCase) ? R$drawable.ic_flag_bangladesh : ENGLAND.equals(lowerCase) ? R$drawable.ic_flag_england : INDIA.equals(lowerCase) ? R$drawable.ic_flag_india : NETHERLANDS.equals(lowerCase) ? R$drawable.ic_flag_netherlands : NEW_ZEALAND.equals(lowerCase) ? R$drawable.ic_flag_new_zealand : PAKISTAN.equals(lowerCase) ? R$drawable.ic_flag_pakistan : SOUTH_AFRICA.equals(lowerCase) ? R$drawable.ic_flag_south_africa : SRI_LANKA.equals(lowerCase) ? R$drawable.ic_flag_sri_lanka : R$drawable.ic_flag_noflag;
    }

    private static String getLastLocationCountryCode() {
        return g.getInstance().getString(BaseParamNames.LAST_LOCATION_COUNTRY_CODE, "");
    }

    public static String getTeamName(String str) {
        return !Arrays.asList(DEFAULT_CRICKET_TEAM_NAME_ARRAY).contains(str) ? com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_tbd) : str;
    }

    public static boolean isSupportCricket() {
        String country = com.moyoung.dafit.module.common.utils.d.get().getResources().getConfiguration().locale.getCountry();
        com.orhanobut.logger.f.d("localeCountry: " + country);
        String lastLocationCountryCode = getLastLocationCountryCode();
        com.orhanobut.logger.f.d("lastLocationCountryCode: " + lastLocationCountryCode);
        for (String str : DEFAULT_CRICKET_TEAM_COUNTRY_ARRAY) {
            if (TextUtils.equals(str, country) || TextUtils.equals(str, lastLocationCountryCode)) {
                return true;
            }
        }
        return false;
    }

    public static void saveCricketGame(List<CricketGameEntity> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CricketGameProxy cricketGameProxy = new CricketGameProxy();
        for (CricketGameEntity cricketGameEntity : list) {
            CricketGame cricketGame = cricketGameProxy.get(cricketGameEntity.getId().intValue());
            if (cricketGame == null) {
                cricketGame = new CricketGame();
                cricketGame.setReserved(Boolean.FALSE);
            }
            cricketGame.setStartTimestamp(Long.valueOf(cricketGameEntity.getStart_time_timestamp().longValue() * 1000));
            cricketGame.setEndTimestamp(Long.valueOf(cricketGameEntity.getEnd_time_timestamp().longValue() * 1000));
            cricketGame.setTitle(cricketGameEntity.getTitle());
            cricketGame.setGameId(cricketGameEntity.getId());
            cricketGame.setTeams(s.bean2Json(cricketGameEntity.getTeams()));
            cricketGameProxy.save(cricketGame);
        }
    }

    public static void saveLastLocationCountryCode(String str) {
        g.getInstance().putString(BaseParamNames.LAST_LOCATION_COUNTRY_CODE, str);
    }

    public static void updateTeamSubscription(String str, Boolean bool) {
        CricketGameProxy cricketGameProxy = new CricketGameProxy();
        List<CricketGame> all = cricketGameProxy.getAll();
        if (all == null || all.size() <= 0) {
            return;
        }
        for (CricketGame cricketGame : all) {
            List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
            if (json2List != null && json2List.size() > 1) {
                Iterator it = json2List.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (str.equals(((CricketTeamEntity) it.next()).getName())) {
                        cricketGame.setReserved(bool);
                        cricketGameProxy.update(cricketGame);
                        break;
                    }
                }
            }
        }
    }

    public static CricketGameModel getCricketGamesModel(List<CricketTeamEntity> list, CricketGameEntity cricketGameEntity) {
        CricketGameModel cricketGameModel = new CricketGameModel();
        String string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.hour_minute_format_24);
        Date date = new Date(cricketGameEntity.getStart_time_timestamp().longValue() * 1000);
        Date date2 = new Date(cricketGameEntity.getEnd_time_timestamp().longValue() * 1000);
        if (BandTimeSystemProvider.is12HourTime()) {
            string = com.moyoung.dafit.module.common.utils.d.get().getString(R.string.hour_minute_format_12);
        }
        if (list.size() > 1) {
            cricketGameModel.setStartTime(m.format(date, string));
            cricketGameModel.setEndTime(date2);
            cricketGameModel.setId(cricketGameEntity.getId().intValue());
            cricketGameModel.setTitle(cricketGameEntity.getTitle());
            CricketTeamEntity cricketTeamEntity = list.get(0);
            cricketGameModel.setTeamName1(getTeamName(cricketTeamEntity.getName()));
            if (!TextUtils.isEmpty(cricketTeamEntity.getScore())) {
                cricketGameModel.setScore1(cricketTeamEntity.getScore());
            }
            CricketTeamEntity cricketTeamEntity2 = list.get(1);
            cricketGameModel.setTeamName2(getTeamName(cricketTeamEntity2.getName()));
            if (!TextUtils.isEmpty(cricketTeamEntity2.getScore())) {
                cricketGameModel.setScore1(cricketTeamEntity2.getScore());
            }
        }
        return cricketGameModel;
    }
}
