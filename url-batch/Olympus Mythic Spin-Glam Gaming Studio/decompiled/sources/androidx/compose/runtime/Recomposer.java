package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import androidx.compose.runtime.tooling.ObservableComposition;
import com.ironsource.B5;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Recomposer.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ø\u00012\u00020\u0001:\nÙ\u0001Ú\u0001Û\u0001Ü\u0001Ø\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010 J \u0010)\u001a\u00020\u00072\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b+\u0010,J:\u00102\u001a\u00020\u00072(\u00101\u001a$\b\u0001\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070/\u0012\u0006\u0012\u0004\u0018\u0001000-H\u0082@¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b4\u0010 J)\u00107\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u000e\u00106\u001a\n\u0012\u0004\u0012\u000200\u0018\u000105H\u0002¢\u0006\u0004\b7\u00108J3\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\f\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00182\u000e\u00106\u001a\n\u0012\u0004\u0012\u000200\u0018\u000105H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0007H\u0002¢\u0006\u0004\b=\u0010\u001dJ#\u0010?\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070>2\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b?\u0010@J3\u0010A\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00070>2\u0006\u0010\u001e\u001a\u00020\u00132\u000e\u00106\u001a\n\u0012\u0004\u0012\u000200\u0018\u000105H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00072\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bG\u0010,J\r\u0010H\u001a\u00020\u0007¢\u0006\u0004\bH\u0010\u001dJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\u001dJ\u0010\u0010J\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bJ\u0010,J*\u0010P\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00132\u0011\u0010M\u001a\r\u0012\u0004\u0012\u00020\u00070K¢\u0006\u0002\bLH\u0010¢\u0006\u0004\bN\u0010OJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010R\u001a\u00020QH\u0010¢\u0006\u0004\bS\u0010TJ\u001d\u0010[\u001a\u00020\u00072\f\u0010X\u001a\b\u0012\u0004\u0012\u00020W0VH\u0010¢\u0006\u0004\bY\u0010ZJ\u0017\u0010]\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\\\u0010 J\u0017\u0010_\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\b^\u0010 J\u0017\u0010c\u001a\u00020\u00072\u0006\u0010`\u001a\u000209H\u0010¢\u0006\u0004\ba\u0010bJ\u0017\u0010e\u001a\u00020\u00072\u0006\u0010`\u001a\u000209H\u0010¢\u0006\u0004\bd\u0010bJ+\u0010l\u001a\u00020\u00072\u0006\u0010`\u001a\u0002092\u0006\u0010g\u001a\u00020f2\n\u0010i\u001a\u0006\u0012\u0002\b\u00030hH\u0010¢\u0006\u0004\bj\u0010kJ\u0017\u0010n\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\bm\u0010 J\u0019\u0010q\u001a\u0004\u0018\u00010f2\u0006\u0010`\u001a\u000209H\u0010¢\u0006\u0004\bo\u0010pR$\u0010t\u001a\u00020r2\u0006\u0010s\u001a\u00020r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0018\u0010|\u001a\u000600j\u0002`{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R!\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0084\u0001R\u001f\u0010\u0086\u0001\u001a\b\u0012\u0004\u0012\u000200058\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0084\u0001R\u001e\u0010\u008c\u0001\u001a\t\u0012\u0004\u0012\u0002090\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u0084\u0001R-\u0010\u008f\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u0001000\u008e\u0001\u0012\u0004\u0012\u0002090\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R$\u0010\u0095\u0001\u001a\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020f0\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0090\u0001R$\u0010\u0096\u0001\u001a\u000f\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002090\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0090\u0001R\"\u0010\u0097\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0084\u0001R!\u0010\u0098\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R!\u0010\u009a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001a\u0010\u009d\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010 \u0001R\u001f\u0010§\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R&\u0010ª\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020Q\u0018\u0001050©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001R*\u0010´\u0001\u001a\f\u0012\u0005\u0012\u00030³\u0001\u0018\u00010²\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b´\u0001\u0010µ\u0001\u0012\u0005\b¶\u0001\u0010\u001dR\u001c\u0010¸\u0001\u001a\u00070·\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010»\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\fR\u0016\u0010½\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\fR\u0016\u0010¿\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\fR\u0016\u0010Á\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\fR\u0016\u0010Ã\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\fR\u0016\u0010Å\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\fR\u0017\u0010Ç\u0001\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\bÆ\u0001\u0010±\u0001R\u001c\u0010Ë\u0001\u001a\n\u0012\u0005\u0012\u00030¦\u00010È\u00018F¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u001b\u0010Î\u0001\u001a\u00070rj\u0003`Ì\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010wR\u0016\u0010Ð\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\fR\u0016\u0010Ò\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\fR\u0016\u0010Ô\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\fR\u0019\u0010\u001e\u001a\u0005\u0018\u00010Õ\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÖ\u0001\u0010×\u0001¨\u0006Ý\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/CancellableContinuation;", "", "deriveStateLocked", "()Lkotlinx/coroutines/CancellableContinuation;", "", "recordComposerModifications", "()Z", "Lkotlinx/coroutines/Job;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/Job;)V", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Landroidx/compose/runtime/ControlledComposition;", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Throwable;Landroidx/compose/runtime/ControlledComposition;Z)V", "", "knownCompositions", "()Ljava/util/List;", "knownCompositionsLocked", "clearKnownCompositionsLocked", "()V", "composition", "removeKnownCompositionLocked", "(Landroidx/compose/runtime/ControlledComposition;)V", "addKnownCompositionLocked", "registerCompositionLocked", "unregisterCompositionLocked", "recordFailedCompositionLocked", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Landroidx/collection/MutableScatterSet;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "performInsertValues", "(Ljava/util/List;Landroidx/collection/MutableScatterSet;)Ljava/util/List;", "discardUnusedMovableContentState", "Lkotlin/Function1;", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/collection/MutableScatterSet;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "runRecomposeAndApplyChanges", "cancel", "close", "join", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "reportPausedScope$runtime", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "reportPausedScope", "", "Landroidx/compose/runtime/tooling/CompositionData;", B5.R, "recordInspectionTable$runtime", "(Ljava/util/Set;)V", "recordInspectionTable", "unregisterComposition$runtime", "unregisterComposition", "invalidate$runtime", "invalidate", "reference", "insertMovableContent$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "Landroidx/compose/runtime/Applier;", "applier", "movableContentStateReleased$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;Landroidx/compose/runtime/Applier;)V", "movableContentStateReleased", "reportRemovedComposition$runtime", "reportRemovedComposition", "movableContentStateResolve$runtime", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "", "value", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/platform/SynchronizedObject;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/Job;", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/MultiValueMap;", "Landroidx/compose/runtime/MovableContent;", "movableContentRemoved", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/NestedContentMap;", "movableContentNestedStatesAvailable", "Landroidx/compose/runtime/NestedContentMap;", "Landroidx/collection/MutableScatterMap;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "pausedScopes", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "Lkotlinx/coroutines/CompletableJob;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/MutableObjectList;", "Landroidx/compose/runtime/tooling/CompositionRegistrationObserver;", "registrationObservers", "Landroidx/collection/MutableObjectList;", "getRegistrationObservers$annotations", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "getRecomposeCoroutineContext$runtime", "recomposeCoroutineContext", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "Landroidx/compose/runtime/CompositeKeyHashCode;", "getCompositeKeyHashCode$runtime", "compositeKeyHashCode", "getCollectingCallByInformation$runtime", "collectingCallByInformation", "getCollectingParameterInformation$runtime", "collectingParameterInformation", "getCollectingSourceInformation$runtime", "collectingSourceInformation", "Landroidx/compose/runtime/Composition;", "getComposition$runtime", "()Landroidx/compose/runtime/Composition;", "Companion", "State", "RecomposerInfoImpl", "HotReloadable", "RecomposerErrorState", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Recomposer extends CompositionContext {
    private final List _knownCompositions;
    private List _knownCompositionsCache;
    private final MutableStateFlow _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector compositionInvalidations;
    private final List compositionsAwaitingApply;
    private Set compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List movableContentAwaitingInsert;
    private final MutableScatterMap movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap movableContentRemoved;
    private final MutableScatterMap movableContentStatesAvailable;
    private final SnapshotThreadLocal pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList registrationObservers;
    private Job runnerJob;
    private MutableScatterSet snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final MutableStateFlow _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
    private static final AtomicReference _hotReloadEnabled = new AtomicReference(Boolean.FALSE);

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class HotReloadable {
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingParameterInformation$runtime */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCompositeKeyHashCode$runtime */
    public long getCompositeKeyHashCode() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime(Set table) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014c, code lost:
    
        if (r4 >= r3) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0158, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).getSecond() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015a, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x015d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016b, code lost:
    
        if (r9 >= r4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016d, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        if (r11.getSecond() != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0183, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0185, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0188, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0182, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018b, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018d, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x018e, code lost:
    
        kotlin.collections.CollectionsKt.addAll(r16.movableContentAwaitingInsert, r3);
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0198, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
    
        if (r9 >= r4) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
    
        if (((kotlin.Pair) r11).getSecond() == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b5, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b8, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01bb, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List performInsertValues(List references, MutableScatterSet modifiedValues) {
        ArrayList<Pair> arrayList;
        NestedMovableContent removeLast;
        HashMap hashMap = new HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            Object obj = references.get(i);
            ControlledComposition composition = ((MovableContentStateReference) obj).getComposition();
            Object obj2 = hashMap.get(composition);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(composition, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ControlledComposition controlledComposition = (ControlledComposition) entry.getKey();
            List list = (List) entry.getValue();
            if (controlledComposition.isComposing()) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            MutableSnapshot takeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, modifiedValues));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) list.get(i2);
                                Object m1183removeLastimpl = MultiValueMap.m1183removeLastimpl(this.movableContentRemoved, movableContentStateReference.getContent());
                                MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) m1183removeLastimpl;
                                if (movableContentStateReference2 != null) {
                                    this.movableContentNestedStatesAvailable.usedContainer(movableContentStateReference2);
                                }
                                arrayList.add(TuplesKt.to(movableContentStateReference, m1183removeLastimpl));
                            }
                            if (ComposeRuntimeFlags.isMovingNestedMovableContentEnabled) {
                                int size3 = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        break;
                                    }
                                    Pair pair = (Pair) arrayList.get(i3);
                                    if (pair.getSecond() == null && this.movableContentNestedStatesAvailable.contains(((MovableContentStateReference) pair.getFirst()).getContent())) {
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                                        for (Pair pair2 : arrayList) {
                                            if (pair2.getSecond() == null && (removeLast = this.movableContentNestedStatesAvailable.removeLast(((MovableContentStateReference) pair2.getFirst()).getContent())) != null) {
                                                MovableContentStateReference content = removeLast.getContent();
                                                MultiValueMap.m1171addimpl(this.movableContentNestedExtractionsPending, removeLast.getContainer(), content);
                                                pair2 = TuplesKt.to(pair2.getFirst(), content);
                                            }
                                            arrayList2.add(pair2);
                                        }
                                        arrayList = arrayList2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                    int size4 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size4) {
                            break;
                        }
                        if (((Pair) arrayList.get(i4)).getSecond() != null) {
                            break;
                        }
                        i4++;
                    }
                    controlledComposition.insertMovableContent(arrayList);
                    Unit unit = Unit.INSTANCE;
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        }
        return CollectionsKt.toList(hashMap.keySet());
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                Unit broadcastFrameClock$lambda$2;
                broadcastFrameClock$lambda$2 = Recomposer.broadcastFrameClock$lambda$2(Recomposer.this);
                return broadcastFrameClock$lambda$2;
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
        this.compositionInvalidations = new MutableVector(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m1175constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m1175constructorimpl$default(null, 1, null);
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal();
        CompletableJob Job = JobKt.Job((Job) coroutineContext.get(Job.Key));
        Job.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit effectJob$lambda$10$lambda$9;
                effectJob$lambda$10$lambda$9 = Recomposer.effectJob$lambda$10$lambda$9(Recomposer.this, (Throwable) obj);
                return effectJob$lambda$10$lambda$9;
            }
        });
        this.effectJob = Job;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(Job);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit broadcastFrameClock$lambda$2(Recomposer recomposer) {
        CancellableContinuation deriveStateLocked;
        synchronized (recomposer.stateLock) {
            deriveStateLocked = recomposer.deriveStateLocked();
            if (((State) recomposer._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
            }
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performRecompose$lambda$68$lambda$67(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            controlledComposition.recordWriteOf(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9(final Recomposer recomposer, final Throwable th) {
        CancellableContinuation cancellableContinuation;
        CancellableContinuation cancellableContinuation2;
        CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
        synchronized (recomposer.stateLock) {
            try {
                Job job = recomposer.runnerJob;
                cancellableContinuation = null;
                if (job != null) {
                    recomposer._state.setValue(State.ShuttingDown);
                    if (!recomposer.isClosed) {
                        job.cancel(CancellationException);
                    } else {
                        cancellableContinuation2 = recomposer.workContinuation;
                        if (cancellableContinuation2 != null) {
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                                    effectJob$lambda$10$lambda$9$lambda$8$lambda$7 = Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer.this, th, (Throwable) obj);
                                    return effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        }
                    }
                    cancellableContinuation2 = null;
                    recomposer.workContinuation = null;
                    job.invokeOnCompletion(new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                            effectJob$lambda$10$lambda$9$lambda$8$lambda$7 = Recomposer.effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer.this, th, (Throwable) obj);
                            return effectJob$lambda$10$lambda$9$lambda$8$lambda$7;
                        }
                    });
                    cancellableContinuation = cancellableContinuation2;
                } else {
                    recomposer.closeCause = CancellationException;
                    recomposer._state.setValue(State.ShutDown);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit effectJob$lambda$10$lambda$9$lambda$8$lambda$7(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        kotlin.ExceptionsKt.addSuppressed(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            recomposer._state.setValue(State.ShutDown);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime() {
        return EmptyCoroutineContext.INSTANCE;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation deriveStateLocked() {
        State state;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else if (this.compositionInvalidations.getSize() != 0 || this.snapshotInvalidations.isNotEmpty() || !this.compositionsAwaitingApply.isEmpty() || !this.movableContentAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m1181isNotEmptyimpl(this.movableContentRemoved)) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (z) {
            Iterator it = this.effectJob.getChildren().iterator();
            while (it.hasNext()) {
                if (((Job) it.next()).isActive()) {
                }
            }
            return false;
        }
        return true;
    }

    public final StateFlow getCurrentState() {
        return this._state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "Z", "getRecoverable", "()Z", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Throwable th) {
            this.recoverable = z;
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        boolean hasFrameWorkLocked;
        CollectionsKt.emptyList();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            List knownCompositionsLocked = knownCompositionsLocked();
            Set wrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
            try {
                int size = knownCompositionsLocked.size();
                for (int i = 0; i < size; i++) {
                    ((ControlledComposition) knownCompositionsLocked.get(i)).recordModificationsOf(wrapIntoSet);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(wrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation continuation) {
        Object recompositionRunner = recompositionRunner(new Recomposer$runRecomposeAndApplyChanges$2(this, null), continuation);
        return recompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? recompositionRunner : Unit.INSTANCE;
    }

    static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            controlledComposition = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z);
    }

    private final void processCompositionError(Throwable e, ControlledComposition failedInitialComposition, boolean recoverable) {
        if (!((Boolean) _hotReloadEnabled.get()).booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e);
                Unit unit = Unit.INSTANCE;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet(0, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m1173clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List knownCompositions() {
        List knownCompositionsLocked;
        synchronized (this.stateLock) {
            knownCompositionsLocked = knownCompositionsLocked();
        }
        return knownCompositionsLocked;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List knownCompositionsLocked() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List list2 = this._knownCompositions;
        List emptyList = list2.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list2);
        this._knownCompositionsCache = emptyList;
        return emptyList;
    }

    private final void clearKnownCompositionsLocked() {
        Iterator it = knownCompositionsLocked().iterator();
        while (it.hasNext()) {
            unregisterCompositionLocked((ControlledComposition) it.next());
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            unregisterCompositionLocked(composition);
        }
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        registerCompositionLocked(composition);
    }

    private final void registerCompositionLocked(ControlledComposition composition) {
        MutableObjectList mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (composition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionRegistered((ObservableComposition) composition);
                }
            }
        }
    }

    private final void unregisterCompositionLocked(ControlledComposition composition) {
        MutableObjectList mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i = mutableObjectList._size;
            for (int i2 = 0; i2 < i; i2++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i2];
                if (composition instanceof ObservableComposition) {
                    compositionRegistrationObserver.onCompositionUnregistered((ObservableComposition) composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List list = this.failedCompositions;
        if (list == null) {
            list = new ArrayList();
            this.failedCompositions = list;
        }
        if (!list.contains(composition)) {
            list.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0093 -> B:11:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runFrameLoop(MonotonicFrameClock monotonicFrameClock, ProduceFrameSignal produceFrameSignal, Continuation continuation) {
        Recomposer$runFrameLoop$1 recomposer$runFrameLoop$1;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        final ArrayList arrayList3;
        final ArrayList arrayList4;
        MonotonicFrameClock monotonicFrameClock2;
        final ProduceFrameSignal produceFrameSignal2;
        Function1 function1;
        Object obj;
        ArrayList arrayList5;
        ArrayList arrayList6;
        if (continuation instanceof Recomposer$runFrameLoop$1) {
            recomposer$runFrameLoop$1 = (Recomposer$runFrameLoop$1) continuation;
            int i2 = recomposer$runFrameLoop$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recomposer$runFrameLoop$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recomposer$runFrameLoop$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = recomposer$runFrameLoop$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    ?? r7 = (List) recomposer$runFrameLoop$1.L$3;
                    ?? r8 = (List) recomposer$runFrameLoop$1.L$2;
                    produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$1;
                    monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    arrayList4 = r7;
                    arrayList3 = r8;
                    function1 = new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            CancellableContinuation runFrameLoop$lambda$51;
                            runFrameLoop$lambda$51 = Recomposer.runFrameLoop$lambda$51(Recomposer.this, arrayList3, arrayList4, produceFrameSignal2, ((Long) obj3).longValue());
                            return runFrameLoop$lambda$51;
                        }
                    };
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$2 = arrayList3;
                    recomposer$runFrameLoop$1.L$3 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (monotonicFrameClock2.withFrameNanos(function1, recomposer$runFrameLoop$1) == coroutine_suspended) {
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ?? r72 = (List) recomposer$runFrameLoop$1.L$3;
                    ?? r82 = (List) recomposer$runFrameLoop$1.L$2;
                    produceFrameSignal2 = (ProduceFrameSignal) recomposer$runFrameLoop$1.L$1;
                    monotonicFrameClock2 = (MonotonicFrameClock) recomposer$runFrameLoop$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    arrayList6 = r72;
                    arrayList5 = r82;
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    monotonicFrameClock2 = monotonicFrameClock;
                    arrayList4 = arrayList2;
                    produceFrameSignal2 = produceFrameSignal;
                    arrayList3 = arrayList;
                    function1 = new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            CancellableContinuation runFrameLoop$lambda$51;
                            runFrameLoop$lambda$51 = Recomposer.runFrameLoop$lambda$51(Recomposer.this, arrayList3, arrayList4, produceFrameSignal2, ((Long) obj3).longValue());
                            return runFrameLoop$lambda$51;
                        }
                    };
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock2;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal2;
                    recomposer$runFrameLoop$1.L$2 = arrayList3;
                    recomposer$runFrameLoop$1.L$3 = arrayList4;
                    recomposer$runFrameLoop$1.label = 2;
                    arrayList6 = arrayList4;
                    arrayList5 = arrayList3;
                    if (monotonicFrameClock2.withFrameNanos(function1, recomposer$runFrameLoop$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = arrayList5;
                    produceFrameSignal = produceFrameSignal2;
                    arrayList2 = arrayList6;
                    monotonicFrameClock = monotonicFrameClock2;
                    obj = this.stateLock;
                    recomposer$runFrameLoop$1.L$0 = monotonicFrameClock;
                    recomposer$runFrameLoop$1.L$1 = produceFrameSignal;
                    recomposer$runFrameLoop$1.L$2 = arrayList;
                    recomposer$runFrameLoop$1.L$3 = arrayList2;
                    recomposer$runFrameLoop$1.label = 1;
                    if (produceFrameSignal.awaitFrameRequest(obj, recomposer$runFrameLoop$1) != coroutine_suspended) {
                    }
                }
            }
        }
        recomposer$runFrameLoop$1 = new Recomposer$runFrameLoop$1(this, continuation);
        Object obj22 = recomposer$runFrameLoop$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = recomposer$runFrameLoop$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CancellableContinuation runFrameLoop$lambda$51(Recomposer recomposer, List list, List list2, ProduceFrameSignal produceFrameSignal, long j) {
        Object beginSection;
        int i;
        CancellableContinuation deriveStateLocked;
        if (recomposer.getHasBroadcastFrameClockAwaiters()) {
            Trace trace = Trace.INSTANCE;
            beginSection = trace.beginSection("Recomposer:animation");
            try {
                recomposer.broadcastFrameClock.sendFrame(j);
                Snapshot.INSTANCE.sendApplyNotifications();
                Unit unit = Unit.INSTANCE;
                trace.endSection(beginSection);
            } finally {
            }
        }
        beginSection = Trace.INSTANCE.beginSection("Recomposer:recompose");
        try {
            recomposer.recordComposerModifications();
            synchronized (recomposer.stateLock) {
                try {
                    List list3 = recomposer.compositionsAwaitingApply;
                    int size = list3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list2.add((ControlledComposition) list3.get(i2));
                    }
                    recomposer.compositionsAwaitingApply.clear();
                    MutableVector mutableVector = recomposer.compositionInvalidations;
                    Object[] objArr = mutableVector.content;
                    int size2 = mutableVector.getSize();
                    for (int i3 = 0; i3 < size2; i3++) {
                        list.add((ControlledComposition) objArr[i3]);
                    }
                    recomposer.compositionInvalidations.clear();
                    produceFrameSignal.takeFrameRequestLocked();
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            MutableScatterSet mutableScatterSet = new MutableScatterSet(0, 1, null);
            try {
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ControlledComposition performRecompose = recomposer.performRecompose((ControlledComposition) list.get(i4), mutableScatterSet);
                    if (performRecompose != null) {
                        list2.add(performRecompose);
                    }
                }
                list.clear();
                if (!list2.isEmpty()) {
                    recomposer.changeCount++;
                }
                try {
                    int size4 = list2.size();
                    for (i = 0; i < size4; i++) {
                        ((ControlledComposition) list2.get(i)).applyChanges();
                    }
                    list2.clear();
                    synchronized (recomposer.stateLock) {
                        deriveStateLocked = recomposer.deriveStateLocked();
                    }
                    return deriveStateLocked;
                } catch (Throwable th2) {
                    list2.clear();
                    throw th2;
                }
            } catch (Throwable th3) {
                list.clear();
                throw th3;
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasSchedulingWork() {
        boolean z;
        synchronized (this.stateLock) {
            if (!this.snapshotInvalidations.isNotEmpty() && this.compositionInvalidations.getSize() == 0) {
                z = getHasBroadcastFrameClockAwaitersLocked();
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final Object recompositionRunner(Function3 function3, Continuation continuation) {
        Object withContext = BuildersKt.withContext(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.cancel$default(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final Object join(Continuation continuation) {
        Object first = FlowKt.first(getCurrentState(), new Recomposer$join$2(null), continuation);
        return first == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? first : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime(ControlledComposition composition, Function2 content) {
        boolean z;
        boolean isComposing = composition.isComposing();
        synchronized (this.stateLock) {
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) > 0) {
                boolean contains = knownCompositionsLocked().contains(composition);
                z = !contains;
                if (!contains) {
                    addKnownCompositionLocked(composition);
                }
            } else {
                z = true;
            }
        }
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot takeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.INSTANCE;
                    if (!isComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    try {
                        performInitialMovableContentInserts(composition);
                        try {
                            composition.applyChanges();
                            composition.applyLateChanges();
                            if (isComposing) {
                                return;
                            }
                            companion.notifyObjectsInitialized();
                        } catch (Throwable th) {
                            processCompositionError$default(this, th, null, false, 6, null);
                        }
                    } catch (Throwable th2) {
                        processCompositionError(th2, composition, true);
                    }
                } finally {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                }
            } finally {
                applyAndCheck(takeMutableSnapshot);
            }
        } catch (Throwable th3) {
            processCompositionError(th3, composition, true);
            if (z) {
                synchronized (this.stateLock) {
                    removeKnownCompositionLocked(composition);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime(RecomposeScopeImpl scope) {
        MutableScatterSet mutableScatterSet = (MutableScatterSet) this.pausedScopes.get();
        if (mutableScatterSet == null) {
            mutableScatterSet = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSet);
        }
        mutableScatterSet.add(scope);
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(((MovableContentStateReference) list.get(i)).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                    if (Intrinsics.areEqual(movableContentStateReference.getComposition(), controlledComposition)) {
                        list.add(movableContentStateReference);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final MutableScatterSet modifiedValues) {
        Set set;
        if (composition.isComposing() || composition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot takeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot makeCurrent = takeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.isNotEmpty()) {
                        composition.prepareCompose(new Function0() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: invoke */
                            public final Object mo4828invoke() {
                                Unit performRecompose$lambda$68$lambda$67;
                                performRecompose$lambda$68$lambda$67 = Recomposer.performRecompose$lambda$68$lambda$67(MutableScatterSet.this, composition);
                                return performRecompose$lambda$68$lambda$67;
                            }
                        });
                    }
                } catch (Throwable th) {
                    takeMutableSnapshot.restoreCurrent(makeCurrent);
                    throw th;
                }
            }
            boolean recompose = composition.recompose();
            takeMutableSnapshot.restoreCurrent(makeCurrent);
            if (recompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(takeMutableSnapshot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i;
        ObjectList objectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m1181isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList m1186valuesimpl = MultiValueMap.m1186valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m1173clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m1173clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(m1186valuesimpl.get_size());
                    Object[] objArr = m1186valuesimpl.content;
                    int i2 = m1186valuesimpl._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i3];
                        mutableObjectList.add(TuplesKt.to(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectList = mutableObjectList;
                } else {
                    objectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectList.content;
        int i4 = objectList._size;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    private final Function1 readObserverOf(final ControlledComposition composition) {
        return new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit readObserverOf$lambda$85;
                readObserverOf$lambda$85 = Recomposer.readObserverOf$lambda$85(ControlledComposition.this, obj);
                return readObserverOf$lambda$85;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readObserverOf$lambda$85(ControlledComposition controlledComposition, Object obj) {
        controlledComposition.recordReadOf(obj);
        return Unit.INSTANCE;
    }

    private final Function1 writeObserverOf(final ControlledComposition composition, final MutableScatterSet modifiedValues) {
        return new Function1() { // from class: androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit writeObserverOf$lambda$86;
                writeObserverOf$lambda$86 = Recomposer.writeObserverOf$lambda$86(ControlledComposition.this, modifiedValues, obj);
                return writeObserverOf$lambda$86;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit writeObserverOf$lambda$86(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet, Object obj) {
        controlledComposition.recordWriteOf(obj);
        if (mutableScatterSet != null) {
            mutableScatterSet.add(obj);
        }
        return Unit.INSTANCE;
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked() || MultiValueMap.m1181isNotEmptyimpl(this.movableContentRemoved);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime() {
        return ((Boolean) _hotReloadEnabled.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    /* renamed from: getCollectingSourceInformation$runtime */
    public boolean getCollectingSourceInformation() {
        return ComposerKt.getComposeStackTraceEnabled();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime(ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime(ControlledComposition composition) {
        CancellableContinuation cancellableContinuation;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuation = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuation = deriveStateLocked();
            }
        }
        if (cancellableContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime(MovableContentStateReference reference) {
        CancellableContinuation deriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            deriveStateLocked = deriveStateLocked();
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime(MovableContentStateReference reference) {
        CancellableContinuation deriveStateLocked;
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m1171addimpl(this.movableContentRemoved, reference.getContent(), reference);
                if (reference.getNestedReferences() != null) {
                    deletedMovableContent$lambda$95$recordNestedStatesOf(this, reference, reference);
                }
                deriveStateLocked = deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (deriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            deriveStateLocked.resumeWith(Result.m8023constructorimpl(Unit.INSTANCE));
        }
    }

    private static final void deletedMovableContent$lambda$95$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List nestedReferences = movableContentStateReference2.getNestedReferences();
        if (nestedReferences != null) {
            int size = nestedReferences.size();
            for (int i = 0; i < size; i++) {
                MovableContentStateReference movableContentStateReference3 = (MovableContentStateReference) nestedReferences.get(i);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$95$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime(MovableContentStateReference reference, MovableContentState data, Applier applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.set(reference, data);
                ObjectList m1178getimpl = MultiValueMap.m1178getimpl(this.movableContentNestedExtractionsPending, reference);
                if (m1178getimpl.isNotEmpty()) {
                    ScatterMap extractNestedStates$runtime = data.extractNestedStates$runtime(applier, m1178getimpl);
                    Object[] objArr = extractNestedStates$runtime.keys;
                    Object[] objArr2 = extractNestedStates$runtime.values;
                    long[] jArr = extractNestedStates$runtime.metadata;
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
                                        this.movableContentStatesAvailable.set((MovableContentStateReference) obj, (MovableContentState) objArr2[i4]);
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
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime(ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set set = this.compositionsRemoved;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.compositionsRemoved = set;
                }
                set.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime(MovableContentStateReference reference) {
        MovableContentState movableContentState;
        synchronized (this.stateLock) {
            movableContentState = (MovableContentState) this.movableContentStatesAvailable.remove(reference);
        }
        return movableContentState;
    }

    /* compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "info", "", "addRunning", "(Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;)V", "removeRunning", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet add;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                add = persistentSet.add((Object) info);
                if (persistentSet == add) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, add));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet remove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                remove = persistentSet.remove((Object) info);
                if (persistentSet == remove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, remove));
        }
    }
}
