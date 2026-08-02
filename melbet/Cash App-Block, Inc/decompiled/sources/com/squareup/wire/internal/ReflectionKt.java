package com.squareup.wire.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.material.ModalBottomSheetState$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import com.datadog.android.telemetry.model.TelemetryDebugEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.data.blockers.FlowStarter$$ExternalSyntheticLambda0;
import com.squareup.util.compose.ListsKt$$ExternalSyntheticLambda0;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import io.noties.markwon.MarkwonConfiguration;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public abstract class ReflectionKt {
    public static final RuntimeMessageAdapter createRuntimeMessageAdapter(Class cls, String str, Syntax syntax, ClassLoader classLoader) {
        Object failure;
        List<Pair> list;
        cls.getClass();
        syntax.getClass();
        int i = 0;
        try {
            Result.Companion companion = Result.Companion;
            failure = Class.forName(cls.getName().concat("$Builder"), false, cls.getClassLoader());
            failure.getClass();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Class<KotlinConstructorBuilder> cls2 = (Class) failure;
        if (cls2 == null) {
            cls2 = KotlinConstructorBuilder.class;
        }
        Class<KotlinConstructorBuilder> cls3 = cls2;
        ListsKt$$ExternalSyntheticLambda0 listsKt$$ExternalSyntheticLambda0 = new ListsKt$$ExternalSyntheticLambda0(26, cls3, cls);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        int length = declaredFields.length;
        int i2 = 0;
        while (i2 < length) {
            Field field = declaredFields[i2];
            WireField wireField = (WireField) field.getAnnotation(WireField.class);
            if (wireField != null) {
                linkedHashMap.put(Integer.valueOf(wireField.tag()), new FieldBinding(wireField, cls, field, cls3, classLoader));
            } else if (Intrinsics.areEqual(field.getType(), OneOf.class)) {
                Class<?> declaringClass = field.getDeclaringClass();
                String name = field.getName();
                name.getClass();
                String upperCase = name.concat("_keys").toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Field declaredField = declaringClass.getDeclaredField(upperCase);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                obj.getClass();
                Iterator it = ((Set) obj).iterator();
                if (it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
            } else {
                Class<?> type2 = field.getType();
                if (type2 == null) {
                    list = EmptyList.INSTANCE;
                } else {
                    Class<?>[] declaredClasses = type2.getDeclaredClasses();
                    declaredClasses.getClass();
                    ArrayList arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    for (int i3 = i; i3 < length2; i3++) {
                        Class<?> cls4 = declaredClasses[i3];
                        WireOneofField wireOneofField = (WireOneofField) cls4.getAnnotation(WireOneofField.class);
                        Pair pair = wireOneofField == null ? null : new Pair(wireOneofField, cls4);
                        if (pair != null) {
                            arrayList.add(pair);
                        }
                    }
                    list = arrayList;
                }
                for (Pair pair2 : list) {
                    WireOneofField wireOneofField2 = (WireOneofField) pair2.first;
                    int i4 = length;
                    Field field2 = field;
                    linkedHashMap.put(Integer.valueOf(wireOneofField2.tag()), new SealedOneOfBinding(field2, cls3, wireOneofField2, (Class) pair2.second, classLoader));
                    length = i4;
                    field = field2;
                    declaredFields = declaredFields;
                    i2 = i2;
                }
            }
            i2++;
            length = length;
            declaredFields = declaredFields;
            i = 0;
        }
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(cls);
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        orCreateKotlinClass.getClass();
        unmodifiableMap.getClass();
        syntax.getClass();
        MarkwonConfiguration markwonConfiguration = new MarkwonConfiguration();
        markwonConfiguration.theme = orCreateKotlinClass;
        markwonConfiguration.syntaxHighlight = listsKt$$ExternalSyntheticLambda0;
        markwonConfiguration.linkResolver = unmodifiableMap;
        markwonConfiguration.imageDestinationProcessor = str;
        markwonConfiguration.spansFactory = syntax;
        return new RuntimeMessageAdapter(markwonConfiguration);
    }

    public static /* synthetic */ RuntimeMessageAdapter createRuntimeMessageAdapter$default(Class cls, String str, Syntax syntax, ClassLoader classLoader, int i) {
        if ((i & 8) != 0) {
            classLoader = cls.getClassLoader();
        }
        return createRuntimeMessageAdapter(cls, str, syntax, classLoader);
    }

    public static TelemetryDebugEvent.Application fromJsonObject(JsonObject jsonObject) {
        try {
            String asString = jsonObject.get("id").getAsString();
            asString.getClass();
            return new TelemetryDebugEvent.Application(asString);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static final AnchoredDraggableState rememberAnchoredDraggableState(Enum r7, DefaultDraggableAnchors defaultDraggableAnchors, Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new FlowStarter$$ExternalSyntheticLambda0(3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Function1 function1 = (Function1) rememberedValue;
        SpringSpec springSpec = new SpringSpec(null, 7);
        DecayAnimationSpecImpl exponentialDecay$default = AnimatableKt.exponentialDecay$default();
        GapComposer gapComposer2 = (GapComposer) composer;
        Object rememberedValue2 = gapComposer2.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new BorderKt$$ExternalSyntheticLambda1(18);
            gapComposer2.updateRememberedValue(rememberedValue2);
        }
        Function1 function12 = (Function1) rememberedValue2;
        GapComposer gapComposer3 = (GapComposer) composer;
        Density density = (Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity);
        Object rememberedValue3 = gapComposer3.rememberedValue();
        Object obj = rememberedValue3;
        if (rememberedValue3 == neverEqualPolicy) {
            ModalBottomSheetState$$ExternalSyntheticLambda1 modalBottomSheetState$$ExternalSyntheticLambda1 = new ModalBottomSheetState$$ExternalSyntheticLambda1(density, 2);
            AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(function12, r7);
            anchoredDraggableState.anchors$delegate.setValue(defaultDraggableAnchors);
            anchoredDraggableState.trySnapTo(r7);
            anchoredDraggableState.positionalThreshold = function1;
            anchoredDraggableState.velocityThreshold = modalBottomSheetState$$ExternalSyntheticLambda1;
            anchoredDraggableState.snapAnimationSpec = springSpec;
            anchoredDraggableState.decayAnimationSpec = exponentialDecay$default;
            gapComposer3.updateRememberedValue(anchoredDraggableState);
            obj = anchoredDraggableState;
        }
        return (AnchoredDraggableState) obj;
    }

    public static final RuntimeMessageAdapter createRuntimeMessageAdapter(Class cls, ClassLoader classLoader) {
        cls.getClass();
        ProtoAdapter.Companion.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.Companion.get(cls);
        return createRuntimeMessageAdapter(cls, protoAdapter.getTypeUrl(), protoAdapter.getSyntax(), classLoader);
    }
}
