package papa;

import android.content.Context;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Updater;
import app.cash.trifle.Trifle;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjg;
import com.squareup.util.coroutines.CompositeSetupTeardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.BaseDoubleCheckKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import retrofit2.OkHttpCall;

/* loaded from: classes3.dex */
public abstract class InteractionResult implements zzjg {
    public final Object $$delegate_0;
    public final /* synthetic */ int $r8$classId;

    public final class Canceled extends InteractionResult {
        public final String cancelReason;
        public final long cancelUptime;

        public Canceled(OkHttpCall.AnonymousClass1 anonymousClass1, String str, long j) {
            super(anonymousClass1);
            this.cancelReason = str;
            this.cancelUptime = j;
        }
    }

    public final class Finished extends InteractionResult {
        public final long endFrameRenderedUptime;

        public Finished(OkHttpCall.AnonymousClass1 anonymousClass1, long j) {
            super(anonymousClass1);
            this.endFrameRenderedUptime = j;
        }
    }

    public InteractionResult(byte b, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 2:
                this.$$delegate_0 = new Object();
                break;
            case 3:
            default:
                this.$$delegate_0 = Updater.mutableStateOf$default(Boolean.FALSE);
                break;
            case 4:
                this.$$delegate_0 = new HashMap();
                break;
        }
    }

    public abstract void clearWatchSet$runtime(SendChannel sendChannel);

    public abstract void commitSubscriptionChanges$runtime();

    public abstract Object create(Object obj);

    public abstract void dispose$runtime();

    public Object get(Object obj) {
        synchronized (((HashMap) this.$$delegate_0)) {
            try {
                if (((HashMap) this.$$delegate_0).containsKey(obj)) {
                    return ((HashMap) this.$$delegate_0).get(obj);
                }
                Object create = create(obj);
                ((HashMap) this.$$delegate_0).put(obj, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object getCurrentState();

    public abstract Object getTargetState();

    public void put(Object obj, Provider provider) {
        obj.getClass();
        provider.getClass();
        ((LinkedHashMap) this.$$delegate_0).put(obj, provider);
    }

    public abstract Function1 readObserverFor$runtime(SendChannel sendChannel);

    public abstract void reportSnapshotFlowCancellation$runtime(Channel channel);

    public abstract void setCurrentState$animation_core(Object obj);

    public String toString() {
        String sb;
        switch (this.$r8$classId) {
            case 0:
                OkHttpCall.AnonymousClass1 anonymousClass1 = (OkHttpCall.AnonymousClass1) this.$$delegate_0;
                InteractionTrigger interactionTrigger = (InteractionTrigger) anonymousClass1.val$callback;
                List list = (List) anonymousClass1.this$0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("InteractionResult.".concat(getClass().getSimpleName()));
                sb2.append("(");
                if (this instanceof Canceled) {
                    StringBuilder sb3 = new StringBuilder("cancelReason=\"");
                    Canceled canceled = (Canceled) this;
                    sb3.append(canceled.cancelReason);
                    sb3.append("\", startToCancel=");
                    long m4172minusLRDsOJo = Duration.m4172minusLRDsOJo(canceled.cancelUptime, ((SentEvent) CollectionsKt.first((List) ((OkHttpCall.AnonymousClass1) canceled.$$delegate_0).this$0)).uptime);
                    DurationUnit durationUnit = DurationUnit.NANOSECONDS;
                    sb3.append(Duration.m4178toStringimpl$default(m4172minusLRDsOJo));
                    sb3.append(", ");
                    sb = sb3.toString();
                } else {
                    if (!(this instanceof Finished)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    StringBuilder sb4 = new StringBuilder("startToEndFrameRendered=");
                    Finished finished = (Finished) this;
                    long m4172minusLRDsOJo2 = Duration.m4172minusLRDsOJo(finished.endFrameRenderedUptime, ((SentEvent) CollectionsKt.first((List) ((OkHttpCall.AnonymousClass1) finished.$$delegate_0).this$0)).uptime);
                    DurationUnit durationUnit2 = DurationUnit.NANOSECONDS;
                    sb4.append(Duration.m4178toStringimpl$default(m4172minusLRDsOJo2));
                    sb4.append(", ");
                    sb = sb4.toString();
                }
                sb2.append(sb);
                sb2.append("runningFrameCount=0, ");
                StringBuilder sb5 = new StringBuilder("events=");
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SentEvent) it.next()).event);
                }
                sb5.append(arrayList);
                sb5.append(", ");
                sb2.append(sb5.toString());
                if (interactionTrigger != null) {
                    StringBuilder sb6 = new StringBuilder("inputToStart=");
                    long m4172minusLRDsOJo3 = Duration.m4172minusLRDsOJo(((SentEvent) CollectionsKt.first(list)).uptime, interactionTrigger.mo4371getTriggerUptimeUwyO8pc());
                    DurationUnit durationUnit3 = DurationUnit.NANOSECONDS;
                    sb6.append(Duration.m4178toStringimpl$default(m4172minusLRDsOJo3));
                    sb6.append(", ");
                    sb2.append(sb6.toString());
                }
                sb2.append("interactionInput=" + interactionTrigger);
                sb2.append(")");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public abstract void transitionConfigured$animation_core(Transition transition);

    public abstract void transitionRemoved$animation_core();

    @Override // com.google.android.gms.measurement.internal.zzjg
    public Trifle zzaV() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public zzgu zzaW() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public zzhz zzaX() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public Context zzaZ() {
        throw null;
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public DefaultClock zzba() {
        throw null;
    }

    public void zzg() {
        zzhz zzhzVar = ((zzic) this.$$delegate_0).zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
    }

    public InteractionResult(Pair[] pairArr) {
        this.$r8$classId = 5;
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(new Pair((CoroutineContext) pair.first, new CompositeSetupTeardown((Function0) pair.second)));
        }
        this.$$delegate_0 = arrayList;
    }

    public InteractionResult(int i) {
        this.$r8$classId = 6;
        this.$$delegate_0 = BaseDoubleCheckKt.newLinkedHashMapWithExpectedSize(i);
    }

    public InteractionResult(OkHttpCall.AnonymousClass1 anonymousClass1) {
        this.$r8$classId = 0;
        this.$$delegate_0 = anonymousClass1;
    }

    public InteractionResult(zzic zzicVar) {
        this.$r8$classId = 3;
        zzae.checkNotNull(zzicVar);
        this.$$delegate_0 = zzicVar;
    }
}
