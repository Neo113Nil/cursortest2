package com.squareup.cash.wallet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.postcard.CardScheme;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealCardAppletTileRepository$availabilityState$1 extends SuspendLambda implements Function4 {
    public int I$0;
    public /* synthetic */ CardScheme L$0;
    public /* synthetic */ IssuedCardFactory.IssuedCard L$1;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ RealCardAppletTileRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealCardAppletTileRepository$availabilityState$1(RealCardAppletTileRepository realCardAppletTileRepository, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realCardAppletTileRepository;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        RealCardAppletTileRepository$availabilityState$1 realCardAppletTileRepository$availabilityState$1 = new RealCardAppletTileRepository$availabilityState$1(this.this$0, (Continuation) obj4);
        realCardAppletTileRepository$availabilityState$1.Z$0 = booleanValue;
        realCardAppletTileRepository$availabilityState$1.L$0 = (CardScheme) obj2;
        realCardAppletTileRepository$availabilityState$1.L$1 = (IssuedCardFactory.IssuedCard) obj3;
        return realCardAppletTileRepository$availabilityState$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[LOOP:0: B:31:0x0037->B:44:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardModule.HeroNullStateModule heroNullStateModule;
        int i;
        int i2;
        boolean z = this.Z$0;
        CardScheme cardScheme = this.L$0;
        IssuedCardFactory.IssuedCard issuedCard = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            List list = cardScheme.modules;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    CardModule.Type type2 = ((CardModule) it.next()).f1328type;
                    if (type2 != null) {
                        CardModule.Type.HeroNullState heroNullState = type2 instanceof CardModule.Type.HeroNullState ? (CardModule.Type.HeroNullState) type2 : null;
                        if (heroNullState != null) {
                            heroNullStateModule = heroNullState.getValue();
                            if (heroNullStateModule == null) {
                                i = 1;
                                break;
                            }
                        }
                    }
                    heroNullStateModule = null;
                    if (heroNullStateModule == null) {
                    }
                }
            }
            i = 0;
            this.L$0 = null;
            this.L$1 = issuedCard;
            this.Z$0 = z;
            this.I$0 = i;
            this.label = 1;
            Object access$cardNuxThemes = RealCardAppletTileRepository.access$cardNuxThemes(this.this$0, cardScheme, this);
            if (access$cardNuxThemes == coroutineSingletons) {
                return coroutineSingletons;
            }
            int i4 = i;
            obj = access$cardNuxThemes;
            i2 = i4;
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$0;
            SafeTrace.throwOnFailure(obj);
        }
        return (z && ((i2 == 0 && (issuedCard != null)) || (obj != null))) ? AppletAvailabilityState.AVAILABLE : AppletAvailabilityState.UNAVAILABLE;
    }
}
