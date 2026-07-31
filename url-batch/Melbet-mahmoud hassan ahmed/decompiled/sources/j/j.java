package j;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public final class j {
    static RemoteInput a(j jVar) {
        throw null;
    }

    static RemoteInput[] b(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jVarArr.length];
        for (int i7 = 0; i7 < jVarArr.length; i7++) {
            remoteInputArr[i7] = a(jVarArr[i7]);
        }
        return remoteInputArr;
    }
}
