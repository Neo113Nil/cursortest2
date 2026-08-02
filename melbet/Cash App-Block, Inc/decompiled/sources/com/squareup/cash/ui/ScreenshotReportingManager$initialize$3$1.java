package com.squareup.cash.ui;

import android.app.Activity;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.fillr.browsersdk.model.FillrWidget;
import com.squareup.cash.data.db.InvitationConfig;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.investing.backend.real.RealEntityPriceRefresher;
import com.squareup.protos.franklin.ui.UiPublicProfile;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.atomicfu.AtomicFU;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ScreenshotReportingManager$initialize$3$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScreenshotReportingManager$initialize$3$1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 3;
        switch (this.$r8$classId) {
            case 0:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$1 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, 0);
                screenshotReportingManager$initialize$3$1.L$0 = (Activity) obj;
                screenshotReportingManager$initialize$3$1.L$1 = (FeatureFlag$EnabledDisabledFeatureFlag$Options) obj2;
                return screenshotReportingManager$initialize$3$1.invokeSuspend(Unit.INSTANCE);
            case 1:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$12 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, 1);
                screenshotReportingManager$initialize$3$12.L$0 = (SharedPreferencesView) obj;
                screenshotReportingManager$initialize$3$12.L$1 = (Preferences) obj2;
                return screenshotReportingManager$initialize$3$12.invokeSuspend(Unit.INSTANCE);
            case 2:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$13 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, 2);
                screenshotReportingManager$initialize$3$13.L$0 = (UiPublicProfile) obj;
                screenshotReportingManager$initialize$3$13.L$1 = (Profile) obj2;
                return screenshotReportingManager$initialize$3$13.invokeSuspend(Unit.INSTANCE);
            case 3:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$14 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, i);
                screenshotReportingManager$initialize$3$14.L$0 = (List) obj;
                screenshotReportingManager$initialize$3$14.L$1 = (List) obj2;
                return screenshotReportingManager$initialize$3$14.invokeSuspend(Unit.INSTANCE);
            case 4:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$15 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, 4);
                screenshotReportingManager$initialize$3$15.L$0 = (List) obj;
                screenshotReportingManager$initialize$3$15.L$1 = (RealEntityPriceRefresher.TokenOperation) obj2;
                return screenshotReportingManager$initialize$3$15.invokeSuspend(Unit.INSTANCE);
            default:
                ScreenshotReportingManager$initialize$3$1 screenshotReportingManager$initialize$3$16 = new ScreenshotReportingManager$initialize$3$1(i, (Continuation) obj3, 5);
                screenshotReportingManager$initialize$3$16.L$0 = (List) obj;
                screenshotReportingManager$initialize$3$16.L$1 = (InvitationConfig) obj2;
                return screenshotReportingManager$initialize$3$16.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Activity activity = (Activity) this.L$0;
                FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Pair(activity, Boolean.valueOf(featureFlag$EnabledDisabledFeatureFlag$Options.enabled()));
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SharedPreferencesView sharedPreferencesView = (SharedPreferencesView) this.L$0;
                Preferences preferences = (Preferences) this.L$1;
                Set keySet = preferences.asMap().keySet();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10));
                Iterator it = keySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Preferences.Key) it.next()).name);
                }
                LinkedHashMap all = sharedPreferencesView.getAll();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : all.entrySet()) {
                    if (!arrayList.contains((String) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                MutablePreferences mutablePreferences = preferences.toMutablePreferences();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value = entry2.getValue();
                    if (value instanceof Boolean) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.booleanKey(str), value);
                    } else if (value instanceof Float) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.floatKey(str), value);
                    } else if (value instanceof Integer) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.intKey(str), value);
                    } else if (value instanceof Long) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.longKey(str), value);
                    } else if (value instanceof String) {
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(Strings.stringKey(str), value);
                    } else if (value instanceof Set) {
                        str.getClass();
                        mutablePreferences.setUnchecked$datastore_preferences_core_release(new Preferences.Key(str), (Set) value);
                    }
                }
                return mutablePreferences.toPreferences();
            case 2:
                UiPublicProfile uiPublicProfile = (UiPublicProfile) this.L$0;
                Profile profile = (Profile) this.L$1;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (uiPublicProfile != null) {
                    return FillrWidget.WidgetType.AnonymousClass1.toPublicProfile(uiPublicProfile, profile);
                }
                return null;
            case 3:
                List list = (List) this.L$0;
                List list2 = (List) this.L$1;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(list.size() == list2.size() && list.containsAll(list2));
            case 4:
                List list3 = (List) this.L$0;
                RealEntityPriceRefresher.TokenOperation tokenOperation = (RealEntityPriceRefresher.TokenOperation) this.L$1;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (tokenOperation instanceof RealEntityPriceRefresher.TokenOperation.AddAll) {
                    return CollectionsKt.plus((Iterable) ((RealEntityPriceRefresher.TokenOperation.AddAll) tokenOperation).getTokens(), (Collection) list3);
                }
                if (tokenOperation instanceof RealEntityPriceRefresher.TokenOperation.RemoveAllOnce) {
                    return AtomicFU.access$removeOnce(list3, ((RealEntityPriceRefresher.TokenOperation.RemoveAllOnce) tokenOperation).getTokens());
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            default:
                List list4 = (List) this.L$0;
                InvitationConfig invitationConfig = (InvitationConfig) this.L$1;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (list4.isEmpty() && !invitationConfig.getEnabled()) {
                    r2 = false;
                }
                return Boolean.valueOf(r2);
        }
    }
}
