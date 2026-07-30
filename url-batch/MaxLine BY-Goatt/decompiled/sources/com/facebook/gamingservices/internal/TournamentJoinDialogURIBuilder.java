package com.facebook.gamingservices.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentJoinDialogURIBuilder {
    public static final TournamentJoinDialogURIBuilder INSTANCE = new TournamentJoinDialogURIBuilder();

    private TournamentJoinDialogURIBuilder() {
    }

    private final Uri.Builder baseUriBuilder() {
        Uri.Builder appendPath = new Uri.Builder().scheme(TournamentShareDialogURIBuilder.scheme).authority(FacebookSdk.getFacebookGamingDomain()).appendPath("dialog").appendPath("join_tournament");
        appendPath.getClass();
        return appendPath;
    }

    public static /* synthetic */ Bundle bundle$facebook_gamingservices_release$default(TournamentJoinDialogURIBuilder tournamentJoinDialogURIBuilder, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return tournamentJoinDialogURIBuilder.bundle$facebook_gamingservices_release(str, str2, str3);
    }

    public static /* synthetic */ Uri uri$facebook_gamingservices_release$default(TournamentJoinDialogURIBuilder tournamentJoinDialogURIBuilder, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return tournamentJoinDialogURIBuilder.uri$facebook_gamingservices_release(str, str2);
    }

    public final Bundle bundle$facebook_gamingservices_release(String str, String str2, String str3) {
        str.getClass();
        Bundle bundle = new Bundle();
        bundle.putString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, SDKConstants.PARAM_TOURNAMENTS);
        bundle.putString("app_id", str);
        if (str2 != null) {
            bundle.putString(SDKConstants.PARAM_TOURNAMENTS_ID, str2);
        }
        if (str3 != null) {
            bundle.putString("payload", str3);
        }
        return bundle;
    }

    public final Uri uri$facebook_gamingservices_release(String str, String str2) {
        Uri.Builder baseUriBuilder = baseUriBuilder();
        if (str != null) {
            baseUriBuilder.appendQueryParameter(SDKConstants.PARAM_TOURNAMENTS_ID, str);
        }
        if (str2 != null) {
            baseUriBuilder.appendQueryParameter("payload", str2);
        }
        Uri build = baseUriBuilder.build();
        build.getClass();
        return build;
    }
}
