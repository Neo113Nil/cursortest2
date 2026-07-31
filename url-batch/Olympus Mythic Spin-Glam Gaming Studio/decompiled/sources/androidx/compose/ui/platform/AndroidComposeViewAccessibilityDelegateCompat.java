package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.R;
import androidx.compose.ui.TempListUtilsKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfoKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsEntity;
import androidx.compose.ui.semantics.SemanticsModifier;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ironsource.X3;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 Ý\u00012\u00020\u0001:\fÞ\u0001ß\u0001Ý\u0001à\u0001á\u0001â\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J=\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J?\u0010&\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010$\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0015J)\u0010,\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J1\u0010/\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b/\u00100J#\u00105\u001a\u0004\u0018\u0001042\b\u00101\u001a\u0004\u0018\u00010\u000b2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00108J/\u0010<\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010:*\u0002092\b\u0010%\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010;\u001a\u00020\u0006H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ%\u0010D\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00060BH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u000fH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000fH\u0002¢\u0006\u0004\bH\u0010GJ%\u0010L\u001a\u00020\u00132\u0006\u0010I\u001a\u00020\u00062\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\u0019H\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010N\u001a\u00020JH\u0002¢\u0006\u0004\bO\u0010PJ)\u0010S\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010X\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\u000b2\u0006\u0010W\u001a\u00020VH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u0006H\u0002¢\u0006\u0004\bZ\u0010[J/\u0010_\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\\\u001a\u00020\u00062\u0006\u0010]\u001a\u00020\u00132\u0006\u0010^\u001a\u00020\u0013H\u0002¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u0006H\u0002¢\u0006\u0004\ba\u00108J/\u0010e\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u00062\u0006\u0010d\u001a\u00020\u0013H\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010i\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bi\u0010hJ\u0017\u0010j\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bj\u0010kJ#\u0010m\u001a\u0004\u0018\u00010l2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\\\u001a\u00020\u0006H\u0002¢\u0006\u0004\bm\u0010nJ\u001b\u0010o\u001a\u0004\u0018\u00010\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\bo\u0010pJ\u0015\u0010s\u001a\u0004\u0018\u00010r*\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ-\u0010{\u001a\u00020\u00132\u0006\u0010u\u001a\u00020\u00132\u0006\u0010v\u001a\u00020\u00062\u0006\u0010x\u001a\u00020wH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\by\u0010zJ<\u0010{\u001a\u00020\u00132\f\u0010~\u001a\b\u0012\u0004\u0012\u00020}0|2\u0006\u0010u\u001a\u00020\u00132\u0006\u0010v\u001a\u00020\u00062\u0006\u0010x\u001a\u00020wH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0082\u0001\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0007\u0010\u0081\u0001\u001a\u00020\u000bH\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0086\u0001\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0088\u0001\u001a\u00020\u00132\u0007\u0010\u001f\u001a\u00030\u0087\u0001¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J&\u0010\u008f\u0001\u001a\u00020\u00062\b\u0010\u008b\u0001\u001a\u00030\u008a\u00012\b\u0010\u008c\u0001\u001a\u00030\u008a\u0001H\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001d\u0010\u0093\u0001\u001a\u00030\u0092\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001H\u0016¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0095\u0001\u0010GJ\u0016\u0010\u0097\u0001\u001a\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0019\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>H\u0000¢\u0006\u0005\b\u0099\u0001\u0010AJ(\u0010\u009f\u0001\u001a\u00020\u000f2\u0014\u0010\u009c\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020}0\u009b\u0001H\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001R(\u0010£\u0001\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0005\b§\u0001\u00108R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R)\u0010«\u0001\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u001a\u0010´\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0019\u0010¶\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010¤\u0001R'\u0010¸\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002090·\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R-\u0010º\u0001\u001a\u0016\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u00060\u009b\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¹\u0001R\u0019\u0010»\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¤\u0001R\u001b\u0010¼\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001d\u0010¾\u0001\u001a\b\u0012\u0004\u0012\u00020>0B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u001e\u0010Á\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010¬\u0001R\u001c\u0010Å\u0001\u001a\u0005\u0018\u00010Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R,\u0010~\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020}0\u009b\u00018B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b~\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u001f\u0010Ê\u0001\u001a\b\u0012\u0004\u0012\u00020\u00060B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010¿\u0001R=\u0010Ì\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020V0Ë\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÌ\u0001\u0010Ç\u0001\u0012\u0005\bÏ\u0001\u0010G\u001a\u0006\bÍ\u0001\u0010É\u0001\"\u0006\bÎ\u0001\u0010\u009e\u0001R\u0019\u0010Ð\u0001\u001a\u00020V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ò\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010¬\u0001R\u0018\u0010Ô\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u001e\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020J0Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R$\u0010Ú\u0001\u001a\u000f\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u000f0Ù\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0017\u0010Ü\u0001\u001a\u00020\u00138BX\u0082\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010®\u0001\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006ã\u0001"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/AccessibilityDelegateCompat;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "virtualViewId", "Landroid/view/accessibility/AccessibilityNodeInfo;", "createNodeInfo", "(I)Landroid/view/accessibility/AccessibilityNodeInfo;", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "setContentInvalid", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "setText", "", "isAccessibilityFocused", "(I)Z", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "sendEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "fromIndex", "toIndex", "itemCount", "text", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "(IILandroid/os/Bundle;)Z", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "updateHoveredVirtualView", "(I)V", "", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "notifySubtreeAccessibilityStateChangedIfNeeded", "(Landroidx/compose/ui/node/LayoutNode;)V", "Landroidx/collection/ArraySet;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/collection/ArraySet;)V", "checkForSemanticsChanges", "()V", "updateSemanticsNodesCopyAndPanes", "id", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "(ILjava/util/List;)Z", "scrollObservationScope", "sendScrollEventIfNeeded", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "semanticsNodeId", "title", "sendPaneChangeEvents", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "oldNode", "sendSemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;)V", "semanticsNodeIdToAccessibilityVirtualNodeId", "(I)I", "granularity", ToolBar.FORWARD, "extendSelection", "traverseAtGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "getAccessibilitySelectionStart", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIterableTextForAccessibility", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "Landroidx/compose/ui/text/AnnotatedString;", "getTextForTextField", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "vertical", "direction", "Landroidx/compose/ui/geometry/Offset;", X3.i.L, "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg$ui_release", "(Ljava/util/Collection;ZIJ)Z", "semanticsNode", "populateAccessibilityNodeInfoProperties", "(ILandroidx/core/view/accessibility/AccessibilityNodeInfoCompat;Landroidx/compose/ui/semantics/SemanticsNode;)V", "createEvent$ui_release", "(II)Landroid/view/accessibility/AccessibilityEvent;", "createEvent", "Landroid/view/MotionEvent;", "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "", VastAttributes.HORIZONTAL_POSITION, VastAttributes.VERTICAL_POSITION, "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "onSemanticsChange$ui_release", "onSemanticsChange", "boundsUpdatesEventLoop", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onLayoutChange$ui_release", "onLayoutChange", "", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents$ui_release", "(Ljava/util/Map;)V", "sendSemanticsPropertyChangeEvents", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "nodeProvider", "Landroidx/core/view/accessibility/AccessibilityNodeProviderCompat;", "focusedVirtualViewId", "Landroidx/collection/SparseArrayCompat;", "actionIdToLabel", "Landroidx/collection/SparseArrayCompat;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "subtreeChangedLayoutNodes", "Landroidx/collection/ArraySet;", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Ljava/util/Map;", "getCurrentSemanticsNodes", "()Ljava/util/Map;", "paneDisplayed", "", "previousSemanticsNodes", "getPreviousSemanticsNodes$ui_release", "setPreviousSemanticsNodes$ui_release", "getPreviousSemanticsNodes$ui_release$annotations", "previousSemanticsRoot", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "", "scrollObservationScopes", "Ljava/util/List;", "Lkotlin/Function1;", "sendScrollEventIfNeededLambda", "Lkotlin/jvm/functions/Function1;", "isAccessibilityEnabled", "Companion", "Api24Impl", "Api28Impl", "MyNodeProvider", "PendingTextTraversedEvent", "SemanticsNodeCopy", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat {
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat actionIdToLabel;
    private final Channel boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private Map currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private int focusedVirtualViewId;
    private final Handler handler;
    private int hoveredVirtualViewId;
    private SparseArrayCompat labelToActionId;
    private AccessibilityNodeProviderCompat nodeProvider;
    private ArraySet paneDisplayed;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private Map previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final List scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private final Function1 sendScrollEventIfNeededLambda;
    private final ArraySet subtreeChangedLayoutNodes;
    private final AndroidComposeView view;
    private static final int[] AccessibilityActionsResourceIds = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            iArr[ToggleableState.On.ordinal()] = 1;
            iArr[ToggleableState.Off.ordinal()] = 2;
            iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.hoveredVirtualViewId = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new AccessibilityNodeProviderCompat(new MyNodeProvider());
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.actionIdToLabel = new SparseArrayCompat();
        this.labelToActionId = new SparseArrayCompat();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet();
        this.boundsUpdateChannel = ChannelKt.Channel$default(-1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = MapsKt.emptyMap();
        this.paneDisplayed = new ArraySet();
        this.previousSemanticsNodes = new LinkedHashMap();
        this.previousSemanticsRoot = new SemanticsNodeCopy(view.getSemanticsOwner().getUnmergedRootSemanticsNode(), MapsKt.emptyMap());
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Intrinsics.checkNotNullParameter(view2, "view");
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
            }
        });
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.m2091semanticsChangeChecker$lambda26(AndroidComposeViewAccessibilityDelegateCompat.this);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.sendScrollEventIfNeededLambda = new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ScrollObservationScope) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ScrollObservationScope it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AndroidComposeViewAccessibilityDelegateCompat.this.sendScrollEventIfNeeded(it);
            }
        };
    }

    private final boolean isAccessibilityEnabled() {
        return this.accessibilityForceEnabledForTesting || (this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode node, int i, int i2, int i3, int i4, long j) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
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

    private final Map getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodes = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getAllUncoveredSemanticsNodesToMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesInvalidated = false;
        }
        return this.currentSemanticsNodes;
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$SemanticsNodeCopy;", "", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "currentSemanticsNodes", "", "", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/Map;)V", "children", "", "getChildren", "()Ljava/util/Set;", "unmergedConfig", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getUnmergedConfig", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "hasPaneTitle", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @VisibleForTesting
    public static final class SemanticsNodeCopy {
        private final Set children;
        private final SemanticsConfiguration unmergedConfig;

        public SemanticsNodeCopy(SemanticsNode semanticsNode, Map currentSemanticsNodes) {
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
            this.unmergedConfig = semanticsNode.getUnmergedConfig();
            this.children = new LinkedHashSet();
            List replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i = 0; i < size; i++) {
                SemanticsNode semanticsNode2 = (SemanticsNode) replacedChildren$ui_release.get(i);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                    this.children.add(Integer.valueOf(semanticsNode2.getId()));
                }
            }
        }

        public final SemanticsConfiguration getUnmergedConfig() {
            return this.unmergedConfig;
        }

        public final Set getChildren() {
            return this.children;
        }

        public final boolean hasPaneTitle() {
            return this.unmergedConfig.contains(SemanticsProperties.INSTANCE.getPaneTitle());
        }
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m2092canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        return m2093canScrollmoWRBKg$ui_release(getCurrentSemanticsNodes().values(), vertical, direction, position);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:11:0x003d->B:22:?, LOOP_END, SYNTHETIC] */
    /* renamed from: canScroll-moWRBKg$ui_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2093canScrollmoWRBKg$ui_release(Collection currentSemanticsNodes, boolean vertical, int direction, long position) {
        SemanticsPropertyKey horizontalScrollAxisRange;
        ScrollAxisRange scrollAxisRange;
        boolean z;
        Intrinsics.checkNotNullParameter(currentSemanticsNodes, "currentSemanticsNodes");
        if (Offset.m1294equalsimpl0(position, Offset.INSTANCE.m1307getUnspecifiedF1C5BW0()) || !Offset.m1300isValidimpl(position)) {
            return false;
        }
        if (vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getVerticalScrollAxisRange();
        } else if (!vertical) {
            horizontalScrollAxisRange = SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Collection<SemanticsNodeWithAdjustedBounds> collection = currentSemanticsNodes;
        if (collection.isEmpty()) {
            return false;
        }
        for (SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds : collection) {
            if (RectHelper_androidKt.toComposeRect(semanticsNodeWithAdjustedBounds.getAdjustedBounds()).m1313containsk4lQ0M(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getConfig(), horizontalScrollAxisRange)) != null) {
                int i = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                    i = -1;
                }
                if (i >= 0 ? ((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().mo4828invoke()).floatValue() : ((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() > 0.0f) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccessibilityNodeInfo createNodeInfo(int virtualViewId) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getState()) == Lifecycle.State.DESTROYED) {
            return null;
        }
        AccessibilityNodeInfoCompat obtain = AccessibilityNodeInfoCompat.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null) {
            obtain.recycle();
            return null;
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        if (virtualViewId == -1) {
            Object parentForAccessibility = ViewCompat.getParentForAccessibility(this.view);
            obtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else if (semanticsNode.getParent() != null) {
            SemanticsNode parent = semanticsNode.getParent();
            Intrinsics.checkNotNull(parent);
            int id = parent.getId();
            obtain.setParent(this.view, id != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? id : -1);
        } else {
            throw new IllegalStateException("semanticsNode " + virtualViewId + " has null parent");
        }
        obtain.setSource(this.view, virtualViewId);
        Rect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        long mo1907localToScreenMKHz9U = this.view.mo1907localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long mo1907localToScreenMKHz9U2 = this.view.mo1907localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        obtain.setBoundsInScreen(new Rect((int) Math.floor(Offset.m1297getXimpl(mo1907localToScreenMKHz9U)), (int) Math.floor(Offset.m1298getYimpl(mo1907localToScreenMKHz9U)), (int) Math.ceil(Offset.m1297getXimpl(mo1907localToScreenMKHz9U2)), (int) Math.ceil(Offset.m1298getYimpl(mo1907localToScreenMKHz9U2))));
        populateAccessibilityNodeInfoProperties(virtualViewId, obtain, semanticsNode);
        return obtain.unwrap();
    }

    public final void populateAccessibilityNodeInfoProperties(int virtualViewId, AccessibilityNodeInfoCompat info, SemanticsNode semanticsNode) {
        boolean isTextField;
        boolean isPassword;
        boolean isTextField2;
        boolean enabled;
        LayoutNodeWrapper findWrapperToGetBounds$ui_release;
        boolean enabled2;
        boolean enabled3;
        boolean enabled4;
        boolean enabled5;
        boolean isRtl;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat;
        boolean isRtl2;
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2;
        boolean enabled6;
        int i;
        boolean excludeLineAndPageGranularities;
        boolean enabled7;
        boolean enabled8;
        boolean z;
        String string;
        String str;
        LayoutNode findClosestParentNode;
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        info.setClassName("android.view.View");
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getRole());
        if (role != null) {
            int value = role.getValue();
            if (semanticsNode.getIsFake() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
                Role.Companion companion = Role.INSTANCE;
                if (Role.m2160equalsimpl0(role.getValue(), companion.m2169getTabo7Vup1c())) {
                    info.setRoleDescription(this.view.getContext().getResources().getString(R.string.tab));
                } else {
                    if (Role.m2160equalsimpl0(value, companion.m2164getButtono7Vup1c())) {
                        str = "android.widget.Button";
                    } else if (Role.m2160equalsimpl0(value, companion.m2165getCheckboxo7Vup1c())) {
                        str = "android.widget.CheckBox";
                    } else if (Role.m2160equalsimpl0(value, companion.m2168getSwitcho7Vup1c())) {
                        str = "android.widget.Switch";
                    } else if (Role.m2160equalsimpl0(value, companion.m2167getRadioButtono7Vup1c())) {
                        str = "android.widget.RadioButton";
                    } else {
                        str = Role.m2160equalsimpl0(value, companion.m2166getImageo7Vup1c()) ? "android.widget.ImageView" : null;
                    }
                    if (Role.m2160equalsimpl0(role.getValue(), companion.m2166getImageo7Vup1c())) {
                        findClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(semanticsNode.getLayoutNode(), new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$populateAccessibilityNodeInfoProperties$1$ancestor$1
                            @Override // kotlin.jvm.functions.Function1
                            @NotNull
                            public final Boolean invoke(@NotNull LayoutNode parent) {
                                SemanticsConfiguration collapsedSemanticsConfiguration;
                                Intrinsics.checkNotNullParameter(parent, "parent");
                                SemanticsEntity outerSemantics = SemanticsNodeKt.getOuterSemantics(parent);
                                boolean z2 = false;
                                if (outerSemantics != null && (collapsedSemanticsConfiguration = outerSemantics.collapsedSemanticsConfiguration()) != null && collapsedSemanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                                    z2 = true;
                                }
                                return Boolean.valueOf(z2);
                            }
                        });
                        if (findClosestParentNode == null || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                            info.setClassName(str);
                        }
                    } else {
                        info.setClassName(str);
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
        if (isTextField) {
            info.setClassName("android.widget.EditText");
        }
        if (semanticsNode.getConfig().contains(semanticsProperties.getText())) {
            info.setClassName("android.widget.TextView");
        }
        info.setPackageName(this.view.getContext().getPackageName());
        List replacedChildrenSortedByBounds$ui_release = semanticsNode.getReplacedChildrenSortedByBounds$ui_release();
        int size = replacedChildrenSortedByBounds$ui_release.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) replacedChildrenSortedByBounds$ui_release.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsNode2.getLayoutNode());
                if (androidViewHolder != null) {
                    info.addChild(androidViewHolder);
                } else {
                    info.addChild(this.view, semanticsNode2.getId());
                }
            }
        }
        if (this.focusedVirtualViewId == virtualViewId) {
            info.setAccessibilityFocused(true);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        } else {
            info.setAccessibilityFocused(false);
            info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_ACCESSIBILITY_FOCUS);
        }
        setText(semanticsNode, info);
        setContentInvalid(semanticsNode, info);
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
        info.setStateDescription((CharSequence) SemanticsConfigurationKt.getOrNull(unmergedConfig2, semanticsProperties2.getStateDescription()));
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getToggleableState());
        if (toggleableState != null) {
            info.setCheckable(true);
            int i3 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i3 == 1) {
                info.setChecked(true);
                if ((role == null ? false : Role.m2160equalsimpl0(role.getValue(), Role.INSTANCE.m2168getSwitcho7Vup1c())) && info.getStateDescription() == null) {
                    info.setStateDescription(this.view.getContext().getResources().getString(R.string.on));
                }
            } else if (i3 == 2) {
                info.setChecked(false);
                if ((role == null ? false : Role.m2160equalsimpl0(role.getValue(), Role.INSTANCE.m2168getSwitcho7Vup1c())) && info.getStateDescription() == null) {
                    info.setStateDescription(this.view.getContext().getResources().getString(R.string.off));
                }
            } else if (i3 == 3 && info.getStateDescription() == null) {
                info.setStateDescription(this.view.getContext().getResources().getString(R.string.indeterminate));
            }
            Unit unit2 = Unit.INSTANCE;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getSelected());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (role == null ? false : Role.m2160equalsimpl0(role.getValue(), Role.INSTANCE.m2169getTabo7Vup1c())) {
                info.setSelected(booleanValue);
            } else {
                info.setCheckable(true);
                info.setChecked(booleanValue);
                if (info.getStateDescription() == null) {
                    if (booleanValue) {
                        string = this.view.getContext().getResources().getString(R.string.selected);
                    } else {
                        string = this.view.getContext().getResources().getString(R.string.not_selected);
                    }
                    info.setStateDescription(string);
                }
            }
            Unit unit3 = Unit.INSTANCE;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.getReplacedChildren$ui_release().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getContentDescription());
            info.setContentDescription(list != null ? (String) CollectionsKt.firstOrNull(list) : null);
        }
        if (semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
            info.setScreenReaderFocusable(true);
        }
        String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getTestTag());
        if (str2 != null) {
            SemanticsNode semanticsNode3 = semanticsNode;
            while (true) {
                if (semanticsNode3 == null) {
                    z = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig3 = semanticsNode3.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.INSTANCE;
                if (unmergedConfig3.contains(semanticsPropertiesAndroid.getTestTagsAsResourceId())) {
                    z = ((Boolean) semanticsNode3.getUnmergedConfig().get(semanticsPropertiesAndroid.getTestTagsAsResourceId())).booleanValue();
                    break;
                }
                semanticsNode3 = semanticsNode3.getParent();
            }
            if (z) {
                info.setViewIdResourceName(str2);
            }
        }
        SemanticsConfiguration unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.INSTANCE;
        if (((Unit) SemanticsConfigurationKt.getOrNull(unmergedConfig4, semanticsProperties3.getHeading())) != null) {
            info.setHeading(true);
            Unit unit4 = Unit.INSTANCE;
        }
        isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNode);
        info.setPassword(isPassword);
        isTextField2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
        info.setEditable(isTextField2);
        enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        info.setEnabled(enabled);
        info.setFocusable(semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getFocused()));
        if (info.isFocusable()) {
            info.setFocused(((Boolean) semanticsNode.getUnmergedConfig().get(semanticsProperties3.getFocused())).booleanValue());
            if (info.isFocused()) {
                info.addAction(2);
            } else {
                info.addAction(1);
            }
        }
        if (semanticsNode.getIsFake()) {
            SemanticsNode parent = semanticsNode.getParent();
            findWrapperToGetBounds$ui_release = parent != null ? parent.findWrapperToGetBounds$ui_release() : null;
        } else {
            findWrapperToGetBounds$ui_release = semanticsNode.findWrapperToGetBounds$ui_release();
        }
        info.setVisibleToUser(!(findWrapperToGetBounds$ui_release != null ? findWrapperToGetBounds$ui_release.isTransparent() : false) && SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getInvisibleToUser()) == null);
        LiveRegionMode liveRegionMode = (LiveRegionMode) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getLiveRegion());
        if (liveRegionMode != null) {
            int value2 = liveRegionMode.getValue();
            LiveRegionMode.Companion companion2 = LiveRegionMode.INSTANCE;
            info.setLiveRegion((LiveRegionMode.m2151equalsimpl0(value2, companion2.m2156getPolite0phEisY()) || !LiveRegionMode.m2151equalsimpl0(value2, companion2.m2155getAssertive0phEisY())) ? 1 : 2);
            Unit unit5 = Unit.INSTANCE;
        }
        info.setClickable(false);
        SemanticsConfiguration unmergedConfig5 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig5, semanticsActions.getOnClick());
        if (accessibilityAction != null) {
            boolean areEqual = Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getSelected()), Boolean.TRUE);
            info.setClickable(!areEqual);
            enabled8 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled8 && !areEqual) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, accessibilityAction.getLabel()));
            }
            Unit unit6 = Unit.INSTANCE;
        }
        info.setLongClickable(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getOnLongClick());
        if (accessibilityAction2 != null) {
            info.setLongClickable(true);
            enabled7 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (enabled7) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, accessibilityAction2.getLabel()));
            }
            Unit unit7 = Unit.INSTANCE;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCopyText());
        if (accessibilityAction3 != null) {
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, accessibilityAction3.getLabel()));
            Unit unit8 = Unit.INSTANCE;
        }
        enabled2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled2) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetText());
            if (accessibilityAction4 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, accessibilityAction4.getLabel()));
                Unit unit9 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCutText());
            if (accessibilityAction5 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, accessibilityAction5.getLabel()));
                Unit unit10 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPasteText());
            if (accessibilityAction6 != null) {
                if (info.isFocused() && this.view.getClipboardManager().hasText()) {
                    info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, accessibilityAction6.getLabel()));
                }
                Unit unit11 = Unit.INSTANCE;
            }
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (!(iterableTextForAccessibility == null || iterableTextForAccessibility.length() == 0)) {
            info.setTextSelection(getAccessibilitySelectionStart(semanticsNode), getAccessibilitySelectionEnd(semanticsNode));
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getSetSelection());
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, accessibilityAction7 != null ? accessibilityAction7.getLabel() : null));
            info.addAction(256);
            info.addAction(512);
            info.setMovementGranularities(11);
            List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getContentDescription());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult())) {
                excludeLineAndPageGranularities = AndroidComposeViewAccessibilityDelegateCompat_androidKt.excludeLineAndPageGranularities(semanticsNode);
                if (!excludeLineAndPageGranularities) {
                    info.setMovementGranularities(info.getMovementGranularities() | 20);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence text = info.getText();
            if (!(text == null || text.length() == 0) && semanticsNode.getUnmergedConfig().contains(semanticsActions.getGetTextLayoutResult())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsProperties3.getTestTag())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                AccessibilityNodeInfoVerificationHelperMethods accessibilityNodeInfoVerificationHelperMethods = AccessibilityNodeInfoVerificationHelperMethods.INSTANCE;
                AccessibilityNodeInfo unwrap = info.unwrap();
                Intrinsics.checkNotNullExpressionValue(unwrap, "info.unwrap()");
                accessibilityNodeInfoVerificationHelperMethods.setAvailableExtraData(unwrap, arrayList);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress())) {
                info.setClassName("android.widget.SeekBar");
            } else {
                info.setClassName("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                info.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, ((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), progressBarRangeInfo.getCurrent()));
                if (info.getStateDescription() == null) {
                    ClosedFloatingPointRange range = progressBarRangeInfo.getRange();
                    float coerceIn = RangesKt.coerceIn(((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) > 0.0f ? 1 : ((((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - ((Number) range.getStart()).floatValue()) / (((Number) range.getEndInclusive()).floatValue() - ((Number) range.getStart()).floatValue()), 0.0f, 1.0f);
                    if (coerceIn == 0.0f) {
                        i = 0;
                    } else {
                        i = 100;
                        if (!(coerceIn == 1.0f)) {
                            i = RangesKt.coerceIn(MathKt.roundToInt(coerceIn * 100), 1, 99);
                        }
                    }
                    info.setStateDescription(this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(i)));
                }
            } else if (info.getStateDescription() == null) {
                info.setStateDescription(this.view.getContext().getResources().getString(R.string.in_progress));
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getSetProgress())) {
                enabled6 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
                if (enabled6) {
                    if (progressBarRangeInfo.getCurrent() < RangesKt.coerceAtLeast(((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), ((Number) progressBarRangeInfo.getRange().getStart()).floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                    }
                    if (progressBarRangeInfo.getCurrent() > RangesKt.coerceAtMost(((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue())) {
                        info.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                    }
                }
            }
        }
        Api24Impl.addSetProgressAction(info, semanticsNode);
        CollectionInfoKt.setCollectionInfo(semanticsNode, info);
        CollectionInfoKt.setCollectionItemInfo(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getHorizontalScrollAxisRange());
        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getScrollBy());
        if (scrollAxisRange != null && accessibilityAction8 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.getMaxValue().mo4828invoke()).floatValue() > 0.0f) {
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
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && accessibilityAction8 != null) {
            if (!CollectionInfoKt.hasCollectionInfo(semanticsNode)) {
                info.setClassName("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.getMaxValue().mo4828invoke()).floatValue() > 0.0f) {
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
        info.setPaneTitle((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties3.getPaneTitle()));
        enabled3 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
        if (enabled3) {
            AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getExpand());
            if (accessibilityAction9 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, accessibilityAction9.getLabel()));
                Unit unit12 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getCollapse());
            if (accessibilityAction10 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, accessibilityAction10.getLabel()));
                Unit unit13 = Unit.INSTANCE;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getDismiss());
            if (accessibilityAction11 != null) {
                info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, accessibilityAction11.getLabel()));
                Unit unit14 = Unit.INSTANCE;
            }
            if (semanticsNode.getUnmergedConfig().contains(semanticsActions.getCustomActions())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().get(semanticsActions.getCustomActions());
                int size2 = list3.size();
                int[] iArr = AccessibilityActionsResourceIds;
                if (size2 >= iArr.length) {
                    throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
                }
                SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!this.labelToActionId.containsKey(virtualViewId)) {
                    int size3 = list3.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i4);
                        int i5 = AccessibilityActionsResourceIds[i4];
                        sparseArrayCompat.put(i5, customAccessibilityAction.getLabel());
                        linkedHashMap.put(customAccessibilityAction.getLabel(), Integer.valueOf(i5));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i5, customAccessibilityAction.getLabel()));
                    }
                } else {
                    Map map = (Map) this.labelToActionId.get(virtualViewId);
                    List mutableList = ArraysKt.toMutableList(iArr);
                    ArrayList arrayList2 = new ArrayList();
                    int size4 = list3.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) list3.get(i6);
                        Intrinsics.checkNotNull(map);
                        if (map.containsKey(customAccessibilityAction2.getLabel())) {
                            Integer num = (Integer) map.get(customAccessibilityAction2.getLabel());
                            Intrinsics.checkNotNull(num);
                            sparseArrayCompat.put(num.intValue(), customAccessibilityAction2.getLabel());
                            linkedHashMap.put(customAccessibilityAction2.getLabel(), num);
                            mutableList.remove(num);
                            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(num.intValue(), customAccessibilityAction2.getLabel()));
                        } else {
                            arrayList2.add(customAccessibilityAction2);
                        }
                    }
                    int size5 = arrayList2.size();
                    for (int i7 = 0; i7 < size5; i7++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) arrayList2.get(i7);
                        int intValue = ((Number) mutableList.get(i7)).intValue();
                        sparseArrayCompat.put(intValue, customAccessibilityAction3.getLabel());
                        linkedHashMap.put(customAccessibilityAction3.getLabel(), Integer.valueOf(intValue));
                        info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(intValue, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.put(virtualViewId, sparseArrayCompat);
                this.labelToActionId.put(virtualViewId, linkedHashMap);
            }
        }
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        return (((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().mo4828invoke()).floatValue() && !scrollAxisRange.getReverseScrolling()) || (((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling());
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        return (((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() > 0.0f && !scrollAxisRange.getReverseScrolling()) || (((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().mo4828invoke()).floatValue() && scrollAxisRange.getReverseScrolling());
    }

    private final void setContentInvalid(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig.contains(semanticsProperties.getError())) {
            info.setContentInvalid(true);
            info.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getError()));
        }
    }

    private final void setText(SemanticsNode node, AccessibilityNodeInfoCompat info) {
        AnnotatedString annotatedString;
        FontFamily.Resolver fontFamilyResolver = this.view.getFontFamilyResolver();
        AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) trimToSize(textForTextField != null ? AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(textForTextField, this.view.getDensity(), fontFamilyResolver) : null, 100000);
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        if (list != null && (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) != null) {
            spannableString = AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), fontFamilyResolver);
        }
        SpannableString spannableString3 = (SpannableString) trimToSize(spannableString, 100000);
        if (spannableString2 == null) {
            spannableString2 = spannableString3;
        }
        info.setText(spannableString2);
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityEnabled() || isAccessibilityFocused(virtualViewId)) {
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

    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i, i2, num, list);
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isAccessibilityEnabled()) {
            return false;
        }
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(virtualViewId, eventType);
        if (contentChangeType != null) {
            createEvent$ui_release.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            createEvent$ui_release.setContentDescription(TempListUtilsKt.fastJoinToString$default(contentDescription, StringUtils.COMMA, null, null, 0, null, null, 62, null));
        }
        return sendEvent(createEvent$ui_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean sendEvent(AccessibilityEvent event) {
        if (isAccessibilityEnabled()) {
            return this.view.getParent().requestSendAccessibilityEvent(this.view, event);
        }
        return false;
    }

    public final AccessibilityEvent createEvent$ui_release(int virtualViewId, int eventType) {
        boolean isPassword;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(eventType);
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.view.getContext().getPackageName());
        obtain.setSource(this.view, virtualViewId);
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds != null) {
            isPassword = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode());
            obtain.setPassword(isPassword);
        }
        return obtain;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, String text) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(virtualViewId, 8192);
        if (fromIndex != null) {
            createEvent$ui_release.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            createEvent$ui_release.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            createEvent$ui_release.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            createEvent$ui_release.getText().add(text);
        }
        return createEvent$ui_release;
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x00e6 -> B:55:0x00e7). Please report as a decompilation issue!!! */
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
        int i;
        Function2 function2;
        boolean isRtl;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Function0 function08;
        Function0 function09;
        Function1 function1;
        AccessibilityAction accessibilityAction;
        boolean isRtl2;
        Function2 function22;
        SemanticsConfiguration config;
        SemanticsConfiguration config2;
        AccessibilityAction accessibilityAction2;
        Function1 function12;
        CharSequence charSequence;
        List list;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
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
                return traverseAtGranularity(semanticsNode, arguments.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), action == 256, arguments.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
            }
            return false;
        }
        if (action == 16384) {
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction3 == null || (function0 = (Function0) accessibilityAction3.getAction()) == null) {
                return false;
            }
            return ((Boolean) function0.mo4828invoke()).booleanValue();
        }
        if (action != 131072) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled) {
                return false;
            }
            if (action == 1) {
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getRequestFocus());
                if (accessibilityAction4 == null || (function02 = (Function0) accessibilityAction4.getAction()) == null) {
                    return false;
                }
                return ((Boolean) function02.mo4828invoke()).booleanValue();
            }
            Boolean bool = null;
            bool = null;
            if (action != 2) {
                switch (action) {
                    case 16:
                        AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnClick());
                        if (accessibilityAction5 != null && (function03 = (Function0) accessibilityAction5.getAction()) != null) {
                            bool = (Boolean) function03.mo4828invoke();
                        }
                        sendEventForVirtualView$default(this, virtualViewId, 1, null, null, 12, null);
                        if (bool != null) {
                            return bool.booleanValue();
                        }
                        return false;
                    case 32:
                        AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getOnLongClick());
                        if (accessibilityAction6 == null || (function04 = (Function0) accessibilityAction6.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function04.mo4828invoke()).booleanValue();
                    case 4096:
                    case 8192:
                        break;
                    case 32768:
                        AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getPasteText());
                        if (accessibilityAction7 == null || (function05 = (Function0) accessibilityAction7.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function05.mo4828invoke()).booleanValue();
                    case 65536:
                        AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCutText());
                        if (accessibilityAction8 == null || (function06 = (Function0) accessibilityAction8.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function06.mo4828invoke()).booleanValue();
                    case 262144:
                        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getExpand());
                        if (accessibilityAction9 == null || (function07 = (Function0) accessibilityAction9.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function07.mo4828invoke()).booleanValue();
                    case 524288:
                        AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCollapse());
                        if (accessibilityAction10 == null || (function08 = (Function0) accessibilityAction10.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function08.mo4828invoke()).booleanValue();
                    case 1048576:
                        AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getDismiss());
                        if (accessibilityAction11 == null || (function09 = (Function0) accessibilityAction11.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function09.mo4828invoke()).booleanValue();
                    case 2097152:
                        String string = arguments != null ? arguments.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                        AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetText());
                        if (accessibilityAction12 == null || (function1 = (Function1) accessibilityAction12.getAction()) == null) {
                            return false;
                        }
                        if (string == null) {
                            string = "";
                        }
                        return ((Boolean) function1.invoke(new AnnotatedString(string, null, null, 6, null))).booleanValue();
                    case android.R.id.accessibilityActionShowOnScreen:
                        SemanticsNode parent = semanticsNode.getParent();
                        if (parent != null && (config2 = parent.getConfig()) != null) {
                            accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config2, SemanticsActions.INSTANCE.getScrollBy());
                            while (parent != null && accessibilityAction == null) {
                                parent = parent.getParent();
                                if (parent != null && (config = parent.getConfig()) != null) {
                                    accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getScrollBy());
                                }
                            }
                            if (parent != null) {
                                return false;
                            }
                            androidx.compose.ui.geometry.Rect boundsInParent = LayoutCoordinatesKt.boundsInParent(parent.getLayoutInfo().getCoordinates());
                            LayoutCoordinates parentLayoutCoordinates = parent.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
                            androidx.compose.ui.geometry.Rect m1320translatek4lQ0M = boundsInParent.m1320translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.INSTANCE.m1308getZeroF1C5BW0());
                            androidx.compose.ui.geometry.Rect m1322Recttz77jQw = RectKt.m1322Recttz77jQw(semanticsNode.m2171getPositionInRootF1C5BW0(), IntSizeKt.m2572toSizeozmzZPI(semanticsNode.m2172getSizeYbymL2g()));
                            SemanticsConfiguration unmergedConfig = parent.getUnmergedConfig();
                            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(unmergedConfig, semanticsProperties.getHorizontalScrollAxisRange());
                            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(parent.getUnmergedConfig(), semanticsProperties.getVerticalScrollAxisRange());
                            float performActionHelper$scrollDelta = performActionHelper$scrollDelta(m1322Recttz77jQw.getLeft() - m1320translatek4lQ0M.getLeft(), m1322Recttz77jQw.getRight() - m1320translatek4lQ0M.getRight());
                            if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            isRtl2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                            if (isRtl2) {
                                performActionHelper$scrollDelta = -performActionHelper$scrollDelta;
                            }
                            float performActionHelper$scrollDelta2 = performActionHelper$scrollDelta(m1322Recttz77jQw.getTop() - m1320translatek4lQ0M.getTop(), m1322Recttz77jQw.getBottom() - m1320translatek4lQ0M.getBottom());
                            if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
                                performActionHelper$scrollDelta2 = -performActionHelper$scrollDelta2;
                            }
                            if (accessibilityAction == null || (function22 = (Function2) accessibilityAction.getAction()) == null) {
                                return false;
                            }
                            return ((Boolean) function22.invoke(Float.valueOf(performActionHelper$scrollDelta), Float.valueOf(performActionHelper$scrollDelta2))).booleanValue();
                        }
                        accessibilityAction = null;
                        while (parent != null) {
                            parent = parent.getParent();
                            if (parent != null) {
                                accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(config, SemanticsActions.INSTANCE.getScrollBy());
                            }
                            accessibilityAction = null;
                            while (parent != null) {
                            }
                        }
                        if (parent != null) {
                        }
                        break;
                    case android.R.id.accessibilityActionSetProgress:
                        if (arguments == null || !arguments.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null || (function12 = (Function1) accessibilityAction2.getAction()) == null) {
                            return false;
                        }
                        return ((Boolean) function12.invoke(Float.valueOf(arguments.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
                    default:
                        switch (action) {
                            case android.R.id.accessibilityActionScrollUp:
                            case android.R.id.accessibilityActionScrollLeft:
                            case android.R.id.accessibilityActionScrollDown:
                            case android.R.id.accessibilityActionScrollRight:
                                break;
                            default:
                                SparseArrayCompat sparseArrayCompat = (SparseArrayCompat) this.actionIdToLabel.get(virtualViewId);
                                if (sparseArrayCompat != null && (charSequence = (CharSequence) sparseArrayCompat.get(action)) != null && (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                    int size = list.size();
                                    for (int i2 = 0; i2 < size; i2++) {
                                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i2);
                                        if (Intrinsics.areEqual(customAccessibilityAction.getLabel(), charSequence)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                        return false;
                }
                ?? r13 = action == 4096;
                ?? r15 = action == 8192;
                ?? r2 = action == 16908345;
                ?? r4 = action == 16908347;
                ?? r5 = action == 16908344;
                ?? r14 = action == 16908346;
                ?? r6 = r2 == true || r4 == true || r13 == true || r15 == true;
                ?? r142 = r5 == true || r14 == true || r13 == true || r15 == true;
                if (r13 != false || r15 != false) {
                    ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
                    AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress());
                    if (progressBarRangeInfo != null && accessibilityAction13 != null) {
                        float coerceAtLeast = RangesKt.coerceAtLeast(((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue(), ((Number) progressBarRangeInfo.getRange().getStart()).floatValue());
                        float coerceAtMost = RangesKt.coerceAtMost(((Number) progressBarRangeInfo.getRange().getStart()).floatValue(), ((Number) progressBarRangeInfo.getRange().getEndInclusive()).floatValue());
                        if (progressBarRangeInfo.getSteps() > 0) {
                            f = coerceAtLeast - coerceAtMost;
                            i = progressBarRangeInfo.getSteps() + 1;
                        } else {
                            f = coerceAtLeast - coerceAtMost;
                            i = 20;
                        }
                        float f2 = f / i;
                        if (r15 != false) {
                            f2 = -f2;
                        }
                        Function1 function13 = (Function1) accessibilityAction13.getAction();
                        if (function13 != null) {
                            return ((Boolean) function13.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f2))).booleanValue();
                        }
                        return false;
                    }
                }
                long m1317getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m1317getSizeNHjbRc();
                AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getScrollBy());
                if (accessibilityAction14 == null) {
                    return false;
                }
                SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                ScrollAxisRange scrollAxisRange3 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(unmergedConfig2, semanticsProperties2.getHorizontalScrollAxisRange());
                if (scrollAxisRange3 != null && r6 != false) {
                    float m1335getWidthimpl = Size.m1335getWidthimpl(m1317getSizeNHjbRc);
                    if (r2 != false || r15 != false) {
                        m1335getWidthimpl = -m1335getWidthimpl;
                    }
                    if (scrollAxisRange3.getReverseScrolling()) {
                        m1335getWidthimpl = -m1335getWidthimpl;
                    }
                    isRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode);
                    if (isRtl && (r2 != false || r4 != false)) {
                        m1335getWidthimpl = -m1335getWidthimpl;
                    }
                    if (performActionHelper$canScroll(scrollAxisRange3, m1335getWidthimpl)) {
                        Function2 function23 = (Function2) accessibilityAction14.getAction();
                        if (function23 != null) {
                            return ((Boolean) function23.invoke(Float.valueOf(m1335getWidthimpl), Float.valueOf(0.0f))).booleanValue();
                        }
                        return false;
                    }
                }
                ScrollAxisRange scrollAxisRange4 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getVerticalScrollAxisRange());
                if (scrollAxisRange4 == null || !r142 == true) {
                    return false;
                }
                float m1333getHeightimpl = Size.m1333getHeightimpl(m1317getSizeNHjbRc);
                if (r5 != false || r15 != false) {
                    m1333getHeightimpl = -m1333getHeightimpl;
                }
                if (scrollAxisRange4.getReverseScrolling()) {
                    m1333getHeightimpl = -m1333getHeightimpl;
                }
                if (!performActionHelper$canScroll(scrollAxisRange4, m1333getHeightimpl) || (function2 = (Function2) accessibilityAction14.getAction()) == null) {
                    return false;
                }
                return ((Boolean) function2.invoke(Float.valueOf(0.0f), Float.valueOf(m1333getHeightimpl))).booleanValue();
            }
            if (!Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsProperties.INSTANCE.getFocused()), Boolean.TRUE)) {
                return false;
            }
            FocusManager.clearFocus$default(this.view.getFocusManager(), false, 1, null);
            return true;
        }
        boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
        if (accessibilitySelection) {
            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
        }
        return accessibilitySelection;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f) {
        return (f < 0.0f && ((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() > 0.0f) || (f > 0.0f && ((Number) scrollAxisRange.getValue().mo4828invoke()).floatValue() < ((Number) scrollAxisRange.getMaxValue().mo4828invoke()).floatValue());
    }

    private static final float performActionHelper$scrollDelta(float f, float f2) {
        if (Math.signum(f) == Math.signum(f2)) {
            return Math.abs(f) < Math.abs(f2) ? f : f2;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        String str;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(Integer.valueOf(virtualViewId));
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig.contains(semanticsActions.getGetTextLayoutResult()) && arguments != null && Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i2 > 0 && i >= 0) {
                if (i < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    ArrayList arrayList = new ArrayList();
                    Function1 function1 = (Function1) ((AccessibilityAction) semanticsNode.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
                    if (Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
                        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        for (int i3 = 0; i3 < i2; i3++) {
                            int i4 = i + i3;
                            if (i4 >= textLayoutResult.getLayoutInput().getText().length()) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i4)));
                            }
                        }
                        Bundle extras = info.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        }
                        extras.putParcelableArray(extraDataKey, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig2.contains(semanticsProperties.getTestTag()) || arguments == null || !Intrinsics.areEqual(extraDataKey, "androidx.compose.ui.semantics.testTag") || (str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag())) == null) {
            return;
        }
        info.getExtras().putCharSequence(extraDataKey, str);
    }

    private final RectF toScreenCoords(SemanticsNode textNode, androidx.compose.ui.geometry.Rect bounds) {
        if (textNode == null) {
            return null;
        }
        androidx.compose.ui.geometry.Rect m1320translatek4lQ0M = bounds.m1320translatek4lQ0M(textNode.m2171getPositionInRootF1C5BW0());
        androidx.compose.ui.geometry.Rect boundsInRoot = textNode.getBoundsInRoot();
        androidx.compose.ui.geometry.Rect intersect = m1320translatek4lQ0M.overlaps(boundsInRoot) ? m1320translatek4lQ0M.intersect(boundsInRoot) : null;
        if (intersect == null) {
            return null;
        }
        long mo1907localToScreenMKHz9U = this.view.mo1907localToScreenMKHz9U(OffsetKt.Offset(intersect.getLeft(), intersect.getTop()));
        long mo1907localToScreenMKHz9U2 = this.view.mo1907localToScreenMKHz9U(OffsetKt.Offset(intersect.getRight(), intersect.getBottom()));
        return new RectF(Offset.m1297getXimpl(mo1907localToScreenMKHz9U), Offset.m1298getYimpl(mo1907localToScreenMKHz9U), Offset.m1297getXimpl(mo1907localToScreenMKHz9U2), Offset.m1298getYimpl(mo1907localToScreenMKHz9U2));
    }

    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isAccessibilityEnabled()) {
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
        LayoutNode layoutNode;
        SemanticsEntity semanticsEntity = null;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        this.view.getRoot().m2017hitTestSemanticsM_7yMNQ$ui_release(OffsetKt.Offset(x, y), hitTestResult, (r13 & 4) != 0, (r13 & 8) != 0);
        SemanticsEntity semanticsEntity2 = (SemanticsEntity) CollectionsKt.lastOrNull(hitTestResult);
        if (semanticsEntity2 != null && (layoutNode = semanticsEntity2.getLayoutNode()) != null) {
            semanticsEntity = SemanticsNodeKt.getOuterSemantics(layoutNode);
        }
        if (semanticsEntity != null) {
            SemanticsNode semanticsNode = new SemanticsNode(semanticsEntity, false);
            LayoutNodeWrapper findWrapperToGetBounds$ui_release = semanticsNode.findWrapperToGetBounds$ui_release();
            if (!semanticsNode.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getInvisibleToUser()) && !findWrapperToGetBounds$ui_release.isTransparent() && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(semanticsEntity.getLayoutNode()) == null) {
                return semanticsNodeIdToAccessibilityVirtualNodeId(((SemanticsModifier) semanticsEntity.getModifier()).getId());
            }
        }
        return Integer.MIN_VALUE;
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
        Intrinsics.checkNotNullParameter(host, "host");
        return this.nodeProvider;
    }

    private final CharSequence trimToSize(CharSequence text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        return text.subSequence(0, size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: semanticsChangeChecker$lambda-26, reason: not valid java name */
    public static final void m2091semanticsChangeChecker$lambda26(AndroidComposeViewAccessibilityDelegateCompat this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Owner.measureAndLayout$default(this$0.view, false, 1, null);
        this$0.checkForSemanticsChanges();
        this$0.checkingForSemanticsChanges = false;
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isAccessibilityEnabled() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:12:0x0034, B:14:0x0063, B:19:0x0075, B:21:0x007d, B:23:0x0086, B:25:0x008f, B:27:0x00a0, B:29:0x00a7, B:30:0x00b0, B:39:0x0050), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c3 -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object boundsUpdatesEventLoop(Continuation continuation) {
        AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1;
        int i;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        ArraySet arraySet;
        ChannelIterator it;
        ArraySet arraySet2;
        Object hasNext;
        try {
            if (continuation instanceof AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) {
                androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = (AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) continuation;
                int i2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            arraySet = new ArraySet();
                            it = this.boundsUpdateChannel.iterator();
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            androidComposeViewAccessibilityDelegateCompat = this;
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            throw th;
                        }
                    } else if (i == 1) {
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (ChannelIterator) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2;
                        arraySet2 = (ArraySet) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1;
                        androidComposeViewAccessibilityDelegateCompat = (AndroidComposeViewAccessibilityDelegateCompat) androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        arraySet = arraySet2;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                        hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        arraySet2 = arraySet;
                        obj = hasNext;
                        if (!((Boolean) obj).booleanValue()) {
                            it.next();
                            if (androidComposeViewAccessibilityDelegateCompat.isAccessibilityEnabled()) {
                                int size = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Object valueAt = androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.valueAt(i3);
                                    Intrinsics.checkNotNull(valueAt);
                                    androidComposeViewAccessibilityDelegateCompat.sendSubtreeChangeAccessibilityEvents((LayoutNode) valueAt, arraySet2);
                                }
                                arraySet2.clear();
                                if (!androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges) {
                                    androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = true;
                                    androidComposeViewAccessibilityDelegateCompat.handler.post(androidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker);
                                }
                            }
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 2;
                            if (DelayKt.delay(100L, androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            arraySet = arraySet2;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$0 = androidComposeViewAccessibilityDelegateCompat;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$1 = arraySet;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.L$2 = it;
                            androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label = 1;
                            hasNext = it.hasNext(androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            androidComposeViewAccessibilityDelegateCompat.subtreeChangedLayoutNodes.clear();
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 = new AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1(this, continuation);
        Object obj2 = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1.label;
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        Intrinsics.checkNotNullParameter(layoutNode, "layoutNode");
        this.currentSemanticsNodesInvalidated = true;
        if (isAccessibilityEnabled()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    private final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo8216trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r8 = androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(r8, androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1.INSTANCE);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, ArraySet subtreeChangedSemanticsNodesIds) {
        LayoutNode findClosestParentNode;
        SemanticsEntity outerSemantics;
        LayoutNode findClosestParentNode2;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            SemanticsEntity outerSemantics2 = SemanticsNodeKt.getOuterSemantics(layoutNode);
            if (outerSemantics2 == null) {
                findClosestParentNode2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsWrapper$1
                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull LayoutNode it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(SemanticsNodeKt.getOuterSemantics(it) != null);
                    }
                });
                outerSemantics2 = findClosestParentNode2 != null ? SemanticsNodeKt.getOuterSemantics(findClosestParentNode2) : null;
                if (outerSemantics2 == null) {
                    return;
                }
            }
            if (!outerSemantics2.collapsedSemanticsConfiguration().getIsMergingSemanticsOfDescendants() && findClosestParentNode != null && (outerSemantics = SemanticsNodeKt.getOuterSemantics(findClosestParentNode)) != null) {
                outerSemantics2 = outerSemantics;
            }
            int id = ((SemanticsModifier) outerSemantics2.getModifier()).getId();
            if (subtreeChangedSemanticsNodesIds.add(Integer.valueOf(id))) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(id), 2048, 1, null, 8, null);
            }
        }
    }

    private final void checkForSemanticsChanges() {
        sendSemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
        sendSemanticsPropertyChangeEvents$ui_release(getCurrentSemanticsNodes());
        updateSemanticsNodesCopyAndPanes();
    }

    private final void updateSemanticsNodesCopyAndPanes() {
        boolean hasPaneTitle;
        SemanticsConfiguration unmergedConfig;
        boolean hasPaneTitle2;
        Iterator it = this.paneDisplayed.iterator();
        while (it.hasNext()) {
            Integer id = (Integer) it.next();
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().get(id);
            String str = null;
            SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
            if (semanticsNode != null) {
                hasPaneTitle2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(semanticsNode);
                if (!hasPaneTitle2) {
                }
            }
            this.paneDisplayed.remove(id);
            Intrinsics.checkNotNullExpressionValue(id, "id");
            int intValue = id.intValue();
            SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.get(id);
            if (semanticsNodeCopy != null && (unmergedConfig = semanticsNodeCopy.getUnmergedConfig()) != null) {
                str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig, SemanticsProperties.INSTANCE.getPaneTitle());
            }
            sendPaneChangeEvents(intValue, 32, str);
        }
        this.previousSemanticsNodes.clear();
        for (Map.Entry entry : getCurrentSemanticsNodes().entrySet()) {
            hasPaneTitle = AndroidComposeViewAccessibilityDelegateCompat_androidKt.hasPaneTitle(((SemanticsNodeWithAdjustedBounds) entry.getValue()).getSemanticsNode());
            if (hasPaneTitle && this.paneDisplayed.add(entry.getKey())) {
                sendPaneChangeEvents(((Number) entry.getKey()).intValue(), 16, (String) ((SemanticsNodeWithAdjustedBounds) entry.getValue()).getSemanticsNode().getUnmergedConfig().get(SemanticsProperties.INSTANCE.getPaneTitle()));
            }
            this.previousSemanticsNodes.put(entry.getKey(), new SemanticsNodeCopy(((SemanticsNodeWithAdjustedBounds) entry.getValue()).getSemanticsNode(), getCurrentSemanticsNodes()));
        }
        this.previousSemanticsRoot = new SemanticsNodeCopy(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), getCurrentSemanticsNodes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.accessibility.AccessibilityEvent, android.view.accessibility.AccessibilityRecord] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v32, types: [androidx.compose.ui.text.AnnotatedString] */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Collection, java.util.LinkedHashSet, java.util.Set] */
    public final void sendSemanticsPropertyChangeEvents$ui_release(Map newSemanticsNodes) {
        String str;
        boolean isTextField;
        String text;
        boolean accessibilityEquals;
        boolean z = true;
        Intrinsics.checkNotNullParameter(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.scrollObservationScopes);
        this.scrollObservationScopes.clear();
        Iterator it = newSemanticsNodes.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.get(Integer.valueOf(intValue));
            if (semanticsNodeCopy != null) {
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) newSemanticsNodes.get(Integer.valueOf(intValue));
                SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                Intrinsics.checkNotNull(semanticsNode);
                Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNode.getUnmergedConfig().iterator();
                boolean z2 = false;
                while (it2.hasNext()) {
                    Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object> next = it2.next();
                    SemanticsPropertyKey<?> key = next.getKey();
                    SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                    if (((Intrinsics.areEqual(key, semanticsProperties.getHorizontalScrollAxisRange()) || Intrinsics.areEqual(next.getKey(), semanticsProperties.getVerticalScrollAxisRange())) ? registerScrollingId(intValue, arrayList) : false) || !Intrinsics.areEqual(next.getValue(), SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()))) {
                        SemanticsPropertyKey<?> key2 = next.getKey();
                        if (Intrinsics.areEqual(key2, semanticsProperties.getPaneTitle())) {
                            Object value = next.getValue();
                            if (value == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str2 = (String) value;
                            if (semanticsNodeCopy.hasPaneTitle()) {
                                sendPaneChangeEvents(intValue, 8, str2);
                            }
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getStateDescription()) ? z ? 1 : 0 : Intrinsics.areEqual(key2, semanticsProperties.getToggleableState())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getProgressBarRangeInfo())) {
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                            sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getSelected())) {
                            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getRole());
                            if (role == null ? false : Role.m2160equalsimpl0(role.getValue(), Role.INSTANCE.m2169getTabo7Vup1c())) {
                                if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelected()), Boolean.TRUE)) {
                                    ?? createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 4);
                                    SemanticsNode semanticsNode2 = new SemanticsNode(semanticsNode.getOuterSemanticsEntity(), z);
                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties.getContentDescription());
                                    String fastJoinToString$default = list != null ? TempListUtilsKt.fastJoinToString$default(list, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null;
                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode2.getConfig(), semanticsProperties.getText());
                                    String fastJoinToString$default2 = list2 != null ? TempListUtilsKt.fastJoinToString$default(list2, StringUtils.COMMA, null, null, 0, null, null, 62, null) : null;
                                    if (fastJoinToString$default != null) {
                                        createEvent$ui_release.setContentDescription(fastJoinToString$default);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    if (fastJoinToString$default2 != null) {
                                        createEvent$ui_release.getText().add(fastJoinToString$default2);
                                    }
                                    sendEvent(createEvent$ui_release);
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                                }
                            } else {
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 64, null, 8, null);
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                            }
                        } else if (Intrinsics.areEqual(key2, semanticsProperties.getContentDescription())) {
                            int semanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(intValue);
                            Object value2 = next.getValue();
                            if (value2 != null) {
                                sendEventForVirtualView(semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 4, (List) value2);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            }
                        } else {
                            str = "";
                            if (Intrinsics.areEqual(key2, semanticsProperties.getEditableText())) {
                                isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(semanticsNode);
                                if (isTextField) {
                                    CharSequence textForTextField = getTextForTextField(semanticsNodeCopy.getUnmergedConfig());
                                    if (textForTextField == null) {
                                        textForTextField = "";
                                    }
                                    ?? textForTextField2 = getTextForTextField(semanticsNode.getUnmergedConfig());
                                    str = textForTextField2 != 0 ? textForTextField2 : "";
                                    int length = textForTextField.length();
                                    int length2 = str.length();
                                    int coerceAtMost = RangesKt.coerceAtMost(length, length2);
                                    int i = 0;
                                    while (i < coerceAtMost && textForTextField.charAt(i) == str.charAt(i)) {
                                        i += z ? 1 : 0;
                                    }
                                    int i2 = 0;
                                    while (i2 < coerceAtMost - i && textForTextField.charAt((length - 1) - i2) == str.charAt((length2 - 1) - i2)) {
                                        i2++;
                                    }
                                    AccessibilityEvent createEvent$ui_release2 = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 16);
                                    createEvent$ui_release2.setFromIndex(i);
                                    createEvent$ui_release2.setRemovedCount((length - i2) - i);
                                    createEvent$ui_release2.setAddedCount((length2 - i2) - i);
                                    createEvent$ui_release2.setBeforeText(textForTextField);
                                    createEvent$ui_release2.getText().add(trimToSize(str, 100000));
                                    sendEvent(createEvent$ui_release2);
                                } else {
                                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 2, null, 8, null);
                                }
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getTextSelectionRange())) {
                                AnnotatedString textForTextField3 = getTextForTextField(semanticsNode.getUnmergedConfig());
                                if (textForTextField3 != null && (text = textForTextField3.getText()) != null) {
                                    str = text;
                                }
                                long packedValue = ((TextRange) semanticsNode.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue();
                                sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(intValue), Integer.valueOf(TextRange.m2249getStartimpl(packedValue)), Integer.valueOf(TextRange.m2244getEndimpl(packedValue)), Integer.valueOf(str.length()), (String) trimToSize(str, 100000)));
                                sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getHorizontalScrollAxisRange()) ? true : Intrinsics.areEqual(key2, semanticsProperties.getVerticalScrollAxisRange())) {
                                notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode());
                                ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(this.scrollObservationScopes, intValue);
                                Intrinsics.checkNotNull(findById);
                                findById.setHorizontalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getHorizontalScrollAxisRange()));
                                findById.setVerticalScrollAxisRange((ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getVerticalScrollAxisRange()));
                                sendScrollEventIfNeeded(findById);
                            } else if (Intrinsics.areEqual(key2, semanticsProperties.getFocused())) {
                                Object value3 = next.getValue();
                                if (value3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                                }
                                if (((Boolean) value3).booleanValue()) {
                                    sendEvent(createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 8));
                                }
                                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 2048, 0, null, 8, null);
                            } else {
                                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                                if (Intrinsics.areEqual(key2, semanticsActions.getCustomActions())) {
                                    List list3 = (List) semanticsNode.getUnmergedConfig().get(semanticsActions.getCustomActions());
                                    List list4 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsActions.getCustomActions());
                                    if (list4 != null) {
                                        ?? linkedHashSet = new LinkedHashSet();
                                        int size = list3.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            linkedHashSet.add(((CustomAccessibilityAction) list3.get(i3)).getLabel());
                                        }
                                        ?? linkedHashSet2 = new LinkedHashSet();
                                        int size2 = list4.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            linkedHashSet2.add(((CustomAccessibilityAction) list4.get(i4)).getLabel());
                                        }
                                        z2 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                    } else if (!list3.isEmpty()) {
                                        z = true;
                                        z2 = true;
                                    }
                                } else if (next.getValue() instanceof AccessibilityAction) {
                                    Object value4 = next.getValue();
                                    if (value4 != null) {
                                        accessibilityEquals = AndroidComposeViewAccessibilityDelegateCompat_androidKt.accessibilityEquals((AccessibilityAction) value4, SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), next.getKey()));
                                        z = true;
                                        z2 = !accessibilityEquals;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                    }
                                } else {
                                    z = true;
                                    z2 = true;
                                }
                            }
                        }
                    }
                    z = true;
                }
                if (!z2) {
                    z2 = AndroidComposeViewAccessibilityDelegateCompat_androidKt.propertiesDeleted(semanticsNode, semanticsNodeCopy);
                }
                if (z2) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(intValue), 2048, 0, null, 8, null);
                }
            }
        }
    }

    private final boolean registerScrollingId(int id, List oldScrollObservationScopes) {
        boolean z;
        ScrollObservationScope findById = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findById(oldScrollObservationScopes, id);
        if (findById != null) {
            z = false;
        } else {
            findById = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
        }
        this.scrollObservationScopes.add(findById);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.getIsAttached()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.sendScrollEventIfNeededLambda, new Function0() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    m2094invoke();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m2094invoke() {
                    int semanticsNodeIdToAccessibilityVirtualNodeId;
                    ScrollAxisRange horizontalScrollAxisRange = ScrollObservationScope.this.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = ScrollObservationScope.this.getVerticalScrollAxisRange();
                    Float oldXValue = ScrollObservationScope.this.getOldXValue();
                    Float oldYValue = ScrollObservationScope.this.getOldYValue();
                    float floatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.getValue().mo4828invoke()).floatValue() - oldXValue.floatValue();
                    float floatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.getValue().mo4828invoke()).floatValue() - oldYValue.floatValue();
                    if (floatValue != 0.0f || floatValue2 != 0.0f) {
                        semanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(ScrollObservationScope.this.getSemanticsNodeId());
                        AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId, 2048, 1, null, 8, null);
                        AccessibilityEvent createEvent$ui_release = this.createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId, 4096);
                        if (horizontalScrollAxisRange != null) {
                            createEvent$ui_release.setScrollX((int) ((Number) horizontalScrollAxisRange.getValue().mo4828invoke()).floatValue());
                            createEvent$ui_release.setMaxScrollX((int) ((Number) horizontalScrollAxisRange.getMaxValue().mo4828invoke()).floatValue());
                        }
                        if (verticalScrollAxisRange != null) {
                            createEvent$ui_release.setScrollY((int) ((Number) verticalScrollAxisRange.getValue().mo4828invoke()).floatValue());
                            createEvent$ui_release.setMaxScrollY((int) ((Number) verticalScrollAxisRange.getMaxValue().mo4828invoke()).floatValue());
                        }
                        if (Build.VERSION.SDK_INT >= 28) {
                            AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.setScrollEventDelta(createEvent$ui_release, (int) floatValue, (int) floatValue2);
                        }
                        this.sendEvent(createEvent$ui_release);
                    }
                    if (horizontalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldXValue((Float) horizontalScrollAxisRange.getValue().mo4828invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        ScrollObservationScope.this.setOldYValue((Float) verticalScrollAxisRange.getValue().mo4828invoke());
                    }
                }
            });
        }
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        createEvent$ui_release.setContentChangeTypes(contentChangeType);
        if (title != null) {
            createEvent$ui_release.getText().add(title);
        }
        sendEvent(createEvent$ui_release);
    }

    private final void sendSemanticsStructureChangeEvents(SemanticsNode newNode, SemanticsNodeCopy oldNode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List replacedChildren$ui_release = newNode.getReplacedChildren$ui_release();
        int size = replacedChildren$ui_release.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = (SemanticsNode) replacedChildren$ui_release.get(i);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode.getId()))) {
                if (!oldNode.getChildren().contains(Integer.valueOf(semanticsNode.getId()))) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(semanticsNode.getId()));
            }
        }
        Iterator it = oldNode.getChildren().iterator();
        while (it.hasNext()) {
            if (!linkedHashSet.contains(Integer.valueOf(((Number) it.next()).intValue()))) {
                notifySubtreeAccessibilityStateChangedIfNeeded(newNode.getLayoutNode());
                return;
            }
        }
        List replacedChildren$ui_release2 = newNode.getReplacedChildren$ui_release();
        int size2 = replacedChildren$ui_release2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SemanticsNode semanticsNode2 = (SemanticsNode) replacedChildren$ui_release2.get(i2);
            if (getCurrentSemanticsNodes().containsKey(Integer.valueOf(semanticsNode2.getId()))) {
                Object obj = this.previousSemanticsNodes.get(Integer.valueOf(semanticsNode2.getId()));
                Intrinsics.checkNotNull(obj);
                sendSemanticsStructureChangeEvents(semanticsNode2, (SemanticsNodeCopy) obj);
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
        int i;
        int i2;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        boolean z = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(node, granularity);
            if (iteratorForGranularity == null) {
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
            z = true;
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
        }
        return z;
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent createEvent$ui_release = createEvent$ui_release(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                createEvent$ui_release.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                createEvent$ui_release.setToIndex(pendingTextTraversedEvent.getToIndex());
                createEvent$ui_release.setAction(pendingTextTraversedEvent.getAction());
                createEvent$ui_release.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                createEvent$ui_release.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(createEvent$ui_release);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        boolean enabled;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig.contains(semanticsActions.getSetSelection())) {
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node);
            if (enabled) {
                Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
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
        boolean z = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m2249getStartimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) {
            return TextRange.m2244getEndimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
        }
        return this.accessibilityCursorPosition;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText());
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        String iterableTextForAccessibility;
        if (node == null || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator.Companion companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE;
            Locale locale = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale, "view.context.resources.configuration.locale");
            AccessibilityIterators.CharacterTextSegmentIterator companion2 = companion.getInstance(locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator.Companion companion3 = AccessibilityIterators.WordTextSegmentIterator.INSTANCE;
            Locale locale2 = this.view.getContext().getResources().getConfiguration().locale;
            Intrinsics.checkNotNullExpressionValue(locale2, "view.context.resources.configuration.locale");
            AccessibilityIterators.WordTextSegmentIterator companion4 = companion3.getInstance(locale2);
            companion4.initialize(iterableTextForAccessibility);
            return companion4;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion5 = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                companion5.initialize(iterableTextForAccessibility);
                return companion5;
            }
            if (granularity != 16) {
                return null;
            }
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (!unmergedConfig.contains(semanticsActions.getGetTextLayoutResult())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Function1 function1 = (Function1) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getGetTextLayoutResult())).getAction();
        if (!Intrinsics.areEqual(function1 != null ? (Boolean) function1.invoke(arrayList) : null, Boolean.TRUE)) {
            return null;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) arrayList.get(0);
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion6 = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
            companion6.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion6;
        }
        AccessibilityIterators.PageTextSegmentIterator companion7 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
        companion7.initialize(iterableTextForAccessibility, textLayoutResult, node);
        return companion7;
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        boolean isTextField;
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (!unmergedConfig.contains(semanticsProperties.getContentDescription())) {
            isTextField = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isTextField(node);
            if (isTextField) {
                AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
                if (textForTextField != null) {
                    return textForTextField.getText();
                }
                return null;
            }
            List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
            if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
                return null;
            }
            return annotatedString.getText();
        }
        return TempListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(semanticsProperties.getContentDescription()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$MyNodeProvider;", "Landroid/view/accessibility/AccessibilityNodeProvider;", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "addExtraDataToAccessibilityNodeInfo", "", "virtualViewId", "", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "extraDataKey", "", "arguments", "Landroid/os/Bundle;", "createAccessibilityNodeInfo", "performAction", "", "action", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class MyNodeProvider extends AccessibilityNodeProvider {
        public MyNodeProvider() {
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.createNodeInfo(virtualViewId);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(extraDataKey, "extraDataKey");
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }
    }

    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "()V", "addSetProgressAction", "", "info", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "semanticsNode", "Landroidx/compose/ui/semantics/SemanticsNode;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @DoNotInline
        public static final void addSetProgressAction(@NotNull AccessibilityNodeInfoCompat info, @NotNull SemanticsNode semanticsNode) {
            boolean enabled;
            AccessibilityAction accessibilityAction;
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
            enabled = AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode);
            if (!enabled || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
    @RequiresApi
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api28Impl;", "", "()V", "setScrollEventDelta", "", "event", "Landroid/view/accessibility/AccessibilityEvent;", "deltaX", "", "deltaY", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @DoNotInline
        public static final void setScrollEventDelta(@NotNull AccessibilityEvent event, int deltaX, int deltaY) {
            Intrinsics.checkNotNullParameter(event, "event");
            event.setScrollDeltaX(deltaX);
            event.setScrollDeltaY(deltaY);
        }
    }
}
