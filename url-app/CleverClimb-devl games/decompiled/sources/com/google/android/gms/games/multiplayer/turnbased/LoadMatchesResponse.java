package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.zzh;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

/* loaded from: classes.dex */
public final class LoadMatchesResponse {
    private final InvitationBuffer zzpg;
    private final TurnBasedMatchBuffer zzph;
    private final TurnBasedMatchBuffer zzpi;
    private final TurnBasedMatchBuffer zzpj;

    public LoadMatchesResponse(Bundle bundle) {
        DataHolder zza = zza(bundle, 0);
        if (zza != null) {
            this.zzpg = new InvitationBuffer(zza);
        } else {
            this.zzpg = null;
        }
        DataHolder zza2 = zza(bundle, 1);
        if (zza2 != null) {
            this.zzph = new TurnBasedMatchBuffer(zza2);
        } else {
            this.zzph = null;
        }
        DataHolder zza3 = zza(bundle, 2);
        if (zza3 != null) {
            this.zzpi = new TurnBasedMatchBuffer(zza3);
        } else {
            this.zzpi = null;
        }
        DataHolder zza4 = zza(bundle, 3);
        if (zza4 != null) {
            this.zzpj = new TurnBasedMatchBuffer(zza4);
        } else {
            this.zzpj = null;
        }
    }

    private static DataHolder zza(Bundle bundle, int i) {
        String str;
        switch (i) {
            case 0:
                str = "TURN_STATUS_INVITED";
                break;
            case 1:
                str = "TURN_STATUS_MY_TURN";
                break;
            case 2:
                str = "TURN_STATUS_THEIR_TURN";
                break;
            case 3:
                str = "TURN_STATUS_COMPLETE";
                break;
            default:
                StringBuilder sb = new StringBuilder(38);
                sb.append("Unknown match turn status: ");
                sb.append(i);
                zzh.e("MatchTurnStatus", sb.toString());
                str = "TURN_STATUS_UNKNOWN";
                break;
        }
        if (bundle.containsKey(str)) {
            return (DataHolder) bundle.getParcelable(str);
        }
        return null;
    }

    @Deprecated
    public final void close() {
        release();
    }

    public final TurnBasedMatchBuffer getCompletedMatches() {
        return this.zzpj;
    }

    public final InvitationBuffer getInvitations() {
        return this.zzpg;
    }

    public final TurnBasedMatchBuffer getMyTurnMatches() {
        return this.zzph;
    }

    public final TurnBasedMatchBuffer getTheirTurnMatches() {
        return this.zzpi;
    }

    public final boolean hasData() {
        if (this.zzpg != null && this.zzpg.getCount() > 0) {
            return true;
        }
        if (this.zzph != null && this.zzph.getCount() > 0) {
            return true;
        }
        if (this.zzpi == null || this.zzpi.getCount() <= 0) {
            return this.zzpj != null && this.zzpj.getCount() > 0;
        }
        return true;
    }

    public final void release() {
        if (this.zzpg != null) {
            this.zzpg.release();
        }
        if (this.zzph != null) {
            this.zzph.release();
        }
        if (this.zzpi != null) {
            this.zzpi.release();
        }
        if (this.zzpj != null) {
            this.zzpj.release();
        }
    }
}
