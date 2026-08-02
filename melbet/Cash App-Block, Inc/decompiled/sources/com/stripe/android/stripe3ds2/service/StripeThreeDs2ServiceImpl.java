package com.stripe.android.stripe3ds2.service;

import android.content.Context;
import androidx.media3.extractor.mkv.Sniffer;
import com.google.android.gms.dynamite.zzo;
import com.google.android.gms.maps.zzai;
import com.plaid.internal.EnumC0170g;
import com.squareup.scannerview.TextSetter;
import com.stripe.android.stripe3ds2.init.DefaultSecurityChecker;
import com.stripe.android.stripe3ds2.init.DeviceDataFactoryImpl;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.security.StripeEphemeralKeyPairGenerator;
import com.stripe.android.stripe3ds2.transaction.Logger;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import com.stripe.android.stripe3ds2.utils.ImageCache$Default;
import kotlin.coroutines.CoroutineContext;
import okhttp3.internal.ws.RealWebSocket$connect$1;

/* loaded from: classes8.dex */
public final class StripeThreeDs2ServiceImpl {
    public final DefaultErrorReporter errorReporter;
    public final MessageVersionRegistry messageVersionRegistry;
    public final RealWebSocket$connect$1 transactionFactory;

    public StripeThreeDs2ServiceImpl(Context context, boolean z, CoroutineContext coroutineContext) {
        ImageCache$Default imageCache$Default = ImageCache$Default.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter(applicationContext, null, null, z ? Logger.Noop.INSTANCE$1 : Logger.Noop.INSTANCE, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
        StripeEphemeralKeyPairGenerator stripeEphemeralKeyPairGenerator = new StripeEphemeralKeyPairGenerator(defaultErrorReporter);
        DefaultSecurityChecker defaultSecurityChecker = new DefaultSecurityChecker();
        MessageVersionRegistry messageVersionRegistry = new MessageVersionRegistry();
        Sniffer sniffer = new Sniffer(context, coroutineContext);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        DeviceDataFactoryImpl deviceDataFactoryImpl = new DeviceDataFactoryImpl(applicationContext2, sniffer, messageVersionRegistry);
        zzo zzoVar = new zzo(10, false);
        TextSetter textSetter = new TextSetter(stripeEphemeralKeyPairGenerator, defaultErrorReporter);
        zzai zzaiVar = new zzai();
        zzaiVar.zaa = deviceDataFactoryImpl;
        zzaiVar.zab = zzoVar;
        zzaiVar.zac = defaultSecurityChecker;
        zzaiVar.zad = sniffer;
        zzaiVar.zza = textSetter;
        zzaiVar.zzb = messageVersionRegistry;
        zzaiVar.zzc = "3DS_LOA_SDK_STIN_020200_00960";
        zzaiVar.zzd = defaultErrorReporter;
        zzaiVar.zze = coroutineContext;
        RealWebSocket$connect$1 realWebSocket$connect$1 = new RealWebSocket$connect$1(1, zzaiVar, stripeEphemeralKeyPairGenerator);
        defaultSecurityChecker.getWarnings();
        context.getApplicationContext().getClass();
        this.messageVersionRegistry = messageVersionRegistry;
        this.errorReporter = defaultErrorReporter;
        this.transactionFactory = realWebSocket$connect$1;
    }
}
