package com.google.android.gms.games.multiplayer.realtime;

import java.util.List;

/* loaded from: classes.dex */
public final class zzg implements zzh {
    private final RoomUpdateCallback zzou;
    private final RoomStatusUpdateCallback zzov;
    private final OnRealTimeMessageReceivedListener zzpf;

    public zzg(RoomUpdateCallback roomUpdateCallback, RoomStatusUpdateCallback roomStatusUpdateCallback, OnRealTimeMessageReceivedListener onRealTimeMessageReceivedListener) {
        this.zzou = roomUpdateCallback;
        this.zzov = roomStatusUpdateCallback;
        this.zzpf = onRealTimeMessageReceivedListener;
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onConnectedToRoom(Room room) {
        if (this.zzov != null) {
            this.zzov.onConnectedToRoom(room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onDisconnectedFromRoom(Room room) {
        if (this.zzov != null) {
            this.zzov.onDisconnectedFromRoom(room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    public final void onJoinedRoom(int i, Room room) {
        if (this.zzou != null) {
            this.zzou.onJoinedRoom(i, room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    public final void onLeftRoom(int i, String str) {
        if (this.zzou != null) {
            this.zzou.onLeftRoom(i, str);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onP2PConnected(String str) {
        if (this.zzov != null) {
            this.zzov.onP2PConnected(str);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onP2PDisconnected(String str) {
        if (this.zzov != null) {
            this.zzov.onP2PDisconnected(str);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeerDeclined(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeerDeclined(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeerInvitedToRoom(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeerInvitedToRoom(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeerJoined(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeerJoined(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeerLeft(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeerLeft(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeersConnected(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeersConnected(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onPeersDisconnected(Room room, List<String> list) {
        if (this.zzov != null) {
            this.zzov.onPeersDisconnected(room, list);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.OnRealTimeMessageReceivedListener, com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener
    public final void onRealTimeMessageReceived(RealTimeMessage realTimeMessage) {
        if (this.zzpf != null) {
            this.zzpf.onRealTimeMessageReceived(realTimeMessage);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onRoomAutoMatching(Room room) {
        if (this.zzov != null) {
            this.zzov.onRoomAutoMatching(room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    public final void onRoomConnected(int i, Room room) {
        if (this.zzou != null) {
            this.zzou.onRoomConnected(i, room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener
    public final void onRoomConnecting(Room room) {
        if (this.zzov != null) {
            this.zzov.onRoomConnecting(room);
        }
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener
    public final void onRoomCreated(int i, Room room) {
        if (this.zzou != null) {
            this.zzou.onRoomCreated(i, room);
        }
    }
}
