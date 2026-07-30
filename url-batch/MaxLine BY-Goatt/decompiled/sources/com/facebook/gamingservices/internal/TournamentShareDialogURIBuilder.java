package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.gamingservices.TournamentConfig;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import j$.time.Instant;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentShareDialogURIBuilder {
    public static final TournamentShareDialogURIBuilder INSTANCE = new TournamentShareDialogURIBuilder();
    public static final String authority = "fb.gg";
    public static final String me = "me";
    public static final String scheme = "https";
    public static final String tournament = "instant_tournament";

    private TournamentShareDialogURIBuilder() {
    }

    public final Bundle bundleForCreating$facebook_gamingservices_release(TournamentConfig tournamentConfig, Number number, String str) {
        Instant endTime;
        tournamentConfig.getClass();
        number.getClass();
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", str);
        bundle.putString("score", number.toString());
        TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
        if (sortOrder != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = tournamentConfig.getScoreType();
        if (scoreType != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = tournamentConfig.getTitle();
        if (title != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_TITLE, title.toString());
        }
        String payload = tournamentConfig.getPayload();
        if (payload != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload.toString());
        }
        if (Build.VERSION.SDK_INT >= 26 && (endTime = tournamentConfig.getEndTime()) != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_END_TIME, String.valueOf((int) endTime.getEpochSecond()));
        }
        return bundle;
    }

    public final Bundle bundleForUpdating$facebook_gamingservices_release(String str, Number number, String str2) {
        str.getClass();
        number.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", str2);
        bundle.putString("score", number.toString());
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, str);
        return bundle;
    }

    public final Uri uriForCreating$facebook_gamingservices_release(TournamentConfig tournamentConfig, Number number, String str) {
        tournamentConfig.getClass();
        number.getClass();
        str.getClass();
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(scheme).authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(str).appendQueryParameter("score", number.toString());
        Instant endTime = tournamentConfig.getEndTime();
        if (endTime != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_END_TIME, endTime.toString());
        }
        TournamentSortOrder sortOrder = tournamentConfig.getSortOrder();
        if (sortOrder != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SORT_ORDER, sortOrder.toString());
        }
        TournamentScoreType scoreType = tournamentConfig.getScoreType();
        if (scoreType != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_SCORE_FORMAT, scoreType.toString());
        }
        String title = tournamentConfig.getTitle();
        if (title != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_TITLE, title);
        }
        String payload = tournamentConfig.getPayload();
        if (payload != null) {
            appendQueryParameter.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_PAYLOAD, payload);
        }
        Uri build = appendQueryParameter.build();
        build.getClass();
        return build;
    }

    public final Uri uriForUpdating$facebook_gamingservices_release(String str, Number number, String str2) {
        str.getClass();
        number.getClass();
        str2.getClass();
        Uri build = new Uri.Builder().scheme(scheme).authority("fb.gg").appendPath(me).appendPath(tournament).appendPath(str2).appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, str).appendQueryParameter("score", number.toString()).build();
        build.getClass();
        return build;
    }
}
