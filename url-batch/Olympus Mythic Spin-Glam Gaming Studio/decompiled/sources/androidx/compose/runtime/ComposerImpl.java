package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.ComposeStackTraceBuilderKt;
import androidx.compose.runtime.tooling.ComposeStackTraceKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.CompositionErrorContextKt;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.runtime.tooling.ObjectLocation;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.B5;
import com.ironsource.C4834q2;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.chromium.net.NetError;

/* compiled from: Composer.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019*\u0002º\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004\u008a\u0003\u008b\u0003BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001b\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0002¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u0016J\u0019\u0010#\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\b)\u0010,J\u001f\u0010/\u001a\u00020(2\u0006\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020(H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u00020(H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0014H\u0002¢\u0006\u0004\b4\u0010\u0016J\u000f\u00105\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u0010\u0016J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J!\u0010:\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b:\u0010;J3\u0010A\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010<\u001a\u0004\u0018\u00010\u001d2\u0006\u0010>\u001a\u00020=2\b\u00109\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b?\u0010@J!\u0010D\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\b\u0010C\u001a\u0004\u0018\u00010BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010H\u001a\u00020\u00142\u0006\u0010F\u001a\u00020\u00192\u0006\u0010G\u001a\u000207H\u0002¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020\u00142\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0014H\u0002¢\u0006\u0004\bL\u0010\u0016J\u0017\u0010N\u001a\u00020\u00192\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010OJ\u001f\u0010Q\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u0019H\u0002¢\u0006\u0004\bQ\u0010RJ/\u0010V\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bX\u0010OJ\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010OJ\u001f\u0010[\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010Z\u001a\u00020\u0019H\u0002¢\u0006\u0004\b[\u0010RJ\u000f\u0010\\\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\\\u0010\u0016J'\u0010`\u001a\u00020\u00142\u0006\u0010]\u001a\u00020\u00192\u0006\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u0019H\u0002¢\u0006\u0004\b`\u0010aJ\u001f\u0010c\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00192\u0006\u0010b\u001a\u00020\u0019H\u0002¢\u0006\u0004\bc\u0010RJ/\u0010g\u001a\u00060dj\u0002`e2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\n\u0010f\u001a\u00060dj\u0002`eH\u0002¢\u0006\u0004\bg\u0010hJ\u001b\u0010j\u001a\u00020\u0019*\u00020i2\u0006\u0010+\u001a\u00020\u0019H\u0002¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0014H\u0002¢\u0006\u0004\bl\u0010\u0016J\u000f\u0010m\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010\u0016J\u0017\u0010p\u001a\u00020\u00142\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bp\u0010qJ%\u0010t\u001a\u0010\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u0014\u0018\u00010r2\u0006\u0010o\u001a\u00020nH\u0002¢\u0006\u0004\bt\u0010uJ9\u0010{\u001a\u00020\u00142\u000e\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0v2\u0006\u0010x\u001a\u00020(2\b\u0010y\u001a\u0004\u0018\u00010\u001d2\u0006\u0010z\u001a\u000207H\u0002¢\u0006\u0004\b{\u0010|J/\u0010\u0081\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001Jp\u0010\u008a\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0083\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0084\u00012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00192\u001d\b\u0002\u0010\u0087\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0~0}2\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J\u0019\u0010\u008d\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010}H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J,\u0010\u0090\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010}2\u0006\u0010+\u001a\u00020\u00192\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J?\u0010\u0097\u0001\u001a\u00020\u00142\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0092\u00012\u0015\u0010w\u001a\u0011\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0088\u0001¢\u0006\u0003\b\u0094\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0098\u0001\u001a\u0004\u0018\u00010\u001d*\u00020i2\u0006\u0010M\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u0011\u0010\u009a\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\u0016J\u0011\u0010\u009b\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u0016J\u001b\u0010\u009d\u0001\u001a\u00020\u00142\u0007\u0010\u009c\u0001\u001a\u00020%H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u0016J\u001a\u0010¡\u0001\u001a\u00020\u00142\u0007\u0010 \u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b¡\u0001\u0010\u001cJ\u0011\u0010¢\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¢\u0001\u0010\u0016J\u0011\u0010£\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b£\u0001\u0010\u0016J\u0011\u0010¤\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¤\u0001\u0010\u0016J\u0019\u0010¥\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b¥\u0001\u0010\u001cJ\u0011\u0010¦\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¦\u0001\u0010\u0016J\u0019\u0010§\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b§\u0001\u0010\u001cJ\u0011\u0010¨\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¨\u0001\u0010\u0016J\u0011\u0010©\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b©\u0001\u0010\u0016J\u0011\u0010ª\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bª\u0001\u0010\u0016J#\u0010«\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0005\b«\u0001\u0010\u001fJ\u0011\u0010¬\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¬\u0001\u0010\u0016J\u0011\u0010®\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b\u00ad\u0001\u0010\u0016J\u0011\u0010¯\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¯\u0001\u0010\u0016J\u0011\u0010±\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b°\u0001\u0010\u0016J\u0011\u0010³\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b²\u0001\u0010\u0016J\u0011\u0010´\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b´\u0001\u0010\u0016J\u0011\u0010µ\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bµ\u0001\u0010\u0016J)\u0010¸\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010¶\u00012\u000e\u0010·\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0088\u0001H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0011\u0010º\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\bº\u0001\u0010\u0016J\u0011\u0010»\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b»\u0001\u0010\u0016J#\u0010¼\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b¼\u0001\u0010\u001fJ\u0011\u0010½\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b½\u0001\u0010\u0016J\u0011\u0010¾\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¾\u0001\u0010\u0016J\u0011\u0010¿\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b¿\u0001\u0010\u0016J\u000f\u0010À\u0001\u001a\u00020\u0014¢\u0006\u0005\bÀ\u0001\u0010\u0016J\u000f\u0010Á\u0001\u001a\u00020\u0014¢\u0006\u0005\bÁ\u0001\u0010\u0016JD\u0010Ä\u0001\u001a\u00020\u0014\"\u0005\b\u0000\u0010Â\u0001\"\u0005\b\u0001\u0010¶\u00012\u0006\u0010\"\u001a\u00028\u00002\u001a\u0010\u0089\u0001\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140Ã\u0001H\u0016¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\u0014\u0010Æ\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u0014\u0010È\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\bÈ\u0001\u0010Ç\u0001J\u001c\u0010É\u0001\u001a\u0002072\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\u001c\u0010Ë\u0001\u001a\u0002072\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bË\u0001\u0010Ê\u0001J\u001a\u0010É\u0001\u001a\u0002072\u0006\u0010\"\u001a\u000207H\u0017¢\u0006\u0006\bÉ\u0001\u0010Ì\u0001J\u001b\u0010É\u0001\u001a\u0002072\u0007\u0010\"\u001a\u00030Í\u0001H\u0017¢\u0006\u0006\bÉ\u0001\u0010Î\u0001J\u001a\u0010É\u0001\u001a\u0002072\u0006\u0010\"\u001a\u00020dH\u0017¢\u0006\u0006\bÉ\u0001\u0010Ï\u0001J\u001a\u0010É\u0001\u001a\u0002072\u0006\u0010\"\u001a\u00020\u0019H\u0017¢\u0006\u0006\bÉ\u0001\u0010Ð\u0001J\u001b\u0010Ñ\u0001\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÑ\u0001\u0010$J\u001b\u0010Ò\u0001\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\bÒ\u0001\u0010$J\"\u0010Ô\u0001\u001a\u00020\u00142\u000e\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0016¢\u0006\u0006\bÔ\u0001\u0010¹\u0001J)\u0010Ø\u0001\u001a\u00020\u00142\u0015\u0010×\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030Ö\u00010Õ\u0001H\u0017¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u0011\u0010Ú\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÚ\u0001\u0010\u0016J(\u0010Ü\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010¶\u00012\r\u0010\u001a\u001a\t\u0012\u0004\u0012\u00028\u00000Û\u0001H\u0017¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\u0012\u0010Þ\u0001\u001a\u00020\u0004H\u0016¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J%\u0010ã\u0001\u001a\u0002072\u0006\u0010o\u001a\u00020n2\t\u0010à\u0001\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0006\bá\u0001\u0010â\u0001J\u0011\u0010ä\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bä\u0001\u0010\u0016J$\u0010ç\u0001\u001a\u0002072\u0007\u0010å\u0001\u001a\u0002072\u0007\u0010æ\u0001\u001a\u00020\u0019H\u0017¢\u0006\u0006\bç\u0001\u0010è\u0001J\u0011\u0010é\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bé\u0001\u0010\u0016J\u001a\u0010ê\u0001\u001a\u00020\u00142\u0007\u0010É\u0001\u001a\u000207H\u0017¢\u0006\u0005\bê\u0001\u0010KJ\u001a\u0010ë\u0001\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0006\bë\u0001\u0010ì\u0001J\u0015\u0010î\u0001\u001a\u0005\u0018\u00010í\u0001H\u0017¢\u0006\u0006\bî\u0001\u0010ï\u0001J(\u0010ð\u0001\u001a\u00020\u00142\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030v2\b\u0010y\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\bð\u0001\u0010ñ\u0001J/\u0010ò\u0001\u001a\u00020\u00142\u001b\u0010\u0080\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u007f\u0012\u0006\u0012\u0004\u0018\u00010\u007f0~0}H\u0017¢\u0006\u0006\bò\u0001\u0010\u0082\u0001J#\u0010õ\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010}2\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0006\bó\u0001\u0010ô\u0001J\u0017\u0010ö\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010}¢\u0006\u0006\bö\u0001\u0010\u008e\u0001JI\u0010û\u0001\u001a\u00020\u00142\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0092\u00012\u0013\u0010w\u001a\u000f\u0012\u0004\u0012\u00020\u00140\u0088\u0001¢\u0006\u0003\b\u0094\u00012\n\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0000¢\u0006\u0006\bù\u0001\u0010ú\u0001J\"\u0010ý\u0001\u001a\u00020\u00142\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0088\u0001H\u0000¢\u0006\u0006\bü\u0001\u0010¹\u0001J4\u0010\u0080\u0002\u001a\u0002072\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0092\u00012\n\u0010ø\u0001\u001a\u0005\u0018\u00010÷\u0001H\u0000¢\u0006\u0006\bþ\u0001\u0010ÿ\u0001J&\u0010\u0083\u0002\u001a\u00020\u00142\u0014\u0010\u0093\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u001d0\u0092\u0001¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002J\u0014\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0006\b\u0084\u0002\u0010Ç\u0001J\u001b\u0010\u0085\u0002\u001a\u00020\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\b\u0085\u0002\u0010$J\u001b\u0010\u0087\u0002\u001a\u00020\u00142\u0007\u0010o\u001a\u00030\u0086\u0002H\u0016¢\u0006\u0006\b\u0087\u0002\u0010\u0088\u0002R!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008c\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u008d\u0002R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008e\u0002R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u008f\u0002R\u0017\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010\u008f\u0002R\u0015\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010\u0090\u0002R\u001d\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0011\u0010\u0091\u0002\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002R \u0010\u0095\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010B0\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001b\u0010\u0097\u0002\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0019\u0010\u0099\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u0019\u0010\u009b\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0002\u0010\u009a\u0002R\u0019\u0010\u009c\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009a\u0002R\u0018\u0010\u009e\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0002\u0010\u009f\u0002R\u001c\u0010¡\u0002\u001a\u0005\u0018\u00010 \u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0002\u0010¢\u0002R\u001c\u0010¤\u0002\u001a\u0005\u0018\u00010£\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010¥\u0002R\u0019\u0010¦\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u0019\u0010¨\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010§\u0002R\u0019\u0010©\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0002\u0010§\u0002R\u001f\u0010\u0087\u0001\u001a\n\u0012\u0005\u0012\u00030«\u00020ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010¬\u0002R\u0018\u0010\u00ad\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0002\u0010\u009f\u0002R\u0019\u0010®\u0002\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\"\u0010±\u0002\u001a\u000b\u0012\u0004\u0012\u00020(\u0018\u00010°\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010²\u0002R\u0019\u0010³\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0002\u0010§\u0002R\u0018\u0010´\u0002\u001a\u00030\u009d\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0002\u0010\u009f\u0002R\u0019\u0010µ\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0002\u0010§\u0002R\u0019\u0010¶\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0002\u0010\u009a\u0002R\u0019\u0010·\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b·\u0002\u0010\u009a\u0002R\u0019\u0010¸\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0002\u0010\u009a\u0002R\u0019\u0010¹\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0002\u0010§\u0002R\u0018\u0010»\u0002\u001a\u00030º\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0002\u0010¼\u0002R\u001e\u0010½\u0002\u001a\t\u0012\u0004\u0012\u00020n0\u0094\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010\u0096\u0002R)\u0010¾\u0002\u001a\u0002072\u0006\u0010\"\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b¾\u0002\u0010§\u0002\u001a\u0006\b¿\u0002\u0010À\u0002R)\u0010Á\u0002\u001a\u0002072\u0006\u0010\"\u001a\u0002078\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÁ\u0002\u0010§\u0002\u001a\u0006\bÂ\u0002\u0010À\u0002R)\u0010Ã\u0002\u001a\u00020i8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÃ\u0002\u0010Ä\u0002\u001a\u0006\bÅ\u0002\u0010Æ\u0002\"\u0006\bÇ\u0002\u0010È\u0002R)\u0010É\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0002\u0010\u008d\u0002\u001a\u0006\bÊ\u0002\u0010Ë\u0002\"\u0006\bÌ\u0002\u0010Í\u0002R\u001a\u0010Ï\u0002\u001a\u00030Î\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Ð\u0002R\u0019\u0010Ñ\u0002\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0002\u0010§\u0002R\u001b\u0010Ò\u0002\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010¯\u0002R+\u0010Ó\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0002\u0010\u008f\u0002\u001a\u0006\bÔ\u0002\u0010Õ\u0002\"\u0006\bÖ\u0002\u0010×\u0002R\u0018\u0010Ù\u0002\u001a\u00030Ø\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0002\u0010Ú\u0002R\u0019\u0010Û\u0002\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010Ü\u0002R\u001a\u0010Þ\u0002\u001a\u00030Ý\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0002\u0010ß\u0002R\u001c\u0010à\u0002\u001a\u0005\u0018\u00010÷\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0002\u0010á\u0002R\"\u0010ã\u0002\u001a\u0005\u0018\u00010â\u00028@X\u0080\u0004¢\u0006\u0010\n\u0006\bã\u0002\u0010ä\u0002\u001a\u0006\bå\u0002\u0010æ\u0002R \u0010è\u0002\u001a\u00030ç\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bè\u0002\u0010é\u0002\u001a\u0006\bê\u0002\u0010ë\u0002R.\u0010G\u001a\u0002072\u0006\u0010\"\u001a\u0002078\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bG\u0010§\u0002\u0012\u0005\bí\u0002\u0010\u0016\u001a\u0006\bì\u0002\u0010À\u0002R8\u0010î\u0002\u001a\u00060dj\u0002`e2\n\u0010\"\u001a\u00060dj\u0002`e8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bî\u0002\u0010ï\u0002\u0012\u0005\bò\u0002\u0010\u0016\u001a\u0006\bð\u0002\u0010ñ\u0002R\u001c\u0010ô\u0002\u001a\u0005\u0018\u00010ó\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bô\u0002\u0010õ\u0002R\u001d\u0010ø\u0002\u001a\u0004\u0018\u00010\u001d*\u00020i8BX\u0082\u0004¢\u0006\b\u001a\u0006\bö\u0002\u0010÷\u0002R\u0017\u0010ú\u0002\u001a\u0002078@X\u0080\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010À\u0002R\u001e\u0010ý\u0002\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bü\u0002\u0010\u0016\u001a\u0006\bû\u0002\u0010À\u0002R\u001e\u0010\u0080\u0003\u001a\u0002078VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÿ\u0002\u0010\u0016\u001a\u0006\bþ\u0002\u0010À\u0002R\u0018\u0010\u0083\u0003\u001a\u00030ó\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0081\u0003\u0010\u0082\u0003R\u0019\u0010\u0086\u0003\u001a\u0004\u0018\u00010n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0003\u0010\u0085\u0003R\u001a\u0010\u0089\u0003\u001a\u0005\u0018\u00010\u0086\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0003\u0010\u0088\u0003¨\u0006\u008c\u0003"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "Landroidx/compose/runtime/changelist/ChangeList;", "changes", "lateChanges", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "Landroidx/compose/runtime/CompositionImpl;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/changelist/ChangeList;Landroidx/compose/runtime/CompositionObserverHolder;Landroidx/compose/runtime/CompositionImpl;)V", "", "startRoot", "()V", "endRoot", "abortRoot", "", "key", "startGroup", "(I)V", "", "dataKey", "(ILjava/lang/Object;)V", "endGroup", "skipGroup", "value", "updateSlot", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/Anchor;", "rememberObserverAnchor", "()Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "currentCompositionLocalScope", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "group", "(I)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "parentScope", "currentProviders", "updateProviderMapGroup", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "providers", "recordProviderUpdate", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "ensureWriter", "createFreshInsertTable", "forceFreshInsertTable", "", "isNode", "data", "startReaderGroup", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "exitGroup", "(IZ)V", "end", "(Z)V", "recomposeToGroupEnd", "index", "insertedGroupVirtualIndex", "(I)I", "newCount", "updateNodeCountOverrides", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "(IIII)I", "rGroupIndexOf", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "(III)V", "nearestCommonRoot", "doRecordDownsFor", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "recomposeKey", "compositeKeyOf", "(IIJ)J", "Landroidx/compose/runtime/SlotReader;", "groupCompositeKeyPart", "(Landroidx/compose/runtime/SlotReader;I)I", "skipReaderToGroupEnd", "addRecomposeScope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "enterRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "exitRecomposeScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/MovableContent;", "content", "locals", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "force", "invokeMovableContentLambda", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/PersistentCompositionLocalMap;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentGuarded", "(Ljava/util/List;)V", "R", "Landroidx/compose/runtime/ControlledComposition;", "from", "to", "invalidations", "Lkotlin/Function0;", "block", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/tooling/ComposeStackTraceFrame;", "currentStackTrace", "()Ljava/util/List;", "dataOffset", "stackTraceForGroup", "(ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/collection/ScopeMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "doCompose-aFTiNEg", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;)V", "doCompose", "nodeAt", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "validateNodeExpected", "validateNodeNotExpected", "anchor", "recordInsert", "(Landroidx/compose/runtime/Anchor;)V", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", "reportAllMovableContent", "finalizeCompose", "cleanUpCompose", "startReplaceableGroup", "endReplaceableGroup", "startReplaceGroup", "endReplaceGroup", "startDefaults", "endDefaults", "startMovableGroup", "endMovableGroup", "changesApplied$runtime", "changesApplied", "collectParameterInformation", "dispose$runtime", "dispose", "deactivate$runtime", "deactivate", "startNode", "startReusableNode", "T", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "startReuseFromRoot", "endReuseFromRoot", "V", "Lkotlin/Function2;", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nextSlot", "()Ljava/lang/Object;", "nextSlotForCache", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "(Z)Z", "", "(F)Z", "(J)Z", "(I)Z", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "Landroidx/compose/runtime/CompositionLocal;", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", C4834q2.p, "tryImminentInvalidation$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "skipCurrentGroup", "parametersChanged", "flags", "shouldExecute", "(ZI)Z", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "insertMovableContentReferences", "stackTraceForValue$runtime", "(Ljava/lang/Object;)Ljava/util/List;", "stackTraceForValue", "parentStackTrace", "Landroidx/compose/runtime/ShouldPauseCallback;", "shouldPause", "composeContent--ZbOJvo$runtime", "(Landroidx/collection/MutableScatterMap;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ShouldPauseCallback;)V", "composeContent", "prepareCompose$runtime", "prepareCompose", "recompose-aFTiNEg$runtime", "(Landroidx/collection/MutableScatterMap;Landroidx/compose/runtime/ShouldPauseCallback;)Z", "recompose", "updateComposerInvalidations-RY85e9Y", "(Landroidx/collection/MutableScatterMap;)V", "updateComposerInvalidations", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/CompositionObserverHolder;", "Landroidx/compose/runtime/CompositionImpl;", "getComposition", "()Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Ljava/util/ArrayList;", "pending", "Landroidx/compose/runtime/Pending;", "nodeIndex", "I", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/IntStack;", "parentStateStack", "Landroidx/compose/runtime/IntStack;", "", "nodeCountOverrides", "[I", "Landroidx/collection/MutableIntIntMap;", "nodeCountVirtualOverrides", "Landroidx/collection/MutableIntIntMap;", "forceRecomposeScopes", "Z", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/Invalidation;", "Ljava/util/List;", "entersStack", "rootProvider", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Landroidx/collection/MutableIntObjectMap;", "providerUpdates", "Landroidx/collection/MutableIntObjectMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "androidx/compose/runtime/ComposerImpl$derivedStateObserver$1", "derivedStateObserver", "Landroidx/compose/runtime/ComposerImpl$derivedStateObserver$1;", "invalidateStack", "isComposing", "isComposing$runtime", "()Z", "isDisposed", "isDisposed$runtime", "reader", "Landroidx/compose/runtime/SlotReader;", "getReader$runtime", "()Landroidx/compose/runtime/SlotReader;", "setReader$runtime", "(Landroidx/compose/runtime/SlotReader;)V", "insertTable", "getInsertTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime", "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/SlotWriter;", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime", "()Landroidx/compose/runtime/changelist/ChangeList;", "setDeferredChanges$runtime", "(Landroidx/compose/runtime/changelist/ChangeList;)V", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "changeListWriter", "Landroidx/compose/runtime/changelist/ComposerChangeListWriter;", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "Landroidx/compose/runtime/changelist/FixupList;", "insertFixups", "Landroidx/compose/runtime/changelist/FixupList;", "shouldPauseCallback", "Landroidx/compose/runtime/ShouldPauseCallback;", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "errorContext", "Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "getErrorContext$runtime", "()Landroidx/compose/runtime/tooling/CompositionErrorContextImpl;", "Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getInserting", "getInserting$annotations", "compositeKeyHashCode", "J", "getCompositeKeyHashCode", "()J", "getCompositeKeyHashCode$annotations", "Landroidx/compose/runtime/tooling/CompositionData;", "_compositionData", "Landroidx/compose/runtime/tooling/CompositionData;", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "node", "getAreChildrenComposing$runtime", "areChildrenComposing", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "getCurrentRecomposeScope$runtime", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "CompositionContextHolder", "CompositionContextImpl", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ComposerImpl implements Composer {
    private CompositionData _compositionData;
    private final Set abandonSet;
    private final Applier applier;
    private final CoroutineContext applyCoroutineContext;
    private final ComposerChangeListWriter changeListWriter;
    private ChangeList changes;
    private int childrenComposing;
    private long compositeKeyHashCode;
    private final CompositionImpl composition;
    private int compositionToken;
    private ChangeList deferredChanges;
    private final ComposerImpl$derivedStateObserver$1 derivedStateObserver;
    private final CompositionErrorContextImpl errorContext;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;
    private Anchor insertAnchor;
    private FixupList insertFixups;
    private SlotTable insertTable;
    private boolean inserting;
    private final ArrayList invalidateStack;
    private boolean isComposing;
    private boolean isDisposed;
    private ChangeList lateChanges;
    private int[] nodeCountOverrides;
    private MutableIntIntMap nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parentContext;
    private Pending pending;
    private PersistentCompositionLocalMap providerCache;
    private MutableIntObjectMap providerUpdates;
    private boolean providersInvalid;
    private int rGroupIndex;
    private SlotReader reader;
    private boolean reusing;
    private ShouldPauseCallback shouldPauseCallback;
    private final SlotTable slotTable;
    private boolean sourceMarkersEnabled;
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private final ArrayList pendingStack = Stack.m1135constructorimpl$default(null, 1, null);
    private final IntStack parentStateStack = new IntStack();
    private final List invalidations = new ArrayList();
    private final IntStack entersStack = new IntStack();
    private PersistentCompositionLocalMap rootProvider = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
    private final IntStack providersInvalidStack = new IntStack();
    private int reusingGroup = -1;

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    private final long compositeKeyOf(int group, int recomposeGroup, long recomposeKey) {
        long rotateLeft;
        long j = 0;
        int i = 3;
        int i2 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                rotateLeft = Long.rotateLeft(recomposeKey, i2);
            } else {
                int groupCompositeKeyPart = groupCompositeKeyPart(this.reader, group);
                if (groupCompositeKeyPart == 126665345) {
                    rotateLeft = Long.rotateLeft(groupCompositeKeyPart, i2);
                } else {
                    j = (j ^ Long.rotateLeft(groupCompositeKeyPart, i)) ^ Long.rotateLeft(this.reader.hasObjectKey(group) ? 0 : rGroupIndexOf(group), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    group = this.reader.parent(group);
                }
            }
            return rotateLeft ^ j;
        }
        return j;
    }

    public final void dispose$runtime() {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime(this);
            deactivate$runtime();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.INSTANCE;
            trace.endSection(beginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    private final PersistentCompositionLocalMap updateProviderMapGroup(PersistentCompositionLocalMap parentScope, PersistentCompositionLocalMap currentProviders) {
        PersistentCompositionLocalMap.Builder builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentCompositionLocalMap build = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        updateSlot(build);
        updateSlot(currentProviders);
        endGroup();
        return build;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(Applier applier, CompositionContext compositionContext, SlotTable slotTable, Set set, ChangeList changeList, ChangeList changeList2, CompositionObserverHolder compositionObserverHolder, CompositionImpl compositionImpl) {
        this.applier = applier;
        this.parentContext = compositionContext;
        this.slotTable = slotTable;
        this.abandonSet = set;
        this.changes = changeList;
        this.lateChanges = changeList2;
        this.observerHolder = compositionObserverHolder;
        this.composition = compositionImpl;
        this.sourceMarkersEnabled = compositionContext.getCollectingSourceInformation() || compositionContext.getCollectingCallByInformation$runtime();
        this.derivedStateObserver = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public void start(DerivedState derivedState) {
                ComposerImpl.this.childrenComposing++;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public void done(DerivedState derivedState) {
                ComposerImpl.this.childrenComposing--;
            }
        };
        this.invalidateStack = Stack.m1135constructorimpl$default(null, 1, null);
        SlotReader openReader = slotTable.openReader();
        openReader.close();
        this.reader = openReader;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.getCollectingSourceInformation()) {
            slotTable2.collectSourceInformation();
        }
        if (compositionContext.getCollectingCallByInformation$runtime()) {
            slotTable2.collectCalledByInformation();
        }
        this.insertTable = slotTable2;
        SlotWriter openWriter = slotTable2.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
        this.changeListWriter = new ComposerChangeListWriter(this, this.changes);
        SlotReader openReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = openReader2.anchor(0);
            openReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new FixupList();
            this.errorContext = new CompositionErrorContextImpl(this);
            CoroutineContext effectCoroutineContext = compositionContext.getEffectCoroutineContext();
            CoroutineContext errorContext$runtime = getErrorContext$runtime();
            this.applyCoroutineContext = effectCoroutineContext.plus(errorContext$runtime == null ? EmptyCoroutineContext.INSTANCE : errorContext$runtime);
        } catch (Throwable th) {
            openReader2.close();
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public Applier getApplier() {
        return this.applier;
    }

    public CompositionImpl getComposition() {
        return this.composition;
    }

    /* renamed from: isComposing$runtime, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    public final boolean getAreChildrenComposing$runtime() {
        return this.childrenComposing > 0;
    }

    /* renamed from: getReader$runtime, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    /* renamed from: getDeferredChanges$runtime, reason: from getter */
    public final ChangeList getDeferredChanges() {
        return this.deferredChanges;
    }

    public final CompositionErrorContextImpl getErrorContext$runtime() {
        if (this.sourceMarkersEnabled) {
            return this.errorContext;
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceableGroup(int key) {
        m1092startBaiHCIY(key, null, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startReplaceGroup(int key) {
        if (this.pending != null) {
            m1092startBaiHCIY(key, null, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
            return;
        }
        validateNodeNotExpected();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ key, 3) ^ this.rGroupIndex;
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.beginEmpty();
            this.writer.startGroup(key, Composer.INSTANCE.getEmpty());
            enterGroup(false, null);
            return;
        }
        if (slotReader.getGroupKey() == key && !slotReader.getHasObjectKey()) {
            slotReader.startGroup();
            enterGroup(false, null);
            return;
        }
        if (!slotReader.isGroupEnd()) {
            int i = this.nodeIndex;
            int current = slotReader.getCurrent();
            recordDelete();
            this.changeListWriter.removeNode(i, slotReader.skipGroup());
            ComposerKt.removeRange(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.beginEmpty();
        this.inserting = true;
        this.providerCache = null;
        ensureWriter();
        SlotWriter slotWriter = this.writer;
        slotWriter.beginInsert();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.startGroup(key, Composer.INSTANCE.getEmpty());
        this.insertAnchor = slotWriter.anchor(currentGroup);
        enterGroup(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReplaceGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startDefaults() {
        m1092startBaiHCIY(NetError.ERR_PROXY_AUTH_REQUESTED, null, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime == null || !currentRecomposeScope$runtime.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        if (!getSkipping() || this.providersInvalid) {
            return true;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        return currentRecomposeScope$runtime != null && currentRecomposeScope$runtime.getDefaultsInvalid();
    }

    @Override // androidx.compose.runtime.Composer
    public void startMovableGroup(int key, Object dataKey) {
        m1092startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void endMovableGroup() {
        endGroup();
    }

    private final void startRoot() {
        int asInt;
        this.rGroupIndex = 0;
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime();
        PersistentCompositionLocalMap compositionLocalScope$runtime = this.parentContext.getCompositionLocalScope$runtime();
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = changed(compositionLocalScope$runtime);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.getCollectingSourceInformation();
        }
        if (this.sourceMarkersEnabled) {
            CompositionLocal localCompositionErrorContext = CompositionErrorContextKt.getLocalCompositionErrorContext();
            Intrinsics.checkNotNull(localCompositionErrorContext, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            compositionLocalScope$runtime = compositionLocalScope$runtime.putValue(localCompositionErrorContext, new StaticValueHolder(getErrorContext$runtime()));
        }
        this.rootProvider = compositionLocalScope$runtime;
        Set set = (Set) CompositionLocalMapKt.read(compositionLocalScope$runtime, InspectionTablesKt.getLocalInspectionTables());
        if (set != null) {
            set.add(getCompositionData());
            this.parentContext.recordInspectionTable$runtime(set);
        }
        startGroup(Long.hashCode(this.parentContext.getCompositeKeyHashCode()));
    }

    private final void endRoot() {
        boolean asBool;
        endGroup();
        this.parentContext.doneComposing$runtime();
        endGroup();
        this.changeListWriter.endRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
    }

    private final void abortRoot() {
        cleanUpCompose();
        Stack.m1133clearimpl(this.pendingStack);
        this.parentStateStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates = null;
        this.insertFixups.clear();
        this.compositeKeyHashCode = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (this.writer.getClosed()) {
            return;
        }
        forceFreshInsertTable();
    }

    public final void changesApplied$runtime() {
        this.providerUpdates = null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || currentRecomposeScope$runtime.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.collectSourceInformation();
        this.insertTable.collectSourceInformation();
        this.writer.updateToTableMaps();
    }

    public final void deactivate$runtime() {
        Stack.m1133clearimpl(this.invalidateStack);
        this.invalidations.clear();
        this.changes.clear();
        this.providerUpdates = null;
    }

    private final void startGroup(int key) {
        m1092startBaiHCIY(key, null, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
    }

    private final void startGroup(int key, Object dataKey) {
        m1092startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1105getGroupULZAiWs(), null);
    }

    private final void endGroup() {
        end(false);
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m1092startBaiHCIY(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, GroupKind.INSTANCE.m1106getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m1092startBaiHCIY(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, null, GroupKind.INSTANCE.m1107getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    public void createNode(Function0 factory) {
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeImmediateRuntimeError("createNode() can only be called when inserting");
        }
        int peek = this.parentStateStack.peek();
        SlotWriter slotWriter = this.writer;
        Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        this.insertFixups.createAndInsertNode(factory, peek, anchor);
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeImmediateRuntimeError("useNode() called while inserting");
        }
        Object node = getNode(this.reader);
        this.changeListWriter.moveDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            this.changeListWriter.useNode(node);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, Object dataKey) {
        if (!getInserting() && this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        m1092startBaiHCIY(key, null, GroupKind.INSTANCE.m1105getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    public final void startReuseFromRoot() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void endReuseFromRoot() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            PreconditionsKt.throwIllegalArgumentException("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void apply(Object value, Function2 block) {
        if (getInserting()) {
            this.insertFixups.updateNode(value, block);
        } else {
            this.changeListWriter.updateNode(value, block);
        }
    }

    public final Object nextSlot() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next : Composer.INSTANCE.getEmpty();
    }

    public final Object nextSlotForCache() {
        if (getInserting()) {
            validateNodeNotExpected();
            return Composer.INSTANCE.getEmpty();
        }
        Object next = this.reader.next();
        return (!this.reusing || (next instanceof ReusableRememberObserver)) ? next instanceof RememberObserverHolder ? ((RememberObserverHolder) next).getWrapped() : next : Composer.INSTANCE.getEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changedInstance(Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(boolean value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Boolean) && value == ((Boolean) nextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(float value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Float) && value == ((Number) nextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(long value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Long) && value == ((Number) nextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean changed(int value) {
        Object nextSlot = nextSlot();
        if ((nextSlot instanceof Integer) && value == ((Number) nextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }

    private final void updateSlot(Object value) {
        nextSlot();
        updateValue(value);
    }

    public final void updateValue(Object value) {
        if (getInserting()) {
            this.writer.update(value);
            return;
        }
        if (this.reader.getHadNext()) {
            int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (this.changeListWriter.getPastParent()) {
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                SlotReader slotReader = this.reader;
                composerChangeListWriter.updateAnchoredValue(value, slotReader.anchor(slotReader.getParent()), groupSlotIndex);
                return;
            }
            this.changeListWriter.updateValue(value, groupSlotIndex);
            return;
        }
        ComposerChangeListWriter composerChangeListWriter2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        composerChangeListWriter2.appendValue(slotReader2.anchor(slotReader2.getParent()), value);
    }

    public final void updateCachedValue(Object value) {
        if (value instanceof RememberObserver) {
            RememberObserverHolder rememberObserverHolder = new RememberObserverHolder((RememberObserver) value, rememberObserverAnchor());
            if (getInserting()) {
                this.changeListWriter.remember(rememberObserverHolder);
            }
            this.abandonSet.add(value);
            value = rememberObserverHolder;
        }
        updateValue(value);
    }

    private final Anchor rememberObserverAnchor() {
        int i;
        int i2;
        if (getInserting()) {
            if (!ComposerKt.isAfterFirstChild(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int parent = this.writer.parent(currentGroup);
            while (true) {
                int i3 = parent;
                i2 = currentGroup;
                currentGroup = i3;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                parent = this.writer.parent(currentGroup);
            }
            return this.writer.anchor(i2);
        }
        if (!ComposerKt.isAfterFirstChild(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int parent2 = this.reader.parent(current);
        while (true) {
            int i4 = parent2;
            i = current;
            current = i4;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            parent2 = this.reader.parent(current);
        }
        return this.reader.anchor(i);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionData getCompositionData() {
        CompositionData compositionData = this._compositionData;
        if (compositionData != null) {
            return compositionData;
        }
        CompositionDataImpl compositionDataImpl = new CompositionDataImpl(getComposition());
        this._compositionData = compositionDataImpl;
        return compositionDataImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(Function0 effect) {
        this.changeListWriter.sideEffect(effect);
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.providerCache;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : currentCompositionLocalScope(this.reader.getParent());
    }

    private final PersistentCompositionLocalMap currentCompositionLocalScope(int group) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object groupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(groupAux, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupAux;
                    this.providerCache = persistentCompositionLocalMap2;
                    return persistentCompositionLocalMap2;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
                    if (mutableIntObjectMap == null || (persistentCompositionLocalMap = (PersistentCompositionLocalMap) mutableIntObjectMap.get(group)) == null) {
                        Object groupAux2 = this.reader.groupAux(group);
                        Intrinsics.checkNotNull(groupAux2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupAux2;
                    }
                    this.providerCache = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.rootProvider;
        this.providerCache = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    private final void recordProviderUpdate(PersistentCompositionLocalMap providers) {
        MutableIntObjectMap mutableIntObjectMap = this.providerUpdates;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap(0, 1, null);
            this.providerUpdates = mutableIntObjectMap;
        }
        mutableIntObjectMap.set(this.reader.getCurrent(), providers);
    }

    @Override // androidx.compose.runtime.Composer
    public void startProviders(ProvidedValue[] values) {
        PersistentCompositionLocalMap updateProviderMapGroup;
        int asInt;
        PersistentCompositionLocalMap currentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, CompositionLocalMapKt.updateCompositionMap$default(values, currentCompositionLocalScope, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object groupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(groupGet, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap = (PersistentCompositionLocalMap) groupGet;
            Object groupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(groupGet2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) groupGet2;
            PersistentCompositionLocalMap updateCompositionMap = CompositionLocalMapKt.updateCompositionMap(values, currentCompositionLocalScope, persistentCompositionLocalMap2);
            if (!getSkipping() || this.reusing || !Intrinsics.areEqual(persistentCompositionLocalMap2, updateCompositionMap)) {
                updateProviderMapGroup = updateProviderMapGroup(currentCompositionLocalScope, updateCompositionMap);
                if (!this.reusing && Intrinsics.areEqual(updateProviderMapGroup, persistentCompositionLocalMap)) {
                    z = false;
                }
                z2 = z;
            } else {
                skipGroup();
                updateProviderMapGroup = persistentCompositionLocalMap;
            }
        }
        if (z2 && !getInserting()) {
            recordProviderUpdate(updateProviderMapGroup);
        }
        IntStack intStack = this.providersInvalidStack;
        asInt = ComposerKt.asInt(this.providersInvalid);
        intStack.push(asInt);
        this.providersInvalid = z2;
        this.providerCache = updateProviderMapGroup;
        m1092startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1105getGroupULZAiWs(), updateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    public void endProviders() {
        boolean asBool;
        endGroup();
        endGroup();
        asBool = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providersInvalid = asBool;
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    public Object consume(CompositionLocal key) {
        return CompositionLocalMapKt.read(currentCompositionLocalScope(), key);
    }

    @Override // androidx.compose.runtime.Composer
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object nextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = nextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) nextSlot : null;
        if (compositionContextHolder == null) {
            long compositeKeyHashCode = getCompositeKeyHashCode();
            boolean z = this.forceRecomposeScopes;
            boolean z2 = this.sourceMarkersEnabled;
            CompositionImpl composition = getComposition();
            if (composition == null) {
                composition = null;
            }
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(compositeKeyHashCode, z, z2, composition != null ? composition.getObserverHolder() : null));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime() {
        ArrayList arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && Stack.m1140isNotEmptyimpl(arrayList)) {
            return (RecomposeScopeImpl) Stack.m1141peekimpl(arrayList);
        }
        return null;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter openWriter = this.insertTable.openWriter();
            this.writer = openWriter;
            openWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void createFreshInsertTable() {
        if (!this.writer.getClosed()) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        forceFreshInsertTable();
    }

    private final void forceFreshInsertTable() {
        SlotTable slotTable = new SlotTable();
        if (this.sourceMarkersEnabled) {
            slotTable.collectSourceInformation();
        }
        if (this.parentContext.getCollectingCallByInformation$runtime()) {
            slotTable.collectCalledByInformation();
        }
        this.insertTable = slotTable;
        SlotWriter openWriter = slotTable.openWriter();
        openWriter.close(true);
        this.writer = openWriter;
    }

    private final void startReaderGroup(boolean isNode, Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            this.changeListWriter.updateAuxData(data);
        }
        this.reader.startGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0080  */
    /* renamed from: start-BaiHCIY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m1092startBaiHCIY(int key, Object objectKey, int kind, Object data) {
        long rotateLeft;
        Object obj = objectKey;
        validateNodeNotExpected();
        int i = this.rGroupIndex;
        if (obj != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (obj instanceof Enum ? ((Enum) obj).ordinal() : objectKey.hashCode()), 3) ^ 0;
        } else if (data == null || key != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            rotateLeft = i ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ key, 3);
        } else {
            this.compositeKeyHashCode = i ^ Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ data.hashCode(), 3);
            if (obj == null) {
                this.rGroupIndex++;
            }
            GroupKind.Companion companion = GroupKind.INSTANCE;
            boolean z = kind == companion.m1105getGroupULZAiWs();
            Pending pending = null;
            if (!getInserting()) {
                this.reader.beginEmpty();
                int currentGroup = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.startNode(key, Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter = this.writer;
                    if (obj == null) {
                        obj = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter.startData(key, obj, data);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (obj == null) {
                        obj = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter2.startGroup(key, obj);
                }
                Pending pending2 = this.pending;
                if (pending2 != null) {
                    KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                    pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                    pending2.recordUsed(keyInfo);
                }
                enterGroup(z, null);
                return;
            }
            boolean z2 = kind == companion.m1106getNodeULZAiWs() && this.reusing;
            if (this.pending == null) {
                int groupKey = this.reader.getGroupKey();
                if (!z2 && groupKey == key && Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                    startReaderGroup(z, data);
                } else {
                    this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
                }
            }
            Pending pending3 = this.pending;
            if (pending3 != null) {
                KeyInfo next = pending3.getNext(key, objectKey);
                if (!z2 && next != null) {
                    pending3.recordUsed(next);
                    int location = next.getLocation();
                    this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                    int slotPositionOf = pending3.slotPositionOf(next);
                    int groupIndex = slotPositionOf - pending3.getGroupIndex();
                    pending3.registerMoveSlot(slotPositionOf, pending3.getGroupIndex());
                    this.changeListWriter.moveReaderRelativeTo(location);
                    this.reader.reposition(location);
                    if (groupIndex > 0) {
                        this.changeListWriter.moveCurrentGroup(groupIndex);
                    }
                    startReaderGroup(z, data);
                } else {
                    this.reader.beginEmpty();
                    this.inserting = true;
                    this.providerCache = null;
                    ensureWriter();
                    this.writer.beginInsert();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z) {
                        this.writer.startNode(key, Composer.INSTANCE.getEmpty());
                    } else if (data != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (obj == null) {
                            obj = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter3.startData(key, obj, data);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (obj == null) {
                            obj = Composer.INSTANCE.getEmpty();
                        }
                        slotWriter4.startGroup(key, obj);
                    }
                    this.insertAnchor = this.writer.anchor(currentGroup2);
                    KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                    pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                    pending3.recordUsed(keyInfo2);
                    pending = new Pending(new ArrayList(), z ? 0 : this.nodeIndex);
                }
            }
            enterGroup(z, pending);
            return;
        }
        this.compositeKeyHashCode = rotateLeft;
        if (obj == null) {
        }
        GroupKind.Companion companion2 = GroupKind.INSTANCE;
        if (kind == companion2.m1105getGroupULZAiWs()) {
        }
        Pending pending4 = null;
        if (!getInserting()) {
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        Stack.m1144pushimpl(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.push(this.groupNodeCount);
        this.parentStateStack.push(this.rGroupIndex);
        this.parentStateStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pending = (Pending) Stack.m1143popimpl(this.pendingStack);
        if (pending != null && !inserting) {
            pending.setGroupIndex(pending.getGroupIndex() + 1);
        }
        this.pending = pending;
        this.nodeIndex = this.parentStateStack.pop() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.pop();
        this.groupNodeCount = this.parentStateStack.pop() + expectedNodeCount;
    }

    private final void end(boolean isNode) {
        long rotateRight;
        long j;
        int remainingSlots;
        Set set;
        List list;
        long rotateRight2;
        long j2;
        int peek2 = this.parentStateStack.peek2() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int groupKey = this.writer.groupKey(parent);
            Object groupObjectKey = this.writer.groupObjectKey(parent);
            Object groupAux = this.writer.groupAux(parent);
            if (groupObjectKey != null) {
                int ordinal = groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode();
                rotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ 0, 3);
                j2 = ordinal;
            } else if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
                rotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                j2 = groupKey;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(groupAux.hashCode() ^ Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int groupKey2 = this.reader.groupKey(parent2);
            Object groupObjectKey2 = this.reader.groupObjectKey(parent2);
            Object groupAux2 = this.reader.groupAux(parent2);
            if (groupObjectKey2 != null) {
                int ordinal2 = groupObjectKey2 instanceof Enum ? ((Enum) groupObjectKey2).ordinal() : groupObjectKey2.hashCode();
                rotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ 0, 3);
                j = ordinal2;
            } else if (groupAux2 == null || groupKey2 != 207 || Intrinsics.areEqual(groupAux2, Composer.INSTANCE.getEmpty())) {
                rotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3);
                j = groupKey2;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(groupAux2.hashCode() ^ Long.rotateRight(getCompositeKeyHashCode() ^ peek2, 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        Pending pending = this.pending;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List keyInfos = pending.getKeyInfos();
            List usedKeys = pending.getUsedKeys();
            Set fastToSet = ListUtilsKt.fastToSet(usedKeys);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = usedKeys.size();
            int size2 = keyInfos.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size2) {
                KeyInfo keyInfo = (KeyInfo) keyInfos.get(i2);
                if (fastToSet.contains(keyInfo)) {
                    set = fastToSet;
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i3 < size) {
                            KeyInfo keyInfo2 = (KeyInfo) usedKeys.get(i3);
                            if (keyInfo2 != keyInfo) {
                                int nodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (nodePositionOf != i4) {
                                    int updatedNodeCountOf = pending.updatedNodeCountOf(keyInfo2);
                                    list = usedKeys;
                                    this.changeListWriter.moveNode(pending.getStartIndex() + nodePositionOf, i4 + pending.getStartIndex(), updatedNodeCountOf);
                                    pending.registerMoveNode(nodePositionOf, i4, updatedNodeCountOf);
                                } else {
                                    list = usedKeys;
                                }
                            } else {
                                list = usedKeys;
                                i2++;
                            }
                            i3++;
                            i4 += pending.updatedNodeCountOf(keyInfo2);
                            fastToSet = set;
                            usedKeys = list;
                        }
                        fastToSet = set;
                    }
                } else {
                    this.changeListWriter.removeNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), 0);
                    this.changeListWriter.moveReaderRelativeTo(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    set = fastToSet;
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i2++;
                fastToSet = set;
            }
            this.changeListWriter.endNodeMovement();
            if (keyInfos.size() > 0) {
                this.changeListWriter.moveReaderRelativeTo(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (remainingSlots = this.reader.getRemainingSlots()) > 0) {
            this.changeListWriter.trimValues(remainingSlots);
        }
        int i5 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int current = this.reader.getCurrent();
            recordDelete();
            this.changeListWriter.removeNode(i5, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.endNodeInsert();
                i = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int insertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close(true);
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(insertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(insertedGroupVirtualIndex, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.moveUp();
            }
            this.changeListWriter.endCurrentGroup();
            int parent4 = this.reader.getParent();
            if (i != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.endGroup();
            this.changeListWriter.endNodeMovement();
        }
        exitGroup(i, inserting);
    }

    private final void recomposeToGroupEnd() {
        Invalidation firstInRange;
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int groupSize = this.reader.groupSize(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), groupSize);
        boolean z2 = false;
        int i4 = parent;
        while (firstInRange != null) {
            int location = firstInRange.getLocation();
            RecomposeScopeImpl scope = firstInRange.getScope();
            ComposerKt.removeLocation(this.invalidations, location);
            if (firstInRange.isInvalid()) {
                this.reader.reposition(location);
                int current = this.reader.getCurrent();
                recordUpsAndDowns(i4, current, parent);
                this.nodeIndex = nodeIndexOf(location, current, parent, i);
                this.rGroupIndex = rGroupIndexOf(current);
                this.compositeKeyHashCode = compositeKeyOf(this.reader.parent(current), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                z2 = true;
                i4 = current;
            } else {
                Stack.m1144pushimpl(this.invalidateStack, scope);
                CompositionObserver current2 = this.observerHolder.current();
                if (current2 != null) {
                    try {
                        current2.onScopeEnter(scope);
                        scope.rereadTrackedInstances();
                    } finally {
                        current2.onScopeExit(scope);
                    }
                } else {
                    scope.rereadTrackedInstances();
                }
                Stack.m1143popimpl(this.invalidateStack);
            }
            firstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), groupSize);
        }
        if (z2) {
            recordUpsAndDowns(i4, parent, parent);
            this.reader.skipToGroupEnd();
            int updatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i + updatedNodeCount;
            this.groupNodeCount = i2 + updatedNodeCount;
            this.rGroupIndex = i3;
        } else {
            skipReaderToGroupEnd();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = z;
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int updatedNodeCount = updatedNodeCount(group);
        if (updatedNodeCount != newCount) {
            int i = newCount - updatedNodeCount;
            int m1137getSizeimpl = Stack.m1137getSizeimpl(this.pendingStack) - 1;
            while (group != -1) {
                int updatedNodeCount2 = updatedNodeCount(group) + i;
                updateNodeCount(group, updatedNodeCount2);
                int i2 = m1137getSizeimpl;
                while (true) {
                    if (-1 < i2) {
                        Pending pending = (Pending) Stack.m1142peekimpl(this.pendingStack, i2);
                        if (pending != null && pending.updateNodeCount(group, updatedNodeCount2)) {
                            m1137getSizeimpl = i2 - 1;
                            break;
                        }
                        i2--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int parent = this.reader.parent(group);
        while (parent != recomposeGroup && !this.reader.isNode(parent)) {
            parent = this.reader.parent(parent);
        }
        if (this.reader.isNode(parent)) {
            recomposeIndex = 0;
        }
        if (parent == group) {
            return recomposeIndex;
        }
        int updatedNodeCount = (updatedNodeCount(parent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < updatedNodeCount && parent != groupLocation) {
            parent++;
            while (parent < groupLocation) {
                int groupSize = this.reader.groupSize(parent) + parent;
                if (groupLocation >= groupSize) {
                    recomposeIndex += this.reader.isNode(parent) ? 1 : updatedNodeCount(parent);
                    parent = groupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final int rGroupIndexOf(int group) {
        int parent = this.reader.parent(group) + 1;
        int i = 0;
        while (parent < group) {
            if (!this.reader.hasObjectKey(parent)) {
                i++;
            }
            parent += this.reader.groupSize(parent);
        }
        return i;
    }

    private final int updatedNodeCount(int group) {
        int i;
        if (group < 0) {
            MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
            if (mutableIntIntMap == null || !mutableIntIntMap.containsKey(group)) {
                return 0;
            }
            return mutableIntIntMap.get(group);
        }
        int[] iArr = this.nodeCountOverrides;
        return (iArr == null || (i = iArr[group]) < 0) ? this.reader.nodeCount(group) : i;
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                MutableIntIntMap mutableIntIntMap = this.nodeCountVirtualOverrides;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap(0, 1, null);
                    this.nodeCountVirtualOverrides = mutableIntIntMap;
                }
                mutableIntIntMap.set(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                iArr = new int[this.reader.getGroupsSize()];
                ArraysKt.fill$default(iArr, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr;
            }
            iArr[group] = count;
        }
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        int nearestCommonRootOf;
        SlotReader slotReader = this.reader;
        nearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != nearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                this.changeListWriter.moveUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, nearestCommonRootOf);
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            this.changeListWriter.moveDown(nodeAt(this.reader, group));
        }
    }

    private final int groupCompositeKeyPart(SlotReader slotReader, int i) {
        Object groupAux;
        if (slotReader.hasObjectKey(i)) {
            Object groupObjectKey = slotReader.groupObjectKey(i);
            if (groupObjectKey == null) {
                return 0;
            }
            if (groupObjectKey instanceof Enum) {
                return ((Enum) groupObjectKey).ordinal();
            }
            if (groupObjectKey instanceof MovableContent) {
                return 126665345;
            }
            return groupObjectKey.hashCode();
        }
        int groupKey = slotReader.groupKey(i);
        if (groupKey == 207 && (groupAux = slotReader.groupAux(i)) != null && !Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
            groupKey = groupAux.hashCode();
        }
        return groupKey;
    }

    public final boolean tryImminentInvalidation$runtime(RecomposeScopeImpl scope, Object instance) {
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.reader.getTable());
        if (!this.isComposing || indexFor < this.reader.getCurrent()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void skipCurrentGroup() {
        long rotateLeft;
        long j;
        long rotateRight;
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        int i = this.rGroupIndex;
        if (groupObjectKey != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode()), 3);
            j = 0;
        } else if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupKey, 3);
            j = i;
        } else {
            this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ groupAux.hashCode(), 3) ^ i;
            startReaderGroup(slotReader.isNode(), null);
            recomposeToGroupEnd();
            slotReader.endGroup();
            if (groupObjectKey == null) {
                rotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ 0, 3) ^ (groupObjectKey instanceof Enum ? ((Enum) groupObjectKey).ordinal() : groupObjectKey.hashCode());
            } else if (groupAux == null || groupKey != 207 || Intrinsics.areEqual(groupAux, Composer.INSTANCE.getEmpty())) {
                rotateRight = groupKey ^ Long.rotateRight(getCompositeKeyHashCode() ^ i, 3);
            } else {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ i, 3) ^ groupAux.hashCode(), 3);
                return;
            }
            this.compositeKeyHashCode = Long.rotateRight(rotateRight, 3);
        }
        this.compositeKeyHashCode = rotateLeft ^ j;
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        if (groupObjectKey == null) {
        }
        this.compositeKeyHashCode = Long.rotateRight(rotateRight, 3);
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public boolean shouldExecute(boolean parametersChanged, int flags) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if ((flags & 1) != 0 || (!getInserting() && !this.reusing)) {
            return parametersChanged || !getSkipping();
        }
        ShouldPauseCallback shouldPauseCallback = this.shouldPauseCallback;
        if (shouldPauseCallback == null || (currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime()) == null || !shouldPauseCallback.shouldPause()) {
            return true;
        }
        currentRecomposeScope$runtime.setUsed(true);
        currentRecomposeScope$runtime.setReusing(this.reusing);
        currentRecomposeScope$runtime.setPaused(true);
        this.changeListWriter.rememberPausingScope(currentRecomposeScope$runtime);
        this.parentContext.reportPausedScope$runtime(currentRecomposeScope$runtime);
        return false;
    }

    @Override // androidx.compose.runtime.Composer
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        RecomposeScopeImpl currentRecomposeScope$runtime = getCurrentRecomposeScope$runtime();
        if (currentRecomposeScope$runtime != null) {
            currentRecomposeScope$runtime.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void deactivateToEndGroup(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            skipReaderToGroupEnd();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        this.changeListWriter.deactivateCurrentGroup();
        ComposerKt.removeRange(this.invalidations, current, end);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public Composer startRestartGroup(int key) {
        startReplaceGroup(key);
        addRecomposeScope();
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void addRecomposeScope() {
        Invalidation removeLocation;
        RecomposeScopeImpl recomposeScopeImpl;
        boolean z;
        if (!getInserting()) {
            removeLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
            Object next = this.reader.next();
            if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
                CompositionImpl composition = getComposition();
                Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl(composition);
                updateValue(recomposeScopeImpl);
            } else {
                Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) next;
            }
            if (removeLocation == null) {
                boolean forcedRecompose = recomposeScopeImpl.getForcedRecompose();
                if (forcedRecompose) {
                    recomposeScopeImpl.setForcedRecompose(false);
                }
                if (!forcedRecompose) {
                    z = false;
                    recomposeScopeImpl.setRequiresRecompose(z);
                    Stack.m1144pushimpl(this.invalidateStack, recomposeScopeImpl);
                    enterRecomposeScope(recomposeScopeImpl);
                    if (recomposeScopeImpl.getPaused()) {
                        return;
                    }
                    recomposeScopeImpl.setPaused(false);
                    recomposeScopeImpl.setResuming(true);
                    this.changeListWriter.startResumingScope(recomposeScopeImpl);
                    if (this.reusing || !recomposeScopeImpl.getReusing()) {
                        return;
                    }
                    this.reusing = true;
                    recomposeScopeImpl.setResetReusing(true);
                    return;
                }
            }
            z = true;
            recomposeScopeImpl.setRequiresRecompose(z);
            Stack.m1144pushimpl(this.invalidateStack, recomposeScopeImpl);
            enterRecomposeScope(recomposeScopeImpl);
            if (recomposeScopeImpl.getPaused()) {
            }
        } else {
            CompositionImpl composition2 = getComposition();
            Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl(composition2);
            Stack.m1144pushimpl(this.invalidateStack, recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            enterRecomposeScope(recomposeScopeImpl2);
        }
    }

    private final void enterRecomposeScope(RecomposeScopeImpl scope) {
        scope.start(this.compositionToken);
        CompositionObserver current = this.observerHolder.current();
        if (current != null) {
            current.onScopeEnter(scope);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImpl2 = Stack.m1140isNotEmptyimpl(this.invalidateStack) ? (RecomposeScopeImpl) Stack.m1143popimpl(this.invalidateStack) : null;
        if (recomposeScopeImpl2 != null) {
            recomposeScopeImpl2.setRequiresRecompose(false);
            Function1 exitRecomposeScope = exitRecomposeScope(recomposeScopeImpl2);
            if (exitRecomposeScope != null) {
                this.changeListWriter.endCompositionScope(exitRecomposeScope, getComposition());
            }
            if (recomposeScopeImpl2.getResuming()) {
                recomposeScopeImpl2.setResuming(false);
                this.changeListWriter.endResumingScope(recomposeScopeImpl2);
                recomposeScopeImpl2.setReusing(false);
                if (recomposeScopeImpl2.getResetReusing()) {
                    recomposeScopeImpl2.setResetReusing(false);
                    this.reusing = false;
                }
            }
        }
        if (recomposeScopeImpl2 != null && !recomposeScopeImpl2.getSkipped$runtime() && (recomposeScopeImpl2.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImpl2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImpl2.setAnchor(anchor);
            }
            recomposeScopeImpl2.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImpl2;
        }
        end(false);
        return recomposeScopeImpl;
    }

    private final Function1 exitRecomposeScope(RecomposeScopeImpl scope) {
        CompositionObserver current = this.observerHolder.current();
        if (current != null) {
            current.onScopeExit(scope);
        }
        return scope.end(this.compositionToken);
    }

    @Override // androidx.compose.runtime.Composer
    public void insertMovableContent(MovableContent value, Object parameter) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        recordProviderUpdate(r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void invokeMovableContentLambda(final MovableContent content, PersistentCompositionLocalMap locals, final Object parameter, boolean force) {
        startMovableGroup(126665345, content);
        updateSlot(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            boolean z = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), locals)) {
                z = true;
            }
            m1092startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1105getGroupULZAiWs(), locals);
            this.providerCache = null;
            if (getInserting() && !force) {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope(), null));
            } else {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                Expect_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(316014703, true, new Function2() { // from class: androidx.compose.runtime.ComposerImpl$invokeMovableContentLambda$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
                        }
                        MovableContent.this.getContent().invoke(parameter, composer, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z2;
            }
        } catch (Throwable th) {
            try {
                throw ComposeStackTraceKt.attachComposeStackTrace(th, new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public final Object mo4828invoke() {
                        List currentStackTrace;
                        currentStackTrace = ComposerImpl.this.currentStackTrace();
                        return currentStackTrace;
                    }
                });
            } finally {
                endGroup();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                endMovableGroup();
            }
        }
    }

    public void insertMovableContentReferences(List references) {
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th) {
            abortRoot();
            throw th;
        }
    }

    private final void insertMovableContentGuarded(List references) {
        ComposerChangeListWriter composerChangeListWriter;
        ChangeList changeList;
        ComposerChangeListWriter composerChangeListWriter2;
        ChangeList changeList2;
        SlotTable slotTable;
        Anchor anchor;
        List collectNodesFrom;
        SlotReader slotReader;
        MutableIntObjectMap mutableIntObjectMap;
        int[] iArr;
        ComposerChangeListWriter composerChangeListWriter3;
        ChangeList changeList3;
        int i;
        ControlledComposition composition;
        ControlledComposition composition2;
        Integer valueOf;
        int i2;
        SlotTable slotTable2;
        SlotReader slotReader2;
        List list = references;
        int i3 = 1;
        ComposerChangeListWriter composerChangeListWriter4 = this.changeListWriter;
        ChangeList changeList4 = this.lateChanges;
        ChangeList changeList5 = composerChangeListWriter4.getChangeList();
        try {
            composerChangeListWriter4.setChangeList(changeList4);
            this.changeListWriter.resetSlots();
            int size = list.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                try {
                    Pair pair = (Pair) list.get(i5);
                    final MovableContentStateReference movableContentStateReference = (MovableContentStateReference) pair.component1();
                    MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component2();
                    Anchor anchor2 = movableContentStateReference.getAnchor();
                    int anchorIndex = movableContentStateReference.getSlotTable().anchorIndex(anchor2);
                    IntRef intRef = new IntRef(i4, i3, null);
                    this.changeListWriter.determineMovableContentNodeIndex(intRef, anchor2);
                    if (movableContentStateReference2 == null) {
                        if (Intrinsics.areEqual(movableContentStateReference.getSlotTable(), this.insertTable)) {
                            createFreshInsertTable();
                        }
                        final SlotReader openReader = movableContentStateReference.getSlotTable().openReader();
                        try {
                            openReader.reposition(anchorIndex);
                            this.changeListWriter.moveReaderToAbsolute(anchorIndex);
                            final ChangeList changeList6 = new ChangeList();
                            slotReader2 = openReader;
                            try {
                                recomposeMovableContent$default(this, null, null, null, null, new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    /* renamed from: invoke */
                                    public final Object mo4828invoke() {
                                        Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33;
                                        insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33 = ComposerImpl.insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33(ComposerImpl.this, changeList6, openReader, movableContentStateReference);
                                        return insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33;
                                    }
                                }, 15, null);
                                this.changeListWriter.includeOperationsIn(changeList6, intRef);
                                Unit unit = Unit.INSTANCE;
                                slotReader2.close();
                                composerChangeListWriter2 = composerChangeListWriter4;
                                changeList2 = changeList5;
                                i = size;
                                i2 = i5;
                            } catch (Throwable th) {
                                th = th;
                                slotReader2.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            slotReader2 = openReader;
                        }
                    } else {
                        MovableContentState movableContentStateResolve$runtime = this.parentContext.movableContentStateResolve$runtime(movableContentStateReference2);
                        if (movableContentStateResolve$runtime == null || (slotTable = movableContentStateResolve$runtime.getSlotTable()) == null) {
                            slotTable = movableContentStateReference2.getSlotTable();
                        }
                        if (movableContentStateResolve$runtime == null || (slotTable2 = movableContentStateResolve$runtime.getSlotTable()) == null || (anchor = slotTable2.anchor(0)) == null) {
                            anchor = movableContentStateReference2.getAnchor();
                        }
                        collectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                        if (!collectNodesFrom.isEmpty()) {
                            this.changeListWriter.copyNodesToNewAnchorLocation(collectNodesFrom, intRef);
                            if (Intrinsics.areEqual(movableContentStateReference.getSlotTable(), this.slotTable)) {
                                int anchorIndex2 = this.slotTable.anchorIndex(anchor2);
                                updateNodeCount(anchorIndex2, updatedNodeCount(anchorIndex2) + collectNodesFrom.size());
                            }
                        }
                        this.changeListWriter.copySlotTableToAnchorLocation(movableContentStateResolve$runtime, this.parentContext, movableContentStateReference2, movableContentStateReference);
                        SlotReader openReader2 = slotTable.openReader();
                        try {
                            SlotReader slotReader3 = this.reader;
                            int[] iArr2 = this.nodeCountOverrides;
                            MutableIntObjectMap mutableIntObjectMap2 = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = openReader2;
                                int anchorIndex3 = slotTable.anchorIndex(anchor);
                                openReader2.reposition(anchorIndex3);
                                this.changeListWriter.moveReaderToAbsolute(anchorIndex3);
                                ChangeList changeList7 = new ChangeList();
                                ComposerChangeListWriter composerChangeListWriter5 = this.changeListWriter;
                                ChangeList changeList8 = composerChangeListWriter5.getChangeList();
                                try {
                                    composerChangeListWriter5.setChangeList(changeList7);
                                    i = size;
                                    ComposerChangeListWriter composerChangeListWriter6 = this.changeListWriter;
                                    composerChangeListWriter2 = composerChangeListWriter4;
                                    try {
                                        boolean implicitRootStart = composerChangeListWriter6.getImplicitRootStart();
                                        try {
                                            composerChangeListWriter6.setImplicitRootStart(false);
                                            movableContentStateReference2.transferPendingInvalidations$runtime();
                                            composition = movableContentStateReference2.getComposition();
                                            composition2 = movableContentStateReference.getComposition();
                                            valueOf = Integer.valueOf(openReader2.getCurrent());
                                            changeList2 = changeList5;
                                            changeList3 = changeList8;
                                            i2 = i5;
                                            slotReader = openReader2;
                                            iArr = iArr2;
                                            composerChangeListWriter3 = composerChangeListWriter5;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            composerChangeListWriter3 = composerChangeListWriter5;
                                            slotReader = openReader2;
                                            changeList3 = changeList8;
                                            iArr = iArr2;
                                        }
                                        try {
                                            recomposeMovableContent(composition, composition2, valueOf, movableContentStateReference2.getInvalidations(), new Function0() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                /* renamed from: invoke */
                                                public final Object mo4828invoke() {
                                                    Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35;
                                                    insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35 = ComposerImpl.insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(ComposerImpl.this, movableContentStateReference);
                                                    return insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35;
                                                }
                                            });
                                            try {
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                try {
                                                    composerChangeListWriter3.setChangeList(changeList3);
                                                    this.changeListWriter.includeOperationsIn(changeList7, intRef);
                                                    Unit unit2 = Unit.INSTANCE;
                                                    try {
                                                        this.reader = slotReader3;
                                                        this.nodeCountOverrides = iArr;
                                                        this.providerUpdates = mutableIntObjectMap2;
                                                        try {
                                                            slotReader.close();
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            composerChangeListWriter = composerChangeListWriter2;
                                                            changeList = changeList2;
                                                            composerChangeListWriter.setChangeList(changeList);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        slotReader.close();
                                                        throw th;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    mutableIntObjectMap = mutableIntObjectMap2;
                                                    this.reader = slotReader3;
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = mutableIntObjectMap;
                                                    throw th;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                mutableIntObjectMap = mutableIntObjectMap2;
                                                try {
                                                    composerChangeListWriter3.setChangeList(changeList3);
                                                    throw th;
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    this.reader = slotReader3;
                                                    this.nodeCountOverrides = iArr;
                                                    this.providerUpdates = mutableIntObjectMap;
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            mutableIntObjectMap = mutableIntObjectMap2;
                                            try {
                                                composerChangeListWriter6.setImplicitRootStart(implicitRootStart);
                                                throw th;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                composerChangeListWriter3.setChangeList(changeList3);
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        mutableIntObjectMap = mutableIntObjectMap2;
                                        composerChangeListWriter3 = composerChangeListWriter5;
                                        slotReader = openReader2;
                                        changeList3 = changeList8;
                                        iArr = iArr2;
                                        composerChangeListWriter3.setChangeList(changeList3);
                                        throw th;
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                    mutableIntObjectMap = mutableIntObjectMap2;
                                    composerChangeListWriter3 = composerChangeListWriter5;
                                    slotReader = openReader2;
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                mutableIntObjectMap = mutableIntObjectMap2;
                                slotReader = openReader2;
                                iArr = iArr2;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            slotReader = openReader2;
                        }
                    }
                    this.changeListWriter.skipToEndOfCurrentGroup();
                    i5 = i2 + 1;
                    list = references;
                    i3 = 1;
                    size = i;
                    composerChangeListWriter4 = composerChangeListWriter2;
                    changeList5 = changeList2;
                    i4 = 0;
                } catch (Throwable th15) {
                    th = th15;
                    composerChangeListWriter2 = composerChangeListWriter4;
                    changeList2 = changeList5;
                }
            }
            ComposerChangeListWriter composerChangeListWriter7 = composerChangeListWriter4;
            ChangeList changeList9 = changeList5;
            this.changeListWriter.endMovableContentPlacement();
            this.changeListWriter.moveReaderToAbsolute(0);
            composerChangeListWriter7.setChangeList(changeList9);
        } catch (Throwable th16) {
            th = th16;
            composerChangeListWriter = composerChangeListWriter4;
            changeList = changeList5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$34$lambda$33(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        ComposerChangeListWriter composerChangeListWriter = composerImpl.changeListWriter;
        ChangeList changeList2 = composerChangeListWriter.getChangeList();
        try {
            composerChangeListWriter.setChangeList(changeList);
            SlotReader slotReader2 = composerImpl.reader;
            int[] iArr = composerImpl.nodeCountOverrides;
            MutableIntObjectMap mutableIntObjectMap = composerImpl.providerUpdates;
            composerImpl.nodeCountOverrides = null;
            composerImpl.providerUpdates = null;
            try {
                composerImpl.reader = slotReader;
                ComposerChangeListWriter composerChangeListWriter2 = composerImpl.changeListWriter;
                boolean implicitRootStart = composerChangeListWriter2.getImplicitRootStart();
                try {
                    composerChangeListWriter2.setImplicitRootStart(false);
                    composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    Unit unit = Unit.INSTANCE;
                    composerChangeListWriter.setChangeList(changeList2);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    composerChangeListWriter2.setImplicitRootStart(implicitRootStart);
                    throw th;
                }
            } finally {
                composerImpl.reader = slotReader2;
                composerImpl.nodeCountOverrides = iArr;
                composerImpl.providerUpdates = mutableIntObjectMap;
            }
        } catch (Throwable th2) {
            composerChangeListWriter.setChangeList(changeList2);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit insertMovableContentGuarded$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36$lambda$35(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent(), movableContentStateReference.getLocals(), movableContentStateReference.getParameter(), true);
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i, Object obj) {
        ControlledComposition controlledComposition3 = (i & 1) != 0 ? null : controlledComposition;
        ControlledComposition controlledComposition4 = (i & 2) != 0 ? null : controlledComposition2;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition3, controlledComposition4, num2, list, function0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List invalidations, Function0 block) {
        Object mo4828invoke;
        boolean z = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair pair = (Pair) invalidations.get(i2);
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) pair.component1();
                Object component2 = pair.component2();
                if (component2 != null) {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, component2);
                } else {
                    tryImminentInvalidation$runtime(recomposeScopeImpl, null);
                }
            }
            if (from != null) {
                mo4828invoke = from.delegateInvalidations(to, index != null ? index.intValue() : -1, block);
            }
            mo4828invoke = block.mo4828invoke();
            this.isComposing = z;
            this.nodeIndex = i;
            return mo4828invoke;
        } catch (Throwable th) {
            this.isComposing = z;
            this.nodeIndex = i;
            throw th;
        }
    }

    public final List stackTraceForValue$runtime(final Object value) {
        List plus;
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        ObjectLocation findLocation = ComposeStackTraceBuilderKt.findLocation(this.slotTable, new Function1() { // from class: androidx.compose.runtime.ComposerImpl$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean stackTraceForValue$lambda$43;
                stackTraceForValue$lambda$43 = ComposerImpl.stackTraceForValue$lambda$43(value, obj);
                return Boolean.valueOf(stackTraceForValue$lambda$43);
            }
        });
        return (findLocation == null || (plus = CollectionsKt.plus((Collection) stackTraceForGroup(findLocation.getGroup(), findLocation.getDataOffset()), (Iterable) parentStackTrace())) == null) ? CollectionsKt.emptyList() : plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean stackTraceForValue$lambda$43(Object obj, Object obj2) {
        if (obj2 != obj) {
            RememberObserverHolder rememberObserverHolder = obj2 instanceof RememberObserverHolder ? (RememberObserverHolder) obj2 : null;
            if ((rememberObserverHolder != null ? rememberObserverHolder.getWrapped() : null) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List currentStackTrace() {
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ComposeStackTraceBuilderKt.buildTrace$default(this.writer, null, 0, null, 7, null));
        arrayList.addAll(ComposeStackTraceBuilderKt.buildTrace(this.reader));
        arrayList.addAll(parentStackTrace());
        return arrayList;
    }

    private final List stackTraceForGroup(int group, Integer dataOffset) {
        if (!this.sourceMarkersEnabled) {
            return CollectionsKt.emptyList();
        }
        SlotReader openReader = this.slotTable.openReader();
        try {
            return ComposeStackTraceBuilderKt.traceForGroup(openReader, group, dataOffset);
        } finally {
            openReader.close();
        }
    }

    public final List parentStackTrace() {
        Composition composition$runtime = this.parentContext.getComposition$runtime();
        CompositionImpl compositionImpl = composition$runtime instanceof CompositionImpl ? (CompositionImpl) composition$runtime : null;
        if (compositionImpl == null) {
            return CollectionsKt.emptyList();
        }
        Integer findSubcompositionContextGroup = ComposeStackTraceBuilderKt.findSubcompositionContextGroup(compositionImpl.getSlotTable(), this.parentContext);
        if (findSubcompositionContextGroup != null) {
            SlotReader openReader = compositionImpl.getSlotTable().openReader();
            try {
                return ComposeStackTraceBuilderKt.traceForGroup(openReader, findSubcompositionContextGroup.intValue(), 0);
            } finally {
                openReader.close();
            }
        }
        return CollectionsKt.emptyList();
    }

    /* renamed from: composeContent--ZbOJvo$runtime, reason: not valid java name */
    public final void m1093composeContentZbOJvo$runtime(MutableScatterMap invalidationsRequested, Function2 content, ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m1091doComposeaFTiNEg(invalidationsRequested, content);
        } finally {
            this.shouldPauseCallback = null;
        }
    }

    public final void prepareCompose$runtime(Function0 block) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.mo4828invoke();
        } finally {
            this.isComposing = false;
        }
    }

    /* renamed from: recompose-aFTiNEg$runtime, reason: not valid java name */
    public final boolean m1094recomposeaFTiNEg$runtime(MutableScatterMap invalidationsRequested, ShouldPauseCallback shouldPause) {
        if (!this.changes.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Expected applyChanges() to have been called");
        }
        if (ScopeMap.m1194getSizeimpl(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        this.shouldPauseCallback = shouldPause;
        try {
            m1091doComposeaFTiNEg(invalidationsRequested, null);
            this.shouldPauseCallback = null;
            return this.changes.isNotEmpty();
        } catch (Throwable th) {
            this.shouldPauseCallback = null;
            throw th;
        }
    }

    /* renamed from: updateComposerInvalidations-RY85e9Y, reason: not valid java name */
    public final void m1095updateComposerInvalidationsRY85e9Y(MutableScatterMap invalidationsRequested) {
        Comparator comparator;
        for (int lastIndex = CollectionsKt.getLastIndex(this.invalidations); -1 < lastIndex; lastIndex--) {
            Invalidation invalidation = (Invalidation) this.invalidations.get(lastIndex);
            Anchor anchor = invalidation.getScope().getAnchor();
            if (anchor != null && anchor.getValid()) {
                if (invalidation.getLocation() != anchor.getLocation()) {
                    invalidation.setLocation(anchor.getLocation());
                }
            } else {
                this.invalidations.remove(lastIndex);
            }
        }
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                            Anchor anchor2 = recomposeScopeImpl.getAnchor();
                            if (anchor2 != null) {
                                int location = anchor2.getLocation();
                                List list = this.invalidations;
                                if (obj2 == ScopeInvalidated.INSTANCE) {
                                    obj2 = null;
                                }
                                list.add(new Invalidation(recomposeScopeImpl, location, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        List list2 = this.invalidations;
        comparator = ComposerKt.InvalidationLocationAscending;
        CollectionsKt.sortWith(list2, comparator);
    }

    /* renamed from: doCompose-aFTiNEg, reason: not valid java name */
    private final void m1091doComposeaFTiNEg(MutableScatterMap invalidationsRequested, Function2 content) {
        if (this.isComposing) {
            ComposerKt.composeImmediateRuntimeError("Reentrant composition is not supported");
        }
        CompositionObserver current = this.observerHolder.current();
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(SnapshotKt.currentSnapshot().getSnapshotId());
            this.providerUpdates = null;
            m1095updateComposerInvalidationsRY85e9Y(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            if (current != null) {
                current.onBeginComposition(getComposition());
            }
            try {
                startRoot();
                Object nextSlot = nextSlot();
                if (nextSlot != content && content != null) {
                    Function2 function2 = content;
                    updateValue(content);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.derivedStateObserver;
                MutableVector derivedStateObservers = SnapshotStateKt.derivedStateObservers();
                try {
                    derivedStateObservers.add(composerImpl$derivedStateObserver$1);
                    if (content != null) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, content);
                        endGroup();
                    } else if ((this.forciblyRecompose || this.providersInvalid) && nextSlot != null && !Intrinsics.areEqual(nextSlot, Composer.INSTANCE.getEmpty())) {
                        startGroup(200, ComposerKt.getInvocation());
                        Expect_jvmKt.invokeComposable(this, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(nextSlot, 2));
                        endGroup();
                    } else {
                        skipCurrentGroup();
                    }
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    endRoot();
                    if (current != null) {
                        current.onEndComposition(getComposition());
                    }
                    this.isComposing = false;
                    this.invalidations.clear();
                    createFreshInsertTable();
                    Unit unit = Unit.INSTANCE;
                    trace.endSection(beginSection);
                } catch (Throwable th) {
                    derivedStateObservers.removeAt(derivedStateObservers.getSize() - 1);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(beginSection);
            throw th2;
        }
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    private final Object nodeAt(SlotReader slotReader, int i) {
        return slotReader.node(i);
    }

    private final void validateNodeExpected() {
        if (!this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.nodeExpected = false;
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeImmediateRuntimeError("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    private final void recordInsert(Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            this.changeListWriter.insertSlots(anchor, this.insertTable);
        } else {
            this.changeListWriter.insertSlots(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new FixupList();
        }
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrent());
        this.changeListWriter.removeCurrentGroup();
    }

    private static final MovableContentStateReference reportFreeMovableContent$createMovableContentReferenceForGroup(ComposerImpl composerImpl, int i, List list) {
        int findInsertLocation;
        Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
        Intrinsics.checkNotNull(groupObjectKey, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        MovableContent movableContent = (MovableContent) groupObjectKey;
        Object groupGet = composerImpl.reader.groupGet(i, 0);
        Anchor anchor = composerImpl.reader.anchor(i);
        int groupSize = composerImpl.reader.groupSize(i) + i;
        ArrayList arrayList = new ArrayList();
        List list2 = composerImpl.invalidations;
        for (findInsertLocation = ComposerKt.findInsertLocation(list2, i); findInsertLocation < list2.size(); findInsertLocation++) {
            Invalidation invalidation = (Invalidation) list2.get(findInsertLocation);
            if (invalidation.getLocation() >= groupSize) {
                break;
            }
            arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
        }
        return new MovableContentStateReference(movableContent, groupGet, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i), list);
    }

    private static final MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor(ComposerImpl composerImpl, int i) {
        int groupKey = composerImpl.reader.groupKey(i);
        Object groupObjectKey = composerImpl.reader.groupObjectKey(i);
        ArrayList arrayList = null;
        if (groupKey != 126665345 || !(groupObjectKey instanceof MovableContent)) {
            return null;
        }
        if (composerImpl.reader.containsMark(i)) {
            ArrayList arrayList2 = new ArrayList();
            reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return reportFreeMovableContent$createMovableContentReferenceForGroup(composerImpl, i, arrayList);
    }

    private static final void reportFreeMovableContent$movableContentReferenceFor$traverseGroups(ComposerImpl composerImpl, List list, int i) {
        int groupSize = composerImpl.reader.groupSize(i) + i;
        int i2 = i + 1;
        while (i2 < groupSize) {
            if (composerImpl.reader.hasMark(i2)) {
                MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i2);
                if (reportFreeMovableContent$movableContentReferenceFor != null) {
                    list.add(reportFreeMovableContent$movableContentReferenceFor);
                }
            } else if (composerImpl.reader.containsMark(i2)) {
                reportFreeMovableContent$movableContentReferenceFor$traverseGroups(composerImpl, list, i2);
            }
            i2 += composerImpl.reader.groupSize(i2);
        }
    }

    private static final int reportFreeMovableContent$reportGroup(ComposerImpl composerImpl, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = composerImpl.reader;
        if (slotReader.hasMark(i2)) {
            int groupKey = slotReader.groupKey(i2);
            Object groupObjectKey = slotReader.groupObjectKey(i2);
            if (groupKey == 126665345 && (groupObjectKey instanceof MovableContent)) {
                MovableContentStateReference reportFreeMovableContent$movableContentReferenceFor = reportFreeMovableContent$movableContentReferenceFor(composerImpl, i2);
                if (reportFreeMovableContent$movableContentReferenceFor != null) {
                    composerImpl.parentContext.deletedMovableContent$runtime(reportFreeMovableContent$movableContentReferenceFor);
                    composerImpl.changeListWriter.recordSlotEditing();
                    composerImpl.changeListWriter.releaseMovableGroupAtCurrent(composerImpl.getComposition(), composerImpl.parentContext, reportFreeMovableContent$movableContentReferenceFor);
                }
                if (z && i2 != i) {
                    composerImpl.changeListWriter.endNodeMovementAndDeleteNode(i3, i2);
                    return 0;
                }
                return slotReader.nodeCount(i2);
            }
            if (groupKey == 206 && Intrinsics.areEqual(groupObjectKey, ComposerKt.getReference())) {
                Object groupGet = slotReader.groupGet(i2, 0);
                CompositionContextHolder compositionContextHolder = groupGet instanceof CompositionContextHolder ? (CompositionContextHolder) groupGet : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl2 : compositionContextHolder.getRef().getComposers()) {
                        composerImpl2.reportAllMovableContent();
                        composerImpl.parentContext.reportRemovedComposition$runtime(composerImpl2.getComposition());
                    }
                }
                return slotReader.nodeCount(i2);
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return slotReader.nodeCount(i2);
        }
        if (slotReader.containsMark(i2)) {
            int groupSize = slotReader.groupSize(i2) + i2;
            int i4 = 0;
            for (int i5 = i2 + 1; i5 < groupSize; i5 += slotReader.groupSize(i5)) {
                boolean isNode = slotReader.isNode(i5);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveDown(slotReader.node(i5));
                }
                i4 += reportFreeMovableContent$reportGroup(composerImpl, i, i5, isNode || z, isNode ? 0 : i3 + i4);
                if (isNode) {
                    composerImpl.changeListWriter.endNodeMovement();
                    composerImpl.changeListWriter.moveUp();
                }
            }
            if (slotReader.isNode(i2)) {
                return 1;
            }
            return i4;
        }
        if (slotReader.isNode(i2)) {
            return 1;
        }
        return slotReader.nodeCount(i2);
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        boolean isNode = this.reader.isNode(groupBeingRemoved);
        if (isNode) {
            this.changeListWriter.endNodeMovement();
            this.changeListWriter.moveDown(this.reader.node(groupBeingRemoved));
        }
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, groupBeingRemoved, isNode, 0);
        this.changeListWriter.endNodeMovement();
        if (isNode) {
            this.changeListWriter.moveUp();
        }
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            getComposition().updateMovingInvalidations$runtime();
            ChangeList changeList = new ChangeList();
            this.deferredChanges = changeList;
            SlotReader openReader = this.slotTable.openReader();
            try {
                this.reader = openReader;
                ComposerChangeListWriter composerChangeListWriter = this.changeListWriter;
                ChangeList changeList2 = composerChangeListWriter.getChangeList();
                try {
                    composerChangeListWriter.setChangeList(changeList);
                    reportFreeMovableContent(0);
                    this.changeListWriter.releaseMovableContent();
                    composerChangeListWriter.setChangeList(changeList2);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    composerChangeListWriter.setChangeList(changeList2);
                    throw th;
                }
            } finally {
                openReader.close();
            }
        }
    }

    private final void finalizeCompose() {
        this.changeListWriter.finalizeComposition();
        if (!Stack.m1139isEmptyimpl(this.pendingStack)) {
            ComposerKt.composeImmediateRuntimeError("Start/end imbalance");
        }
        cleanUpCompose();
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.resetTransientState();
        Stack.m1133clearimpl(this.invalidateStack);
        clearUpdatedNodeCounts();
    }

    /* compiled from: Composer.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/ReusableRememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "<init>", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onRemembered", "", "onAbandoned", "onForgotten", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CompositionContextHolder implements ReusableRememberObserver {
        private final CompositionContextImpl ref;

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.ref = compositionContextImpl;
        }

        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010%\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0011\u0010\"\u001a\r\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0002\b!H\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\b&\u0010\u0019J\u000f\u0010+\u001a\u00020(H\u0010¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020(¢\u0006\u0004\b,\u0010-J\u001d\u00103\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0010¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020\fH\u0010¢\u0006\u0004\b4\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0010¢\u0006\u0004\b6\u0010\u000eJ\u0017\u0010<\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020\f2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b=\u0010;J\u0019\u0010B\u001a\u0004\u0018\u00010?2\u0006\u00109\u001a\u000208H\u0010¢\u0006\u0004\b@\u0010AJ+\u0010H\u001a\u00020\f2\u0006\u00109\u001a\u0002082\u0006\u0010C\u001a\u00020?2\n\u0010E\u001a\u0006\u0012\u0002\b\u00030DH\u0010¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0010¢\u0006\u0004\bI\u0010\u0019R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u0006\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bO\u0010PR\u001a\u0010\u0007\u001a\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bQ\u0010PR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bS\u0010TR0\u0010U\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u00102R\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020Z0.8\u0006¢\u0006\f\n\u0004\b[\u0010V\u001a\u0004\b\\\u0010XR+\u0010a\u001a\u00020(2\u0006\u0010]\u001a\u00020(8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b+\u0010*\"\u0004\b`\u0010-R\u0014\u0010c\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bb\u0010PR\u0014\u0010g\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u001a\u0010j\u001a\u00020d8PX\u0090\u0004¢\u0006\f\u0012\u0004\bi\u0010\u000e\u001a\u0004\bh\u0010fR\u0014\u0010\u0017\u001a\u00020k8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006n"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/CompositionObserverHolder;", "observerHolder", "<init>", "(Landroidx/compose/runtime/ComposerImpl;JZZLandroidx/compose/runtime/CompositionObserverHolder;)V", "", "dispose", "()V", "Landroidx/compose/runtime/Composer;", "composer", "registerComposer$runtime", "(Landroidx/compose/runtime/Composer;)V", "registerComposer", "unregisterComposer$runtime", "unregisterComposer", "Landroidx/compose/runtime/ControlledComposition;", "composition", "unregisterComposition$runtime", "(Landroidx/compose/runtime/ControlledComposition;)V", "unregisterComposition", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "invalidate$runtime", "invalidate", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope$runtime", "()Landroidx/compose/runtime/PersistentCompositionLocalMap;", "getCompositionLocalScope", "updateCompositionLocalScope", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;)V", "", "Landroidx/compose/runtime/tooling/CompositionData;", B5.R, "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "startComposing$runtime", "startComposing", "doneComposing$runtime", "doneComposing", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime", "reportRemovedComposition", "J", "getCompositeKeyHashCode$runtime", "()J", "Z", "getCollectingParameterInformation$runtime", "()Z", "getCollectingSourceInformation$runtime", "Landroidx/compose/runtime/CompositionObserverHolder;", "getObserverHolder$runtime", "()Landroidx/compose/runtime/CompositionObserverHolder;", "inspectionTables", "Ljava/util/Set;", "getInspectionTables", "()Ljava/util/Set;", "setInspectionTables", "Landroidx/compose/runtime/ComposerImpl;", "composers", "getComposers", "<set-?>", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "setCompositionLocalScope", "compositionLocalScope", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "getRecomposeCoroutineContext$runtime", "getRecomposeCoroutineContext$runtime$annotations", "recomposeCoroutineContext", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;
        private final boolean collectingSourceInformation;
        private final long compositeKeyHashCode;
        private Set inspectionTables;
        private final CompositionObserverHolder observerHolder;
        private final Set composers = new LinkedHashSet();

        /* renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        private final MutableState compositionLocalScope = SnapshotStateKt.mutableStateOf(PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf(), SnapshotStateKt.referentialEqualityPolicy());

        public CompositionContextImpl(long j, boolean z, boolean z2, CompositionObserverHolder compositionObserverHolder) {
            this.compositeKeyHashCode = j;
            this.collectingParameterInformation = z;
            this.collectingSourceInformation = z2;
            this.observerHolder = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCompositeKeyHashCode$runtime, reason: from getter */
        public long getCompositeKeyHashCode() {
            return this.compositeKeyHashCode;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingParameterInformation$runtime, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getCollectingSourceInformation$runtime, reason: from getter */
        public boolean getCollectingSourceInformation() {
            return this.collectingSourceInformation;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* renamed from: getObserverHolder$runtime, reason: from getter */
        public CompositionObserverHolder getObserverHolder() {
            return this.observerHolder;
        }

        public final Set getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public boolean getCollectingCallByInformation$runtime() {
            return ComposerImpl.this.parentContext.getCollectingCallByInformation$runtime();
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Set) it.next()).remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime(Composer composer) {
            Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
            super.registerComposer$runtime((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime(Composer composer) {
            Set<Set> set = this.inspectionTables;
            if (set != null) {
                for (Set set2 : set) {
                    Intrinsics.checkNotNull(composer, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                    set2.remove(((ComposerImpl) composer).slotTable);
                }
            }
            TypeIntrinsics.asMutableCollection(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime(ControlledComposition composition) {
            ComposerImpl.this.parentContext.unregisterComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportPausedScope$runtime(RecomposeScopeImpl scope) {
            ComposerImpl.this.parentContext.reportPausedScope$runtime(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public CoroutineContext getRecomposeCoroutineContext$runtime() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void composeInitial$runtime(ControlledComposition composition, Function2 content) {
            ComposerImpl.this.parentContext.composeInitial$runtime(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime(ControlledComposition composition) {
            ComposerImpl.this.parentContext.invalidate$runtime(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime(composition);
        }

        private final PersistentCompositionLocalMap getCompositionLocalScope() {
            return (PersistentCompositionLocalMap) this.compositionLocalScope.getValue();
        }

        private final void setCompositionLocalScope(PersistentCompositionLocalMap persistentCompositionLocalMap) {
            this.compositionLocalScope.setValue(persistentCompositionLocalMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public PersistentCompositionLocalMap getCompositionLocalScope$runtime() {
            return getCompositionLocalScope();
        }

        public final void updateCompositionLocalScope(PersistentCompositionLocalMap scope) {
            setCompositionLocalScope(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime(Set table) {
            Set set = this.inspectionTables;
            if (set == null) {
                set = new HashSet();
                this.inspectionTables = set;
            }
            set.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime() {
            ComposerImpl.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime(MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.insertMovableContent$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime(MovableContentStateReference reference) {
            ComposerImpl.this.parentContext.deletedMovableContent$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference reference) {
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime(MovableContentStateReference reference, MovableContentState data, Applier applier) {
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime(reference, data, applier);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void reportRemovedComposition$runtime(ControlledComposition composition) {
            ComposerImpl.this.parentContext.reportRemovedComposition$runtime(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public Composition getComposition$runtime() {
            return ComposerImpl.this.getComposition();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime();
    }

    @Override // androidx.compose.runtime.Composer
    public Object rememberedValue() {
        return nextSlotForCache();
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(Object value) {
        updateCachedValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(RecomposeScope scope) {
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl != null) {
            recomposeScopeImpl.setUsed(true);
        }
    }
}
