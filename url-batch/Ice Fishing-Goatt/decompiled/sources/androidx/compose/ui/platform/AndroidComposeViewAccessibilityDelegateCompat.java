package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.app.NotificationCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000è\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ú\u00012\u00020\u0001:\u0010ø\u0001ù\u0001ú\u0001û\u0001ü\u0001ý\u0001þ\u0001ÿ\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010p\u001a\u00020!2\u0006\u0010q\u001a\u00020\u00122\u0006\u0010r\u001a\u00020*2\u0006\u0010s\u001a\u00020\u00062\b\u0010t\u001a\u0004\u0018\u00010uH\u0002J\u0010\u0010v\u001a\u00020w2\u0006\u0010x\u001a\u00020%H\u0002J\u0010\u0010y\u001a\u00020!H\u0080@¢\u0006\u0004\bz\u0010{J;\u0010|\u001a\u00020\u00142\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010}\u001a\u00020\u00142\u0006\u0010~\u001a\u00020\u00122\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0002ø\u0001\u0000¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J-\u0010|\u001a\u00020\u00142\u0006\u0010}\u001a\u00020\u00142\u0006\u0010~\u001a\u00020\u00122\u0007\u0010\u007f\u001a\u00030\u0080\u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\t\u0010\u0085\u0001\u001a\u00020!H\u0002J\u0011\u0010\u0086\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u0012H\u0002J\u001a\u0010\u0087\u0001\u001a\u00020N2\u0006\u0010q\u001a\u00020\u00122\u0007\u0010\u0088\u0001\u001a\u00020\u0012H\u0003J\u0013\u0010\u0089\u0001\u001a\u0004\u0018\u00010*2\u0006\u0010q\u001a\u00020\u0012H\u0002J\u0014\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002JC\u0010\u008c\u0001\u001a\u00020N2\u0006\u0010q\u001a\u00020\u00122\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00122\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0003\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\u00142\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001H\u0000¢\u0006\u0003\b\u0095\u0001JF\u0010\u0096\u0001\u001a\u00020!2\b\u0010\u0097\u0001\u001a\u00030\u008b\u00012\u001b\u0010\u0098\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008b\u00010\u0099\u0001j\n\u0012\u0005\u0012\u00030\u008b\u0001`\u009a\u00012\u0014\u0010\u009b\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010,0WH\u0002J\u0014\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001H\u0016J\u0012\u0010 \u0001\u001a\u00020\u00122\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010¡\u0001\u001a\u00020\u00122\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010¢\u0001\u001a\u00020\u00142\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0014\u0010£\u0001\u001a\u0004\u0018\u00010\u00062\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0015\u0010¤\u0001\u001a\u0005\u0018\u00010¥\u00012\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0016\u0010¦\u0001\u001a\u0004\u0018\u00010\u00062\t\u0010x\u001a\u0005\u0018\u00010\u008b\u0001H\u0002J \u0010§\u0001\u001a\u0005\u0018\u00010¨\u00012\t\u0010x\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010©\u0001\u001a\u00020\u0012H\u0002J#\u0010ª\u0001\u001a\u00020\u00122\b\u0010«\u0001\u001a\u00030¬\u00012\b\u0010\u00ad\u0001\u001a\u00030¬\u0001H\u0001¢\u0006\u0003\b®\u0001J\u0011\u0010¯\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u0012H\u0002J\u0012\u0010°\u0001\u001a\u00020\u00142\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010±\u0001\u001a\u00020\u00142\u0007\u0010x\u001a\u00030\u008b\u0001H\u0002J\u0012\u0010²\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020iH\u0002J\u0018\u0010´\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020iH\u0000¢\u0006\u0003\bµ\u0001J\u000f\u0010¶\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b·\u0001J$\u0010¸\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u00122\u0007\u0010¹\u0001\u001a\u00020\u00122\b\u0010t\u001a\u0004\u0018\u00010uH\u0002J#\u0010º\u0001\u001a\u00020!2\u0006\u0010q\u001a\u00020\u00122\u0006\u0010r\u001a\u00020*2\b\u0010»\u0001\u001a\u00030\u008b\u0001H\u0002J!\u0010¼\u0001\u001a\u00020\u00142\u0007\u0010½\u0001\u001a\u00020\u00122\r\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020b0/H\u0002J\u0011\u0010¿\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u0012H\u0002J\u0012\u0010À\u0001\u001a\u00020!2\u0007\u0010Á\u0001\u001a\u00020bH\u0002J'\u0010Â\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008b\u00010Ã\u0001j\n\u0012\u0005\u0012\u00030\u008b\u0001`Ä\u00012\u0007\u0010Å\u0001\u001a\u00020\u0014H\u0082\bJ\u0012\u0010Æ\u0001\u001a\u00020\u00122\u0007\u0010½\u0001\u001a\u00020\u0012H\u0002J\u001c\u0010Ç\u0001\u001a\u00020!2\b\u0010È\u0001\u001a\u00030\u008b\u00012\u0007\u0010É\u0001\u001a\u00020]H\u0002J\u0012\u0010Ê\u0001\u001a\u00020\u00142\u0007\u0010\u0093\u0001\u001a\u00020NH\u0002J@\u0010Ë\u0001\u001a\u00020\u00142\u0006\u0010q\u001a\u00020\u00122\u0007\u0010\u0088\u0001\u001a\u00020\u00122\u000b\b\u0002\u0010Ì\u0001\u001a\u0004\u0018\u00010\u00122\u0011\b\u0002\u0010Í\u0001\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010/H\u0002¢\u0006\u0003\u0010Î\u0001J&\u0010Ï\u0001\u001a\u00020!2\u0007\u0010Ð\u0001\u001a\u00020\u00122\u0007\u0010Ì\u0001\u001a\u00020\u00122\t\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010Ò\u0001\u001a\u00020!2\u0007\u0010Ð\u0001\u001a\u00020\u0012H\u0002J\u0018\u0010Ó\u0001\u001a\u00020!2\r\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002J\u001b\u0010Õ\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020i2\u0007\u0010Ö\u0001\u001a\u00020UH\u0002J\u0012\u0010×\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020iH\u0002J-\u0010Ø\u0001\u001a\u00020\u00142\u0007\u0010x\u001a\u00030\u008b\u00012\u0007\u0010Ù\u0001\u001a\u00020\u00122\u0007\u0010Ú\u0001\u001a\u00020\u00122\u0007\u0010Û\u0001\u001a\u00020\u0014H\u0002J\u001a\u0010Ü\u0001\u001a\u00020!2\u0007\u0010x\u001a\u00030\u008b\u00012\u0006\u0010r\u001a\u00020*H\u0002J\u001a\u0010Ý\u0001\u001a\u00020!2\u0007\u0010x\u001a\u00030\u008b\u00012\u0006\u0010r\u001a\u00020*H\u0002J\u001a\u0010Þ\u0001\u001a\u00020!2\u0007\u0010x\u001a\u00030\u008b\u00012\u0006\u0010r\u001a\u00020*H\u0002J\u001a\u0010ß\u0001\u001a\u00020!2\u0007\u0010x\u001a\u00030\u008b\u00012\u0006\u0010r\u001a\u00020*H\u0002J\t\u0010à\u0001\u001a\u00020!H\u0002JN\u0010á\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010,2\u0007\u0010Å\u0001\u001a\u00020\u00142\u001b\u0010â\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008b\u00010\u0099\u0001j\n\u0012\u0005\u0012\u00030\u008b\u0001`\u009a\u00012\u0016\b\u0002\u0010ã\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008b\u00010,0WH\u0002J)\u0010ä\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010,2\u0007\u0010Å\u0001\u001a\u00020\u00142\u000e\u0010å\u0001\u001a\t\u0012\u0005\u0012\u00030\u008b\u00010,H\u0002J\"\u0010æ\u0001\u001a\u0005\u0018\u00010ç\u00012\n\u0010è\u0001\u001a\u0005\u0018\u00010\u008b\u00012\b\u0010é\u0001\u001a\u00030ê\u0001H\u0002J-\u0010ë\u0001\u001a\u00020\u00142\u0007\u0010x\u001a\u00030\u008b\u00012\u0007\u0010©\u0001\u001a\u00020\u00122\u0007\u0010ì\u0001\u001a\u00020\u00142\u0007\u0010í\u0001\u001a\u00020\u0014H\u0002J4\u0010î\u0001\u001a\u0005\u0018\u0001Hï\u0001\"\t\b\u0000\u0010ï\u0001*\u00020\u001e2\n\u0010\u0090\u0001\u001a\u0005\u0018\u0001Hï\u00012\t\b\u0001\u0010ð\u0001\u001a\u00020\u0012H\u0002¢\u0006\u0003\u0010ñ\u0001J\u0011\u0010ò\u0001\u001a\u00020!2\u0006\u0010q\u001a\u00020\u0012H\u0002J\t\u0010ó\u0001\u001a\u00020!H\u0002J\u0011\u0010ô\u0001\u001a\u0005\u0018\u00010¥\u0001*\u00030õ\u0001H\u0002J\u0011\u0010ö\u0001\u001a\u0005\u0018\u00010÷\u0001*\u00030¥\u0001H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u000e\u0010(\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010+\u001a&\u0012\f\u0012\n .*\u0004\u0018\u00010-0- .*\u0012\u0012\f\u0012\n .*\u0004\u0018\u00010-0-\u0018\u00010/0,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R$\u00105\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001a\u0010B\u001a\u00020=X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\u0014\u0010E\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0017R\u0014\u0010G\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\u0017R\u001a\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0I0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010J\u001a\u00060KR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010L\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020\u00140M8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bO\u00107\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u000e\u0010T\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010V\u001a\b\u0012\u0004\u0012\u00020X0WX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Y\u001a\u0004\u0018\u00010ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020X0WX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0WX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020]X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010_\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010`R\u001a\u0010a\u001a\u000e\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020!0MX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010c\u001a\b\u0012\u0004\u0012\u00020b0,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010g\u001a\b\u0012\u0004\u0012\u00020i0hX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020kX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020mX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010o\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0080\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "view", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "ExtraDataTestTraversalAfterVal", "", "getExtraDataTestTraversalAfterVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "getExtraDataTestTraversalBeforeVal$ui_release", "SendRecurringAccessibilityEventsIntervalMillis", "", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "accessibilityCursorPosition", "", "value", "", "accessibilityForceEnabledForTesting", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "", "checkingForSemanticsChanges", "currentSemanticsNodes", "Landroidx/collection/IntObjectMap;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "getCurrentSemanticsNodes", "()Landroidx/collection/IntObjectMap;", "currentSemanticsNodesInvalidated", "currentlyFocusedANI", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "enabledServices", "", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "focusedVirtualViewId", "handler", "Landroid/os/Handler;", "hoveredVirtualViewId", "getHoveredVirtualViewId$ui_release$annotations", "()V", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "(I)V", "idToAfterMap", "Landroidx/collection/MutableIntIntMap;", "getIdToAfterMap$ui_release", "()Landroidx/collection/MutableIntIntMap;", "setIdToAfterMap$ui_release", "(Landroidx/collection/MutableIntIntMap;)V", "idToBeforeMap", "getIdToBeforeMap$ui_release", "setIdToBeforeMap$ui_release", "isEnabled", "isEnabled$ui_release", "isTouchExplorationEnabled", "labelToActionId", "Landroidx/collection/MutableObjectIntMap;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "onSendAccessibilityEvent", "Lkotlin/Function1;", "Landroid/view/accessibility/AccessibilityEvent;", "getOnSendAccessibilityEvent$ui_release$annotations", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "paneDisplayed", "Landroidx/collection/MutableIntSet;", "pendingHorizontalScrollEvents", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingVerticalScrollEvents", "previousSemanticsNodes", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "previousSemanticsRoot", "previousTraversedNode", "Ljava/lang/Integer;", "scheduleScrollEventIfNeededLambda", "Landroidx/compose/ui/platform/ScrollObservationScope;", "scrollObservationScopes", "semanticsChangeChecker", "Ljava/lang/Runnable;", "sendingFocusAffectingEvent", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Landroidx/compose/ui/node/LayoutNode;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "addExtraDataToAccessibilityNodeInfoHelper", "virtualViewId", "info", "extraDataKey", "arguments", "Landroid/os/Bundle;", "boundsInScreen", "Landroid/graphics/Rect;", "node", "boundsUpdatesEventLoop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "canScroll", "vertical", "direction", "position", "Landroidx/compose/ui/geometry/Offset;", "canScroll-moWRBKg", "(Landroidx/collection/IntObjectMap;ZIJ)Z", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "checkForSemanticsChanges", "clearAccessibilityFocus", "createEvent", "eventType", "createNodeInfo", "createStateDescriptionForTextField", "Landroidx/compose/ui/semantics/SemanticsNode;", "createTextSelectionChangedEvent", "fromIndex", "toIndex", "itemCount", "text", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "dispatchHoverEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "dispatchHoverEvent$ui_release", "geometryDepthFirstSearch", "currNode", "geometryList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "containerMapToChildren", "getAccessibilityNodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "host", "Landroid/view/View;", "getAccessibilitySelectionEnd", "getAccessibilitySelectionStart", "getInfoIsCheckable", "getInfoStateDescriptionOrNull", "getInfoText", "Landroidx/compose/ui/text/AnnotatedString;", "getIterableTextForAccessibility", "getIteratorForGranularity", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "granularity", "hitTestSemanticsAt", "x", "", "y", "hitTestSemanticsAt$ui_release", "isAccessibilityFocused", "isAccessibilitySelectionExtendable", "isScreenReaderFocusable", "notifySubtreeAccessibilityStateChangedIfNeeded", "layoutNode", "onLayoutChange", "onLayoutChange$ui_release", "onSemanticsChange", "onSemanticsChange$ui_release", "performActionHelper", "action", "populateAccessibilityNodeInfoProperties", "semanticsNode", "registerScrollingId", "id", "oldScrollObservationScopes", "requestAccessibilityFocus", "scheduleScrollEventIfNeeded", "scrollObservationScope", "semanticComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "layoutIsRtl", "semanticsNodeIdToAccessibilityVirtualNodeId", "sendAccessibilitySemanticsStructureChangeEvents", "newNode", "oldNode", "sendEvent", "sendEventForVirtualView", "contentChangeType", "contentDescription", "(IILjava/lang/Integer;Ljava/util/List;)Z", "sendPaneChangeEvents", "semanticsNodeId", "title", "sendPendingTextTraversedAtGranularityEvent", "sendSemanticsPropertyChangeEvents", "newSemanticsNodes", "sendSubtreeChangeAccessibilityEvents", "subtreeChangedSemanticsNodesIds", "sendTypeViewScrolledAccessibilityEvent", "setAccessibilitySelection", "start", "end", "traversalMode", "setContentInvalid", "setIsCheckable", "setStateDescription", "setText", "setTraversalValues", "sortByGeometryGroupings", "parentListToSort", "containerChildrenMapping", "subtreeSortedByGeometryGrouping", "listToSort", "toScreenCoords", "Landroid/graphics/RectF;", "textNode", "bounds", "Landroidx/compose/ui/geometry/Rect;", "traverseAtGranularity", "forward", "extendSelection", "trimToSize", "T", "size", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "updateHoveredVirtualView", "updateSemanticsNodesCopyAndPanes", "getTextForTextField", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "toSpannableString", "Landroid/text/SpannableString;", "Api24Impl", "Api29Impl", "Companion", "ComposeAccessibilityNodeProvider", "LtrBoundsComparator", "PendingTextTraversedEvent", "RtlBoundsComparator", "TopBottomBoundsComparator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(AndroidComposeViewAccessibilityDelegateCompat.this.getView().getParent().requestSendAccessibilityEvent(AndroidComposeViewAccessibilityDelegateCompat.this.getView(), accessibilityEvent));
        }
    };

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda1
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat.this, z);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda2
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.this.enabledServices = r0.accessibilityManager.getEnabledAccessibilityServiceList(-1);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$49(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                AndroidComposeViewAccessibilityDelegateCompat.this.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    public final void setHoveredVirtualViewId$ui_release(int i) {
        this.hoveredVirtualViewId = i;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui_release, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List<AccessibilityServiceInfo> emptyList;
        if (z) {
            emptyList = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        androidComposeViewAccessibilityDelegateCompat.enabledServices = emptyList;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            if (isEnabled$ui_release()) {
                setTraversalValues();
            }
        }
        return this.currentSemanticsNodes;
    }

    /* renamed from: getIdToBeforeMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final void setIdToBeforeMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    /* renamed from: getIdToAfterMap$ui_release, reason: from getter */
    public final MutableIntIntMap getIdToAfterMap() {
        return this.idToAfterMap;
    }

    public final void setIdToAfterMap$ui_release(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m5479canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m5478canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
        }
        return false;
    }

    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    private final boolean m5478canScrollmoWRBKg(IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey<ScrollAxisRange> horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        if (Offset.m3579equalsimpl0(position, Offset.INSTANCE.m3597getUnspecifiedF1C5BW0()) || !Offset.m3585isValidimpl(position)) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr = currentSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) objArr[(i << 3) + i3];
                        if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m3608containsk4lQ0M(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig(), horizontalScrollAxisRange)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i4 = -1;
                            }
                            if (i4 < 0) {
                                if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
                                    j >>= 8;
                                }
                                z = true;
                                j >>= 8;
                            } else {
                                if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue()) {
                                    j >>= 8;
                                }
                                z = true;
                                j >>= 8;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null) {
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer valueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                obtain.setParent(this.view, intValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? intValue : -1);
            } else {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + virtualViewId + " has null parent");
                throw new KotlinNothingValueException();
            }
        }
        obtain.setSource(this.view, virtualViewId);
        obtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(virtualViewId, obtain, semanticsNode);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect boundsInScreen(SemanticsNodeWithAdjustedBounds node) {
        Rect adjustedBounds = node.getAdjustedBounds();
        long mo5105localToScreenMKHz9U = this.view.mo5105localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo5105localToScreenMKHz9U2 = this.view.mo5105localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new Rect((int) Math.floor(Offset.m3582getXimpl(mo5105localToScreenMKHz9U)), (int) Math.floor(Offset.m3583getYimpl(mo5105localToScreenMKHz9U)), (int) Math.ceil(Offset.m3582getXimpl(mo5105localToScreenMKHz9U2)), (int) Math.ceil(Offset.m3583getYimpl(mo5105localToScreenMKHz9U2)));
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J<\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class TopBottomBoundsComparator implements Comparator<Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>> {
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair, Pair<? extends androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> pair2) {
            return compare2((Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair, (Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>>) pair2);
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> a2, Pair<androidx.compose.ui.geometry.Rect, ? extends List<SemanticsNode>> b) {
            int compare = Float.compare(a2.getFirst().getTop(), b.getFirst().getTop());
            return compare != 0 ? compare : Float.compare(a2.getFirst().getBottom(), b.getFirst().getBottom());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class LtrBoundsComparator implements Comparator<SemanticsNode> {
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode a2, SemanticsNode b) {
            androidx.compose.ui.geometry.Rect boundsInWindow = a2.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = b.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class RtlBoundsComparator implements Comparator<SemanticsNode> {
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode a2, SemanticsNode b) {
            androidx.compose.ui.geometry.Rect boundsInWindow = a2.getBoundsInWindow();
            androidx.compose.ui.geometry.Rect boundsInWindow2 = b.getBoundsInWindow();
            int compare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (compare != 0) {
                return compare;
            }
            int compare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (compare2 != 0) {
                return compare2;
            }
            int compare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return compare3 != 0 ? compare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean layoutIsRtl) {
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.INSTANCE.getZComparator$ui_release()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, ArrayList arrayList, MutableIntObjectMap mutableIntObjectMap, int i, Object obj) {
        if ((i & 4) != 0) {
            mutableIntObjectMap = IntObjectMapKt.mutableIntObjectMapOf();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, arrayList, mutableIntObjectMap);
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean layoutIsRtl, ArrayList<SemanticsNode> parentListToSort, MutableIntObjectMap<List<SemanticsNode>> containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(parentListToSort);
        int i = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode = parentListToSort.get(i2);
                if (i2 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        ArrayList arrayList2 = arrayList;
        CollectionsKt.sortWith(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Pair pair = (Pair) arrayList2.get(i3);
            CollectionsKt.sortWith((List) pair.getSecond(), new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.INSTANCE.getZComparator$ui_release())));
            arrayList3.addAll((Collection) pair.getSecond());
        }
        ArrayList arrayList4 = arrayList3;
        final AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 androidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2 = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(SemanticsNode semanticsNode2, SemanticsNode semanticsNode3) {
                return Integer.valueOf(Float.compare(((Number) semanticsNode2.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode3.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sortByGeometryGroupings$2.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
        CollectionsKt.sortWith(arrayList4, new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int intValue;
                intValue = ((Number) Function2.this.invoke(obj, obj2)).intValue();
                return intValue;
            }
        });
        while (i <= CollectionsKt.getLastIndex(arrayList4)) {
            List<SemanticsNode> list = containerChildrenMapping.get(((SemanticsNode) arrayList3.get(i)).getId());
            if (list != null) {
                if (isScreenReaderFocusable((SemanticsNode) arrayList3.get(i))) {
                    i++;
                } else {
                    arrayList3.remove(i);
                }
                arrayList3.addAll(i, list);
                i += list.size();
            } else {
                i++;
            }
        }
        return arrayList4;
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<Pair<androidx.compose.ui.geometry.Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i = 0;
            while (true) {
                androidx.compose.ui.geometry.Rect first = arrayList.get(i).getFirst();
                boolean z2 = first.getTop() >= first.getBottom();
                if (!z && !z2 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i, new Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i).getSecond()));
                    arrayList.get(i).getSecond().add(semanticsNode);
                    return true;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    private final void geometryDepthFirstSearch(SemanticsNode currNode, ArrayList<SemanticsNode> geometryList, MutableIntObjectMap<List<SemanticsNode>> containerMapToChildren) {
        boolean isRtl;
        isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(currNode);
        boolean booleanValue = ((Boolean) currNode.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return false;
            }
        })).booleanValue();
        if ((booleanValue || isScreenReaderFocusable(currNode)) && getCurrentSemanticsNodes().containsKey(currNode.getId())) {
            geometryList.add(currNode);
        }
        if (booleanValue) {
            containerMapToChildren.set(currNode.getId(), subtreeSortedByGeometryGrouping(isRtl, CollectionsKt.toMutableList((Collection) currNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = currNode.getChildren();
        int size = children.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(children.get(i), geometryList, containerMapToChildren);
        }
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, List<SemanticsNode> listToSort) {
        MutableIntObjectMap<List<SemanticsNode>> mutableIntObjectMapOf = IntObjectMapKt.mutableIntObjectMapOf();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = listToSort.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(listToSort.get(i), arrayList, mutableIntObjectMapOf);
        }
        return sortByGeometryGroupings(layoutIsRtl, arrayList, mutableIntObjectMapOf);
    }

    private final void setTraversalValues() {
        boolean isRtl;
        this.idToBeforeMap.clear();
        this.idToAfterMap.clear();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
        int i = 1;
        List<SemanticsNode> subtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl, CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt.getLastIndex(subtreeSortedByGeometryGrouping);
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = subtreeSortedByGeometryGrouping.get(i - 1).getId();
            int id2 = subtreeSortedByGeometryGrouping.get(i).getId();
            this.idToBeforeMap.set(id, id2);
            this.idToAfterMap.set(id2, id);
            if (i == lastIndex) {
                return;
            } else {
                i++;
            }
        }
    }

    private final boolean isScreenReaderFocusable(SemanticsNode node) {
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        return SemanticsUtils_androidKt.isVisible(node) && (node.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (node.isUnmergedLeafNode$ui_release() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || getInfoText(node) != null || getInfoStateDescriptionOrNull(node) != null || getInfoIsCheckable(node))));
    }

    private final void populateAccessibilityNodeInfoProperties(int virtualViewId, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        boolean enabled;
        boolean enabled2;
        boolean enabled3;
        View semanticsIdToView;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean isRtl2;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean z;
        boolean enabled8;
        boolean z2;
        info.setClassName(ClassName);
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            info.setClassName(TextFieldClassName);
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getText())) {
            info.setClassName(TextClassName);
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
        if (role != null) {
            role.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                if (Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c())) {
                    info.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else if (Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5568getSwitcho7Vup1c())) {
                    info.setRoleDescription(this.view.getContext().getResources().getString(R.string.switch_role));
                } else {
                    String m5538toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m5538toLegacyClassNameV4PA4sw(role.getValue());
                    if (!Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5566getImageo7Vup1c()) || semanticsNode.isUnmergedLeafNode$ui_release() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.setClassName(m5538toLegacyClassNameV4PA4sw);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
            Unit unit2 = Unit.INSTANCE;
        }
        info.setPackageName(this.view.getContext().getPackageName());
        info.setImportantForAccessibility(SemanticsUtils_androidKt.isImportantForAccessibility(semanticsNode));
        List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().contains(semanticsNode2.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (semanticsNode2.getId() != -1) {
                    if (androidViewHolder != null) {
                        info.addChild(androidViewHolder);
                    } else {
                        info.addChild(this.view, semanticsNode2.getId());
                    }
                }
            }
        }
        if (virtualViewId == this.focusedVirtualViewId) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        setStateDescription(semanticsNode, info);
        setIsCheckable(semanticsNode, info);
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getToggleableState());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.setChecked(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.setChecked(false);
            }
            Unit unit3 = Unit.INSTANCE;
            Unit unit4 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c())) {
                info.setSelected(booleanValue);
            } else {
                info.setChecked(booleanValue);
            }
            Unit unit5 = Unit.INSTANCE;
            Unit unit6 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            info.setContentDescription(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
        if (str != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z2 = false;
                    break;
                } else {
                    if (semanticsNode3.getUnmergedConfig().contains(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())) {
                        z2 = ((Boolean) semanticsNode3.getUnmergedConfig().get(SemanticsPropertiesAndroid.INSTANCE.getTestTagsAsResourceId())).booleanValue();
                        break;
                    }
                    semanticsNode3 = semanticsNode3.getParent();
                }
            }
            if (z2) {
                info.setViewIdResourceName(str);
            }
        }
        if (((Unit) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHeading())) != null) {
            info.setHeading(true);
            Unit unit7 = Unit.INSTANCE;
            Unit unit8 = Unit.INSTANCE;
        }
        info.setPassword(semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        info.setEditable(semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getIsEditable()));
        Integer num = (Integer) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getMaxTextLength());
        info.setMaxTextLength(num != null ? num.intValue() : -1);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        info.setEnabled(enabled);
        info.setFocusable(semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        info.setVisibleToUser(SemanticsUtils_androidKt.isVisible(semanticsNode));
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getLiveRegion());
        if (liveRegionMode != null) {
            int value = liveRegionMode.getValue();
            info.setLiveRegion((LiveRegionMode.m5550equalsimpl0(value, LiveRegionMode.INSTANCE.m5555getPolite0phEisY()) || !LiveRegionMode.m5550equalsimpl0(value, LiveRegionMode.INSTANCE.m5554getAssertive0phEisY())) ? 1 : 2);
            Unit unit9 = Unit.INSTANCE;
            Unit unit10 = Unit.INSTANCE;
        }
        info.setClickable(false);
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true);
            if (!(role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c()))) {
                if (!(role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5567getRadioButtono7Vup1c()))) {
                    z = false;
                    info.setClickable(z || (z && !areEqual));
                    enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                    if (enabled8 && info.isClickable()) {
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
                    }
                    Unit unit11 = Unit.INSTANCE;
                    Unit unit12 = Unit.INSTANCE;
                }
            }
            z = true;
            info.setClickable(z || (z && !areEqual));
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit112 = Unit.INSTANCE;
            Unit unit122 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit13 = Unit.INSTANCE;
            Unit unit14 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit15 = Unit.INSTANCE;
            Unit unit16 = Unit.INSTANCE;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit17 = Unit.INSTANCE;
                Unit unit18 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnImeAction());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit19 = Unit.INSTANCE;
                Unit unit20 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
            if (accessibilityAction6 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction6.getLabel()));
                Unit unit21 = Unit.INSTANCE;
                Unit unit22 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
            if (accessibilityAction7 != null) {
                if (info.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction7.getLabel()));
                }
                Unit unit23 = Unit.INSTANCE;
                Unit unit24 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    info.setMovementGranularities(info.getMovementGranularities() | 20);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExtraDataIdKey);
        CharSequence text = info.getText();
        if (text != null && text.length() != 0 && semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult())) {
            arrayList.add(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY);
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag())) {
            arrayList.add(ExtraDataTestTagKey);
        }
        info.setAvailableExtraData(arrayList);
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(info, semanticsNode);
        CollectionInfo_androidKt.setCollectionInfo(semanticsNode, info);
        CollectionInfo_androidKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled5 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled5) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl2) {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    } else {
                        accessibilityActionCompat2 = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    }
                    info.addAction(accessibilityActionCompat2);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (!isRtl) {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_LEFT;
                    } else {
                        accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_RIGHT;
                    }
                    info.addAction(accessibilityActionCompat);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (scrollAxisRange2.getMaxValue().invoke().floatValue() > 0.0f) {
                info.setScrollable(true);
            }
            enabled4 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled4) {
                if (populateAccessibilityNodeInfoProperties$canScrollForward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
                }
                if (populateAccessibilityNodeInfoProperties$canScrollBackward(scrollAxisRange2)) {
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.addPageActions(info, semanticsNode);
        }
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction10.getLabel()));
                Unit unit25 = Unit.INSTANCE;
                Unit unit26 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction11.getLabel()));
                Unit unit27 = Unit.INSTANCE;
                Unit unit28 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
            if (accessibilityAction12 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction12.getLabel()));
                Unit unit29 = Unit.INSTANCE;
                Unit unit30 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                int size2 = list3.size();
                IntList intList = AccessibilityActionsResourceIds;
                if (size2 >= intList.getSize()) {
                    throw new IllegalStateException("Can't have more than " + intList.getSize() + " custom actions for one widget");
                }
                SparseArrayCompat<CharSequence> sparseArrayCompat = new SparseArrayCompat<>(0, 1, null);
                MutableObjectIntMap<CharSequence> mutableObjectIntMapOf = ObjectIntMapKt.mutableObjectIntMapOf();
                if (this.labelToActionId.containsKey(virtualViewId)) {
                    MutableObjectIntMap<CharSequence> mutableObjectIntMap = this.labelToActionId.get(virtualViewId);
                    MutableIntList mutableIntList = new MutableIntList(0, 1, null);
                    int[] iArr = intList.content;
                    int i2 = intList._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        mutableIntList.add(iArr[i3]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i4);
                        Intrinsics.checkNotNull(mutableObjectIntMap);
                        if (mutableObjectIntMap.contains(customAccessibilityAction.getLabel())) {
                            int i5 = mutableObjectIntMap.get(customAccessibilityAction.getLabel());
                            sparseArrayCompat.put(i5, customAccessibilityAction.getLabel());
                            mutableObjectIntMapOf.set(customAccessibilityAction.getLabel(), i5);
                            mutableIntList.remove(i5);
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i5, customAccessibilityAction.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i6);
                        int i7 = mutableIntList.get(i6);
                        sparseArrayCompat.put(i7, customAccessibilityAction2.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction2.getLabel(), i7);
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i7, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i8);
                        int i9 = AccessibilityActionsResourceIds.get(i8);
                        sparseArrayCompat.put(i9, customAccessibilityAction3.getLabel());
                        mutableObjectIntMapOf.set(customAccessibilityAction3.getLabel(), i9);
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i9, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(virtualViewId, sparseArrayCompat);
                this.labelToActionId.put(virtualViewId, mutableObjectIntMapOf);
            }
        }
        info.setScreenReaderFocusable(isScreenReaderFocusable(semanticsNode));
        int orDefault = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
        if (orDefault != -1) {
            View semanticsIdToView2 = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault);
            if (semanticsIdToView2 != null) {
                info.setTraversalBefore(semanticsIdToView2);
            } else {
                info.setTraversalBefore(this.view, orDefault);
            }
            addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int orDefault2 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
        if (orDefault2 == -1 || (semanticsIdToView = SemanticsUtils_androidKt.semanticsIdToView(this.view.getAndroidViewsHandler$ui_release(), orDefault2)) == null) {
            return;
        }
        info.setTraversalAfter(semanticsIdToView);
        addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode node) {
        Object orNull = SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
        int i = 0;
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1) {
                if ((role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5568getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.state_on);
                }
            } else if (i2 == 2) {
                if ((role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5568getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.state_off);
                }
            } else if (i2 == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c())) && orNull == null) {
                AndroidComposeView androidComposeView = this.view;
                if (booleanValue) {
                    orNull = androidComposeView.getContext().getResources().getString(R.string.selected);
                } else {
                    orNull = androidComposeView.getContext().getResources().getString(R.string.not_selected);
                }
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float current = range.getEndInclusive().floatValue() - range.getStart().floatValue() == 0.0f ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (current != 0.0f) {
                        i = current == 1.0f ? 100 : RangesKt.coerceIn(Math.round(current * 100.0f), 1, 99);
                    }
                    orNull = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i));
                }
            } else if (orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.in_progress);
            }
        }
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            orNull = createStateDescriptionForTextField(node);
        }
        return (String) orNull;
    }

    private final String createStateDescriptionForTextField(SemanticsNode node) {
        SemanticsConfiguration config = node.copyWithMergingEnabled$ui_release().getConfig();
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getContentDescription());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getText());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, SemanticsProperties.INSTANCE.getEditableText());
        if (charSequence == null || charSequence.length() == 0) {
            return this.view.getContext().getResources().getString(R.string.state_empty);
        }
        return null;
    }

    private final void setStateDescription(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        info.setStateDescription(getInfoStateDescriptionOrNull(node));
    }

    private final boolean getInfoIsCheckable(SemanticsNode node) {
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
        boolean z = toggleableState != null;
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected());
        if (bool != null) {
            bool.booleanValue();
            if (!(role != null ? Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z;
    }

    private final void setIsCheckable(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        info.setCheckable(getInfoIsCheckable(node));
    }

    private final AnnotatedString getInfoText(SemanticsNode node) {
        AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        return textForTextField == null ? list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null : textForTextField;
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString infoText = getInfoText(node);
        info.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i = this.focusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent createEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            createEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            createEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return sendEvent(createEvent);
        } finally {
            Trace.endSection();
        }
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(eventType);
        obtain.setEnabled(true);
        obtain.setClassName(ClassName);
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId)) != null) {
            obtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent createEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            createEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            createEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            createEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            createEvent.getText().add(text);
        }
        return createEvent;
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x01a4 -> B:93:0x01a5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean performActionHelper(int virtualViewId, int action, Bundle arguments) {
        SemanticsNode semanticsNode;
        Function0 function0;
        boolean enabled;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        float f;
        float f2;
        AccessibilityAction accessibilityAction;
        Function0 function05;
        boolean isRtl;
        AccessibilityAction accessibilityAction2;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function1;
        AccessibilityAction accessibilityAction3;
        boolean isRtl2;
        Function2 function2;
        SemanticsConfiguration unmergedConfig;
        SemanticsConfiguration unmergedConfig2;
        AccessibilityAction accessibilityAction4;
        Function1 function12;
        Function0 function012;
        CharSequence charSequence;
        List list;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (action == 64) {
            return requestAccessibilityFocus(virtualViewId);
        }
        if (action == 128) {
            return clearAccessibilityFocus(virtualViewId);
        }
        if (action == 256 || action == 512) {
            if (arguments != null) {
                return traverseAtGranularity(semanticsNode, arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), action == 256, arguments.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
            }
            return false;
        }
        if (action == 16384) {
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction5 == null || (function0 = (Function0) accessibilityAction5.getAction()) == null) {
                return false;
            }
            return ((Boolean) function0.invoke()).booleanValue();
        }
        if (action != 131072) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled) {
                return false;
            }
            if (action == 1) {
                AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction6 == null || (function02 = (Function0) accessibilityAction6.getAction()) == null) {
                    return false;
                }
                return ((Boolean) function02.invoke()).booleanValue();
            }
            if (action != 2) {
                Boolean bool = null;
                bool = null;
                switch (action) {
                    case 16:
                        AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
                        if (accessibilityAction7 != null && (function03 = (Function0) accessibilityAction7.getAction()) != null) {
                            bool = (Boolean) function03.invoke();
                        }
                        sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    case 32:
                        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
                        if (accessibilityAction8 == null || (function04 = (Function0) accessibilityAction8.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function04.invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
                        if (accessibilityAction9 == null || (function07 = (Function0) accessibilityAction9.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function07.invoke()).booleanValue();
                    case 65536:
                        AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
                        if (accessibilityAction10 == null || (function08 = (Function0) accessibilityAction10.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function08.invoke()).booleanValue();
                    case 262144:
                        AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
                        if (accessibilityAction11 == null || (function09 = (Function0) accessibilityAction11.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function09.invoke()).booleanValue();
                    case 524288:
                        AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
                        if (accessibilityAction12 == null || (function010 = (Function0) accessibilityAction12.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function010.invoke()).booleanValue();
                    case 1048576:
                        AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
                        if (accessibilityAction13 == null || (function011 = (Function0) accessibilityAction13.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function011.invoke()).booleanValue();
                    case 2097152:
                        String string = arguments != null ? arguments.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                        AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
                        if (accessibilityAction14 == null || (function1 = (Function1) accessibilityAction14.getAction()) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((Boolean) function1.invoke(new AnnotatedString(string, null, null, 6, null))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        SemanticsNode parent = semanticsNode.getParent();
                        if (parent != null && (unmergedConfig2 = parent.getUnmergedConfig()) != null) {
                            accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig2, SemanticsActions.INSTANCE.getScrollBy());
                            while (parent != null && accessibilityAction3 == null) {
                                parent = parent.getParent();
                                if (parent != null && (unmergedConfig = parent.getUnmergedConfig()) != null) {
                                    accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
                                }
                            }
                            if (parent != null) {
                                return false;
                            }
                            androidx.compose.ui.geometry.Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
                            LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                            androidx.compose.ui.geometry.Rect m3619translatek4lQ0M = boundsInParent.m3619translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.INSTANCE.m3598getZeroF1C5BW0());
                            androidx.compose.ui.geometry.Rect m3622Recttz77jQw = RectKt.m3622Recttz77jQw(semanticsNode.m5571getPositionInRootF1C5BW0(), IntSizeKt.m6447toSizeozmzZPI(semanticsNode.m5574getSizeYbymL2g()));
                            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                            float performActionHelper$scrollDelta = performActionHelper$scrollDelta(m3622Recttz77jQw.getLeft() - m3619translatek4lQ0M.getLeft(), m3622Recttz77jQw.getRight() - m3619translatek4lQ0M.getRight());
                            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                            if (isRtl2) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            float performActionHelper$scrollDelta2 = performActionHelper$scrollDelta(m3622Recttz77jQw.getTop() - m3619translatek4lQ0M.getTop(), m3622Recttz77jQw.getBottom() - m3619translatek4lQ0M.getBottom());
                            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                                performActionHelper$scrollDelta2 = -performActionHelper$scrollDelta2;
                            }
                            if (accessibilityAction3 == null || (function2 = (Function2) accessibilityAction3.getAction()) == null) {
                                return false;
                            }
                            return ((Boolean) function2.invoke(Float.valueOf(performActionHelper$scrollDelta), Float.valueOf(performActionHelper$scrollDelta2))).booleanValue();
                        }
                        accessibilityAction3 = null;
                        while (parent != null) {
                            parent = parent.getParent();
                            if (parent != null) {
                                accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsActions.INSTANCE.getScrollBy());
                            }
                            accessibilityAction3 = null;
                            while (parent != null) {
                            }
                        }
                        if (parent != null) {
                        }
                        break;
                    case android.R.id.accessibilityActionSetProgress:
                        if (arguments == null || !arguments.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (Function1) accessibilityAction4.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function12.invoke(Float.valueOf(arguments.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
                    case android.R.id.accessibilityActionImeEnter:
                        AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnImeAction());
                        if (accessibilityAction15 == null || (function012 = (Function0) accessibilityAction15.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function012.invoke()).booleanValue();
                    default:
                        switch (action) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                switch (action) {
                                    case android.R.id.accessibilityActionPageUp:
                                        AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                                        if (accessibilityAction16 != null && (r12 = (Function0) accessibilityAction16.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageDown:
                                        AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                                        if (accessibilityAction17 != null && (r12 = (Function0) accessibilityAction17.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageLeft:
                                        AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                                        if (accessibilityAction18 != null && (r12 = (Function0) accessibilityAction18.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    case android.R.id.accessibilityActionPageRight:
                                        AccessibilityAction accessibilityAction19 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                                        if (accessibilityAction19 != null && (r12 = (Function0) accessibilityAction19.getAction()) != null) {
                                            break;
                                        }
                                        break;
                                    default:
                                        SparseArrayCompat<CharSequence> sparseArrayCompat = this.actionIdToLabel.get(virtualViewId);
                                        if (sparseArrayCompat != null && (charSequence = sparseArrayCompat.get(action)) != null && (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                            int size = list.size();
                                            for (int i = 0; i < size; i++) {
                                                CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i);
                                                if (Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                }
                        }
                        return false;
                }
                ?? r12 = action == 4096;
                ?? r13 = action == 8192;
                ?? r15 = action == 16908345;
                ?? r2 = action == 16908347;
                ?? r4 = action == 16908344;
                ?? r14 = action == 16908346;
                ?? r5 = r15 == true || r2 == true || r12 == true || r13 == true;
                ?? r142 = r4 == true || r14 == true || r12 == true || r13 == true;
                if (r12 != false || r13 != false) {
                    ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                    AccessibilityAction accessibilityAction20 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress());
                    if (progressBarRangeInfo != null && accessibilityAction20 != null) {
                        float coerceAtLeast = RangesKt.coerceAtLeast(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue());
                        float coerceAtMost = RangesKt.coerceAtMost(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue());
                        if (progressBarRangeInfo.getSteps() > 0) {
                            f = coerceAtLeast - coerceAtMost;
                            f2 = progressBarRangeInfo.getSteps() + 1;
                        } else {
                            f = coerceAtLeast - coerceAtMost;
                            f2 = 20.0f;
                        }
                        float f3 = f / f2;
                        if (r13 != false) {
                            f3 = -f3;
                        }
                        Function1 function13 = (Function1) accessibilityAction20.getAction();
                        if (function13 != null) {
                            return ((Boolean) function13.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f3))).booleanValue();
                        }
                        return false;
                    }
                }
                long m3615getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m3615getSizeNHjbRc();
                Float scrollViewportLength = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig());
                AccessibilityAction accessibilityAction21 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction21 == null) {
                    return false;
                }
                ScrollAxisRange scrollAxisRange3 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
                if (scrollAxisRange3 != null && r5 != false) {
                    float floatValue = scrollViewportLength != null ? scrollViewportLength.floatValue() : Size.m3651getWidthimpl(m3615getSizeNHjbRc);
                    if (r15 != false || r13 != false) {
                        floatValue = -floatValue;
                    }
                    if (scrollAxisRange3.getReverseScrolling()) {
                        floatValue = -floatValue;
                    }
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (isRtl && (r15 != false || r2 != false)) {
                        floatValue = -floatValue;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange3, floatValue)) {
                        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageLeft()) && !semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageRight())) {
                            Function2 function22 = (Function2) accessibilityAction21.getAction();
                            if (function22 != null) {
                                return ((Boolean) function22.invoke(Float.valueOf(floatValue), Float.valueOf(0.0f))).booleanValue();
                            }
                            return false;
                        }
                        if (floatValue > 0.0f) {
                            accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                        } else {
                            accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                        }
                        if (accessibilityAction2 == null || (function06 = (Function0) accessibilityAction2.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function06.invoke()).booleanValue();
                    }
                }
                ScrollAxisRange scrollAxisRange4 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
                if (scrollAxisRange4 != null && r142 != false) {
                    float floatValue2 = scrollViewportLength != null ? scrollViewportLength.floatValue() : Size.m3648getHeightimpl(m3615getSizeNHjbRc);
                    if (r4 != false || r13 != false) {
                        floatValue2 = -floatValue2;
                    }
                    if (scrollAxisRange4.getReverseScrolling()) {
                        floatValue2 = -floatValue2;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange4, floatValue2)) {
                        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageUp()) && !semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getPageDown())) {
                            Function2 function23 = (Function2) accessibilityAction21.getAction();
                            if (function23 != null) {
                                return ((Boolean) function23.invoke(Float.valueOf(0.0f), Float.valueOf(floatValue2))).booleanValue();
                            }
                            return false;
                        }
                        if (floatValue2 > 0.0f) {
                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                        } else {
                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                        }
                        if (accessibilityAction != null && (function05 = (Function0) accessibilityAction.getAction()) != null) {
                            return ((Boolean) function05.invoke()).booleanValue();
                        }
                    }
                }
                return false;
            }
            if (!Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), (Object) true)) {
                return false;
            }
            this.view.getFocusOwner().mo3511clearFocusI7lrPNg(false, true, true, FocusDirection.INSTANCE.m3502getExitdhqQ8s());
            return true;
        }
        boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, arguments != null ? arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1) : -1, arguments != null ? arguments.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
        if (accessibilitySelection) {
            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return accessibilitySelection;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        if (f >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(virtualViewId, -1);
            if (orDefault != -1) {
                info.getExtras().putInt(extraDataKey, orDefault);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(virtualViewId, -1);
            if (orDefault2 != -1) {
                info.getExtras().putInt(extraDataKey, orDefault2);
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && arguments != null && Intrinsics.areEqual(extraDataKey, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            int i = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
            int i2 = arguments.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
            if (i2 > 0 && i >= 0) {
                if (i < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig());
                    if (textLayoutResult == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = i + i3;
                        if (i4 >= textLayoutResult.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i4)));
                        }
                    }
                    info.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTestTag()) && arguments != null && Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
            String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getTestTag());
            if (str != null) {
                info.getExtras().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
            info.getExtras().putInt(extraDataKey, semanticsNode.getId());
        }
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m3619translatek4lQ0M = bounds.m3619translatek4lQ0M(textNode.m5571getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m3619translatek4lQ0M.overlaps(boundsInRoot) ? m3619translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        long mo5105localToScreenMKHz9U = this.view.mo5105localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
        long mo5105localToScreenMKHz9U2 = this.view.mo5105localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
        return new RectF(Offset.m3582getXimpl(mo5105localToScreenMKHz9U), Offset.m3583getYimpl(mo5105localToScreenMKHz9U), Offset.m3582getXimpl(mo5105localToScreenMKHz9U2), Offset.m3583getYimpl(mo5105localToScreenMKHz9U2));
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int hitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean dispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(hitTestSemanticsAt$ui_release);
            if (hitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return dispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId != Integer.MIN_VALUE) {
            updateHoveredVirtualView(Integer.MIN_VALUE);
            return true;
        }
        return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
    }

    public final int hitTestSemanticsAt$ui_release(float x, float y) {
        int i;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m5301hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(x, y), hitTestResult, false, false, 12, null);
        int lastIndex = CollectionsKt.getLastIndex(hitTestResult);
        while (true) {
            i = Integer.MIN_VALUE;
            if (-1 >= lastIndex) {
                break;
            }
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(lastIndex));
            if (this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(requireLayoutNode) != null) {
                return Integer.MIN_VALUE;
            }
            if (requireLayoutNode.getNodes().m5348hasH91voCI$ui_release(NodeKind.m5387constructorimpl(8))) {
                i = semanticsNodeIdToAccessibilityVirtualNodeId(requireLayoutNode.getSemanticsId());
                if (SemanticsUtils_androidKt.isImportantForAccessibility(SemanticsNodeKt.SemanticsNode(requireLayoutNode, false))) {
                    break;
                }
            }
            lastIndex--;
        }
        return i;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i, 256, null, null, 12, null);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    private final <T extends CharSequence> T trimToSize(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0".toString());
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    static final void semanticsChangeChecker$lambda$49(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r11 = r2;
        r2 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[Catch: all -> 0x00e3, TryCatch #0 {all -> 0x00e3, blocks: (B:11:0x006a, B:17:0x007d, B:19:0x0085, B:21:0x008e, B:23:0x0097, B:25:0x00a8, B:27:0x00af, B:28:0x00b8, B:10:0x005e), top: B:9:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop$ui_release(Continuation<? super Unit> continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        Object coroutine_suspended;
        int i;
        MutableIntSet mutableIntSet;
        ChannelIterator<Unit> channelIterator;
        MutableIntSet mutableIntSet2;
        ChannelIterator<Unit> channelIterator2;
        Object hasNext;
        if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
            if ((androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label & Integer.MIN_VALUE) != 0) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label -= Integer.MIN_VALUE;
                Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        mutableIntSet2 = new MutableIntSet(0, 1, null);
                        channelIterator2 = this.boundsUpdateChannel.iterator();
                    } catch (Throwable th) {
                        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                        th = th;
                        androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                        throw th;
                    }
                } else {
                    try {
                        if (i == 1) {
                            ChannelIterator<Unit> channelIterator3 = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                            mutableIntSet = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            channelIterator = channelIterator3;
                            this = androidComposeViewAccessibilityDelegateCompat2;
                            if (!((Boolean) obj).booleanValue()) {
                                channelIterator.next();
                                if (this.isEnabled$ui_release()) {
                                    int size = this.subtreeChangedLayoutNodes.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        LayoutNode valueAt = this.subtreeChangedLayoutNodes.valueAt(i2);
                                        this.sendSubtreeChangeAccessibilityEvents(valueAt, mutableIntSet);
                                        this.sendTypeViewScrolledAccessibilityEvent(valueAt);
                                    }
                                    mutableIntSet.clear();
                                    if (!this.checkingForSemanticsChanges) {
                                        this.checkingForSemanticsChanges = true;
                                        this.handler.post(this.semanticsChangeChecker);
                                    }
                                    this.subtreeChangedLayoutNodes.clear();
                                    this.pendingHorizontalScrollEvents.clear();
                                    this.pendingVerticalScrollEvents.clear();
                                    long j = this.SendRecurringAccessibilityEventsIntervalMillis;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = this;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = mutableIntSet;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = channelIterator;
                                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                                    if (DelayKt.delay(j, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) != coroutine_suspended) {
                                    }
                                    return coroutine_suspended;
                                }
                                mutableIntSet2 = mutableIntSet;
                                channelIterator2 = channelIterator;
                            } else {
                                this.subtreeChangedLayoutNodes.clear();
                                return Unit.INSTANCE;
                            }
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ChannelIterator<Unit> channelIterator4 = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                            MutableIntSet mutableIntSet3 = (MutableIntSet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            mutableIntSet2 = mutableIntSet3;
                            channelIterator2 = channelIterator4;
                            this = androidComposeViewAccessibilityDelegateCompat3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                        throw th;
                    }
                }
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = this;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = mutableIntSet2;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = channelIterator2;
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                hasNext = channelIterator2.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                ChannelIterator<Unit> channelIterator5 = channelIterator2;
                mutableIntSet = mutableIntSet2;
                obj = hasNext;
                channelIterator = channelIterator5;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
        if (i != 0) {
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = this;
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = mutableIntSet2;
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = channelIterator2;
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
        hasNext = channelIterator2.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
        if (hasNext != coroutine_suspended) {
        }
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo8067trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent createEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                createEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                createEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                createEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                createEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(createEvent);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r0 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        LayoutNode findClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().m5348hasH91voCI$ui_release(NodeKind.m5387constructorimpl(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().m5348hasH91voCI$ui_release(NodeKind.m5387constructorimpl(8)));
                    }
                });
            }
            if (layoutNode == null || (collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null) {
                return;
            }
            if (!collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && findClosestParentNode != null) {
                layoutNode = findClosestParentNode;
            }
            if (layoutNode != null) {
                int semanticsId = layoutNode.getSemanticsId();
                if (subtreeChangedSemanticsNodesIds.add(semanticsId)) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Unit unit2 = Unit.INSTANCE;
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        long j;
        long j2;
        long j3;
        long j4;
        SemanticsConfiguration unmergedConfig;
        MutableIntSet mutableIntSet = new MutableIntSet(0, 1, null);
        MutableIntSet mutableIntSet2 = this.paneDisplayed;
        int[] iArr = mutableIntSet2.elements;
        long[] jArr = mutableIntSet2.metadata;
        int length = jArr.length - 2;
        long j5 = 128;
        long j6 = 255;
        char c = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                int[] iArr2 = iArr;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < j5) {
                            j3 = j5;
                            int i4 = iArr2[(i << 3) + i3];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i4);
                            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j4 = j6;
                                if (semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                }
                            } else {
                                j4 = j6;
                            }
                            mutableIntSet.add(i4);
                            SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(i4);
                            sendPaneChangeEvents(i4, 32, (semanticsNodeCopy == null || (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle()));
                        } else {
                            j3 = j5;
                            j4 = j6;
                        }
                        j8 >>= 8;
                        i3++;
                        j5 = j3;
                        j6 = j4;
                    }
                    j = j5;
                    j2 = j6;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j5;
                    j2 = j6;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr = iArr2;
                j5 = j;
                j6 = j2;
            }
        } else {
            j = 128;
            j2 = 255;
        }
        this.paneDisplayed.removeAll(mutableIntSet);
        this.previousSemanticsNodes.clear();
        IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes = getCurrentSemanticsNodes();
        int[] iArr3 = currentSemanticsNodes.keys;
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr2 = currentSemanticsNodes.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j9 = jArr2[i5];
                if ((((~j9) << c) & j9 & j7) != j7) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j9 & j2) < j) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) objArr[i8];
                            if (semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle()) && this.paneDisplayed.add(i9)) {
                                sendPaneChangeEvents(i9, 16, (String) semanticsNodeWithAdjustedBounds2.getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
                            }
                            this.previousSemanticsNodes.set(i9, new SemanticsNodeCopy(semanticsNodeWithAdjustedBounds2.getSemanticsNode(), getCurrentSemanticsNodes()));
                        }
                        j9 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length2) {
                    break;
                }
                i5++;
                c = 7;
                j7 = -9187201950435737472L;
            }
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x058e, code lost:
    
        if (r1.containsAll(r3) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0591, code lost:
    
        r21 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x05df, code lost:
    
        if (r1 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getValue(), androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r18.getUnmergedConfig(), r5.getKey())) != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSemanticsPropertyChangeEvents(IntObjectMap<SemanticsNodeWithAdjustedBounds> newSemanticsNodes) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean propertiesDeleted;
        int i6;
        int i7;
        int i8;
        SemanticsNode semanticsNode;
        int i9;
        boolean accessibilityEquals;
        String text;
        int i10;
        int i11;
        int i12;
        AccessibilityEvent createTextSelectionChangedEvent;
        int i13;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
        IntObjectMap<SemanticsNodeWithAdjustedBounds> intObjectMap = newSemanticsNodes;
        ArrayList arrayList = new ArrayList(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes);
        androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes.clear();
        int[] iArr = intObjectMap.keys;
        long[] jArr = intObjectMap.metadata;
        int i14 = 2;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j = jArr[i15];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8;
                int i17 = 8 - ((~(i15 - length)) >>> 31);
                long j2 = j;
                int i18 = 0;
                while (i18 < i17) {
                    if ((j2 & 255) < 128) {
                        int i19 = iArr[(i15 << 3) + i18];
                        SemanticsNodeCopy semanticsNodeCopy = androidComposeViewAccessibilityDelegateCompat.previousSemanticsNodes.get(i19);
                        if (semanticsNodeCopy == null) {
                            i2 = i18;
                            i3 = i14;
                            i4 = i17;
                        } else {
                            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = intObjectMap.get(i19);
                            SemanticsNode semanticsNode2 = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                            if (semanticsNode2 != null) {
                                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNode2.getUnmergedConfig().iterator();
                                int i20 = 0;
                                while (it.hasNext()) {
                                    Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> next = it.next();
                                    int i21 = i14;
                                    int i22 = !((Intrinsics.areEqual(next.getKey(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(next.getKey(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) ? androidComposeViewAccessibilityDelegateCompat.registerScrollingId(i19, arrayList) : false) ? 0 : 0;
                                    SemanticsPropertyKey<?> key = next.getKey();
                                    if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getPaneTitle())) {
                                        Object value = next.getValue();
                                        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                                        String str = (String) value;
                                        if (semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPaneTitle())) {
                                            androidComposeViewAccessibilityDelegateCompat.sendPaneChangeEvents(i19, i16, str);
                                        }
                                        i6 = i18;
                                        i7 = i19;
                                        i8 = i17;
                                        semanticsNode = semanticsNode2;
                                        i9 = i20;
                                        i19 = i7;
                                        i17 = i8;
                                        i14 = i21;
                                        i18 = i6;
                                        semanticsNode2 = semanticsNode;
                                        i16 = 8;
                                        i20 = i9;
                                    } else {
                                        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getStateDescription()) ? true : Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getToggleableState())) {
                                            semanticsNode = semanticsNode2;
                                            i6 = i18;
                                            i8 = i17;
                                            i13 = i19;
                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i19), 2048, 64, null, 8, null);
                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i13), 2048, Integer.valueOf(i22), null, 8, null);
                                        } else {
                                            i6 = i18;
                                            int i23 = i19;
                                            i8 = i17;
                                            semanticsNode = semanticsNode2;
                                            if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getProgressBarRangeInfo())) {
                                                i13 = i23;
                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 2048, 64, null, 8, null);
                                                sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i13), 2048, Integer.valueOf(i22), null, 8, null);
                                            } else {
                                                if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getSelected())) {
                                                    Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getRole());
                                                    if ((role == null ? i22 : Role.m5559equalsimpl0(role.getValue(), Role.INSTANCE.m5569getTabo7Vup1c())) != 0) {
                                                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getSelected()), (Object) true)) {
                                                            AccessibilityEvent createEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 4);
                                                            SemanticsNode copyWithMergingEnabled$ui_release = semanticsNode.copyWithMergingEnabled$ui_release();
                                                            List list = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getContentDescription());
                                                            String fastJoinToString$default = list != null ? ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null) : null;
                                                            List list2 = (List) SemanticsConfigurationKt.getOrNull(copyWithMergingEnabled$ui_release.getConfig(), SemanticsProperties.INSTANCE.getText());
                                                            String fastJoinToString$default2 = list2 != null ? ListUtilsKt.fastJoinToString$default(list2, ",", null, null, 0, null, null, 62, null) : null;
                                                            if (fastJoinToString$default != null) {
                                                                createEvent.setContentDescription(fastJoinToString$default);
                                                                Unit unit = Unit.INSTANCE;
                                                                Unit unit2 = Unit.INSTANCE;
                                                            }
                                                            if (fastJoinToString$default2 != null) {
                                                                Boolean.valueOf(createEvent.getText().add(fastJoinToString$default2));
                                                            }
                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createEvent);
                                                        } else {
                                                            i13 = i23;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i13), 2048, Integer.valueOf(i22), null, 8, null);
                                                        }
                                                    } else {
                                                        i13 = i23;
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i13), 2048, 64, null, 8, null);
                                                        sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i13), 2048, Integer.valueOf(i22), null, 8, null);
                                                    }
                                                } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getContentDescription())) {
                                                    int semanticsNodeIdToAccessibilityVirtualNodeId = androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23);
                                                    Object value2 = next.getValue();
                                                    Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                                    androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) value2);
                                                } else {
                                                    String str2 = "";
                                                    if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getEditableText())) {
                                                        if (semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetText())) {
                                                            AnnotatedString textForTextField = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                                            String str3 = textForTextField != null ? textForTextField : "";
                                                            AnnotatedString textForTextField2 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode.getUnmergedConfig());
                                                            String str4 = textForTextField2 != null ? textForTextField2 : "";
                                                            CharSequence trimToSize = androidComposeViewAccessibilityDelegateCompat.trimToSize(str4, ParcelSafeTextLength);
                                                            int length2 = str3.length();
                                                            int length3 = str4.length();
                                                            int coerceAtMost = RangesKt.coerceAtMost(length2, length3);
                                                            int i24 = i22;
                                                            while (true) {
                                                                i10 = length2;
                                                                if (i24 >= coerceAtMost) {
                                                                    i11 = length3;
                                                                    break;
                                                                }
                                                                i11 = length3;
                                                                if (str3.charAt(i24) != str4.charAt(i24)) {
                                                                    break;
                                                                }
                                                                i24++;
                                                                length2 = i10;
                                                                length3 = i11;
                                                            }
                                                            int i25 = i22;
                                                            while (true) {
                                                                if (i25 >= coerceAtMost - i24) {
                                                                    i12 = i25;
                                                                    break;
                                                                }
                                                                i12 = i25;
                                                                if (str3.charAt((i10 - 1) - i25) != str4.charAt((i11 - 1) - i12)) {
                                                                    break;
                                                                } else {
                                                                    i25 = i12 + 1;
                                                                }
                                                            }
                                                            int i26 = (i10 - i12) - i24;
                                                            int i27 = (i11 - i12) - i24;
                                                            boolean contains = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                            boolean contains2 = semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword());
                                                            boolean contains3 = semanticsNodeCopy.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
                                                            int i28 = (contains3 && !contains && contains2) ? 1 : i22;
                                                            int i29 = (contains3 && contains && !contains2) ? 1 : i22;
                                                            if (i28 != 0 || i29 != 0) {
                                                                i7 = i23;
                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), Integer.valueOf(i22), Integer.valueOf(i22), Integer.valueOf(i11), trimToSize);
                                                            } else {
                                                                createTextSelectionChangedEvent = androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i23), 16);
                                                                createTextSelectionChangedEvent.setFromIndex(i24);
                                                                createTextSelectionChangedEvent.setRemovedCount(i26);
                                                                createTextSelectionChangedEvent.setAddedCount(i27);
                                                                createTextSelectionChangedEvent.setBeforeText(str3);
                                                                createTextSelectionChangedEvent.getText().add(trimToSize);
                                                                i7 = i23;
                                                            }
                                                            createTextSelectionChangedEvent.setClassName(TextFieldClassName);
                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                            i9 = i20;
                                                            if (i28 != 0 || i29 != 0) {
                                                                long packedValue = ((TextRange) semanticsNode.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                                createTextSelectionChangedEvent.setFromIndex(TextRange.m5753getStartimpl(packedValue));
                                                                createTextSelectionChangedEvent.setToIndex(TextRange.m5748getEndimpl(packedValue));
                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(createTextSelectionChangedEvent);
                                                                i9 = i20;
                                                            }
                                                        } else {
                                                            i7 = i23;
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i7), 2048, Integer.valueOf(i21), null, 8, null);
                                                            i9 = i20;
                                                        }
                                                    } else {
                                                        i7 = i23;
                                                        if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getTextSelectionRange())) {
                                                            AnnotatedString textForTextField3 = androidComposeViewAccessibilityDelegateCompat.getTextForTextField(semanticsNode.getUnmergedConfig());
                                                            if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                                                str2 = text;
                                                            }
                                                            long packedValue2 = ((TextRange) semanticsNode.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue();
                                                            androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createTextSelectionChangedEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i7), Integer.valueOf(TextRange.m5753getStartimpl(packedValue2)), Integer.valueOf(TextRange.m5748getEndimpl(packedValue2)), Integer.valueOf(str2.length()), androidComposeViewAccessibilityDelegateCompat.trimToSize(str2, ParcelSafeTextLength)));
                                                            androidComposeViewAccessibilityDelegateCompat.sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                                                            i9 = i20;
                                                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getVerticalScrollAxisRange())) {
                                                            androidComposeViewAccessibilityDelegateCompat.notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode());
                                                            ScrollObservationScope findById = SemanticsUtils_androidKt.findById(androidComposeViewAccessibilityDelegateCompat.scrollObservationScopes, i7);
                                                            Intrinsics.checkNotNull(findById);
                                                            findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange()));
                                                            findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange()));
                                                            androidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded(findById);
                                                            i9 = i20;
                                                        } else if (Intrinsics.areEqual(key, SemanticsProperties.INSTANCE.getFocused())) {
                                                            Object value3 = next.getValue();
                                                            Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                                            if (((Boolean) value3).booleanValue()) {
                                                                androidComposeViewAccessibilityDelegateCompat.sendEvent(androidComposeViewAccessibilityDelegateCompat.createEvent(androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                                            }
                                                            sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, Integer.valueOf(i22), null, 8, null);
                                                            i9 = i20;
                                                        } else if (Intrinsics.areEqual(key, SemanticsActions.INSTANCE.getCustomActions())) {
                                                            List list3 = (List) semanticsNode.getUnmergedConfig().get(SemanticsActions.INSTANCE.getCustomActions());
                                                            List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions());
                                                            if (list4 != null) {
                                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                                int size = list3.size();
                                                                for (int i30 = i22; i30 < size; i30++) {
                                                                    linkedHashSet.add(((CustomAccessibilityAction) list3.get(i30)).getLabel());
                                                                }
                                                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                                                int size2 = list4.size();
                                                                for (int i31 = i22; i31 < size2; i31++) {
                                                                    linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i31)).getLabel());
                                                                }
                                                                if (linkedHashSet.containsAll(linkedHashSet2)) {
                                                                }
                                                                i9 = 1;
                                                            } else {
                                                                i9 = i20;
                                                                if (!list3.isEmpty()) {
                                                                    i19 = i7;
                                                                    i17 = i8;
                                                                    i14 = i21;
                                                                    i18 = i6;
                                                                    semanticsNode2 = semanticsNode;
                                                                    i16 = 8;
                                                                    i9 = 1;
                                                                    i20 = i9;
                                                                }
                                                            }
                                                        } else {
                                                            if (next.getValue() instanceof AccessibilityAction) {
                                                                Object value4 = next.getValue();
                                                                Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                                                accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()));
                                                            }
                                                            i9 = 1;
                                                        }
                                                    }
                                                    i19 = i7;
                                                    i17 = i8;
                                                    i14 = i21;
                                                    i18 = i6;
                                                    semanticsNode2 = semanticsNode;
                                                    i16 = 8;
                                                    i20 = i9;
                                                }
                                                i7 = i23;
                                                i9 = i20;
                                                i19 = i7;
                                                i17 = i8;
                                                i14 = i21;
                                                i18 = i6;
                                                semanticsNode2 = semanticsNode;
                                                i16 = 8;
                                                i20 = i9;
                                            }
                                        }
                                        i7 = i13;
                                        i9 = i20;
                                        i19 = i7;
                                        i17 = i8;
                                        i14 = i21;
                                        i18 = i6;
                                        semanticsNode2 = semanticsNode;
                                        i16 = 8;
                                        i20 = i9;
                                    }
                                }
                                i2 = i18;
                                int i32 = i19;
                                SemanticsNode semanticsNode3 = semanticsNode2;
                                i3 = i14;
                                i4 = i17;
                                int i33 = i20;
                                if (i20 == 0) {
                                    propertiesDeleted = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode3, semanticsNodeCopy.getUnmergedConfig());
                                    i33 = propertiesDeleted;
                                }
                                if (i33 != 0) {
                                    sendEventForVirtualView$default(androidComposeViewAccessibilityDelegateCompat, androidComposeViewAccessibilityDelegateCompat.semanticsNodeIdToAccessibilityVirtualNodeId(i32), 2048, 0, null, 8, null);
                                }
                            } else {
                                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("no value for specified key");
                                throw new KotlinNothingValueException();
                            }
                        }
                        i5 = 8;
                    } else {
                        i2 = i18;
                        i3 = i14;
                        i4 = i17;
                        i5 = i16;
                    }
                    j2 >>= i5;
                    i18 = i2 + 1;
                    androidComposeViewAccessibilityDelegateCompat = this;
                    intObjectMap = newSemanticsNodes;
                    i16 = i5;
                    i17 = i4;
                    i14 = i3;
                }
                i = i14;
                if (i17 != i16) {
                    return;
                }
            } else {
                i = i14;
            }
            if (i15 == length) {
                return;
            }
            i15++;
            androidComposeViewAccessibilityDelegateCompat = this;
            intObjectMap = newSemanticsNodes;
            i14 = i;
        }
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z;
        ScrollObservationScope findById = SemanticsUtils_androidKt.findById(oldScrollObservationScopes, id);
        if (findById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
            findById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    IntObjectMap currentSemanticsNodes;
                    IntObjectMap currentSemanticsNodes2;
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    MutableIntObjectMap mutableIntObjectMap;
                    MutableIntObjectMap mutableIntObjectMap2;
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
                    Rect boundsInScreen;
                    ScrollAxisRange horizontalScrollAxisRange = ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = ScrollObservationScope.this.getVerticalScrollAxisRange();
                    Float oldXValue = ScrollObservationScope.this.getOldXValue();
                    Float oldYValue = ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(ScrollObservationScope.this.getSemanticsNodeId());
                        currentSemanticsNodes = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes.get(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (accessibilityNodeInfoCompat != null) {
                                    boundsInScreen = androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds);
                                    accessibilityNodeInfoCompat.setBoundsInScreen(boundsInScreen);
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        currentSemanticsNodes2 = this.getCurrentSemanticsNodes();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) currentSemanticsNodes2.get(semanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                mutableIntObjectMap2 = androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents;
                                mutableIntObjectMap2.set(semanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                mutableIntObjectMap = androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents;
                                mutableIntObjectMap.set(semanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        createEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            createEvent.getText().add(title);
        }
        sendEvent(createEvent);
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        MutableIntSet mutableIntSetOf = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().contains(semanticsNode.getId())) {
                if (!oldNode.getChildren().contains(semanticsNode.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                mutableIntSetOf.add(semanticsNode.getId());
            }
        }
        MutableIntSet children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !mutableIntSetOf.contains(iArr[(i2 << 3) + i4])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui_release2.get(i5);
            if (getCurrentSemanticsNodes().contains(semanticsNode2.getId())) {
                SemanticsNodeCopy semanticsNodeCopy = this.previousSemanticsNodes.get(semanticsNode2.getId());
                Intrinsics.checkNotNull(semanticsNodeCopy);
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode2, semanticsNodeCopy);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int i;
        int i2;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0 || (iteratorForGranularity = getIteratorForGranularity(node, granularity)) == null) {
            return false;
        }
        int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
        if (accessibilitySelectionEnd == -1) {
            accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
        }
        int[] following = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
        if (following == null) {
            return false;
        }
        int i3 = following[0];
        int i4 = following[1];
        if (extendSelection && isAccessibilitySelectionExtendable(node)) {
            i = getAccessibilitySelectionStart(node);
            if (i == -1) {
                i = forward ? i3 : i4;
            }
            i2 = forward ? i4 : i3;
        } else {
            i = forward ? i4 : i3;
            i2 = i;
        }
        this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? 256 : 512, granularity, i3, i4, SystemClock.uptimeMillis());
        setAccessibilitySelection(node, i, i2, true);
        return true;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent.setAction(pendingTextTraversedEvent.getAction());
                createEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        boolean enabled;
        if (node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node);
            if (enabled) {
                Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
                if (function3 != null) {
                    return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
                }
                return false;
            }
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        String str = iterableTextForAccessibility;
        boolean z = str.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m5753getStartimpl(((TextRange) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        if (!node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) {
            return TextRange.m5748getEndimpl(((TextRange) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        return !node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription()) && node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        AccessibilityIterators.AbstractTextSegmentIterator companion;
        TextLayoutResult textLayoutResult;
        if (node == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
        } else if (granularity == 2) {
            companion = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
        } else {
            if (granularity != 4) {
                if (granularity == 8) {
                    companion = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                    companion.initialize(iterableTextForAccessibility);
                } else if (granularity != 16) {
                    return null;
                }
            }
            if (!node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig())) == null) {
                return null;
            }
            if (granularity == 4) {
                companion = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
            } else {
                companion = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
                ((AccessibilityIterators.PageTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult, node);
            }
        }
        return companion;
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "findFocus", "focus", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int virtualViewId) {
            AccessibilityNodeInfoCompat createNodeInfo = AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent && virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
            }
            return createNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfoCompat info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int focus) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "()V", "addPageActions", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
            boolean enabled;
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }
}
