package com.crrepa.band.my.device.cricket.notify;

import com.crrepa.band.my.model.db.CricketGame;

/* loaded from: classes2.dex */
public class CricketGameNotifyInfo {
    private CricketGame cricketGame;
    private NotifyType type;

    public enum NotifyType {
        START_REMINDER,
        END_REMINDER,
        GAME_REMINDER
    }

    public CricketGameNotifyInfo(CricketGame cricketGame, NotifyType notifyType) {
        this.cricketGame = cricketGame;
        this.type = notifyType;
    }

    public CricketGame getCricketGame() {
        return this.cricketGame;
    }

    public NotifyType getType() {
        return this.type;
    }

    public void setCricketGame(CricketGame cricketGame) {
        this.cricketGame = cricketGame;
    }

    public void setType(NotifyType notifyType) {
        this.type = notifyType;
    }
}
