package com.squareup.cash.threedsdataonly.backend.real;

import com.netcetera.threeds.sdk.api.ThreeDS2Service;
import com.netcetera.threeds.sdk.api.exceptions.SDKNotInitializedException;
import com.netcetera.threeds.sdk.api.security.Warning;
import com.squareup.cash.threedsdataonly.backend.api.SdkNotInitializedException;
import com.squareup.cash.threedsdataonly.backend.api.Warning;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealThreeDsService$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealThreeDsService f$0;

    public /* synthetic */ RealThreeDsService$$ExternalSyntheticLambda0(RealThreeDsService realThreeDsService, int i) {
        this.$r8$classId = i;
        this.f$0 = realThreeDsService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        RealThreeDsService realThreeDsService = this.f$0;
        switch (i) {
            case 0:
                ThreeDS2Service threeDS2Service = realThreeDsService.threeDsService;
                if (threeDS2Service == null) {
                    throw new SdkNotInitializedException("3DS SDK not initialized when accessing warnings", null);
                }
                List<Warning> warnings = threeDS2Service.getWarnings();
                warnings.getClass();
                List<Warning> list = warnings;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Warning warning : list) {
                    warning.getClass();
                    String id = warning.getId();
                    id.getClass();
                    String message = warning.getMessage();
                    message.getClass();
                    arrayList.add(new com.squareup.cash.threedsdataonly.backend.api.Warning(id, message, Warning.Severity.valueOf(warning.getSeverity().name())));
                }
                return arrayList;
            default:
                try {
                    ThreeDS2Service threeDS2Service2 = realThreeDsService.threeDsService;
                    if (threeDS2Service2 != null) {
                        threeDS2Service2.cleanup(realThreeDsService.context);
                    }
                } catch (SDKNotInitializedException e) {
                    Timber.Forest forest = Timber.Forest;
                    forest.tag("3DS");
                    forest.w("3DS SDK was not initialized, no cleanup needed", new Object[0], e);
                }
                return Unit.INSTANCE;
        }
    }
}
