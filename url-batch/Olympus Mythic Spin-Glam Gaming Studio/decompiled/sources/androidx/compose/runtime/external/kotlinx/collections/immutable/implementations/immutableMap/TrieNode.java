package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: TrieNode.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b/\b\u0001\u0018\u0000 \u0085\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0086\u0001\u0085\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010.JA\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bO\u0010PJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010TJ9\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010VJA\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010RJ?\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010Y\u001a\u00020X2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J[\u0010\\\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\u0004H\u0002¢\u0006\u0004\b^\u0010_J#\u0010`\u001a\u00020\u00132\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b`\u0010aJW\u0010c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bc\u0010dJ_\u0010e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020\u0004H\u0000¢\u0006\u0004\bg\u0010_J\u0017\u0010j\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010\u0015J\u0017\u0010m\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bk\u0010lJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bn\u0010lJ#\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bo\u0010HJ%\u0010r\u001a\u00020\u00132\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\br\u0010sJ'\u0010t\u001a\u0004\u0018\u00018\u00012\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bt\u0010uJQ\u0010v\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020X2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bv\u0010wJ;\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bx\u0010yJM\u0010z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bz\u0010{J3\u0010|\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b|\u0010}JG\u0010~\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b~\u0010\u007fJO\u0010~\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010q\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b~\u0010{R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010\u0080\u0001R\u0017\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0006\u0010\u0080\u0001R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u0081\u0001R7\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\b\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asInsertResult", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "positionMask", "", "hasNodeAt", "(I)Z", "keyIndex", "keyAtIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", "key", "value", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "owner", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeIndex", "newNode", "updateNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeNodeAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newKeyHash", "newKey", "newValue", "shift", "bufferMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "makeNode", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "i", "collisionRemoveEntryAtIndex", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "mutableCollisionPutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAllFromOtherNodeCell", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "calculateSize", "()I", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "targetNode", "replaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableReplaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "entryCount$runtime", "entryCount", "hasEntryAt$runtime", "hasEntryAt", "entryKeyIndex$runtime", "(I)I", "entryKeyIndex", "nodeIndex$runtime", "nodeAtIndex$runtime", "nodeAtIndex", "keyHash", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "[Ljava/lang/Object;", "getBuffer$runtime", "()[Ljava/lang/Object;", "Companion", "ModificationResult", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TrieNode<K, V> {
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;
    private final MutabilityOwnership ownedBy;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    public TrieNode(int i, int i2, Object[] objArr, MutabilityOwnership mutabilityOwnership) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = mutabilityOwnership;
        this.buffer = objArr;
    }

    public TrieNode(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }

    /* compiled from: TrieNode.kt */
    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "sizeDelta", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "I", "getSizeDelta", "()I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ModificationResult<K, V> {
        private TrieNode node;
        private final int sizeDelta;

        public ModificationResult(TrieNode trieNode, int i) {
            this.node = trieNode;
            this.sizeDelta = i;
        }

        public final TrieNode getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        public final void setNode(TrieNode trieNode) {
            this.node = trieNode;
        }
    }

    private final ModificationResult asInsertResult() {
        return new ModificationResult(this, 1);
    }

    private final ModificationResult asUpdateResult() {
        return new ModificationResult(this, 0);
    }

    /* renamed from: getBuffer$runtime, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final int entryCount$runtime() {
        return Integer.bitCount(this.dataMap);
    }

    public final boolean hasEntryAt$runtime(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    private final boolean hasNodeAt(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    public final int entryKeyIndex$runtime(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    public final int nodeIndex$runtime(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    private final Object keyAtIndex(int keyIndex) {
        return this.buffer[keyIndex];
    }

    private final Object valueAtKeyIndex(int keyIndex) {
        return this.buffer[keyIndex + 1];
    }

    public final TrieNode nodeAtIndex$runtime(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    private final TrieNode insertEntryAt(int positionMask, Object key, Object value) {
        Object[] insertEntryAtIndex;
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime(positionMask), key, value);
        return new TrieNode(positionMask | this.dataMap, this.nodeMap, insertEntryAtIndex);
    }

    private final TrieNode mutableInsertEntryAt(int positionMask, Object key, Object value, MutabilityOwnership owner) {
        Object[] insertEntryAtIndex;
        Object[] insertEntryAtIndex2;
        int entryKeyIndex$runtime = entryKeyIndex$runtime(positionMask);
        if (this.ownedBy == owner) {
            insertEntryAtIndex2 = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime, key, value);
            this.buffer = insertEntryAtIndex2;
            this.dataMap = positionMask | this.dataMap;
            return this;
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime, key, value);
        return new TrieNode(positionMask | this.dataMap, this.nodeMap, insertEntryAtIndex, owner);
    }

    private final TrieNode updateValueAtIndex(int keyIndex, Object value) {
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[keyIndex + 1] = value;
        return new TrieNode(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode mutableUpdateValueAtIndex(int keyIndex, Object value, PersistentHashMapBuilder mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.setModCount$runtime(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[keyIndex + 1] = value;
        return new TrieNode(this.dataMap, this.nodeMap, copyOf, mutator.getOwnership());
    }

    private final TrieNode updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode newNode) {
        Object[] replaceNodeWithEntry;
        Object[] objArr = newNode.buffer;
        if (objArr.length == 2 && newNode.nodeMap == 0) {
            if (this.buffer.length == 1) {
                newNode.dataMap = this.nodeMap;
                return newNode;
            }
            replaceNodeWithEntry = TrieNodeKt.replaceNodeWithEntry(this.buffer, nodeIndex, entryKeyIndex$runtime(positionMask), objArr[0], objArr[1]);
            return new TrieNode(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, replaceNodeWithEntry);
        }
        Object[] objArr2 = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[nodeIndex] = newNode;
        return new TrieNode(this.dataMap, this.nodeMap, copyOf);
    }

    private final TrieNode mutableUpdateNodeAtIndex(int nodeIndex, TrieNode newNode, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[nodeIndex] = newNode;
        return new TrieNode(this.dataMap, this.nodeMap, copyOf, owner);
    }

    private final TrieNode removeNodeAtIndex(int nodeIndex, int positionMask) {
        Object[] removeNodeAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        return new TrieNode(this.dataMap, positionMask ^ this.nodeMap, removeNodeAtIndex);
    }

    private final TrieNode mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        Object[] removeNodeAtIndex;
        Object[] removeNodeAtIndex2;
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy == owner) {
            removeNodeAtIndex2 = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
            this.buffer = removeNodeAtIndex2;
            this.nodeMap ^= positionMask;
            return this;
        }
        removeNodeAtIndex = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        return new TrieNode(this.dataMap, positionMask ^ this.nodeMap, removeNodeAtIndex, owner);
    }

    private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) {
        Object[] replaceEntryWithNode;
        Object keyAtIndex = keyAtIndex(keyIndex);
        replaceEntryWithNode = TrieNodeKt.replaceEntryWithNode(this.buffer, keyIndex, nodeIndex$runtime(positionMask) + 1, makeNode(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
        return replaceEntryWithNode;
    }

    private final TrieNode moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift) {
        return new TrieNode(this.dataMap ^ positionMask, positionMask | this.nodeMap, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final TrieNode mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, Object newKey, Object newValue, int shift, MutabilityOwnership owner) {
        if (this.ownedBy == owner) {
            this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
            this.dataMap ^= positionMask;
            this.nodeMap |= positionMask;
            return this;
        }
        return new TrieNode(this.dataMap ^ positionMask, positionMask | this.nodeMap, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
    }

    private final TrieNode makeNode(int keyHash1, Object key1, Object value1, int keyHash2, Object key2, Object value2, int shift, MutabilityOwnership owner) {
        Object[] objArr;
        if (shift > 30) {
            return new TrieNode(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int indexSegment = TrieNodeKt.indexSegment(keyHash1, shift);
        int indexSegment2 = TrieNodeKt.indexSegment(keyHash2, shift);
        if (indexSegment != indexSegment2) {
            if (indexSegment < indexSegment2) {
                objArr = new Object[]{key1, value1, key2, value2};
            } else {
                objArr = new Object[]{key2, value2, key1, value1};
            }
            return new TrieNode((1 << indexSegment) | (1 << indexSegment2), 0, objArr, owner);
        }
        return new TrieNode(0, 1 << indexSegment, new Object[]{makeNode(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final TrieNode removeEntryAtIndex(int keyIndex, int positionMask) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, keyIndex);
        return new TrieNode(positionMask ^ this.dataMap, this.nodeMap, removeEntryAtIndex);
    }

    private final TrieNode mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder mutator) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime(valueAtKeyIndex(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == mutator.getOwnership()) {
            removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex);
            this.buffer = removeEntryAtIndex2;
            this.dataMap ^= positionMask;
            return this;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex);
        return new TrieNode(positionMask ^ this.dataMap, this.nodeMap, removeEntryAtIndex, mutator.getOwnership());
    }

    private final TrieNode collisionRemoveEntryAtIndex(int i) {
        Object[] removeEntryAtIndex;
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(objArr, i);
        return new TrieNode(0, 0, removeEntryAtIndex);
    }

    private final TrieNode mutableCollisionRemoveEntryAtIndex(int i, PersistentHashMapBuilder mutator) {
        Object[] removeEntryAtIndex;
        Object[] removeEntryAtIndex2;
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime(valueAtKeyIndex(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy == mutator.getOwnership()) {
            removeEntryAtIndex2 = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
            this.buffer = removeEntryAtIndex2;
            return this;
        }
        removeEntryAtIndex = TrieNodeKt.removeEntryAtIndex(this.buffer, i);
        return new TrieNode(0, 0, removeEntryAtIndex, mutator.getOwnership());
    }

    private final boolean collisionContainsKey(Object key) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, this.buffer[first])) {
                if (first != last) {
                    first += step2;
                }
            }
            return true;
        }
        return false;
    }

    private final Object collisionGet(Object key) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 <= 0 || first > last) && (step2 >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
            if (first == last) {
                return null;
            }
            first += step2;
        }
        return valueAtKeyIndex(first);
    }

    private final ModificationResult collisionPut(Object key, Object value) {
        Object[] insertEntryAtIndex;
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            if (value == valueAtKeyIndex(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            copyOf[first + 1] = value;
            return new TrieNode(0, 0, copyOf).asUpdateResult();
        }
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value);
        return new TrieNode(0, 0, insertEntryAtIndex).asInsertResult();
    }

    private final TrieNode mutableCollisionPut(Object key, Object value, PersistentHashMapBuilder mutator) {
        Object[] insertEntryAtIndex;
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            mutator.setOperationResult$runtime(valueAtKeyIndex(first));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[first + 1] = value;
                return this;
            }
            mutator.setModCount$runtime(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            copyOf[first + 1] = value;
            return new TrieNode(0, 0, copyOf, mutator.getOwnership());
        }
        mutator.setSize(mutator.size() + 1);
        insertEntryAtIndex = TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value);
        return new TrieNode(0, 0, insertEntryAtIndex, mutator.getOwnership());
    }

    private final TrieNode collisionRemove(Object key) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return collisionRemoveEntryAtIndex(first);
        }
        return this;
    }

    private final TrieNode mutableCollisionRemove(Object key, PersistentHashMapBuilder mutator) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(first))) {
                if (first != last) {
                    first += step2;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(first, mutator);
        }
        return this;
    }

    private final TrieNode mutableCollisionRemove(Object key, Object value, PersistentHashMapBuilder mutator) {
        IntProgression step = RangesKt.step(RangesKt.until(0, this.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!Intrinsics.areEqual(key, keyAtIndex(first)) || !Intrinsics.areEqual(value, valueAtKeyIndex(first))) {
                    if (first == last) {
                        break;
                    }
                    first += step2;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(first, mutator);
                }
            }
        }
        return this;
    }

    private final TrieNode mutableCollisionPutAll(TrieNode otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        CommonFunctionsKt.m1202assert(this.nodeMap == 0);
        CommonFunctionsKt.m1202assert(this.dataMap == 0);
        CommonFunctionsKt.m1202assert(otherNode.nodeMap == 0);
        CommonFunctionsKt.m1202assert(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        int length = this.buffer.length;
        IntProgression step = RangesKt.step(RangesKt.until(0, otherNode.buffer.length), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if ((step2 > 0 && first <= last) || (step2 < 0 && last <= first)) {
            while (true) {
                if (!collisionContainsKey(otherNode.buffer[first])) {
                    Object[] objArr2 = otherNode.buffer;
                    copyOf[length] = objArr2[first];
                    copyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                } else {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == copyOf.length) {
            return new TrieNode(0, 0, copyOf, owner);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
        return new TrieNode(0, 0, copyOf2, owner);
    }

    private final TrieNode mutablePutAllFromOtherNodeCell(TrieNode otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder mutator) {
        if (hasNodeAt(positionMask)) {
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(positionMask));
            if (otherNode.hasNodeAt(positionMask)) {
                return nodeAtIndex$runtime.mutablePutAll(otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.hasEntryAt$runtime(positionMask)) {
                return nodeAtIndex$runtime;
            }
            int entryKeyIndex$runtime = otherNode.entryKeyIndex$runtime(positionMask);
            Object keyAtIndex = otherNode.keyAtIndex(entryKeyIndex$runtime);
            Object valueAtKeyIndex = otherNode.valueAtKeyIndex(entryKeyIndex$runtime);
            int size = mutator.size();
            TrieNode mutablePut = nodeAtIndex$runtime.mutablePut(keyAtIndex != null ? keyAtIndex.hashCode() : 0, keyAtIndex, valueAtKeyIndex, shift + 5, mutator);
            if (mutator.size() != size) {
                return mutablePut;
            }
            intersectionCounter.setCount(intersectionCounter.getCount() + 1);
            return mutablePut;
        }
        if (otherNode.hasNodeAt(positionMask)) {
            TrieNode nodeAtIndex$runtime2 = otherNode.nodeAtIndex$runtime(otherNode.nodeIndex$runtime(positionMask));
            if (hasEntryAt$runtime(positionMask)) {
                int entryKeyIndex$runtime2 = entryKeyIndex$runtime(positionMask);
                Object keyAtIndex2 = keyAtIndex(entryKeyIndex$runtime2);
                int i = shift + 5;
                if (!nodeAtIndex$runtime2.containsKey(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, i)) {
                    return nodeAtIndex$runtime2.mutablePut(keyAtIndex2 != null ? keyAtIndex2.hashCode() : 0, keyAtIndex2, valueAtKeyIndex(entryKeyIndex$runtime2), i, mutator);
                }
                intersectionCounter.setCount(intersectionCounter.getCount() + 1);
            }
            return nodeAtIndex$runtime2;
        }
        int entryKeyIndex$runtime3 = entryKeyIndex$runtime(positionMask);
        Object keyAtIndex3 = keyAtIndex(entryKeyIndex$runtime3);
        Object valueAtKeyIndex2 = valueAtKeyIndex(entryKeyIndex$runtime3);
        int entryKeyIndex$runtime4 = otherNode.entryKeyIndex$runtime(positionMask);
        Object keyAtIndex4 = otherNode.keyAtIndex(entryKeyIndex$runtime4);
        return makeNode(keyAtIndex3 != null ? keyAtIndex3.hashCode() : 0, keyAtIndex3, valueAtKeyIndex2, keyAtIndex4 != null ? keyAtIndex4.hashCode() : 0, keyAtIndex4, otherNode.valueAtKeyIndex(entryKeyIndex$runtime4), shift + 5, mutator.getOwnership());
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int bitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += nodeAtIndex$runtime(i).calculateSize();
        }
        return bitCount;
    }

    private final boolean elementsIdentityEquals(TrieNode otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsKey(int keyHash, Object key, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime(indexSegment)));
        }
        if (!hasNodeAt(indexSegment)) {
            return false;
        }
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        if (shift == 30) {
            return nodeAtIndex$runtime.collisionContainsKey(key);
        }
        return nodeAtIndex$runtime.containsKey(keyHash, key, shift + 5);
    }

    public final Object get(int keyHash, Object key, int shift) {
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                return valueAtKeyIndex(entryKeyIndex$runtime);
            }
            return null;
        }
        if (!hasNodeAt(indexSegment)) {
            return null;
        }
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime(indexSegment));
        if (shift == 30) {
            return nodeAtIndex$runtime.collisionGet(key);
        }
        return nodeAtIndex$runtime.get(keyHash, key, shift + 5);
    }

    public final TrieNode mutablePutAll(TrieNode otherNode, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder mutator) {
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        }
        if (shift > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i = this.nodeMap | otherNode.nodeMap;
        int i2 = this.dataMap;
        int i3 = otherNode.dataMap;
        int i4 = (i2 ^ i3) & (~i);
        int i5 = i2 & i3;
        int i6 = i4;
        while (i5 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i5);
            if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime(lowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime(lowestOneBit)))) {
                i6 |= lowestOneBit;
            } else {
                i |= lowestOneBit;
            }
            i5 ^= lowestOneBit;
        }
        int i7 = 0;
        if (!((i & i6) == 0)) {
            PreconditionsKt.throwIllegalStateException("Check failed.");
        }
        TrieNode trieNode = (Intrinsics.areEqual(this.ownedBy, mutator.getOwnership()) && this.dataMap == i6 && this.nodeMap == i) ? this : new TrieNode(i6, i, new Object[(Integer.bitCount(i6) * 2) + Integer.bitCount(i)]);
        int i8 = i;
        int i9 = 0;
        while (i8 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i8);
            Object[] objArr = trieNode.buffer;
            objArr[(objArr.length - 1) - i9] = mutablePutAllFromOtherNodeCell(otherNode, lowestOneBit2, shift, intersectionCounter, mutator);
            i9++;
            i8 ^= lowestOneBit2;
        }
        while (i6 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i6);
            int i10 = i7 * 2;
            if (!otherNode.hasEntryAt$runtime(lowestOneBit3)) {
                int entryKeyIndex$runtime = entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = keyAtIndex(entryKeyIndex$runtime);
                trieNode.buffer[i10 + 1] = valueAtKeyIndex(entryKeyIndex$runtime);
            } else {
                int entryKeyIndex$runtime2 = otherNode.entryKeyIndex$runtime(lowestOneBit3);
                trieNode.buffer[i10] = otherNode.keyAtIndex(entryKeyIndex$runtime2);
                trieNode.buffer[i10 + 1] = otherNode.valueAtKeyIndex(entryKeyIndex$runtime2);
                if (hasEntryAt$runtime(lowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
            }
            i7++;
            i6 ^= lowestOneBit3;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    public final ModificationResult put(int keyHash, Object key, Object value, int shift) {
        ModificationResult put;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                if (valueAtKeyIndex(entryKeyIndex$runtime) == value) {
                    return null;
                }
                return updateValueAtIndex(entryKeyIndex$runtime, value).asUpdateResult();
            }
            return moveEntryToNode(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift).asInsertResult();
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift == 30) {
                put = nodeAtIndex$runtime.collisionPut(key, value);
                if (put == null) {
                    return null;
                }
            } else {
                put = nodeAtIndex$runtime.put(keyHash, key, value, shift + 5);
                if (put == null) {
                    return null;
                }
            }
            put.setNode(updateNodeAtIndex(nodeIndex$runtime, indexSegment, put.getNode()));
            return put;
        }
        return insertEntryAt(indexSegment, key, value).asInsertResult();
    }

    public final TrieNode mutablePut(int keyHash, Object key, Object value, int shift, PersistentHashMapBuilder mutator) {
        TrieNode mutablePut;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime))) {
                mutator.setOperationResult$runtime(valueAtKeyIndex(entryKeyIndex$runtime));
                return valueAtKeyIndex(entryKeyIndex$runtime) == value ? this : mutableUpdateValueAtIndex(entryKeyIndex$runtime, value, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(entryKeyIndex$runtime, indexSegment, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (hasNodeAt(indexSegment)) {
            int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
            TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
            if (shift == 30) {
                mutablePut = nodeAtIndex$runtime.mutableCollisionPut(key, value, mutator);
            } else {
                mutablePut = nodeAtIndex$runtime.mutablePut(keyHash, key, value, shift + 5, mutator);
            }
            return nodeAtIndex$runtime == mutablePut ? this : mutableUpdateNodeAtIndex(nodeIndex$runtime, mutablePut, mutator.getOwnership());
        }
        mutator.setSize(mutator.size() + 1);
        return mutableInsertEntryAt(indexSegment, key, value, mutator.getOwnership());
    }

    public final TrieNode remove(int keyHash, Object key, int shift) {
        TrieNode remove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) ? removeEntryAtIndex(entryKeyIndex$runtime, indexSegment) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            remove = nodeAtIndex$runtime.collisionRemove(key);
        } else {
            remove = nodeAtIndex$runtime.remove(keyHash, key, shift + 5);
        }
        return replaceNode(nodeAtIndex$runtime, remove, nodeIndex$runtime, indexSegment);
    }

    private final TrieNode replaceNode(TrieNode targetNode, TrieNode newNode, int nodeIndex, int positionMask) {
        if (newNode == null) {
            return removeNodeAtIndex(nodeIndex, positionMask);
        }
        return targetNode != newNode ? updateNodeAtIndex(nodeIndex, positionMask, newNode) : this;
    }

    public final TrieNode mutableRemove(int keyHash, Object key, int shift, PersistentHashMapBuilder mutator) {
        TrieNode mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, mutator) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(key, mutator);
        } else {
            mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, shift + 5, mutator);
        }
        return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, mutator.getOwnership());
    }

    private final TrieNode mutableReplaceNode(TrieNode targetNode, TrieNode newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        if (newNode == null) {
            return mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner);
        }
        return (this.ownedBy == owner || targetNode != newNode) ? mutableUpdateNodeAtIndex(nodeIndex, newNode, owner) : this;
    }

    public final TrieNode mutableRemove(int keyHash, Object key, Object value, int shift, PersistentHashMapBuilder mutator) {
        TrieNode mutableRemove;
        int indexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime(indexSegment)) {
            int entryKeyIndex$runtime = entryKeyIndex$runtime(indexSegment);
            return (Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime)) && Intrinsics.areEqual(value, valueAtKeyIndex(entryKeyIndex$runtime))) ? mutableRemoveEntryAtIndex(entryKeyIndex$runtime, indexSegment, mutator) : this;
        }
        if (!hasNodeAt(indexSegment)) {
            return this;
        }
        int nodeIndex$runtime = nodeIndex$runtime(indexSegment);
        TrieNode nodeAtIndex$runtime = nodeAtIndex$runtime(nodeIndex$runtime);
        if (shift == 30) {
            mutableRemove = nodeAtIndex$runtime.mutableCollisionRemove(key, value, mutator);
        } else {
            mutableRemove = nodeAtIndex$runtime.mutableRemove(keyHash, key, value, shift + 5, mutator);
        }
        return mutableReplaceNode(nodeAtIndex$runtime, mutableRemove, nodeIndex$runtime, indexSegment, mutator.getOwnership());
    }

    /* compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "<init>", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final TrieNode getEMPTY$runtime() {
            return TrieNode.EMPTY;
        }
    }
}
