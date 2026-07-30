package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.login.CustomTabLoginMethodHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class InstagramCustomTab extends CustomTab {
    public static final Companion Companion = new Companion(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramCustomTab(String str, Bundle bundle) {
        super(str, bundle);
        str.getClass();
        setUri(Companion.getURIForAction(str, bundle == null ? new Bundle() : bundle));
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri getURIForAction(String str, Bundle bundle) {
            str.getClass();
            if (Intrinsics.b(str, CustomTabLoginMethodHandler.OAUTH_DIALOG)) {
                return Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), ServerProtocol.INSTAGRAM_OAUTH_PATH, bundle);
            }
            return Utility.buildUri(ServerProtocol.getInstagramDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + str, bundle);
        }

        private Companion() {
        }
    }
}
