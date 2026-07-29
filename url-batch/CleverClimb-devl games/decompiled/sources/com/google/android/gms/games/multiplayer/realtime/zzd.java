package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;

/* loaded from: classes.dex */
public final class zzd extends RoomConfig {
    private final String zzgr;
    private final int zzoe;

    @Deprecated
    private final RoomUpdateListener zzor;

    @Deprecated
    private final RoomStatusUpdateListener zzos;

    @Deprecated
    private final RealTimeMessageReceivedListener zzot;
    private final RoomUpdateCallback zzou;
    private final RoomStatusUpdateCallback zzov;
    private final OnRealTimeMessageReceivedListener zzow;
    private final Bundle zzoz;
    private final zzg zzpa;
    private final String[] zzpb;

    zzd(RoomConfig.Builder builder) {
        this.zzor = builder.zzor;
        this.zzos = builder.zzos;
        this.zzot = builder.zzot;
        this.zzou = builder.zzou;
        this.zzov = builder.zzov;
        this.zzow = builder.zzow;
        this.zzpa = this.zzov != null ? new zzg(this.zzou, this.zzov, this.zzow) : null;
        this.zzgr = builder.zzox;
        this.zzoe = builder.zzoe;
        this.zzoz = builder.zzoz;
        this.zzpb = (String[]) builder.zzoy.toArray(new String[builder.zzoy.size()]);
        if (this.zzow == null && this.zzot == null) {
            throw new NullPointerException(String.valueOf("Must specify a message listener"));
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final Bundle getAutoMatchCriteria() {
        return this.zzoz;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final String getInvitationId() {
        return this.zzgr;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final String[] getInvitedPlayerIds() {
        return this.zzpb;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    @Deprecated
    public final RealTimeMessageReceivedListener getMessageReceivedListener() {
        return this.zzot;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final OnRealTimeMessageReceivedListener getOnMessageReceivedListener() {
        return this.zzow;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final RoomStatusUpdateCallback getRoomStatusUpdateCallback() {
        return this.zzov;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    @Deprecated
    public final RoomStatusUpdateListener getRoomStatusUpdateListener() {
        return this.zzos;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final RoomUpdateCallback getRoomUpdateCallback() {
        return this.zzou;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    @Deprecated
    public final RoomUpdateListener getRoomUpdateListener() {
        return this.zzor;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final int getVariant() {
        return this.zzoe;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomConfig
    public final zzh zzch() {
        return this.zzpa;
    }
}
