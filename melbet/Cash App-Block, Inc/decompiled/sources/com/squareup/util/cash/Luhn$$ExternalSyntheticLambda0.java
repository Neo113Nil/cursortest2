package com.squareup.util.cash;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.Updater;
import com.google.zxing.qrcode.QRCodeReader;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.cards.CardThemeDefinition;
import com.squareup.protos.franklin.sca.ThreeDomainSecureRedirectUrl$Companion$ADAPTER$1;
import com.squareup.protos.teamapp.ui.Duration;
import com.squareup.protos.teamapp.ui.Number;
import com.squareup.util.android.ShareResultReceiver;
import com.squareup.wire.ProtoAdapter;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.financialconnections.FinancialConnectionsSheetActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetViewModel;
import java.lang.annotation.Annotation;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Regex;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* loaded from: classes8.dex */
public final /* synthetic */ class Luhn$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Luhn$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ProtoAdapter paramsAdapter_delegate$lambda$0;
        switch (this.$r8$classId) {
            case 0:
                return new Regex("\\s");
            case 1:
                ProtoAdapter.Companion companion = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                ProtoAdapter protoAdapter2 = CardThemeDefinition.ADAPTER;
                companion.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
            case 2:
                paramsAdapter_delegate$lambda$0 = ThreeDomainSecureRedirectUrl$Companion$ADAPTER$1.paramsAdapter_delegate$lambda$0();
                return paramsAdapter_delegate$lambda$0;
            case 3:
                ProtoAdapter.Companion companion2 = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                companion2.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter3, protoAdapter3);
            case 4:
                ProtoAdapter.Companion companion3 = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter4 = ProtoAdapter.STRING;
                ProtoAdapter protoAdapter5 = Number.ADAPTER;
                companion3.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter4, protoAdapter5);
            case 5:
                ProtoAdapter.Companion companion4 = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter6 = ProtoAdapter.STRING;
                ProtoAdapter protoAdapter7 = Money.ADAPTER;
                companion4.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter6, protoAdapter7);
            case 6:
                ProtoAdapter.Companion companion5 = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter8 = ProtoAdapter.STRING;
                ProtoAdapter protoAdapter9 = Duration.ADAPTER;
                companion5.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter8, protoAdapter9);
            case 7:
                return new QRCodeReader();
            case 8:
                return "Failed to authenticate url, check if we are authenticating urls without AppConfig";
            case 9:
                int i = ShareResultReceiver.$r8$clinit;
                return Unit.INSTANCE;
            case 10:
                return new Handler(Looper.getMainLooper());
            case 11:
                return Long.valueOf(Calendar.getInstance().getTimeInMillis());
            case 12:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
            case 13:
                StripeRequest.Method[] values = StripeRequest.Method.values();
                values.getClass();
                return new EnumSerializer("com.stripe.android.core.networking.StripeRequest.Method", (Enum[]) values);
            case 14:
                StripeRequest.MimeType[] values2 = StripeRequest.MimeType.values();
                values2.getClass();
                return new EnumSerializer("com.stripe.android.core.networking.StripeRequest.MimeType", (Enum[]) values2);
            case 15:
                return new PolymorphicSerializer(Reflection.factory.getOrCreateKotlinClass(Iterable.class), new Annotation[0]);
            case 16:
                int i2 = FinancialConnectionsSheetActivity.$r8$clinit;
                return FinancialConnectionsSheetViewModel.Factory;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Unit.INSTANCE;
            case 25:
                return Unit.INSTANCE;
            case 26:
                return Unit.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                return Updater.mutableStateOf$default("");
        }
    }
}
