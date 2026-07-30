package defpackage;

import android.content.Intent;
import com.facebook.FacebookCallback;
import com.facebook.gamingservices.ContextChooseDialog;
import com.facebook.gamingservices.ContextChooseDialog$registerCallbackImpl$resultProcessor$1;
import com.facebook.gamingservices.ContextCreateDialog;
import com.facebook.gamingservices.ContextCreateDialog$registerCallbackImpl$resultProcessor$1;
import com.facebook.gamingservices.ContextSwitchDialog;
import com.facebook.gamingservices.ContextSwitchDialog$registerCallbackImpl$resultProcessor$1;
import com.facebook.gamingservices.TournamentJoinDialog;
import com.facebook.gamingservices.TournamentJoinDialog$registerCallbackImpl$resultProcessor$1;
import com.facebook.gamingservices.TournamentShareDialog;
import com.facebook.gamingservices.TournamentShareDialog$registerCallbackImpl$resultProcessor$1;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.login.LoginManager;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class w20 implements CallbackManagerImpl.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.facebook.internal.CallbackManagerImpl.Callback
    public final boolean onActivityResult(int i, Intent intent) {
        boolean registerCallbackImpl$lambda$4;
        boolean registerCallbackImpl$lambda$3;
        boolean registerCallbackImpl$lambda$32;
        boolean registerCallback$lambda$0;
        boolean registerCallbackImpl$lambda$0;
        boolean registerCallbackImpl$lambda$02;
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                registerCallbackImpl$lambda$4 = ContextChooseDialog.registerCallbackImpl$lambda$4((ContextChooseDialog) obj2, (ContextChooseDialog$registerCallbackImpl$resultProcessor$1) obj, i, intent);
                return registerCallbackImpl$lambda$4;
            case 1:
                registerCallbackImpl$lambda$3 = ContextCreateDialog.registerCallbackImpl$lambda$3((ContextCreateDialog) obj2, (ContextCreateDialog$registerCallbackImpl$resultProcessor$1) obj, i, intent);
                return registerCallbackImpl$lambda$3;
            case 2:
                registerCallbackImpl$lambda$32 = ContextSwitchDialog.registerCallbackImpl$lambda$3((ContextSwitchDialog) obj2, (ContextSwitchDialog$registerCallbackImpl$resultProcessor$1) obj, i, intent);
                return registerCallbackImpl$lambda$32;
            case 3:
                registerCallback$lambda$0 = LoginManager.registerCallback$lambda$0((LoginManager) obj2, (FacebookCallback) obj, i, intent);
                return registerCallback$lambda$0;
            case 4:
                registerCallbackImpl$lambda$0 = TournamentJoinDialog.registerCallbackImpl$lambda$0((TournamentJoinDialog) obj2, (TournamentJoinDialog$registerCallbackImpl$resultProcessor$1) obj, i, intent);
                return registerCallbackImpl$lambda$0;
            default:
                registerCallbackImpl$lambda$02 = TournamentShareDialog.registerCallbackImpl$lambda$0((TournamentShareDialog) obj2, (TournamentShareDialog$registerCallbackImpl$resultProcessor$1) obj, i, intent);
                return registerCallbackImpl$lambda$02;
        }
    }
}
