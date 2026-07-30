package com.crrepa.band.my.device.cricket.presenter;

import com.crrepa.band.my.model.db.proxy.CricketTeamDaoProxy;

/* loaded from: classes2.dex */
public class d {
    private b1.b view;

    public void getAllTeam() {
        this.view.renderTeams(new CricketTeamDaoProxy().getAll());
    }

    public void setView(b1.b bVar) {
        this.view = bVar;
    }
}
