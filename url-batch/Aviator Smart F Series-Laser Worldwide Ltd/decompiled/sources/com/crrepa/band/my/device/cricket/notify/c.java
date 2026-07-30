package com.crrepa.band.my.device.cricket.notify;

import android.annotation.SuppressLint;
import android.content.Context;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.device.cricket.model.CricketTeamEntity;
import com.crrepa.band.my.device.cricket.model.provider.CricketSettingProvider;
import com.crrepa.band.my.device.cricket.notify.CricketGameNotifyInfo;
import com.crrepa.band.my.model.db.CricketGame;
import com.crrepa.band.my.model.db.proxy.CricketGameProxy;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.s;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c {
    private static final long DEFAULT_END_GAME_TIME = 28800000;
    private static final long DEFAULT_GAME_TIME = 21600000;
    private static final String DEFAULT_TITLE = "CWC2023";
    public static final int GAME_END_REMINDER_ID = 512;
    private static final int GAME_NOTIFCATION_INTERVAL = 3;
    public static final int GAME_START_REMINDER_ID = 256;
    private static final String LINE_SEPARATOR = "\n";
    private static final String TITLE_SEPARATOR = ":";

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$device$cricket$notify$CricketGameNotifyInfo$NotifyType;

        static {
            int[] iArr = new int[CricketGameNotifyInfo.NotifyType.values().length];
            $SwitchMap$com$crrepa$band$my$device$cricket$notify$CricketGameNotifyInfo$NotifyType = iArr;
            try {
                iArr[CricketGameNotifyInfo.NotifyType.GAME_REMINDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$cricket$notify$CricketGameNotifyInfo$NotifyType[CricketGameNotifyInfo.NotifyType.END_REMINDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$device$cricket$notify$CricketGameNotifyInfo$NotifyType[CricketGameNotifyInfo.NotifyType.START_REMINDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private String getEndRemindMessage(CricketGame cricketGame) {
        StringBuilder sb = new StringBuilder(DEFAULT_TITLE);
        sb.append(":");
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        if (json2List == null || json2List.size() != 2) {
            return null;
        }
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_game_team, getTeamScore((CricketTeamEntity) json2List.get(0)), getTeamScore((CricketTeamEntity) json2List.get(1))));
        return sb.toString();
    }

    private String getGameRemindMessage(CricketGame cricketGame) {
        StringBuilder sb = new StringBuilder(DEFAULT_TITLE);
        sb.append(":");
        Date date = new Date(cricketGame.getStartTimestamp().longValue());
        sb.append(m.format(date, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_game_time_format)));
        sb.append(LINE_SEPARATOR);
        sb.append(m.format(date, com.moyoung.dafit.module.common.utils.d.get().getString(R.string.hour_minute_24_format)));
        sb.append(LINE_SEPARATOR);
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        if (json2List == null || json2List.size() != 2) {
            return null;
        }
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_game_team, ((CricketTeamEntity) json2List.get(0)).getName(), ((CricketTeamEntity) json2List.get(1)).getName()));
        return sb.toString();
    }

    private String getStartRemindMessage(CricketGame cricketGame) {
        StringBuilder sb = new StringBuilder(DEFAULT_TITLE);
        sb.append(":");
        long longValue = cricketGame.getStartTimestamp().longValue() - System.currentTimeMillis();
        if (longValue < 0) {
            return null;
        }
        long j8 = (longValue / 1000) / 60;
        if (59 <= j8) {
            sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_remind_watch_one_hour));
        } else {
            sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_remind_watch_minutes_format, Long.valueOf(j8)));
        }
        sb.append(LINE_SEPARATOR);
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        if (json2List == null || json2List.size() != 2) {
            return null;
        }
        sb.append(com.moyoung.dafit.module.common.utils.d.get().getString(R.string.cricket_game_team, ((CricketTeamEntity) json2List.get(0)).getName(), ((CricketTeamEntity) json2List.get(1)).getName()));
        return sb.toString();
    }

    private String getTeamScore(CricketTeamEntity cricketTeamEntity) {
        return cricketTeamEntity.getName() + "(" + cricketTeamEntity.getScore() + ")";
    }

    private boolean isAlreadyReminded(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$sendTodayGameReminder$0(List list, CricketGameProxy cricketGameProxy, Long l8) {
        String gameRemindMessage;
        CricketGameNotifyInfo cricketGameNotifyInfo = (CricketGameNotifyInfo) list.get(l8.intValue());
        CricketGame cricketGame = cricketGameNotifyInfo.getCricketGame();
        int i8 = a.$SwitchMap$com$crrepa$band$my$device$cricket$notify$CricketGameNotifyInfo$NotifyType[cricketGameNotifyInfo.getType().ordinal()];
        if (i8 == 1) {
            cricketGame.setTodayReminder(Boolean.TRUE);
            gameRemindMessage = getGameRemindMessage(cricketGame);
        } else if (i8 == 2) {
            cricketGame.setGameEndReminder(Boolean.TRUE);
            gameRemindMessage = getEndRemindMessage(cricketGame);
        } else if (i8 != 3) {
            gameRemindMessage = null;
        } else {
            cricketGame.setGameStartReminder(Boolean.TRUE);
            gameRemindMessage = getStartRemindMessage(cricketGame);
        }
        cricketGameProxy.update(cricketGame);
        return gameRemindMessage == null ? "" : gameRemindMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendGameReminder, reason: merged with bridge method [inline-methods] */
    public void lambda$sendTodayGameReminder$1(String str) {
        com.orhanobut.logger.f.d("sendGameReminder: " + str);
        i4.getInstance().sendMessage(str, 128);
    }

    public void sendGameEndReminder(Context context, CricketGame cricketGame, long j8) {
        if (cricketGame == null) {
            com.orhanobut.logger.f.d("sendGameEndReminder: cricketGame is null!");
            return;
        }
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        com.orhanobut.logger.f.d("CricketTeam: " + json2List);
        if (json2List == null || json2List.size() != 2) {
            return;
        }
        a1.d.addCalendarEvent(context, context.getString(R.string.cricket_game_end_notification_title, context.getString(R.string.app_name)) + System.lineSeparator() + context.getString(R.string.cricket_game_team, getTeamScore((CricketTeamEntity) json2List.get(0)), getTeamScore((CricketTeamEntity) json2List.get(1))), cricketGame.getGameId().intValue() + 512, j8);
    }

    public void sendGameStartReminder(Context context, CricketGame cricketGame, long j8) {
        if (cricketGame == null) {
            com.orhanobut.logger.f.d("sendGameStartReminder: cricketGame is null!");
            return;
        }
        List json2List = s.json2List(cricketGame.getTeams(), CricketTeamEntity[].class);
        com.orhanobut.logger.f.d("CricketTeam: " + json2List);
        if (json2List == null || json2List.size() != 2) {
            return;
        }
        a1.d.addCalendarEvent(context, context.getString(R.string.cricket_game_start_notification_title, context.getString(R.string.app_name)) + System.lineSeparator() + context.getString(R.string.cricket_game_team, ((CricketTeamEntity) json2List.get(0)).getName(), ((CricketTeamEntity) json2List.get(1)).getName()) + System.lineSeparator() + context.getString(R.string.cricket_game_start_notification_content, m.format(new Date(cricketGame.getStartTimestamp().longValue()), context.getString(R.string.cricket_game_start_time_format))), cricketGame.getGameId().intValue() + 256, j8);
    }

    @SuppressLint({"CheckResult"})
    public void sendTodayGameReminder() {
        final CricketGameProxy cricketGameProxy = new CricketGameProxy();
        List<CricketGame> todayGameList = cricketGameProxy.getTodayGameList();
        if (todayGameList == null || todayGameList.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        long startReminderTime = CricketSettingProvider.getStartReminderTime() * 1000;
        for (CricketGame cricketGame : todayGameList) {
            Long startTimestamp = cricketGame.getStartTimestamp();
            long longValue = startTimestamp.longValue() + DEFAULT_GAME_TIME;
            long longValue2 = startTimestamp.longValue() + DEFAULT_END_GAME_TIME;
            if (isAlreadyReminded(cricketGame.getGameEndReminder()) || longValue2 > currentTimeMillis) {
                long longValue3 = currentTimeMillis - startTimestamp.longValue();
                if (!isAlreadyReminded(cricketGame.getGameStartReminder()) && 0 < longValue3 && longValue3 < startReminderTime) {
                    arrayList.add(new CricketGameNotifyInfo(cricketGame, CricketGameNotifyInfo.NotifyType.START_REMINDER));
                } else if (!isAlreadyReminded(cricketGame.getTodayReminder()) && currentTimeMillis < longValue) {
                    arrayList.add(new CricketGameNotifyInfo(cricketGame, CricketGameNotifyInfo.NotifyType.GAME_REMINDER));
                }
            } else {
                arrayList.add(new CricketGameNotifyInfo(cricketGame, CricketGameNotifyInfo.NotifyType.END_REMINDER));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Observable.intervalRange(0L, arrayList.size(), 0L, 3L, TimeUnit.SECONDS).map(new Function() { // from class: com.crrepa.band.my.device.cricket.notify.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String lambda$sendTodayGameReminder$0;
                lambda$sendTodayGameReminder$0 = c.this.lambda$sendTodayGameReminder$0(arrayList, cricketGameProxy, (Long) obj);
                return lambda$sendTodayGameReminder$0;
            }
        }).subscribe(new Consumer() { // from class: com.crrepa.band.my.device.cricket.notify.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                c.this.lambda$sendTodayGameReminder$1((String) obj);
            }
        }, new com.crrepa.band.my.ble.band.config.b());
    }

    public void showGameNotification(Context context, int i8, String str, String str2) {
        com.orhanobut.logger.f.d("showGameNotification title: " + str);
        com.orhanobut.logger.f.d("showGameNotification content: " + str2);
        m1.a.showCricketGameNotification(context, i8, str, str2);
    }
}
