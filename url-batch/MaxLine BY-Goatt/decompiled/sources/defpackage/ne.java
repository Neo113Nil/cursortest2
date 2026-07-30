package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ne extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ne(Status status) {
        super(r0 + ": " + (r3 == null ? BuildConfig.FLAVOR : r3));
        int i = status.m;
        String str = status.n;
    }
}
