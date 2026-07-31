package androidx.credentials.playservices.controllers.CreatePassword;

import G.b;
import I.a;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController$resultReceiver$1 extends ResultReceiver {

    /* synthetic */ class a extends p implements Function2 {
        a(Object obj) {
            super(2, obj, a.C0012a.class, "createCredentialExceptionTypeToException", "createCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/CreateCredentialException;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(String str, String str2) {
            return ((a.C0012a) this.receiver).a(str, str2);
        }
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i4, Bundle resultData) {
        Executor executor;
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        a aVar = new a(I.a.f768a);
        Executor d4 = J.a.d(null);
        if (d4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        } else {
            executor = d4;
        }
        J.a.b(null);
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        if (J.a.e(null, resultData, aVar, executor, null, J.a.c(null))) {
            return;
        }
        resultData.getInt("ACTIVITY_REQUEST_CODE");
        throw null;
    }
}
