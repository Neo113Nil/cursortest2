package androidx.compose.foundation.pager;

import androidx.collection.SieveCacheKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.ScrollIndicatorState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.NestedPrefetchScope;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: PagerState.kt */
@Metadata(d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002wz\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\u0010\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0002J\b\u0010|\u001a\u00020\u0003H\u0002J%\u0010§\u0001\u001a\u00030¨\u00012\u0007\u0010©\u0001\u001a\u00020\u00032\t\b\u0003\u0010ª\u0001\u001a\u00020\u0005H\u0086@¢\u0006\u0003\u0010«\u0001J!\u0010¬\u0001\u001a\u00030¨\u0001*\u00030\u00ad\u00012\u0007\u0010©\u0001\u001a\u00020\u00032\t\b\u0003\u0010ª\u0001\u001a\u00020\u0005J\u0015\u0010®\u0001\u001a\u00030¨\u0001*\u00030\u00ad\u00012\u0006\u0010n\u001a\u00020\u0003J+\u0010¯\u0001\u001a\u00030¨\u00012\u0007\u0010©\u0001\u001a\u00020\u00032\u0007\u0010°\u0001\u001a\u00020\u00052\u0007\u0010±\u0001\u001a\u00020\fH\u0000¢\u0006\u0003\b²\u0001J\u001e\u0010µ\u0001\u001a\u00030¨\u00012\t\b\u0001\u0010©\u0001\u001a\u00020\u00032\t\b\u0003\u0010ª\u0001\u001a\u00020\u0005J7\u0010¶\u0001\u001a\u00030¨\u00012\u0007\u0010©\u0001\u001a\u00020\u00032\t\b\u0003\u0010ª\u0001\u001a\u00020\u00052\u0010\b\u0002\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00020\u00050¸\u0001H\u0086@¢\u0006\u0003\u0010¹\u0001J\u0011\u0010º\u0001\u001a\u00030¨\u0001H\u0082@¢\u0006\u0003\u0010»\u0001JK\u0010¼\u0001\u001a\u00030¨\u00012\b\u0010½\u0001\u001a\u00030¾\u00012.\u0010¿\u0001\u001a)\b\u0001\u0012\u0005\u0012\u00030\u00ad\u0001\u0012\f\u0012\n\u0012\u0005\u0012\u00030¨\u00010Á\u0001\u0012\u0007\u0012\u0005\u0018\u00010Â\u00010À\u0001¢\u0006\u0003\bÃ\u0001H\u0096@¢\u0006\u0003\u0010Ä\u0001J\u0011\u0010Å\u0001\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0016J-\u0010Ù\u0001\u001a\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u00102\u0007\u0010Û\u0001\u001a\u00020\f2\t\b\u0002\u0010Ü\u0001\u001a\u00020\fH\u0000¢\u0006\u0003\bÝ\u0001J\u0013\u0010Þ\u0001\u001a\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u0010H\u0002J\r\u0010ß\u0001\u001a\u00020\u0003*\u00020\u0003H\u0002J\u0012\u0010à\u0001\u001a\u00020\f2\u0007\u0010á\u0001\u001a\u00020\u0005H\u0002J\u000f\u0010â\u0001\u001a\u00020\fH\u0000¢\u0006\u0003\bã\u0001J\u001b\u0010ä\u0001\u001a\u00030¨\u00012\u0006\u00101\u001a\u00020\u00052\u0007\u0010å\u0001\u001a\u00020BH\u0002J\u0013\u0010æ\u0001\u001a\u00030¨\u00012\u0007\u0010å\u0001\u001a\u00020BH\u0002J\u001b\u0010ç\u0001\u001a\u00020\u00032\u0007\u0010è\u0001\u001a\u00020\f2\u0007\u0010å\u0001\u001a\u00020BH\u0002J\u0010\u0010é\u0001\u001a\u00020\u00052\u0007\u0010©\u0001\u001a\u00020\u0003J#\u0010ê\u0001\u001a\u00020\u00032\b\u0010ë\u0001\u001a\u00030ì\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0000¢\u0006\u0003\bí\u0001R\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u001e\u0010$\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u001a\u0010&\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u000e\u0010-\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0016R\u001e\u00104\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0016R\u000e\u00106\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u000f\"\u0004\b9\u0010:R\u000e\u0010;\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00100@X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010A\u001a\u00020B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0016R\u0014\u0010G\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0016R\u001a\u0010I\u001a\u00020JX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0016R\u001a\u0010Q\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0016\"\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020YX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010\\\u001a\u00020]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b`\u0010\u0016R+\u0010a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bb\u0010\u0016\"\u0004\bc\u0010TR+\u0010f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010e\u001a\u0004\bg\u0010\u0016\"\u0004\bh\u0010TR\u001b\u0010j\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bk\u0010\u0016R\u001b\u0010n\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bo\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\bq\u0010WR\u0014\u0010r\u001a\u00020sX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u0010\u0010v\u001a\u00020wX\u0082\u0004¢\u0006\u0004\n\u0002\u0010xR\u0010\u0010y\u001a\u00020zX\u0082\u0004¢\u0006\u0004\n\u0002\u0010{R\u0015\u0010}\u001a\u00020~X\u0080\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u00030\u0082\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0086\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R7\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0089\u00012\t\u0010\u0017\u001a\u0005\u0018\u00010\u0089\u00018@@BX\u0080\u008e\u0002¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010\u001f\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u0091\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R!\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0080\u000e¢\u0006\u0013\n\u0003\u0010\u0098\u0001\u001a\u0005\b\u0096\u0001\u0010\u001b\"\u0005\b\u0097\u0001\u0010\u001dR\u0018\u0010\u0099\u0001\u001a\u00030\u009a\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R!\u0010\u009d\u0001\u001a\u00030\u009e\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\b¡\u0001\u0010¢\u0001*\u0006\b\u009f\u0001\u0010 \u0001R\u001a\u0010£\u0001\u001a\u00030¤\u0001X\u0080\u0004¢\u0006\f\n\u0002\u0010\u001f\u001a\u0006\b¥\u0001\u0010¦\u0001R\u001a\u0010³\u0001\u001a\u00030¤\u0001X\u0080\u0004¢\u0006\f\n\u0002\u0010\u001f\u001a\u0006\b´\u0001\u0010¦\u0001R\u0016\u0010Æ\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u000fR/\u0010Ç\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÊ\u0001\u0010\u001f\u001a\u0005\bÈ\u0001\u0010\u000f\"\u0005\bÉ\u0001\u0010:R/\u0010Ë\u0001\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8F@BX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÎ\u0001\u0010\u001f\u001a\u0005\bÌ\u0001\u0010\u000f\"\u0005\bÍ\u0001\u0010:R\u0015\u0010Ï\u0001\u001a\b\u0012\u0004\u0012\u00020\f0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010Ð\u0001\u001a\b\u0012\u0004\u0012\u00020\f0@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010Ñ\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010\u000fR\u0016\u0010Ó\u0001\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010\u000fR\u001a\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001¨\u0006î\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "currentPage", "", "currentPageOffsetFraction", "", "prefetchScheduler", "Landroidx/compose/foundation/lazy/layout/PrefetchScheduler;", "<init>", "(IFLandroidx/compose/foundation/lazy/layout/PrefetchScheduler;)V", "(IF)V", "value", "", "hasLookaheadOccurred", "getHasLookaheadOccurred$foundation", "()Z", "Landroidx/compose/foundation/pager/PagerMeasureResult;", "approachLayoutInfo", "getApproachLayoutInfo$foundation", "()Landroidx/compose/foundation/pager/PagerMeasureResult;", "pageCount", "getPageCount", "()I", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "upDownDifference", "getUpDownDifference-F1C5BW0$foundation", "()J", "setUpDownDifference-k-4lQ0M$foundation", "(J)V", "upDownDifference$delegate", "Landroidx/compose/runtime/MutableState;", "scrollPosition", "Landroidx/compose/foundation/pager/PagerScrollPosition;", "firstVisiblePage", "getFirstVisiblePage$foundation", "firstVisiblePageOffset", "getFirstVisiblePageOffset$foundation", "maxScrollOffset", "", "getMaxScrollOffset$foundation", "setMaxScrollOffset$foundation", "minScrollOffset", "getMinScrollOffset$foundation", "setMinScrollOffset$foundation", "accumulator", "previousPassDelta", "scrollableState", "performScroll", "delta", "numMeasurePasses", "getNumMeasurePasses$foundation", "layoutWithMeasurement", "getLayoutWithMeasurement$foundation", "layoutWithoutMeasurement", "prefetchingEnabled", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "indexToPrefetch", "currentPrefetchHandle", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState$PrefetchHandle;", "wasPrefetchingForward", "pagerLayoutInfoState", "Landroidx/compose/runtime/MutableState;", "layoutInfo", "Landroidx/compose/foundation/pager/PagerLayoutInfo;", "getLayoutInfo", "()Landroidx/compose/foundation/pager/PagerLayoutInfo;", "pageSpacing", "getPageSpacing$foundation", "pageSize", "getPageSize$foundation", "density", "Landroidx/compose/ui/unit/Density;", "getDensity$foundation", "()Landroidx/compose/ui/unit/Density;", "setDensity$foundation", "(Landroidx/compose/ui/unit/Density;)V", "pageSizeWithSpacing", "getPageSizeWithSpacing$foundation", "latestPageSizeWithSpacing", "getLatestPageSizeWithSpacing$foundation", "setLatestPageSizeWithSpacing$foundation", "(I)V", "positionThresholdFraction", "getPositionThresholdFraction$foundation", "()F", "internalInteractionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "getCurrentPage", "programmaticScrollTargetPage", "getProgrammaticScrollTargetPage", "setProgrammaticScrollTargetPage", "programmaticScrollTargetPage$delegate", "Landroidx/compose/runtime/MutableIntState;", "settledPageState", "getSettledPageState", "setSettledPageState", "settledPageState$delegate", "settledPage", "getSettledPage", "settledPage$delegate", "Landroidx/compose/runtime/State;", "targetPage", "getTargetPage", "targetPage$delegate", "getCurrentPageOffsetFraction", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "getPrefetchState$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "pagerCacheWindow", "androidx/compose/foundation/pager/PagerState$pagerCacheWindow$1", "Landroidx/compose/foundation/pager/PagerState$pagerCacheWindow$1;", "_scrollIndicatorState", "androidx/compose/foundation/pager/PagerState$_scrollIndicatorState$1", "Landroidx/compose/foundation/pager/PagerState$_scrollIndicatorState$1;", "calculateScrollOffset", "cacheWindowLogic", "Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "getCacheWindowLogic$foundation", "()Landroidx/compose/foundation/pager/PagerCacheWindowLogic;", "beyondBoundsInfo", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "getBeyondBoundsInfo$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "awaitLayoutModifier", "Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "getAwaitLayoutModifier$foundation", "()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "getRemeasurement$foundation", "()Landroidx/compose/ui/layout/Remeasurement;", "setRemeasurement", "(Landroidx/compose/ui/layout/Remeasurement;)V", "remeasurement$delegate", "remeasurementModifier", "Landroidx/compose/ui/layout/RemeasurementModifier;", "getRemeasurementModifier$foundation", "()Landroidx/compose/ui/layout/RemeasurementModifier;", "premeasureConstraints", "Landroidx/compose/ui/unit/Constraints;", "getPremeasureConstraints-msEJaDk$foundation", "setPremeasureConstraints-BRTryo0$foundation", "J", "pinnedPages", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "getPinnedPages$foundation", "()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;", "nearestRange", "Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "getNearestRange$foundation", "()Lkotlin/ranges/IntRange;", "placementScopeInvalidator", "Landroidx/compose/foundation/lazy/layout/ObservableScopeInvalidator;", "getPlacementScopeInvalidator-zYiylxw$foundation", "()Landroidx/compose/runtime/MutableState;", "scrollToPage", "", "page", "pageOffsetFraction", "(IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateCurrentPage", "Landroidx/compose/foundation/gestures/ScrollScope;", "updateTargetPage", "snapToItem", "offsetFraction", "forceRemeasure", "snapToItem$foundation", "measurementScopeInvalidator", "getMeasurementScopeInvalidator-zYiylxw$foundation", "requestScrollToPage", "animateScrollToPage", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "(IFLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitScrollDependencies", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scroll", "scrollPriority", "Landroidx/compose/foundation/MutatePriority;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchRawDelta", "isScrollInProgress", "canScrollForward", "getCanScrollForward", "setCanScrollForward", "canScrollForward$delegate", "canScrollBackward", "getCanScrollBackward", "setCanScrollBackward", "canScrollBackward$delegate", "isLastScrollForwardState", "isLastScrollBackwardState", "lastScrolledForward", "getLastScrolledForward", "lastScrolledBackward", "getLastScrolledBackward", "scrollIndicatorState", "Landroidx/compose/foundation/ScrollIndicatorState;", "getScrollIndicatorState", "()Landroidx/compose/foundation/ScrollIndicatorState;", "applyMeasureResult", "result", "isLookingAhead", "visibleItemsStayedTheSame", "applyMeasureResult$foundation", "tryRunPrefetch", "coerceInPageRange", "isGestureActionMatchesScroll", "scrollDelta", "isNotGestureAction", "isNotGestureAction$foundation", "notifyPrefetch", "info", "cancelPrefetchIfVisibleItemsChanged", "calculatePrefetchIndex", "forward", "getOffsetDistanceInPages", "matchScrollPositionWithKey", "itemProvider", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "matchScrollPositionWithKey$foundation", "foundation"}, k = 1, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public abstract class PagerState implements ScrollableState {
    public static final int $stable = 0;
    private final PagerState$_scrollIndicatorState$1 _scrollIndicatorState;
    private float accumulator;
    private PagerMeasureResult approachLayoutInfo;
    private final AwaitFirstLayoutModifier awaitLayoutModifier;
    private final LazyLayoutBeyondBoundsInfo beyondBoundsInfo;
    private final PagerCacheWindowLogic cacheWindowLogic;

    /* renamed from: canScrollBackward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollBackward;

    /* renamed from: canScrollForward$delegate, reason: from kotlin metadata */
    private final MutableState canScrollForward;
    private LazyLayoutPrefetchState.PrefetchHandle currentPrefetchHandle;
    private Density density;
    private int firstVisiblePage;
    private int firstVisiblePageOffset;
    private boolean hasLookaheadOccurred;
    private int indexToPrefetch;
    private final MutableInteractionSource internalInteractionSource;
    private final MutableState<Boolean> isLastScrollBackwardState;
    private final MutableState<Boolean> isLastScrollForwardState;
    private int latestPageSizeWithSpacing;
    private int layoutWithMeasurement;
    private int layoutWithoutMeasurement;
    private long maxScrollOffset;
    private final MutableState<Unit> measurementScopeInvalidator;
    private long minScrollOffset;
    private final PagerState$pagerCacheWindow$1 pagerCacheWindow;
    private MutableState<PagerMeasureResult> pagerLayoutInfoState;
    private final LazyLayoutPinnedItemList pinnedPages;
    private final MutableState<Unit> placementScopeInvalidator;
    private final LazyLayoutPrefetchState prefetchState;
    private boolean prefetchingEnabled;
    private long premeasureConstraints;
    private float previousPassDelta;

    /* renamed from: programmaticScrollTargetPage$delegate, reason: from kotlin metadata */
    private final MutableIntState programmaticScrollTargetPage;

    /* renamed from: remeasurement$delegate, reason: from kotlin metadata */
    private final MutableState remeasurement;
    private final RemeasurementModifier remeasurementModifier;
    private final PagerScrollPosition scrollPosition;
    private final ScrollableState scrollableState;

    /* renamed from: settledPage$delegate, reason: from kotlin metadata */
    private final State settledPage;

    /* renamed from: settledPageState$delegate, reason: from kotlin metadata */
    private final MutableIntState settledPageState;

    /* renamed from: targetPage$delegate, reason: from kotlin metadata */
    private final State targetPage;

    /* renamed from: upDownDifference$delegate, reason: from kotlin metadata */
    private final MutableState upDownDifference;
    private boolean wasPrefetchingForward;

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    public abstract int getPageCount();

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public Object scroll(MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        return scroll$suspendImpl(this, mutatePriority, function2, continuation);
    }

    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1] */
    public PagerState(int i, float f, PrefetchScheduler prefetchScheduler) {
        PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1;
        double d = f;
        boolean z = false;
        if (-0.5d <= d && d <= 0.5d) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m4483boximpl(Offset.INSTANCE.m4510getZeroF1C5BW0()), null, 2, null);
        PagerScrollPosition pagerScrollPosition = new PagerScrollPosition(i, f, this);
        this.scrollPosition = pagerScrollPosition;
        this.firstVisiblePage = i;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = ScrollableStateKt.ScrollableState(new Function1() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float performScroll;
                performScroll = PagerState.this.performScroll(((Float) obj).floatValue());
                return Float.valueOf(performScroll);
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = SnapshotStateKt.mutableStateOf(PagerStateKt.getEmptyLayoutInfo(), SnapshotStateKt.neverEqualPolicy());
        pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
        this.density = pagerStateKt$UnitDensity$1;
        this.internalInteractionSource = InteractionSourceKt.MutableInteractionSource();
        this.programmaticScrollTargetPage = SnapshotIntStateKt.mutableIntStateOf(-1);
        this.settledPageState = SnapshotIntStateKt.mutableIntStateOf(i);
        this.settledPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PagerState.settledPage_delegate$lambda$0(PagerState.this));
            }
        });
        this.targetPage = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PagerState.targetPage_delegate$lambda$0(PagerState.this));
            }
        });
        LazyLayoutPrefetchState lazyLayoutPrefetchState = new LazyLayoutPrefetchState(prefetchScheduler, new Function1() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PagerState.prefetchState$lambda$0(PagerState.this, (NestedPrefetchScope) obj);
            }
        });
        this.prefetchState = lazyLayoutPrefetchState;
        ?? r14 = new LazyLayoutCacheWindow() { // from class: androidx.compose.foundation.pager.PagerState$pagerCacheWindow$1
            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateBehindWindow(Density density, int i2) {
                return 0;
            }

            @Override // androidx.compose.foundation.lazy.layout.LazyLayoutCacheWindow
            public int calculateAheadWindow(Density density, int i2) {
                return PagerState.this.getLatestPageSizeWithSpacing();
            }
        };
        this.pagerCacheWindow = r14;
        this._scrollIndicatorState = new ScrollIndicatorState() { // from class: androidx.compose.foundation.pager.PagerState$_scrollIndicatorState$1
            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getScrollOffset() {
                int calculateScrollOffset;
                calculateScrollOffset = PagerState.this.calculateScrollOffset();
                return calculateScrollOffset;
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getContentSize() {
                return PagerLayoutInfoKt.calculateContentSize(PagerState.this.getLayoutInfo(), PagerState.this.getPageCount());
            }

            @Override // androidx.compose.foundation.ScrollIndicatorState
            public int getViewportSize() {
                return PagerLayoutInfoKt.getMainAxisViewportSize(PagerState.this.getLayoutInfo());
            }
        };
        this.cacheWindowLogic = new PagerCacheWindowLogic((LazyLayoutCacheWindow) r14, lazyLayoutPrefetchState, new Function0() { // from class: androidx.compose.foundation.pager.PagerState$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int pageCount;
                pageCount = PagerState.this.getPageCount();
                return Integer.valueOf(pageCount);
            }
        });
        this.beyondBoundsInfo = new LazyLayoutBeyondBoundsInfo();
        this.awaitLayoutModifier = new AwaitFirstLayoutModifier();
        this.remeasurement = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.remeasurementModifier = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public void onRemeasurementAvailable(Remeasurement remeasurement) {
                PagerState.this.setRemeasurement(remeasurement);
            }
        };
        this.premeasureConstraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        this.pinnedPages = new LazyLayoutPinnedItemList();
        pagerScrollPosition.getNearestRangeState();
        this.placementScopeInvalidator = ObservableScopeInvalidator.m1010constructorimpl$default(null, 1, null);
        this.measurementScopeInvalidator = ObservableScopeInvalidator.m1010constructorimpl$default(null, 1, null);
        this.canScrollForward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.canScrollBackward = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollForwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isLastScrollBackwardState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    public /* synthetic */ PagerState(int i, float f, PrefetchScheduler prefetchScheduler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : prefetchScheduler);
    }

    public /* synthetic */ PagerState(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public PagerState(int i, float f) {
        this(i, f, null);
    }

    /* renamed from: getHasLookaheadOccurred$foundation, reason: from getter */
    public final boolean getHasLookaheadOccurred() {
        return this.hasLookaheadOccurred;
    }

    /* renamed from: getApproachLayoutInfo$foundation, reason: from getter */
    public final PagerMeasureResult getApproachLayoutInfo() {
        return this.approachLayoutInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getUpDownDifference-F1C5BW0$foundation, reason: not valid java name */
    public final long m1086getUpDownDifferenceF1C5BW0$foundation() {
        return ((Offset) this.upDownDifference.getValue()).m4504unboximpl();
    }

    /* renamed from: setUpDownDifference-k-4lQ0M$foundation, reason: not valid java name */
    public final void m1088setUpDownDifferencek4lQ0M$foundation(long j) {
        this.upDownDifference.setValue(Offset.m4483boximpl(j));
    }

    /* renamed from: getFirstVisiblePage$foundation, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* renamed from: getFirstVisiblePageOffset$foundation, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* renamed from: getMaxScrollOffset$foundation, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    public final void setMaxScrollOffset$foundation(long j) {
        this.maxScrollOffset = j;
    }

    /* renamed from: getMinScrollOffset$foundation, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final void setMinScrollOffset$foundation(long j) {
        this.minScrollOffset = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float performScroll(float delta) {
        PagerMeasureResult pagerMeasureResult;
        long currentAbsoluteScrollOffset = PagerScrollPositionKt.currentAbsoluteScrollOffset(this);
        float f = this.accumulator + delta;
        long roundToLong = MathKt.roundToLong(f);
        this.accumulator = f - roundToLong;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j = currentAbsoluteScrollOffset + roundToLong;
        long coerceIn = RangesKt.coerceIn(j, this.minScrollOffset, this.maxScrollOffset);
        boolean z = j != coerceIn;
        long j2 = coerceIn - currentAbsoluteScrollOffset;
        float f2 = j2;
        this.previousPassDelta = f2;
        if (Math.abs(j2) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f2 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f2 < 0.0f));
        }
        int i = (int) j2;
        int i2 = -i;
        PagerMeasureResult copyWithScrollDeltaWithoutRemeasure = this.pagerLayoutInfoState.getValue().copyWithScrollDeltaWithoutRemeasure(i2);
        if (copyWithScrollDeltaWithoutRemeasure != null && (pagerMeasureResult = this.approachLayoutInfo) != null) {
            PagerMeasureResult copyWithScrollDeltaWithoutRemeasure2 = pagerMeasureResult != null ? pagerMeasureResult.copyWithScrollDeltaWithoutRemeasure(i2) : null;
            if (copyWithScrollDeltaWithoutRemeasure2 != null) {
                this.approachLayoutInfo = copyWithScrollDeltaWithoutRemeasure2;
            } else {
                copyWithScrollDeltaWithoutRemeasure = null;
            }
        }
        if (copyWithScrollDeltaWithoutRemeasure != null) {
            applyMeasureResult$foundation(copyWithScrollDeltaWithoutRemeasure, this.hasLookaheadOccurred, true);
            ObservableScopeInvalidator.m1014invalidateScopeimpl(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.applyScrollDelta(i);
            Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
            }
            this.layoutWithMeasurement++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(delta)).floatValue();
    }

    public final int getNumMeasurePasses$foundation() {
        return this.layoutWithMeasurement + this.layoutWithoutMeasurement;
    }

    /* renamed from: getLayoutWithMeasurement$foundation, reason: from getter */
    public final int getLayoutWithMeasurement() {
        return this.layoutWithMeasurement;
    }

    /* renamed from: getPrefetchingEnabled$foundation, reason: from getter */
    public final boolean getPrefetchingEnabled() {
        return this.prefetchingEnabled;
    }

    public final void setPrefetchingEnabled$foundation(boolean z) {
        this.prefetchingEnabled = z;
    }

    public final PagerLayoutInfo getLayoutInfo() {
        return this.pagerLayoutInfoState.getValue();
    }

    public final int getPageSpacing$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    public final int getPageSize$foundation() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    /* renamed from: getDensity$foundation, reason: from getter */
    public final Density getDensity() {
        return this.density;
    }

    public final void setDensity$foundation(Density density) {
        this.density = density;
    }

    public final int getPageSizeWithSpacing$foundation() {
        return getPageSize$foundation() + getPageSpacing$foundation();
    }

    /* renamed from: getLatestPageSizeWithSpacing$foundation, reason: from getter */
    public final int getLatestPageSizeWithSpacing() {
        return this.latestPageSizeWithSpacing;
    }

    public final void setLatestPageSizeWithSpacing$foundation(int i) {
        this.latestPageSizeWithSpacing = i;
    }

    public final float getPositionThresholdFraction$foundation() {
        return Math.min(this.density.mo407toPx0680j_4(PagerStateKt.getDefaultPositionThreshold()), getPageSize$foundation() / 2.0f) / getPageSize$foundation();
    }

    /* renamed from: getInternalInteractionSource$foundation, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getCurrentPage() {
        return this.scrollPosition.getCurrentPage();
    }

    private final int getProgrammaticScrollTargetPage() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    private final void setProgrammaticScrollTargetPage(int i) {
        this.programmaticScrollTargetPage.setIntValue(i);
    }

    private final int getSettledPageState() {
        return this.settledPageState.getIntValue();
    }

    private final void setSettledPageState(int i) {
        this.settledPageState.setIntValue(i);
    }

    public final int getSettledPage() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    static final int settledPage_delegate$lambda$0(PagerState pagerState) {
        if (pagerState.isScrollInProgress()) {
            return pagerState.getSettledPageState();
        }
        return pagerState.getCurrentPage();
    }

    public final int getTargetPage() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    static final int targetPage_delegate$lambda$0(PagerState pagerState) {
        int currentPage;
        if (!pagerState.isScrollInProgress()) {
            currentPage = pagerState.getCurrentPage();
        } else if (pagerState.getProgrammaticScrollTargetPage() != -1) {
            currentPage = pagerState.getProgrammaticScrollTargetPage();
        } else if (Math.abs(pagerState.getCurrentPageOffsetFraction()) >= Math.abs(pagerState.getPositionThresholdFraction$foundation())) {
            if (pagerState.getLastScrolledForward()) {
                currentPage = pagerState.firstVisiblePage + 1;
            } else {
                currentPage = pagerState.firstVisiblePage;
            }
        } else {
            currentPage = pagerState.getCurrentPage();
        }
        return pagerState.coerceInPageRange(currentPage);
    }

    public final float getCurrentPageOffsetFraction() {
        return this.scrollPosition.getCurrentPageOffsetFraction();
    }

    /* renamed from: getPrefetchState$foundation, reason: from getter */
    public final LazyLayoutPrefetchState getPrefetchState() {
        return this.prefetchState;
    }

    static final Unit prefetchState$lambda$0(PagerState pagerState, NestedPrefetchScope nestedPrefetchScope) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            nestedPrefetchScope.schedulePrecomposition(pagerState.firstVisiblePage);
            Unit unit = Unit.INSTANCE;
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateScrollOffset() {
        long pageSizeWithSpacing$foundation = (getPageSizeWithSpacing$foundation() * this.firstVisiblePage) + this.firstVisiblePageOffset;
        if (pageSizeWithSpacing$foundation > SieveCacheKt.NodeLinkMask) {
            pageSizeWithSpacing$foundation = 2147483647L;
        }
        return (int) pageSizeWithSpacing$foundation;
    }

    /* renamed from: getCacheWindowLogic$foundation, reason: from getter */
    public final PagerCacheWindowLogic getCacheWindowLogic() {
        return this.cacheWindowLogic;
    }

    /* renamed from: getBeyondBoundsInfo$foundation, reason: from getter */
    public final LazyLayoutBeyondBoundsInfo getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* renamed from: getAwaitLayoutModifier$foundation, reason: from getter */
    public final AwaitFirstLayoutModifier getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRemeasurement(Remeasurement remeasurement) {
        this.remeasurement.setValue(remeasurement);
    }

    public final Remeasurement getRemeasurement$foundation() {
        return (Remeasurement) this.remeasurement.getValue();
    }

    /* renamed from: getRemeasurementModifier$foundation, reason: from getter */
    public final RemeasurementModifier getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    /* renamed from: getPremeasureConstraints-msEJaDk$foundation, reason: not valid java name and from getter */
    public final long getPremeasureConstraints() {
        return this.premeasureConstraints;
    }

    /* renamed from: setPremeasureConstraints-BRTryo0$foundation, reason: not valid java name */
    public final void m1087setPremeasureConstraintsBRTryo0$foundation(long j) {
        this.premeasureConstraints = j;
    }

    /* renamed from: getPinnedPages$foundation, reason: from getter */
    public final LazyLayoutPinnedItemList getPinnedPages() {
        return this.pinnedPages;
    }

    public final IntRange getNearestRange$foundation() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    /* renamed from: getPlacementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<Unit> m1084getPlacementScopeInvalidatorzYiylxw$foundation() {
        return this.placementScopeInvalidator;
    }

    public static /* synthetic */ Object scrollToPage$default(PagerState pagerState, int i, float f, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.scrollToPage(i, f, continuation);
    }

    public final Object scrollToPage(int i, float f, Continuation<? super Unit> continuation) {
        Object scroll$default = ScrollableState.scroll$default(this, null, new PagerState$scrollToPage$2(this, f, i, null), continuation, 1, null);
        return scroll$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll$default : Unit.INSTANCE;
    }

    public static /* synthetic */ void updateCurrentPage$default(PagerState pagerState, ScrollScope scrollScope, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCurrentPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.updateCurrentPage(scrollScope, i, f);
    }

    public final void updateCurrentPage(ScrollScope scrollScope, int i, float f) {
        snapToItem$foundation(i, f, true);
    }

    public final void updateTargetPage(ScrollScope scrollScope, int i) {
        setProgrammaticScrollTargetPage(coerceInPageRange(i));
    }

    public final void snapToItem$foundation(int page, float offsetFraction, boolean forceRemeasure) {
        if (this.scrollPosition.getCurrentPage() != page || this.scrollPosition.getCurrentPageOffsetFraction() != offsetFraction) {
            this.cacheWindowLogic.resetStrategy();
        }
        this.scrollPosition.requestPositionAndForgetLastKnownKey(page, offsetFraction);
        if (forceRemeasure) {
            Remeasurement remeasurement$foundation = getRemeasurement$foundation();
            if (remeasurement$foundation != null) {
                remeasurement$foundation.forceRemeasure();
                return;
            }
            return;
        }
        ObservableScopeInvalidator.m1014invalidateScopeimpl(this.measurementScopeInvalidator);
    }

    /* renamed from: getMeasurementScopeInvalidator-zYiylxw$foundation, reason: not valid java name */
    public final MutableState<Unit> m1083getMeasurementScopeInvalidatorzYiylxw$foundation() {
        return this.measurementScopeInvalidator;
    }

    public static /* synthetic */ void requestScrollToPage$default(PagerState pagerState, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.requestScrollToPage(i, f);
    }

    public final void requestScrollToPage(int page, float pageOffsetFraction) {
        if (isScrollInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new PagerState$requestScrollToPage$1(this, null), 3, null);
        }
        snapToItem$foundation(page, pageOffsetFraction, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bc, code lost:
    
        if (androidx.compose.foundation.gestures.ScrollableState.scroll$default(r11, null, r3, r4, 1, null) != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00be, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
    
        if (awaitScrollDependencies(r4) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object animateScrollToPage(int i, float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        double d;
        if (continuation instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuation;
            if ((pagerState$animateScrollToPage$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label -= Integer.MIN_VALUE;
                PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$12 = pagerState$animateScrollToPage$1;
                Object obj = pagerState$animateScrollToPage$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pagerState$animateScrollToPage$12.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if ((i == getCurrentPage() && getCurrentPageOffsetFraction() == f) || getPageCount() == 0) {
                        return Unit.INSTANCE;
                    }
                    pagerState$animateScrollToPage$12.L$0 = animationSpec;
                    pagerState$animateScrollToPage$12.I$0 = i;
                    pagerState$animateScrollToPage$12.F$0 = f;
                    pagerState$animateScrollToPage$12.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    f = pagerState$animateScrollToPage$12.F$0;
                    i = pagerState$animateScrollToPage$12.I$0;
                    animationSpec = (AnimationSpec) pagerState$animateScrollToPage$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AnimationSpec<Float> animationSpec2 = animationSpec;
                d = f;
                if (!(-0.5d > d && d <= 0.5d)) {
                    InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
                }
                PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i), f * getPageSizeWithSpacing$foundation(), animationSpec2, null);
                pagerState$animateScrollToPage$12.L$0 = null;
                pagerState$animateScrollToPage$12.label = 2;
            }
        }
        pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuation);
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$122 = pagerState$animateScrollToPage$1;
        Object obj2 = pagerState$animateScrollToPage$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pagerState$animateScrollToPage$122.label;
        if (i2 != 0) {
        }
        AnimationSpec<Float> animationSpec22 = animationSpec;
        d = f;
        if (!(-0.5d > d && d <= 0.5d)) {
        }
        PagerState$animateScrollToPage$3 pagerState$animateScrollToPage$32 = new PagerState$animateScrollToPage$3(this, coerceInPageRange(i), f * getPageSizeWithSpacing$foundation(), animationSpec22, null);
        pagerState$animateScrollToPage$122.L$0 = null;
        pagerState$animateScrollToPage$122.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollToPage$default(PagerState pagerState, int i, float f, AnimationSpec animationSpec, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.animateScrollToPage(i, f, animationSpec, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitScrollDependencies(Continuation<? super Unit> continuation) {
        if (this.pagerLayoutInfoState.getValue() == PagerStateKt.getEmptyLayoutInfo()) {
            Object waitForFirstLayout = this.awaitLayoutModifier.waitForFirstLayout(continuation);
            return waitForFirstLayout == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? waitForFirstLayout : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        if (r8.scroll(r6, r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r5.awaitScrollDependencies(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ Object scroll$suspendImpl(PagerState pagerState, MutatePriority mutatePriority, Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        PagerState$scroll$1 pagerState$scroll$1;
        int i;
        if (continuation instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuation;
            if ((pagerState$scroll$1.label & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label -= Integer.MIN_VALUE;
                Object obj = pagerState$scroll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pagerState$scroll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    pagerState$scroll$1.L$0 = pagerState;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = function2;
                    pagerState$scroll$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pagerState = (PagerState) pagerState$scroll$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pagerState.setProgrammaticScrollTargetPage(-1);
                        return Unit.INSTANCE;
                    }
                    function2 = (Function2) pagerState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) pagerState$scroll$1.L$1;
                    pagerState = (PagerState) pagerState$scroll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (!pagerState.isScrollInProgress()) {
                    pagerState.setSettledPageState(pagerState.getCurrentPage());
                }
                ScrollableState scrollableState = pagerState.scrollableState;
                pagerState$scroll$1.L$0 = pagerState;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
            }
        }
        pagerState$scroll$1 = new PagerState$scroll$1(pagerState, continuation);
        Object obj2 = pagerState$scroll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pagerState$scroll$1.label;
        if (i != 0) {
        }
        if (!pagerState.isScrollInProgress()) {
        }
        ScrollableState scrollableState2 = pagerState.scrollableState;
        pagerState$scroll$1.L$0 = pagerState;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.scrollableState.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.scrollableState.isScrollInProgress();
    }

    private final void setCanScrollForward(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    private final void setCanScrollBackward(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledForward() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getLastScrolledBackward() {
        return this.isLastScrollBackwardState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public ScrollIndicatorState getScrollIndicatorState() {
        return this._scrollIndicatorState;
    }

    public static /* synthetic */ void applyMeasureResult$foundation$default(PagerState pagerState, PagerMeasureResult pagerMeasureResult, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        pagerState.applyMeasureResult$foundation(pagerMeasureResult, z, z2);
    }

    public final void applyMeasureResult$foundation(PagerMeasureResult result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        long calculateNewMinScrollOffset;
        this.prefetchState.setIdealNestedPrefetchCount$foundation(result.getVisiblePagesInfo().size());
        this.latestPageSizeWithSpacing = result.getPageSize() + result.getPageSpacing();
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        PagerScrollPosition pagerScrollPosition = this.scrollPosition;
        if (visibleItemsStayedTheSame) {
            pagerScrollPosition.updateCurrentPageOffsetFraction(result.getCurrentPageOffsetFraction());
        } else {
            pagerScrollPosition.updateFromMeasureResult(result);
            if (ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                if (this.prefetchingEnabled) {
                    this.cacheWindowLogic.onVisibleItemsChanged(result);
                }
            } else {
                cancelPrefetchIfVisibleItemsChanged(result);
            }
        }
        this.pagerLayoutInfoState.setValue(result);
        setCanScrollForward(result.getCanScrollForward());
        setCanScrollBackward(result.getCanScrollBackward());
        MeasuredPage firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        tryRunPrefetch(result);
        this.maxScrollOffset = PagerStateKt.calculateNewMaxScrollOffset(result, getPageCount());
        calculateNewMinScrollOffset = PagerStateKt.calculateNewMinScrollOffset(result, getPageCount());
        this.minScrollOffset = RangesKt.coerceAtMost(calculateNewMinScrollOffset, this.maxScrollOffset);
    }

    private final void tryRunPrefetch(PagerMeasureResult result) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (this.prefetchingEnabled) {
                if (result.getBeyondViewportPageCount() >= getPageCount()) {
                    return;
                }
                if (Math.abs(this.previousPassDelta) <= 0.5f) {
                    return;
                }
                if (isGestureActionMatchesScroll(this.previousPassDelta)) {
                    if (ComposeFoundationFlags.isCacheWindowForPagerEnabled) {
                        this.cacheWindowLogic.onScroll(this.previousPassDelta, result);
                    } else {
                        notifyPrefetch(this.previousPassDelta, result);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        } finally {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int coerceInPageRange(int i) {
        if (getPageCount() > 0) {
            return RangesKt.coerceIn(i, 0, getPageCount() - 1);
        }
        return 0;
    }

    private final boolean isGestureActionMatchesScroll(float scrollDelta) {
        if (getLayoutInfo().getOrientation() == Orientation.Vertical) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (m1086getUpDownDifferenceF1C5BW0$foundation() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (m1086getUpDownDifferenceF1C5BW0$foundation() >> 32)))) {
            return true;
        }
        return isNotGestureAction$foundation();
    }

    public final boolean isNotGestureAction$foundation() {
        return ((int) Float.intBitsToFloat((int) (m1086getUpDownDifferenceF1C5BW0$foundation() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (m1086getUpDownDifferenceF1C5BW0$foundation() & 4294967295L))) == 0;
    }

    private final void notifyPrefetch(float delta, PagerLayoutInfo info) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.prefetchingEnabled && !info.getVisiblePagesInfo().isEmpty()) {
            boolean z = delta > 0.0f;
            int calculatePrefetchIndex = calculatePrefetchIndex(z, info);
            if (calculatePrefetchIndex < 0 || calculatePrefetchIndex >= getPageCount()) {
                return;
            }
            if (calculatePrefetchIndex != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z && (prefetchHandle3 = this.currentPrefetchHandle) != null) {
                    prefetchHandle3.cancel();
                }
                this.wasPrefetchingForward = z;
                this.indexToPrefetch = calculatePrefetchIndex;
                this.currentPrefetchHandle = LazyLayoutPrefetchState.m1000schedulePrecompositionAndPremeasureVKLhPVY$default(this.prefetchState, calculatePrefetchIndex, this.premeasureConstraints, null, 4, null);
            }
            if (z) {
                if ((((PageInfo) CollectionsKt.last((List) info.getVisiblePagesInfo())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (prefetchHandle2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                prefetchHandle2.markAsUrgent();
                return;
            }
            if (info.getViewportStartOffset() - ((PageInfo) CollectionsKt.first((List) info.getVisiblePagesInfo())).getOffset() >= (-delta) || (prefetchHandle = this.currentPrefetchHandle) == null) {
                return;
            }
            prefetchHandle.markAsUrgent();
        }
    }

    private final void cancelPrefetchIfVisibleItemsChanged(PagerLayoutInfo info) {
        if (this.indexToPrefetch == -1 || info.getVisiblePagesInfo().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != calculatePrefetchIndex(this.wasPrefetchingForward, info)) {
            this.indexToPrefetch = -1;
            LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.currentPrefetchHandle;
            if (prefetchHandle != null) {
                prefetchHandle.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    private final int calculatePrefetchIndex(boolean forward, PagerLayoutInfo info) {
        if (forward) {
            int beyondViewportPageCount = info.getBeyondViewportPageCount() + 1;
            if (beyondViewportPageCount < 0) {
                return Integer.MAX_VALUE;
            }
            return ((PageInfo) CollectionsKt.last((List) info.getVisiblePagesInfo())).getIndex() + beyondViewportPageCount;
        }
        return (((PageInfo) CollectionsKt.first((List) info.getVisiblePagesInfo())).getIndex() - info.getBeyondViewportPageCount()) - 1;
    }

    public final float getOffsetDistanceInPages(int page) {
        boolean z = false;
        if (page >= 0 && page <= getPageCount()) {
            z = true;
        }
        if (!z) {
            InlineClassHelperKt.throwIllegalArgumentException("page " + page + " is not within the range 0 to " + getPageCount());
        }
        return (page - getCurrentPage()) - getCurrentPageOffsetFraction();
    }

    public static /* synthetic */ int matchScrollPositionWithKey$foundation$default(PagerState pagerState, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: matchScrollPositionWithKey");
        }
        if ((i2 & 2) != 0) {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
            Function1<Object, Unit> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int currentPage = pagerState.scrollPosition.getCurrentPage();
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                i = currentPage;
            } catch (Throwable th) {
                companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                throw th;
            }
        }
        return pagerState.matchScrollPositionWithKey$foundation(pagerLazyLayoutItemProvider, i);
    }

    public final int matchScrollPositionWithKey$foundation(PagerLazyLayoutItemProvider itemProvider, int currentPage) {
        return this.scrollPosition.matchPageWithKey(itemProvider, currentPage);
    }
}
