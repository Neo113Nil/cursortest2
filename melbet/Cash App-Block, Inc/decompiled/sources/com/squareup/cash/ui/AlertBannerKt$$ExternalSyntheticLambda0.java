package com.squareup.cash.ui;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.shortcut.BitcoinShortcutBuilder;
import com.squareup.cash.shortcut.QrCodeShortcutBuilder;
import com.squareup.cash.treehouse.hostview.LifecycleState;
import com.squareup.cash.treehouse.logger.LogLevel;
import com.squareup.cash.treehouse.qr.QrScanResult;
import com.squareup.cash.ui.bitcoin.BitcoinShortcutActivity;
import com.squareup.cash.ui.qrcodes.QrCodeShortcutActivity;
import com.squareup.cash.wallet.views.CardAppletTileRenderMode;
import com.squareup.cash.wallet.views.CardTransitionKt;
import com.squareup.protos.cash.appthemes.AppThemeDefinition;
import com.squareup.wire.ProtoAdapter;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.PairSerializer;
import kotlinx.serialization.internal.StringSerializer;
import okio.ByteString;

/* loaded from: classes7.dex */
public final /* synthetic */ class AlertBannerKt$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AlertBannerKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 2:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 3:
                LifecycleState[] values = LifecycleState.values();
                values.getClass();
                return new EnumSerializer("com.squareup.cash.treehouse.hostview.LifecycleState", (Enum[]) values);
            case 4:
                LogLevel[] values2 = LogLevel.values();
                values2.getClass();
                return new EnumSerializer("com.squareup.cash.treehouse.logger.LogLevel", (Enum[]) values2);
            case 5:
                return LogLevel.Companion.serializer();
            case 6:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashSetSerializer(new PairSerializer(stringSerializer, stringSerializer, 0), 1);
            case 7:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 8:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 9:
                return new EnumSerializer("CameraPermissionDenied", QrScanResult.CameraPermissionDenied.INSTANCE, new Annotation[0]);
            case 10:
                return new EnumSerializer("Canceled", QrScanResult.Canceled.INSTANCE, new Annotation[0]);
            case 11:
                int i = BitcoinShortcutActivity.$r8$clinit;
                return new BitcoinShortcutBuilder(new BinaryBitmap(21), Reflection.factory.getOrCreateKotlinClass(MainActivity.class));
            case 12:
                int i2 = QrCodeShortcutActivity.$r8$clinit;
                return new QrCodeShortcutBuilder(new RealClientRouteFormatter(null, 3), Reflection.factory.getOrCreateKotlinClass(MainActivity.class));
            case 13:
                return Unit.INSTANCE;
            case 14:
                return new ParcelableSnapshotMutableIntState(0);
            case 15:
                return Unit.INSTANCE;
            case 16:
                return CardAppletTileRenderMode.Tile;
            case 17:
                return Unit.INSTANCE;
            case 18:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CardTransitionKt.LocalCardRegistry;
                return null;
            case 19:
                throw new IllegalStateException("A CardScreenId must be provided in order to use card transitions.");
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return Updater.mutableStateOf$default(0);
            case 25:
                return Unit.INSTANCE;
            case 26:
                return EmptySet.INSTANCE;
            case 27:
                return Unit.INSTANCE;
            case 28:
                return Unit.INSTANCE;
            default:
                ProtoAdapter.Companion companion = ProtoAdapter.Companion;
                ProtoAdapter protoAdapter = ProtoAdapter.STRING;
                ProtoAdapter protoAdapter2 = AppThemeDefinition.ADAPTER;
                companion.getClass();
                return ProtoAdapter.Companion.newMapAdapter(protoAdapter, protoAdapter2);
        }
    }
}
