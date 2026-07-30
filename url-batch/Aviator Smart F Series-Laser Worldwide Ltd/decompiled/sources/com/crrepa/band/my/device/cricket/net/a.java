package com.crrepa.band.my.device.cricket.net;

import com.crrepa.band.my.device.cricket.model.CricketGameEntity;
import com.crrepa.band.my.device.cricket.model.CricketTeamPointsEntity;
import io.reactivex.Observable;
import java.util.List;
import r7.f;

/* loaded from: classes2.dex */
public interface a {
    public static final String BASE_URL = "https://datahub.moyoung.com/";

    @f("cricket/scoreboards")
    Observable<List<CricketTeamPointsEntity>> getCricketRankingList();

    @f("cricket/fixtures")
    Observable<List<CricketGameEntity>> getCricketSchedule();
}
