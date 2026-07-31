package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusManagerImpl;
import androidx.compose.ui.focus.FocusModifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifier;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.ProcessResult;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifierCore;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.os.SavedStateRegistryOwner;
import androidx.os.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.X3;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0080\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0002\u0097\u0003\b\u0001\u0018\u0000 Æ\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004Æ\u0003Ç\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0011J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J \u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010'\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010 J \u0010+\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001cH\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010$J1\u00100\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u001eH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b2\u0010 J\u000f\u00103\u001a\u00020\u000bH\u0002¢\u0006\u0004\b3\u0010\u0018J\u0017\u00103\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000bH\u0002¢\u0006\u0004\b5\u0010\u0018J\u000f\u00106\u001a\u00020\u001eH\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b8\u0010 J\u0017\u00109\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b9\u0010 J!\u0010=\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u00020\u00122\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ)\u0010J\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u00122\b\u0010I\u001a\u0004\u0018\u00010?H\u0014¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u0010L\u001a\u00020\u001eH\u0016¢\u0006\u0004\bM\u0010NJ\u001d\u0010S\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020OH\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010RJ\u0017\u0010V\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\bV\u0010\u0011J\u0017\u0010W\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010\u0011J\r\u0010X\u001a\u00020\u000b¢\u0006\u0004\bX\u0010\u0018J\u000f\u0010Y\u001a\u00020\u000bH\u0016¢\u0006\u0004\bY\u0010\u0018J\u001d\u0010\\\u001a\u00020\u000b2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000b0ZH\u0016¢\u0006\u0004\b\\\u0010]J\u001d\u0010a\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020\u000e¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\bc\u0010dJ\u001d\u0010g\u001a\u00020\u000b2\u0006\u0010_\u001a\u00020^2\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0017\u0010j\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u001eH\u0016¢\u0006\u0004\bj\u0010NJ%\u0010j\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020kH\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000eH\u0016¢\u0006\u0004\bo\u0010\u0011J\u001f\u0010q\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u001eH\u0016¢\u0006\u0004\bq\u0010rJ\u001f\u0010s\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u001eH\u0016¢\u0006\u0004\bs\u0010rJ\u001f\u0010v\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0012H\u0014¢\u0006\u0004\bv\u0010wJ7\u0010}\u001a\u00020\u000b2\u0006\u0010x\u001a\u00020\u001e2\u0006\u0010y\u001a\u00020\u00122\u0006\u0010z\u001a\u00020\u00122\u0006\u0010{\u001a\u00020\u00122\u0006\u0010|\u001a\u00020\u0012H\u0014¢\u0006\u0004\b}\u0010~J\u0018\u0010\u007f\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020eH\u0014¢\u0006\u0005\b\u007f\u0010\u0080\u0001J9\u0010\u0086\u0001\u001a\u00030\u0085\u00012\u0015\u0010\u0083\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u0082\u0001\u0012\u0004\u0012\u00020\u000b0\u0081\u00012\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0ZH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001c\u0010\u008b\u0001\u001a\u00020\u001e2\b\u0010\u0088\u0001\u001a\u00030\u0085\u0001H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0011\u0010\u008c\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u008c\u0001\u0010\u0018J\u0019\u0010\u008d\u0001\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0011J\u001b\u0010\u008f\u0001\u001a\u00020\u000b2\u0007\u0010[\u001a\u00030\u008e\u0001H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J#\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00012\u0006\u0010P\u001a\u00020OH\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0095\u0001\u001a\u00020\u000b2\u0006\u0010f\u001a\u00020eH\u0014¢\u0006\u0006\b\u0095\u0001\u0010\u0080\u0001J%\u0010\u0099\u0001\u001a\u00020\u000b2\b\u0010\u0088\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J'\u0010\u009c\u0001\u001a\u00020\u000b2\u0015\u0010\u009b\u0001\u001a\u0010\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u000b0\u0081\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0016\u0010\u009e\u0001\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0016\u0010 \u0001\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0006\b \u0001\u0010\u009f\u0001J\u0011\u0010¡\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¡\u0001\u0010\u0018J\u0011\u0010¢\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\b¢\u0001\u0010\u0018J\u0011\u0010£\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\b£\u0001\u0010\u0018J'\u0010§\u0001\u001a\u00020\u000b2\n\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00012\u0007\u0010¦\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J#\u0010¬\u0001\u001a\u00020\u000b2\u000f\u0010«\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0019\u0010®\u0001\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0005\b®\u0001\u0010 J\u0019\u0010¯\u0001\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0005\b¯\u0001\u0010 J\u001a\u0010°\u0001\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00020\u001e2\u0006\u0010H\u001a\u00020\u0012H\u0016¢\u0006\u0006\b²\u0001\u0010±\u0001J#\u0010·\u0001\u001a\u00030³\u00012\b\u0010´\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\bµ\u0001\u0010¶\u0001J#\u0010º\u0001\u001a\u00030³\u00012\b\u0010¸\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\b¹\u0001\u0010¶\u0001J\u0011\u0010»\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\b»\u0001\u00107J\u001f\u0010¿\u0001\u001a\u0005\u0018\u00010¾\u00012\b\u0010½\u0001\u001a\u00030¼\u0001H\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J#\u0010Ã\u0001\u001a\u00030³\u00012\b\u0010Á\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\bÂ\u0001\u0010¶\u0001J#\u0010Å\u0001\u001a\u00030³\u00012\b\u0010´\u0001\u001a\u00030³\u0001H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\bÄ\u0001\u0010¶\u0001J\u001c\u0010È\u0001\u001a\u00020\u000b2\b\u0010Ç\u0001\u001a\u00030Æ\u0001H\u0014¢\u0006\u0006\bÈ\u0001\u0010É\u0001J\u001b\u0010Ë\u0001\u001a\u00020\u000b2\u0007\u0010Ê\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\bË\u0001\u0010Ì\u0001J\u0019\u0010Í\u0001\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0005\bÍ\u0001\u0010 J\u001a\u0010Î\u0001\u001a\u0004\u0018\u00010;2\u0006\u0010:\u001a\u00020\u0012¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ð\u0001\u001a\u00020\u001eH\u0016¢\u0006\u0005\bÐ\u0001\u00107R#\u0010Ñ\u0001\u001a\u00030³\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ô\u0001R \u0010Ö\u0001\u001a\u00030Õ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R,\u0010Ü\u0001\u001a\u00030Ú\u00012\b\u0010Û\u0001\u001a\u00030Ú\u00018\u0016@RX\u0096\u000e¢\u0006\u0010\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010á\u0001\u001a\u00030à\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010ä\u0001\u001a\u00030ã\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0018\u0010ç\u0001\u001a\u00030æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R\u0018\u0010ê\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u0018\u0010í\u0001\u001a\u00030ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ð\u0001\u001a\u00030ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001f\u0010ò\u0001\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R \u0010÷\u0001\u001a\u00030ö\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R \u0010ü\u0001\u001a\u00030û\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bü\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R\u0018\u0010\u0081\u0002\u001a\u00030\u0080\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0082\u0002R \u0010\u0084\u0002\u001a\u00030\u0083\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001f\u0010\u0089\u0002\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R#\u0010\u008b\u0002\u001a\f\u0012\u0005\u0012\u00030\u0085\u0001\u0018\u00010\u0088\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008a\u0002R\u0019\u0010\u008c\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010Ô\u0001R\u0018\u0010\u008e\u0002\u001a\u00030\u008d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0018\u0010\u0091\u0002\u001a\u00030\u0090\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R7\u0010\u0093\u0002\u001a\u0010\u0012\u0005\u0012\u00030Æ\u0001\u0012\u0004\u0012\u00020\u000b0\u0081\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u0094\u0002\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002\"\u0006\b\u0097\u0002\u0010\u009d\u0001R\u001a\u0010\u0099\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009b\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010Ô\u0001R \u0010\u009d\u0002\u001a\u00030\u009c\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R \u0010¢\u0002\u001a\u00030¡\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010£\u0002\u001a\u0006\b¤\u0002\u0010¥\u0002R \u0010§\u0002\u001a\u00030¦\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0002\u0010¨\u0002\u001a\u0006\b©\u0002\u0010ª\u0002R.\u0010«\u0002\u001a\u00020\u001e8\u0016@\u0016X\u0096\u000e¢\u0006\u001d\n\u0006\b«\u0002\u0010Ô\u0001\u0012\u0005\b®\u0002\u0010\u0018\u001a\u0005\b¬\u0002\u00107\"\u0005\b\u00ad\u0002\u0010NR\u001c\u0010°\u0002\u001a\u0005\u0018\u00010¯\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0002\u0010±\u0002R\u001c\u0010³\u0002\u001a\u0005\u0018\u00010²\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010´\u0002R$\u0010µ\u0002\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bµ\u0002\u0010¶\u0002R\u0019\u0010·\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010Ô\u0001R\u0018\u0010¹\u0002\u001a\u00030¸\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0002\u0010º\u0002R \u0010¼\u0002\u001a\u00030»\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b¼\u0002\u0010½\u0002\u001a\u0006\b¾\u0002\u0010¿\u0002R#\u0010Á\u0002\u001a\u00030À\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bÁ\u0002\u0010Ò\u0001R\u0018\u0010Ã\u0002\u001a\u00030Â\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0002\u0010Ä\u0002R!\u0010Æ\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bÆ\u0002\u0010Ç\u0002R!\u0010È\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bÈ\u0002\u0010Ç\u0002R0\u0010É\u0002\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÉ\u0002\u0010Ò\u0001\u0012\u0005\bÎ\u0002\u0010\u0018\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R\u0019\u0010Ï\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Ô\u0001R#\u0010Ð\u0002\u001a\u00030³\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\b\n\u0006\bÐ\u0002\u0010Ò\u0001R\u0019\u0010Ñ\u0002\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010Ô\u0001R9\u0010Ø\u0002\u001a\u0005\u0018\u00010\u009a\u00012\n\u0010Û\u0001\u001a\u0005\u0018\u00010\u009a\u00018F@BX\u0086\u008e\u0002¢\u0006\u0018\n\u0006\bÒ\u0002\u0010Ó\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R)\u0010Ù\u0002\u001a\u0012\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010\u0094\u0002R\u0018\u0010Û\u0002\u001a\u00030Ú\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u0018\u0010Þ\u0002\u001a\u00030Ý\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u0018\u0010á\u0002\u001a\u00030à\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0002\u0010â\u0002R\u0018\u0010ä\u0002\u001a\u00030ã\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bä\u0002\u0010å\u0002R'\u0010ç\u0002\u001a\u00030æ\u00028\u0016X\u0096\u0004¢\u0006\u0017\n\u0006\bç\u0002\u0010è\u0002\u0012\u0005\bë\u0002\u0010\u0018\u001a\u0006\bé\u0002\u0010ê\u0002R'\u0010í\u0002\u001a\u00030ì\u00028\u0016X\u0097\u0004¢\u0006\u0017\n\u0006\bí\u0002\u0010î\u0002\u0012\u0005\bñ\u0002\u0010\u0018\u001a\u0006\bï\u0002\u0010ð\u0002R5\u0010ø\u0002\u001a\u00030ò\u00022\b\u0010Û\u0001\u001a\u00030ò\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bó\u0002\u0010Ó\u0002\u001a\u0006\bô\u0002\u0010õ\u0002\"\u0006\bö\u0002\u0010÷\u0002R\u0019\u0010ù\u0002\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bù\u0002\u0010ú\u0002R5\u0010Ê\u0001\u001a\u00030û\u00022\b\u0010Û\u0001\u001a\u00030û\u00028V@RX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\bü\u0002\u0010Ó\u0002\u001a\u0006\bý\u0002\u0010þ\u0002\"\u0006\bÿ\u0002\u0010\u0080\u0003R \u0010\u0082\u0003\u001a\u00030\u0081\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0082\u0003\u0010\u0083\u0003\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003R\u0018\u0010\u0087\u0003\u001a\u00030\u0086\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0003\u0010\u0088\u0003R \u0010\u008a\u0003\u001a\u00030\u0089\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008a\u0003\u0010\u008b\u0003\u001a\u0006\b\u008c\u0003\u0010\u008d\u0003R\u001b\u0010\u008e\u0003\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0003\u0010\u008f\u0003R\u0019\u0010\u0090\u0003\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0003\u0010Ò\u0001R\u001f\u0010\u0092\u0003\u001a\n\u0012\u0005\u0012\u00030\u0085\u00010\u0091\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0003\u0010\u0093\u0003R&\u0010\u0095\u0003\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010Z0\u0094\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0003\u0010\u0096\u0003R\u0018\u0010\u0098\u0003\u001a\u00030\u0097\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0003\u0010\u0099\u0003R\u0018\u0010\u009b\u0003\u001a\u00030\u009a\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0019\u0010\u009d\u0003\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0003\u0010Ô\u0001R\u001d\u0010\u009e\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0Z8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0003\u0010\u009f\u0003R\u0018\u0010¡\u0003\u001a\u00030 \u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0003\u0010¢\u0003R\u001c\u0010¤\u0003\u001a\u0005\u0018\u00010£\u00038\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0003\u0010¥\u0003R \u0010§\u0003\u001a\u00030¦\u00038\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0003\u0010¨\u0003\u001a\u0006\b©\u0003\u0010ª\u0003R\u001c\u0010\u00ad\u0003\u001a\u00020\u0012*\u00030Æ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0003\u0010¬\u0003R\u0016\u0010_\u001a\u00020;8VX\u0096\u0004¢\u0006\b\u001a\u0006\b®\u0003\u0010¯\u0003R\u0018\u0010³\u0003\u001a\u00030°\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0003\u0010²\u0003R\u0018\u0010·\u0003\u001a\u00030´\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0003\u0010¶\u0003R\u001a\u0010¬\u0001\u001a\u0005\u0018\u00010¸\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¹\u0003\u0010º\u0003R\u0018\u0010½\u0003\u001a\u00030¯\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b»\u0003\u0010¼\u0003R\u0017\u0010¿\u0003\u001a\u00020-8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0003\u0010Ë\u0002R\u0016\u0010Á\u0003\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0003\u00107R\u0018\u0010Å\u0003\u001a\u00030Â\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0003\u0010Ä\u0003\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006È\u0003"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/view/ViewGroup;", "Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/platform/ViewRootForTest;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "viewGroup", "", "clearChildInvalidObservations", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/node/LayoutNode;", "nodeToRemeasure", "scheduleMeasureAndLayout", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "measureSpec", "Lkotlin/Pair;", "convertMeasureSpec", "(I)Lkotlin/Pair;", "updatePositionCacheAndDispatch", "()V", "node", "invalidateLayoutNodeMeasurement", "invalidateLayers", "Landroid/view/MotionEvent;", "event", "", "handleRotaryEvent", "(Landroid/view/MotionEvent;)Z", "motionEvent", "Landroidx/compose/ui/input/pointer/ProcessResult;", "handleMotionEvent-8iAsVTc", "(Landroid/view/MotionEvent;)I", "handleMotionEvent", "lastEvent", "hasChangedDevices", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z", "isDevicePressEvent", "sendMotionEvent-8iAsVTc", "sendMotionEvent", "action", "", "eventTime", "forceHover", "sendSimulatedEvent", "(Landroid/view/MotionEvent;IJZ)V", "isInBounds", "recalculateWindowPosition", "(Landroid/view/MotionEvent;)V", "recalculateWindowViewTransforms", "autofillSupported", "()Z", "isBadMotionEvent", "isPositionChanged", "accessibilityId", "Landroid/view/View;", "currentView", "findViewByAccessibilityIdRootedAtCurrentView", "(ILandroid/view/View;)Landroid/view/View;", "Landroid/graphics/Rect;", "rect", "getFocusedRect", "(Landroid/graphics/Rect;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", X3.i.u0, "(Landroidx/lifecycle/LifecycleOwner;)V", "gainFocus", "direction", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "sendKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "sendKeyEvent", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "onAttach", "onDetach", "requestClearInvalidObservations", "onEndApplyChanges", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerOnEndApplyChangesListener", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "view", "layoutNode", "addAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroidx/compose/ui/node/LayoutNode;)V", "removeAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "Landroid/graphics/Canvas;", "canvas", "drawAndroidView", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;Landroid/graphics/Canvas;)V", "sendPointerUpdate", "measureAndLayout", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "forceMeasureTheSubtree", "forceRequest", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "onRequestRelayout", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "onDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "invalidateParentLayer", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/node/OwnedLayer;", AdRevenueConstants.LAYER_KEY, "recycle$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;)Z", "recycle", "onSemanticsChange", "onLayoutChange", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "dispatchDraw", "isDirty", "notifyLayerIsDirty$ui_release", "(Landroidx/compose/ui/node/OwnedLayer;Z)V", "notifyLayerIsDirty", "Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "callback", "setOnViewTreeOwnersAvailable", "(Lkotlin/jvm/functions/Function1;)V", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keyboardVisibilityEventLoop", "invalidateDescendants", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/ViewStructure;", "structure", "flags", "onProvideAutofillVirtualStructure", "(Landroid/view/ViewStructure;I)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "autofill", "(Landroid/util/SparseArray;)V", "dispatchGenericMotionEvent", "dispatchTouchEvent", "canScrollHorizontally", "(I)Z", "canScrollVertically", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "localToScreen-MK-Hz9U", "(J)J", "localToScreen", "positionOnScreen", "screenToLocal-MK-Hz9U", "screenToLocal", "onCheckIsTextEditor", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "onCreateInputConnection", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "calculatePositionInWindow-MK-Hz9U", "calculatePositionInWindow", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "layoutDirection", "onRtlPropertiesChanged", "(I)V", "dispatchHoverEvent", "findViewByAccessibilityIdTraversal", "(I)Landroid/view/View;", "shouldDelayChildPressedState", "lastDownPointerPosition", "J", "superclassInitComplete", "Z", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "Landroidx/compose/ui/unit/Density;", "<set-?>", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "semanticsModifier", "Landroidx/compose/ui/semantics/SemanticsModifierCore;", "Landroidx/compose/ui/focus/FocusManagerImpl;", "_focusManager", "Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/platform/WindowInfoImpl;", "_windowInfo", "Landroidx/compose/ui/platform/WindowInfoImpl;", "Landroidx/compose/ui/input/key/KeyInputModifier;", "keyInputModifier", "Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/Modifier;", "rotaryInputModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/CanvasHolder;", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "accessibilityDelegate", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "", "dirtyLayers", "Ljava/util/List;", "postponedDirtyLayers", "isDrawingContent", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "motionEventAdapter", "Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "pointerInputEventProcessor", "Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "configurationChangeObserver", "Lkotlin/jvm/functions/Function1;", "getConfigurationChangeObserver", "()Lkotlin/jvm/functions/Function1;", "setConfigurationChangeObserver", "Landroidx/compose/ui/autofill/AndroidAutofill;", "_autofill", "Landroidx/compose/ui/autofill/AndroidAutofill;", "observationClearRequested", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/AndroidClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AndroidAccessibilityManager;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "showLayoutBounds", "getShowLayoutBounds", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "_androidViewsHandler", "Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroidx/compose/ui/platform/DrawChildContainer;", "viewLayersContainer", "Landroidx/compose/ui/platform/DrawChildContainer;", "onMeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "wasMeasuredWithMultipleConstraints", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "measureAndLayoutDelegate", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "Landroidx/compose/ui/unit/IntOffset;", "globalPosition", "", "tmpPositionArray", "[I", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "[F", "windowToViewMatrix", "lastMatrixRecalculationAnimationTime", "getLastMatrixRecalculationAnimationTime$ui_release", "()J", "setLastMatrixRecalculationAnimationTime$ui_release", "(J)V", "getLastMatrixRecalculationAnimationTime$ui_release$annotations", "forceUseMatrixCache", "windowPosition", "isRenderNodeCompatible", "viewTreeOwners$delegate", "Landroidx/compose/runtime/MutableState;", "getViewTreeOwners", "()Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "setViewTreeOwners", "(Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;)V", "viewTreeOwners", "onViewTreeOwnersAvailable", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "globalLayoutListener", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "scrollChangedListener", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "touchModeChangeListener", "Landroid/view/ViewTreeObserver$OnTouchModeChangeListener;", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "textInputServiceAndroid", "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService$annotations", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver$delegate", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "setFontFamilyResolver", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "fontFamilyResolver", "currentFontWeightAdjustment", "I", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection$delegate", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "Landroidx/compose/ui/input/InputModeManagerImpl;", "_inputModeManager", "Landroidx/compose/ui/input/InputModeManagerImpl;", "Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "previousMotionEvent", "Landroid/view/MotionEvent;", "relayoutTime", "Landroidx/compose/ui/platform/WeakCache;", "layerCache", "Landroidx/compose/ui/platform/WeakCache;", "Landroidx/compose/runtime/collection/MutableVector;", "endApplyChangesListeners", "Landroidx/compose/runtime/collection/MutableVector;", "androidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1", "resendMotionEventRunnable", "Landroidx/compose/ui/platform/AndroidComposeView$resendMotionEventRunnable$1;", "Ljava/lang/Runnable;", "sendHoverExitEvent", "Ljava/lang/Runnable;", "hoverExitReceived", "resendMotionEventOnLayout", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "matrixToWindow", "Landroidx/compose/ui/platform/CalculateMatrixToWindow;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "desiredPointerIcon", "Landroidx/compose/ui/input/pointer/PointerIcon;", "Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "getFontWeightAdjustmentCompat", "(Landroid/content/res/Configuration;)I", "fontWeightAdjustmentCompat", "getView", "()Landroid/view/View;", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "getAndroidViewsHandler$ui_release", "()Landroidx/compose/ui/platform/AndroidViewsHandler;", "androidViewsHandler", "getMeasureIteration", "measureIteration", "getHasPendingMeasureOrLayout", "hasPendingMeasureOrLayout", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "Companion", "ViewTreeOwners", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes8.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Method getBooleanMethod;
    private static Class systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final FocusManagerImpl _focusManager;
    private final InputModeManagerImpl _inputModeManager;
    private final WindowInfoImpl _windowInfo;
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboardManager clipboardManager;
    private Function1 configurationChangeObserver;
    private int currentFontWeightAdjustment;
    private Density density;
    private PointerIcon desiredPointerIcon;
    private final List dirtyLayers;
    private final MutableVector endApplyChangesListeners;

    /* renamed from: fontFamilyResolver$delegate, reason: from kotlin metadata */
    private final MutableState fontFamilyResolver;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final KeyInputModifier keyInputModifier;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache layerCache;

    /* renamed from: layoutDirection$delegate, reason: from kotlin metadata */
    private final MutableState layoutDirection;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private Function1 onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private long relayoutTime;
    private final Function0 resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final Modifier rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final SemanticsModifierCore semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final TextInputServiceAndroid textInputServiceAndroid;
    private final TextToolbar textToolbar;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;

    /* renamed from: viewTreeOwners$delegate, reason: from kotlin metadata */
    private final MutableState viewTreeOwners;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    @Deprecated
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onAttach(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context) {
        super(context);
        CalculateMatrixToWindow calculateMatrixToWindowApi21;
        Intrinsics.checkNotNullParameter(context, "context");
        Offset.Companion companion = Offset.INSTANCE;
        this.lastDownPointerPosition = companion.m1307getUnspecifiedF1C5BW0();
        int i = 1;
        this.superclassInitComplete = true;
        this.sharedDrawScope = new LayoutNodeDrawScope(null, i, 0 == true ? 1 : 0);
        this.density = AndroidDensity_androidKt.Density(context);
        SemanticsModifierCore semanticsModifierCore = new SemanticsModifierCore(SemanticsModifierCore.INSTANCE.generateSemanticsId(), false, false, new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeView$semanticsModifier$1
            public final void invoke(@NotNull SemanticsPropertyReceiver $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SemanticsPropertyReceiver) obj);
                return Unit.INSTANCE;
            }
        });
        this.semanticsModifier = semanticsModifierCore;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        this._focusManager = focusManagerImpl;
        this._windowInfo = new WindowInfoImpl();
        KeyInputModifier keyInputModifier = new KeyInputModifier(new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m2086invokeZmokQxo(((KeyEvent) obj).getNativeKeyEvent());
            }

            @NotNull
            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m2086invokeZmokQxo(@NotNull android.view.KeyEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                FocusDirection m2083getFocusDirectionP8AzH3I = AndroidComposeView.this.m2083getFocusDirectionP8AzH3I(it);
                if (m2083getFocusDirectionP8AzH3I == null || !KeyEventType.m1803equalsimpl0(KeyEvent_androidKt.m1811getTypeZmokQxo(it), KeyEventType.INSTANCE.m1807getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(AndroidComposeView.this.getFocusManager().mo1260moveFocus3ESFkO8(m2083getFocusDirectionP8AzH3I.getValue()));
            }
        }, null);
        this.keyInputModifier = keyInputModifier;
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier onRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull RotaryScrollEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = onRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 1, null);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setModifier(companion2.then(semanticsModifierCore).then(onRotaryScrollEvent).then(focusManagerImpl.getModifier()).then(keyInputModifier));
        layoutNode.setDensity(getDensity());
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            public final void invoke(@NotNull Configuration it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Configuration) obj);
                return Unit.INSTANCE;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        this.clipboardManager = new AndroidClipboardManager(context);
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        Intrinsics.checkNotNullExpressionValue(viewConfiguration, "get(context)");
        this.viewConfiguration = new AndroidViewConfiguration(viewConfiguration);
        this.globalPosition = IntOffset.INSTANCE.m2558getZeronOccac();
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = Matrix.m1515constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m1515constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = companion.m1306getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.m2077globalLayoutListener$lambda1(AndroidComposeView.this);
            }
        };
        this.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.m2079scrollChangedListener$lambda2(AndroidComposeView.this);
            }
        };
        this.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda3
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                AndroidComposeView.m2082touchModeChangeListener$lambda3(AndroidComposeView.this, z);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(this);
        this.textInputServiceAndroid = textInputServiceAndroid;
        this.textInputService = (TextInputService) AndroidComposeView_androidKt.getTextInputServiceFactory().invoke(textInputServiceAndroid);
        this.fontLoader = new AndroidFontResourceLoader(context);
        this.fontFamilyResolver = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        Configuration configuration = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration2, "context.resources.configuration");
        this.layoutDirection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AndroidComposeView_androidKt.getLocaleLayoutDirection(configuration2), null, 2, null);
        this.hapticFeedBack = new PlatformHapticFeedback(this);
        this._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.INSTANCE.m1776getTouchaOaMEAU() : InputMode.INSTANCE.m1775getKeyboardaOaMEAU(), new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m2085invokeiuPiT84(((InputMode) obj).getValue());
            }

            @NotNull
            /* renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m2085invokeiuPiT84(int i2) {
                boolean requestFocusFromTouch;
                InputMode.Companion companion3 = InputMode.INSTANCE;
                if (InputMode.m1771equalsimpl0(i2, companion3.m1776getTouchaOaMEAU())) {
                    requestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
                } else {
                    requestFocusFromTouch = InputMode.m1771equalsimpl0(i2, companion3.m1775getKeyboardaOaMEAU()) ? AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true : false;
                }
                return Boolean.valueOf(requestFocusFromTouch);
            }
        }, null);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new WeakCache();
        this.endApplyChangesListeners = new MutableVector(new Function0[16], 0);
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                MotionEvent motionEvent;
                long j;
                AndroidComposeView.this.removeCallbacks(this);
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i2 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i2 = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    j = androidComposeView.relayoutTime;
                    androidComposeView.sendSimulatedEvent(motionEvent, i2, j, false);
                }
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.m2080sendHoverExitEvent$lambda5(AndroidComposeView.this);
            }
        };
        this.resendMotionEventOnLayout = new Function0() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                m2087invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m2087invoke() {
                MotionEvent motionEvent;
                AndroidComposeView$resendMotionEventRunnable$1 androidComposeView$resendMotionEventRunnable$1;
                motionEvent = AndroidComposeView.this.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        AndroidComposeView.this.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView = AndroidComposeView.this;
                        androidComposeView$resendMotionEventRunnable$1 = androidComposeView.resendMotionEventRunnable;
                        androidComposeView.post(androidComposeView$resendMotionEventRunnable$1);
                    }
                }
            }
        };
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi29();
        } else {
            calculateMatrixToWindowApi21 = new CalculateMatrixToWindowApi21();
        }
        this.matrixToWindow = calculateMatrixToWindowApi21;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        Function1 onViewCreatedCallback = ViewRootForTest.INSTANCE.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        getRoot().attach$ui_release(this);
        if (i2 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setCurrent(PointerIcon value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AndroidComposeView.this.desiredPointerIcon = value;
            }
        };
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Density getDensity() {
        return this.density;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusManager getFocusManager() {
        return this._focusManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    @NotNull
    public LayoutNode getRoot() {
        return this.root;
    }

    @NotNull
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @NotNull
    public final Function1 getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final void setConfigurationChangeObserver(@NotNull Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.configurationChangeObserver = function1;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        Intrinsics.checkNotNull(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    /* renamed from: getLastMatrixRecalculationAnimationTime$ui_release, reason: from getter */
    public final long getLastMatrixRecalculationAnimationTime() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    private final void setViewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.viewTreeOwners.setValue(viewTreeOwners);
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: globalLayoutListener$lambda-1, reason: not valid java name */
    public static final void m2077globalLayoutListener$lambda1(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: scrollChangedListener$lambda-2, reason: not valid java name */
    public static final void m2079scrollChangedListener$lambda2(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.updatePositionCacheAndDispatch();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: touchModeChangeListener$lambda-3, reason: not valid java name */
    public static final void m2082touchModeChangeListener$lambda3(AndroidComposeView this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0._inputModeManager.m1778setInputModeiuPiT84(z ? InputMode.INSTANCE.m1776getTouchaOaMEAU() : InputMode.INSTANCE.m1775getKeyboardaOaMEAU());
        this$0._focusManager.fetchUpdatedFocusProperties();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver.setValue(resolver);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver.getValue();
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        int i;
        if (Build.VERSION.SDK_INT < 31) {
            return 0;
        }
        i = configuration.fontWeightAdjustment;
        return i;
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection.setValue(layoutDirection);
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sendHoverExitEvent$lambda-5, reason: not valid java name */
    public static final void m2080sendHoverExitEvent$lambda5(AndroidComposeView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.hoverExitReceived = false;
        MotionEvent motionEvent = this$0.previousMotionEvent;
        Intrinsics.checkNotNull(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        this$0.m2081sendMotionEvent8iAsVTc(motionEvent);
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        Unit unit;
        androidx.compose.ui.geometry.Rect focusRect;
        Intrinsics.checkNotNullParameter(rect, "rect");
        FocusModifier activeFocusModifier$ui_release = this._focusManager.getActiveFocusModifier$ui_release();
        if (activeFocusModifier$ui_release == null || (focusRect = FocusTraversalKt.focusRect(activeFocusModifier$ui_release)) == null) {
            unit = null;
        } else {
            rect.left = MathKt.roundToInt(focusRect.getLeft());
            rect.top = MathKt.roundToInt(focusRect.getTop());
            rect.right = MathKt.roundToInt(focusRect.getRight());
            rect.bottom = MathKt.roundToInt(focusRect.getBottom());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        setShowLayoutBounds(INSTANCE.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        Log.d("Compose Focus", "Owner FocusChanged(" + gainFocus + ')');
        FocusManagerImpl focusManagerImpl = this._focusManager;
        if (gainFocus) {
            focusManagerImpl.takeFocus();
        } else {
            focusManagerImpl.releaseFocus();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(hasWindowFocus);
        super.onWindowFocusChanged(hasWindowFocus);
        if (!hasWindowFocus || getShowLayoutBounds() == (isShowingLayoutBounds = INSTANCE.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    /* renamed from: sendKeyEvent-ZmokQxo, reason: not valid java name */
    public boolean m2084sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        return this.keyInputModifier.m1815processKeyInputZmokQxo(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isFocused()) {
            return m2084sendKeyEventZmokQxo(KeyEvent.m1796constructorimpl(event));
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.measureAndLayoutDelegate.onNodeDetached(node);
        requestClearInvalidObservations();
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.isNotEmpty()) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i = 0; i < size; i++) {
                Function0 function0 = (Function0) this.endApplyChangesListeners.getContent()[i];
                this.endApplyChangesListeners.set(i, null);
                if (function0 != null) {
                    function0.mo4828invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(Function0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.endApplyChangesListeners.contains(listener)) {
            return;
        }
        this.endApplyChangesListeners.add(listener);
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    public final void addAndroidView(AndroidViewHolder view, final LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(view, layoutNode);
        getAndroidViewsHandler$ui_release().addView(view);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, view);
        ViewCompat.setImportantForAccessibility(view, 1);
        ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView$addAndroidView$1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(LayoutNode.this);
                Intrinsics.checkNotNull(outerSemantics);
                SemanticsNode parent = new SemanticsNode(outerSemantics, false).getParent();
                Intrinsics.checkNotNull(parent);
                int id = parent.getId();
                if (id == this.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                    id = -1;
                }
                info.setParent(this, id);
            }
        });
    }

    public final void removeAndroidView(AndroidViewHolder view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getAndroidViewsHandler$ui_release().removeView(view);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        TypeIntrinsics.asMutableMap(layoutNodeToHolder).remove(getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(view));
        ViewCompat.setImportantForAccessibility(view, 0);
    }

    public final void drawAndroidView(AndroidViewHolder view, Canvas canvas) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(view, canvas);
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    private final void scheduleMeasureAndLayout(LayoutNode nodeToRemeasure) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (this.wasMeasuredWithMultipleConstraints && nodeToRemeasure != null) {
            while (nodeToRemeasure != null && nodeToRemeasure.getMeasuredByParent() == LayoutNode.UsageByParent.InMeasureBlock) {
                nodeToRemeasure = nodeToRemeasure.getParent$ui_release();
            }
            if (nodeToRemeasure == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean sendPointerUpdate) {
        Function0 function0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (sendPointerUpdate) {
            try {
                function0 = this.resendMotionEventOnLayout;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            function0 = null;
        }
        if (this.measureAndLayoutDelegate.measureAndLayout(function0)) {
            requestLayout();
        }
        MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
        Unit unit = Unit.INSTANCE;
        Trace.endSection();
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo2075measureAndLayout0kLqBqw(LayoutNode layoutNode, long constraints) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m2058measureAndLayout0kLqBqw(layoutNode, constraints);
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean forceRequest) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, forceRequest)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            Pair convertMeasureSpec = convertMeasureSpec(widthMeasureSpec);
            int intValue = ((Number) convertMeasureSpec.component1()).intValue();
            int intValue2 = ((Number) convertMeasureSpec.component2()).intValue();
            Pair convertMeasureSpec2 = convertMeasureSpec(heightMeasureSpec);
            long Constraints = ConstraintsKt.Constraints(intValue, intValue2, ((Number) convertMeasureSpec2.component1()).intValue(), ((Number) convertMeasureSpec2.component2()).intValue());
            Constraints constraints = this.onMeasureConstraints;
            boolean z = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m2475boximpl(Constraints);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    z = Constraints.m2480equalsimpl0(constraints.getValue(), Constraints);
                }
                if (!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m2059updateRootConstraintsBRTryo0(Constraints);
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    private final Pair convertMeasureSpec(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == Integer.MIN_VALUE) {
            return TuplesKt.to(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return TuplesKt.to(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return TuplesKt.to(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, r - l, b - t);
        }
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        boolean z = false;
        if (IntOffset.m2553getXimpl(this.globalPosition) != this.tmpPositionArray[0] || IntOffset.m2554getYimpl(this.globalPosition) != this.tmpPositionArray[1]) {
            int[] iArr = this.tmpPositionArray;
            this.globalPosition = IntOffsetKt.IntOffset(iArr[0], iArr[1]);
            z = true;
        }
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(Function1 drawBlock, Function0 invalidateParentLayer) {
        DrawChildContainer viewLayerContainer;
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OwnedLayer ownedLayer = (OwnedLayer) this.layerCache.pop();
        if (ownedLayer != null) {
            ownedLayer.reuseLayer(drawBlock, invalidateParentLayer);
            return ownedLayer;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, drawBlock, invalidateParentLayer);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.INSTANCE;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            if (companion.getShouldUseDispatchDraw()) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                viewLayerContainer = new DrawChildContainer(context);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                viewLayerContainer = new ViewLayerContainer(context2);
            }
            this.viewLayersContainer = viewLayerContainer;
            addView(viewLayerContainer);
        }
        DrawChildContainer drawChildContainer = this.viewLayersContainer;
        Intrinsics.checkNotNull(drawChildContainer);
        return new ViewLayer(this, drawChildContainer, drawBlock, invalidateParentLayer);
    }

    public final boolean recycle$ui_release(OwnedLayer layer) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.INSTANCE.getShouldUseDispatchDraw();
        }
        this.layerCache.push(layer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.accessibilityDelegate.onSemanticsChange$ui_release();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.accessibilityDelegate.onLayoutChange$ui_release(layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(listener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    public FocusDirection m2083getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        long m1810getKeyZmokQxo = KeyEvent_androidKt.m1810getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.INSTANCE;
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1794getTabEK5gGoQ())) {
            return FocusDirection.m1244boximpl(KeyEvent_androidKt.m1814isShiftPressedZmokQxo(keyEvent) ? FocusDirection.INSTANCE.m1256getPreviousdhqQ8s() : FocusDirection.INSTANCE.m1254getNextdhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1789getDirectionRightEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1257getRightdhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1788getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1253getLeftdhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1790getDirectionUpEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1258getUpdhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1787getDirectionDownEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1251getDowndhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1786getDirectionCenterEK5gGoQ()) ? true : Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1791getEnterEK5gGoQ()) ? true : Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1793getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1252getIndhqQ8s());
        }
        if (Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1785getBackEK5gGoQ()) ? true : Key.m1781equalsimpl0(m1810getKeyZmokQxo, companion.m1792getEscapeEK5gGoQ())) {
            return FocusDirection.m1244boximpl(FocusDirection.INSTANCE.m1255getOutdhqQ8s());
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas());
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                ((OwnedLayer) this.dirtyLayers.get(i)).updateDisplayList();
            }
        }
        if (ViewLayer.INSTANCE.getShouldUseDispatchDraw()) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List list = this.postponedDirtyLayers;
        if (list != null) {
            Intrinsics.checkNotNull(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer layer, boolean isDirty) {
        Intrinsics.checkNotNullParameter(layer, "layer");
        if (!isDirty) {
            if (!this.isDrawingContent && !this.dirtyLayers.remove(layer)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else {
            if (!this.isDrawingContent) {
                this.dirtyLayers.add(layer);
                return;
            }
            List list = this.postponedDirtyLayers;
            if (list == null) {
                list = new ArrayList();
                this.postponedDirtyLayers = list;
            }
            list.add(layer);
        }
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = callback;
    }

    public final Object boundsUpdatesEventLoop(Continuation continuation) {
        Object boundsUpdatesEventLoop = this.accessibilityDelegate.boundsUpdatesEventLoop(continuation);
        return boundsUpdatesEventLoop == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? boundsUpdatesEventLoop : Unit.INSTANCE;
    }

    public final Object keyboardVisibilityEventLoop(Continuation continuation) {
        Object textInputCommandEventLoop = this.textInputServiceAndroid.textInputCommandEventLoop(continuation);
        return textInputCommandEventLoop == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? textInputCommandEventLoop : Unit.INSTANCE;
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode node) {
        int i = 0;
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, node, false, 2, null);
        MutableVector mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            do {
                invalidateLayoutNodeMeasurement((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    private final void invalidateLayers(LayoutNode node) {
        node.invalidateLayers$ui_release();
        MutableVector mutableVector = node.get_children$ui_release();
        int size = mutableVector.getSize();
        if (size > 0) {
            Object[] content = mutableVector.getContent();
            int i = 0;
            do {
                invalidateLayers((LayoutNode) content[i]);
                i++;
            } while (i < size);
        }
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner2 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (lifecycleOwner2 != null && savedStateRegistryOwner != null && (lifecycleOwner2 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner2.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner2, savedStateRegistryOwner);
            setViewTreeOwners(viewTreeOwners2);
            Function1 function1 = this.onViewTreeOwnersAvailable;
            if (function1 != null) {
                function1.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Intrinsics.checkNotNull(viewTreeOwners3);
        viewTreeOwners3.getLifecycleOwner().getLifecycle().addObserver(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure structure, int flags) {
        AndroidAutofill androidAutofill;
        if (!autofillSupported() || structure == null || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.populateViewStructure(androidAutofill, structure);
    }

    @Override // android.view.View
    public void autofill(SparseArray values) {
        AndroidAutofill androidAutofill;
        Intrinsics.checkNotNullParameter(values, "values");
        if (!autofillSupported() || (androidAutofill = this._autofill) == null) {
            return;
        }
        AndroidAutofill_androidKt.performAutofill(androidAutofill, values);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getActionMasked() == 8) {
            if (event.isFromSource(4194304)) {
                return handleRotaryEvent(event);
            }
            if (isBadMotionEvent(event) || !isAttachedToWindow()) {
                return super.dispatchGenericMotionEvent(event);
            }
            return ProcessResult.m1912getDispatchedToAPointerInputModifierimpl(m2078handleMotionEvent8iAsVTc(event));
        }
        return super.dispatchGenericMotionEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            Intrinsics.checkNotNull(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int m2078handleMotionEvent8iAsVTc = m2078handleMotionEvent8iAsVTc(motionEvent);
        if (ProcessResult.m1911getAnyMovementConsumedimpl(m2078handleMotionEvent8iAsVTc)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return ProcessResult.m1912getDispatchedToAPointerInputModifierimpl(m2078handleMotionEvent8iAsVTc);
    }

    private final boolean handleRotaryEvent(MotionEvent event) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f = -event.getAxisValue(26);
        RotaryScrollEvent rotaryScrollEvent = new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f, f * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), event.getEventTime());
        FocusModifier activeFocusModifier$ui_release = this._focusManager.getActiveFocusModifier$ui_release();
        if (activeFocusModifier$ui_release != null) {
            return activeFocusModifier$ui_release.propagateRotaryEvent(rotaryScrollEvent);
        }
        return false;
    }

    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m2078handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.previousMotionEvent;
                boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                    if (isDevicePressEvent(motionEvent2)) {
                        this.pointerInputEventProcessor.processCancel();
                    } else if (motionEvent2.getActionMasked() != 10 && z2) {
                        sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z = false;
                }
                if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                    sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                int m2081sendMotionEvent8iAsVTc = m2081sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this, this.desiredPointerIcon);
                return m2081sendMotionEvent8iAsVTc;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } finally {
            this.forceUseMatrixCache = false;
        }
    }

    private final boolean hasChangedDevices(MotionEvent event, MotionEvent lastEvent) {
        return (lastEvent.getSource() == event.getSource() && lastEvent.getToolType(0) == event.getToolType(0)) ? false : true;
    }

    private final boolean isDevicePressEvent(MotionEvent event) {
        int actionMasked;
        return event.getButtonState() != 0 || (actionMasked = event.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m2081sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        Object obj;
        PointerInputEvent convertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (convertToPointerInputEvent$ui_release != null) {
            List pointers = convertToPointerInputEvent$ui_release.getPointers();
            ListIterator listIterator = pointers.listIterator(pointers.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((PointerInputEventData) obj).getDown()) {
                    break;
                }
            }
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            if (pointerInputEventData != null) {
                this.lastDownPointerPosition = pointerInputEventData.getPosition();
            }
            int m1885processBIzXfog = this.pointerInputEventProcessor.m1885processBIzXfog(convertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || ProcessResult.m1912getDispatchedToAPointerInputModifierimpl(m1885processBIzXfog)) {
                return m1885processBIzXfog;
            }
            this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
            return m1885processBIzXfog;
        }
        this.pointerInputEventProcessor.processCancel();
        return PointerInputEventProcessorKt.ProcessResult(false, false);
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int action, long eventTime, boolean forceHover) {
        int actionMasked = motionEvent.getActionMasked();
        int i = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i = motionEvent.getActionIndex();
            }
        } else if (action != 9 && action != 10) {
            i = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((i < 0 || i4 < i) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            long mo1907localToScreenMKHz9U = mo1907localToScreenMKHz9U(OffsetKt.Offset(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.m1297getXimpl(mo1907localToScreenMKHz9U);
            pointerCoords.y = Offset.m1298getYimpl(mo1907localToScreenMKHz9U);
            i4++;
        }
        MotionEvent event = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? eventTime : motionEvent.getDownTime(), eventTime, action, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), forceHover ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        MotionEventAdapter motionEventAdapter = this.motionEventAdapter;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        PointerInputEvent convertToPointerInputEvent$ui_release = motionEventAdapter.convertToPointerInputEvent$ui_release(event, this);
        Intrinsics.checkNotNull(convertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m1885processBIzXfog(convertToPointerInputEvent$ui_release, this, true);
        event.recycle();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int direction) {
        return this.accessibilityDelegate.m2092canScroll0AR0LA0$ui_release(false, direction, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int direction) {
        return this.accessibilityDelegate.m2092canScroll0AR0LA0$ui_release(true, direction, this.lastDownPointerPosition);
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo1907localToScreenMKHz9U(long localPosition) {
        recalculateWindowPosition();
        long m1518mapMKHz9U = Matrix.m1518mapMKHz9U(this.viewToWindowMatrix, localPosition);
        return OffsetKt.Offset(Offset.m1297getXimpl(m1518mapMKHz9U) + Offset.m1297getXimpl(this.windowPosition), Offset.m1298getYimpl(m1518mapMKHz9U) + Offset.m1298getYimpl(this.windowPosition));
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo1908screenToLocalMKHz9U(long positionOnScreen) {
        recalculateWindowPosition();
        return Matrix.m1518mapMKHz9U(this.windowToViewMatrix, OffsetKt.Offset(Offset.m1297getXimpl(positionOnScreen) - Offset.m1297getXimpl(this.windowPosition), Offset.m1298getYimpl(positionOnScreen) - Offset.m1298getYimpl(this.windowPosition)));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            this.windowPosition = OffsetKt.Offset(f - iArr2[0], f2 - iArr2[1]);
        }
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long m1518mapMKHz9U = Matrix.m1518mapMKHz9U(this.viewToWindowMatrix, OffsetKt.Offset(motionEvent.getX(), motionEvent.getY()));
        this.windowPosition = OffsetKt.Offset(motionEvent.getRawX() - Offset.m1297getXimpl(m1518mapMKHz9U), motionEvent.getRawY() - Offset.m1298getYimpl(m1518mapMKHz9U));
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo2102calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m2121invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.textInputServiceAndroid.getEditorHasFocus();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        return this.textInputServiceAndroid.createInputConnection(outAttrs);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo2073calculateLocalPositionMKHz9U(long positionInWindow) {
        recalculateWindowPosition();
        return Matrix.m1518mapMKHz9U(this.windowToViewMatrix, positionInWindow);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo2074calculatePositionInWindowMKHz9U(long localPosition) {
        recalculateWindowPosition();
        return Matrix.m1518mapMKHz9U(this.viewToWindowMatrix, localPosition);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.density = AndroidDensity_androidKt.Density(context);
        if (getFontWeightAdjustmentCompat(newConfig) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(newConfig);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(context2));
        }
        this.configurationChangeObserver.invoke(newConfig);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        LayoutDirection layoutDirectionFromInt;
        if (this.superclassInitComplete) {
            layoutDirectionFromInt = AndroidComposeView_androidKt.layoutDirectionFromInt(layoutDirection);
            setLayoutDirection(layoutDirectionFromInt);
            this._focusManager.setLayoutDirection(layoutDirectionFromInt);
        }
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (isBadMotionEvent(event) || !isAttachedToWindow()) {
            return false;
        }
        if (event.isFromSource(4098) && event.getToolType(0) == 1) {
            return this.accessibilityDelegate.dispatchHoverEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && isInBounds(event)) {
                if (event.getToolType(0) != 3) {
                    MotionEvent motionEvent = this.previousMotionEvent;
                    if (motionEvent != null) {
                        motionEvent.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(event);
                    this.hoverExitReceived = true;
                    post(this.sendHoverExitEvent);
                    return false;
                }
                if (event.getButtonState() != 0) {
                    return false;
                }
            }
        } else if (!isPositionChanged(event)) {
            return false;
        }
        return ProcessResult.m1912getDispatchedToAPointerInputModifierimpl(m2078handleMotionEvent8iAsVTc(event));
    }

    private final boolean isBadMotionEvent(MotionEvent event) {
        float x = event.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = event.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = event.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = event.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private final boolean isPositionChanged(MotionEvent event) {
        MotionEvent motionEvent;
        return (event.getPointerCount() == 1 && (motionEvent = this.previousMotionEvent) != null && event.getRawX() == motionEvent.getRawX() && event.getRawY() == motionEvent.getRawY()) ? false : true;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int accessibilityId, View currentView) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (Intrinsics.areEqual(declaredMethod.invoke(currentView, null), Integer.valueOf(accessibilityId))) {
                return currentView;
            }
            if (currentView instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) currentView;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt, "currentView.getChildAt(i)");
                    View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, childAt);
                    if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                        return findViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int accessibilityId) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(accessibilityId));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = findViewByAccessibilityIdRootedAtCurrentView(accessibilityId, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    /* compiled from: AndroidComposeView.android.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$Companion;", "", "()V", "FocusTag", "", "MaximumLayerCacheSize", "", "getBooleanMethod", "Ljava/lang/reflect/Method;", "systemPropertiesClass", "Ljava/lang/Class;", "getIsShowingLayoutBounds", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* compiled from: AndroidComposeView.android.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$ViewTreeOwners;", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/savedstate/SavedStateRegistryOwner;)V", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "getSavedStateRegistryOwner", "()Landroidx/savedstate/SavedStateRegistryOwner;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class ViewTreeOwners {
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
            Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }
}
