package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.CustomTabPrefetchHelper;
import defpackage.t21;
import defpackage.w50;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CustomTab {
    public static final Companion Companion = new Companion(null);
    private Uri uri;

    public CustomTab(String str, Bundle bundle) {
        str.getClass();
        bundle = bundle == null ? new Bundle() : bundle;
        GamingAction[] values = GamingAction.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (GamingAction gamingAction : values) {
            arrayList.add(gamingAction.getRawValue());
        }
        this.uri = arrayList.contains(str) ? Utility.buildUri(ServerProtocol.getGamingDialogAuthority(), "/dialog/" + str, bundle) : Companion.getURIForAction(str, bundle);
    }

    public static Uri getURIForAction(String str, Bundle bundle) {
        if (CrashShieldHandler.isObjectCrashing(CustomTab.class)) {
            return null;
        }
        try {
            return Companion.getURIForAction(str, bundle);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, CustomTab.class);
            return null;
        }
    }

    public final Uri getUri() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final boolean openCustomTab(Activity activity, String str) {
        if (!CrashShieldHandler.isObjectCrashing(this)) {
            try {
                activity.getClass();
                t21 a = new w50(CustomTabPrefetchHelper.Companion.getPreparedSessionOnce()).a();
                Intent intent = (Intent) a.n;
                intent.setPackage(str);
                try {
                    intent.setData(this.uri);
                    activity.startActivity(intent, (Bundle) a.o);
                    return true;
                } catch (ActivityNotFoundException unused) {
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
                return false;
            }
        }
        return false;
    }

    public final void setUri(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            uri.getClass();
            this.uri = uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Uri getURIForAction(String str, Bundle bundle) {
            str.getClass();
            return Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + str, bundle);
        }

        private Companion() {
        }
    }
}
