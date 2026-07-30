package com.chicken.road.cerman.fixs;

import android.app.Application;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwnerKt;
import com.chicken.road.cerman.fixs.roost.RoostGate;
import com.chicken.road.cerman.fixs.roost.RoostRoute;
import com.chicken.road.cerman.fixs.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u008e\u0002"}, d2 = {"Lcom/chicken/road/cerman/fixs/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release", "route", "Lcom/chicken/road/cerman/fixs/roost/RoostRoute;", "minHoldDone", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 0;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        MainActivity mainActivity = this;
        EdgeToEdge.enable$default(mainActivity, null, null, 3, null);
        super.onCreate(savedInstanceState);
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        RoostGate roostGate = new RoostGate(application);
        final MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RoostRoute.Pending.INSTANCE, null, 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MainActivity$onCreate$1(roostGate, mutableStateOf$default, null), 3, null);
        ComponentActivityKt.setContent$default(mainActivity, null, ComposableLambdaKt.composableLambdaInstance(-1188708568, true, new Function2<Composer, Integer, Unit>() { // from class: com.chicken.road.cerman.fixs.MainActivity$onCreate$2

            /* compiled from: MainActivity.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: com.chicken.road.cerman.fixs.MainActivity$onCreate$2$1, reason: invalid class name */
            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ MutableState<RoostRoute> $route$delegate;
                final /* synthetic */ MainActivity this$0;

                AnonymousClass1(MainActivity mainActivity, MutableState<RoostRoute> mutableState) {
                    this.this$0 = mainActivity;
                    this.$route$delegate = mutableState;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                private static final boolean invoke$lambda$1(MutableState<Boolean> mutableState) {
                    return mutableState.getValue().booleanValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void invoke$lambda$2(MutableState<Boolean> mutableState, boolean z) {
                    mutableState.setValue(Boolean.valueOf(z));
                }

                public final void invoke(Composer composer, int i) {
                    RoostRoute onCreate$lambda$0;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-763378737, i, -1, "com.chicken.road.cerman.fixs.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:63)");
                    }
                    composer.startReplaceGroup(1775475405);
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    MutableState mutableState = (MutableState) rememberedValue;
                    composer.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    composer.startReplaceGroup(1775477766);
                    Object rememberedValue2 = composer.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (Function2) new MainActivity$onCreate$2$1$1$1(mutableState, null);
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    composer.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 6);
                    onCreate$lambda$0 = MainActivity.onCreate$lambda$0(this.$route$delegate);
                    if (!invoke$lambda$1(mutableState) || (onCreate$lambda$0 instanceof RoostRoute.Pending)) {
                        composer.startReplaceGroup(-794571776);
                        MainActivityKt.SplashOverlay(composer, 0);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-794495051);
                        if (onCreate$lambda$0 instanceof RoostRoute.Page) {
                            composer.startReplaceGroup(1775487948);
                            composer.startReplaceGroup(1775488692);
                            boolean changed = composer.changed(this.this$0) | composer.changedInstance(onCreate$lambda$0);
                            MainActivity mainActivity = this.this$0;
                            Object rememberedValue3 = composer.rememberedValue();
                            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = (Function2) new MainActivity$onCreate$2$1$2$1(mainActivity, onCreate$lambda$0, null);
                                composer.updateRememberedValue(rememberedValue3);
                            }
                            composer.endReplaceGroup();
                            EffectsKt.LaunchedEffect(onCreate$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, composer, 0);
                            composer.endReplaceGroup();
                        } else if (Intrinsics.areEqual(onCreate$lambda$0, RoostRoute.Home.INSTANCE)) {
                            composer.startReplaceGroup(1775495432);
                            SurfaceKt.m2223SurfaceT9BRK9s(BackgroundKt.m236backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), null, 2, null), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableSingletons$MainActivityKt.INSTANCE.m6645getLambda1$app_release(), composer, 12582912, 122);
                            composer.endReplaceGroup();
                        } else {
                            if (!Intrinsics.areEqual(onCreate$lambda$0, RoostRoute.Pending.INSTANCE)) {
                                composer.startReplaceGroup(1775486445);
                                composer.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer.startReplaceGroup(1775503663);
                            composer.endReplaceGroup();
                        }
                        composer.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1188708568, i, -1, "com.chicken.road.cerman.fixs.MainActivity.onCreate.<anonymous> (MainActivity.kt:62)");
                    }
                    ThemeKt.BroilerTheme(ComposableLambdaKt.rememberComposableLambda(-763378737, true, new AnonymousClass1(MainActivity.this, mutableStateOf$default), composer, 54), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RoostRoute onCreate$lambda$0(MutableState<RoostRoute> mutableState) {
        return mutableState.getValue();
    }
}
