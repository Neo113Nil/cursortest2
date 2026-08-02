package com.squareup.cash.support.views.article;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.Updater;
import com.squareup.cash.transfers.presenters.WithdrawPresenter;
import com.squareup.cash.treehouse.activity.ActivityUpdate;
import com.squareup.cash.treehouse.biometrics.BiometricsReadResult;
import com.squareup.cash.treehouse.biometrics.BiometricsWriteResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import okio.ByteString;

/* loaded from: classes7.dex */
public final /* synthetic */ class ArticleViewKt$$ExternalSyntheticLambda7 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ ArticleViewKt$$ExternalSyntheticLambda7(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new ParcelableSnapshotMutableIntState(0);
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 3:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 4:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 5:
                return Updater.mutableStateOf$default(WithdrawPresenter.InputMode.VIEW_AMOUNT);
            case 6:
                return Updater.mutableStateOf$default(Boolean.FALSE);
            case 7:
                return Unit.INSTANCE;
            case 8:
                return new EnumSerializer("Feed", ActivityUpdate.Feed.INSTANCE, new Annotation[0]);
            case 9:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 10:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 11:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 12:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 13:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 14:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 15:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 16:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 17:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 18:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 19:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 20:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 21:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(ByteString.class), null, new KSerializer[0]);
            case 22:
                return new EnumSerializer("DecryptionFailure", BiometricsReadResult.DecryptionFailure.INSTANCE, new Annotation[0]);
            case 23:
                return new EnumSerializer("LockedOut", BiometricsReadResult.LockedOut.INSTANCE, new Annotation[0]);
            case 24:
                return new EnumSerializer("NoValue", BiometricsReadResult.NoValue.INSTANCE, new Annotation[0]);
            case 25:
                return new EnumSerializer("UserCancelled", BiometricsReadResult.UserCancelled.INSTANCE, new Annotation[0]);
            case 26:
                return new EnumSerializer("SecureStoreUnavailable", BiometricsWriteResult.SecureStoreUnavailable.INSTANCE, new Annotation[0]);
            case 27:
                return new EnumSerializer("Success", BiometricsWriteResult.Success.INSTANCE, new Annotation[0]);
            case 28:
                StringSerializer stringSerializer = StringSerializer.INSTANCE;
                return new HashMapSerializer(stringSerializer, stringSerializer, 1);
            default:
                return new ContextualSerializer(Reflection.factory.getOrCreateKotlinClass(Throwable.class), null, new KSerializer[0]);
        }
    }
}
