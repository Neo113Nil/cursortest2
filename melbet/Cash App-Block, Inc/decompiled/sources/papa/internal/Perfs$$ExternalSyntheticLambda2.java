package papa.internal;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.View;
import com.google.android.gms.internal.measurement.zzaag;
import com.squareup.cash.userjourneys.data.UserJourney;
import com.squareup.cash.userjourneys.tracker.ActiveUserJourney;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.internal.EnumSerializer;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.cache.DiskLruCache;
import papa.AndroidComponentEvent;
import papa.AppStart$AppStartData;
import papa.AppVisibilityState;
import papa.InteractionTrigger;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class Perfs$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Perfs$$ExternalSyntheticLambda2(String str, Function2 function2) {
        this.$r8$classId = 11;
        this.f$0 = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                AppVisibilityState appVisibilityState = (AppVisibilityState) obj;
                appVisibilityState.getClass();
                ((SharedPreferences) obj2).edit().putString("lastResumedState", appVisibilityState.name()).putLong("lastResumedCurrentMillis", System.currentTimeMillis()).apply();
                return Unit.INSTANCE;
            case 1:
                zzaag zzaagVar = (zzaag) obj2;
                UserJourney userJourney = (UserJourney) obj;
                userJourney.getClass();
                Timber.Forest.d("Handle add tag: journey=" + userJourney.getName().getLabel() + " tag=" + zzaagVar, new Object[0]);
                userJourney.getName().getClass();
                return UserJourney.copy$default(userJourney, null, null, 0L, 0L, null, null, SetsKt___SetsKt.plus(userJourney.getTags(), zzaagVar.zza), null, null, false, 959, null);
            case 2:
                ActiveUserJourney activeUserJourney = (ActiveUserJourney) obj;
                activeUserJourney.getClass();
                return Boolean.valueOf(Intrinsics.areEqual(activeUserJourney.id, ((UserJourney) obj2).getId()));
            case 3:
                return obj == ((AbstractCollection) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 4:
                obj.getClass();
                return ((Function0) obj2).invoke();
            case 5:
                ((MutexImpl) obj2).unlock(null);
                return Unit.INSTANCE;
            case 6:
                ClassSerialDescriptorBuilder classSerialDescriptorBuilder = (ClassSerialDescriptorBuilder) obj;
                classSerialDescriptorBuilder.getClass();
                List list = (List) ((EnumSerializer) obj2).overriddenDescriptor;
                list.getClass();
                classSerialDescriptorBuilder.annotations = list;
                return Unit.INSTANCE;
            case 7:
                KSerializer kSerializer = (KSerializer) obj2;
                ((List) obj).getClass();
                return kSerializer;
            case 8:
                ((IOException) obj).getClass();
                TimeZone timeZone = _UtilJvmKt.UTC;
                ((DiskLruCache) obj2).hasJournalErrors = true;
                return Unit.INSTANCE;
            case 9:
                Class<?> cls = (Class) obj;
                cls.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    if (((Class) ((Pair) obj3).first).isAssignableFrom(cls)) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((Function1) ((Pair) it.next()).second);
                }
                return arrayList2;
            case 10:
                InteractionTrigger interactionTrigger = (InteractionTrigger) obj2;
                InteractionTrigger interactionTrigger2 = (InteractionTrigger) obj;
                interactionTrigger2.getClass();
                return Boolean.valueOf(interactionTrigger2 == interactionTrigger);
            case 11:
                AppStart$AppStartData appStart$AppStartData = (AppStart$AppStartData) obj;
                appStart$AppStartData.getClass();
                SystemClock.uptimeMillis();
                return (AppStart$AppStartData) ((Function2) obj2).invoke(appStart$AppStartData, new AndroidComponentEvent());
            default:
                ((View) obj).getClass();
                ((LaunchTracker$$ExternalSyntheticLambda0) obj2).invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Perfs$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    public /* synthetic */ Perfs$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
