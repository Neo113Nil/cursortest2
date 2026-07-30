package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import defpackage.k4;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FacebookException extends RuntimeException {
    public static final Companion Companion = new Companion(null);
    private static final SecureRandom rand = new SecureRandom();
    public static final long serialVersionUID = 1;

    public FacebookException(String str) {
        super(str);
        if (str == null || !FacebookSdk.isInitialized() || rand.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new k4(6, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(String str, boolean z) {
        if (z) {
            try {
                ErrorReportHandler.save(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? com.google.firebase.encoders.json.BuildConfig.FLAVOR : message;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FacebookException() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FacebookException(String str, Object... objArr) {
        this(r2);
        String str2;
        objArr.getClass();
        if (str != null) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
        } else {
            str2 = null;
        }
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
