package com.facebook.gamingservices;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.gamingservices.TournamentShareDialog;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.gamingservices.internal.TournamentShareDialogURIBuilder;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;
import defpackage.ey;
import defpackage.fr0;
import defpackage.w20;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class TournamentShareDialog extends FacebookDialogBase<TournamentConfig, Result> {
    public static final Companion Companion = new Companion(null);
    private static final int defaultRequestCode = CallbackManagerImpl.RequestCodeOffset.TournamentShareDialog.toRequestCode();
    private Number score;
    private Tournament tournament;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class FacebookAppHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public FacebookAppHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(TournamentConfig tournamentConfig, boolean z) {
            PackageManager packageManager = FacebookSdk.getApplicationContext().getPackageManager();
            packageManager.getClass();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            return intent.resolveActivity(packageManager) != null;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(TournamentConfig tournamentConfig) {
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            AppCall createBaseAppCall = TournamentShareDialog.this.createBaseAppCall();
            Intent intent = new Intent("com.facebook.games.gaming_services.DEEPLINK");
            intent.setType("text/plain");
            Bundle bundle = null;
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                ey.i("Attempted to share tournament with an invalid access token");
                return null;
            }
            if (currentAccessToken.getGraphDomain() != null && !FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain())) {
                ey.i("Attempted to share tournament while user is not gaming logged in");
                return null;
            }
            String applicationId = currentAccessToken.getApplicationId();
            Number score = TournamentShareDialog.this.getScore();
            if (score == null) {
                ey.i("Attempted to share tournament without a score");
                return null;
            }
            if (tournamentConfig != null) {
                bundle = TournamentShareDialogURIBuilder.INSTANCE.bundleForCreating$facebook_gamingservices_release(tournamentConfig, score, applicationId);
            } else {
                Tournament tournament = TournamentShareDialog.this.getTournament();
                if (tournament != null) {
                    bundle = TournamentShareDialogURIBuilder.INSTANCE.bundleForUpdating$facebook_gamingservices_release(tournament.identifier, score, applicationId);
                }
            }
            NativeProtocol.setupProtocolRequestIntent(intent, createBaseAppCall.getCallId().toString(), com.google.firebase.encoders.json.BuildConfig.FLAVOR, NativeProtocol.PROTOCOL_VERSION_20210906, bundle);
            createBaseAppCall.setRequestIntent(intent);
            return createBaseAppCall;
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Result {
        private String requestID;
        private String tournamentID;

        public Result(Bundle bundle) {
            bundle.getClass();
            if (bundle.getString("request") != null) {
                this.requestID = bundle.getString("request");
            }
            this.tournamentID = bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID);
        }

        public final String getRequestID() {
            return this.requestID;
        }

        public final String getTournamentID() {
            return this.tournamentID;
        }

        public final void setRequestID(String str) {
            this.requestID = str;
        }

        public final void setTournamentID(String str) {
            this.tournamentID = str;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(fr0 fr0Var) {
        this(new FragmentWrapper(fr0Var));
        fr0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerCallbackImpl$lambda$0(TournamentShareDialog tournamentShareDialog, ResultProcessor resultProcessor, int i, Intent intent) {
        tournamentShareDialog.getClass();
        return ShareInternalUtility.handleActivityResult(tournamentShareDialog.getRequestCode(), i, intent, resultProcessor);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public AppCall createBaseAppCall() {
        return new AppCall(getRequestCode(), null, 2, null);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public List<FacebookDialogBase<TournamentConfig, Result>.ModeHandler> getOrderedModeHandlers() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FacebookAppHandler());
        arrayList.add(new AppSwitchHandler());
        return arrayList;
    }

    public final Number getScore() {
        return this.score;
    }

    public final Tournament getTournament() {
        return this.tournament;
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void registerCallbackImpl(CallbackManagerImpl callbackManagerImpl, final FacebookCallback<Result> facebookCallback) {
        callbackManagerImpl.getClass();
        facebookCallback.getClass();
        callbackManagerImpl.registerCallback(getRequestCode(), new w20(5, this, new ResultProcessor(facebookCallback) { // from class: com.facebook.gamingservices.TournamentShareDialog$registerCallbackImpl$resultProcessor$1
            final /* synthetic */ FacebookCallback<TournamentShareDialog.Result> $callback;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(facebookCallback);
                this.$callback = facebookCallback;
            }

            @Override // com.facebook.share.internal.ResultProcessor
            public void onSuccess(AppCall appCall, Bundle bundle) {
                appCall.getClass();
                if (bundle != null) {
                    if (bundle.getString("error_message") != null) {
                        this.$callback.onError(new FacebookException(bundle.getString("error_message")));
                        return;
                    } else if (bundle.getString(SDKConstants.PARAM_TOURNAMENTS_ID) != null) {
                        this.$callback.onSuccess(new TournamentShareDialog.Result(bundle));
                        return;
                    }
                }
                onCancel(appCall);
            }
        }));
    }

    public final void setScore(Number number) {
        this.score = number;
    }

    public final void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public final void show(Number number, Tournament tournament) {
        number.getClass();
        tournament.getClass();
        this.score = number;
        this.tournament = tournament;
        showImpl((TournamentConfig) null, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }

    @Override // com.facebook.internal.FacebookDialogBase
    public void showImpl(TournamentConfig tournamentConfig, Object obj) {
        obj.getClass();
        if (CloudGameLoginHandler.isRunningInCloud()) {
            return;
        }
        super.showImpl((TournamentShareDialog) tournamentConfig, obj);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public final class AppSwitchHandler extends FacebookDialogBase<TournamentConfig, Result>.ModeHandler {
        public AppSwitchHandler() {
            super();
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public AppCall createAppCall(TournamentConfig tournamentConfig) {
            AppCall createBaseAppCall = TournamentShareDialog.this.createBaseAppCall();
            AccessToken currentAccessToken = AccessToken.Companion.getCurrentAccessToken();
            Uri uri = null;
            if (currentAccessToken == null || currentAccessToken.isExpired()) {
                ey.i("Attempted to share tournament with an invalid access token");
                return null;
            }
            if (currentAccessToken.getGraphDomain() != null && !FacebookSdk.GAMING.equals(currentAccessToken.getGraphDomain())) {
                ey.i("Attempted to share tournament without without gaming login");
                return null;
            }
            Number score = TournamentShareDialog.this.getScore();
            if (score == null) {
                ey.i("Attempted to share tournament without a score");
                return null;
            }
            if (tournamentConfig != null) {
                uri = TournamentShareDialogURIBuilder.INSTANCE.uriForCreating$facebook_gamingservices_release(tournamentConfig, score, currentAccessToken.getApplicationId());
            } else {
                Tournament tournament = TournamentShareDialog.this.getTournament();
                if (tournament != null) {
                    uri = TournamentShareDialogURIBuilder.INSTANCE.uriForUpdating$facebook_gamingservices_release(tournament.identifier, score, currentAccessToken.getApplicationId());
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            TournamentShareDialog tournamentShareDialog = TournamentShareDialog.this;
            tournamentShareDialog.startActivityForResult(intent, tournamentShareDialog.getRequestCode());
            return createBaseAppCall;
        }

        @Override // com.facebook.internal.FacebookDialogBase.ModeHandler
        public boolean canShow(TournamentConfig tournamentConfig, boolean z) {
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(Activity activity) {
        super(activity, defaultRequestCode);
        activity.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TournamentShareDialog(Fragment fragment) {
        this(new FragmentWrapper(fragment));
        fragment.getClass();
    }

    private TournamentShareDialog(FragmentWrapper fragmentWrapper) {
        super(fragmentWrapper, defaultRequestCode);
    }

    public final void show(Number number, TournamentConfig tournamentConfig) {
        number.getClass();
        tournamentConfig.getClass();
        this.score = number;
        showImpl(tournamentConfig, FacebookDialogBase.BASE_AUTOMATIC_MODE);
    }
}
