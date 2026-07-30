package androidx.compose.foundation.lazy;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;

/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001al\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u0016\u001al\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001c\u001av\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\t2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0002\u0010\u001d\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010+\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010,\u001a©\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u0010.\u001a\u0082\u0001\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2%\b\n\u0010!\u001a\u001f\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010'\u001a-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u0010/\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00104\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0 2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00105\u001aè\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0086\b¢\u0006\u0002\u00106\u001a¬\u0001\u00100\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u001f*\u00020\u00122\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u001f0-2:\b\n\u0010!\u001a4\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010'\u001aB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103¢\u0006\u0002\b*¢\u0006\u0002\b\u0013H\u0087\b¢\u0006\u0002\u00107¨\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "items", "T", "", "key", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyDslKt {
    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$1.INSTANCE;
        }
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(function12, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$1
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(list.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, list) : null, new LazyDslKt$itemsIndexed$3(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(list.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, list) : null, new LazyDslKt$itemsIndexed$3(function22, list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function1 function12, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        if ((i & 4) != 0) {
            function12 = LazyDslKt$items$5.INSTANCE;
        }
        lazyListScope.items(objArr.length, function1 != null ? new LazyDslKt$items$6(function1, objArr) : null, new LazyDslKt$items$7(function12, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, objArr)));
    }

    public static final <T> void items(LazyListScope lazyListScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function4<? super LazyItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyListScope.items(tArr.length, function1 != null ? new LazyDslKt$items$6(function1, tArr) : null, new LazyDslKt$items$7(function12, tArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, tArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function2 function22, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        if ((i & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.LazyDslKt$itemsIndexed$5
                public final Void invoke(int i2, T t) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), (int) obj3);
                }
            };
        }
        lazyListScope.items(objArr.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, objArr) : null, new LazyDslKt$itemsIndexed$7(function22, objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, objArr)));
    }

    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function5<? super LazyItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyListScope.items(tArr.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, tArr) : null, new LazyDslKt$itemsIndexed$7(function22, tArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, tArr)));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        boolean z4;
        LazyListState lazyListState3;
        Arrangement.Horizontal horizontal3;
        Alignment.Vertical vertical3;
        FlingBehavior flingBehavior3;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z5;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1724297413);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,8,2,7)301@14811L23,307@15162L15,311@15264L389:LazyDsl.kt#428nma");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                        lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    }
                                    if (i12 != 0) {
                                        paddingValues2 = PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f));
                                    }
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        i3 &= -57345;
                                        horizontal2 = !z3 ? arrangement.getStart() : arrangement.getEnd();
                                    }
                                    if (i5 != 0) {
                                        vertical2 = Alignment.INSTANCE.getTop();
                                    }
                                    if ((i2 & 64) != 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -3670017;
                                    }
                                    z4 = i7 == 0 ? true : z2;
                                    lazyListState3 = lazyListState2;
                                    horizontal3 = horizontal2;
                                    vertical3 = vertical2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = companion;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    z4 = z2;
                                    lazyListState3 = lazyListState2;
                                    horizontal3 = horizontal2;
                                    vertical3 = vertical2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = modifier2;
                                }
                                PaddingValues paddingValues4 = paddingValues2;
                                boolean z7 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1724297413, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
                                }
                                int i13 = i3 >> 3;
                                composer2 = startRestartGroup;
                                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4, z7, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i13) | (i13 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                lazyListState4 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z7;
                                flingBehavior4 = flingBehavior3;
                                z6 = z4;
                                vertical4 = vertical3;
                                horizontal4 = horizontal3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z6 = z2;
                                composer2 = startRestartGroup;
                                modifier4 = modifier2;
                                lazyListState4 = lazyListState2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                horizontal4 = horizontal2;
                                vertical4 = vertical2;
                                flingBehavior4 = flingBehavior2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$1
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
                                        LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues3, z5, horizontal4, vertical4, flingBehavior4, z6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                        if (i7 == 0) {
                        }
                        lazyListState3 = lazyListState2;
                        horizontal3 = horizontal2;
                        vertical3 = vertical2;
                        flingBehavior3 = flingBehavior2;
                        modifier3 = companion;
                        PaddingValues paddingValues42 = paddingValues2;
                        boolean z72 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i3 >> 3;
                        composer2 = startRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState3, paddingValues42, z72, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i132) | (i132 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        lazyListState4 = lazyListState3;
                        paddingValues3 = paddingValues42;
                        z5 = z72;
                        flingBehavior4 = flingBehavior3;
                        z6 = z4;
                        vertical4 = vertical3;
                        horizontal4 = horizontal3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i2 & 256) != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    lazyListState3 = lazyListState2;
                    horizontal3 = horizontal2;
                    vertical3 = vertical2;
                    flingBehavior3 = flingBehavior2;
                    modifier3 = companion;
                    PaddingValues paddingValues422 = paddingValues2;
                    boolean z722 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1322 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState3, paddingValues422, z722, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1322) | (i1322 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues422;
                    z5 = z722;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    vertical4 = vertical3;
                    horizontal4 = horizontal3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i2 & 256) != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 == 0) {
                }
                lazyListState3 = lazyListState2;
                horizontal3 = horizontal2;
                vertical3 = vertical2;
                flingBehavior3 = flingBehavior2;
                modifier3 = companion;
                PaddingValues paddingValues4222 = paddingValues2;
                boolean z7222 = z3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i13222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4222, z7222, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i13222) | (i13222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues4222;
                z5 = z7222;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                vertical4 = vertical3;
                horizontal4 = horizontal3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i2 & 256) != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 == 0) {
            }
            lazyListState3 = lazyListState2;
            horizontal3 = horizontal2;
            vertical3 = vertical2;
            flingBehavior3 = flingBehavior2;
            modifier3 = companion;
            PaddingValues paddingValues42222 = paddingValues2;
            boolean z72222 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i132222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState3, paddingValues42222, z72222, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i132222) | (i132222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues42222;
            z5 = z72222;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            vertical4 = vertical3;
            horizontal4 = horizontal3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 256) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 == 0) {
        }
        lazyListState3 = lazyListState2;
        horizontal3 = horizontal2;
        vertical3 = vertical2;
        flingBehavior3 = flingBehavior2;
        modifier3 = companion;
        PaddingValues paddingValues422222 = paddingValues2;
        boolean z722222 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1322222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier3, lazyListState3, paddingValues422222, z722222, false, flingBehavior3, z4, 0, null, null, vertical3, horizontal3, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1322222) | (i1322222 & 3670016), ((i3 >> 15) & 14) | ((i3 >> 9) & 112) | ((i3 >> 18) & 896), 896);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues422222;
        z5 = z722222;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        vertical4 = vertical3;
        horizontal4 = horizontal3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, boolean z2, final Function1<? super LazyListScope, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z3;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        int i6;
        int i7;
        boolean z4;
        LazyListState lazyListState3;
        Arrangement.Vertical vertical3;
        Alignment.Horizontal horizontal3;
        FlingBehavior flingBehavior3;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues3;
        final boolean z5;
        final FlingBehavior flingBehavior4;
        final boolean z6;
        final Alignment.Horizontal horizontal4;
        final Arrangement.Vertical vertical4;
        ScopeUpdateScope endRestartGroup;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-740714857);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,8,3,2,7)357@17743L23,363@18097L15,367@18199L388:LazyDsl.kt#428nma");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    i6 = i2 & 128;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i7 = i6;
                        i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= startRestartGroup.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            if ((i3 & 38347923) == 38347922 || !startRestartGroup.getSkipping()) {
                                startRestartGroup.startDefaults();
                                if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                    Modifier.Companion companion = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                        lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                    }
                                    if (i12 != 0) {
                                        paddingValues2 = PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f));
                                    }
                                    if (i4 != 0) {
                                        z3 = false;
                                    }
                                    if ((i2 & 16) != 0) {
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        i3 &= -57345;
                                        vertical2 = !z3 ? arrangement.getTop() : arrangement.getBottom();
                                    }
                                    if (i5 != 0) {
                                        horizontal2 = Alignment.INSTANCE.getStart();
                                    }
                                    if ((i2 & 64) != 0) {
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                        i3 &= -3670017;
                                    }
                                    z4 = i7 == 0 ? true : z2;
                                    lazyListState3 = lazyListState2;
                                    vertical3 = vertical2;
                                    horizontal3 = horizontal2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = companion;
                                } else {
                                    startRestartGroup.skipToGroupEnd();
                                    if ((i2 & 2) != 0) {
                                        i3 &= -113;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 64) != 0) {
                                        i3 &= -3670017;
                                    }
                                    z4 = z2;
                                    lazyListState3 = lazyListState2;
                                    vertical3 = vertical2;
                                    horizontal3 = horizontal2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = modifier2;
                                }
                                PaddingValues paddingValues4 = paddingValues2;
                                boolean z7 = z3;
                                startRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-740714857, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
                                }
                                int i13 = i3 >> 3;
                                composer2 = startRestartGroup;
                                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4, z7, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i13) | (i13 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                lazyListState4 = lazyListState3;
                                paddingValues3 = paddingValues4;
                                z5 = z7;
                                flingBehavior4 = flingBehavior3;
                                z6 = z4;
                                horizontal4 = horizontal3;
                                vertical4 = vertical3;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                z6 = z2;
                                composer2 = startRestartGroup;
                                modifier4 = modifier2;
                                lazyListState4 = lazyListState2;
                                paddingValues3 = paddingValues2;
                                z5 = z3;
                                vertical4 = vertical2;
                                horizontal4 = horizontal2;
                                flingBehavior4 = flingBehavior2;
                            }
                            endRestartGroup = composer2.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$1
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
                                        LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues3, z5, vertical4, horizontal4, flingBehavior4, z6, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if ((i3 & 38347923) == 38347922) {
                        }
                        startRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if ((i2 & 2) != 0) {
                        }
                        if (i12 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                        if (i7 == 0) {
                        }
                        lazyListState3 = lazyListState2;
                        vertical3 = vertical2;
                        horizontal3 = horizontal2;
                        flingBehavior3 = flingBehavior2;
                        modifier3 = companion;
                        PaddingValues paddingValues42 = paddingValues2;
                        boolean z72 = z3;
                        startRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i132 = i3 >> 3;
                        composer2 = startRestartGroup;
                        LazyListKt.LazyList(modifier3, lazyListState3, paddingValues42, z72, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i132) | (i132 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier3;
                        lazyListState4 = lazyListState3;
                        paddingValues3 = paddingValues42;
                        z5 = z72;
                        flingBehavior4 = flingBehavior3;
                        z6 = z4;
                        horizontal4 = horizontal3;
                        vertical4 = vertical3;
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i6;
                    if ((i2 & 256) != 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if ((i2 & 2) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if (i7 == 0) {
                    }
                    lazyListState3 = lazyListState2;
                    vertical3 = vertical2;
                    horizontal3 = horizontal2;
                    flingBehavior3 = flingBehavior2;
                    modifier3 = companion;
                    PaddingValues paddingValues422 = paddingValues2;
                    boolean z722 = z3;
                    startRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i1322 = i3 >> 3;
                    composer2 = startRestartGroup;
                    LazyListKt.LazyList(modifier3, lazyListState3, paddingValues422, z722, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1322) | (i1322 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                    lazyListState4 = lazyListState3;
                    paddingValues3 = paddingValues422;
                    z5 = z722;
                    flingBehavior4 = flingBehavior3;
                    z6 = z4;
                    horizontal4 = horizontal3;
                    vertical4 = vertical3;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                }
                i7 = i6;
                if ((i2 & 256) != 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                if (i11 == 0) {
                }
                if ((i2 & 2) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if (i7 == 0) {
                }
                lazyListState3 = lazyListState2;
                vertical3 = vertical2;
                horizontal3 = horizontal2;
                flingBehavior3 = flingBehavior2;
                modifier3 = companion;
                PaddingValues paddingValues4222 = paddingValues2;
                boolean z7222 = z3;
                startRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i13222 = i3 >> 3;
                composer2 = startRestartGroup;
                LazyListKt.LazyList(modifier3, lazyListState3, paddingValues4222, z7222, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i13222) | (i13222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                lazyListState4 = lazyListState3;
                paddingValues3 = paddingValues4222;
                z5 = z7222;
                flingBehavior4 = flingBehavior3;
                z6 = z4;
                horizontal4 = horizontal3;
                vertical4 = vertical3;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i2 & 256) != 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            if (i11 == 0) {
            }
            if ((i2 & 2) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if (i7 == 0) {
            }
            lazyListState3 = lazyListState2;
            vertical3 = vertical2;
            horizontal3 = horizontal2;
            flingBehavior3 = flingBehavior2;
            modifier3 = companion;
            PaddingValues paddingValues42222 = paddingValues2;
            boolean z72222 = z3;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            int i132222 = i3 >> 3;
            composer2 = startRestartGroup;
            LazyListKt.LazyList(modifier3, lazyListState3, paddingValues42222, z72222, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i132222) | (i132222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            lazyListState4 = lazyListState3;
            paddingValues3 = paddingValues42222;
            z5 = z72222;
            flingBehavior4 = flingBehavior3;
            z6 = z4;
            horizontal4 = horizontal3;
            vertical4 = vertical3;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z3 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i2 & 256) != 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        if (i11 == 0) {
        }
        if ((i2 & 2) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if (i7 == 0) {
        }
        lazyListState3 = lazyListState2;
        vertical3 = vertical2;
        horizontal3 = horizontal2;
        flingBehavior3 = flingBehavior2;
        modifier3 = companion;
        PaddingValues paddingValues422222 = paddingValues2;
        boolean z722222 = z3;
        startRestartGroup.endDefaults();
        if (ComposerKt.isTraceInProgress()) {
        }
        int i1322222 = i3 >> 3;
        composer2 = startRestartGroup;
        LazyListKt.LazyList(modifier3, lazyListState3, paddingValues422222, z722222, true, flingBehavior3, z4, 0, horizontal3, vertical3, null, null, function1, composer2, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (458752 & i1322222) | (i1322222 & 3670016) | ((i3 << 9) & 234881024) | ((i3 << 15) & 1879048192), (i3 >> 18) & 896, 3200);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        lazyListState4 = lazyListState3;
        paddingValues3 = paddingValues422222;
        z5 = z722222;
        flingBehavior4 = flingBehavior3;
        z6 = z4;
        horizontal4 = horizontal3;
        vertical4 = vertical3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0158  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyColumn(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Vertical vertical, Alignment.Horizontal horizontal, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Vertical vertical2;
        int i5;
        Alignment.Horizontal horizontal2;
        FlingBehavior flingBehavior2;
        PaddingValues paddingValues3;
        Alignment.Horizontal horizontal3;
        int i6;
        int i7;
        boolean z3;
        FlingBehavior flingBehavior3;
        Modifier modifier3;
        Arrangement.Vertical vertical3;
        LazyListState lazyListState3;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Vertical vertical4;
        final Alignment.Horizontal horizontal4;
        final FlingBehavior flingBehavior4;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-563353797);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyColumn)P(4,6,1,5,7,3,2)385@18761L23,391@19115L15,394@19178L350:LazyDsl.kt#428nma");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        vertical2 = vertical;
                        if (startRestartGroup.changed(vertical2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        vertical2 = vertical;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    vertical2 = vertical;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    horizontal2 = horizontal;
                    i3 |= startRestartGroup.changed(horizontal2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                }
                                if (i12 != 0) {
                                    paddingValues2 = PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f));
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    vertical2 = !z2 ? arrangement.getTop() : arrangement.getBottom();
                                    i3 &= -57345;
                                }
                                if (i5 != 0) {
                                    horizontal2 = Alignment.INSTANCE.getStart();
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i6 = 12582912;
                                    paddingValues3 = paddingValues2;
                                    vertical3 = vertical2;
                                    horizontal3 = horizontal2;
                                    i7 = -563353797;
                                    lazyListState3 = lazyListState2;
                                    z3 = z2;
                                    modifier3 = modifier5;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
                                    }
                                    composer2 = startRestartGroup;
                                    LazyColumn(modifier3, lazyListState3, paddingValues3, z3, vertical3, horizontal3, flingBehavior3, true, function1, composer2, i6 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    lazyListState4 = lazyListState3;
                                    paddingValues4 = paddingValues3;
                                    z4 = z3;
                                    vertical4 = vertical3;
                                    horizontal4 = horizontal3;
                                    flingBehavior4 = flingBehavior3;
                                } else {
                                    paddingValues3 = paddingValues2;
                                    horizontal3 = horizontal2;
                                    i6 = 12582912;
                                    i7 = -563353797;
                                    z3 = z2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = modifier5;
                                    vertical3 = vertical2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                paddingValues3 = paddingValues2;
                                horizontal3 = horizontal2;
                                i6 = 12582912;
                                z3 = z2;
                                flingBehavior3 = flingBehavior2;
                                modifier3 = modifier2;
                                vertical3 = vertical2;
                                i7 = -563353797;
                            }
                            lazyListState3 = lazyListState2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            LazyColumn(modifier3, lazyListState3, paddingValues3, z3, vertical3, horizontal3, flingBehavior3, true, function1, composer2, i6 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            vertical4 = vertical3;
                            horizontal4 = horizontal3;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            lazyListState4 = lazyListState2;
                            paddingValues4 = paddingValues2;
                            z4 = z2;
                            vertical4 = vertical2;
                            horizontal4 = horizontal2;
                            flingBehavior4 = flingBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyColumn$2
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

                                public final void invoke(Composer composer3, int i13) {
                                    LazyDslKt.LazyColumn(Modifier.this, lazyListState4, paddingValues4, z4, vertical4, horizontal4, flingBehavior4, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    Modifier modifier52 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                }
                horizontal2 = horizontal;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                Modifier modifier522 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            horizontal2 = horizontal;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier5222 = i11 != 0 ? Modifier.INSTANCE : modifier2;
            if ((i2 & 2) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        horizontal2 = horizontal;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier52222 = i11 != 0 ? Modifier.INSTANCE : modifier2;
        if ((i2 & 2) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0158  */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void LazyRow(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Arrangement.Horizontal horizontal, Alignment.Vertical vertical, FlingBehavior flingBehavior, final Function1 function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        LazyListState lazyListState2;
        PaddingValues paddingValues2;
        int i4;
        boolean z2;
        Arrangement.Horizontal horizontal2;
        int i5;
        Alignment.Vertical vertical2;
        FlingBehavior flingBehavior2;
        PaddingValues paddingValues3;
        Alignment.Vertical vertical3;
        int i6;
        int i7;
        boolean z3;
        FlingBehavior flingBehavior3;
        Modifier modifier3;
        Arrangement.Horizontal horizontal3;
        LazyListState lazyListState3;
        Composer composer2;
        final Modifier modifier4;
        final LazyListState lazyListState4;
        final PaddingValues paddingValues4;
        final boolean z4;
        final Arrangement.Horizontal horizontal4;
        final Alignment.Vertical vertical4;
        final FlingBehavior flingBehavior4;
        int i8;
        int i9;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(407929823);
        ComposerKt.sourceInformation(startRestartGroup, "C(LazyRow)P(4,6,1,5,3,7,2)411@19699L23,417@20050L15,420@20113L347:LazyDsl.kt#428nma");
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                lazyListState2 = lazyListState;
                if (startRestartGroup.changed(lazyListState2)) {
                    i10 = 32;
                    i3 |= i10;
                }
            } else {
                lazyListState2 = lazyListState;
            }
            i10 = 16;
            i3 |= i10;
        } else {
            lazyListState2 = lazyListState;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            paddingValues2 = paddingValues;
            i3 |= startRestartGroup.changed(paddingValues2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        horizontal2 = horizontal;
                        if (startRestartGroup.changed(horizontal2)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        horizontal2 = horizontal;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    horizontal2 = horizontal;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    vertical2 = vertical;
                    i3 |= startRestartGroup.changed(vertical2) ? 131072 : 65536;
                    if ((1572864 & i) != 0) {
                        if ((i2 & 64) == 0) {
                            flingBehavior2 = flingBehavior;
                            if (startRestartGroup.changed(flingBehavior2)) {
                                i8 = 1048576;
                                i3 |= i8;
                            }
                        } else {
                            flingBehavior2 = flingBehavior;
                        }
                        i8 = 524288;
                        i3 |= i8;
                    } else {
                        flingBehavior2 = flingBehavior;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= startRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
                        if ((i3 & 4793491) == 4793490 || !startRestartGroup.getSkipping()) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 || startRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                    lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
                                }
                                if (i12 != 0) {
                                    paddingValues2 = PaddingKt.m666PaddingValues0680j_4(Dp.m6265constructorimpl(0.0f));
                                }
                                if (i4 != 0) {
                                    z2 = false;
                                }
                                if ((i2 & 16) != 0) {
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    horizontal2 = !z2 ? arrangement.getStart() : arrangement.getEnd();
                                    i3 &= -57345;
                                }
                                if (i5 != 0) {
                                    vertical2 = Alignment.INSTANCE.getTop();
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                    flingBehavior3 = ScrollableDefaults.INSTANCE.flingBehavior(startRestartGroup, 6);
                                    i6 = 12582912;
                                    paddingValues3 = paddingValues2;
                                    horizontal3 = horizontal2;
                                    vertical3 = vertical2;
                                    i7 = 407929823;
                                    lazyListState3 = lazyListState2;
                                    z3 = z2;
                                    modifier3 = modifier5;
                                    startRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(i7, i3, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
                                    }
                                    composer2 = startRestartGroup;
                                    LazyRow(modifier3, lazyListState3, paddingValues3, z3, horizontal3, vertical3, flingBehavior3, true, function1, composer2, i6 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier4 = modifier3;
                                    lazyListState4 = lazyListState3;
                                    paddingValues4 = paddingValues3;
                                    z4 = z3;
                                    horizontal4 = horizontal3;
                                    vertical4 = vertical3;
                                    flingBehavior4 = flingBehavior3;
                                } else {
                                    paddingValues3 = paddingValues2;
                                    vertical3 = vertical2;
                                    i6 = 12582912;
                                    i7 = 407929823;
                                    z3 = z2;
                                    flingBehavior3 = flingBehavior2;
                                    modifier3 = modifier5;
                                    horizontal3 = horizontal2;
                                }
                            } else {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 2) != 0) {
                                    i3 &= -113;
                                }
                                if ((i2 & 16) != 0) {
                                    i3 &= -57345;
                                }
                                if ((i2 & 64) != 0) {
                                    i3 &= -3670017;
                                }
                                paddingValues3 = paddingValues2;
                                vertical3 = vertical2;
                                i6 = 12582912;
                                z3 = z2;
                                flingBehavior3 = flingBehavior2;
                                modifier3 = modifier2;
                                horizontal3 = horizontal2;
                                i7 = 407929823;
                            }
                            lazyListState3 = lazyListState2;
                            startRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = startRestartGroup;
                            LazyRow(modifier3, lazyListState3, paddingValues3, z3, horizontal3, vertical3, flingBehavior3, true, function1, composer2, i6 | (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | ((i3 << 3) & 234881024), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            lazyListState4 = lazyListState3;
                            paddingValues4 = paddingValues3;
                            z4 = z3;
                            horizontal4 = horizontal3;
                            vertical4 = vertical3;
                            flingBehavior4 = flingBehavior3;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            composer2 = startRestartGroup;
                            modifier4 = modifier2;
                            lazyListState4 = lazyListState2;
                            paddingValues4 = paddingValues2;
                            z4 = z2;
                            horizontal4 = horizontal2;
                            vertical4 = vertical2;
                            flingBehavior4 = flingBehavior2;
                        }
                        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyDslKt$LazyRow$2
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

                                public final void invoke(Composer composer3, int i13) {
                                    LazyDslKt.LazyRow(Modifier.this, lazyListState4, paddingValues4, z4, horizontal4, vertical4, flingBehavior4, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if ((i3 & 4793491) == 4793490) {
                    }
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    Modifier modifier52 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 2) != 0) {
                    }
                    if (i12 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 16) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                }
                vertical2 = vertical;
                if ((1572864 & i) != 0) {
                }
                if ((i2 & 128) == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                startRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                Modifier modifier522 = i11 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                }
                if (i12 != 0) {
                }
                if (i4 != 0) {
                }
                if ((i2 & 16) != 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            vertical2 = vertical;
            if ((1572864 & i) != 0) {
            }
            if ((i2 & 128) == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            Modifier modifier5222 = i11 != 0 ? Modifier.INSTANCE : modifier2;
            if ((i2 & 2) != 0) {
            }
            if (i12 != 0) {
            }
            if (i4 != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if (i5 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
        }
        paddingValues2 = paddingValues;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        vertical2 = vertical;
        if ((1572864 & i) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        Modifier modifier52222 = i11 != 0 ? Modifier.INSTANCE : modifier2;
        if ((i2 & 2) != 0) {
        }
        if (i12 != 0) {
        }
        if (i4 != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if (i5 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List list, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(list.size(), function1 != null ? new LazyDslKt$items$2(function1, list) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, list), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(function4, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List list, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(list.size(), function2 != null ? new LazyDslKt$itemsIndexed$2(function2, list) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(function5, list)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] objArr, Function1 function1, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        lazyListScope.items(objArr.length, function1 != null ? new LazyDslKt$items$6(function1, objArr) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, objArr), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] objArr, Function2 function2, Function5 function5, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = null;
        }
        lazyListScope.items(objArr.length, function2 != null ? new LazyDslKt$itemsIndexed$6(function2, objArr) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(objArr), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(function5, objArr)));
    }
}
