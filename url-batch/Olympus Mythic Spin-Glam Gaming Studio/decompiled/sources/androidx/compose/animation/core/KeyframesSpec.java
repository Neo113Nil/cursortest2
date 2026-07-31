package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnimationSpec.kt */
@Immutable
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0019\u001aB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013\"\b\b\u0001\u0010\u0010*\u00020\u000f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec;", "T", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "config", "<init>", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/TwoWayConverter;", "converter", "Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "vectorize", "(Landroidx/compose/animation/core/TwoWayConverter;)Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "getConfig", "()Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "KeyframeEntity", "KeyframesSpecConfig", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class KeyframesSpec<T> implements DurationBasedAnimationSpec<T> {
    private final KeyframesSpecConfig config;

    public KeyframesSpec(KeyframesSpecConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007*\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\u00020\f*\b\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0086\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0019R,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "T", "", "<init>", "()V", "", "timeStamp", "Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", POBConstants.KEY_AT, "(Ljava/lang/Object;I)Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "Landroidx/compose/animation/core/Easing;", "easing", "", "with", "(Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;Landroidx/compose/animation/core/Easing;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "durationMillis", "I", "getDurationMillis", "setDurationMillis", "(I)V", "delayMillis", "getDelayMillis", "setDelayMillis", "", "keyframes", "Ljava/util/Map;", "getKeyframes$animation_core_release", "()Ljava/util/Map;", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class KeyframesSpecConfig<T> {
        private int delayMillis;
        private int durationMillis = 300;
        private final Map keyframes = new LinkedHashMap();

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final void setDurationMillis(int i) {
            this.durationMillis = i;
        }

        public final int getDelayMillis() {
            return this.delayMillis;
        }

        /* renamed from: getKeyframes$animation_core_release, reason: from getter */
        public final Map getKeyframes() {
            return this.keyframes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final KeyframeEntity at(Object obj, int i) {
            KeyframeEntity keyframeEntity = new KeyframeEntity(obj, null, 2, 0 == true ? 1 : 0);
            this.keyframes.put(Integer.valueOf(i), keyframeEntity);
            return keyframeEntity;
        }

        public final void with(KeyframeEntity keyframeEntity, Easing easing) {
            Intrinsics.checkNotNullParameter(keyframeEntity, "<this>");
            Intrinsics.checkNotNullParameter(easing, "easing");
            keyframeEntity.setEasing$animation_core_release(easing);
        }

        public boolean equals(Object other) {
            if (other instanceof KeyframesSpecConfig) {
                KeyframesSpecConfig keyframesSpecConfig = (KeyframesSpecConfig) other;
                if (this.delayMillis == keyframesSpecConfig.delayMillis && this.durationMillis == keyframesSpecConfig.durationMillis && Intrinsics.areEqual(this.keyframes, keyframesSpecConfig.keyframes)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.durationMillis * 31) + this.delayMillis) * 31) + this.keyframes.hashCode();
        }
    }

    public boolean equals(Object other) {
        return (other instanceof KeyframesSpec) && Intrinsics.areEqual(this.config, ((KeyframesSpec) other).config);
    }

    public int hashCode() {
        return this.config.hashCode();
    }

    @Override // androidx.compose.animation.core.DurationBasedAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public VectorizedKeyframesSpec vectorize(TwoWayConverter converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        Map keyframes = this.config.getKeyframes();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(keyframes.size()));
        for (Map.Entry entry : keyframes.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((KeyframeEntity) entry.getValue()).toPair$animation_core_release(converter.getConvertToVector()));
        }
        return new VectorizedKeyframesSpec(linkedHashMap, this.config.getDurationMillis(), this.config.getDelayMillis());
    }

    /* compiled from: AnimationSpec.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00040\f\"\b\b\u0002\u0010\t*\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00028\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Landroidx/compose/animation/core/KeyframesSpec$KeyframeEntity;", "T", "", "value", "Landroidx/compose/animation/core/Easing;", "easing", "<init>", "(Ljava/lang/Object;Landroidx/compose/animation/core/Easing;)V", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "Lkotlin/Pair;", "toPair$animation_core_release", "(Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", "toPair", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getValue$animation_core_release", "()Ljava/lang/Object;", "Landroidx/compose/animation/core/Easing;", "getEasing$animation_core_release", "()Landroidx/compose/animation/core/Easing;", "setEasing$animation_core_release", "(Landroidx/compose/animation/core/Easing;)V", "animation-core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class KeyframeEntity<T> {
        private Easing easing;
        private final Object value;

        public KeyframeEntity(Object obj, Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "easing");
            this.value = obj;
            this.easing = easing;
        }

        public /* synthetic */ KeyframeEntity(Object obj, Easing easing, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? EasingKt.getLinearEasing() : easing);
        }

        public final void setEasing$animation_core_release(Easing easing) {
            Intrinsics.checkNotNullParameter(easing, "<set-?>");
            this.easing = easing;
        }

        public final Pair toPair$animation_core_release(Function1 convertToVector) {
            Intrinsics.checkNotNullParameter(convertToVector, "convertToVector");
            return TuplesKt.to(convertToVector.invoke(this.value), this.easing);
        }

        public boolean equals(Object other) {
            if (other instanceof KeyframeEntity) {
                KeyframeEntity keyframeEntity = (KeyframeEntity) other;
                if (Intrinsics.areEqual(keyframeEntity.value, this.value) && Intrinsics.areEqual(keyframeEntity.easing, this.easing)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.value;
            return ((obj != null ? obj.hashCode() : 0) * 31) + this.easing.hashCode();
        }
    }
}
