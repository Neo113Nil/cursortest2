package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class A {

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(A a4) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(A a4) {
        return a.b(a4);
    }

    static RemoteInput[] b(A[] aArr) {
        if (aArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[aArr.length];
        for (int i4 = 0; i4 < aArr.length; i4++) {
            A a4 = aArr[i4];
            remoteInputArr[i4] = a(null);
        }
        return remoteInputArr;
    }
}
