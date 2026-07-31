package dev.hyo.openiap.utils;

import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseVerificationValidator.kt */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$2 extends FunctionReferenceImpl implements Function1<String, HttpURLConnection> {
    public static final PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$2 INSTANCE = new PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$2();

    PurchaseVerificationValidatorKt$verifyPurchaseWithGooglePlay$2() {
        super(1, PurchaseVerificationValidatorKt.class, "openConnection", "openConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final HttpURLConnection invoke(String p0) {
        HttpURLConnection openConnection;
        Intrinsics.checkNotNullParameter(p0, "p0");
        openConnection = PurchaseVerificationValidatorKt.openConnection(p0);
        return openConnection;
    }
}
