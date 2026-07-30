package com.crrepa.band.my.device.cricket.notify;

import android.text.TextUtils;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class e {
    private static List<f> formatSubscribedGameList(List<CricketGame> list) {
        ArrayList arrayList = new ArrayList();
        for (CricketGame cricketGame : list) {
            arrayList.add(new f(cricketGame.getStartTimestamp().longValue(), cricketGame.getTeams()));
        }
        return arrayList;
    }

    public boolean equals(List<CricketGame> list) {
        String subscribedCricketGame = getSubscribedCricketGame();
        return (list == null || list.isEmpty()) ? TextUtils.isEmpty(subscribedCricketGame) : TextUtils.equals(s.bean2Json(formatSubscribedGameList(list)), subscribedCricketGame);
    }

    public String getSubscribedCricketGame() {
        return g.getInstance().getString(BaseParamNames.SUBSCRIBED_CRICKET_GAME, "");
    }

    public void saveSubscribedCricketGame(List<CricketGame> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        g.getInstance().putString(BaseParamNames.SUBSCRIBED_CRICKET_GAME, s.bean2Json(formatSubscribedGameList(list)));
    }
}
