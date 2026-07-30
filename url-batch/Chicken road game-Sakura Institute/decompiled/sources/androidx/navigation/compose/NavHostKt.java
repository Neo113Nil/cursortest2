package androidx.navigation.compose;

import androidx.activity.compose.PredictiveBackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.core.app.NotificationCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aó\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0018\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0019\u001a»\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010$\u001a\u0098\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010&\u001aÚ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00112\u001f\b\u0002\u0010\u0015\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010'\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020%2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010%2\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010(\u001a¿\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u001d\b\u0002\u0010\u001e\u001a\u0017\u0012\u0004\u0012\u00020 \u0012\r\u0012\u000b\u0012\u0002\b\u00030!¢\u0006\u0002\b\u00100\u001f2$\b\u0002\u0010\u000b\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0012\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0014\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112$\b\u0002\u0010\u0015\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00130\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112(\b\u0002\u0010\u0016\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\f¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\u0017\u0010\"\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010)\u001a\u001c\u0010*\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010-\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010.\u001a\u0004\u0018\u00010\u000f*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010/\u001a\u0004\u0018\u00010\u0013*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u00100\u001a\u0004\u0018\u00010\u0017*\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u00061²\u0006\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\u0010\u00108\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u000e03X\u008a\u0084\u0002"}, d2 = {"NavHost", "", "navController", "Landroidx/navigation/NavHostController;", "graph", "Landroidx/navigation/NavGraph;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "enterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "startDestination", "", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "builder", "Landroidx/navigation/NavGraphBuilder;", "(Landroidx/navigation/NavHostController;Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Lkotlin/reflect/KClass;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "createEnterTransition", "Landroidx/navigation/NavDestination;", "scope", "createExitTransition", "createPopEnterTransition", "createPopExitTransition", "createSizeTransform", "navigation-compose_release", "currentBackStack", "", NotificationCompat.CATEGORY_PROGRESS, "", "inPredictiveBack", "", "allVisibleEntries", "visibleEntries"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final String str, Modifier modifier, String str2, final Function1 function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        String str4;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier3;
        final String str5;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(2,4,1,3)93@3780L126,91@3740L190:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function1) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    str4 = i4 != 0 ? null : str3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(141827520, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:90)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652764344, "CC(remember):NavHost.kt#9igjgp");
                    z = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
                        function1.invoke(navGraphBuilder);
                        rememberedValue = navGraphBuilder.build();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    String str6 = str4;
                    composer2 = startRestartGroup;
                    NavHost(navHostController, (NavGraph) rememberedValue, modifier4, null, null, null, null, null, null, startRestartGroup, i3 & 910, 504);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    str5 = str6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str5 = str3;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            NavHostKt.NavHost(NavHostController.this, str, modifier3, str5, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str2;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652764344, "CC(remember):NavHost.kt#9igjgp");
            z = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
            function1.invoke(navGraphBuilder2);
            rememberedValue = navGraphBuilder2.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            String str62 = str4;
            composer2 = startRestartGroup;
            NavHost(navHostController, (NavGraph) rememberedValue, modifier4, null, null, null, null, null, null, startRestartGroup, i3 & 910, 504);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            str5 = str62;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str3 = str2;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652764344, "CC(remember):NavHost.kt#9igjgp");
        z = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((57344 & i3) == 16384);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        NavGraphBuilder navGraphBuilder22 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str4);
        function1.invoke(navGraphBuilder22);
        rememberedValue = navGraphBuilder22.build();
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        String str622 = str4;
        composer2 = startRestartGroup;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier4, null, null, null, null, null, null, startRestartGroup, i3 & 910, 504);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        str5 = str622;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1 function1, Function1 function12, Function1 function13, Function1 function14, final Function1 function15, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Alignment alignment2;
        int i5;
        String str3;
        int i6;
        int i7;
        Function1 function16;
        int i8;
        Function1 function17;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        Modifier modifier3;
        Alignment alignment3;
        Function1 function111;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Alignment alignment4;
        final String str4;
        final Function1 function112;
        final Function1 function113;
        final Function1 function114;
        final Function1 function115;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(410432995);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,9,4,1,8,2,3,6,7)145@6005L126,143@5965L320:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    str3 = str2;
                    i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        function16 = function12;
                    } else {
                        function16 = function12;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function16) ? 1048576 : 524288;
                        }
                    }
                    if ((i & 12582912) == 0) {
                        if ((i2 & 128) == 0 && startRestartGroup.changedInstance(function13)) {
                            i10 = 8388608;
                            i3 |= i10;
                        }
                        i10 = 4194304;
                        i3 |= i10;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i2 & 256) == 0 && startRestartGroup.changedInstance(function14)) {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i3 |= i9;
                        }
                        i9 = 33554432;
                        i3 |= i9;
                    }
                    if ((i2 & 512) == 0) {
                        i3 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i3 |= startRestartGroup.changedInstance(function15) ? 536870912 : 268435456;
                    }
                    if ((306783379 & i3) == 306783378 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            if (i11 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                alignment2 = Alignment.INSTANCE.getTopStart();
                            }
                            if (i5 != 0) {
                                str3 = null;
                            }
                            NavHostKt$NavHost$3 navHostKt$NavHost$3 = i6 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$3
                                @Override // kotlin.jvm.functions.Function1
                                public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function1;
                            if (i7 != 0) {
                                function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                        return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                    }
                                };
                            }
                            if ((i2 & 128) == 0) {
                                i8 = i3 & (-29360129);
                                function17 = navHostKt$NavHost$3;
                            } else {
                                i8 = i3;
                                function17 = function13;
                            }
                            if ((i2 & 256) == 0) {
                                function19 = navHostKt$NavHost$3;
                                function110 = function17;
                                i3 = i8 & (-234881025);
                                modifier3 = modifier2;
                                alignment3 = alignment2;
                                function111 = function16;
                                function18 = function111;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(410432995, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:142)");
                                }
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652835544, "CC(remember):NavHost.kt#9igjgp");
                                z = ((i3 & 57344) != 16384) | ((i3 & 112) != 32) | ((1879048192 & i3) == 536870912);
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
                                    function15.invoke(navGraphBuilder);
                                    rememberedValue = navGraphBuilder.build();
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                NavGraph navGraph = (NavGraph) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                int i12 = i3 & 8078;
                                int i13 = i3 >> 3;
                                String str5 = str3;
                                composer2 = startRestartGroup;
                                NavHost(navHostController, navGraph, modifier3, alignment3, function19, function111, function110, function18, null, startRestartGroup, (57344 & i13) | i12 | (458752 & i13) | (3670016 & i13) | (i13 & 29360128), 256);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                alignment4 = alignment3;
                                str4 = str5;
                                function112 = function19;
                                function113 = function111;
                                function114 = function110;
                                function115 = function18;
                            } else {
                                function18 = function14;
                                function19 = navHostKt$NavHost$3;
                                function110 = function17;
                                i3 = i8;
                            }
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i2 & 128) != 0) {
                                i3 &= -29360129;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                            }
                            function19 = function1;
                            function110 = function13;
                            function18 = function14;
                        }
                        modifier3 = modifier2;
                        alignment3 = alignment2;
                        function111 = function16;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652835544, "CC(remember):NavHost.kt#9igjgp");
                        z = ((i3 & 57344) != 16384) | ((i3 & 112) != 32) | ((1879048192 & i3) == 536870912);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z) {
                        }
                        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
                        function15.invoke(navGraphBuilder2);
                        rememberedValue = navGraphBuilder2.build();
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        NavGraph navGraph2 = (NavGraph) rememberedValue;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i122 = i3 & 8078;
                        int i132 = i3 >> 3;
                        String str52 = str3;
                        composer2 = startRestartGroup;
                        NavHost(navHostController, navGraph2, modifier3, alignment3, function19, function111, function110, function18, null, startRestartGroup, (57344 & i132) | i122 | (458752 & i132) | (3670016 & i132) | (i132 & 29360128), 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        str4 = str52;
                        function112 = function19;
                        function113 = function111;
                        function114 = function110;
                        function115 = function18;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        function113 = function16;
                        str4 = str3;
                        composer2 = startRestartGroup;
                        function112 = function1;
                        function114 = function13;
                        function115 = function14;
                    }
                    ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i14) {
                                NavHostKt.NavHost(NavHostController.this, str, modifier4, alignment4, str4, function112, function113, function114, function115, function15, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                str3 = str2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((306783379 & i3) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i2 & 256) == 0) {
                }
            }
            alignment2 = alignment;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str3 = str2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((306783379 & i3) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i2 & 256) == 0) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        alignment2 = alignment;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str3 = str2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((306783379 & i3) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i2 & 256) == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final String str, Modifier modifier, Alignment alignment, String str2, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function17;
        int i12;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function18;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function19;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function110;
        Modifier modifier3;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function112;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function113;
        String str3;
        boolean z;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Alignment alignment4;
        final String str4;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function114;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function116;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function117;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function118;
        ScopeUpdateScope endRestartGroup;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1840250294);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,10,4,1,8,2,3,6,7,9)213@8656L126,211@8616L343:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i4 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        if ((i3 & 128) == 0 && startRestartGroup.changedInstance(function13)) {
                            i14 = 8388608;
                            i4 |= i14;
                        }
                        i14 = 4194304;
                        i4 |= i14;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changedInstance(function14)) {
                            i13 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i13;
                        }
                        i13 = 33554432;
                        i4 |= i13;
                    }
                    i9 = i3 & 512;
                    if (i9 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= startRestartGroup.changedInstance(function15) ? 536870912 : 268435456;
                    }
                    if ((i3 & 1024) == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i10 = i2 | (startRestartGroup.changedInstance(function16) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i10 & 3) != 2 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i15 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            String str5 = i6 == 0 ? null : str2;
                            NavHostKt$NavHost$7 navHostKt$NavHost$7 = i7 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$7
                                @Override // kotlin.jvm.functions.Function1
                                public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function1;
                            NavHostKt$NavHost$8 navHostKt$NavHost$8 = i8 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$8
                                @Override // kotlin.jvm.functions.Function1
                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i3 & 128) == 0) {
                                i11 = i4 & (-29360129);
                                function17 = navHostKt$NavHost$7;
                            } else {
                                i11 = i4;
                                function17 = function13;
                            }
                            if ((i3 & 256) == 0) {
                                i12 = i11 & (-234881025);
                                function18 = navHostKt$NavHost$8;
                            } else {
                                i12 = i11;
                                function18 = function14;
                            }
                            if (i9 == 0) {
                                function110 = function17;
                                modifier3 = companion;
                                alignment3 = topStart;
                                function111 = function18;
                                i4 = i12;
                                function112 = navHostKt$NavHost$7;
                                function113 = navHostKt$NavHost$8;
                                function19 = null;
                            } else {
                                function19 = function15;
                                function110 = function17;
                                modifier3 = companion;
                                alignment3 = topStart;
                                function111 = function18;
                                i4 = i12;
                                function112 = navHostKt$NavHost$7;
                                function113 = navHostKt$NavHost$8;
                            }
                            str3 = str5;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 128) != 0) {
                                i4 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            str3 = str2;
                            function112 = function1;
                            function113 = function12;
                            function110 = function13;
                            function111 = function14;
                            function19 = function15;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1840250294, i4, i10, "androidx.navigation.compose.NavHost (NavHost.kt:210)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
                        z = ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i10 & 14) == 4);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
                            function16.invoke(navGraphBuilder);
                            rememberedValue = navGraphBuilder.build();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i16 = i4 & 8078;
                        int i17 = i4 >> 3;
                        String str6 = str3;
                        composer2 = startRestartGroup;
                        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function112, function113, function110, function111, function19, startRestartGroup, i16 | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (29360128 & i17) | (i17 & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        str4 = str6;
                        function114 = function112;
                        function115 = function113;
                        function116 = function110;
                        function117 = function111;
                        function118 = function19;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        str4 = str2;
                        function115 = function12;
                        function117 = function14;
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        composer2 = startRestartGroup;
                        function114 = function1;
                        function116 = function13;
                        function118 = function15;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                NavHostKt.NavHost(NavHostController.this, str, modifier4, alignment4, str4, function114, function115, function116, function117, function118, function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                i9 = i3 & 512;
                if (i9 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i15 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if (i9 == 0) {
                }
                str3 = str5;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
                z = ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i10 & 14) == 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
                function16.invoke(navGraphBuilder2);
                rememberedValue = navGraphBuilder2.build();
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i162 = i4 & 8078;
                int i172 = i4 >> 3;
                String str62 = str3;
                composer2 = startRestartGroup;
                NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function112, function113, function110, function111, function19, startRestartGroup, i162 | (57344 & i172) | (458752 & i172) | (3670016 & i172) | (29360128 & i172) | (i172 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                alignment4 = alignment3;
                str4 = str62;
                function114 = function112;
                function115 = function113;
                function116 = function110;
                function117 = function111;
                function118 = function19;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            i9 = i3 & 512;
            if (i9 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i15 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if (i9 == 0) {
            }
            str3 = str5;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
            z = ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i10 & 14) == 4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            NavGraphBuilder navGraphBuilder22 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
            function16.invoke(navGraphBuilder22);
            rememberedValue = navGraphBuilder22.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1622 = i4 & 8078;
            int i1722 = i4 >> 3;
            String str622 = str3;
            composer2 = startRestartGroup;
            NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function112, function113, function110, function111, function19, startRestartGroup, i1622 | (57344 & i1722) | (458752 & i1722) | (3670016 & i1722) | (29360128 & i1722) | (i1722 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            alignment4 = alignment3;
            str4 = str622;
            function114 = function112;
            function115 = function113;
            function116 = function110;
            function117 = function111;
            function118 = function19;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if (i9 == 0) {
        }
        str3 = str5;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 652920376, "CC(remember):NavHost.kt#9igjgp");
        z = ((57344 & i4) != 16384) | ((i4 & 112) != 32) | ((i10 & 14) == 4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        NavGraphBuilder navGraphBuilder222 = new NavGraphBuilder(navHostController.get_navigatorProvider(), str, str3);
        function16.invoke(navGraphBuilder222);
        rememberedValue = navGraphBuilder222.build();
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i16222 = i4 & 8078;
        int i17222 = i4 >> 3;
        String str6222 = str3;
        composer2 = startRestartGroup;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function112, function113, function110, function111, function19, startRestartGroup, i16222 | (57344 & i17222) | (458752 & i17222) | (3670016 & i17222) | (29360128 & i17222) | (i17222 & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        alignment4 = alignment3;
        str4 = str6222;
        function114 = function112;
        function115 = function113;
        function116 = function110;
        function117 = function111;
        function118 = function19;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final KClass<?> kClass, Modifier modifier, Alignment alignment, KClass<?> kClass2, Map<KType, NavType<?>> map, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function17;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function18;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function19;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function112;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function113;
        Modifier modifier3;
        KClass<?> kClass3;
        Map<KType, NavType<?>> map2;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Alignment alignment4;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function114;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function116;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function117;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function118;
        final Map<KType, NavType<?>> map3;
        final KClass<?> kClass4;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(750467758);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)285@11603L135,283@11563L352:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(kClass) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i4 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(kClass2) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changedInstance(function13)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i15;
                        }
                        i15 = 33554432;
                        i4 |= i15;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changedInstance(function14)) {
                            i14 = 536870912;
                            i4 |= i14;
                        }
                        i14 = 268435456;
                        i4 |= i14;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function15) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i11 |= startRestartGroup.changedInstance(function16) ? 32 : 16;
                    }
                    i12 = i11;
                    if ((i4 & 306783379) == 306783378 || (i12 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            KClass<?> kClass5 = i6 == 0 ? null : kClass2;
                            Map<KType, NavType<?>> emptyMap = i7 == 0 ? MapsKt.emptyMap() : map;
                            NavHostKt$NavHost$11 navHostKt$NavHost$11 = i8 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$11
                                @Override // kotlin.jvm.functions.Function1
                                public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function1;
                            NavHostKt$NavHost$12 navHostKt$NavHost$12 = i9 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$12
                                @Override // kotlin.jvm.functions.Function1
                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i3 & 256) == 0) {
                                i13 = i4 & (-234881025);
                                function17 = navHostKt$NavHost$11;
                            } else {
                                i13 = i4;
                                function17 = function13;
                            }
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119 = function17;
                            if ((i3 & 512) == 0) {
                                i13 &= -1879048193;
                                function18 = navHostKt$NavHost$12;
                            } else {
                                function18 = function14;
                            }
                            function19 = function119;
                            if (i10 == 0) {
                                function111 = function18;
                                alignment3 = topStart;
                                function112 = navHostKt$NavHost$12;
                                i4 = i13;
                                function113 = navHostKt$NavHost$11;
                                function110 = null;
                            } else {
                                function110 = function15;
                                function111 = function18;
                                alignment3 = topStart;
                                function112 = navHostKt$NavHost$12;
                                i4 = i13;
                                function113 = navHostKt$NavHost$11;
                            }
                            modifier3 = companion;
                            Map<KType, NavType<?>> map4 = emptyMap;
                            kClass3 = kClass5;
                            map2 = map4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            map2 = map;
                            function113 = function1;
                            function112 = function12;
                            function19 = function13;
                            function111 = function14;
                            function110 = function15;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                            kClass3 = kClass2;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(750467758, i4, i12, "androidx.navigation.compose.NavHost (NavHost.kt:282)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
                        changed = startRestartGroup.changed(kClass3) | startRestartGroup.changed(kClass) | ((i12 & 112) != 32);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, map2);
                            function16.invoke(navGraphBuilder);
                            rememberedValue = navGraphBuilder.build();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i17 = i4 & 8078;
                        int i18 = i4 >> 6;
                        Map<KType, NavType<?>> map5 = map2;
                        KClass<?> kClass6 = kClass3;
                        composer2 = startRestartGroup;
                        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i17 | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128) | ((i12 << 24) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        function114 = function113;
                        function115 = function112;
                        function116 = function19;
                        function117 = function111;
                        function118 = function110;
                        map3 = map5;
                        kClass4 = kClass6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        kClass4 = kClass2;
                        map3 = map;
                        function115 = function12;
                        function118 = function15;
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        composer2 = startRestartGroup;
                        function114 = function1;
                        function116 = function13;
                        function117 = function14;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$14
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                NavHostKt.NavHost(NavHostController.this, kClass, modifier4, alignment4, kClass4, map3, function114, function115, function116, function117, function118, (Function1<? super NavGraphBuilder, Unit>) function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i12 = i11;
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1192 = function17;
                if ((i3 & 512) == 0) {
                }
                function19 = function1192;
                if (i10 == 0) {
                }
                modifier3 = companion;
                Map<KType, NavType<?>> map42 = emptyMap;
                kClass3 = kClass5;
                map2 = map42;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
                changed = startRestartGroup.changed(kClass3) | startRestartGroup.changed(kClass) | ((i12 & 112) != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, map2);
                function16.invoke(navGraphBuilder2);
                rememberedValue = navGraphBuilder2.build();
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i172 = i4 & 8078;
                int i182 = i4 >> 6;
                Map<KType, NavType<?>> map52 = map2;
                KClass<?> kClass62 = kClass3;
                composer2 = startRestartGroup;
                NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i172 | (57344 & i182) | (458752 & i182) | (3670016 & i182) | (i182 & 29360128) | ((i12 << 24) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                alignment4 = alignment3;
                function114 = function113;
                function115 = function112;
                function116 = function19;
                function117 = function111;
                function118 = function110;
                map3 = map52;
                kClass4 = kClass62;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i12 = i11;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function11922 = function17;
            if ((i3 & 512) == 0) {
            }
            function19 = function11922;
            if (i10 == 0) {
            }
            modifier3 = companion;
            Map<KType, NavType<?>> map422 = emptyMap;
            kClass3 = kClass5;
            map2 = map422;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
            changed = startRestartGroup.changed(kClass3) | startRestartGroup.changed(kClass) | ((i12 & 112) != 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            NavGraphBuilder navGraphBuilder22 = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, map2);
            function16.invoke(navGraphBuilder22);
            rememberedValue = navGraphBuilder22.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1722 = i4 & 8078;
            int i1822 = i4 >> 6;
            Map<KType, NavType<?>> map522 = map2;
            KClass<?> kClass622 = kClass3;
            composer2 = startRestartGroup;
            NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i1722 | (57344 & i1822) | (458752 & i1822) | (3670016 & i1822) | (i1822 & 29360128) | ((i12 << 24) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            alignment4 = alignment3;
            function114 = function113;
            function115 = function112;
            function116 = function19;
            function117 = function111;
            function118 = function110;
            map3 = map522;
            kClass4 = kClass622;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i12 = i11;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119222 = function17;
        if ((i3 & 512) == 0) {
        }
        function19 = function119222;
        if (i10 == 0) {
        }
        modifier3 = companion;
        Map<KType, NavType<?>> map4222 = emptyMap;
        kClass3 = kClass5;
        map2 = map4222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653014689, "CC(remember):NavHost.kt#9igjgp");
        changed = startRestartGroup.changed(kClass3) | startRestartGroup.changed(kClass) | ((i12 & 112) != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        NavGraphBuilder navGraphBuilder222 = new NavGraphBuilder(navHostController.get_navigatorProvider(), kClass, kClass3, map2);
        function16.invoke(navGraphBuilder222);
        rememberedValue = navGraphBuilder222.build();
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i17222 = i4 & 8078;
        int i18222 = i4 >> 6;
        Map<KType, NavType<?>> map5222 = map2;
        KClass<?> kClass6222 = kClass3;
        composer2 = startRestartGroup;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i17222 | (57344 & i18222) | (458752 & i18222) | (3670016 & i18222) | (i18222 & 29360128) | ((i12 << 24) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        alignment4 = alignment3;
        function114 = function113;
        function115 = function112;
        function116 = function19;
        function117 = function111;
        function118 = function110;
        map3 = map5222;
        kClass4 = kClass6222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final Object obj, Modifier modifier, Alignment alignment, KClass<?> kClass, Map<KType, NavType<?>> map, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, final Function1<? super NavGraphBuilder, Unit> function16, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function17;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function18;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function19;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function110;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        Alignment alignment3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function112;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function113;
        Modifier modifier3;
        KClass<?> kClass2;
        Map<KType, NavType<?>> map2;
        boolean changed;
        Object rememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Alignment alignment4;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function114;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function116;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function117;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function118;
        final Map<KType, NavType<?>> map3;
        final KClass<?> kClass3;
        ScopeUpdateScope endRestartGroup;
        int i14;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-1476019057);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,10,4,1,8,11,2,3,6,7,9)357@14555L135,355@14515L352:NavHost.kt#opm8kd");
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        int i16 = i3 & 4;
        if (i16 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                alignment2 = alignment;
                i4 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= startRestartGroup.changedInstance(kClass) ? 16384 : 8192;
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i4 |= startRestartGroup.changedInstance(map) ? 131072 : 65536;
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i4 |= startRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= startRestartGroup.changedInstance(function12) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        if ((i3 & 256) == 0 && startRestartGroup.changedInstance(function13)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            i4 |= i15;
                        }
                        i15 = 33554432;
                        i4 |= i15;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0 && startRestartGroup.changedInstance(function14)) {
                            i14 = 536870912;
                            i4 |= i14;
                        }
                        i14 = 268435456;
                        i4 |= i14;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i2 | (startRestartGroup.changedInstance(function15) ? 4 : 2);
                    } else {
                        i11 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i11 |= 48;
                    } else if ((i2 & 48) == 0) {
                        i11 |= startRestartGroup.changedInstance(function16) ? 32 : 16;
                    }
                    i12 = i11;
                    if ((i4 & 306783379) == 306783378 || (i12 & 19) != 18 || !startRestartGroup.getSkipping()) {
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i16 == 0 ? Modifier.INSTANCE : modifier2;
                            Alignment topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                            KClass<?> kClass4 = i6 == 0 ? null : kClass;
                            Map<KType, NavType<?>> emptyMap = i7 == 0 ? MapsKt.emptyMap() : map;
                            NavHostKt$NavHost$15 navHostKt$NavHost$15 = i8 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$15
                                @Override // kotlin.jvm.functions.Function1
                                public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function1;
                            NavHostKt$NavHost$16 navHostKt$NavHost$16 = i9 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$16
                                @Override // kotlin.jvm.functions.Function1
                                public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                    return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                }
                            } : function12;
                            if ((i3 & 256) == 0) {
                                i13 = i4 & (-234881025);
                                function17 = navHostKt$NavHost$15;
                            } else {
                                i13 = i4;
                                function17 = function13;
                            }
                            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119 = function17;
                            if ((i3 & 512) == 0) {
                                i13 &= -1879048193;
                                function18 = navHostKt$NavHost$16;
                            } else {
                                function18 = function14;
                            }
                            function19 = function119;
                            if (i10 == 0) {
                                function111 = function18;
                                alignment3 = topStart;
                                function112 = navHostKt$NavHost$16;
                                i4 = i13;
                                function113 = navHostKt$NavHost$15;
                                function110 = null;
                            } else {
                                function110 = function15;
                                function111 = function18;
                                alignment3 = topStart;
                                function112 = navHostKt$NavHost$16;
                                i4 = i13;
                                function113 = navHostKt$NavHost$15;
                            }
                            modifier3 = companion;
                            Map<KType, NavType<?>> map4 = emptyMap;
                            kClass2 = kClass4;
                            map2 = map4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            map2 = map;
                            function113 = function1;
                            function112 = function12;
                            function19 = function13;
                            function111 = function14;
                            function110 = function15;
                            modifier3 = modifier2;
                            alignment3 = alignment2;
                            kClass2 = kClass;
                        }
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1476019057, i4, i12, "androidx.navigation.compose.NavHost (NavHost.kt:354)");
                        }
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
                        changed = startRestartGroup.changed(kClass2) | startRestartGroup.changed(obj) | ((i12 & 112) != 32);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, map2);
                            function16.invoke(navGraphBuilder);
                            rememberedValue = navGraphBuilder.build();
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        int i17 = i4 & 8078;
                        int i18 = i4 >> 6;
                        Map<KType, NavType<?>> map5 = map2;
                        KClass<?> kClass5 = kClass2;
                        composer2 = startRestartGroup;
                        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i17 | (57344 & i18) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128) | ((i12 << 24) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        alignment4 = alignment3;
                        function114 = function113;
                        function115 = function112;
                        function116 = function19;
                        function117 = function111;
                        function118 = function110;
                        map3 = map5;
                        kClass3 = kClass5;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        kClass3 = kClass;
                        map3 = map;
                        function115 = function12;
                        function118 = function15;
                        modifier4 = modifier2;
                        alignment4 = alignment2;
                        composer2 = startRestartGroup;
                        function114 = function1;
                        function116 = function13;
                        function117 = function14;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$18
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i19) {
                                NavHostKt.NavHost(NavHostController.this, obj, modifier4, alignment4, kClass3, map3, function114, function115, function116, function117, function118, function16, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                if ((i & 100663296) == 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                i12 = i11;
                if ((i4 & 306783379) == 306783378) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i16 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1192 = function17;
                if ((i3 & 512) == 0) {
                }
                function19 = function1192;
                if (i10 == 0) {
                }
                modifier3 = companion;
                Map<KType, NavType<?>> map42 = emptyMap;
                kClass2 = kClass4;
                map2 = map42;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
                changed = startRestartGroup.changed(kClass2) | startRestartGroup.changed(obj) | ((i12 & 112) != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, map2);
                function16.invoke(navGraphBuilder2);
                rememberedValue = navGraphBuilder2.build();
                startRestartGroup.updateRememberedValue(rememberedValue);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                int i172 = i4 & 8078;
                int i182 = i4 >> 6;
                Map<KType, NavType<?>> map52 = map2;
                KClass<?> kClass52 = kClass2;
                composer2 = startRestartGroup;
                NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i172 | (57344 & i182) | (458752 & i182) | (3670016 & i182) | (i182 & 29360128) | ((i12 << 24) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                alignment4 = alignment3;
                function114 = function113;
                function115 = function112;
                function116 = function19;
                function117 = function111;
                function118 = function110;
                map3 = map52;
                kClass3 = kClass52;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            alignment2 = alignment;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            if ((i & 100663296) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            i12 = i11;
            if ((i4 & 306783379) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i16 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function11922 = function17;
            if ((i3 & 512) == 0) {
            }
            function19 = function11922;
            if (i10 == 0) {
            }
            modifier3 = companion;
            Map<KType, NavType<?>> map422 = emptyMap;
            kClass2 = kClass4;
            map2 = map422;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
            changed = startRestartGroup.changed(kClass2) | startRestartGroup.changed(obj) | ((i12 & 112) != 32);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            NavGraphBuilder navGraphBuilder22 = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, map2);
            function16.invoke(navGraphBuilder22);
            rememberedValue = navGraphBuilder22.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i1722 = i4 & 8078;
            int i1822 = i4 >> 6;
            Map<KType, NavType<?>> map522 = map2;
            KClass<?> kClass522 = kClass2;
            composer2 = startRestartGroup;
            NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i1722 | (57344 & i1822) | (458752 & i1822) | (3670016 & i1822) | (i1822 & 29360128) | ((i12 << 24) & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            alignment4 = alignment3;
            function114 = function113;
            function115 = function112;
            function116 = function19;
            function117 = function111;
            function118 = function110;
            map3 = map522;
            kClass3 = kClass522;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        alignment2 = alignment;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        if ((i & 100663296) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        i12 = i11;
        if ((i4 & 306783379) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i16 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i9 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function119222 = function17;
        if ((i3 & 512) == 0) {
        }
        function19 = function119222;
        if (i10 == 0) {
        }
        modifier3 = companion;
        Map<KType, NavType<?>> map4222 = emptyMap;
        kClass2 = kClass4;
        map2 = map4222;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653109153, "CC(remember):NavHost.kt#9igjgp");
        changed = startRestartGroup.changed(kClass2) | startRestartGroup.changed(obj) | ((i12 & 112) != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        NavGraphBuilder navGraphBuilder222 = new NavGraphBuilder(navHostController.get_navigatorProvider(), obj, kClass2, map2);
        function16.invoke(navGraphBuilder222);
        rememberedValue = navGraphBuilder222.build();
        startRestartGroup.updateRememberedValue(rememberedValue);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        int i17222 = i4 & 8078;
        int i18222 = i4 >> 6;
        Map<KType, NavType<?>> map5222 = map2;
        KClass<?> kClass5222 = kClass2;
        composer2 = startRestartGroup;
        NavHost(navHostController, (NavGraph) rememberedValue, modifier3, alignment3, function113, function112, function19, function111, function110, startRestartGroup, i17222 | (57344 & i18222) | (458752 & i18222) | (3670016 & i18222) | (i18222 & 29360128) | ((i12 << 24) & 234881024), 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        alignment4 = alignment3;
        function114 = function113;
        function115 = function112;
        function116 = function19;
        function117 = function111;
        function118 = function110;
        map3 = map5222;
        kClass3 = kClass5222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(2)392@15641L39:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navGraph) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-957014592, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:392)");
                }
                NavHost(navHostController, navGraph, modifier4, null, null, null, null, null, null, startRestartGroup, i3 & 1022, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$19
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        NavHostKt.NavHost(NavHostController.this, navGraph, modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        NavHost(navHostController, navGraph, modifier4, null, null, null, null, null, null, startRestartGroup, i3 & 1022, 504);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008b  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports sizeTransform")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        Function1 function15;
        int i7;
        Function1 function16;
        Function1 function17;
        int i8;
        Function1 function18;
        Function1 function19;
        Function1 function110;
        final Function1 function111;
        Function1 function112;
        final Modifier modifier3;
        final Function1 function113;
        final Function1 function114;
        ScopeUpdateScope endRestartGroup;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1818191915);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,3,4)431@17424L199:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navGraph) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function15 = function1;
                        i3 |= startRestartGroup.changedInstance(function15) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function16 = function12;
                            i3 |= startRestartGroup.changedInstance(function16) ? 131072 : 65536;
                            if ((1572864 & i) != 0) {
                                if ((i2 & 64) == 0) {
                                    function17 = function13;
                                    if (startRestartGroup.changedInstance(function17)) {
                                        i10 = 1048576;
                                        i3 |= i10;
                                    }
                                } else {
                                    function17 = function13;
                                }
                                i10 = 524288;
                                i3 |= i10;
                            } else {
                                function17 = function13;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changedInstance(function14)) {
                                    i9 = 8388608;
                                    i3 |= i9;
                                }
                                i9 = 4194304;
                                i3 |= i9;
                            }
                            if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    if (i4 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i5 != 0) {
                                        alignment2 = Alignment.INSTANCE.getTopStart();
                                    }
                                    if (i6 != 0) {
                                        function15 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$20
                                            @Override // kotlin.jvm.functions.Function1
                                            public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                            }
                                        };
                                    }
                                    if (i7 != 0) {
                                        function16 = new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$21
                                            @Override // kotlin.jvm.functions.Function1
                                            public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                            }
                                        };
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                        function17 = function15;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i8 = i3 & (-29360129);
                                        function18 = function15;
                                        function19 = function16;
                                        function110 = function19;
                                        Function1 function115 = function17;
                                        startRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1818191915, i8, -1, "androidx.navigation.compose.NavHost (NavHost.kt:430)");
                                        }
                                        NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function115, function110, null, startRestartGroup, i8 & 33554430, 256);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        function111 = function115;
                                        function112 = function110;
                                        modifier3 = modifier2;
                                        function113 = function18;
                                        function114 = function19;
                                    }
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                }
                                function110 = function14;
                                i8 = i3;
                                function18 = function15;
                                function19 = function16;
                                Function1 function1152 = function17;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function1152, function110, null, startRestartGroup, i8 & 33554430, 256);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                function111 = function1152;
                                function112 = function110;
                                modifier3 = modifier2;
                                function113 = function18;
                                function114 = function19;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function112 = function14;
                                modifier3 = modifier2;
                                function113 = function15;
                                function114 = function16;
                                function111 = function17;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Alignment alignment3 = alignment2;
                                final Function1 function116 = function112;
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$22
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i11) {
                                        NavHostKt.NavHost(NavHostController.this, navGraph, modifier3, alignment3, function113, function114, function111, function116, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function16 = function12;
                        if ((1572864 & i) != 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        if ((i3 & 4793491) == 4793490) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                        if ((i2 & 128) != 0) {
                        }
                        function110 = function14;
                        i8 = i3;
                        function18 = function15;
                        function19 = function16;
                        Function1 function11522 = function17;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function11522, function110, null, startRestartGroup, i8 & 33554430, 256);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function111 = function11522;
                        function112 = function110;
                        modifier3 = modifier2;
                        function113 = function18;
                        function114 = function19;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function15 = function1;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function16 = function12;
                    if ((1572864 & i) != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    function110 = function14;
                    i8 = i3;
                    function18 = function15;
                    function19 = function16;
                    Function1 function115222 = function17;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function115222, function110, null, startRestartGroup, i8 & 33554430, 256);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function111 = function115222;
                    function112 = function110;
                    modifier3 = modifier2;
                    function113 = function18;
                    function114 = function19;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function15 = function1;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function16 = function12;
                if ((1572864 & i) != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i4 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                function110 = function14;
                i8 = i3;
                function18 = function15;
                function19 = function16;
                Function1 function1152222 = function17;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function1152222, function110, null, startRestartGroup, i8 & 33554430, 256);
                if (ComposerKt.isTraceInProgress()) {
                }
                function111 = function1152222;
                function112 = function110;
                modifier3 = modifier2;
                function113 = function18;
                function114 = function19;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function15 = function1;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function16 = function12;
            if ((1572864 & i) != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            function110 = function14;
            i8 = i3;
            function18 = function15;
            function19 = function16;
            Function1 function11522222 = function17;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function11522222, function110, null, startRestartGroup, i8 & 33554430, 256);
            if (ComposerKt.isTraceInProgress()) {
            }
            function111 = function11522222;
            function112 = function110;
            modifier3 = modifier2;
            function113 = function18;
            function114 = function19;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function15 = function1;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function16 = function12;
        if ((1572864 & i) != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        function110 = function14;
        i8 = i3;
        function18 = function15;
        function19 = function16;
        Function1 function115222222 = function17;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        NavHost(navHostController, navGraph, modifier2, alignment2, function18, function19, function115222222, function110, null, startRestartGroup, i8 & 33554430, 256);
        if (ComposerKt.isTraceInProgress()) {
        }
        function111 = function115222222;
        function112 = function110;
        modifier3 = modifier2;
        function113 = function18;
        function114 = function19;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavHost(final NavHostController navHostController, final NavGraph navGraph, Modifier modifier, Alignment alignment, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function1, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function12, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function13, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function14, Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function15, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        Alignment alignment2;
        int i6;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function16;
        int i7;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function17;
        int i8;
        Modifier.Companion companion;
        Alignment topStart;
        final NavHostKt$NavHost$23 navHostKt$NavHost$23;
        final NavHostKt$NavHost$24 navHostKt$NavHost$24;
        int i9;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function18;
        int i10;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function19;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function110;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function111;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function112;
        ViewModelStoreOwner current;
        Modifier modifier3;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function113;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function114;
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function115;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function116;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function117;
        DialogNavigator dialogNavigator;
        final Modifier modifier4;
        final Alignment alignment3;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function118;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function119;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function120;
        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function121;
        Object obj;
        Object obj2;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1964664536);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,3,4)492@19706L7,*494@19790L7,509@20395L16,511@20433L36,512@20498L34,513@20586L652,513@20537L701,531@21277L138,531@21244L171,537@21447L29,539@21536L16,542@21641L186,552@21922L42,714@29628L27:NavHost.kt#opm8kd");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(navGraph) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    alignment2 = alignment;
                    i3 |= startRestartGroup.changed(alignment2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function16 = function1;
                        i3 |= startRestartGroup.changedInstance(function16) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function17 = function12;
                            i3 |= startRestartGroup.changedInstance(function17) ? 131072 : 65536;
                            if ((i & 1572864) == 0) {
                                i3 |= ((i2 & 64) == 0 && startRestartGroup.changedInstance(function13)) ? 1048576 : 524288;
                            }
                            if ((i & 12582912) == 0) {
                                if ((i2 & 128) == 0 && startRestartGroup.changedInstance(function14)) {
                                    i11 = 8388608;
                                    i3 |= i11;
                                }
                                i11 = 4194304;
                                i3 |= i11;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 100663296;
                            } else if ((i & 100663296) == 0) {
                                i3 |= startRestartGroup.changedInstance(function15) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                    topStart = i5 == 0 ? Alignment.INSTANCE.getTopStart() : alignment2;
                                    navHostKt$NavHost$23 = i6 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$23
                                        @Override // kotlin.jvm.functions.Function1
                                        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    } : function16;
                                    navHostKt$NavHost$24 = i7 == 0 ? new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$24
                                        @Override // kotlin.jvm.functions.Function1
                                        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                            return EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
                                        }
                                    } : function17;
                                    if ((i2 & 64) == 0) {
                                        i9 = i3 & (-3670017);
                                        function18 = navHostKt$NavHost$23;
                                    } else {
                                        i9 = i3;
                                        function18 = function13;
                                    }
                                    if ((i2 & 128) == 0) {
                                        i10 = i9 & (-29360129);
                                        function19 = navHostKt$NavHost$24;
                                    } else {
                                        i10 = i9;
                                        function19 = function14;
                                    }
                                    function110 = i8 == 0 ? null : function15;
                                    function111 = function19;
                                    function112 = function18;
                                    i3 = i10;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    if ((i2 & 128) != 0) {
                                        i3 &= -29360129;
                                    }
                                    function110 = function15;
                                    companion = modifier2;
                                    topStart = alignment2;
                                    navHostKt$NavHost$23 = function16;
                                    navHostKt$NavHost$24 = function17;
                                    function112 = function13;
                                    function111 = function14;
                                }
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1964664536, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:490)");
                                }
                                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object consume = startRestartGroup.consume(localLifecycleOwner);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                final LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
                                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current != null) {
                                    throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
                                }
                                navHostController.setViewModelStore(current.getViewModelStore());
                                navHostController.setGraph(navGraph);
                                Navigator navigator = navHostController.get_navigatorProvider().getNavigator(ComposeNavigator.NAME);
                                final ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
                                if (composeNavigator == null) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup != null) {
                                        final Modifier modifier5 = companion;
                                        final Alignment alignment4 = topStart;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function122 = navHostKt$NavHost$23;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function123 = navHostKt$NavHost$24;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function124 = function112;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function125 = function111;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function126 = function110;
                                        endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$composeNavigator$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i12) {
                                                NavHostKt.NavHost(NavHostController.this, navGraph, modifier5, alignment4, function122, function123, function124, function125, function126, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                State collectAsState = SnapshotStateKt.collectAsState(composeNavigator.getBackStack(), null, startRestartGroup, 0, 1);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653297150, "CC(remember):NavHost.kt#9igjgp");
                                Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                MutableFloatState mutableFloatState = (MutableFloatState) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653299228, "CC(remember):NavHost.kt#9igjgp");
                                Object rememberedValue2 = startRestartGroup.rememberedValue();
                                final Alignment alignment5 = topStart;
                                if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    modifier3 = companion;
                                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                } else {
                                    modifier3 = companion;
                                }
                                final MutableState mutableState = (MutableState) rememberedValue2;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                boolean z = NavHost$lambda$6(collectAsState).size() > 1;
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653302662, "CC(remember):NavHost.kt#9igjgp");
                                boolean changed = startRestartGroup.changed(collectAsState) | startRestartGroup.changed(composeNavigator);
                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function127 = function110;
                                Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = (Function2) new NavHostKt$NavHost$25$1(composeNavigator, mutableFloatState, collectAsState, mutableState, null);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                PredictiveBackHandlerKt.PredictiveBackHandler(z, (Function2) rememberedValue3, startRestartGroup, 0, 0);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653324260, "CC(remember):NavHost.kt#9igjgp");
                                boolean changedInstance = startRestartGroup.changedInstance(navHostController) | startRestartGroup.changedInstance(lifecycleOwner);
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (changedInstance || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                            NavHostController.this.setLifecycleOwner(lifecycleOwner);
                                            return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$26$1$invoke$$inlined$onDispose$1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                }
                                            };
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                EffectsKt.DisposableEffect(lifecycleOwner, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, startRestartGroup, 0);
                                final SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
                                final State collectAsState2 = SnapshotStateKt.collectAsState(navHostController.getVisibleEntries(), null, startRestartGroup, 0, 1);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653335956, "CC(remember):NavHost.kt#9igjgp");
                                Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = SnapshotStateKt.derivedStateOf(new Function0<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$visibleEntries$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final List<? extends NavBackStackEntry> invoke() {
                                            List NavHost$lambda$15;
                                            NavHost$lambda$15 = NavHostKt.NavHost$lambda$15(collectAsState2);
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj3 : NavHost$lambda$15) {
                                                if (Intrinsics.areEqual(((NavBackStackEntry) obj3).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                            return arrayList;
                                        }
                                    });
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                final State state = (State) rememberedValue5;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List) NavHost$lambda$17(state));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653344804, "CC(remember):NavHost.kt#9igjgp");
                                Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue6 = (Map) new LinkedHashMap();
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                }
                                final Map map = (Map) rememberedValue6;
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.startReplaceGroup(653353748);
                                ComposerKt.sourceInformation(startRestartGroup, "555@22098L597,569@22793L597,585@23521L301,593@23855L146,593@23832L169,599@24033L348,606@24408L52,647@26382L1208,673@27667L1333,645@26314L2686,699@29073L341,699@29009L405");
                                if (navBackStackEntry != null) {
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653350991, "CC(remember):NavHost.kt#9igjgp");
                                    boolean changed2 = ((((i3 & 3670016) ^ 1572864) > 1048576 && startRestartGroup.changed(function112)) || (i3 & 1572864) == 1048576) | startRestartGroup.changed(composeNavigator) | ((57344 & i3) == 16384);
                                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                                    if (changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue7 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalEnter$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                EnterTransition createPopEnterTransition;
                                                boolean NavHost$lambda$11;
                                                EnterTransition createEnterTransition;
                                                NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
                                                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                EnterTransition enterTransition = null;
                                                if (!ComposeNavigator.this.isPop$navigation_compose_release().getValue().booleanValue()) {
                                                    NavHost$lambda$11 = NavHostKt.NavHost$lambda$11(mutableState);
                                                    if (!NavHost$lambda$11) {
                                                        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            createEnterTransition = NavHostKt.createEnterTransition(it.next(), animatedContentTransitionScope);
                                                            if (createEnterTransition != null) {
                                                                enterTransition = createEnterTransition;
                                                                break;
                                                            }
                                                        }
                                                        return enterTransition == null ? navHostKt$NavHost$23.invoke(animatedContentTransitionScope) : enterTransition;
                                                    }
                                                }
                                                Iterator<NavDestination> it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    createPopEnterTransition = NavHostKt.createPopEnterTransition(it2.next(), animatedContentTransitionScope);
                                                    if (createPopEnterTransition != null) {
                                                        enterTransition = createPopEnterTransition;
                                                        break;
                                                    }
                                                }
                                                return enterTransition == null ? function112.invoke(animatedContentTransitionScope) : enterTransition;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue7);
                                    }
                                    final Function1 function128 = (Function1) rememberedValue7;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653373231, "CC(remember):NavHost.kt#9igjgp");
                                    function115 = function112;
                                    boolean changed3 = startRestartGroup.changed(composeNavigator) | ((((29360128 & i3) ^ 12582912) > 8388608 && startRestartGroup.changed(function111)) || (i3 & 12582912) == 8388608) | ((458752 & i3) == 131072);
                                    Object rememberedValue8 = startRestartGroup.rememberedValue();
                                    if (changed3 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue8 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalExit$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                ExitTransition createPopExitTransition;
                                                boolean NavHost$lambda$11;
                                                ExitTransition createExitTransition;
                                                NavDestination destination = animatedContentTransitionScope.getInitialState().getDestination();
                                                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
                                                ExitTransition exitTransition = null;
                                                if (!ComposeNavigator.this.isPop$navigation_compose_release().getValue().booleanValue()) {
                                                    NavHost$lambda$11 = NavHostKt.NavHost$lambda$11(mutableState);
                                                    if (!NavHost$lambda$11) {
                                                        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                break;
                                                            }
                                                            createExitTransition = NavHostKt.createExitTransition(it.next(), animatedContentTransitionScope);
                                                            if (createExitTransition != null) {
                                                                exitTransition = createExitTransition;
                                                                break;
                                                            }
                                                        }
                                                        return exitTransition == null ? navHostKt$NavHost$24.invoke(animatedContentTransitionScope) : exitTransition;
                                                    }
                                                }
                                                Iterator<NavDestination> it2 = NavDestination.INSTANCE.getHierarchy(destination2).iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    }
                                                    createPopExitTransition = NavHostKt.createPopExitTransition(it2.next(), animatedContentTransitionScope);
                                                    if (createPopExitTransition != null) {
                                                        exitTransition = createPopExitTransition;
                                                        break;
                                                    }
                                                }
                                                return exitTransition == null ? function111.invoke(animatedContentTransitionScope) : exitTransition;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue8);
                                    }
                                    final Function1 function129 = (Function1) rememberedValue8;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653396231, "CC(remember):NavHost.kt#9igjgp");
                                    boolean z2 = (234881024 & i3) == 67108864;
                                    Object rememberedValue9 = startRestartGroup.rememberedValue();
                                    if (z2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                        function121 = function127;
                                        obj = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$finalSizeTransform$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final SizeTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                SizeTransform sizeTransform;
                                                NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
                                                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy((ComposeNavigator.Destination) destination).iterator();
                                                while (true) {
                                                    if (!it.hasNext()) {
                                                        sizeTransform = null;
                                                        break;
                                                    }
                                                    sizeTransform = NavHostKt.createSizeTransform(it.next(), animatedContentTransitionScope);
                                                    if (sizeTransform != null) {
                                                        break;
                                                    }
                                                }
                                                if (sizeTransform != null) {
                                                    return sizeTransform;
                                                }
                                                Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function130 = function121;
                                                if (function130 != null) {
                                                    return function130.invoke(animatedContentTransitionScope);
                                                }
                                                return null;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(obj);
                                    } else {
                                        obj = rememberedValue9;
                                        function121 = function127;
                                    }
                                    final Function1 function130 = (Function1) obj;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> function131 = function121;
                                    Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function132 = function111;
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653406764, "CC(remember):NavHost.kt#9igjgp");
                                    boolean changed4 = startRestartGroup.changed(composeNavigator);
                                    function114 = navHostKt$NavHost$24;
                                    Object rememberedValue10 = startRestartGroup.rememberedValue();
                                    if (changed4 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue10 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                                final State<List<NavBackStackEntry>> state2 = state;
                                                final ComposeNavigator composeNavigator2 = composeNavigator;
                                                return new DisposableEffectResult() { // from class: androidx.navigation.compose.NavHostKt$NavHost$27$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                        List NavHost$lambda$17;
                                                        NavHost$lambda$17 = NavHostKt.NavHost$lambda$17(State.this);
                                                        Iterator it = NavHost$lambda$17.iterator();
                                                        while (it.hasNext()) {
                                                            composeNavigator2.onTransitionComplete((NavBackStackEntry) it.next());
                                                        }
                                                    }
                                                };
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue10);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.DisposableEffect((Object) true, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue10, startRestartGroup, 6);
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653412662, "CC(remember):NavHost.kt#9igjgp");
                                    Object rememberedValue11 = startRestartGroup.rememberedValue();
                                    if (rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue11 = new SeekableTransitionState(navBackStackEntry);
                                        startRestartGroup.updateRememberedValue(rememberedValue11);
                                    }
                                    SeekableTransitionState seekableTransitionState = (SeekableTransitionState) rememberedValue11;
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    function113 = navHostKt$NavHost$23;
                                    int i12 = i3;
                                    Transition rememberTransition = TransitionKt.rememberTransition(seekableTransitionState, "entry", startRestartGroup, SeekableTransitionState.$stable | 48, 0);
                                    if (NavHost$lambda$11(mutableState)) {
                                        startRestartGroup.startReplaceGroup(-1218592968);
                                        ComposerKt.sourceInformation(startRestartGroup, "609@24531L159,609@24506L184");
                                        Float valueOf = Float.valueOf(NavHost$lambda$8(mutableFloatState));
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653428409, "CC(remember):NavHost.kt#9igjgp");
                                        boolean changed5 = startRestartGroup.changed(collectAsState) | startRestartGroup.changedInstance(seekableTransitionState);
                                        Object rememberedValue12 = startRestartGroup.rememberedValue();
                                        if (changed5 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue12 = (Function2) new NavHostKt$NavHost$28$1(seekableTransitionState, collectAsState, mutableFloatState, null);
                                            startRestartGroup.updateRememberedValue(rememberedValue12);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.LaunchedEffect(valueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue12, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                        dialogNavigator = null;
                                    } else {
                                        startRestartGroup.startReplaceGroup(-1218337931);
                                        ComposerKt.sourceInformation(startRestartGroup, "614@24751L1532,614@24720L1563");
                                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653436822, "CC(remember):NavHost.kt#9igjgp");
                                        boolean changedInstance2 = startRestartGroup.changedInstance(seekableTransitionState) | startRestartGroup.changedInstance(navBackStackEntry) | startRestartGroup.changed(rememberTransition);
                                        Object rememberedValue13 = startRestartGroup.rememberedValue();
                                        if (changedInstance2 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                            dialogNavigator = null;
                                            obj2 = (Function2) new NavHostKt$NavHost$29$1(seekableTransitionState, navBackStackEntry, rememberTransition, null);
                                            startRestartGroup.updateRememberedValue(obj2);
                                        } else {
                                            obj2 = rememberedValue13;
                                            dialogNavigator = null;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                        EffectsKt.LaunchedEffect(navBackStackEntry, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) obj2, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653488690, "CC(remember):NavHost.kt#9igjgp");
                                    boolean changedInstance3 = startRestartGroup.changedInstance(map) | startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function128) | startRestartGroup.changed(function129) | startRestartGroup.changed(function130);
                                    Object rememberedValue14 = startRestartGroup.rememberedValue();
                                    if (changedInstance3 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                        final ComposeNavigator composeNavigator2 = composeNavigator;
                                        rememberedValue14 = (Function1) new Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$30$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
                                                List NavHost$lambda$17;
                                                float f;
                                                boolean NavHost$lambda$11;
                                                NavHost$lambda$17 = NavHostKt.NavHost$lambda$17(state);
                                                if (NavHost$lambda$17.contains(animatedContentTransitionScope.getInitialState())) {
                                                    Float f2 = map.get(animatedContentTransitionScope.getInitialState().getId());
                                                    if (f2 != null) {
                                                        f = f2.floatValue();
                                                    } else {
                                                        map.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                                                        f = 0.0f;
                                                    }
                                                    if (!Intrinsics.areEqual(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                                                        if (!composeNavigator2.isPop$navigation_compose_release().getValue().booleanValue()) {
                                                            NavHost$lambda$11 = NavHostKt.NavHost$lambda$11(mutableState);
                                                            if (!NavHost$lambda$11) {
                                                                f += 1.0f;
                                                            }
                                                        }
                                                        f -= 1.0f;
                                                    }
                                                    map.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(f));
                                                    return new ContentTransform(function128.invoke(animatedContentTransitionScope), function129.invoke(animatedContentTransitionScope), f, function130.invoke(animatedContentTransitionScope));
                                                }
                                                return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue14);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    ComposeNavigator composeNavigator3 = composeNavigator;
                                    function117 = function131;
                                    function116 = function132;
                                    AnimatedContentKt.AnimatedContent(rememberTransition, modifier3, (Function1) rememberedValue14, alignment5, new Function1<NavBackStackEntry, Object>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$31
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(NavBackStackEntry navBackStackEntry2) {
                                            return navBackStackEntry2.getId();
                                        }
                                    }, ComposableLambdaKt.rememberComposableLambda(820763100, true, new Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry2, Composer composer2, Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry2, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        /* JADX WARN: Type inference failed for: r0v6 */
                                        /* JADX WARN: Type inference failed for: r0v7 */
                                        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
                                        public final void invoke(final AnimatedContentScope animatedContentScope, final NavBackStackEntry navBackStackEntry2, Composer composer2, int i13) {
                                            boolean NavHost$lambda$11;
                                            List NavHost$lambda$17;
                                            NavBackStackEntry navBackStackEntry3;
                                            ComposerKt.sourceInformation(composer2, "C692@28814L176,692@28773L217:NavHost.kt#opm8kd");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(820763100, i13, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:680)");
                                            }
                                            NavHost$lambda$11 = NavHostKt.NavHost$lambda$11(mutableState);
                                            if (!NavHost$lambda$11) {
                                                NavHost$lambda$17 = NavHostKt.NavHost$lambda$17(state);
                                                ListIterator listIterator = NavHost$lambda$17.listIterator(NavHost$lambda$17.size());
                                                while (true) {
                                                    if (!listIterator.hasPrevious()) {
                                                        navBackStackEntry3 = 0;
                                                        break;
                                                    } else {
                                                        navBackStackEntry3 = listIterator.previous();
                                                        if (Intrinsics.areEqual(navBackStackEntry2, (NavBackStackEntry) navBackStackEntry3)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                                navBackStackEntry2 = navBackStackEntry3;
                                            }
                                            if (navBackStackEntry2 != null) {
                                                NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry2, SaveableStateHolder.this, ComposableLambdaKt.rememberComposableLambda(-1263531443, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$32.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                        invoke(composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer3, int i14) {
                                                        ComposerKt.sourceInformation(composer3, "C693@28891L85:NavHost.kt#opm8kd");
                                                        if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1263531443, i14, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:693)");
                                                            }
                                                            NavDestination destination = NavBackStackEntry.this.getDestination();
                                                            Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                                                            ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(animatedContentScope, NavBackStackEntry.this, composer3, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer3.skipToGroupEnd();
                                                    }
                                                }, composer2, 54), composer2, 384);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, startRestartGroup, 54), startRestartGroup, ((i12 >> 3) & 112) | 221184 | (i12 & 7168), 0);
                                    Object currentState = rememberTransition.getCurrentState();
                                    Object targetState = rememberTransition.getTargetState();
                                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 653573935, "CC(remember):NavHost.kt#9igjgp");
                                    boolean changed6 = startRestartGroup.changed(rememberTransition) | startRestartGroup.changed(composeNavigator3) | startRestartGroup.changedInstance(map);
                                    Object rememberedValue15 = startRestartGroup.rememberedValue();
                                    if (changed6 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue15 = (Function2) new NavHostKt$NavHost$33$1(rememberTransition, map, state, composeNavigator3, null);
                                        startRestartGroup.updateRememberedValue(rememberedValue15);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                    EffectsKt.LaunchedEffect(currentState, targetState, (Function2) rememberedValue15, startRestartGroup, 0);
                                } else {
                                    function113 = navHostKt$NavHost$23;
                                    function114 = navHostKt$NavHost$24;
                                    function115 = function112;
                                    function116 = function111;
                                    function117 = function127;
                                    dialogNavigator = null;
                                }
                                startRestartGroup.endReplaceGroup();
                                Navigator navigator2 = navHostController.get_navigatorProvider().getNavigator(DialogNavigator.NAME);
                                DialogNavigator dialogNavigator2 = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : dialogNavigator;
                                if (dialogNavigator2 == null) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                                    if (endRestartGroup2 != null) {
                                        final Modifier modifier6 = modifier3;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function133 = function113;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> function134 = function114;
                                        final Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> function135 = function115;
                                        endRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$dialogNavigator$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i13) {
                                                NavHostKt.NavHost(NavHostController.this, navGraph, modifier6, alignment5, function133, function134, function135, function116, function117, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                DialogHostKt.DialogHost(dialogNavigator2, startRestartGroup, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                alignment3 = alignment5;
                                function118 = function115;
                                function119 = function114;
                                function120 = function113;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                function116 = function14;
                                modifier4 = modifier2;
                                alignment3 = alignment2;
                                function120 = function16;
                                function119 = function17;
                                function118 = function13;
                                function117 = function15;
                            }
                            ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
                            if (endRestartGroup3 != null) {
                                endRestartGroup3.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$34
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i13) {
                                        NavHostKt.NavHost(NavHostController.this, navGraph, modifier4, alignment3, function120, function119, function118, function116, function117, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function17 = function12;
                        if ((i & 1572864) == 0) {
                        }
                        if ((i & 12582912) == 0) {
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if ((i2 & 64) == 0) {
                        }
                        if ((i2 & 128) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        function111 = function19;
                        function112 = function18;
                        i3 = i10;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object consume2 = startRestartGroup.consume(localLifecycleOwner2);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) consume2;
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current != null) {
                        }
                    }
                    function16 = function1;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function17 = function12;
                    if ((i & 1572864) == 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if ((i2 & 64) == 0) {
                    }
                    if ((i2 & 128) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    function111 = function19;
                    function112 = function18;
                    i3 = i10;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object consume22 = startRestartGroup.consume(localLifecycleOwner22);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final LifecycleOwner lifecycleOwner22 = (LifecycleOwner) consume22;
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current != null) {
                    }
                }
                alignment2 = alignment;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function16 = function1;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function17 = function12;
                if ((i & 1572864) == 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if ((i2 & 64) == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if (i8 == 0) {
                }
                function111 = function19;
                function112 = function18;
                i3 = i10;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner222 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume222 = startRestartGroup.consume(localLifecycleOwner222);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final LifecycleOwner lifecycleOwner222 = (LifecycleOwner) consume222;
                current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
                if (current != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            alignment2 = alignment;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function16 = function1;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function17 = function12;
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if ((i2 & 64) == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if (i8 == 0) {
            }
            function111 = function19;
            function112 = function18;
            i3 = i10;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner2222 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2222 = startRestartGroup.consume(localLifecycleOwner2222);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final LifecycleOwner lifecycleOwner2222 = (LifecycleOwner) consume2222;
            current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
            if (current != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        alignment2 = alignment;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function16 = function1;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function17 = function12;
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if (i8 == 0) {
        }
        function111 = function19;
        function112 = function18;
        i3 = i10;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner22222 = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22222 = startRestartGroup.consume(localLifecycleOwner22222);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final LifecycleOwner lifecycleOwner22222 = (LifecycleOwner) consume22222;
        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float NavHost$lambda$8(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean NavHost$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NavHost$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        }
        return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeTransform createSizeTransform(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> sizeTransform$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getSizeTransform$navigation_compose_release();
            if (sizeTransform$navigation_compose_release2 != null) {
                return sizeTransform$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        }
        if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (sizeTransform$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getSizeTransform$navigation_compose_release()) == null) {
            return null;
        }
        return sizeTransform$navigation_compose_release.invoke(animatedContentTransitionScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$15(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$17(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
