package expo.modules.updates;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.tracing.Trace;
import expo.modules.kotlin.KClassExtensionsKt;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.Queues;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SuspendFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.updates.UpdatesModule;
import expo.modules.updates.events.IUpdatesEventManagerObserver;
import expo.modules.updates.logging.UpdatesErrorCode;
import expo.modules.updates.logging.UpdatesLogReader;
import expo.modules.updates.logging.UpdatesLogger;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import expo.modules.updates.statemachine.UpdatesStateContext;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClasses;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: UpdatesModule.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0002\u0012\u0013B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0011H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lexpo/modules/updates/UpdatesModule;", "Lexpo/modules/kotlin/modules/Module;", "Lexpo/modules/updates/events/IUpdatesEventManagerObserver;", "<init>", "()V", "logger", "Lexpo/modules/updates/logging/UpdatesLogger;", "getLogger", "()Lexpo/modules/updates/logging/UpdatesLogger;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "onStateMachineContextEvent", "", "Lexpo/modules/updates/statemachine/UpdatesStateContext;", "Companion", "UpdatesConfigurationOverrideParam", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpdatesModule extends Module implements IUpdatesEventManagerObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "UpdatesModule";

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdatesLogger getLogger() {
        File filesDir = getContext().getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        return new UpdatesLogger(filesDir);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        ArrayList arrayList;
        UntypedAsyncFunctionComponent untypedAsyncFunctionComponent;
        AsyncFunctionWithPromiseComponent asyncFunctionWithPromiseComponent;
        List<KParameter> parameters;
        Object obj;
        UpdatesModule updatesModule = this;
        Trace.beginSection("[ExpoModulesCore] " + (updatesModule.getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(updatesModule);
            moduleDefinitionBuilder.Name("ExpoUpdates");
            ModuleDefinitionBuilder moduleDefinitionBuilder2 = moduleDefinitionBuilder;
            KFunction fastPrimaryConstructor = KClassExtensionsKt.getFastPrimaryConstructor(Reflection.getOrCreateKotlinClass(UpdatesJSEvent.class));
            if (fastPrimaryConstructor != null && (parameters = fastPrimaryConstructor.getParameters()) != null && parameters.size() == 1) {
                String name = ((KParameter) CollectionsKt.first((List) fastPrimaryConstructor.getParameters())).getName();
                Iterator it = KClasses.getDeclaredMemberProperties(Reflection.getOrCreateKotlinClass(UpdatesJSEvent.class)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((KProperty1) obj).getName(), name)) {
                        break;
                    }
                }
                KProperty1 kProperty1 = (KProperty1) obj;
                if (kProperty1 == null) {
                    throw new IllegalArgumentException(("Cannot find a property for " + name + " parameter").toString());
                }
                if (!Intrinsics.areEqual(kProperty1.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(String.class))) {
                    throw new IllegalArgumentException("The enum parameter has to be a string.".toString());
                }
                UpdatesJSEvent[] values = UpdatesJSEvent.values();
                ArrayList arrayList2 = new ArrayList(values.length);
                for (UpdatesJSEvent updatesJSEvent : values) {
                    Object obj2 = kProperty1.get(updatesJSEvent);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    arrayList2.add((String) obj2);
                }
                arrayList = arrayList2;
            } else {
                UpdatesJSEvent[] values2 = UpdatesJSEvent.values();
                ArrayList arrayList3 = new ArrayList(values2.length);
                for (UpdatesJSEvent updatesJSEvent2 : values2) {
                    arrayList3.add(updatesJSEvent2.name());
                }
                arrayList = arrayList3;
            }
            moduleDefinitionBuilder2.setEventsDefinition(new EventsDefinition((String[]) arrayList.toArray(new String[0])));
            moduleDefinitionBuilder.Constants(new Function0<Map<String, ? extends Object>>() { // from class: expo.modules.updates.UpdatesModule$definition$1$1
                @Override // kotlin.jvm.functions.Function0
                public final Map<String, ? extends Object> invoke() {
                    Context context;
                    context = UpdatesModule.this.getContext();
                    File filesDir = context.getFilesDir();
                    Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
                    new UpdatesLogger(filesDir).info("UpdatesModule: getConstants called", UpdatesErrorCode.None);
                    return UpdatesController.getInstance().getConstantsForModule().toModuleConstantsMap();
                }
            });
            moduleDefinitionBuilder.OnStartObserving(UpdatesJSEvent.StateChange, new Function0<Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$1$2
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    UpdatesController.INSTANCE.setUpdatesEventManagerObserver$expo_updates_release(new WeakReference<>(UpdatesModule.this));
                }
            });
            moduleDefinitionBuilder.OnStopObserving(UpdatesJSEvent.StateChange, new Function0<Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$1$3
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    UpdatesController.INSTANCE.removeUpdatesEventManagerObserver$expo_updates_release();
                }
            });
            moduleDefinitionBuilder.getEventListeners().put(EventName.MODULE_DESTROY, new BasicEventListener(EventName.MODULE_DESTROY, new Function0<Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$OnDestroy$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    UpdatesController.INSTANCE.removeUpdatesEventManagerObserver$expo_updates_release();
                }
            }));
            AsyncFunctionBuilder AsyncFunction = moduleDefinitionBuilder.AsyncFunction("reload");
            String name2 = AsyncFunction.getName();
            TypeConverterProvider converters = AsyncFunction.getConverters();
            AnyType[] anyTypeArr = new AnyType[1];
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReloadScreenOptions.class), true));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ReloadScreenOptions.class), true, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(ReloadScreenOptions.class);
                    }
                }), converters);
            }
            anyTypeArr[0] = anyType;
            AsyncFunction.setAsyncFunctionComponent(new SuspendFunctionComponent(name2, anyTypeArr, new UpdatesModule$definition$lambda$18$$inlined$Coroutine$2(null)));
            AsyncFunctionBuilder AsyncFunction2 = moduleDefinitionBuilder.AsyncFunction("checkForUpdateAsync");
            SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(AsyncFunction2.getName(), new AnyType[0], new UpdatesModule$definition$lambda$18$$inlined$Coroutine$3(null));
            AsyncFunction2.setAsyncFunctionComponent(suspendFunctionComponent);
            SuspendFunctionComponent suspendFunctionComponent2 = suspendFunctionComponent;
            AsyncFunctionBuilder AsyncFunction3 = moduleDefinitionBuilder.AsyncFunction("fetchUpdateAsync");
            SuspendFunctionComponent suspendFunctionComponent3 = new SuspendFunctionComponent(AsyncFunction3.getName(), new AnyType[0], new UpdatesModule$definition$lambda$18$$inlined$Coroutine$4(null));
            AsyncFunction3.setAsyncFunctionComponent(suspendFunctionComponent3);
            SuspendFunctionComponent suspendFunctionComponent4 = suspendFunctionComponent3;
            AsyncFunctionBuilder AsyncFunction4 = moduleDefinitionBuilder.AsyncFunction("getExtraParamsAsync");
            SuspendFunctionComponent suspendFunctionComponent5 = new SuspendFunctionComponent(AsyncFunction4.getName(), new AnyType[0], new UpdatesModule$definition$lambda$18$$inlined$Coroutine$5(null, this));
            AsyncFunction4.setAsyncFunctionComponent(suspendFunctionComponent5);
            SuspendFunctionComponent suspendFunctionComponent6 = suspendFunctionComponent5;
            AsyncFunctionBuilder AsyncFunction5 = moduleDefinitionBuilder.AsyncFunction("setExtraParamAsync");
            String name3 = AsyncFunction5.getName();
            TypeConverterProvider converters2 = AsyncFunction5.getConverters();
            AnyType[] anyTypeArr2 = new AnyType[2];
            AnyType anyType2 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), false));
            if (anyType2 == null) {
                anyType2 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), false, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$6
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(String.class);
                    }
                }), converters2);
            }
            anyTypeArr2[0] = anyType2;
            AnyType anyType3 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(String.class), true));
            if (anyType3 == null) {
                anyType3 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(String.class), true, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$7
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(String.class);
                    }
                }), converters2);
            }
            anyTypeArr2[1] = anyType3;
            AsyncFunction5.setAsyncFunctionComponent(new SuspendFunctionComponent(name3, anyTypeArr2, new UpdatesModule$definition$lambda$18$$inlined$Coroutine$8(null, this)));
            AsyncFunctionBuilder AsyncFunction6 = moduleDefinitionBuilder.AsyncFunction("readLogEntriesAsync");
            String name4 = AsyncFunction6.getName();
            TypeConverterProvider converters3 = AsyncFunction6.getConverters();
            AnyType[] anyTypeArr3 = new AnyType[1];
            AnyType anyType4 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Long.class), false));
            if (anyType4 == null) {
                anyType4 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Long.class), false, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Coroutine$9
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.typeOf(Long.TYPE);
                    }
                }), converters3);
            }
            anyTypeArr3[0] = anyType4;
            AsyncFunction6.setAsyncFunctionComponent(new SuspendFunctionComponent(name4, anyTypeArr3, new UpdatesModule$definition$lambda$18$$inlined$Coroutine$10(null, this)));
            AsyncFunctionBuilder AsyncFunction7 = moduleDefinitionBuilder.AsyncFunction("clearLogEntriesAsync");
            SuspendFunctionComponent suspendFunctionComponent7 = new SuspendFunctionComponent(AsyncFunction7.getName(), new AnyType[0], new UpdatesModule$definition$lambda$18$$inlined$Coroutine$11(null, this));
            AsyncFunction7.setAsyncFunctionComponent(suspendFunctionComponent7);
            SuspendFunctionComponent suspendFunctionComponent8 = suspendFunctionComponent7;
            ModuleDefinitionBuilder moduleDefinitionBuilder3 = moduleDefinitionBuilder;
            TypeConverterProvider converters4 = moduleDefinitionBuilder3.getConverters();
            AnyType[] anyTypeArr4 = new AnyType[1];
            AnyType anyType5 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(UpdatesConfigurationOverrideParam.class), true));
            if (anyType5 == null) {
                anyType5 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(UpdatesConfigurationOverrideParam.class), true, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Function$1
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(UpdatesModule.UpdatesConfigurationOverrideParam.class);
                    }
                }), converters4);
            }
            anyTypeArr4[0] = anyType5;
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(Reflection.getOrCreateKotlinClass(Unit.class));
            if (returnType == null) {
                returnType = new ReturnType(Reflection.getOrCreateKotlinClass(Unit.class));
                returnTypeProvider.getTypes().put(Reflection.getOrCreateKotlinClass(Unit.class), returnType);
            }
            moduleDefinitionBuilder3.getSyncFunctions().put("setUpdateURLAndRequestHeadersOverride", new SyncFunctionComponent("setUpdateURLAndRequestHeadersOverride", anyTypeArr4, returnType, new Function1<Object[], Object>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Function$2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    UpdatesModule.UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam = (UpdatesModule.UpdatesConfigurationOverrideParam) objArr[0];
                    UpdatesController.getInstance().setUpdateURLAndRequestHeadersOverride(updatesConfigurationOverrideParam != null ? updatesConfigurationOverrideParam.toUpdatesConfigurationOverride() : null);
                    return Unit.INSTANCE;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder4 = moduleDefinitionBuilder;
            TypeConverterProvider converters5 = moduleDefinitionBuilder4.getConverters();
            AnyType[] anyTypeArr5 = new AnyType[1];
            AnyType anyType6 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(Map.class), true));
            if (anyType6 == null) {
                anyType6 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(Map.class), true, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Function$3
                    @Override // kotlin.jvm.functions.Function0
                    public final KType invoke() {
                        return Reflection.nullableTypeOf(Map.class, KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)), KTypeProjection.INSTANCE.invariant(Reflection.typeOf(String.class)));
                    }
                }), converters5);
            }
            anyTypeArr5[0] = anyType6;
            ReturnTypeProvider returnTypeProvider2 = ReturnTypeProvider.INSTANCE;
            ReturnType returnType2 = returnTypeProvider2.getTypes().get(Reflection.getOrCreateKotlinClass(Unit.class));
            if (returnType2 == null) {
                returnType2 = new ReturnType(Reflection.getOrCreateKotlinClass(Unit.class));
                returnTypeProvider2.getTypes().put(Reflection.getOrCreateKotlinClass(Unit.class), returnType2);
            }
            moduleDefinitionBuilder4.getSyncFunctions().put("setUpdateRequestHeadersOverride", new SyncFunctionComponent("setUpdateRequestHeadersOverride", anyTypeArr5, returnType2, new Function1<Object[], Object>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$Function$4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] objArr) {
                    Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                    UpdatesController.getInstance().setUpdateRequestHeadersOverride((Map) objArr[0]);
                    return Unit.INSTANCE;
                }
            }));
            ModuleDefinitionBuilder moduleDefinitionBuilder5 = moduleDefinitionBuilder;
            if (Intrinsics.areEqual(ReloadScreenOptions.class, Promise.class)) {
                asyncFunctionWithPromiseComponent = new AsyncFunctionWithPromiseComponent("showReloadScreen", new AnyType[0], new Function2<Object[], Promise, Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$AsyncFunction$1
                    /* JADX WARN: Multi-variable type inference failed */
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Object[] objArr, Promise promise) {
                        Intrinsics.checkNotNullParameter(objArr, "<unused var>");
                        Intrinsics.checkNotNullParameter(promise, "promise");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Object[] objArr, Promise promise) {
                        invoke2(objArr, promise);
                        return Unit.INSTANCE;
                    }
                });
            } else {
                TypeConverterProvider converters6 = moduleDefinitionBuilder5.getConverters();
                AnyType[] anyTypeArr6 = new AnyType[1];
                AnyType anyType7 = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(Reflection.getOrCreateKotlinClass(ReloadScreenOptions.class), true));
                if (anyType7 == null) {
                    anyType7 = new AnyType(new LazyKType(Reflection.getOrCreateKotlinClass(ReloadScreenOptions.class), true, new Function0<KType>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$AsyncFunction$2
                        @Override // kotlin.jvm.functions.Function0
                        public final KType invoke() {
                            return Reflection.nullableTypeOf(ReloadScreenOptions.class);
                        }
                    }), converters6);
                }
                anyTypeArr6[0] = anyType7;
                Function1<Object[], Unit> function1 = new Function1<Object[], Unit>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$AsyncFunction$3
                    @Override // kotlin.jvm.functions.Function1
                    public final Unit invoke(Object[] objArr) {
                        Intrinsics.checkNotNullParameter(objArr, "<destruct>");
                        return Unit.INSTANCE;
                    }
                };
                if (!Intrinsics.areEqual(Unit.class, Integer.TYPE)) {
                    if (!Intrinsics.areEqual(Unit.class, Boolean.TYPE)) {
                        if (!Intrinsics.areEqual(Unit.class, Double.TYPE)) {
                            if (!Intrinsics.areEqual(Unit.class, Float.TYPE)) {
                                if (Intrinsics.areEqual(Unit.class, String.class)) {
                                    untypedAsyncFunctionComponent = new StringAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                                } else {
                                    untypedAsyncFunctionComponent = new UntypedAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                                }
                            } else {
                                untypedAsyncFunctionComponent = new FloatAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                            }
                        } else {
                            untypedAsyncFunctionComponent = new DoubleAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                        }
                    } else {
                        untypedAsyncFunctionComponent = new BoolAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                    }
                } else {
                    untypedAsyncFunctionComponent = new IntAsyncFunctionComponent("showReloadScreen", anyTypeArr6, function1);
                }
                asyncFunctionWithPromiseComponent = untypedAsyncFunctionComponent;
            }
            moduleDefinitionBuilder5.getAsyncFunctions().put("showReloadScreen", asyncFunctionWithPromiseComponent);
            asyncFunctionWithPromiseComponent.runOnQueue(Queues.MAIN);
            UntypedAsyncFunctionComponent untypedAsyncFunctionComponent2 = new UntypedAsyncFunctionComponent("hideReloadScreen", new AnyType[0], new Function1<Object[], Object>() { // from class: expo.modules.updates.UpdatesModule$definition$lambda$18$$inlined$AsyncFunctionWithoutArgs$1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object[] it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Unit.INSTANCE;
                }
            });
            moduleDefinitionBuilder.getAsyncFunctions().put("hideReloadScreen", untypedAsyncFunctionComponent2);
            untypedAsyncFunctionComponent2.runOnQueue(Queues.MAIN);
            return moduleDefinitionBuilder.buildModule();
        } finally {
            Trace.endSection();
        }
    }

    /* compiled from: UpdatesModule.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2)\u0010\u0012\u001a%\u0012\u001b\u0012\u0019\u0018\u00010\u0014j\u0004\u0018\u0001`\u0018¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00110\u0013H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lexpo/modules/updates/UpdatesModule$Companion;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "readLogEntries", "", "Landroid/os/Bundle;", "filesDirectory", "Ljava/io/File;", "maxAge", "", "readLogEntries$expo_updates_release", "(Ljava/io/File;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearLogEntries", "", "completionHandler", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/ParameterName;", "name", "_", "Lkotlin/Exception;", "clearLogEntries$expo_updates_release", "(Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Object readLogEntries$expo_updates_release(File file, long j, Continuation<? super List<Bundle>> continuation) {
            return BuildersKt.withContext(Dispatchers.getIO(), new UpdatesModule$Companion$readLogEntries$2(file, j, null), continuation);
        }

        public final Object clearLogEntries$expo_updates_release(File file, Function1<? super Exception, Unit> function1, Continuation<? super Unit> continuation) {
            new UpdatesLogReader(file).purgeLogEntries(new Date(), function1);
            return Unit.INSTANCE;
        }
    }

    @Override // expo.modules.updates.events.IUpdatesEventManagerObserver
    public void onStateMachineContextEvent(UpdatesStateContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        UpdatesJSEvent updatesJSEvent = UpdatesJSEvent.StateChange;
        Bundle bundle = new Bundle();
        bundle.putBundle("context", context.getBundle());
        Unit unit = Unit.INSTANCE;
        sendEvent(updatesJSEvent, bundle);
    }

    /* compiled from: UpdatesModule.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lexpo/modules/updates/UpdatesModule$UpdatesConfigurationOverrideParam;", "Lexpo/modules/kotlin/records/Record;", UpdatesConfiguration.UPDATES_CONFIGURATION_UPDATE_URL_KEY, "Landroid/net/Uri;", UpdatesConfiguration.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY, "", "", "<init>", "(Landroid/net/Uri;Ljava/util/Map;)V", "getUpdateUrl$annotations", "()V", "getUpdateUrl", "()Landroid/net/Uri;", "getRequestHeaders$annotations", "getRequestHeaders", "()Ljava/util/Map;", "toUpdatesConfigurationOverride", "Lexpo/modules/updates/UpdatesConfigurationOverride;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatesConfigurationOverrideParam implements Record {
        private final Map<String, String> requestHeaders;
        private final Uri updateUrl;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UpdatesConfigurationOverrideParam copy$default(UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam, Uri uri, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = updatesConfigurationOverrideParam.updateUrl;
            }
            if ((i & 2) != 0) {
                map = updatesConfigurationOverrideParam.requestHeaders;
            }
            return updatesConfigurationOverrideParam.copy(uri, map);
        }

        @Field
        public static /* synthetic */ void getRequestHeaders$annotations() {
        }

        @Field
        public static /* synthetic */ void getUpdateUrl$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUpdateUrl() {
            return this.updateUrl;
        }

        public final Map<String, String> component2() {
            return this.requestHeaders;
        }

        public final UpdatesConfigurationOverrideParam copy(Uri updateUrl, Map<String, String> requestHeaders) {
            Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            return new UpdatesConfigurationOverrideParam(updateUrl, requestHeaders);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdatesConfigurationOverrideParam)) {
                return false;
            }
            UpdatesConfigurationOverrideParam updatesConfigurationOverrideParam = (UpdatesConfigurationOverrideParam) other;
            return Intrinsics.areEqual(this.updateUrl, updatesConfigurationOverrideParam.updateUrl) && Intrinsics.areEqual(this.requestHeaders, updatesConfigurationOverrideParam.requestHeaders);
        }

        public int hashCode() {
            return (this.updateUrl.hashCode() * 31) + this.requestHeaders.hashCode();
        }

        public String toString() {
            return "UpdatesConfigurationOverrideParam(updateUrl=" + this.updateUrl + ", requestHeaders=" + this.requestHeaders + ")";
        }

        public UpdatesConfigurationOverrideParam(Uri updateUrl, Map<String, String> requestHeaders) {
            Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.updateUrl = updateUrl;
            this.requestHeaders = requestHeaders;
        }

        public final Uri getUpdateUrl() {
            return this.updateUrl;
        }

        public final Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public final UpdatesConfigurationOverride toUpdatesConfigurationOverride() {
            return new UpdatesConfigurationOverride(this.updateUrl, this.requestHeaders);
        }
    }
}
