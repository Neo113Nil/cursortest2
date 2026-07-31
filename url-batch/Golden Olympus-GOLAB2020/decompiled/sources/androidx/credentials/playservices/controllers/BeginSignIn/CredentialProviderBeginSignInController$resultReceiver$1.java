package androidx.credentials.playservices.controllers.BeginSignIn;

import G.f;
import I.a;
import android.os.Bundle;
import android.os.ResultReceiver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;

@Metadata
/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController$resultReceiver$1 extends ResultReceiver {

    /* synthetic */ class a extends p implements Function2 {
        a(Object obj) {
            super(2, obj, a.C0012a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final f invoke(String str, String str2) {
            return ((a.C0012a) this.receiver).b(str, str2);
        }
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i4, Bundle resultData) {
        Intrinsics.checkNotNullParameter(resultData, "resultData");
        new a(I.a.f768a);
        throw null;
    }
}
