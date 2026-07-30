package com.crrepa.band.my.device.cricket.notify;

import android.content.Context;
import com.crrepa.band.my.device.cricket.model.provider.CricketSettingProvider;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.proxy.CricketGameProxy;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class d {

    private static class b {
        private static d INSTANCE = new d();

        private b() {
        }
    }

    public static d getInstance() {
        return b.INSTANCE;
    }

    public void setGameReminder(Context context, boolean z7) {
        if (a1.c.hasCalendarPermission(context) && a1.e.isSupportCricket()) {
            List<CricketGame> subscribedGameList = new CricketGameProxy().getSubscribedGameList();
            if (subscribedGameList == null || subscribedGameList.isEmpty()) {
                com.orhanobut.logger.f.d("subscribedGameList is null!");
                a1.d.deleteAllEvent(context);
                return;
            }
            e eVar = new e();
            if (z7 && eVar.equals(subscribedGameList)) {
                com.orhanobut.logger.f.d("subscribedGameList No change！");
                return;
            }
            a1.d.deleteAllEvent(context);
            int startReminderTime = CricketSettingProvider.getStartReminderTime();
            Calendar calendar = Calendar.getInstance();
            c cVar = new c();
            boolean z8 = false;
            for (int i8 = 0; i8 < subscribedGameList.size(); i8++) {
                CricketGame cricketGame = subscribedGameList.get(i8);
                Long startTimestamp = cricketGame.getStartTimestamp();
                com.orhanobut.logger.f.d("subscribedGameList startTime: " + startTimestamp);
                Date date = new Date(startTimestamp.longValue());
                calendar.setTime(date);
                calendar.add(13, -startReminderTime);
                cVar.sendGameStartReminder(context, cricketGame, calendar.getTime().getTime());
                if (CricketSettingProvider.getScoreReminder()) {
                    calendar.setTime(date);
                    calendar.add(11, 8);
                    cVar.sendGameEndReminder(context, cricketGame, calendar.getTime().getTime());
                } else if (!z8) {
                    a1.d.deleteAllCricketEndEvent(context);
                    z8 = true;
                }
            }
            eVar.saveSubscribedCricketGame(subscribedGameList);
        }
    }

    private d() {
    }
}
